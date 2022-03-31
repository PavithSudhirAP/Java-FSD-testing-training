package sba2;

//Write a program Implement the filereader until the file ending character is “-1” and print all the data of the file.

import java.io.FileReader;
import java.io.IOException;


public class Sba2_04 {
	public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:NewFilefromJava.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
