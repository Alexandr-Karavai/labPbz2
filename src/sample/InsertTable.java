package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class InsertTable extends JFrame {

    private MyDBConnection mdbc;
    private Statement stmt;

////////////////////////////////////////////////
    private JTable tovarTable;
    private JLabel commentLabel;
    private JPanel dataPanel;

    private JTextField idField;
    private JLabel idLabel;

    private JTextField nameTField;
    private JLabel nameTLabel;

    private JComboBox categoryBox;
    private JLabel categoryLabel;

    private JButton sendButton;
    private JButton deleteButton;

    private JLabel upDelTLabel;
    private JTextField upDelTField;

    private JButton updateButtonT;
    private JPanel sendPanel;
    private JScrollPane tablePane;
    private JTabbedPane tabbedPane;
/////////////////////////////////////////////////
    private JPanel categoryPanel;
    private JTable categoryTovarTable;
    private JScrollPane categoryScrollPane;
////////////////////////////////////////////////
    private JPanel testPanel;
    private JTable testTable;
    private JScrollPane testScrollPane;

    private JPanel testDataPanel;
    private JTextField nameTovarSearch;
    private JLabel nameTovarSLabel;
    private JTextField dateSearchCostF;
    private JLabel dateSearchLabel;

    private JButton searchCost;
    private JPanel searchButtonP;
/////////////////////////////////////////////////

    private JPanel dataPanelProizvoditel;
    private JPanel sendPanelProizvoditel;

    private JTextField proizvoditelField;
    private JLabel proizvoditelLabel;

    private JTextField idTovarField;
    private JLabel idTovarLabel;

    private JTextField seriaNakladnayaField;
    private JLabel seriaNakladnayaLabel;

    private JButton okProizvoditelButton;
    private JButton deleteProizvoditelButton;

    private JPanel proizvoditelPanel;
    private JTable proizvoditelTable;
    private JScrollPane proizvoditelScrollPane;

////////////////////////////////////////////////

    private JPanel dataPanelN;
    private JTable nakladnayaTable;
    private JScrollPane nakladnayaPane;
    private JPanel contentN;

    private JPanel dataN;

    private JLabel faceLabel;
    private JComboBox faceBox;

    private JLabel nameNLabel;
    private JTextField nameNField;

    private JLabel fioLabel;
    private JTextField fioField;

    private JLabel adresLabel;
    private JTextField adresField;

    private JLabel numberNLabel;
    private JTextField numberNField;

    private JLabel seriaNLabel;
    private JTextField seriaNField;

    private JLabel numberBankLabel;
    private JTextField numberBankField;

    private JLabel nameBankLabel;
    private JTextField nameBankField;

    private JLabel costLabel;
    private JTextField costField;

    private JLabel kolvoLabel;
    private JTextField kolvoField;

    private JLabel dataLabel;
    private JTextField dataField;

    private JPanel buttonPanel;
    private JButton buttonOkN;

    private JLabel upDelNLabel;
    private JTextField upDelNField;

    private JButton buttonDeleteN;
    private JButton buttonUpdateN;

    private JTextField categoryField;

////////////////////////////////////////////////

    private JLabel moneyLabel;
    private JTextField moneyField;

    private JLabel enterDateLabel;
    private JTextField enterDateField;

    private JPanel dataPanelUser;
    private JScrollPane scrollPaneUserTable;
    private JTable userBuyTable;
    private JPanel contentU;
    private JButton searchU;
    private JPanel searchButtonPanel;

////////////////////////////////////////////////////////////

    private JPanel content;

    public InsertTable() throws  Exception{

        mdbc = new MyDBConnection();
        mdbc.init();
        Connection conn=mdbc.getMyConnection();
        stmt= conn.createStatement();

        initComponents();
    }

    private void initComponents() {
///////////////////////////////////////////////
        dataPanel = new JPanel();
        tablePane = new JScrollPane();
        sendPanel = new JPanel();

        idLabel = new JLabel();
        idField = new JTextField();

        nameTLabel = new JLabel();
        nameTField = new JTextField();

        categoryLabel = new JLabel();
        categoryBox = new JComboBox();
        categoryField = new JTextField();

        tovarTable = new JTable();

        upDelTLabel = new JLabel();
        upDelTField = new JTextField();

        sendButton = new JButton();
        deleteButton = new JButton();
        updateButtonT = new JButton();
        commentLabel = new JLabel();
/////////////////////////////////////////////////
        categoryPanel = new JPanel();
        categoryTovarTable = new JTable();
        categoryScrollPane = new JScrollPane();
//////////////////////////////////////////////////

        testPanel = new JPanel();
        testTable = new JTable();
        testScrollPane = new JScrollPane();

        testDataPanel = new JPanel();
        nameTovarSearch = new JTextField();
        nameTovarSLabel  = new JLabel();
        dateSearchCostF = new JTextField();
        dateSearchLabel  = new JLabel();

        searchCost = new JButton();
        searchButtonP = new JPanel();

//////////////////////////////////////////////////
        proizvoditelPanel = new JPanel();
        proizvoditelTable = new JTable();
        proizvoditelScrollPane = new JScrollPane();

        dataPanelProizvoditel = new JPanel();
        sendPanelProizvoditel = new JPanel();

        proizvoditelField = new JTextField();
        proizvoditelLabel = new JLabel();

        idTovarField = new JTextField();
        idTovarLabel = new JLabel();

        seriaNakladnayaField = new JTextField();
        seriaNakladnayaLabel = new JLabel();

        okProizvoditelButton = new JButton();
        deleteProizvoditelButton = new JButton();

////////////////////////////////////////////////
        dataPanelN = new JPanel();
        nakladnayaPane = new JScrollPane();
        contentN = new JPanel();
        nakladnayaTable = new JTable();

        dataN = new JPanel();

        faceLabel = new JLabel();
        faceBox = new JComboBox();

        nameNLabel = new JLabel();
        nameNField = new JTextField();

        fioLabel = new JLabel();
        fioField = new JTextField();

        adresLabel = new JLabel();
        adresField = new JTextField();

        numberNLabel = new JLabel();
        numberNField = new JTextField();

        seriaNLabel = new JLabel();
        seriaNField = new JTextField();

        numberBankLabel = new JLabel();
        numberBankField = new JTextField();

        nameBankLabel = new JLabel();
        nameBankField = new JTextField();

        costLabel = new JLabel();
        costField = new JTextField();

        kolvoLabel = new JLabel();
        kolvoField = new JTextField();

        dataLabel = new JLabel();
        dataField = new JTextField();

        buttonPanel = new JPanel();
        buttonOkN = new JButton();

        upDelNLabel = new JLabel();
        upDelNField = new JTextField();

        buttonDeleteN = new JButton();
        buttonUpdateN = new JButton();

////////////////////////////////////////////////

        moneyLabel = new JLabel();
        moneyField = new JTextField();

        enterDateLabel = new JLabel();
        enterDateField = new JTextField();

        dataPanelUser = new JPanel();
        scrollPaneUserTable = new JScrollPane();
        userBuyTable = new JTable();
        contentU = new JPanel();
        searchU = new JButton();
        searchButtonPanel = new JPanel();

/////////////////////////////////////////////////////////

        content = new JPanel();
        tabbedPane = new JTabbedPane();
        getContentPane().add(tabbedPane);

        dataPanel.setLayout(new GridLayout(4, 2, 1, 2));

        idLabel.setText("ID Товара:");
        dataPanel.add(idLabel);
        dataPanel.add(idField);

        nameTLabel.setText("Название:");
        dataPanel.add(nameTLabel);
        dataPanel.add(nameTField);

        categoryLabel.setText("Категория:");
        dataPanel.add(categoryLabel);
        categoryBox.setModel(new DefaultComboBoxModel(new String[]{ "Electronics", "bat", "torg oboryd"}));
        dataPanel.add(categoryBox);

        upDelTLabel.setText("Редактировать/Удалить по ID: ");
        dataPanel.add(upDelTLabel);
        dataPanel.add(upDelTField);

        ResultSet rs=getResultFromTovar();
        tovarTable.setModel(new TovarTableModel(rs));
        mdbc.close(rs);

        tablePane.setViewportView(tovarTable);

        sendPanel.setLayout(new GridLayout(2, 4));
        sendButton.setText("Добавить");
        sendButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        updateButtonT.setText("Редактировать");
        updateButtonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUpdateButtonT(e);
            }
        });

        deleteButton.setText("Удалить");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    deleteButtonActionPerformed(e);
            }
        });

        sendPanel.add(sendButton);
        sendPanel.add(updateButtonT);
        sendPanel.add(deleteButton);
        commentLabel.setText("Нажмите кнопку Добавить для записи");
        sendPanel.add(commentLabel);

        content.setLayout(new GridLayout(3,0));

        content.add(dataPanel, BorderLayout.NORTH);
        content.add(sendPanel, BorderLayout.CENTER);
        content.add(tablePane, BorderLayout.SOUTH);
        tabbedPane.addTab("Товар", content);
