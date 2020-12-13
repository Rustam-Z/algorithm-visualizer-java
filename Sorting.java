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
    JButton jbtRandomize, jbtReset, jbtBubble, jbtInsertion, jbtSelection, jbtStart;  // Sorting Buttons

    // Random Creator
    Random rand = new Random();

    // Progress Bar
    JProgressBar jb1;

    Sorting(){
        // Create Panel
        // Panel for options (bubble sort, insertion sort...)
        pPanel1 = new JPanel();        
        pPanel1.setLayout(new GridLayout(6,1));

        // Panel for main algorithm
        pPanel2 = new JPanel();
        pPanel2.setLayout(new GridLayout(10,1));

        // Buttons for sorting
        jbtRandomize = new JButton("Randomize");//create button
        jbtReset = new JButton("Reset");//create button
        jbtBubble = new JButton("Bubble sort");//create button
        jbtInsertion = new JButton("Insertion sort");//create button
        jbtSelection = new JButton("Selection sort");//create button
        jbtStart = new JButton("Start");//create button
        jbtStart.setBackground(Color.GREEN);
        
        // Progress bar
        jb1 = new JProgressBar(0,100);
        jb1.setValue(rand.nextInt(100));
        jb1.setStringPainted(true);

        // Adding elements to Panel 1
        pPanel1.add(jbtRandomize); pPanel1.add(jbtReset); pPanel1.add(jbtSelection);
        pPanel1.add(jbtBubble); pPanel1.add(jbtInsertion); pPanel1.add(jbtStart);

        // Adding elements to Panel 2
        pPanel2.add(jb1, BorderLayout.WEST);

        // Set backgrounds for Panels
        pPanel1.setBackground(Color.CYAN);
        pPanel2.setBackground(Color.YELLOW);

        // pPanel1.add(p1Sorting);
        // pPanel2.add(p2Sorting);
        // p1Sorting.setVisible(true);
        // p2Sorting.setVisible(true);

        // Add Panels to the panel
        add(pPanel1, BorderLayout.NORTH);
        add(pPanel2, BorderLayout.CENTER);

    }

}
