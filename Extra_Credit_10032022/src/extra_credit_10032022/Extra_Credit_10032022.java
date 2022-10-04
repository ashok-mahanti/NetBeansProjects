/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_credit_10032022;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 */
public class Extra_Credit_10032022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        double[] dataInaRectangle;
        double average, perimeter;
        int rectangleIndex;
        ArrayList <double[]> rectangleList=new ArrayList();
        char choice;
        Scanner keyboard = new Scanner(System.in);
        
        File myFile=new File("extraCredit6.txt");
        if(!myFile.exists()){
            System.out.println("File not Found");
            System.exit(0);
        }
        
        Scanner inputFile= new Scanner(myFile);
        
        while(inputFile.hasNext()){
            
                dataInaRectangle = new double[2];
                dataInaRectangle[0] = inputFile.nextDouble();
                dataInaRectangle[1] = inputFile.nextDouble();
                
                rectangleList.add(dataInaRectangle);
                printRectangleDimensions(dataInaRectangle , rectangleList.size()-1);     
        }
        
        do{
            System.out.print("\nEnter the position of the rectangle for finding area and circumference: ");
            rectangleIndex=keyboard.nextInt();
            
                while(rectangleIndex <0 || rectangleIndex >= rectangleList.size()){
                        System.out.print("Please re-enter the position of the rectangle between 0 and " + (rectangleList.size()-1));
                        rectangleIndex = keyboard.nextInt();   
                    }
            
            average = calculateArea(rectangleList.get(rectangleIndex) ,  rectangleIndex);
            perimeter = calculatePerimeter(rectangleList.get(rectangleIndex) ,  rectangleIndex);
            
            System.out.println("The area of rectangle " + rectangleIndex + " is " + average);
            System.out.println("The perimeter of rectangle " + rectangleIndex + " is " + perimeter);
            
            
            System.out.println("\nDo you want to run another calculation? (y/n)");
            
            choice=keyboard.next().charAt(0);
            
        }while(choice=='y' || choice=='Y');
    }
    
    //printing rectangle Dimensions
    public static void printRectangleDimensions(double[] rectangleDimensionsArray , int index){
        System.out.println("Rectangle " + index + ":");
        System.out.println("The rectangle has length "+ rectangleDimensionsArray[0] + " and width " + rectangleDimensionsArray[1]+"\n");
    }
    
    //calculating the area of the rectangle
    public static double calculateArea(double[] rectangleDimensions ,int index){
        return (rectangleDimensions[0] * rectangleDimensions[1]);
        //System.out.println("The area of rectangle " + index + " is " + rectangleDimensions[0] * rectangleDimensions[1]);
    }
    
    //calculating the perimeter of the rectangle
    public static double calculatePerimeter(double[] rectangleDimensions ,int index){
        return (2*(rectangleDimensions[0] + rectangleDimensions[1]));
        //System.out.println("The perimeter of rectangle " + index + " is " + (2*(rectangleDimensions[0] + rectangleDimensions[1])));

    }
    
}
