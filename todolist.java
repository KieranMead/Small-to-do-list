import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class todolist {

    public static void main(String[] args) {
        makeframe();
    }

    public static void makeframe() {
        JFrame mainframe = new JFrame("To Do List");
        mainframe.setSize(1920, 1080);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));
        mainframe.add(mainpanel);

        JLabel titLabel = new JLabel("Welcome to your very own to do list");
        mainpanel.add(titLabel);

        JButton addButton = new JButton("Add an item to your to do list");
        mainpanel.add(addButton);

        mainframe.setVisible(true);
        mainframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JPanel Addevent = new JPanel();
                Addevent.setLayout(new BoxLayout(Addevent, BoxLayout.Y_AXIS));
                mainframe.getContentPane().removeAll();
                mainframe.getContentPane().add(Addevent);

                JLabel itemnamLabel = new JLabel("Please enter item name here");
                Addevent.add(itemnamLabel);

                JTextField Eventname = new JTextField();
                Eventname.setText("Enter item name here");
                Eventname.setForeground(java.awt.Color.GRAY);
                Addevent.add(Eventname);

                Eventname.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (Eventname.getText().equals("Enter item name here")) {
                            Eventname.setText("");
                        }
                    }
                });

                
                JTextField Eventname2 = new JTextField();
                Eventname2.setText("Enter item name here");
                Eventname2.setForeground(java.awt.Color.GRAY);
                Addevent.add(Eventname2);

                Eventname2.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (Eventname2.getText().equals("Enter item name here")) {
                            Eventname2.setText("");
                        }
                    }
                });

                JTextField Eventname3 = new JTextField();
                Eventname3.setText("Enter item name here");
                Eventname3.setForeground(java.awt.Color.GRAY);
                Addevent.add(Eventname3);

                Eventname3.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (Eventname3.getText().equals("Enter item name here")) {
                            Eventname3.setText("");
                        }
                    }
                });

                JTextField Eventname4 = new JTextField();
                Eventname4.setText("Enter item name here");
                Eventname4.setForeground(java.awt.Color.GRAY);
                Addevent.add(Eventname4);

                Eventname4.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (Eventname4.getText().equals("Enter item name here")) {
                            Eventname4.setText("");
                        }
                    }
                });

                JTextField Eventname5 = new JTextField();
                Eventname5.setText("Enter item name here");
                Eventname5.setForeground(java.awt.Color.GRAY);
                Addevent.add(Eventname5);

                Eventname5.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (Eventname5.getText().equals("Enter item name here")) {
                            Eventname5.setText("");
                        }
                    }
                });

                

                

                JLabel DateLabel = new JLabel("Please enter the date of completion (dd-mm-yyyy)");
                Addevent.add(DateLabel);

                JTextField dateField = new JTextField();
                dateField.setText("Enter date here");
                dateField.setForeground(java.awt.Color.GRAY);
                Addevent.add(dateField);

                dateField.addFocusListener(new FocusAdapter() {
                    public void focusGained(FocusEvent e) {
                        if (dateField.getText().equals("Enter date here")) {
                            dateField.setText("");
                        }
                    }
                });

                JButton submitbutton = new JButton("Submit All");
                Addevent.add(submitbutton);

                submitbutton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String itemName1 = Eventname.getText();
                        String itemName2 = Eventname2.getText();
                        String itemName3 = Eventname3.getText();
                        String itemName4 = Eventname4.getText();
                        String itemName5 = Eventname5.getText();
                        String dateOfCompletion = dateField.getText();

                        try {
                            // Use a fixed file name
                            File file = new File("todolist.txt");

                            // Create a BufferedWriter to append to the file
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                            // Write a properly formatted string
                            writer.write("Item 1: " + itemName1);
                            writer.newLine();
                            writer.write("Item 2: " + itemName2);
                            writer.newLine();
                            writer.write("Item 3: " + itemName3);
                            writer.newLine();
                            writer.write("Item 4: " + itemName4);
                            writer.newLine();
                            writer.write("Item 5: " + itemName5);
                            writer.newLine();
                            writer.write("Date of Completion: " + dateOfCompletion);
                            writer.newLine();
                            writer.newLine();  // Add a blank line for separation between entries
                            writer.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            System.out.println("didnt work");
                        }

                        // Reset text fields
                        Eventname.setText("Enter item name here");
                        Eventname2.setText("Enter item name here");
                        Eventname3.setText("Enter item name here");
                        Eventname4.setText("Enter item name here");
                        Eventname5.setText("Enter item name here");
                        dateField.setText("Enter date here");

                        Eventname.setForeground(java.awt.Color.GRAY);
                        dateField.setForeground(java.awt.Color.GRAY);
                    }
                });
                System.out.println("File path: " + new File("todolist.txt").getAbsolutePath());

                mainframe.revalidate();
                mainframe.repaint();
            }
        });
    }
}