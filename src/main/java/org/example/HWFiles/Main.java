package org.example.HWFiles;

public class Main {
    static String path =  "C:/Users/jylve/Desktop/javaHW2024/src/main/resources";
    static String filename1 = "/Test.txt";
    static String filename2 = "/Test2.txt";
    static String filename3 = "/Test3.txt";
    public static void main(String[] args) {
        //"C:/Users/jylve/Desktop/javaHW2024/src/main/resources"

        GenerateTextFiles GenerateTextFiles = new GenerateTextFiles();
        Backup backup = new Backup();
        // GenerateTextFiles.textGeneration();
       // GenerateTextFiles.fileCreate(filename1,path );
       // GenerateTextFiles.fileCreate(filename2,path );
       // GenerateTextFiles.fileCreate(filename3,path );
        backup.backup(path);




        }
}
