// Main GUI part of Sorting.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sorting extends Main {
    // Object of the SortingAlgorithm, which includes the sorting algorithms
    SortingAlgorithm sortAlgo = new SortingAlgorithm();

    // Panels: pPanel1 - option bar, pPanel2 - visualization bar
    JPanel pPanel1, pPanel2;

    // Option buttons for choosing sorting techniques, speed, and size of array
    // Will be added to pPanel1
    JButton jbtRandomize, jbtMerge, jbtBubble, jbtInsertion, jbtSelection, jbtStart;

    // Progress Bar
    JProgressBar jb1;

    Sorting(){
        // Panel for options (bubble sort, insertion sort...)
        pPanel1 = new JPanel();        
        pPanel1.setLayout(new GridLayout(1, 7));
        pPanel1.setBackground(Color.CYAN);

        // Panel for visualization part
        pPanel2 = new JPanel();
        pPanel2.setLayout(new BorderLayout());

        // Buttons
        jbtRandomize = new JButton("Randomize");//create button
        jbtMerge = new JButton("Merge Sort");//create button
        jbtBubble = new JButton("Bubble Sort");//create button
        jbtInsertion = new JButton("Insertion Sort");//create button
        jbtSelection = new JButton("Selection Sort");//create button
        jbtStart = new JButton("Start");//create button
        jbtStart.setBackground(Color.GRAY);
        
        // Progress bar
        // jb1 = new JProgressBar(0,100);
        // jb1.setValue(rand.nextInt(100));
        // jb1.setStringPainted(true);

        // Adding elements to pPanel1
        pPanel1.add(jbtRandomize); pPanel1.add(jbtStart);
        pPanel1.add(jbtMerge); pPanel1.add(jbtSelection); pPanel1.add(jbtBubble); pPanel1.add(jbtInsertion);

        // Adding elements to pPanel2
        pPanel2.add(sortAlgo, BorderLayout.CENTER);
        // pPanel2.add(jb1, BorderLayout.WEST);

        // Register listener, event handling
        ListenerClass listener = new ListenerClass();
        jbtRandomize.addActionListener(listener);
        jbtMerge.addActionListener(listener);
        jbtBubble.addActionListener(listener);
        jbtInsertion.addActionListener(listener);
        jbtSelection.addActionListener(listener);
        jbtStart.addActionListener(listener);

        // Add Panels to the Main JFrame
        add(pPanel1, BorderLayout.NORTH);
        add(pPanel2, BorderLayout.CENTER);
    }

    class ListenerClass implements ActionListener {
        // Handles the Button operations

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtRandomize) {
                sortAlgo.initShuffler();
            }
            else if (e.getSource() == jbtMerge) {
                System.out.println("jbtMerge button clicked");
            }
            else if (e.getSource() == jbtBubble) {
                sortAlgo.bubbleSort(); // Bubble sort algotithm
                sortAlgo.initShuffler(); // shuffling
                System.out.println("jbtBubble button clicked");
            }
            else if (e.getSource() == jbtInsertion) {
                sortAlgo.insertionSort(); // Insertion algotithm
                sortAlgo.initShuffler(); // shuffling
                System.out.println("jbtInsertion button clicked");
            }
            else if (e.getSource() == jbtSelection) {
                System.out.println("jbtSelection button clicked");
            }
            else if (e.getSource() == jbtStart) {
                System.out.println("jbtStart button clicked");
            }
            // setVisible(false); // will close the previous window
        }
    } // ListenerClass

} // Sorting
