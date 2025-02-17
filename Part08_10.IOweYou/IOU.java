/**
 *
 * @author estev
 */

import java.util.HashMap;
/**
 * Class that has a Hash Map that stores the name of a person and how much 
 * the person owe to the IOU
 * The key is the name of the person
 */
public class IOU {
    private HashMap<String, Double> iou;
    
    /**
     * Constructor without parameters 
     * Creates the hash map
     */
    public IOU(){
        this.iou = new HashMap<>();
    }
    
    /**
     *  Saves the amount the person owed to the IOU
     *  If the person already owes money it refreshes the amount
     */
    public void setSum(String toWhom, double amount){
        amount = amount + this.iou.getOrDefault(toWhom, 0.0);
        this.iou.put(toWhom, amount);
    }
    
    
    /**
     * It return the amount a person owes to the IOU
     * If a person returns 
     */
    public double howMuchDoIOweTo(String toWhom){
        double amount = this.iou.getOrDefault(toWhom,0.0);
        return amount;
    }
}
