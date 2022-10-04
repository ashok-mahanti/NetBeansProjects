package extracredit_09262022;


import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 */
public class ExtraCredit_09262022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        int number_of_Students = 0;
        int number_of_test_Scores = 0;
        double sum = 0;
        double total_sum = 0;
        double total_avg = 0;
        int count1,count2;
       
        System.out.print("Enter the number of students for which scores will be averaged: ");
        number_of_Students = keyboard.nextInt();
        
        while ((number_of_Students == 0 || number_of_Students <= 1))
        {
            System.out.print("Number of students must be greater than 1; please re-enter: ");
            number_of_Students = keyboard.nextInt();
        }
        
        System.out.print("Enter the number of test scores to be averaged: ");
        number_of_test_Scores = keyboard.nextInt();
        
        while ((number_of_test_Scores == 0 || number_of_test_Scores <= 1))
        {
            System.out.print("Number of students must be greater than 1; please re-enter: ");
            number_of_test_Scores = keyboard.nextInt();
        }
        
        
        System.out.println("");
        
        
        String[] student_Name = new String[number_of_Students];
        double[][] test_Scores = new double[number_of_Students][number_of_test_Scores];
        double[] average = new double[number_of_test_Scores];
        
        for (int i = 0; i < student_Name.length; i++){
            System.out.print("Enter the student's name: ");
            student_Name[i] = keyboard.next();
            keyboard.nextLine();
            System.out.print("Enter test scores for " + student_Name[i] + ": ");
                    for (int j = 0; j < number_of_test_Scores; j++){
                        //System.out.print("Enter " + number_of_test_Scores + " test scores for " + student_Name[i] + ": ");
                        test_Scores[i][j] = keyboard.nextDouble();
                    }     
        }
        System.out.println("");
        for ( int i = 0; i < student_Name.length; i++){
            
            System.out.print("Name: " + student_Name[i]);
            System.out.println("");
            System.out.print("Test Scores: ");
                    for (int j = 0; j < test_Scores[i].length; j++){
                        System.out.print(test_Scores[i][j] + " ");
                        sum = sum + test_Scores[i][j];
                    }
                    System.out.println("");
            average[i] = sum /number_of_test_Scores;
            sum = 0;
            System.out.printf("Average: %.1f\n",average[i]);
            System.out.println("");
            total_sum = total_sum + average[i];
            }
        total_avg = total_sum/number_of_Students; 
        System.out.printf("The average test score for all students is %.1f",total_avg);
        System.out.println("");
       
        count1 = 0;
        for (int i = 0; i < number_of_Students; i++){
            if ( average[i] > total_avg ){
                count1 = count1 + 1;
            }
        }
        count2 = 0;
        for (int i = 0; i < number_of_Students; i++){
            if ( average[i] < total_avg ){
                count2 = count2 + 1;
            } 
        }
        if (count1 > 1)
            System.out.print(count1 + " students had an average above the class average.");
        else if ( count1 == 1) 
            System.out.print(count1 + " student had an average above the class average.");
        System.out.println("");
        if (count2 > 1)
        System.out.print(count2 + " students had an average below the class average.");
        else if ( count2 == 1) 
            System.out.print(count1 + " student had an average below the class average.");
        System.out.println("");
        
     }            
    
  }
  
    
    

