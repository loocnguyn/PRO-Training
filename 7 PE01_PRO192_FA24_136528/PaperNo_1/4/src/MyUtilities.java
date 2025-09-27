/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class MyUtilities implements IUtilities{

    @Override
    public int countSpecial(String str) {
        int count = 0;
        for(char a : str.toCharArray()){
            if(a== '!' || a =='@' || a=='#' || a =='$'|| a=='%')
                count++;
        }
                return count;
    }

    @Override
    public int sumNumberDivisible3(String str) {
        int sum = 0;
        for(char b : str.toCharArray()){
            if(Character.isDigit(b)){
                int c = Character.getNumericValue(b);
                if(c  % 3 ==0)   
                    sum += c;
            }
        }
        return sum;
    }
    
}
