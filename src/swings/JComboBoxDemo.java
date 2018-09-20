
package swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo extends JApplet
implements ItemListener {
JLabel jl;
ImageIcon France, Germany, Italy, Japan;
public void init() {
    //setBackground(Color.cyan);

// Get content pane
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());
// Create a combo box and add it
// to the panel
JComboBox jc = new JComboBox();
jc.addItem("France");
jc.addItem("Germany");
jc.addItem("Italy");
jc.addItem("Japan");
jc.addItemListener(this);
contentPane.add(jc);
// Create label
jl = new JLabel(new ImageIcon("C:\\Users\\Sandeep\\Desktop\\Java\\France.gif"));
contentPane.add(jl);
}
public void itemStateChanged(ItemEvent ie) {
String s = (String)ie.getItem();
jl.setIcon(new ImageIcon("C:\\Users\\Sandeep\\Desktop\\Java\\"+s+".gif"));
}
}
