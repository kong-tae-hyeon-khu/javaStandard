import java.awt.*;
import java.awt.event.*;



public class Exercise7_28 {
    public static void main(String args[])
    {
        // 익명 클래스. windowAdapter 를 상속한,
        WindowAdapter temp = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        };
        Frame f = new Frame();
        f.addWindowListener(temp);
    }
}
