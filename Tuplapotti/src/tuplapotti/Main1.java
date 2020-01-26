/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuplapotti;

/**
 *
 * @author illed
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        
        //Pystuorat "kiekot"
        Runko1 ekatolppa, tokatolppa, kolmostolppa;
        ekatolppa = new Runko1(1);
        tokatolppa = new Runko1(2);
        kolmostolppa = new Runko1(3);
        
        //Haetaan Runko1-luokasta satunnainen numero joka paikkaan
        int top1 = ekatolppa.getfruit();
        int mid1 = ekatolppa.getfruit();
        int bot1 = ekatolppa.getfruit();
        
        int top2 = tokatolppa.getfruit();
        int mid2 = tokatolppa.getfruit();
        int bot2 = tokatolppa.getfruit();
        
        int top3 = kolmostolppa.getfruit();
        int mid3 = kolmostolppa.getfruit();
        int bot3 = kolmostolppa.getfruit();
        
        int voittom = tokatolppa.voitto;
   
        
        
        //Tulostetaan kolme riviä. Joka riville tulee kolme hedelmää. fruitname() metodi kertoo numeroa vastaavan hedelmän
        
    
        System.out.println(ekatolppa.fruitname(top1) + ekatolppa.fruitname(top2) + ekatolppa.fruitname(top3));
        System.out.println(tokatolppa.fruitname(mid1) + tokatolppa.fruitname(mid2) + tokatolppa.fruitname(mid3));
        System.out.println(kolmostolppa.fruitname(bot1) + kolmostolppa.fruitname(bot2) + kolmostolppa.fruitname(bot3));
        System.out.println(" ");
        System.out.println(voittom);
        System.out.println(top1 + " " + top2 + " " + top3);
        System.out.println(mid1 + " " + mid2 + " " + mid3);
        System.out.println(bot1 + " " + bot2 + " " + bot3);

        
        
        
        if (tokatolppa.fruitname(mid1) == tokatolppa.fruitname(mid2) && tokatolppa.fruitname(mid1) == tokatolppa.fruitname(mid3)){
            switch (voittom) {
                case 0:
                    System.out.println("Voitit 1€");
                    break;
                case 1:
                    System.out.println("Voitit 2€");
                    break;
                case 2:
                    System.out.println("Voitit 3€");
                    break;
                case 3:
                    System.out.println("Voitit 4€");
                    break;
                default:                
                    System.out.println("Voitit 5€");
                    break;
            }

        }
        
        else{
            System.out.println("Ei voittoa");
        }
        
        
    }
    
}
