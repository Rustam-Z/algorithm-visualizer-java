// Java program Program to add a menubar 
// and add menuitems, submenu items and also add 
// ActionListener to menu items 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class menu1 extends JFrame implements ActionListener { 
	// menubar 
	static JMenuBar mb; 

	// JMenu 
	static JMenu x, x1; 

	// Menu items 
	static JMenuItem m1, m2, m3, s1, s2; 

	// create a frame 
	static JFrame f; 

	// a label 
	static JLabel l; 

	// main class 
    public static void main(String[] args){
        
		// create an object of the class 
		menu1 m = new menu1(); 

		// create a frame 
		f = new JFrame("Menu demo"); 

		// create a label 
		l = new JLabel("no task "); 

		// create a menubar 
		mb = new JMenuBar(); 

		// create a menu 
		x = new JMenu("Menu"); 
		x1 = new JMenu("submenu"); 

		// create menuitems 
		m1 = new JMenuItem("MenuItem1"); 
		m2 = new JMenuItem("MenuItem2"); 
		m3 = new JMenuItem("MenuItem3"); 
		s1 = new JMenuItem("SubMenuItem1"); 
		s2 = new JMenuItem("SubMenuItem2"); 

		// add ActionListener to menuItems 
		m1.addActionListener(m); 
		m2.addActionListener(m); 
		m3.addActionListener(m); 
		s1.addActionListener(m); 
		s2.addActionListener(m); 

		// add menu items to menu 
		x.add(m1); 
		x.add(m2); 
		x.add(m3); 
		x1.add(s1); 
		x1.add(s2); 

		// add submenu 
		x.add(x1); 

		// add menu to menu bar 
		mb.add(x); 

		// add menubar to frame 
		f.setJMenuBar(mb); 

		// add label 
		f.add(l); 

		// set the size of the frame 
		f.setSize(500, 500); 
		f.setVisible(true); 
	} 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 

		// set the label to the menuItem that is selected 
		l.setText(s + " selected"); 
	} 
} 
