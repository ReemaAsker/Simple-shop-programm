


public class MonyCalculator {
    private int  twoHun = 0 ;
    private int  hundrad = 0;
    private int  fivety = 0;
    private int  twenty = 0;
    private int  ten = 0;
    private int  five = 0;
    private int  Shakal = 0;

    public MonyCalculator( int twoHun, int hundrad, int fivety, int twenty, int ten, int five, int Shakal) {
        
        this.twoHun = twoHun;
        this.hundrad = hundrad;
        this.fivety = fivety;
        this.twenty = twenty;
        this.ten = ten;
        this.five = five;
        this.Shakal = Shakal;
    }

    public int getTwoHun() {
        return (this.twoHun *200);
    }public int getHundrad() {
        return (this.hundrad*100);
    }public int getFivety() {
        return (this.fivety*50);
    }public int getTwenty() {
        return (this.twenty*20);
    }public int getTen() {
        return (this.ten*10);
    }public int getFive() {
        return (this.five*5);
    }public int getShakal() {
        return (this.Shakal*1);
    }public int getSum (){
      int sum =0;
      sum = this.getTwoHun() +this.getHundrad()+this.getFivety()+this.getTwenty()+this.getTen()+this.getFive()+this.getShakal();
       return sum; 
    }
    
   
    
}
