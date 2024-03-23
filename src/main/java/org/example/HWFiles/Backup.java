package org.example.HWFiles;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Backup {
    String backupPath = "C:/Users/jylve/Desktop/javaHW2024/src/main/";


    public void backup(String p) {
        if (Files.isDirectory(Path.of(p))) {


            }
        File path = null;
        path = new File(p);
        File[] dir = path.listFiles();
        for (int i = 0; i < dir.length; i++) {
            if (dir[i].isDirectory()) continue;
            System.out.println(dir[i]);



        }
    }



}
