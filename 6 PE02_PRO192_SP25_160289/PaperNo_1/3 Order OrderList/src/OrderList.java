
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mynam
 */
public class OrderList extends ArrayList<Order>{
    public void addOrder(Order order){
        this.add(order);
    }
    public double getSaleByOrderId(String orderId){
        for(Order a : this)
            if(a.getOrderId().equalsIgnoreCase(orderId))
                return a.getSale();
        return 0;
    }
    public List<Order> getOrdersBySale(double value){
        List<Order> result = new ArrayList<>();
        for(Order a : this){
            if(a.getSale() >= value)
                result.add(a);
        }
        if(!result.isEmpty())
            return result;
        else 
            return null;
    }
}
