package arrayListGUI;

import java.util.ArrayList;

public class taskBoardModel {

    String projectName;

    ArrayList<columnModel> columns = new ArrayList();

    public taskBoardModel(String userName)
    {

        columnModel newColumn = new columnModel("FIX");
        columnModel secondColumn = new columnModel("WORK");
        columns.add(newColumn);
        columns.add(secondColumn);

        taskModel firstTask = new taskModel("FIX","FIRST");
        taskModel secondTask = new taskModel("Second","Second");

        newColumn.task.add(firstTask);
        newColumn.task.add(secondTask);

        this.projectName = userName;


    }
}