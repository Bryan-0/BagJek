package enhacore.informatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Encrypt extends JFrame {

	public JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Encrypt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(138, 48, 46, 14);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(275, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblAnthropology = new JLabel("Encrypt:");
		lblAnthropology.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnthropology.setBounds(138, 32, 73, 30);
		contentPane.add(lblAnthropology);
		
		JLabel lblAntropologa = new JLabel("Encriptar");
		lblAntropologa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAntropologa.setBounds(144, 98, 63, 23);
		contentPane.add(lblAntropologa);
	}
}