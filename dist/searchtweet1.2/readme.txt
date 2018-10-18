searchtweet 1.2

MAX/MSP Java External (mxj) Object
by Gokce Kinayoglu (cc) 2011-2015
uses Twitter4j library by Yusuke Yomomoto

Description:
----------------
searchtweet.class is a max/msp mxj extension that searches Twitter posts with a given keyword and returns a desired number of search results.

Version updates:
—---------------
Version 1.2 allows authentication with custom Twitter API keys which can be obtained from https://apps.twitter.com/ 
Using your own API authentication key is highly recommended since this will reduce the likelihood of hitting Twitter search quotas. 

Requirements:
----------------
Windows or Mac
Java 8 or higher
MAX/MSP 5.0 or higher

Installation for Max 7:
-----------------------
Copy the included twitter4j libraries and searchtweet.class in your Library path
(/Users/Shared/Max 7/Library on MacOS)
(C:\ProgramData\Max 7\Packages on Windows)

Installation for older versions of Max:
-----------------------
If you have installed an older version of search tweet before, remove any previous versions of twitter4j libraries from your [maxmsp]/Cycling '74/java/lib folder.

Copy everything in the lib folder under your [maxmsp]/Cycling '74/java/lib folder, and copy the searchtweet.class under [maxmsp]/Cycling '74/java/classes folder.


Usage:
----------------
An example file (searchweet.maxpat) is provided.

License:
----------------
1. searchweet.class is protected under a Creative Commons Attribution-NonCommercial ShareAlike Unported 3.0 License. Terms and conditions of the license can be viewed here:
http://creativecommons.org/licenses/by-nc-sa/3.0/
This file (readme.txt) should be included with any kind of distribution. Commercial usage prohibited. 

2. The external searchweet.class uses Twiter4j library, developed by Yusuke Yamamoto. The Twitter4J project, its source code and documentation can be found at:

http://twitter4j.org

License information for Twitter4J:
-----------------------------------
Twitter4j, Copyright 2007 Yusuke Yamamoto

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software Distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
