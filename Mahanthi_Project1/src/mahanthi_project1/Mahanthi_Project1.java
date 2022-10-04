/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahanthi_project1;

import java.util.Scanner;

/**
 *
 * @author ashokmahanthi
 * CS5160-Project1
 */
public class Mahanthi_Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);

        char choice;

        String color1,color2,color3,color4,color5,color6,color7,color8,color9,color10;
        
        String band1,band2,band3;

        color1 = "black";
        color2 = "brown";
        color3 = "red";
        color4 = "orange";
        color5 = "yellow";
        color6 = "green";
        color7 = "blue";
        color8 = "violet";
        color9 = "gray";
        color10 = "white";

        int digitValue1;
        int digitValue2;
        double exponent;
        int base;
        double multiplierValue;
     
        double resistanceInOhms;
        double resistanceInKiloOhms;

        do {
            
            System.out.print("Enter the Color of band 1: ");
            band1 = keyboard.nextLine();

                while ( !(band1.equalsIgnoreCase(color1)|| band1.equalsIgnoreCase(color2) || band1.equalsIgnoreCase(color3)|| band1.equalsIgnoreCase(color4)||band1.equalsIgnoreCase(color5)
                         || band1.equalsIgnoreCase(color6)|| band1.equalsIgnoreCase(color7) || band1.equalsIgnoreCase(color8)|| band1.equalsIgnoreCase(color9)||band1.equalsIgnoreCase(color10)))   
                    {
                        System.out.print("This is not a valid color. Re-enter the color of the band 1: ");
                        band1 = keyboard.nextLine();
                    }

            System.out.print("Enter the Color of band 2: ");
            band2 = keyboard.nextLine();

                while ( !(band2.equalsIgnoreCase(color1)|| band2.equalsIgnoreCase(color2) || band2.equalsIgnoreCase(color3)|| band2.equalsIgnoreCase(color4)||band2.equalsIgnoreCase(color5)
                         || band2.equalsIgnoreCase(color6)|| band2.equalsIgnoreCase(color7) || band2.equalsIgnoreCase(color8)|| band2.equalsIgnoreCase(color9)||band2.equalsIgnoreCase(color10)))
                    {
                        System.out.print("This is not a valid color. Re-enter the color of the band 2: ");
                        band2 = keyboard.nextLine();
                    }

            System.out.print("Enter the Color of band 3: ");
            band3 = keyboard.nextLine();

                while ( !(band3.equalsIgnoreCase(color1)|| band3.equalsIgnoreCase(color2) || band3.equalsIgnoreCase(color3)|| band3.equalsIgnoreCase(color4)||band3.equalsIgnoreCase(color5)
                         || band3.equalsIgnoreCase(color6)|| band3.equalsIgnoreCase(color7) || band3.equalsIgnoreCase(color8)|| band3.equalsIgnoreCase(color9)||band3.equalsIgnoreCase(color10)))            
                    {
                        System.out.print("This is not a valid color. Re-enter the color of the band 3: ");
                        band3 = keyboard.nextLine();
                    }

            //--fetching  digit-1 value based on user input-----------------
            digitValue1 = 0;
            if(band1.equalsIgnoreCase(color1))
                digitValue1=0;
            else if(band1.equalsIgnoreCase(color2))
                digitValue1=1;
            else if(band1.equalsIgnoreCase(color3))
                digitValue1=2;
            else if(band1.equalsIgnoreCase(color4))
                digitValue1=3;
            else if(band1.equalsIgnoreCase(color5))
                digitValue1=4;
            else if(band1.equalsIgnoreCase(color6))
                digitValue1=5;
            else if(band1.equalsIgnoreCase(color7))
                digitValue1=6;
            else if(band1.equalsIgnoreCase(color8))
                digitValue1=7;
            else if(band1.equalsIgnoreCase(color9))
                digitValue1=8;
            else if(band1.equalsIgnoreCase(color10))
                digitValue1=9;

            //--fetching  digit-2 value based on user input-----------------
            digitValue2 = 0;
            if(band2.equalsIgnoreCase(color1))
                digitValue2=0;
            else if(band2.equalsIgnoreCase(color2))
                digitValue2=1;
            else if(band2.equalsIgnoreCase(color3))
                digitValue2=2;
            else if(band2.equalsIgnoreCase(color4))
                digitValue2=3;
            else if(band2.equalsIgnoreCase(color5))
                digitValue2=4;
            else if(band2.equalsIgnoreCase(color6))
                digitValue2=5;
            else if(band2.equalsIgnoreCase(color7))
                digitValue2=6;
            else if(band2.equalsIgnoreCase(color8))
                digitValue2=7;
            else if(band2.equalsIgnoreCase(color9))
                digitValue2=8;
            else if(band2.equalsIgnoreCase(color10))
                digitValue2=9;

            //--fetching multiplier value based on user input----------------
            exponent = 0;
            if(band3.equalsIgnoreCase(color1))
                exponent=0;
            else if(band3.equalsIgnoreCase(color2))
                exponent=1;
            else if(band3.equalsIgnoreCase(color3))
                exponent=2;
            else if(band3.equalsIgnoreCase(color4))
                exponent=3;
            else if(band3.equalsIgnoreCase(color5))
                exponent=4;
            else if(band3.equalsIgnoreCase(color6))
                exponent=5;
            else if(band3.equalsIgnoreCase(color7))
                exponent=6;
            else if(band3.equalsIgnoreCase(color8))
                exponent=7;
            else if(band3.equalsIgnoreCase(color9))
                exponent=8;
            else if(band3.equalsIgnoreCase(color10))
                exponent=9;

            //--calculating the multiplier value----
            base = 10;
            multiplierValue = 1;
            while (exponent != 0 ) {

                multiplierValue = multiplierValue * base;  
                exponent--; 
            }

            //calculating the resistance index.
            resistanceInOhms = ( digitValue1 * 10 + digitValue2 ) * multiplierValue;
            
            //calculating Kilo-Ohms.
            resistanceInKiloOhms = resistanceInOhms/1000; 
            System.out.println();
            System.out.printf("The resistance index is %,.0f ohms or %,.3f kilo-ohms.",resistanceInOhms,resistanceInKiloOhms);
            System.out.println("\n\nDo you want to decode another resistor (y/n)? ");

            //prompting the user for decoding another resistor or exit from the program..
            choice = keyboard.next().charAt(0); 
            keyboard.nextLine();

        }while(choice == 'y' || choice == 'Y');
    }
    
}
