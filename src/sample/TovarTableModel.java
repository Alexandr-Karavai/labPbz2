package sample;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TovarTableModel extends AbstractTableModel {

    private int colnum=3;
    private int rownum;
    private String[] colNames={
            "Код товара","Название","Категория"
    };
    private ArrayList<String[]> ResultSets;

    public TovarTableModel(ResultSet rs) {

        ResultSets=new ArrayList<String[]>();

        try{
            while(rs.next()){

                String[] row={
                        rs.getString("idT"),rs.getString("nameT"), rs.getString("category")
                };
                ResultSets.add(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception in tovar");
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
