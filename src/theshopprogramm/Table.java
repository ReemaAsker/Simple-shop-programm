package theshopprogramm;


import javax.swing.JTable;

public class Table extends JTable {

    
    Table() {
        super();
    }

    

    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 2; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean isCellEditable(int row, int column,boolean editable) {
        return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
    }
    

  
}