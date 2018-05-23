import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame {

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
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNuovo = new JButton("Nuovo");
		btnNuovo.setBounds(10, 28, 89, 23);
		contentPane.add(btnNuovo);
		
		JButton btnVisualizza = new JButton("Visualizza");
		btnVisualizza.setBounds(10, 75, 89, 23);
		contentPane.add(btnVisualizza);
		
		JButton btnCancella = new JButton("Cancella");
		btnCancella.setBounds(10, 124, 89, 23);
		contentPane.add(btnCancella);
		
		JButton btnAiuto = new JButton("Aiuto");
		btnAiuto.setBounds(10, 178, 89, 23);
		contentPane.add(btnAiuto);
		
		JLabel lblProgettiAttivi = new JLabel("Progetti Attivi");
		lblProgettiAttivi.setBounds(138, 32, 89, 14);
		contentPane.add(lblProgettiAttivi);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(141, 57, 269, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProgettiScaduti = new JLabel("Progetti Scaduti");
		lblProgettiScaduti.setBounds(138, 96, 89, 14);
		contentPane.add(lblProgettiScaduti);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(138, 125, 272, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
