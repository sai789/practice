package arrayListGUI;

import java.sql.Date;

public class taskModel {

    String taskName;
    String taskDescription;
    Date taskDate;
    String status;

    public taskModel(String userName,String description)
    {
        this.taskName = userName;
        this.taskDescription = description;
    }

    public void setTaskName(String taskName)
    {
        this.taskName = taskName;
        this.taskDescription = taskName;
    }
}