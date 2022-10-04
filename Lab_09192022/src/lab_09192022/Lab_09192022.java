/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_09192022;

/**
 *
 * @author ashokmahanthi
 */
public class Lab_09192022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array1 = new int[15];
        int[] array2 = new int[15];
        int[] array3 = new int[15];
 
        //Generating values and printing Array1
        System.out.print("Array1: ");                                           //printing the Array1: string as per the desired ouptut format.
        for (int i = 0; i < array1.length; i++){                                //using for loop, we are generating 15 random numbers by Math.random()
            array1[i] = (int)(1 + Math.random() * 50);
        }
        for (int i =0; i < array1.length; i ++){
            System.out.printf("%4d",array1[i]);
            }
        System.out.println("");
        
        //Generating values and printing Arary2
        System.out.print("Array2: ");
        for (int i = 0; i < array2.length; i++){
            array2 [i] = (int)(1 + Math.random() * 50);
        }
        
        for (int i =0; i < array2.length; i ++){
            System.out.printf("%4d",array2[i]);
        }
        System.out.println("");
        
        //Generating values and printing Array3
        System.out.print("Array3: ");
        for (int i =0; i < array3.length; i++){
            if ( array1[i] >= array2[i])
                array3[i] = array1[i];
            else array3[i] = array2[i];
        }
        for (int i =0; i < array3.length; i ++){
            System.out.printf("%4d",array3[i]);
        }
        System.out.println("");
        
    }
        
}
   