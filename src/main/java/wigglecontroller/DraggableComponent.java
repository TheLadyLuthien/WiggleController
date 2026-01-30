package wigglecontroller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class DraggableComponent extends JComponent
{
    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;

    private int minX = 0;
    private int maxX = 0;

    private int minY = 0;
    public int getMinY()
    {
        return minY;
    }

    public void setMinY(int minY)
    {
        this.minY = minY;
    }

    private int maxY = 0;

    public int getMaxY()
    {
        return maxY;
    }

    public void setMaxY(int maxY)
    {
        this.maxY = maxY;
    }

    public int getMinX()
    {
        return minX;
    }

    public void setMinX(int minX)
    {
        this.minX = minX;
    }

    public int getMaxX()
    {
        return maxX;
    }
    public void setMaxX(int maxX)
    {
        this.maxX = maxX;
    }

    public DraggableComponent()
    {
        setBorder(new LineBorder(Color.BLUE, 5));
        setBackground(Color.DARK_GRAY);
        setBounds(0, 0, 30, 30);
        // setOpaque(false);

        addMouseListener(new MouseListener()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {}

            @Override
            public void mousePressed(MouseEvent e)
            {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {}

            @Override
            public void mouseEntered(MouseEvent e)
            {}

            @Override
            public void mouseExited(MouseEvent e)
            {}

        });
        addMouseMotionListener(new MouseMotionListener()
        {

            @Override
            public void mouseDragged(MouseEvent e)
            {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                int newX = Math.clamp(myX + deltaX, minX, maxX);
                int newY = Math.clamp(myY + deltaY, minY, maxY);

                setLocation(newX, newY);
            }

            @Override
            public void mouseMoved(MouseEvent e)
            {}

        });
    }

}

