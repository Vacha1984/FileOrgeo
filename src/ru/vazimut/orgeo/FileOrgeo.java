package ru.vazimut.orgeo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class FileOrgeo {
   protected static void read () {
       try {
           //Files.lines(Paths.get("C:\\Orgeo\\import.csv"), StandardCharsets.UTF_8).skip(1).forEach(System.out::println);
           Files.lines(Paths.get("C:\\Orgeo\\import.csv"), StandardCharsets.UTF_8).skip(1).forEach(FileOrgeo::readLine);
       }
       catch(IOException ex){
           System.out.println(ex.getMessage());
       }
   }

   protected static void readLine (String line) {
       Scanner scan = new Scanner(line);
       scan.useDelimiter(";");
       while(scan.hasNext()){
           System.out.println(scan.next());
       }
       scan.close();
   }


}
