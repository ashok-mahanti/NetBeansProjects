/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        String student_Name;
        double test_Scores;
        double sum = 0;
        double average = 0;
        double cumAverage = 0;
        
        System.out.print("Enter the number of students whose average need to be claculated: ");
        int noofStudents = keyboard.nextInt();
        System.out.print("Enter the number of tests to be averaged: ");
        int noofTests = keyboard.nextInt();
        
        keyboard.nextLine();
        
        for(int i = 0; i < noofStudents; i++){
            System.out.print("Enter the student Name: ");
            student_Name = keyboard.nextLine();
                for (int j = 0; j < noofTests; j++){
                    System.out.print("Enter the test score " + (j+1) + " : ");
                    test_Scores = keyboard.nextDouble();
                    sum = sum + test_Scores;
                    keyboard.nextLine();
                    
                }
                average = sum/noofTests;
                sum = 0;
                System.out.print("Averagre of the test scores is: " + average);
                System.out.println("");
                cumAverage = cumAverage + average;
        }
                
            double totalAverage = cumAverage/noofStudents;
            System.out.print("Total average of the test scores is : " + totalAverage);
            System.out.println("");
    }
    
}
