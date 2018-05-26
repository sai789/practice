package calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Events {
    ArrayList<DateEvent> dateEvents;
    JFrame mainFrame;
    JTextField day1, day2, day3, day4, day5, day6, day7;
    JLabel event1, event2, event3, event4, event5, event6, event7;
    JButton nextWeek;
    public Events() throws IOException {
        Date today = new Date();

        day1 = new JTextField(formatDate(today));
        day2 = new JTextField(formatDate(increaseDays(today, 1)));
        day3 = new JTextField(formatDate(increaseDays(today, 2)));
        day4 = new JTextField(formatDate(increaseDays(today, 3)));
        day5 = new JTextField(formatDate(increaseDays(today, 4)));
        day6 = new JTextField(formatDate(increaseDays(today, 5)));
        day7 = new JTextField(formatDate(increaseDays(today, 6)));

        day1.setEditable(false);
        day2.setEditable(false);
        day3.setEditable(false);
        day4.setEditable(false);
        day5.setEditable(false);
        day6.setEditable(false);
        day7.setEditable(false);

        nextWeek = new JButton("Next Week");

        event1 = new JLabel("Day1:");
        event2 = new JLabel("Day2:");
        event3 = new JLabel("Day3:");
        event4 = new JLabel("Day4:");
        event5 = new JLabel("Day5:");
        event6 = new JLabel("Day6:");
        event7 = new JLabel("Day7:");

        mainFrame = new JFrame("Week Event Calendar");
        mainFrame.setSize(1200, 500);
        mainFrame.setLayout(new FlowLayout());

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,700, 200);
        jPanel.setLayout(new GridLayout(7,1));
        jPanel.add(event1);
        jPanel.add(event2);
        jPanel.add(event3);
        jPanel.add(event4);
        jPanel.add(event5);
        jPanel.add(event6);
        jPanel.add(event7);

        mainFrame.add(day1);
        mainFrame.add(day2);
        mainFrame.add(day3);
        mainFrame.add(day4);
        mainFrame.add(day5);
        mainFrame.add(day6);
        mainFrame.add(day7);

        mainFrame.add(nextWeek);

        mainFrame.add(jPanel);

        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nextWeek.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                String lastDay = day7.getText();
                Date last = stringToDate(lastDay);
                day1.setText(formatDate(increaseDays(last, 1)));
                day2.setText(formatDate(increaseDays(last, 2)));
                day3.setText(formatDate(increaseDays(last, 3)));
                day4.setText(formatDate(increaseDays(last, 4)));
                day5.setText(formatDate(increaseDays(last, 5)));
                day6.setText(formatDate(increaseDays(last, 6)));
                day7.setText(formatDate(increaseDays(last, 7)));

                //if any text of day buttons matches with I/O, then change event label's text
                setEventLabels();
            }
        });

        File dataFile = new File("//Users//saikv//Desktop//saikumar//Practice projects//practice//src//calendar//events.txt");
        BufferedReader br = new BufferedReader(new FileReader(dataFile));

        String st;
        dateEvents = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            String details[] = st.split(" ");
            dateEvents.add(new DateEvent(details[0], details[1]));
        }

        setEventLabels();
    }

    private Date stringToDate(String lastDay) {
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");
        Date last = null;
        try {
            last = dt.parse(lastDay);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        return last;
    }

    private void setEventLabels() {
        event1.setText("Day1:");
        event2.setText("Day2:");
        event3.setText("Day3:");
        event4.setText("Day4:");
        event5.setText("Day5:");
        event6.setText("Day6:");
        event7.setText("Day7:");
        for (DateEvent dateEvent : dateEvents) {
            if (dateEvent.date.equals(day1.getText())) {
                event1.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day2.getText())) {
                event2.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day3.getText())) {
                event3.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day4.getText())) {
                event4.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day5.getText())) {
                event5.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day6.getText())) {
                event6.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
            else if (dateEvent.date.equals(day7.getText())) {
                event7.setText(makeEventString(dateEvent.date, dateEvent.event));
            }
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
//        System.out.println(formatDate(increaseDays(increaseDays(new Date()))));
        Events events = new Events();
    }
    public static Date increaseDays(Date date, int increment){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, increment);
        return c.getTime();
    }
    public static String formatDate(Date date){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return df.format(date).toString();
    }
    public static String makeEventString(Date date, String event){
        return formatDate(date)+": "+event;
    }
    public static String makeEventString(String date, String event){
        return date+": "+event;
    }
}
