package arrayListGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class mainScreen extends JPanel implements ActionListener {

    JFrame mainFrame = new JFrame("Task Board");
    JPanel mainPanel = new JPanel();

    editWindow ew;

    taskBoardModel userBoard;


    JButton editButton = new JButton("Edit");

    public void mainScreen(taskBoardModel getBoard) {
        userBoard = getBoard;

        JFrame mainFrame = new JFrame("Task Board");

        this.drawMenu(userBoard);
        this.drawColumns(userBoard.columns);


    }

    public void drawMenu(taskBoardModel userBoard) {
        JPanel menuPanel = new JPanel();

        mainFrame.setLayout(new BorderLayout());
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuPanel.setLayout(new BorderLayout());

        JPanel menuLeft = new JPanel();
        JPanel menuRight = new JPanel();

        menuLeft.setLayout(new FlowLayout());
        menuRight.setLayout(new FlowLayout());

        JLabel selectLabel = new JLabel("Select Project: ");

        JComboBox selectBox = new JComboBox();
        selectBox.addItem("");

        //JButton editButton = new JButton("Edit");
        JButton saveButton = new JButton("Save");
        JButton deleteButton = new JButton("Delete");
        //JButton editButton = new JButton("Edit");

        //editButton = new JButton("Edit");
        editButton.addActionListener(this);


        menuLeft.add(selectLabel);
        menuLeft.add(selectBox);
        menuLeft.add(saveButton);
        menuLeft.add(editButton);
        menuLeft.add(deleteButton);

        JButton loadButton = new JButton("Load...");
        JButton createButton = new JButton("Create new");
        JButton logoutButton = new JButton("Logout");

        menuRight.add(loadButton);
        menuRight.add(createButton);
        menuRight.add(logoutButton);

        menuPanel.add(menuLeft, BorderLayout.WEST);
        menuPanel.add(menuRight, BorderLayout.EAST);

        menuPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        //userBoard.columns.get(0).columnName = "WORK DAMNITG";

        mainFrame.add(menuPanel, BorderLayout.NORTH);
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        mainFrame.setSize(1000, 1000);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        mainPanel.setVisible(true);

        mainFrame.setVisible(true);

        mainFrame.revalidate();
        mainFrame.repaint();

        mainPanel.revalidate();
        mainPanel.repaint();

    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == editButton) {
            ew = new editWindow(userBoard);

        }

    }


    public void drawColumns(ArrayList userColumn) {
        ArrayList<JPanel> array = new ArrayList<>();
        columnModel currentColumn;

        for (int i = 0; i < userColumn.size(); i++) {
            currentColumn = (columnModel) userColumn.get(i);

            JPanel panel = addPanel(currentColumn);

            JPanel testPanel = addTaskPanel(currentColumn, i);
            //testPanel.add(new JLabel("LABEL"));

            panel.add(testPanel);
            //JPanel taskPanel = addTaskPanel(currentColumn,i);

            array.add(panel);
            mainPanel.add((JPanel) array.get(i));


            mainPanel.revalidate();
            mainPanel.repaint();
            //mainPanel.add(taskPanel);
           /*
           currentColumn = userColumn.get(i);
           JPanel panel = new JPanel();
           JLabel label = new JLabel(currentColumn.columnName);

           panel.add(label);

           //array.add(addPanel(currentColumn.columnName));

           array.add(panel);
           mainPanel.add(array.get(i));*/


        }

       /*
       ArrayList array = new ArrayList();

       for(int i=0;i        {
           JPanel panel = new JPanel();
           array.add(panel)
       }*/
    }

    public JPanel addPanel(columnModel userColumn) {
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setLayout(new BorderLayout());

        JPanel columnHeader = new JPanel();
        JPanel columnTask = new JPanel();

        columnHeader.setLayout(new BorderLayout());

        JPanel columnNamePanel = new JPanel();
        JPanel columnButtonPanel = new JPanel();

        JLabel columnNameLabel = new JLabel(userColumn.columnName);
        columnNamePanel.add(columnNameLabel);

        JButton taskAddButton = new JButton("+");
        columnButtonPanel.add(taskAddButton);

        columnHeader.add(columnNamePanel, BorderLayout.NORTH);
        columnHeader.add(columnButtonPanel, BorderLayout.SOUTH);


        panel.add(columnHeader, BorderLayout.NORTH);

        taskAddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                openTask(userColumn);
            }
        });

        return panel;
    }


    public JPanel addTaskPanel(columnModel userColumn, int columnIndex) {
        JPanel panel = new JPanel();

        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(new GridBagLayout());
        int position = 0;

        for (int i = 0; i < userColumn.task.size(); i++) {
            JPanel taskPanel = new JPanel();
            taskPanel.setLayout(new FlowLayout());

            JLabel taskLabel = new JLabel(userColumn.task.get(i).taskName);

            taskPanel.add(taskLabel);

            gbc.fill = GridBagConstraints.VERTICAL;
            gbc.gridx = 0;
            gbc.gridy = position;


            panel.add(taskPanel, gbc);
            position++;
        }

        return panel;
    }
}
