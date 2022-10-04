/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        int no_of_Students;
        int no_of_Tests;
        String student_Name;
        double test_Scores;
        double sum;
        double average;
        double cumulative_tests_Average = 0;
        double total_Average = 0;
        
        System.out.print("Enter the number of students whose average need to be claculated: ");
        no_of_Students = keyboard.nextInt();
        keyboard.nextLine();
        
        while (no_of_Students == 0 || no_of_Students <= 1){
            System.out.print("Enter the valid number of Students, Please re-enter: ");
            no_of_Students = keyboard.nextInt();
            keyboard.nextLine();
        }
        
        System.out.print("Enter the number of tests to be averaged: ");
        no_of_Tests = keyboard.nextInt();
        keyboard.nextLine();
        
        while (no_of_Tests == 0 || no_of_Tests <= 1){
            System.out.print("Enter the valid number of tests, please re-enter: ");
            no_of_Tests = keyboard.nextInt();
            keyboard.nextLine();
        }
        
        for (int i = 0; i < no_of_Students; i++){
            System.out.print("Enter the student Name: ");
            student_Name = keyboard.nextLine();
            sum = 0;
                for (int j =0; j < no_of_Tests; j++){
                    System.out.print("Enter the test score " + (j+1) + (": "));
                    test_Scores = keyboard.nextDouble();
                    sum = sum + test_Scores;
                    keyboard.nextLine();
                }
                average = sum/no_of_Tests;
                total_Average = total_Average + average;
                System.out.print("Average of the test scores is: " + average);
                average = 0;
                System.out.println("");
              }
              cumulative_tests_Average = total_Average/no_of_Students;
              System.out.print("Total average of test scores is: " + cumulative_tests_Average);
              
            
    }
    
}
