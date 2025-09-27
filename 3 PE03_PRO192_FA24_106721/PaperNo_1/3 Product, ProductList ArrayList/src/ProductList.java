
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
public class ProductList extends ArrayList<Product>{
    public Product getProductById(int id){
        for(Product a : this){
            if(a.getId() == id)
                return a;

        }
        return null;
    }
    public Product getProductWithMinPrice(){
        Product min = this.get(0);
        for(Product a : this){
            if(a.getPrice() < min.getPrice())
                min = a;

        }
        return min;
    }
}
