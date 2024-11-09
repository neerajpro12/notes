import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="SimpleKey1.class" width=300 height=100>
</applet>
*/
public class SimpleKey1 extends Applet implements KeyListener
{
String msg = "";
int X = 10, Y = 20; // output coordinates

public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("Key Down");
 int key = k.getKeyCode();
 
        switch(key)
        {
            case KeyEvent.VK_F1:
                msg = msg + "F1";
                break;
            case KeyEvent.VK_F2:
                msg = msg + "F2";
                break;
            case KeyEvent.VK_F3:
                msg = msg + "F3";
                break;
            case KeyEvent.VK_F4:
                msg = msg + "F4 ";
                break;
            case KeyEvent.VK_RIGHT:
                msg = msg + "RIGHT ";
                break;
            case KeyEvent.VK_LEFT:
                msg = msg + "LEFT ";
                break;
            case KeyEvent.VK_UP:
                msg = msg + "UP ";
                break;
            case KeyEvent.VK_DOWN:
                msg = msg + "DOWN ";
                break;
 
        }
        repaint();
}
public void keyReleased(KeyEvent ke)
{
showStatus("Key Up");
}
public void keyTyped(KeyEvent ke)
{
msg += ke.getKeyChar();
repaint();
}
// Display keystrokes.
public void paint(Graphics g)
{
g.drawString(msg, X, Y);
}
}
