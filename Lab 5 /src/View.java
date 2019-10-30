import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	JPanel panel;
	JFrame jframewindow;
	JButton addButton;
	JTextField textField1, textField2, textFieldresult;
	JLabel first, second, result;

	public View(Model model) {
		jframewindow = new JFrame("Add");
		jframewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(4,0));
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		addButton = new JButton("=");
		textFieldresult = new JTextField(13);
		
		panel.add(textField1);
		panel.add(textField2);
		panel.add(addButton);
		panel.add(textFieldresult);
		setVisible(true);
		
		jframewindow.add(panel);
		jframewindow.pack();
		jframewindow.setVisible(true);
	}
}
