
package theshopprogramm;

import java.util.ArrayList;

public class DebtorInfo {
    private String name;
    ArrayList <Debt_details> debtDetails = new ArrayList<>();
    private double debts_sum = 0;

    public double getDebts_sum() {
        return debts_sum;
    }

    public void setDebts_sum(double debts_sum) {
        this.debts_sum = debts_sum;
    }

    public DebtorInfo (){
        
    }

    @Override
    public String toString() {
        return name;
    }

    public DebtorInfo(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double sum_the_debts(){
            debts_sum += this.debtDetails.get(debtDetails.size()-1).getValue();
        return debts_sum;
    }
    public double sum_the_remaining(double doneValue){
    debts_sum -= doneValue;
        return debts_sum;
    }
    
}
