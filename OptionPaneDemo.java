import javax.swing.JOptionPane; 

 /** 4 This program demonstrates the use of option panes for 5 input and output. 6 */ 
 
  public class OptionPaneDemo 
  
   {
    public static void main(String[] args) 
    { 
    String input = JOptionPane.showInputDialog("Enter price:"); 
     double price = Double.parseDouble(input); 
      final double TAX_RATE = 8.5; 
       price = price * (1 + TAX_RATE / 100); 
        JOptionPane.showMessageDialog(null, "Price after tax: " + price); 
         } 
          }