package ru.vazimut.orgeo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Boolean.*;

class FileOrgeo {
   protected static ArrayList<Person> allPerson = new ArrayList<Person>();
   protected static void read () {
       try {
           //Files.lines(Paths.get("C:\\Orgeo\\import.csv"), StandardCharsets.UTF_8).skip(1).forEach(System.out::println);

           Files.lines(Paths.get("C:\\Orgeo\\import.csv"), StandardCharsets.UTF_8).skip(1).forEach(FileOrgeo::lineToPerson);
           System.out.println("Всего участников: " + allPerson.size());

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

   protected static Person lineToPerson (String line) {

       String group = "Group";
       String surname = "Surname";
       String name = "Name";
       String team = "Team";
       String city = "Team";
       int sportIdent = 0;
       String startDays = "0";
       String coach = "Coach";
       int idRequest = 0;
       boolean statusPay = FALSE;
       float summ = 0;

       Scanner scan = new Scanner(line);
       scan.useDelimiter(";");
       group = scan.next();
       scan.next();
       surname = scan.next();
       name = scan.next();
       team = scan.next();
       scan.next();
       city = scan.next();
       scan.close();
       Person person = new Person(group,
               surname,
               name,
               team,
               city,
               sportIdent,
       startDays,
       coach,
       idRequest,
       statusPay,
       summ);
       System.out.println(person.getGroup() + " " + person.getSurname() + " " + person.getName() + " " + person.getTeam());
       //System.out.println(person.getSurname());
       //System.out.println(person.getName());
       //System.out.println(person.getTeam());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       //System.out.println(person.getGroup());
       allPerson.add(person);
    return person;
   }

}
