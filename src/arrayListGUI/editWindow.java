package arrayListGUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class editWindow extends JFrame {

    public editWindow(taskBoardModel userBoard)
    {

        String test;
        System.out.println(userBoard.columns.get(0).columnName);

        userBoard.columns.get(0).changeColumnName("WORK");
        //userBoard.columns.get(0).columnName = "NEW NAME";

    }
}