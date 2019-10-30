import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class Controller implements ActionListener {
	Model model;
	View view;

	public Controller(View v, Model m) {
		model = m;
		view = v;
		actionListenerMethod(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			// retrieve the input from View
			String a = view.textField1.getText();
			String b = view.textField2.getText();

			// call add method
			int result = model.add(a, b);

			// display result in View(UI)
			view.textFieldresult.setText("" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actionListenerMethod(ActionListener ae) {
		view.addButton.addActionListener(ae);
	}

}
