import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField txtCerca;

	/**
	 * Launch the application.
	 */


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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.temp=Main.L;
				while(Main.temp!=null) {
					
					if(Main.temp.getName().compareTo(txtCerca.getText())==0) {
						System.out.println(txtCerca.getText());
						Info l=new Info(Main.temp.getName(),Main.temp.getInfo(),Main.temp.getScadenza());
						l.setVisible(true);
						l.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
					Main.temp=Main.temp.next;
				}
			}
		});
		btnNewButton.setBounds(362, 16, 27, 23);
		contentPane.add(btnNewButton);
	}

}
