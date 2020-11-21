public class Algorithm_Visualizer {
    public static void main(String[] args){
        Window W = new Window();
    }
}

class Window extends JFrame {//inheriting JFrame
    JFrame f;

    Window() {
        JButton b = new JButton("click");//create button
        b.setBounds(130, 100, 100, 40);

        add(b);//adding button on frame
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
}
