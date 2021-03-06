package sample;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProizvodstvoTableModel extends AbstractTableModel {

    private int colnum=3;
    private int rownum;
    private String[] colNames={
            "Производитель","Код товара","Серия накладной"
    };
    private ArrayList<String[]> ResultSets;


    public ProizvodstvoTableModel(ResultSet rs) {

        ResultSets=new ArrayList<String[]>();

        try{
            while(rs.next()){

                String[] row={
                        rs.getString("proizvodidel"),rs.getString("idT"), rs.getString("seriaN")
                };
                ResultSets.add(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception in Производитель");
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
