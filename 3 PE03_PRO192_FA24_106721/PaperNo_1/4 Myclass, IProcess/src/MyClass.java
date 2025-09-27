/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class MyClass implements IProcess{

    @Override
    public int countWords(String str1, String str2) {
        int count = 0;
        String[] words = str1.trim().split(" ");
        for(String a : words)
            if(a.equalsIgnoreCase(str2))
                count++;
        return count;
        
    }

    @Override
    public String getLastWord(String str) {
        String result;
        String[] words = str.trim().split(" ");
        result = words[words.length-1];
        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        return result;
    }
    
}
