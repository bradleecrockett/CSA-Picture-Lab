
# Fixing the Picture Lab
1) Delete the `/oldFiles` directory
2) On the left and side of VS Code, find the Java Projects pane.
   1) Select the `...` and choose **Clean Workspace**.
   2) Click the confirmation button **Reload & Delete**.
3) Wait patiently while the Project reloads and the Java exntension packs work their magic.
4) Now run `PictureExplorer.java` and start working through the labs A4.

1. What is the row index for the top left corner of the picture?
2. What is the column index for the top left corner of the picture?
3. The width of this picture is 640. What is the right most column index?
4. The height of this picture is 480. What is the bottom most row index?  
5. Does the row index increase from left to right or top to bottom?
6. Does the column index increase from left to right or top to bottom?
7. Set the zoom to 500%. Can you see squares of color? This is called pixelation. Pixelation means displaying a picture so 



### Then if it did not work... Try This
Open a terminal then run the following command 
(if your terminal is git Bash use Linux commands)
(if your terminal is PowerShell or Command Prompt [cmd] use Linux commands)

```
# remove stale classes (Windows)
rmdir /s /q bin

# OR on macOS / Linux
rm -rf bin
```

For some unknown reason, VS Code is not compiling all project files at once. We need to force that manually from the terminal.

```
# compile all .java into bin
javac -d bin *.java

# run the explorer
java -cp bin PictureExplorer
```

Now, unfortunately any time we want to make changes, we will need to re-compile with the command `javac *.java` which compiles all files that end in `.java` at once. The `*` asterisk is called a wild card which means all.

Then run the file we want to run with `java FileName`.

You can use the up arrow in the terminal to recall old commands so you do not need to type them in over and over again.



