package day14.assignment;

//2. program to get details of a file

import java.io.File;

public class FileInfo {
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
