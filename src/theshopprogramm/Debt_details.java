
package theshopprogramm;

public class Debt_details {
    private String product;
    private double value;
    private String date;
    
    
    Debt_details(){
    }     
    public Debt_details(String product, double value, String date) {
        this.product = product;
        this.value = value;
        this.date = date;
    }
     
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getValue() {
        return value;
    }

    public void setPrice(String price) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
   
    
    
    
}
