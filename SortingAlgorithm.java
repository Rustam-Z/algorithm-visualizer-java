// Implementation of Sorting algorithms

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.SwingWorker;

public class SortingAlgorithm extends JPanel {
    private final int WIDTH = 800, HEIGHT = WIDTH * 9 / 16;
    public int SIZE = 100; // the number if sorting elements
    private final float BAR_WIDTH = (float)WIDTH / SIZE; // bar width
    private float[] bar_height = new float[SIZE]; // height of bars
    private SwingWorker<Void, Void> shuffler, sorter;
    private int current_index, traversing_index;

    SortingAlgorithm() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        initBarHeight(); // initialize the height of each bar
        // initShuffler(); // shuffle each bar
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Create randomizer
        Random random = new Random(); 

        // Drawing the rectangles
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.CYAN);
        Rectangle2D.Float bar;

        for(int i = 0; i < SIZE; i++ ) {
            // final float hue = random.nextFloat();
            // final float saturation = 0.9f; //1.0 for brilliant, 0.0 for dull
            // final float luminance = 1.0f; //1.0 for brighter, 0.0 for black

            // g2d.setColor(Color.getHSBColor(hue, saturation, luminance));
            bar = new Rectangle2D.Float(i * BAR_WIDTH, 0, BAR_WIDTH-1, bar_height[i]);
            g2d.fill(bar); // g2d.draw(bar);
        }

        // Color setter for the current object
        g2d.setColor(Color.RED);
        bar = new Rectangle2D.Float(current_index * BAR_WIDTH, 0, BAR_WIDTH, bar_height[current_index]);
        g2d.fill(bar);

        // Color setter for the traversing object
        g2d.setColor(Color.YELLOW);
        bar = new Rectangle2D.Float(traversing_index * BAR_WIDTH, 0, BAR_WIDTH, bar_height[traversing_index]);
        g2d.fill(bar);
    }

    public void insertionSort() {
        /*Insertion sort algorithm*/ 
        sorter = new SwingWorker<>() {
            @Override
            public Void doInBackground() throws InterruptedException {
                for(current_index = 1; current_index < SIZE; current_index++) {
                    traversing_index = current_index;
                    while(traversing_index > 0 && bar_height[traversing_index] < bar_height[traversing_index - 1]) {
                        swap(traversing_index, traversing_index - 1);
                        traversing_index--;
                        
                        Thread.sleep(10);
                        repaint();
                    }
                }
                current_index = 0;
                traversing_index = 0;

                return null;
            }
        };
    }

    public void bubbleSort() {
        /*Bubble sorting algorithm*/
        sorter = new SwingWorker<>() {
            @Override
            public Void doInBackground() throws InterruptedException {
                for(current_index = 0; current_index < SIZE; current_index++) {
                    for(traversing_index = 1; traversing_index < (SIZE - current_index); traversing_index++) {
                        if(bar_height[traversing_index - 1] > bar_height[traversing_index]) {
                            swap(traversing_index, traversing_index - 1);
                            traversing_index--; // just for annimation

                            Thread.sleep(1); // controls the speed
                            repaint(); // we need it because we ofter replace the contents of a JPanel
                        }
                    }   
                }
                current_index = 0;
                traversing_index = 0;

                return null;
            }
        };
    }

    public void mergeSort() {
        /*Merge sorting algorithm*/
        // Change code from bubbleSort to mergeSort
        // TODO

        sorter = new SwingWorker<>() {
            @Override
            public Void doInBackground() throws InterruptedException {
                for(current_index = 0; current_index < SIZE; current_index++) {
                    for(traversing_index = 1; traversing_index < (SIZE - current_index); traversing_index++) {
                        if(bar_height[traversing_index - 1] > bar_height[traversing_index]) {
                            swap(traversing_index, traversing_index - 1);
                            traversing_index--; // just for annimation

                            Thread.sleep(1); // controls the speed
                            repaint(); // we need it because we ofter replace the contents of a JPanel
                        }
                    }   
                }
                current_index = 0;
                traversing_index = 0;

                return null;
            }
        };
    }

    
    public void selectionSort() {
        /*Merge sorting algorithm*/
        // Change code from bubbleSort to mergeSort
        // TODO

        sorter = new SwingWorker<>() {
            @Override
            public Void doInBackground() throws InterruptedException {
                for(current_index = 0; current_index < SIZE-1; current_index++) {
                    int min_index = current_index;
                    for(int traversing_index = current_index + 1; traversing_index < SIZE0; traversing_index++) {
                        if (bar_height[traversing_index] < bar_height[min_index]) {
                            min_index = traversing_index;
                        }
                    }

                    swap(current_index, min_index);
                    Thread.sleep(1); // controls the speed
                    repaint(); // we need it because we ofter replace the contents of a JPanel
                
                } 
 
                current_index = 0;
                traversing_index = 0;

                return null;
            }
        };
    }

    public void initShuffler() {
        /*Shuffles each bar*/
        shuffler = new SwingWorker<>() {
            @Override
            public Void doInBackground() throws InterruptedException {
                int middle = SIZE / 2;
                for (int i = 0, j = middle; i < middle; i++, j++) {
                    int randow_index = new Random().nextInt(SIZE);
                    swap(i, randow_index);

                    randow_index = new Random().nextInt(SIZE);
                    swap(j, randow_index);

                    Thread.sleep(10);
                    repaint();
                }
                return null;
            }
            @Override
			public void done() {
				super.done();
				sorter.execute();
			}
        };
        shuffler.execute();
    }
    
    public void initBarHeight() {
        /*Initialize the height of each bar*/
        float interval = (float)HEIGHT / SIZE;
        for(int i = 0; i < SIZE; i++) {
            bar_height[i] = i * interval;
        }
    }

    public void swap(int indexA, int indexB) {
        /*Swaps the elements*/
        float temp = bar_height[indexA];
        bar_height[indexA] = bar_height[indexB];
        bar_height[indexB] = temp;
    }
}
