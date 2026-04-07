# Picture Lab

Instructions for the Picture Lab can be found in `Picture Lab Student Guide.pdf`. 

## Digital Image Background part A1 - A2
Read through part A1 and A2 for some background about how images are stored and displayed on computers. We are less interested in the binary portions but I expect you to understand the infromation.

## A3 Exploring a picture
Run `PictureExplorer.java` and answer the following questions.

1. What is the row index for the top left corner of the picture?
2. What is the column index for the top left corner of the picture?
3. The width of this picture is 640. What is the right most column index?
4. The height of this picture is 480. What is the bottom most row index?  
5. Does the row index increase from left to right or top to bottom?
6. Does the column index increase from left to right or top to bottom?
7. Set the zoom to 500%. Can you see squares of color? This is called pixelation. Pixelation means displaying a picture so magnified that the individual pixels look like small squares.  

**Creating and exploring other pictures**
Here is the main method in the class `PictureExplorer`. 
Every class in Java can have a main method, and it is where execution starts when you execute the command java ClassName.  

```java
public static void main( String args[]) {     
  Picture pix = new Picture("beach.jpg");     
  pix.explore();   
} 
```
The body of the main method declares a reference to a Picture object named pix and sets that variable to refer to a Picture object created from the data stored in a JPEG file named“beach.jpg”in the images folder. A JPEG file is one that follows an international standard for storing picture data using lossycompression. Lossy compressionmeans that the amount of data that is stored is much smaller than the available data, but the part that is not stored is    data we won't miss.  Exercises1.Modify the main method in the PictureExplorer class to create and explore a different picture from the images folder.  2.Add a picture to the images folder and then create and explore that picture in the main method. If the picture is very large (for instance, one from a digital camera), you can scale it using the scale method in the Picture class. For example, you can make a new picture(“smallMyPicture.jpg”in the images folder) one-fourth the size of the original(“myPicture.jpg”)using:Picture p = new Picture("myPicture.jpg");  Picture smallP = p.scale(0.25,0.25);  smallP.write("smallMyPicture.jpg");  
