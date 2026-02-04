package wigglecontroller;

import java.awt.BorderLayout;
import java.awt.Button;

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
        // drag.setBounds(10, 30, 200, 200);
        // drag.applyBounds()
        // ;
        final var pane = frame.getContentPane();

        var one = new Button("foobar");
        // one.setSize(400, 0);
        var two = new Button("two");
        
        pane.add(one, BorderLayout.LINE_END);
        pane.add(two, BorderLayout.CENTER);
        // frame.add(drag);
    }

    public void show()
    {
        frame.setVisible(true);
    }
}
