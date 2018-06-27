import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
		
		String riddle = JOptionPane.showInputDialog("What has a tail and head but no body");
		
		if (riddle.equals("a coin")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		}
		else JOptionPane.showMessageDialog(null, "wrong, its a coin");
	}
}
