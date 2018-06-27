import javax.swing.JOptionPane;
public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday (mm/dd)");
		
		if (birthday.equals("06/27")) {
			JOptionPane.showMessageDialog(null, "Happy birthday");
		
		}
		else JOptionPane.showMessageDialog(null, "Unbirthday");
	}
}
