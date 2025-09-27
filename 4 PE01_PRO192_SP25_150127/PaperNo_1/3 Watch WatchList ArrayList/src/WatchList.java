
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
public class WatchList extends ArrayList<Watch>{
    public void addWatch(Watch watch){
        this.add(watch);
    }
    public WatchList filterByBrand(String value){
        WatchList result = new WatchList();
        for(Watch a : this)
            if(a.getBrand().equalsIgnoreCase(value) )
                result.add(a);
        if(!result.isEmpty())
            return result;
        else
            return null;
    }
    public Watch findMostExpensive(){
        Watch max = null;
        for( Watch a : this)
            max = a;
        for(Watch a : this){
            if(a.getPrice() > max.getPrice())
                max = a;
        }
        return max;
    }
}
