
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
public class PromotionManager extends ArrayList<Promotion>{
    public void addPromotion(Promotion promotion){
        this.add(promotion);
    }
    public double getMinDiscountPercentage(){
        double min = 999;
        for(Promotion a : this)
            min = a.getDiscountPercentage();
        for(Promotion a : this){
            if(a.getDiscountPercentage() < min)
                min = a.getDiscountPercentage();
        }
        return min;
    }
    public double sumDiscountPercentageByValue(double value){
        double sum = 0;
        for(Promotion a : this){
            if(a.getDiscountPercentage()>= value)
                sum += a.getDiscountPercentage();
        }
        return sum;
    }
}
