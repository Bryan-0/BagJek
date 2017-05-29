package enhacore.informatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotFound extends JFrame {

	public JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public NotFound() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoSentimosSu = new JLabel("Lo sentimos, su palabra \r\nno ha sido encontrada.");
		lblLoSentimosSu.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLoSentimosSu.setBounds(10, 11, 360, 158);
		contentPane.add(lblLoSentimosSu);
		
		JButton btnOk = new JButton("Ok :'(");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setBounds(145, 156, 89, 23);
		contentPane.add(btnOk);
	}

}
