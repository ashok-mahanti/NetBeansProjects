/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahanthi_project2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 */
public class Mahanthi_Project2 {

    final static int numofLabs = 10;
    final static int pointvalueforLabs = 10;
    final static double labWeight = 0.25;
    final static int numofProjects = 4;
    final static int pointvalueforProjects = 50;
    final static double projectWeight = 0.30;
    final static int numofExams = 2;
    final static int pointvalueforExams = 100;
    final static double examWeight = 0.45;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int numofStudents = 0;
        
        File myFile = new File("scores.txt");
        if (!myFile.exists())
        {
            System.out.println("Unable to find " + myFile + "; ending program");
            System.exit(0);
        }
        Scanner inputFile = new Scanner(myFile);
        
        numofStudents = inputFile.nextInt();
        inputFile.nextLine();
        
        System.out.println(numofStudents);          // can be removed, just printing purpose.
        
        String[] studentNamesArray;
        studentNamesArray = new String[numofStudents];
        
        char[] courseGardeArray;
        courseGardeArray = new char[numofStudents];
        
        double[][] labGradesArray;
        labGradesArray = new double[numofStudents][numofLabs];
        
        double[][] projectGradesArray;
        projectGradesArray = new double[numofStudents][numofProjects];
        
        double[][] examGradesArray;
        examGradesArray = new double[numofStudents][numofExams];
        
        double[][] averagesArray;
        averagesArray = new double[numofStudents][4];
        
        for (int i = 0; i < numofStudents; i++){
                studentNamesArray[i] = inputFile.nextLine();
                getScores(inputFile, i, labGradesArray, numofLabs);
                getScores(inputFile, i, projectGradesArray, numofProjects);
                getScores(inputFile, i, examGradesArray, numofExams);
                inputFile.nextLine(); //discard newline after reading last score
        }
        
        
        //printing Student Arrays
        System.out.print("StudentNames Array: ");
        System.out.print("[");
        for (int i = 0; i < studentNamesArray.length; i++){
            System.out.print(studentNamesArray[i] + " ");
            }     
        System.out.println("]");
        
        //printing lab scores array
        System.out.println("LabGrades Array:");
        for (int i = 0; i < labGradesArray.length; i++){
            for (int j = 0; j < labGradesArray[i].length; j++){
                System.out.print(labGradesArray[i][j]);
            }
        
        }
        
        
        
    } //end Main
    
    
    //parameter Scanner input is a previously-opened input file Scanner
    //parameter currentRow indicates the index of the current student, and is the
    //row in which the scores should be stored in the scoresArray
    //parameter numScores indicates number of scores to read from the input Scanner
    //scoresArray is the array in which to store the scores read from the file
    /**
     * @param input
     * @param currentRow
     * @param scoresArray
     * @param numScores
    */
    public static void getScores(Scanner input, int currentRow, double[][] scoresArray,int numScores){
        while(input.hasNext()){
            for (currentRow = 0; currentRow < scoresArray.length; currentRow++){
                  for (numScores = 0; numScores < scoresArray[currentRow].length; numScores++){
                        scoresArray[currentRow][numScores] = input.nextDouble();
                  }
            }  
        }
    }
} //end class