///////////////////////////////////////////////////////////////////////////////////////

        dataPanelN.setLayout(new GridLayout(4, 2, 1, 2));

        faceLabel.setText("Лицо:");
        dataPanelN.add(faceLabel);
        faceBox.setModel(new DefaultComboBoxModel(new String[]{"Natural person","Legal entity"}));
        dataPanelN.add(faceBox);

        nameNLabel.setText("Название:");
        dataPanelN.add(nameNLabel);
        dataPanelN.add(nameNField);

        fioLabel.setText("ФИО:");
        dataPanelN.add(fioLabel);
        dataPanelN.add(fioField);

        adresLabel.setText("Адрес: ");
        dataPanelN.add(adresLabel);
        dataPanelN.add(adresField);

        numberNLabel.setText("Номер: ");
        dataPanelN.add(numberNLabel);
        dataPanelN.add(numberNField);

        seriaNLabel.setText("Серия документа: ");
        dataPanelN.add(seriaNLabel);
        dataPanelN.add(seriaNField);

        numberBankLabel.setText("Номер банка: ");
        dataPanelN.add(numberBankLabel);
        dataPanelN.add(numberBankField);

        nameBankLabel.setText("Название банка: ");
        dataPanelN.add(nameBankLabel);
        dataPanelN.add(nameBankField);

        costLabel.setText("Цена: ");
        dataPanelN.add(costLabel);
        dataPanelN.add(costField);

        kolvoLabel.setText("Количество: ");
        dataPanelN.add(kolvoLabel);
        dataPanelN.add(kolvoField);

        dataLabel.setText("Дата: ");
        dataPanelN.add(dataLabel);
        dataField.setToolTipText("Формат даты: гггг-мм-чч");
        dataPanelN.add(dataField);

        upDelNLabel.setText("Редактировать/Удалить по ФИО: ");
        dataPanelN.add(upDelNLabel);
        dataPanelN.add(upDelNField);

        ResultSet rsN=getResultFromNakladnaya();
        nakladnayaTable.setModel(new NakladnayTableModel(rsN));
        mdbc.close(rsN);

        nakladnayaPane.setViewportView(nakladnayaTable);

        buttonPanel.setLayout(new GridLayout(1,4));
        buttonOkN.setText("Добавить: ");
        buttonOkN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButtonOkN(e);
            }
        });

        buttonUpdateN.setText("Редактировать: ");
        buttonUpdateN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButtonUpdateN(e);

            }
        });

        buttonDeleteN.setText("Удалить: ");
        buttonDeleteN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButtonDeleteN(e);
            }
        });

        buttonPanel.add(buttonOkN);
        buttonPanel.add(buttonUpdateN);
        buttonPanel.add(buttonDeleteN);

        contentN.setLayout(new GridLayout(3,0));
        contentN.add(dataPanelN, BorderLayout.NORTH);
        contentN.add(buttonPanel, BorderLayout.CENTER);
        contentN.add(nakladnayaPane, BorderLayout.SOUTH);
        tabbedPane.addTab("Накладая", contentN);
