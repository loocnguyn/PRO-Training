/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class TextProcessorImpl implements  TextProcessor{

    @Override
    public String removeWhitespace(String input) {
        String result;
        result = input.replaceAll(" ", "");
        return result;
    }

    @Override
    public int countVowels(String input) {
        int count = 0;
        for(char a : input.toCharArray()){
            if(Character.toLowerCase(a) == 'a'||Character.toLowerCase(a) == 'i'||Character.toLowerCase(a) == 'u'||Character.toLowerCase(a) == 'e'||Character.toLowerCase(a) == 'o')
                count++;
        }
            
        return count;
    }
    
}
