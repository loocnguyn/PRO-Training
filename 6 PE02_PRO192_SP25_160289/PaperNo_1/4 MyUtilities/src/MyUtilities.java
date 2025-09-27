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
    public char getCharacterByIndex(String strInput, int index) {
        char[] words = strInput.trim().toCharArray();
        if(index > words.length)
            return '@';
        return Character.toUpperCase(words[index]);
    }

    @Override
    public int getPrime(int n) {
        int dem = 0;
        int result = 0;
        int count = 0;
        if(n<=0)
            return 0;
        else{
            while(count!= n){
                dem++;
                if(isPrime(dem)){
                    count++;
                    result = dem;
                }

            }
        }
        return result;
    }
    public boolean isPrime(int n){
        int count=0;
        for(int i = 1;i<=n;i++)
            if(n% i ==0)
                count++;
        if(count ==2)
            return true;
        else
            return false;
    }
}
