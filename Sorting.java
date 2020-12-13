import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sorting extends Main {
    // Values
    ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist

    // Panels
    JPanel pPanel1, pPanel2;

    // Sorting Buttons
    JButton jbtRandomize, jbtMerge, jbtBubble, jbtInsertion, jbtSelection, jbtStart;  // Sorting Buttons

    // Random Creator
    Random rand = new Random();

    // Progress Bar
    JProgressBar jb1;

    Sorting(){
        // Create Panel
        // Panel for options (bubble sort, insertion sort...)
        pPanel1 = new JPanel();        
        pPanel1.setLayout(new GridLayout(1, 7));

        // Panel for main algorithm
        pPanel2 = new JPanel();
        pPanel2.setLayout(new GridLayout(10, 1));

        // Buttons for sorting
        jbtRandomize = new JButton("Randomize");//create button
        jbtMerge = new JButton("Merge Sort");//create button
        jbtBubble = new JButton("Bubble Sort");//create button
        jbtInsertion = new JButton("Insertion Sort");//create button
        jbtSelection = new JButton("Selection Sort");//create button
        jbtStart = new JButton("Start");//create button
        jbtStart.setBackground(Color.GREEN);
        
        // Progress bar
        jb1 = new JProgressBar(0,100);
        jb1.setValue(rand.nextInt(100));
        jb1.setStringPainted(true);

        // Adding elements to Panel 1
        pPanel1.add(jbtRandomize); pPanel1.add(jbtMerge); pPanel1.add(jbtSelection);
        pPanel1.add(jbtBubble); pPanel1.add(jbtInsertion); pPanel1.add(jbtStart);

        // Adding elements to Panel 2
        pPanel2.add(jb1, BorderLayout.WEST);

        // Set backgrounds for Panels
        pPanel1.setBackground(Color.CYAN);
        pPanel2.setBackground(Color.YELLOW);

        // Register listeners
        ListenerClass listener = new ListenerClass();
        jbtRandomize.addActionListener(listener);
        jbtMerge.addActionListener(listener);
        jbtBubble.addActionListener(listener);
        jbtInsertion.addActionListener(listener);
        jbtSelection.addActionListener(listener);
        jbtStart.addActionListener(listener);

        // Add Panels to the panel
        add(pPanel1, BorderLayout.NORTH);
        add(pPanel2, BorderLayout.CENTER);
    }

    class ListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtRandomize)
                System.out.println("jbtRandomize button clicked");
            else if (e.getSource() == jbtMerge)
                System.out.println("jbtMerge button clicked");
            else if (e.getSource() == jbtBubble)
                System.out.println("jbtBubble button clicked");
            else if (e.getSource() == jbtInsertion)
                System.out.println("jbtInsertion button clicked");
            else if (e.getSource() == jbtSelection)
                System.out.println("jbtSelection button clicked");
            else if (e.getSource() == jbtStart)
                System.out.println("jbtStart button clicked");
        }
    } 
}
