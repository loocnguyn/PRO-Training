/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class SimpleStringProcessor implements StringProcessor{

    @Override
    public int countCharacters(String str, char ch) {
        int count = 0;
        for(char a : str.trim().toCharArray())
            if(Character.toLowerCase(a) == Character.toLowerCase(ch) )
                count++;
        return count;
        
    }

    @Override
    public int countWordBeginByString(String s1, String s2) {
        int count = 0;
        String[] words = s1.trim().split(" ");
        for(String a : words ){
            if(a.toLowerCase().startsWith(s2.toLowerCase()))
                count++;
        }
            
        return count;
    }
    
}
