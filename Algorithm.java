import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


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

        // Project Main Logic (Moving Panels)
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menu1) {
                Sorting sort = new Sorting();
            }
        }
    }

}


class Sorting {
    JFrame frameSorting = new JFrame("Sorting");
    // Values
    ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist

    // Sorting Buttons
    JButton jbtRandomize, jbtReset, jbtBubble, jbtInsertion, jbtSelection, jbtStart;  // Sorting Buttons
    JPanel p1Sorting, p2Sorting;
    Random rand = new Random();

    Sorting(){
        // Buttons for sorting
        jbtRandomize = new JButton("Randomize");//create button
        jbtReset = new JButton("Reset");//create button
        jbtBubble = new JButton("Bubble sort");//create button
        jbtInsertion = new JButton("Insertion sort");//create button
        jbtSelection = new JButton("Selection sort");//create button
        jbtStart = new JButton("Start");//create button

        // Panel for buttons
        p1Sorting = new JPanel();
        p1Sorting.setLayout(new GridLayout(7,1));

        // Adding Buttons to the panel
        p1Sorting.add(jbtRandomize); p1Sorting.add(jbtReset); p1Sorting.add(jbtSelection);
        p1Sorting.add(jbtBubble); p1Sorting.add(jbtInsertion); p1Sorting.add(jbtStart);

        // Adding frame
        frameSorting.add(p1Sorting, BorderLayout.WEST);
        frameSorting.setTitle("Sorting");
        frameSorting.setSize(700,500);
        frameSorting.setLocation(200, 100);
        frameSorting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSorting.setVisible(true);
    }

}
