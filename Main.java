/**
 * Main.java includes:
 *  - Menus and menu items
 *  - Main frame
 */

import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {    
    // Menubar
	static JMenuBar menuBar;
    
	// JMenu 
	static JMenu mainMenu, helpDesk; 

	// Menu items 
	static JMenuItem menuItem1, menuItem2, menuItem3, menuItem4; 

    Main() {        
        // Create a menubar
        menuBar = new JMenuBar();

        // Create a menu 
        mainMenu = new JMenu("Menu");
        helpDesk = new JMenu("Help");

        // Create a menu items
        menuItem1 = new JMenuItem("Path Finding"); // Its for future vision
        menuItem2 = new JMenuItem("Sorting Techniques"); // Done
        menuItem3 = new JMenuItem("Puzzle Sorting"); // Its for future vision
        menuItem4 = new JMenuItem("How it Works"); // About

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
        
        setTitle("Eightsoft");
        setSize(800, 800);
        setLocation(300, 5);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ListenerClass implements ActionListener {
        String value;

        // Project Main Logic (Moving Panels)
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menuItem1) {
                System.out.println(" Path Finding Algorith (We will add it in future for portfolio)");
            }
            else if (e.getSource() == menuItem2) {
                // Creating Object
                new Sorting();   
                System.out.println("Menu Item 2 choosed");
            }
            else if (e.getSource() == menuItem2) {
                System.out.println(" Picture pazzling algorith (We will add it in future for portfolio)");
            }
            setVisible(false); // will close the previous window
        }
    }
    
} // Menu
