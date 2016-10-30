import javax.swing.*;
class Items extends JFrame
{
  JPanel pnl = new JPanel();

  String[] toppings = {"Pepperoni", "Mushrooms", "Ham", "Tomatoes"};
  String[] styles = {"Deep Dish", "Gourmet", "Thin & Crispy"};

  JCheckBox chk1 = new JCheckBox(toppings[0]);
  JCheckBox chk2 = new JCheckBox(toppings[1]);
  JCheckBox chk3 = new JCheckBox(toppings[2], true);
  JCheckBox chk4 = new JCheckBox(toppings[3]);
  //JComboBox box1 = new JComboBox(styles);
  JComboBox<String> box1 = new JComboBox<>(styles);
  //JList lst1 = new JList(toppings);
  JList<String> lst1 = new JList<>(toppings);

  public Items()
  {
    super("Items");
    setSize(150, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(pnl);
    pnl.add(chk1);
    pnl.add(chk2);
    pnl.add(chk3);
    pnl.add(chk4);
    pnl.add(box1);
    pnl.add(lst1);
    setVisible(true);
  }

  public static void main(String[] args)
  {
    Items gui = new Items();
  }
}
