package Sba2;

// Write a program to get the information about the file

import java.io.File;

public class Sba2_03 {
	public static void main(String[] args) {
        File f = new File("D:NewFilefromJava.txt");
        if (f.exists()) {
            System.out.println("File name : " + f.getName());
            System.out.println("File writable : " + f.canWrite());
            System.out.println("File readable : " + f.canRead());
            System.out.println("File path : " + f.getAbsolutePath());
            System.out.println("FIle size : " + f.length() + " bytes");
        }
    }
}
