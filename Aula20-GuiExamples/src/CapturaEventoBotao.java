import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao implements ActionListener {
	private JButton botao1;
	private JButton botao2;
        

	public void janela(){
            JFrame frame = new JFrame();
            botao1 = new JButton();
            botao1.addActionListener(this);
            
            botao2 = new JButton();
            botao2.addActionListener(this);
            
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(2, 2));
            panel.add(botao1);
            panel.add(botao2);
            frame.add(panel);

            //frame.add(botao1);
            //frame.add(botao2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            frame.setVisible(true);
            
            botao1.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                botao1.setText("Botão 1 foi clicado!");
                botao1.setFont(new Font("SansSerif", Font.BOLD, 20));
                }
            });
            
            botao2.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    botao2.setText("Botão 2 foi clicado!");
                    botao2.setFont(new Font("SansSerif", Font.BOLD, 20));
                }
            });
	}
        
	@Override
	public void actionPerformed(ActionEvent evento) {
            System.out.println(evento.getActionCommand().equals(botao1));
            
            //botao1.setText("Botão 1 foi clicado!");
            //botao1.setFont(new Font("SansSerif", Font.BOLD, 20));
        }
	public static void main(String[] args) {
		CapturaEventoBotao captura = new CapturaEventoBotao();
		captura.janela();
	}
}
