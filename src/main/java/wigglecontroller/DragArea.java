package wigglecontroller;

import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JComponent;
import javax.swing.border.LineBorder;
// import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;

// import java.awt.Container;

public class DragArea extends JComponent
{
    private final DraggableComponent drag;

    public DragArea()
    {
        drag = new DraggableComponent();

        this.setBorder(new LineBorder(Color.BLUE, 5));

        this.add(drag);
        this.addComponentListener(new ResizeListener());
    }


    public void applyBounds()
    {
        var rect = this.getBounds();

        var dragBounds = drag.getBounds();

        drag.setMinX(0);
        drag.setMaxX(rect.width - dragBounds.width);
        drag.setMinY(0);
        drag.setMaxY(rect.height - dragBounds.height);
    }

    class ResizeListener implements ComponentListener
    {

        @Override
        public void componentResized(ComponentEvent e)
        {
            DragArea.this.applyBounds();
        }

        @Override
        public void componentMoved(ComponentEvent e)
        {
        }

        @Override
        public void componentShown(ComponentEvent e)
        {
        }

        @Override
        public void componentHidden(ComponentEvent e)
        {
        }
    }
}
