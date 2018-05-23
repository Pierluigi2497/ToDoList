import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class New extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New frame = new New();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuovoProgetto = new JLabel("Nuovo Progetto");
		lblNuovoProgetto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNuovoProgetto.setBounds(10, 11, 138, 23);
		contentPane.add(lblNuovoProgetto);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 74, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(83, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblScadenza = new JLabel("Scadenza");
		lblScadenza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblScadenza.setBounds(10, 124, 63, 14);
		contentPane.add(lblScadenza);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 123, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescrizione.setBounds(10, 171, 75, 14);
		contentPane.add(lblDescrizione);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(95, 168, 256, 83);
		contentPane.add(textArea);
		
		JButton btnSalva = new JButton("Salva");
		btnSalva.setBounds(361, 228, 63, 23);
		contentPane.add(btnSalva);
	}
}
