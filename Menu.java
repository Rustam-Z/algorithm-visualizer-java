import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Menu extends JFrame {
    // Creating Object
    Sorting sort = new Sorting();

    // Menubar
    static JMenuBar menuBar;

    // JMenu
    static JMenu mainMenu, helpDesk;

    // Menu items
    static JMenuItem menuItem1, menuItem2, menuItem3, menuItem4;

    // A Panel
    static JPanel pPanel1, pPanel2;

    Menu() {

        // Create Panel
        pPanel1 = new JPanel();
        pPanel2 = new JPanel();

        // Create a menubar
        menuBar = new JMenuBar();

        // Create a menu
        mainMenu = new JMenu("Menu");
        helpDesk = new JMenu("Help");

        // Create a menu items
        menuItem1 = new JMenuItem("Path Finding");
        menuItem2 = new JMenuItem("Sorting Techniques");
        menuItem3 = new JMenuItem("Puzzle Sorting");
        menuItem4 = new JMenuItem("How it Works");

        ListenerClass listener = new ListenerClass();

        // Register listeners
        menuItem1.addActionListener(listener);
        menuItem2.addActionListener(listener);
        menuItem3.addActionListener(listener);

        // Add menu items to menu
        mainMenu.add(menuItem1);
        mainMenu.add(menuItem2);
        mainMenu.add(menuItem3);
        helpDesk.add(menuItem4);

        // Add menu to menu bar
        menuBar.add(mainMenu);
        menuBar.add(helpDesk);

        // Add menubar to frame
        setJMenuBar(menuBar);

        // Add Panels
        pPanel1.setBackground(Color.CYAN);
        pPanel2.setBackground(Color.YELLOW);

        // Add Panel
        pPanel1.add(sort.p1Sorting);
        pPanel2.add(sort.p2Sorting);
        sort.p1Sorting.setVisible(false);
        sort.p2Sorting.setVisible(false);

        // Add Panels to the panel
        add(pPanel1, BorderLayout.WEST);
        add(pPanel2, BorderLayout.CENTER);

        setTitle("EightSoft");
        setSize(700,500);
        setLocation(200, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ListenerClass implements ActionListener {

        // Project Main Logic (Moving Panels)
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menuItem1) {
                sort.p1Sorting.setVisible(false);
                sort.p2Sorting.setVisible(false);
            }
            else if (e.getSource() == menuItem2) {
                sort.p1Sorting.setVisible(true);
                sort.p2Sorting.setVisible(true);
            }
        }
    }

} // Menu