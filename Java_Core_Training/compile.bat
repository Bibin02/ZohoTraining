@echo off
REM Set the path to your JDK bin directory
REM set JDK_PATH="C:\Program Files\Java\jdk-11.0.1\bin"

REM Set the directory where your Java source files are located
REM set SOURCE_DIR="C:\Users\BIBIN\Documents\programming code files\Java codes\Java Training Zoho"

REM Navigate to the source directory
REM cd %SOURCE_DIR%

REM Iterate through each .java file and compile it
for %%f in (*.java) do (
    echo Compiling %%f...
    javac -d bin %%f
)

echo Compilation complete.
pause
