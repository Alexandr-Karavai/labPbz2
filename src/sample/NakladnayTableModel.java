package sample;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NakladnayTableModel extends AbstractTableModel {

    private int colnum=11;
    private int rownum;
    private String[] colNames={
            "Лицо","Название","ФИО","Адрес","Номер","Серия документа","Номер банка","Название банка","Цена","Количество","Дата"
    };
    private ArrayList<String[]> ResultSets;

    public NakladnayTableModel(ResultSet rs) {

        ResultSets=new ArrayList<String[]>();

        try{
            while(rs.next()){

                String[] row={
                        rs.getString("face"),rs.getString("nameN"), rs.getString("fioN"), rs.getString("adresN"),
                        rs.getString("numberN"), rs.getString("seriaN"), rs.getString("numberB"), rs.getString("nameB"),
                        rs.getString("costN"), rs.getString("kolvoN"), rs.getString("dateN")
                };
                ResultSets.add(row);
            }
        }
        catch(Exception e){
            System.out.println("Exception in nakladnaya");
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
