package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWriteFile {

    public static void main(String[] args) throws Exception {

        User u = new User();
        Scanner scan = new Scanner(System.in);

        File f = new File("user.txt");

        System.out.println("Hello, Please tell me about your experience at the Iron Yard?");
        System.out.println("Please simply enter [Yes] or [No]!");
        System.out.println();

        if(f.exists()) {
            Scanner file = new Scanner(f);
            file.useDelimiter("\\Z");
            String contents = file.next();
            System.out.println(contents);
            System.out.println("Do you want to save the file?");
            String response = scan.nextLine();
            if(!response.equals("y")) {
                System.exit(0);
            }
        }

        //Prompt the user to answer at least five different questions about a good or service.
        // Save the information into a file.
        // When the program first boots, read the file and display the contents.
        //Give the user the ability to update the information and re-save it to the file.

        FileWriter fw = new FileWriter(f);


        System.out.println("Do you use enjoy using computers?");
        u.smart = (scan.nextLine());
        fw.write(u.smart + "\n");

        System.out.println("Do you think the school is long?");
        u.funny = (scan.nextLine());
        fw.write(u.funny + "\n");

        System.out.println("Do you think you will get a job after?");
        u.boring = (scan.nextLine());
        fw.write(u.boring + "\n");

        System.out.println("How many instructors are there currently");
        u.age = (scan.nextLine());
        fw.write(u.age + "\n");

        System.out.println("Do you think the school is hard?");
        u.hard = (scan.nextLine());
        fw.write(u.hard + "\n");
        fw.close();

    }


}




