/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetabingo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lines {
    private ArrayList <Integer> numbers = new ArrayList<>();
    
    
    public Lines (int lineSize){
        int number;
        Random rand = new Random();
        while (numbers.size() < lineSize){
            number= rand.nextInt(99) + 1;
            if (!numbers.contains(number)){
                numbers.add(number);
            }
        }
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    } 

    @Override
    public String toString() {
        String result= "[";
        for (int i = 0; i < numbers.size(); i++){
            result += numbers.get(i);
            if (i < numbers.size() - 1){
                result += ",";
            }
        }
        result += "]";
        return result;
    }
    
    
    
}
