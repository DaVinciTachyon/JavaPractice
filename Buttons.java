import javax.swing.*;
import java.io.*;
class Buttons extends JFrame
{
  JPanel pnl = new JPanel();
  ClassLoader ldr = this.getClass().getClassLoader();
  //Tick
  java.net.URL tickURL = ldr.getResource("tick.png");
  ImageIcon tick = new ImageIcon(tickURL);
  //Cross
  java.net.URL crossURL = ldr.getResource("cross.png");
  ImageIcon cross = new ImageIcon(crossURL);
  //Buttons
  JButton btn = new JButton("Click Me");
  JButton tickBtn = new JButton(tick);
  JButton crossBtn = new JButton("STOP", cross);
  public Buttons()
  {
    super("Buttons");
    setSize(500, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    pnl.add(btn);
    pnl.add(tickBtn);
    pnl.add(crossBtn);
    setVisible(true);
  }
  public static void main(String[] args)
  {
    Buttons gui = new Buttons();
  }
}
