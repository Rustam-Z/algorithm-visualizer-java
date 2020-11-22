import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Algorithm_Visualizer {
    public static void main(String[] args){
        Window W = new Window();

    }
}


class Window extends JFrame implements ActionListener {//inheriting JFrame
    JFrame f; // Window
    JMenuBar menuBar; // Object of Menu bar
    JMenu mainMenu, helpDesk; // Part of Menu bar
    JMenuItem menu_1,menu_2,menu_3,menu_4; // Items of Menu
    JButton b;
    JTextArea txtArea;

    Window() {
        f = new JFrame("Algorithm_Visualizer");

        menuBar =new JMenuBar();
        mainMenu = new JMenu("Menu");
        helpDesk = new JMenu("Help");
        menu_1 = new JMenuItem("Path Finding");
        menu_2 = new JMenuItem("Sorting Techniques");
        menu_3 = new JMenuItem("Pic Puzzle Sorting");
        menu_4 = new JMenuItem("How it Works");
        menu_1.addActionListener(this);
        menu_2.addActionListener(this);
        menu_3.addActionListener(this);

        b = new JButton("click");//create button
        b.setBounds(130, 100, 100, 40);

        txtArea = new JTextArea("Welcome to Algorithm_Visualizer!");
        txtArea.setBounds(5,5,360,320);

        mainMenu.add(menu_1); mainMenu.add(menu_2); mainMenu.add(menu_3); helpDesk.add(menu_4);
        menuBar.add(mainMenu); menuBar.add(helpDesk);
        // f.add(b);//adding button on frame
        f.add(txtArea); // adding text area on frame
        f.setJMenuBar(menuBar);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent entry) // Functions for buttons
    {
        if(entry.getSource()==menu_1)
            txtArea.cut();
        if(entry.getSource()==menu_2)
            txtArea.paste();
        if(entry.getSource()==menu_3)
            txtArea.selectAll();
        if(entry.getSource()==menu_4)
            txtArea.setText("Help Me");
    }
}


