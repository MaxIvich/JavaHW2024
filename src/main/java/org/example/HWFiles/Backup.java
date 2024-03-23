package org.example.HWFiles;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Backup {
    String backupPath = "C:/Users/jylve/Desktop/javaHW2024/src/main/";
    String backupDirName = "/backup/";


    public void backup(String p) {
        File backupDir  = new File(backupPath,backupDirName);
        if (backupDir.exists()){
            String[]entries = backupDir.list();
            for(String s: entries){
                File currentFile = new File(backupDir.getPath(),s);
                currentFile.delete();
            }



        }else  {
            backupDir.mkdirs();}

        if (Files.isDirectory(Path.of(p))) {
            File path = new File(p);
            File[] dir = path.listFiles();
            for (int i = 0; i < dir.length; i++) {
                if (dir[i].isDirectory()) {continue;
                }
                 Path path1 = Path.of(backupDir.getAbsolutePath() +"\\"+ "backup"+dir[i].getName());

                try {
                    Files.copy(dir[i].toPath(), path1);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }



        }
    }



}
