import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Algorithm extends JFrame{

    // Menu Bar
    JMenuBar menuBar =new JMenuBar();
    JMenu mainMenu = new JMenu("Menu");
    JMenu helpDesk = new JMenu("Help");
    JMenuItem menu1 = new JMenuItem("Path Finding");
    JMenuItem menu2 = new JMenuItem("Sorting Techniques");
    JMenuItem menu3 = new JMenuItem("Pic Puzzle Sorting");
    JMenuItem menu4 = new JMenuItem("How it Works");

    Algorithm(){
        // Adding MenuBar to the frame
        mainMenu.add(menu1); mainMenu.add(menu2); mainMenu.add(menu3); helpDesk.add(menu4);
        menuBar.add(mainMenu); menuBar.add(helpDesk);
        setJMenuBar(menuBar);

        // Register listeners
        ListenerClass listener = new ListenerClass();
        menu1.addActionListener(listener);
        menu2.addActionListener(listener);
        menu3.addActionListener(listener);
    }

    public static void main(String[] args){
        JFrame frame = new Algorithm();
        frame.setTitle("Project 2020 by EightSoft Academy");
        frame.setSize(700,500);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class ListenerClass implements ActionListener {
        String value;

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menu1) {
                System.out.println("KUKU");

            }
        }
    }

}
