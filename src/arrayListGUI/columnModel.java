package arrayListGUI;

import java.util.ArrayList;

import javax.swing.JPanel;

public class columnModel {

    String columnName;
    //String task1;
    //String task2;
    taskModel test = new taskModel("WORK1","WORK2");

    ArrayList<taskModel> task = new ArrayList<taskModel>();

    public columnModel(String userCol)
    {
        this.columnName = userCol;

    }

    public void changeColumnName(String newName)
    {
        this.columnName = newName;
    }
}
