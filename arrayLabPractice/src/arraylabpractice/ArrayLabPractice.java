/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylabpractice;

/**
 *
 * @author ashokmahanthi
 */
public class ArrayLabPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randomNumber = (int)(2 + Math.random() * 19 );
        
        int[] array1 = new int[randomNumber];
        int[] array2 = new int[randomNumber];
        int[] array3 = new int[randomNumber];
        
        int count = 0;
        double average;
        int sum = 0;
        
        for (int i =0; i < array1.length; i++){
            array1[i] = (int) (10 + Math.random() * 49);
        }
        
        System.out.print("The original array contains these elements: [");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            if (i+1 != array1.length){
            System.out.print(",");}
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("");
        
        System.out.print("The average of the values in the array is ");
        
        for (int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
        }
        
        average = sum/array1.length;
        
        System.out.printf("%.2f.",average);
        System.out.println("");
        System.out.println("");
        
        
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > average){
                array2[count] = array1[i];
                count = count + 1;}
        }
            
        System.out.print("The array with values higher than average is: ");
        System.out.print("[");
        for (int i = 0; i < count ; i++){
            System.out.print(array2[i]);
            if (i+1 != count){
            System.out.print(",");}
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("");
        
        count = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] < average){
                array3[count] = array1[i];
                count = count + 1;}
        }
            
        System.out.print("The array with values lower than average is: ");
        System.out.print("[");
        for (int i = 0; i < count ; i++){
            System.out.print(array3[i]);
            if (i+1 != count){
            System.out.print(",");}
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("");
            
        }
    }
    