///////////////////////////////////////////////////////////////////////////////////////

        dataPanelUser.setLayout(new GridLayout(2, 1, 0, 1));

        moneyLabel.setText("Максимальная сумма: ");
        dataPanelUser.add(moneyLabel);
        dataPanelUser.add(moneyField);

        enterDateLabel.setText("Дата покупки: ");
        dataPanelUser.add(enterDateLabel);
        dataPanelUser.add(enterDateField);

        searchButtonPanel.setLayout(new GridLayout(1,4));
        searchU.setText("Найти");

        searchU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet rsBuyer = getResultFromBuyer();
                userBuyTable.setModel(new BuyerTableModel(rsBuyer));
                mdbc.close(rsBuyer);

            }
        });

        scrollPaneUserTable.setViewportView(userBuyTable);

        searchButtonPanel.add(searchU);

        contentU.setLayout(new GridLayout(3,0));
        contentU.add(dataPanelUser, BorderLayout.NORTH);
        contentU.add(searchButtonPanel, BorderLayout.CENTER);
        contentU.add(scrollPaneUserTable, BorderLayout.SOUTH);
        tabbedPane.addTab("Список покупателей", contentU);

///////////////////////////////////////////////////////////////////////////////////////
        ResultSet rsCategory = getResultFromCategoryTovar();
        categoryTovarTable.setModel(new CategoryTovarModel(rsCategory));
        mdbc.close(rsCategory);
        categoryScrollPane.setViewportView(categoryTovarTable);
        categoryPanel.setLayout(new GridLayout(3,0));
        categoryPanel.add(categoryScrollPane, BorderLayout.SOUTH);
        tabbedPane.addTab("Категория товаров", categoryPanel);
