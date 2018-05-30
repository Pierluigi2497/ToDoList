import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Info extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Info(String a,String b,String c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeProgetto = new JLabel("Nome Progetto");
		lblNomeProgetto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNomeProgetto.setBounds(10, 39, 117, 14);
		contentPane.add(lblNomeProgetto);
		
		JLabel lblScadenza = new JLabel("Scadenza");
		lblScadenza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblScadenza.setBounds(10, 64, 101, 14);
		contentPane.add(lblScadenza);
		
		JLabel lblInfo = new JLabel("INFO");
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInfo.setBounds(10, 108, 46, 14);
		contentPane.add(lblInfo);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(150, 38, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.setText(a);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(150, 63, 174, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_1.setText(b);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 133, 414, 118);
		contentPane.add(textArea);
		
		textArea.setText(c);
	}
}
