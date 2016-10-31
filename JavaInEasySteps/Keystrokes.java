import java.awt.event.*;
import javax.swing.*;


public class Keystrokes extends JFrame implements KeyListener
{
    JPanel pnl = new JPanel();
    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5, 38);

    public Keystrokes()
    {
        super("States");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        pnl.add(field);
        pnl.add(txtArea);
        field.addKeyListener(this);

        setVisible(true);
    }

    public void keyPressed(KeyEvent event)
    {
        txtArea.setText("Key Pressed\n");
    }

    public void keyTyped(KeyEvent event)
    {
        txtArea.append("Character: " + event.getKeyChar());
    }

    public void keyReleased(KeyEvent event)
    {
        int keyCode = event.getKeyCode();
        txtArea.append("\nKey Code: " + event.getKeyCode());
        txtArea.append("\nKey Text: " + event.getKeyText(keyCode));
    }

    public static void main(String[] args)
    {
        Keystrokes gui = new Keystrokes();
    }
}