//////////////////////////////////////////////////////////////////////////////////////

        dataPanelProizvoditel.setLayout(new GridLayout(4, 2, 1, 2));

        proizvoditelLabel.setText("Производитель: ");
        dataPanelProizvoditel.add(proizvoditelLabel);
        dataPanelProizvoditel.add(proizvoditelField);

        idTovarLabel.setText("Код товара: ");
        dataPanelProizvoditel.add(idTovarLabel);
        dataPanelProizvoditel.add(idTovarField);

        seriaNakladnayaLabel.setText("Серия накладной: ");
        dataPanelProizvoditel.add(seriaNakladnayaLabel);
        dataPanelProizvoditel.add(seriaNakladnayaField);

        sendPanelProizvoditel.setLayout(new GridLayout(1,4));
        okProizvoditelButton.setText("Добавить: ");
        okProizvoditelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okProizvoditelEvent(e);
            }
        });

        deleteProizvoditelButton.setText("Удалить: ");
        deleteProizvoditelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProizvoditelEvent(e);
            }
        });

        sendPanelProizvoditel.add(okProizvoditelButton);
        sendPanelProizvoditel.add(deleteProizvoditelButton);

        ResultSet rsProizvod = getResultFromProizvoditel();
        proizvoditelTable.setModel(new ProizvodstvoTableModel(rsProizvod));
        mdbc.close(rsCategory);
        proizvoditelScrollPane.setViewportView(proizvoditelTable);
        proizvoditelPanel.setLayout(new GridLayout(3,0));
        proizvoditelPanel.add(dataPanelProizvoditel, BorderLayout.NORTH);
        proizvoditelPanel.add(sendPanelProizvoditel, BorderLayout.CENTER);
        proizvoditelPanel.add(proizvoditelScrollPane, BorderLayout.SOUTH);
        tabbedPane.addTab("Производитель", proizvoditelPanel);

/////////////////////////////////////////////////////////////////////////////////////////

        testDataPanel = new JPanel();
        nameTovarSearch = new JTextField();
        nameTovarSLabel  = new JLabel();
        dateSearchCostF = new JTextField();
        dateSearchLabel  = new JLabel();

        searchCost = new JButton();
        searchButtonP = new JPanel();

        testDataPanel.setLayout(new GridLayout(2, 1, 0, 1));

        nameTovarSLabel.setText("Название товара: ");
        testDataPanel.add(nameTovarSLabel);
        testDataPanel.add(nameTovarSearch);

        dateSearchLabel.setText("Дата: ");
        testDataPanel.add(dateSearchLabel);
        testDataPanel.add(dateSearchCostF);

        searchButtonP.setLayout(new GridLayout(1,4));
        searchCost.setText("Найти");
        searchCost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet rsTest = getResultFromSearchProizvoditel();
                testTable.setModel(new SearchProizvoditelTableModel(rsTest));
                mdbc.close(rsTest);
                testScrollPane.setViewportView(testTable);
            }
        });
        searchButtonP.add(searchCost);

        testPanel.setLayout(new GridLayout(3,0));
        testPanel.add(testDataPanel, BorderLayout.NORTH);
        testPanel.add(searchButtonP, BorderLayout.CENTER);
        testPanel.add(testScrollPane, BorderLayout.SOUTH);
        tabbedPane.addTab("Изменение стоимости", testPanel);


