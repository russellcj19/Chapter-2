import javax.swing.*;

public class FixDebugTwo4
{
    public static void main(String[] args)
    {
        int costing = 0;
        double cost;
        final double TAX = 0.06;
        String coststring = JOptionPane.showInputDialog(null,
                "Enter price of item you are buying", "Purchases",
                JOptionPane.INFORMATION_MESSAGE);
        cost = Double.parseDouble(String.valueOf(costing));
        JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
                "% tax,  purchase  is $" + (cost + cost * TAX));
    }
}