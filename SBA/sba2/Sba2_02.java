package sba2;

//Write a program to create, write and read from a file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sba2_02 {
	public static void main(String[] args) {
        try {
            // creating a new file
            File f1 = new File("D:NewFilefromJava.txt");
            System.out.println((f1.createNewFile()) ? "A new file named " + f1.getName() + " has been created!!\n"
                    : "File Already exists!!\n");

            // writing contents to the file
            FileWriter fw1 = new FileWriter(f1);
            fw1.write("This is the content of the file written through the java code!!!");
            fw1.close();
            System.out.println("Content has been Written successfully!!\n");

            // reading the file contents
            File f2 = new File("D:NewFilefromJava.txt");
            Scanner sc = new Scanner(f2);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine() + "\n");
            }
            sc.close();

        } catch (FileNotFoundException e2) {
            System.out.println("An unexpected error occured!!\n" + e2);
        } catch (IOException e1) {
            System.out.println("An unexpected error occured!!\n" + e1);
        }
    }
}
