//**** Mouse_Exp2.java ****//
// Program we want to check events like Mouse click, mouse entered and mouse exited
import java.awt.*;
import java.awt.event.*;

public class Mouse_Exp2 extends Frame implements MouseListener {
Label l;
Mouse_Exp2() {
super("AWT Frame");
l = new Label();
l.setBounds(25, 60, 250, 30);
l.setAlignment(Label.CENTER);
this.add(l);
this.setSize(300, 300);
this.setLayout(null);
this.setVisible(true);
this.addMouseListener(this);

this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public static void main(String[] args) {
new Mouse_Exp2();
}
@Override
public void mouseClicked(MouseEvent e) {
l.setText("Mouse Clicked");
}
@Override
public void mousePressed(MouseEvent e) {
l.setText("Mouse pressed");
}
@Override
public void mouseReleased(MouseEvent e) {
l.setText("Mouse released");
}
@Override
public void mouseEntered(MouseEvent e) {
l.setText("Mouse Entered");
}

@Override
public void mouseExited(MouseEvent e) {
l.setText("Mouse Exited");
}
}




