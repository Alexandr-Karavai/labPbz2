package sample;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryTovarModel extends AbstractTableModel {

    private int colnum=1;
    private int rownum;
    private String[] colNames={"Категория товара"};
    private ArrayList<String[]> ResultSets;

    public CategoryTovarModel(ResultSet rs) {

        ResultSets=new ArrayList<String[]>();

        try{
            while(rs.next()){

                String[] row={
                         rs.getString("category")
                };
                ResultSets.add(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception in categoryTovar");
        }

    }

    public Object getValueAt(int rowindex, int columnindex) {

        String[] row=ResultSets.get(rowindex);
        return row[columnindex];

    }

    public int getRowCount() {
        return ResultSets.size();
    }

    public int getColumnCount() {
        return colnum;
    }

    public String getColumnName(int param) {

        return colNames[param];
    }



}

