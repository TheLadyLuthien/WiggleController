package wigglecontroller;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.border.LineBorder;

// import java.awt.Container;

public class DragArea extends JComponent
{
    private final DraggableComponent drag;

    public DragArea()
    {
        drag = new DraggableComponent();

        this.setBorder(new LineBorder(Color.BLUE, 5));

        this.add(drag);
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
}
