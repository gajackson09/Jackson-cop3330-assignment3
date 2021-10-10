/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

import java.util.*;
import java.io.*;

public class ex42{
    public void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String s = input.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }

    public static void main(String[] args) {

        ex42 emp = new ex42();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("excercise42_input.txt");
    }//end of main
}//end of class