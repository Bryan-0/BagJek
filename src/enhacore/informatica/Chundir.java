package enhacore.informatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Chundir extends JFrame {
	//
	public JPanel contentPane;
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Chundir() throws IOException {
		getClass().getResourceAsStream("chundir.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Te voy a chundir esa Kbeza :v");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(404, 313, 193, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblApareceriaUnaImagen = new JLabel("Apareceria una imagen de un puño pero se bugeo y no la pude agregar :'v");
		lblApareceriaUnaImagen.setFont(new Font("Tw Cen MT", Font.BOLD, 17));
		lblApareceriaUnaImagen.setBounds(43, 145, 545, 14);
		contentPane.add(lblApareceriaUnaImagen);
		//C:\\Users\\dell\\Desktop\\Bryan\\Object Oriented\\Diccionario\\src\\enhacore\\informatica\\chundir.jpg
		/*String path = "C:\\Users\\dell\\Desktop\\Bryan\\Object Oriented\\Diccionario\\src\\enhacore\\informatica\\chundir.jpg";
        File file = new File(path);
        BufferedImage image = ImageIO.read(file);
        JLabel label_1 = new JLabel(new ImageIcon(image));
		label_1.setBounds(0, 0, 635, 360);
		contentPane.add(label_1);
		*/
	}
}
