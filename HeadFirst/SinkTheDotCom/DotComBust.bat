@echo off
	//this makes it so you have an empty cmd window on startup
echo Ready to play?!?
pause
echo Just kidding...
echo I'm not giving you a choice
javac -sourcepath C:\Users\Admin\Documents\GitHub\JavaPractice\HeadFirst\SinkTheDotCom\src -d C:\Users\Admin\Documents\GitHub\JavaPractice\HeadFirst\SinkTheDotCom\bin *.java
java -classpath C:\Users\Admin\Documents\GitHub\JavaPractice\HeadFirst\SinkTheDotCom\bin DotComBust
pause
	//this prevents the window from instantly closing after program end
