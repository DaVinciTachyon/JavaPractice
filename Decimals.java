import java.math.BigDecimal;
class Decimals
{
  public static void main(String[] args)
  {
    BigDecimal  item = new BigDecimal(0.7);
    BigDecimal  rate = new BigDecimal(0.05);
    BigDecimal  tax = item.multiply(rate);
    BigDecimal  total = item.add(tax);
    java.text.NumberFormat cf = java.text.NumberFormat.getCurrencyInstance();

    System.out.println("\nItem:\t" + cf.format(item));
    System.out.println("\nTax:\t" + cf.format(tax));
    System.out.println("\nTotal:\t" + cf.format(total));
  }
}
