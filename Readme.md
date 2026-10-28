# AP Computer Science A: Picture Lab Student Guide Summary

*Adapted from the `Picture Lab Student Guide.pdf` from College Board.*

## Lab Grading

Activity | Possible | Earned
---             |---|---
A1 & A2         | 5 |
A3              | 5 |
A4              | 5 |
A5              | 5 |
A6              | 5 |
A7, A8, or A9   | 5 |
Total           | 30 |

## Overview & Setup

In this lab, you will write Java methods to manipulate digital pictures while learning about 2D array traversal, nested loops, binary numbers, interfaces, and inheritance.

**Activty Questions** numbered like: **[A1Q1]** (Activity 1 Question 1) need to be answered on the `README.md` file. By going to the next line, tabbing in once and adding an`*` your answer to the questions will get formatted and become more readable. For example:

```
* **[A1Q1]** How many bits does it take to represent the values from 0 to 255?
    * It takes 8 bits to represent values frmo 0 - 255.
```

**Activity Exercises** numbered like: **[A3E2]** (Activty 3 Exercise 2) need to be completed in the code base.

### Setup Instructions

1. Obtain the `pixLab` folder and ensure a Java Development Kit (JDK) is installed.
2. Keep the `images` folder and `classes` folder together at the same level within `pixLab`.
3. Keep `leftArrow.gif` and `rightArrow.gif` in the `classes` folder.
4. If you need to change the image directory path, modify `getMediaDirectory()` in `FileChooser.java` and recompile.

---

## Activity 1 (A1): Introduction to Digital Pictures and Color

### Concept Summary

* **Pixel**: Short for "picture element." Millions of pixels arranged in rows and columns form digital images.
* **Megapixel**: 1,000,000 pixels.
* **RGB Color Model**: Uses values from 0 to 255 for Red, Green, and Blue light to create colors. An optional Alpha value controls transparency.
* **Binary System**: Computers use bits (0 or 1) and bytes (groups of 8 bits) to represent numbers in powers of 2.

### Questions

* **[A1Q1]** How many bits does it take to represent the values from 0 to 255?
  * 8
* **[A1Q2]** How many bytes does it take to represent a color in the RGB color model?
* **[A1Q3]** How many pixels are in a picture that is 640 pixels wide and 480 pixels high?

---

## Activity 2 (A2): Picking a Color

### Concept Summary

* Java represents colors using the `java.awt.Color` class.
* The `toString()` method on a `Color` object outputs the class name and RGB values (e.g., `java.awt.Color[r=139,g=174,b=255]`).

### Questions

Run the `main` method in `ColorChooser.java` to open the GUI color chooser tool. Use the RGB tab and sliders to answer:

* **[A2Q1]** How can you make pink?
* **[A2Q2]** How can you make yellow?
* **[A2Q3]** How can you make purple?
* **[A2Q4]** How can you make white?
* **[A2Q5]** How can you make dark gray?

---

## Activity 3 (A3): Exploring a Picture

### Concept Summary

* `PictureExplorer` opens a copy of an image, allowing you to inspect pixel coordinates (row, column) and RGB values.
* **Pixelation**: Occurs when a picture is zoomed in so much that individual pixels appear as distinct squares of color.
* JPEGs use lossy compression to reduce file size.

### Questions

Run `PictureExplorer.java` (loads `beach.jpg`) and answer:

* **[A3Q1]** What is the row index for the top-left corner of the picture?
* **[A3Q2]** What is the column index for the top-left corner of the picture?
* **[A3Q3]** The width of this picture is 640. What is the rightmost column index?
* **[A3Q4]** The height of this picture is 480. What is the bottommost row index?
* **[A3Q5]** Does the row index increase from left to right or top to bottom?
* **[A3Q6]** Does the column index increase from left to right or top to bottom?
* **[A3Q7]** Set zoom to 500%. Can you see squares of color (pixelation)?

### Exercises

* **[A3E1]** Modify the `main` method in the `PictureExplorer` class to create and explore a different picture from the `images` folder.
* **[A3E2]** Add a picture to the `images` folder and then create and explore that picture in the `main` method. If the picture is very large, scale it using the `scale` method in the `Picture` class.

---

## Activity 4 (A4): Two-Dimensional Arrays in Java

### Concept Summary

* **Row-Major Order**: Java represents 2D arrays as arrays of arrays. The outer array represents rows, and inner arrays represent columns.
* **Syntax**:
  * Declaration: `int[][] matrix;`
  * Creation: `matrix = new int[5][8];`
  * Access: `matrix[row][col]`
  * Dimensions: `matrix.length` (rows), `matrix[0].length` (columns)
* Nested loops or nested for-each loops are used to traverse 2D arrays.

### Exercises

* **[A4E1]** Write a `getCount` method in the `IntArrayWorker` class that returns the count of the number of times a passed integer value is found in the matrix. Test by uncommenting `testGetCount()` in `IntArrayWorkerTester`.
* **[A4E2]** Write a `getLargest` method in the `IntArrayWorker` class that returns the largest value in the matrix. Test by uncommenting `testGetLargest()` in `IntArrayWorkerTester`.
* **[A4E3]** Write a `getColTotal` method in the `IntArrayWorker` class that returns the total of all integers in a specified column. Test by uncommenting `testGetColTotal()` in `IntArrayWorkerTester`.

---

## Activity 5 (A5): Modifying a Picture

### Concept Summary

* `Picture` extends `SimplePicture`, which implements the `DigitalPicture` interface.
* **Interfaces**: Define *what* methods a class must implement without defining *how*.
* **Pixel Modification**: You can alter internal properties of objects in an array during a for-each loop traversal.

