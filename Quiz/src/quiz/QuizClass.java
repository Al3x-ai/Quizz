/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sleeper
 */
public class QuizClass {
   
    int index = 0;
    int score = 0;
    /*int index = 0;
         Random RandomNumber = new Random();
         int random;
   int [] generated = {};    
   
  public void Random(){
       Random rng = new Random(); // Ideally just create one instance globally
// Note: use LinkedHashSet to maintain insertion order
    Set <Integer> generated = new LinkedHashSet<Integer>();
    while (generated.size() < 10)
{
    System.out.println(generated);
    Integer next = rng.nextInt(10) + 1;
    
    
    generated.add(next);
}
  
  }
  
   */
           
           
    String []  questions = {"Lotyšska ?",
                            "Dánska ?",
                            "Francúzka ?",
                            "Nemecka ? ",
                            "Španielska ?",
                            "Slovenska ?",
                            "Bulharska ?",
                            "Chorvátska ?",
                            "Talianka ?",
                            "Srbska ?",
                            };
          
                            
    
    String [] answers = {"Štokholm","Budapešť","Riga","Paríž",
                        "Moskva","Amsterdam","Oslo","Kodaň",
                        "Paríž","Rím","Istambul","Mardid",
                        "Bukuresť","Berlín","Mníchov","Hamburg",
                        "Lisabon","Porto","Mardid","Sevila",
                        "Kiev","Košice","Praha","Bratislava",
                        "Damašok","Sofia","Varma","Atény",
                        "Zagreb","Minks","Split","Zadar",
                        "Saravejo","Betántky","Rím","Neapol",
                        "Kosovo","Priština","Belegrad","Tirana",
                        };
    String [] good ={ 
        "c",
        "d",
        "a",
        "b",
        "c",
        "d",
        "b",
        "a",
        "c",
        "c"
                    
    };
    
    public void Check(String guess)
    {
        
        if (guess != good[index -1] )
        {
            score ++;
           System.out.println(guess);
            System.out.println(good[index -1]); 
            
        }
            
    }
    
    public int Score()
    {
        return score;
    }
    
    
    public String Questions()
    {
        
    return questions[index];
      
       
    }
    
    public void Answer()
    {
            System.out.print("a) "+answers [(index ) *4 +0]+ " ");
            System.out.print("b) "+ answers [(index )*4 +1]+ " ");
            System.out.print("c) "+ answers [(index )*4 +2]+ " ");
            System.out.print("d) "+ answers [(index )*4 +3]+ " ");
            
            
            index++; 
    }
    
    
     public void WriteLastScore()
    {
        File file = new File("C:\\Work\\LastScore.txt");
        
        
        
        
    try {
      FileWriter WriteScore = new FileWriter("C:\\Work\\LastScore.txt");
      WriteScore.write(index + " " + score);
      WriteScore.close();
      
      
    } 
    
    catch (IOException e) {
      System.out.println("Volačo je zle ");
      e.printStackTrace();
    }
       
    }
    
    
}
