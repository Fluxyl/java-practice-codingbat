# Java Practice w/ CodingBat!
## CodingBat Branch (Now with Docker!)
A branch specifically made to hold all of the code I've written in Java to solve the problems over on CodingBat.

Code is mostly written by me, but since this is a practice site, there's a high possibility of someone else with similar code existing on GitHub.

Take a browse through to see some examples of the problem sets on CodingBat.

## NEW STUFF! 
Did some Docker practice using the map.java files in src.main.mapone to test out Docker's capibilities. It doesn't seem like much, but it was definitely difficult to figure out! 

The docker file uses OpenJDK 11 as a base, then copies all of the map java files to this temp Docker image, compiles both .java files into .class files using references from MapMain.java, then displays the output in the terminal after running the Docker Container. 