import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) { 
		
		String code = JOptionPane.showInputDialog("what is the message");
		
		String message = JOptionPane.showInputDialog("What is the passcode");
		
		if (message.equals("beep boop")) {
			JOptionPane.showMessageDialog(null, code);
			
			
			
		}
		else JOptionPane.showMessageDialog(null, "intruder...");
	}
}
