package wigglecontroller;

import javax.swing.JFrame;

public class Window
{
    private final JFrame frame;

    public Window()
    {
        frame = new JFrame("Wiggle Controller");

        frame.setSize(300, 300);
        // frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var drag = new DragArea();
        drag.setBounds(10, 30, 200, 200);
        drag.applyBounds();
        
        frame.add(drag);
    }

    public void show()
    {
        frame.setVisible(true);
    }
}