/////////////////////////////////////////////////////////////////////////////////////////
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1400, 500);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    private void sendButtonActionPerformed(ActionEvent evt) {

        String idT = idField.getText();
        String nameT = nameTField.getText();
        String category=(String)categoryBox.getSelectedItem();
        String insertStr="";

        try{

            insertStr="insert into tovar (idT, nameT, category) values("
                    +quotate(idT)+","
                    +quotate(nameT)+","
                    +quotate(category)
                    +")";

            int done=stmt.executeUpdate(insertStr);

            commentLabel.setText("Добавлена 1 запись");

            getContentPane().removeAll();
            initComponents();

        }
        catch(Exception e){
            commentLabel.setText("ОШИБКА - Данные введены некорректно");
            e.printStackTrace();
        }

    }

    private void setUpdateButtonT(ActionEvent evt) {

        String idT = idField.getText();
        String nameT = nameTField.getText();
        String category=(String)categoryBox.getSelectedItem();
        String idUpDel = upDelTField.getText();

        String insertStr="";

        try{

            insertStr="UPDATE tovar SET idT="+quotate(idT)+", nameT="+quotate(nameT)+"" +
                    ", category="+quotate(category)+" WHERE idT="+quotate(idUpDel);


            int done=stmt.executeUpdate(insertStr);

            commentLabel.setText("Обновлена 1 запись");

            getContentPane().removeAll();
            initComponents();

        }
        catch(Exception e){
            commentLabel.setText("ОШИБКА - Данные введены некорректно");
            e.printStackTrace();
        }

    }

    private void deleteButtonActionPerformed(ActionEvent evt) {

         String idT = upDelTField.getText();
        try{
            stmt.executeUpdate("DELETE FROM tovar WHERE idT="+quotate(idT)+"");
            commentLabel.setText("1 Запись удалена");
            getContentPane().removeAll();
            initComponents();
        }
        catch(Exception e){
            commentLabel.setText("Ошибка удаления");
            e.printStackTrace();
        }

    }

    private void setButtonOkN(ActionEvent evt) {
        // TODO add your handling code here:

        String face = (String)faceBox.getSelectedItem();
        String nameN = nameNField.getText();
        String fioN = fioField.getText();
        String adresFieldText = adresField.getText();
        String numberNText = numberNField.getText();
        String seriaText = seriaNField.getText();
        String numberBank = numberBankField.getText();
        String nameBank = nameBankField.getText();
        String costText = costField.getText();
        String kolvoText = kolvoField.getText();
        String dateText = dataField.getText();

        String insertStr="";

        try{

            insertStr="insert into nakladnaya (face, nameN, fioN, adresN, numberN, seriaN," +
                    " numberB, nameB, costN, kolvoN, dateN) values("
                    +quotate(face)+","
                    +quotate(nameN)+","
                    +quotate(fioN)+","
                    +quotate(adresFieldText)+","
                    +quotate(numberNText)+","
                    +quotate(seriaText)+","
                    +quotate(numberBank)+","
                    +quotate(nameBank)+","
                    +quotate(costText)+","
                    +quotate(kolvoText)+","
                    +quotate(dateText)
                    +")";

            int done=stmt.executeUpdate(insertStr);

          //  commentLabel.setText("1 row inserted");

            getContentPane().removeAll();
            initComponents();

        }
        catch(Exception e){
           // commentLabel.setText("Error occurred in inserting data");
            e.printStackTrace();
        }

    }

    private void setButtonUpdateN(ActionEvent evt) {

        String face = (String)faceBox.getSelectedItem();
        String nameN = nameNField.getText();
        String fioN = fioField.getText();
        String adresFieldText = adresField.getText();
        String numberNText = numberNField.getText();
        String seriaText = seriaNField.getText();
        String numberBank = numberBankField.getText();
        String nameBank = nameBankField.getText();
        String costText = costField.getText();
        String kolvoText = kolvoField.getText();
        String dateText = dataField.getText();
        String updateN = upDelNField.getText();

        String insertStr="";

        try{

            insertStr = "UPDATE nakladnaya SET face="+quotate(face)+", nameN="+quotate(nameN)+"" +
                    ", fioN="+quotate(fioN)+", adresN="+quotate(adresFieldText)+", numberN="
                    +quotate(numberNText)+", seriaN="+quotate(seriaText)+"" +
                    ", numberB="+quotate(numberBank)+", nameB="+quotate(nameBank)+"," +
                    " costN="+quotate(costText)+", kolvoN="+quotate(kolvoText)+"" +
                    ", dateN="+quotate(dateText)+" WHERE seriaN="+quotate(updateN);

            int done=stmt.executeUpdate(insertStr);

            commentLabel.setText("Обновлена 1 запись");

            getContentPane().removeAll();
            initComponents();
        }
        catch(Exception e){
            commentLabel.setText("Error occurred in inserting data");
            e.printStackTrace();
        }

    }

    private void setButtonDeleteN(ActionEvent evt) {

        String nameN = upDelNField.getText();
        try{
            stmt.executeUpdate("DELETE FROM nakladnaya WHERE seriaN="+quotate(nameN)+"");

            getContentPane().removeAll();
            initComponents();

           // getContentPane().remove(t);
           // initComponents();
        }
        catch(Exception e){
            commentLabel.setText("Error occurred in inserting data");
            e.printStackTrace();
        }

    }

    private void okProizvoditelEvent(ActionEvent evt) {

        String idT = proizvoditelField.getText();
        String nameT = idTovarField.getText();
        String category = seriaNakladnayaField.getText();
        String insertStr="";

        try{

            insertStr="insert into proizvodstvo (proizvodidel, idT, seriaN) values("
                    +quotate(idT)+","
                    +quotate(nameT)+","
                    +quotate(category)
                    +")";

            int done=stmt.executeUpdate(insertStr);
            getContentPane().removeAll();
            initComponents();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    private void deleteProizvoditelEvent(ActionEvent evt) {

        String idT = idTovarField.getText();
        try{
            stmt.executeUpdate("DELETE FROM proizvodstvo WHERE idT="+quotate(idT)+"");
            commentLabel.setText("1 Запись удалена");
            getContentPane().removeAll();
            initComponents();
        }
        catch(Exception e){
            commentLabel.setText("Ошибка удаления");
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new InsertTable().setVisible(true);
                }
                catch(Exception e){
                }
            }
        });
    }

    public ResultSet getResultFromTovar() {
        ResultSet rs=null;
        try{
            rs=stmt.executeQuery("Select * from tovar");

        }
        catch(SQLException e){}

        return rs;

    }

    public ResultSet getResultFromProizvoditel() {
        ResultSet rs=null;
        try{
            rs=stmt.executeQuery("Select * from proizvodstvo");

        }
        catch(SQLException e){}

        return rs;

    }

    public ResultSet getResultFromBuyer() {
        ResultSet rs=null;
        String moneyMax = moneyField.getText();
        String dateMax = enterDateField.getText();
        try{
            rs=stmt.executeQuery("Select dateN, nameN, adresN, costN from nakladnaya " +
                    "WHERE costN<"+quotate(moneyMax)+"AND dateN="+quotate(dateMax)+"");

        }
        catch(SQLException e){}

        return rs;

    }

    public ResultSet getResultFromCategoryTovar() {
        ResultSet rs=null;
        try{
            rs=stmt.executeQuery("SELECT DISTINCT category FROM tovar");

        }
        catch(SQLException e){}

        return rs;

    }

    public ResultSet getResultFromSearchProizvoditel() {
        ResultSet rs=null;
        String name = nameTovarSearch.getText();
        String date = dateSearchCostF.getText();
        try{
            rs=stmt.executeQuery("SELECT distinct proizvodidel, nameT, dateN, costN FROM tovar, " +
                    "nakladnaya, proizvodstvo WHERE nameT="+quotate(name)+"AND dateN<"+quotate(date)+"");

        }
        catch(SQLException e){}

        return rs;

    }

    public ResultSet getResultFromNakladnaya() {
        ResultSet rs=null;
        try{
            rs=stmt.executeQuery("Select * from nakladnaya");

        }
        catch(SQLException e){}

        return rs;

    }

    public String quotate(String content){

        return "'"+content+"'";
    }

}