### Questions

* **[A5Q1]** Open `Picture.java` and look for the method `getPixels2D`. Is it there?
* **[A5Q2]** Open `SimplePicture.java` and look for the method `getPixels2D`. Is it there?
* **[A5Q3]** Does the following code compile? `DigitalPicture p = new DigitalPicture();`
* **[A5Q4]** Assuming that a no-argument constructor exists for `SimplePicture`, would the following code compile? `DigitalPicture p = new SimplePicture();`
* **[A5Q5]** Assuming that a no-argument constructor exists for `Picture`, does the following code compile? `DigitalPicture p = new Picture();`
* **[A5Q6]** Assuming that a no-argument constructor exists for `Picture`, does the following code compile? `SimplePicture p = new Picture();`
* **[A5Q7]** Assuming that a no-argument constructor exists for `SimplePicture`, does the following code compile? `Picture p = new SimplePicture();`

### Exercises

* **[A5E1]** Open `PictureTester.java` and run its `main` method. Verify you get the same results as running the `main` method in `Picture.java`.
* **[A5E2]** Uncomment the appropriate test method in `main` of `PictureTester` to test other methods in `Picture.java`.
* **[A5E3]** Using the `zeroBlue` method as a starting point, write the method `keepOnlyBlue` that sets red and green values to zero. Create and run a test method in `PictureTester`.
* **[A5E4]** Write the `negate` method to negate all pixels (set each RGB value to 255 minus its current value). Create and run a test method in `PictureTester`.
* **[A5E5]** Write the `grayscale` method to turn the picture into shades of gray (set RGB values to their average). Create and run a test method in `PictureTester`.
* **[A5E6]** *(Challenge)* Explore `water.jpg`. Write `fixUnderwater()` to modify pixel colors to make the fish easier to see. Create and run a test method in `PictureTester`.

---

## Activity 6 (A6): Mirroring Pictures

### Concept Summary

* Mirroring involves copying pixel colors from one side of an axis to another.
* Vertical axis algorithm: `rightPixel.setColor(leftPixel.getColor())`, where `rightPixel` is at column index `width - 1 - col`.

### Exercises

* **[A6E1]** Write the method `mirrorVerticalRightToLeft` that mirrors a picture around a vertical mirror placed in the center, copying from right to left. Create and run a test method `testMirrorVerticalRightToLeft` in `PictureTester`.
* **[A6E2]** Write the method `mirrorHorizontal` that mirrors a picture top-to-bottom around a horizontal mirror in the center. Create and run a test method in `PictureTester`.
* **[A6E3]** Write the method `mirrorHorizontalBotToTop` that mirrors top-to-bottom (bottom copied to top). Create and run a test method in `PictureTester`.
* **[A6E4]** *(Challenge)* Work in groups to write `mirrorDiagonal` (mirrors a square area from bottom-left to top-right along the diagonal where `row == col`). Create and run a test method in `PictureTester`.

---

## Activity 7 (A7): Mirroring Part of a Picture

### Concept Summary

* You can mirror specific features (e.g., the roof of a temple, arms of a snowman) by restricting the row and column boundaries in your nested loops.
* Total loop executions = $(\text{Outer Loop Iterations}) \times (\text{Inner Loop Iterations})$.
* Executions per loop = $(\text{End Index} - \text{Start Index} + 1)$.

### Questions

* **[A7Q1]** How many times would the body of this nested `for` loop execute?

  ```java
  for (int row = 7; row < 17; row++)
      for (int col = 6; col < 15; col++)
  ```

* **[A7Q2]** How many times would the body of this nested `for` loop execute?

  ```java
  for (int row = 5; row <= 11; row++)
      for (int col = 3; col <= 18; col++)
  ```

### Exercises

* **[A7E1]** Check your nested loop calculation by adding a counter variable inside `mirrorTemple`, incrementing it, and printing `count` after the loops end.
* **[A7E2]** Write `mirrorArms` to mirror the snowman's arms (`snowman.jpg`) to create a 4-armed snowman. Create and run a test method in `PictureTester`.
* **[A7E3]** Write `mirrorGull` to mirror the seagull (`seagull.jpg`) to the right so there are two seagulls on the beach. Create and run a test method in `PictureTester`.

---

## Activity 8 (A8): Creating a Collage

### Concept Summary

* Copying pixel data from one image into specific target coordinates of another image allows you to generate collages.
* The `Picture.write(String fileName)` method saves the canvas to disk as a `.jpg` file.

### Exercises

* **[A8E1]** Create a second `copy` method that adds parameters (`startRow`, `endRow`, `startCol`, `endCol`) to copy only a specified sub-region of `fromPic`. Create and run a test method in `PictureTester`.
* **[A8E2]** Create a `myCollage` method that copies at least three pictures (or the same picture 3 times) with 3 distinct manipulations and at least 1 mirror operation. Create and run a test method in `PictureTester`.

---

## Activity 9 (A9): Simple Edge Detection

### Concept Summary

* **Edge Detection**: Compares color distance between adjacent pixels using 3D spatial distance formula:
  $$\text{distance} = \sqrt{(r_2-r_1)^2 + (g_2-g_1)^2 + (b_2-b_1)^2}$$
* If the distance exceeds a threshold (`edgeDist`), the pixel is set to black (edge); otherwise white.

### Exercises

* **[A9E1]** Modify `edgeDetection` by adding a second loop that compares the current pixel with the pixel *below* it (top-to-bottom comparison) in addition to the left-to-right comparison.
* **[A9E2]** Work in groups to propose and implement an alternative algorithm for edge detection.
