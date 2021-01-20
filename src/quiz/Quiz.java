/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Sleeper
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        
        QuizClass Quiz = new QuizClass();
        Scanner Inputs = new Scanner(System.in);
        Scanner InputsQ = new Scanner (System.in);
        int indexQ =1;
        
        
        
        
        
        
        System.out.println("Vitaj, to to je geografický kvíz, ukáž ako dobre poznáš Európu \n Stlač 1 aby si začal");
        System.out.println("Posledné score, stlač 2");
        int input = Inputs.nextInt();
        
        if (input == 1)
        {
       
            for (int a = 0; a <10; a++)
                {
                            System.out.println(indexQ+  ". "  + " Hlavné mesto " + " "+ Quiz.Questions());
                            Quiz.Answer();
                            String input3 = InputsQ.nextLine();
                            Quiz.Check(input3);
                            System.out.println("Tvoje score je:" + Quiz.Score());
                            indexQ++;
                            
         
                }  
            Quiz.WriteLastScore();

        }
        
        if (input == 2)
            
        {
              File File = new File("C:\\Work\\LastScore.txt");
            

            Scanner Read = new Scanner(File); 
            while (Read.hasNextLine())
            {
                String data = Read.nextLine();
                System.out.println(data);
            }
            Read.close();
            
        }
        
        
        
        
        
        
    }
    
}
