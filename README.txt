Copyright (c) 2010 Roman Naumann

	  This file is part of SFetchBot.
	  SFetchBot is free software: you can redistribute it and/or modify
	  it under the terms of the GNU General Public License as published by
	  the Free Software Foundation, either version 3 of the License, or
	  (at your option) any later version.

	  SFetchBot is distributed in the hope that it will be useful,
	  but WITHOUT ANY WARRANTY; without even the implied warranty of
	  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	  GNU General Public License for more details.

	  You should have received a copy of the GNU General Public License
	  along with SFetchBot.  If not, see <http://www.gnu.org/licenses/ >.

SFetchBot uses the Scala Distribution, which is released under it's own license:

    Copyright (c) 2002-2010 EPFL, Lausanne, unless otherwise specified.
    All rights reserved.

    This software was developed by the Programming Methods Laboratory of the
    Swiss Federal Institute of Technology (EPFL), Lausanne, Switzerland.

    Permission to use, copy, modify, and distribute this software in source
    or binary form for any purpose with or without fee is hereby granted,
    provided that the following conditions are met:

     1. Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.

     2. Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.

     3. Neither the name of the EPFL nor the names of its contributors
        may be used to endorse or promote products derived from this
        software without specific prior written permission.


    THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
    ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
    IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
    ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
    FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
    DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
    SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
    CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
    LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
    OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
    SUCH DAMAGE.

SFetchBot uses the PircBot library, which is released under the GPL as well.
For more information about the pircbot library, see: http://www.jibble.org/pircbot.php

#############################################################
		About and Usage Information
#############################################################

SFetchBot connects to an IRC server and fetches a range of files from
an xdcc bot.

For usage information, pass the bot the "-h" or "--help" parameter.

#############################################################
			Building
#############################################################

Building is straightforward with maven. Install maven and run..
mvn clean compile package
...from the projects main directory.

Maven will ask you to supply the artifact for PircBot manually. Download the
pircbot.jar from the pircbot site linked to above and follow the instructions
maven prints.

Please don't use this software to download illegal files.
