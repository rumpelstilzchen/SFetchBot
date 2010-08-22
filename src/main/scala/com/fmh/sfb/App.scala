/*
 * Copyright 2010 Roman Naumann
 *
 * This file is part of SFetchBot.
 *
 * SFetchBot is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SFetchBot is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SFetchBot.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.fmh.sfb

import org.jibble.pircbot._
import java.io.File


/**
 * Hello world!
 *
 */
object App extends PircBot{
  val DL_DIR = "/home/fmh/dlc/"
  var range: List[Int] = List()
  var xdcc_server: String = ""

  def main(args: Array[String]) {
    if(args exists (x=>x=="-h"||x=="--help")) {
      println("usage: java -jar SFetchBot-<version>.jar <nick> <irc_server> <channel> <xdcc_server> <from> <to>"+
              "\nNOTE: since channel contains a # sign, you have to put it in \" (like \"#arigatou\"")
      System exit 0
    }

    val nick = args(0)
    val server = args(1)
    val channel = args(2)
    xdcc_server = args(3)
    val from = args(4).toInt
    val to = args(5).toInt
    range = Range(from+1,to).toList // first file is loaded now, rest later

    this setName nick
    this connect server
    this joinChannel channel
    this load(from)
  }

  def load(id: Int) {
    println (".....requesting file #"+id)
    this sendMessage (xdcc_server, "xdcc send #"+id)
  }

  override def onPrivateMessage(sender: String
                               ,login: String
                               ,hostname: String
                               ,message: String) {
    println(".....got msg: ["+sender+"]:"+message)
  }

  override def onIncomingFileTransfer(transfer: DccFileTransfer) {
    print("....receiving incoming file...")
    val file_path = DL_DIR+transfer.getFile.getName
    transfer.receive(new File(file_path), false)
  }

  override def onFileTransferFinished(transfer: DccFileTransfer, e: Exception) {
    if (e!=null) {
      throw e
    }
    else {
      println("finished :-)")
      if(range.size > 0) {
        val next = range.head
        range = range.tail
        load(next)
      }
      else {
        println(".....all files transfered successfully")
        System exit 0
      }
    }
  }
}
