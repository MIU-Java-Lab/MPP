import javax.swing.*;
import java.awt.*;

// JFrame -> Frame -> Window -> Container -> Component
public class Main extends JFrame {
    JLabel label;
    JTextField text;

    public Main() {
        init();

        // by default JPanel uses FlowLayout
        JPanel mainPanel = new JPanel();
        text = new JTextField(10);
        label = new JLabel("My text");
        JButton btn = new JButton("My button");

        mainPanel.add(text);
        mainPanel.add(label);
        mainPanel.add(btn);

        getContentPane().add(mainPanel);

        // JVM can figure out how to space everything after pack is called
        // it will define size according to content you have
        // pack();
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        setSize(500, 300);
        setResizable(false); // true by default

        centerFrameOnDesktop(this);
    }

    // having Component we can access all others
    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        int screenWidth = toolkit.getScreenSize().width;
        int screenHeight = toolkit.getScreenSize().height;

        int frameWidth = f.getSize().width;
        int frameHeight = f.getSize().height;

        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 3;

        f.setLocation(x, y);
    }

    public static void main(String[] args) {
        // EventQueue is like event loop in JS
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main myFrame = new Main();
                myFrame.setVisible(true);
            }
        });
    }
}