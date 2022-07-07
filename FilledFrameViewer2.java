

//This program also uses ananymous object as action listener

//Practice this in JGRASP

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FilledFrameViewer2
{
public static void main(String[] args)
{
JFrame frame = new FilledFrame();
frame.setTitle("A frame with two components");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
public static class FilledFrame extends JFrame
{
private JButton button;
private JLabel label;
JTextField input;
private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 100;

public FilledFrame() {
createComponents();
setSize(FRAME_WIDTH, FRAME_HEIGHT);
}
private void createComponents() {
button = new JButton("Click me!");

button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
label.setText("You Clicked Me!");
input.setText(input.getText().toUpperCase());
}
});

label = new JLabel("Hello, World!");
input = new JTextField("type input data");
JPanel panel = new JPanel();
panel.add(button);
panel.add(label);
panel.add(input);
add(panel);
}
}//innerclass
}//outerclass
