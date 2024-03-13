@echo off
@setlocal enableextensions
@cd /d "%~dp0"

echo Running Application
java -jar hobbycluborganizer-app/target/hobbycluborganizer-app-1.0-SNAPSHOT.jar

echo Operation Completed!
pause