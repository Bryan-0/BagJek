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

public class Binary extends JFrame {

	public JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Binary() {
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
		
		JLabel lblAnthropology = new JLabel("Binary:");
		lblAnthropology.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnthropology.setBounds(155, 24, 63, 30);
		contentPane.add(lblAnthropology);
		
		JLabel lblAntropologa = new JLabel("Binario");
		lblAntropologa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAntropologa.setBounds(155, 94, 56, 23);
		contentPane.add(lblAntropologa);
	}
}
