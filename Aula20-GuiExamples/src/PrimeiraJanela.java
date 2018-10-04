import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PrimeiraJanela {
	public static void main(String[] args) {
            JFrame frame = new JFrame("Minha Primeira Janela");
    
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("Hello World!!");
            frame.add(label);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //JButton btn = new JButton("OK");
            //frame.add(btn, BorderLayout.SOUTH);
            //Testar os 4 layout
            JButton btn1 = new JButton("OK1");
            JButton btn2 = new JButton("OK2");
            JButton btn3 = new JButton("OK3");
            JButton btn4 = new JButton("OK4");
            JButton btn5 = new JButton("OK5");
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 2));
            panel.add(btn1);
            panel.add(btn2);
            panel.add(btn3);
            panel.add(btn4);
            panel.add(btn5);
            frame.add(panel);
	}
}
