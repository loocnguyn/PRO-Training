
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
public class JournalList extends ArrayList<Journal>{
    public void addJournal(Journal journal){
        this.add(journal);
    }
    public String getJournalPublisherById(int id){
        for(Journal a : this){
            if(a.getId() == id)
                return a.getPublisher().toUpperCase();
            
                
        }
        return "N/A";
    }
    public double getAveragePrice(){
        double sum =0;
        double avg;
        int count = 0;
        for(Journal b : this){
            sum += b.getPrice();
            count++;
        }
        avg = sum / count;
        return avg;
    }
}
