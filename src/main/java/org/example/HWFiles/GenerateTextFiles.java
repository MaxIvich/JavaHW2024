package org.example.HWFiles;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class GenerateTextFiles {


    public   String textGeneration(){
        StringBuilder string = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 50 ; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            string.append(c);
        }

        return string.toString();

    }
    public void fileCreate(String fileName,String path){
        if(Files.isDirectory(Path.of(path))){
            System.out.println("Указанный путь верен");
        }else {
            System.out.println("Указанный Путь не верен");
            return;
        }

        File dir = new File(path);
        File file1 = new File(dir, fileName);
          if(file1.exists()){
                  System.out.println(" Тфкой файл уже существует ");
                 // fileDelete(file1.toPath());
                  return;
          }


          try {
            file1.createNewFile();
            if(file1.isFile()){
            System.out.println("создан файл: "+ file1.getName());
            }else {
            System.out.println("Файл не создан");
           }

            writText(file1.getAbsolutePath());


          } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private void writText(String path){
        try {
            Files.write(Path.of(path),textGeneration().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Произведена запись в файл " + path);

    }
    public void fileDelete(Path path){

        if(Files.exists(path)){
            try {
                Files.delete(path);
                System.out.println(" Удален файл: "+ path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Файл не существует. Указан неверный путь ");
        }


    }
}
