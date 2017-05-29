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

public class Keyword extends JFrame {

	public JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Keyword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(275, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblAnthropology = new JLabel("Keyword:");
		lblAnthropology.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnthropology.setBounds(137, 30, 84, 30);
		contentPane.add(lblAnthropology);
		
		JLabel lblAntropologa = new JLabel("Palabra Clave");
		lblAntropologa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAntropologa.setBounds(130, 94, 103, 23);
		contentPane.add(lblAntropologa);
	}
}
