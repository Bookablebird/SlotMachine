package tuplapotti;

import java.util.Random;

public class Runko1 {
    
    
    int fruit;
    
    int voitto;
    
    //Konstruktori "kiekolle"
    public Runko1(int tolppa){
        //turha muuttuja
        int column = tolppa;
    
            }
    public Runko1(){}
    
    
    //Satunnainen luku
    public int getfruit(){
        fruit = (int) ((50-0) * Math.random());
        //fruit = 0;
        return fruit;
    }

    
    //Lukua vastaava hedelmä
    /**public String fruitname(int fruitnum){
        String fruitname;
        switch (fruitnum) {
            case 0: fruitname = "Apple ";
            break;
            case 1: fruitname = "Orange ";
            break;
            case 2: fruitname = "Banana ";
            break;
            case 3: fruitname = "Strawberry ";
            break;
            case 4: fruitname  = "Watermelon ";
            break;
            default: fruitname ="ERROR ";
            break;
            
          
                    
        }**/
        
    public String fruitname(int fruitnum){
        String fruitname = null;
        if (fruitnum >= 0 && fruitnum <20){
            fruitname = "Apple ";
        } 
        else if (fruitnum >= 20 && fruitnum <30){
            fruitname = "Orange ";
            //voitto = 1;
        }
                
        else if (fruitnum >= 30 && fruitnum <40){
            fruitname = "Banana ";
            //voitto = 2;
        }
                
        else if (fruitnum >= 40 && fruitnum <45){
            fruitname = "Strawberry ";
            //voitto = 3;
        }
                
        else if (fruitnum >= 45 && fruitnum <50){
            fruitname = "Watermelon ";
            //voitto = 4;
        }
        else {
            fruitname = "ERROR ";
        }
        
    return fruitname;
    }
        
    public int voitto(int fruitnum){
        voitto = 6;
        if (fruitnum >=0 && fruitnum <20){
            voitto = 0;
        }
        else if (fruitnum >= 20 && fruitnum <30){
            voitto = 1;
        }
                
        else if (fruitnum >= 30 && fruitnum <40){
            voitto = 2;
        }
                
        else if (fruitnum >= 40 && fruitnum <45){
            voitto = 3;
        }
                
        else if (fruitnum >= 45 && fruitnum <50){
            voitto = 4;
        }
    return voitto;
    }
    
}
