import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
<applet code="HelloWorld.class" width=500 height=500>
</applet>
*/

public class HelloWorld extends Applet {
    @Override
    public void paint(Graphics g) {
        // Face outline
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);

        // Left eye
        g.setColor(Color.WHITE);
        g.fillOval(150, 130, 30, 30);
        g.setColor(Color.BLACK);
        g.fillOval(160, 140, 10, 10);

        // Right eye
        g.setColor(Color.WHITE);
        g.fillOval(220, 130, 30, 30);
        g.setColor(Color.BLACK);
        g.fillOval(230, 140, 10, 10);

        // Smile
        g.setColor(Color.RED);
        g.drawArc(200, 180, 20, 50, 0, -180);
    }
}