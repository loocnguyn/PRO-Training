/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class MyUtilities implements  IUtilities{

    @Override
    public int getLengthOfLongestWord(String sentence) {
        int max = 0;
        String[] words = sentence.trim().split(" ");
        for(String a : words){
            if(a.length()>max)
                max = a.length();
        }
        return max;
    }

    @Override
    public double calculateAverageValue(String str) {
        double avg;
        int count = 0;
        double sum = 0;
        for(char a : str.toCharArray()){
            if(Character.isDigit(a))
                if(Character.getNumericValue(a) % 2 ==0){
                    count++;
                    sum += Character.getNumericValue(a);
                }
                    
        }
        avg = sum / count;
        return avg;
    }
    
}
