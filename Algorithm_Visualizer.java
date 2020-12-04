import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Algorithm_Visualizer {
    public static void main(String[] args){
        Window W = new Window();

    }
}

class Window extends JFrame implements ActionListener {//inheriting JFrame
    JFrame frame; // Window
    JMenuBar menuBar; // Object of Menu bar
    JMenu mainMenu, helpDesk; // Part of Menu bar
    JMenuItem menu_1,menu_2,menu_3,menu_4; // Items of Menu
    JButton jbtRandomize, jbtReset, jbtBubble, jbtInsertion, jbtSelection, jbtStart;  // Sorting Buttons
    JPanel p1Sorting, p2Sorting;

    Window() {
        frame = new JFrame("Algorithm_Visualizer");

        // menu items
        menuBar =new JMenuBar();
        mainMenu = new JMenu("Menu");
        helpDesk = new JMenu("Help");
        menu_1 = new JMenuItem("Path Finding");
        menu_2 = new JMenuItem("Sorting Techniques");
        menu_3 = new JMenuItem("Pic Puzzle Sorting");
        menu_4 = new JMenuItem("How it Works");

        // Buttons for sorting
        jbtRandomize = new JButton("Randomize");//create button
        jbtReset = new JButton("Reset");//create button
        jbtBubble = new JButton("Bubble sort");//create button
        jbtInsertion = new JButton("Insertion sort");//create button
        jbtSelection = new JButton("Selection sort");//create button
        jbtStart = new JButton("Start");//create button

        // Adding menus into Menu Bar
        mainMenu.add(menu_1); mainMenu.add(menu_2); mainMenu.add(menu_3); helpDesk.add(menu_4);
        menuBar.add(mainMenu); menuBar.add(helpDesk);

        // Panel for buttons
        p1Sorting = new JPanel();
        p1Sorting.setLayout(new GridLayout(6,1));
        // Adding Buttons to the panel
        p1Sorting.add(jbtRandomize); p1Sorting.add(jbtReset); p1Sorting.add(jbtSelection);
        p1Sorting.add(jbtBubble); p1Sorting.add(jbtInsertion); p1Sorting.add(jbtStart);

        // Actions
        menu_1.addActionListener(this);
        menu_2.addActionListener(this);
        menu_3.addActionListener(this);
        menu_4.addActionListener(this);
        jbtRandomize.addActionListener(this);
        jbtReset.addActionListener(this);
        jbtBubble.addActionListener(this);
        jbtInsertion.addActionListener(this);
        jbtSelection.addActionListener(this);
        jbtStart.addActionListener(this);

        // Adding frame
        frame.add(p1Sorting, BorderLayout.WEST);
        frame.setJMenuBar(menuBar);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Action Listener method
    public void actionPerformed(ActionEvent entry) {
        // Menu Items
        if(entry.getSource()==menu_1)
            System.out.println("1");
        else if(entry.getSource()==menu_2)
            System.out.println("2");
        else if(entry.getSource()==menu_3)
            System.out.println("3");
        else if(entry.getSource()==menu_4)
            System.out.println("4");

        // Buttons for Sorting techniques
        else if(entry.getSource()== jbtRandomize)
            System.out.println("Randomize");
        else if(entry.getSource()== jbtReset)
            System.out.println("Reset");
        else if(entry.getSource()== jbtSelection)
            System.out.println("Selection");
        else if(entry.getSource()== jbtBubble)
            System.out.println("Bubble");
        else if(entry.getSource()== jbtInsertion)
            System.out.println("Insertion");
        else if(entry.getSource()== jbtStart)
            System.out.println("Start");

    }
}




