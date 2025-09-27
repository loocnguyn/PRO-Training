
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class SDrinkList extends ArrayList<SDrink>{
    public void addSDrink(SDrink sdrink){
        this.add(sdrink);
    }
    public int getSDrinkByMake(String value){
        int count = 0;
        for(SDrink a : this){
            if(a.getMake().equalsIgnoreCase(value))
                count++;
        }
        return count;
    }
    public SDrink getSDrinkWithMinPrice(){
        SDrink min = null;
        for(SDrink a : this)
            min = a;
        for(SDrink a : this){
            if(a.getPrice() < min.getPrice())
                min = a;
        }
        return min;
    }
}
