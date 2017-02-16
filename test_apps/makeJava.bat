REM makeJava.bat - Batch File for compiling/running a java program

@echo off
cls

REM Revised 06/30/2007
REM By: Binayak Bhattacharyya


REM The following line can be customized for your system:
REM **********************************BEGIN customize
REM SET PATH="C:\Program Files\Java\jdk1.6.0_02\bin";%PATH%
REM **********************************END customize

REM Invoke JAVAC (the compiler):
javac %1.java
if errorlevel 1 goto terminate

REM Display all files related to this program:
DIR %1.*

REM Run the Application:
java %1

:terminate
pause