import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField txtCerca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVisualizza = new JLabel("Visualizza");
		lblVisualizza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVisualizza.setBounds(10, 11, 102, 25);
		contentPane.add(lblVisualizza);
		
		txtCerca = new JTextField();
		txtCerca.setToolTipText("Cerca");
		txtCerca.setBounds(277, 17, 86, 20);
		contentPane.add(txtCerca);
		txtCerca.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(362, 16, 27, 23);
		contentPane.add(btnNewButton);
	}

}
