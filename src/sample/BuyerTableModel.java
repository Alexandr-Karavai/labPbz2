package sample;


import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyerTableModel extends AbstractTableModel {

    private int colnum=4;
    private int rownum;
    private String[] colNames={
            "Дата","Название","Адрес","Сумма покупки"
    };
    private ArrayList<String[]> ResultSets;

    public BuyerTableModel(ResultSet rs) {

        ResultSets=new ArrayList<String[]>();

        try{
            while(rs.next()){

                String[] row={
                        rs.getString("dateN"),rs.getString("nameN"), rs.getString("adresN"), rs.getString("costN")
                };
                ResultSets.add(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception in buyer");
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
