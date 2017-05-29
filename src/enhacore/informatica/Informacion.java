package enhacore.informatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Informacion extends JFrame {

	public JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Informacion() {
		setTitle("Información");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBagjekDiccionario = new JLabel("BagJek Diccionario ");
		lblBagjekDiccionario.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 22));
		lblBagjekDiccionario.setBounds(191, 11, 185, 31);
		contentPane.add(lblBagjekDiccionario);
		
		JLabel label = new JLabel("El nombre de BagJek es por las iniciales de sus creadores.");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(26, 65, 355, 14);
		contentPane.add(label);
		
		JLabel lblVersion = new JLabel("Version 1.0");
		lblVersion.setBounds(249, 42, 67, 14);
		contentPane.add(lblVersion);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnInicio.setBounds(447, 327, 89, 23);
		contentPane.add(btnInicio);
		
		JLabel lblElDiccionarioActualmente = new JLabel("El diccionario actualmente soporta 105 palabras del alfabeto inform\u00E1tico");
		lblElDiccionarioActualmente.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblElDiccionarioActualmente.setBounds(26, 92, 457, 14);
		contentPane.add(lblElDiccionarioActualmente);
		
		JLabel lblCadaUnoCon = new JLabel("Cada uno con translado de ingl\u00E9s a espa\u00F1ol.");
		lblCadaUnoCon.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadaUnoCon.setBounds(26, 106, 290, 14);
		contentPane.add(lblCadaUnoCon);
		
		JLabel lblElProyectoDel = new JLabel("El proyecto del diccionario incio el 4 Mayo del año 2017.");
		lblElProyectoDel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblElProyectoDel.setBounds(26, 133, 350, 14);
		contentPane.add(lblElProyectoDel);
		
		JLabel lblElDiccionarioCuenta = new JLabel("El diccionario cuenta con palabras ocultas(Easter Eggs).");
		lblElDiccionarioCuenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblElDiccionarioCuenta.setBounds(26, 158, 457, 14);
		contentPane.add(lblElDiccionarioCuenta);
		
		JLabel lblEquipoDeTrabajo = new JLabel("Equipo de Trabajo:");
		lblEquipoDeTrabajo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEquipoDeTrabajo.setBounds(26, 182, 140, 14);
		contentPane.add(lblEquipoDeTrabajo);
		
		JLabel lblBryanAyala = new JLabel("Bryan Ayala");
		lblBryanAyala.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblBryanAyala.setBounds(56, 207, 86, 14);
		contentPane.add(lblBryanAyala);
		
		JLabel lblKeyciSuazo = new JLabel("Keyci Suazo");
		lblKeyciSuazo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblKeyciSuazo.setBounds(56, 232, 86, 14);
		contentPane.add(lblKeyciSuazo);
		
		JLabel lblJeremyGarca = new JLabel("Jeremy Garc\u00EDa");
		lblJeremyGarca.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblJeremyGarca.setBounds(56, 257, 86, 14);
		contentPane.add(lblJeremyGarca);
		
		JLabel lblAndreaSuazo = new JLabel("Andrea Suazo");
		lblAndreaSuazo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblAndreaSuazo.setBounds(56, 283, 86, 14);
		contentPane.add(lblAndreaSuazo);
		
		JLabel lblBrbaraReyes = new JLabel("B\u00E1rbara Reyes");
		lblBrbaraReyes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblBrbaraReyes.setBounds(152, 207, 89, 14);
		contentPane.add(lblBrbaraReyes);
		
		JLabel lblGnesisSuazo = new JLabel("G\u00E9nesis Suazo");
		lblGnesisSuazo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblGnesisSuazo.setBounds(152, 232, 89, 14);
		contentPane.add(lblGnesisSuazo);
		
		JLabel lblEleanyCartagena = new JLabel("Eleany Cartagena");
		lblEleanyCartagena.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblEleanyCartagena.setBounds(152, 257, 106, 14);
		contentPane.add(lblEleanyCartagena);
		
		JLabel label_1 = new JLabel("-");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBounds(10, 23, 11, 97);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("-");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_2.setBounds(10, 50, 11, 97);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_3.setBounds(10, 87, 11, 97);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_4.setBounds(10, 142, 11, 37);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("-");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_5.setBounds(10, 134, 11, 97);
		contentPane.add(label_5);
	}
}
