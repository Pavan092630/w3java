package org.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
/*Create a File
To create a file in Java, you can use the createNewFile() method. This method returns a boolean value:
true if the file was successfully created, and false if the file already exists. Note that the method is enclosed in a try...catch block.
This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):
To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" character (for Windows).
On Mac and Linux you can just write the path, like: /Users/name/filename.txt*/
public class JavaFileReadWriteDeleteJ {
    public static void main(String[] args) {
        try{
            File objt = new File("pavan.txt");
            if(objt.createNewFile()){
                System.out.println("New file is Created with Name " +objt.getName());

            }else {
                System.out.println("File Already exists");
                /*In the following example, we use the FileWriter class together with its write() method to write some text to the file we created in the example above.
                Note that when you are done writing to the file, you should close it with the close() method:
                Every file write may overide all the information in the file*/

//                FileWriter writer = new FileWriter("pavan.txt");
//                writer.write("Java is getting a hang on me");
//                writer.close();
//                System.out.println("Sucessfully written to the file "+objt.getName());

                Scanner myScanner = new Scanner(objt);
                while (myScanner.hasNextLine()){
                    String data = myScanner.nextLine();
                    System.out.println(data);
                }
                if(objt.exists()){
                    System.out.println(objt.getAbsolutePath());
                    System.out.println(objt.getName());
                    System.out.println(objt.getPath());
                    System.out.println(objt.length());
                    System.out.println(objt.canWrite());
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
//To delete a file in Java, use the delete() method:
/*There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader,
Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
Which one to use depends on the Java version you're working with and whether you need to read bytes or characters,
and the size of the file/lines etc.*/
