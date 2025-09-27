
import jdk.nashorn.internal.objects.NativeString;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class Helpers implements  Actionable{

    @Override
    public int countWords(String value) {
        int result;
        String[] words = value.trim().split(" ");
        result = words.length;
        return result;
    }

    @Override
    public String getFirstWord(String value) {
        String result;
        String[] words = value.trim().split(" ");
        result = words[0];
        result = result.substring(0, 1).toUpperCase() +result.substring(1);
        return result;
    }
    
}
