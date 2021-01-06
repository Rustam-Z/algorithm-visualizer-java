// Main GUI part of Sorting.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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

    public Sorting(){
        // Panel for options (bubble sort, insertion sort...)
        pPanel1 = new JPanel();        
        pPanel1.setLayout(new GridLayout(1, 7));
        pPanel1.setBackground(Color.CYAN);

        // Panel for visualization part
        pPanel2 = new JPanel();
        pPanel2.setLayout(new BorderLayout());

        // Buttons
        jbtRandomize = new JButton("Randomize");
        jbtMerge = new JButton("Merge Sort");
        jbtBubble = new JButton("Bubble Sort");
        jbtInsertion = new JButton("Insertion Sort");
        jbtSelection = new JButton("Selection Sort");
        jbtStart = new JButton("Start");
        jbtStart.setBackground(Color.GRAY);
        
        // Slider
        JSlider slider = new JSlider(0, 100, 0);
        slider.setPreferredSize(new Dimension(150, 30));

        // Adding elements to pPanel1
        pPanel1.add(jbtRandomize);
        pPanel1.add(jbtMerge); pPanel1.add(jbtSelection); pPanel1.add(jbtBubble); pPanel1.add(jbtInsertion);
        // pPanel1.add(jbtStart);
        pPanel1.add(slider, BorderLayout.WEST);

        // Adding elements to pPanel2
        pPanel2.add(sortAlgo, BorderLayout.CENTER);

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

        // Slider settings
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent event) {
                int value = slider.getValue();
            }
        });
    }

    class ListenerClass implements ActionListener {
        // Handles the Button operations

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jbtRandomize) {
                sortAlgo.initShuffler();
            }
            else if (e.getSource() == jbtMerge) {
                sortAlgo.mergeSort(); // Bubble sort algotithm
                sortAlgo.initShuffler(); // shuffling
            }
            else if (e.getSource() == jbtBubble) {
                sortAlgo.bubbleSort(); // Bubble sort algotithm
                sortAlgo.initShuffler(); // shuffling
            }
            else if (e.getSource() == jbtInsertion) {
                sortAlgo.insertionSort(); // Insertion algotithm
                sortAlgo.initShuffler(); // shuffling
            }
            else if (e.getSource() == jbtSelection) {
                sortAlgo.selectionSort(); // Insertion algotithm
                sortAlgo.initShuffler(); // shuffling
            }
            else if (e.getSource() == jbtStart) {
                System.out.println("jbtStart button clicked");
            }
            // setVisible(false); // will close the previous window
        }
    } // ListenerClass

} // Sorting
