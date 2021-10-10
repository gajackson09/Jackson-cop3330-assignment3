/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabrielle Jackson
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex46{
    public static void main(String[] args) throws IOException{
    //declaring varibales
    File f1=new File("exercise46_input.txt"); 
    String[] words=null;
    FileReader fr = new FileReader(f1);
    BufferedReader br = new BufferedReader(fr);
    String s;   
    String input="Java"; 
    int count=0;

    while((s=br.readLine())!=null){
        words=s.split(" ");
        for (String word : words){
            if (word.equals(input)){
                count++; 
            }

        }//end of for

    }//end of while

    if(count != 0) {
        System.out.println("The given word is present for "+count+ " Times in the file");
    }

    else{
        System.out.println("The given word is not present in the file");
    }
    }//end of main
}//end of class