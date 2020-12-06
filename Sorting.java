import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sorting extends JFrame {
    // Values
    ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist

    // Sorting Buttons
    JButton jbtRandomize, jbtReset, jbtBubble, jbtInsertion, jbtSelection, jbtStart;  // Sorting Buttons
    JPanel p1Sorting, p2Sorting;

    // Random Creator
    Random rand = new Random();

    // Progress Bar
    JProgressBar jb1;

    Sorting(){
        // Buttons for sorting
        jbtRandomize = new JButton("Randomize");//create button
        jbtReset = new JButton("Reset");//create button
        jbtBubble = new JButton("Bubble sort");//create button
        jbtInsertion = new JButton("Insertion sort");//create button
        jbtSelection = new JButton("Selection sort");//create button
        jbtStart = new JButton("Start");//create button
        jbtStart.setBackground(Color.GREEN);

        // Panel for buttons
        p1Sorting = new JPanel();
        p1Sorting.setLayout(new GridLayout(6,1));

        // Adding Buttons to the panel
        p1Sorting.add(jbtRandomize); p1Sorting.add(jbtReset); p1Sorting.add(jbtSelection);
        p1Sorting.add(jbtBubble); p1Sorting.add(jbtInsertion); p1Sorting.add(jbtStart);


        jb1 = new JProgressBar(0,100);
        jb1.setValue(rand.nextInt(100));
        jb1.setStringPainted(true);

        // Panel 2
        p2Sorting = new JPanel();
        p2Sorting.setLayout(new GridLayout(10,1));
        p2Sorting.add(jb1, BorderLayout.WEST);

    }

}

