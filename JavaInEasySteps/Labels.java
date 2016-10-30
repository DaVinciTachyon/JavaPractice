import javax.swing.*;
class Labels extends JFrame
{
  JPanel pnl = new JPanel();
  ClassLoader ldr = this.getClass().getClassLoader();
  ImageIcon duke = new ImageIcon(ldr.getResource("duke.png"));
  JLabel lbl1 = new JLabel(duke);
  JLabel lbl2 = new JLabel("Duke is the friendly mascot of Java Technlogy.");
  JLabel lbl3 = new JLabel("Duke", duke, JLabel.CENTER);


  public Labels()
  {
    super("Duke - the Java Mascot");
    setSize(1000, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    lbl1.setToolTipText("Duke - the Java Mascot");
    lbl3.setHorizontalTextPosition(JLabel.CENTER);
    lbl3.setVerticalTextPosition(JLabel.BOTTOM);
    pnl.add(lbl1);
    pnl.add(lbl2);
    pnl.add(lbl3);
    setVisible(true);
  }


  public static void main(String[] args)
  {
    Labels gui = new Labels();
  }
}
