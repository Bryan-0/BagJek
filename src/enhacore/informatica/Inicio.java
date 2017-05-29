package enhacore.informatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;

public class Inicio extends JFrame {

	public static JPanel contentPane;
	public static JTextField wordDef;
	public JLabel lblBagjek;
	private JComboBox comboBox;

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Inicio() throws IOException {
		setTitle("Diccionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		wordDef = new JTextField();
		wordDef.setBounds(164, 187, 212, 20);
		contentPane.add(wordDef);
		wordDef.setColumns(10);
		
		final DicWords wordCheck = new DicWords();
		final NotFound notfound = new NotFound();
		
		// A Words
		final Anthropology check = new Anthropology();
		final Application check2 = new Application();
		final Active check3 = new Active();
		final Algorithm check4 = new Algorithm();
		final Apple check5 = new Apple();
		
		// B Words
		final Backup check6 = new Backup();
		final Binary check7 = new Binary();
		final Bite check8 = new Bite();
		final Block check9 = new Block();
		final Browser check10 = new Browser();
		
		// C Words
		final Cloud check11 = new Cloud();
		final Computer check12 = new Computer();
		final Compile check13 = new Compile();
		final Configure check14 = new Configure();
		final Client check15 = new Client();
		
		// D Words
		final Data check16 = new Data();
		final Digital check17 = new Digital();
		final Delete check18 = new Delete();
		final Desktop check19 = new Desktop();
		final Disk check20 = new Disk();
		
		// E Words
		final Email check21 = new Email();
		final Encrypt check22 = new Encrypt();
		final Enter check23 = new Enter();
		final Exabyte check24 = new Exabyte();
		final Encryption check25 = new Encryption();
		
		// F Words
		final File check26 = new File();
		final Finder check27 = new Finder();
		final Firewall check28 = new Firewall();
		final Flash check29 = new Flash();
		final Format check30 = new Format();
		
		// G Words
		final Gigabyte check31 = new Gigabyte();
		final Graphics check32 = new Graphics();
		
		// H Words
		final Hack check33 = new Hack();
		final Hacker check34 = new Hacker();
		final Host check35 = new Host();
		final Hyperlink check36 = new Hyperlink();
		final Hypertext check37 = new Hypertext();
		
		// I Words
		final Icon check38 = new Icon();
		final Inbox check39 = new Inbox();
		final Interface check40 = new Interface();
		final Internet check41 = new Internet();
		final Iteration check42 = new Iteration();
		
		// J Words
		final Joystick check43 = new Joystick();
		final Junkmail check44 = new Junkmail();
		
		// K Words
		final Kernel check45 = new Kernel();
		final Key check46 = new Key();
		final Keyboard check47 = new Keyboard();
		final Keyword check48 = new Keyword();
		
		// L Words
		final Laptop check49 = new Laptop();
		final Laser check50 = new Laser();
		final Link check51 = new Link();
		final Login check52 = new Login();
		final Logic check53 = new Logic();
		
		// M Words
		final Mainframe check54 = new Mainframe();
		final Markup check55 = new Markup();
		final Media check56 = new Media();
		final Memory check57 = new Memory();
		final Monitor check58 = new Monitor();
		
		// N Words
		final Net check59 = new Net();
		final Network check60 = new Network();
		final Notebook check61 = new Notebook();
		
		// O Words
		final Offline check62 = new Offline();
		final Online check63 = new Online();
		final Operating check64 = new Operating();
		final Option check65 = new Option();
		final Output check66 = new Output();
		
		// P Words
		final Page check67 = new Page();
		final Password check68 = new Password();
		final Paste check69 = new Paste();
		final Path check70 = new Path();
		final Pirate check71 = new Pirate();
		
		// Q Words
		final Queue check72 = new Queue();
		
		// R Words
		final Reboot check73 = new Reboot();
		final Resolution check74 = new Resolution();
		final Restore check75 = new Restore();
		final Root check76 = new Root();
		final Router check77 = new Router();
		
		// S Words
		final Save check78 = new Save();
		final Scan check79 = new Scan();
		final Screen check80 = new Screen();
		final Script check81 = new Script();
		final Scroll check82 = new Scroll();
		
		// T Words
		final Table check83 = new Table();
		final Tag check84 = new Tag();
		final Template check85 = new Template();
		final Terabyte check86 = new Terabyte();
		final Terminal check87 = new Terminal();
		
		// U Words
		final Undo check88 = new Undo();
		final Unique check89 = new Unique();
		final Upload check90 = new Upload();
		final User check91 = new User();
		final Username check92 = new Username();
		
		// V Words
		final Version check93 = new Version();
		final Virtual check94 = new Virtual();
		final Virus check95 = new Virus();
		
		// W Words
		final Web check96 = new Web();
		final Webhost check97 = new Webhost();
		final Webmaster check98 = new Webmaster();
		final Website check99 = new Website();
		final Window check100 = new Window();
		
		// X Words
		final XML check101 = new XML();
		// Z Words
		final ZIP check102 = new ZIP();
		
		//Important
		final Informacion checkinformacion = new Informacion();
		
		// Easter Eggs Words
		final Chundir check105 = new Chundir();
				
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(wordCheck.checkWord() == 1) {
					check.setVisible(true);
				} else if (wordCheck.checkWord() == 2) {
					check2.setVisible(true);
				} else if (wordCheck.checkWord() == 3) {
					check3.setVisible(true);
				} else if (wordCheck.checkWord() == 4) {
					check4.setVisible(true);
				} else if (wordCheck.checkWord() == 5) {
					check5.setVisible(true);
				}  else if (wordCheck.checkWord() == 6) {
					check6.setVisible(true);
				}  else if (wordCheck.checkWord() == 7) {
					check7.setVisible(true);
				}  else if (wordCheck.checkWord() == 8) {
					check8.setVisible(true);
				}  else if (wordCheck.checkWord() == 9) {
					check9.setVisible(true);
				}  else if (wordCheck.checkWord() == 10) {
					check10.setVisible(true);
				} else if (wordCheck.checkWord() == 11) {
					check11.setVisible(true);
				} else if (wordCheck.checkWord() == 12) {
					check12.setVisible(true);
				} else if (wordCheck.checkWord() == 13) {
					check13.setVisible(true);
				} else if (wordCheck.checkWord() == 14) {
					check14.setVisible(true);
				} else if (wordCheck.checkWord() == 15) {
					check15.setVisible(true);
				} else if (wordCheck.checkWord() == 16) {
					check16.setVisible(true);
				} else if (wordCheck.checkWord() == 17) {
					check17.setVisible(true);
				} else if (wordCheck.checkWord() == 18) {
					check18.setVisible(true);
				} else if (wordCheck.checkWord() == 19) {
					check19.setVisible(true);
				} else if (wordCheck.checkWord() == 20) {
					check20.setVisible(true);
				} else if (wordCheck.checkWord() == 21) {
					check21.setVisible(true);
				} else if (wordCheck.checkWord() == 22) {
					check22.setVisible(true);
				} else if (wordCheck.checkWord() == 23) {
					check23.setVisible(true);
				} else if (wordCheck.checkWord() == 24) {
					check24.setVisible(true);
				} else if (wordCheck.checkWord() == 25) {
					check25.setVisible(true);
				} else if (wordCheck.checkWord() == 26) {
					check26.setVisible(true);
				} else if (wordCheck.checkWord() == 27) {
					check27.setVisible(true);
				} else if (wordCheck.checkWord() == 28) {
					check28.setVisible(true);
				} else if (wordCheck.checkWord() == 29) {
					check29.setVisible(true);
				} else if (wordCheck.checkWord() == 30) {
					check30.setVisible(true);
				} else if (wordCheck.checkWord() == 31) {
					check31.setVisible(true);
				} else if (wordCheck.checkWord() == 32) {
					check32.setVisible(true);
				} else if (wordCheck.checkWord() == 33) {
					check33.setVisible(true);
				} else if (wordCheck.checkWord() == 34) {
					check34.setVisible(true);
				} else if (wordCheck.checkWord() == 35) {
					check35.setVisible(true);
				} else if (wordCheck.checkWord() == 36) {
					check36.setVisible(true);
				} else if (wordCheck.checkWord() == 37) {
					check37.setVisible(true);
				} else if (wordCheck.checkWord() == 38) {
					check38.setVisible(true);
				} else if (wordCheck.checkWord() == 39) {
					check39.setVisible(true);
				} else if (wordCheck.checkWord() == 40) {
					check40.setVisible(true);
				} else if (wordCheck.checkWord() == 41) {
					check41.setVisible(true);
				} else if (wordCheck.checkWord() == 42) {
					check42.setVisible(true);
				} else if (wordCheck.checkWord() == 43) {
					check43.setVisible(true);
				} else if (wordCheck.checkWord() == 44) {
					check44.setVisible(true);
				} else if (wordCheck.checkWord() == 45) {
					check45.setVisible(true);
				} else if (wordCheck.checkWord() == 46) {
					check46.setVisible(true);
				} else if (wordCheck.checkWord() == 47) {
					check47.setVisible(true);
				} else if (wordCheck.checkWord() == 48) {
					check48.setVisible(true);
				} else if (wordCheck.checkWord() == 49) {
					check49.setVisible(true);
				} else if (wordCheck.checkWord() == 50) {
					check50.setVisible(true);
				} else if (wordCheck.checkWord() == 51) {
					check51.setVisible(true);
				} else if (wordCheck.checkWord() == 52) {
					check52.setVisible(true);
				} else if (wordCheck.checkWord() == 53) {
					check53.setVisible(true);
				} else if (wordCheck.checkWord() == 54) {
					check54.setVisible(true);
				} else if (wordCheck.checkWord() == 55) {
					check55.setVisible(true);
				} else if (wordCheck.checkWord() == 56) {
					check56.setVisible(true);
				} else if (wordCheck.checkWord() == 57) {
					check57.setVisible(true);
				} else if (wordCheck.checkWord() == 58) {
					check58.setVisible(true);
				} else if (wordCheck.checkWord() == 59) {
					check59.setVisible(true);
				} else if (wordCheck.checkWord() == 60) {
					check60.setVisible(true);
				} else if (wordCheck.checkWord() == 61) {
					check61.setVisible(true);
				} else if (wordCheck.checkWord() == 62) {
					check62.setVisible(true);
				} else if (wordCheck.checkWord() == 63) {
					check63.setVisible(true);
				} else if (wordCheck.checkWord() == 64) {
					check64.setVisible(true);
				} else if (wordCheck.checkWord() == 65) {
					check65.setVisible(true);
				} else if (wordCheck.checkWord() == 66) {
					check66.setVisible(true);
				} else if (wordCheck.checkWord() == 67) {
					check67.setVisible(true);
				} else if (wordCheck.checkWord() == 68) {
					check68.setVisible(true);
				} else if (wordCheck.checkWord() == 69) {
					check69.setVisible(true);
				} else if (wordCheck.checkWord() == 70) {
					check70.setVisible(true);
				} else if (wordCheck.checkWord() == 71) {
					check71.setVisible(true);
				} else if (wordCheck.checkWord() == 72) {
					check72.setVisible(true);
				} else if (wordCheck.checkWord() == 73) {
					check73.setVisible(true);
				} else if (wordCheck.checkWord() == 74) {
					check74.setVisible(true);
				} else if (wordCheck.checkWord() == 75) {
					check75.setVisible(true);
				} else if (wordCheck.checkWord() == 76) {
					check76.setVisible(true);
				} else if (wordCheck.checkWord() == 77) {
					check77.setVisible(true);
				} else if (wordCheck.checkWord() == 78) {
					check78.setVisible(true);
				} else if (wordCheck.checkWord() == 79) {
					check79.setVisible(true);
				} else if (wordCheck.checkWord() == 80) {
					check80.setVisible(true);
				} else if (wordCheck.checkWord() == 81) {
					check81.setVisible(true);
				} else if (wordCheck.checkWord() == 82) {
					check82.setVisible(true);
				} else if (wordCheck.checkWord() == 83) {
					check83.setVisible(true);
				} else if (wordCheck.checkWord() == 84) {
					check84.setVisible(true);
				} else if (wordCheck.checkWord() == 85) {
					check85.setVisible(true);
				} else if (wordCheck.checkWord() == 86) {
					check86.setVisible(true);
				} else if (wordCheck.checkWord() == 87) {
					check87.setVisible(true);
				} else if (wordCheck.checkWord() == 88) {
					check88.setVisible(true);
				} else if (wordCheck.checkWord() == 89) {
					check89.setVisible(true);
				} else if (wordCheck.checkWord() == 90) {
					check90.setVisible(true);
				} else if (wordCheck.checkWord() == 91) {
					check91.setVisible(true);
				} else if (wordCheck.checkWord() == 92) {
					check92.setVisible(true);
				} else if (wordCheck.checkWord() == 93) {
					check93.setVisible(true);
				} else if (wordCheck.checkWord() == 94) {
					check94.setVisible(true);
				} else if (wordCheck.checkWord() == 95) {
					check95.setVisible(true);
				} else if (wordCheck.checkWord() == 96) {
					check96.setVisible(true);
				} else if (wordCheck.checkWord() == 97) {
					check97.setVisible(true);
				} else if (wordCheck.checkWord() == 98) {
					check98.setVisible(true);
				} else if (wordCheck.checkWord() == 99) {
					check99.setVisible(true);
				} else if (wordCheck.checkWord() == 100) {
					check100.setVisible(true);
				} else if (wordCheck.checkWord() == 101) {
					check101.setVisible(true);
				} else if (wordCheck.checkWord() == 102) {
					check102.setVisible(true);
				} 
				
				// Easter Eggs
				else if (wordCheck.checkWord() == 103) {
					System.exit(0);
				} else if (wordCheck.checkWord() == 104) {
					check25.setVisible(true);
				} else if (wordCheck.checkWord() == 105) {
					check105.setVisible(true);
				} else if (wordCheck.checkWord() == 106) {
					check25.setVisible(true);
				} else if (wordCheck.checkWord() == 107) {
					check25.setVisible(true);
				} else if (wordCheck.checkWord() == 4252017) {
					check25.setVisible(true);
				}
				//Easter Eggs
				
				else if (wordCheck.checkWord() == 108) {
					check25.setVisible(true);
				} //no space
				
				
				// Not found
				else {
					notfound.setVisible(true);
				}
			}
		});
		btn_buscar.setBounds(236, 233, 89, 23);
		contentPane.add(btn_buscar);
		
		lblBagjek = new JLabel("BAGJEK");
		lblBagjek.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 26));
		lblBagjek.setBounds(218, 111, 110, 51);
		contentPane.add(lblBagjek);
		
		JButton btnEquipo = new JButton("Información");
		btnEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkinformacion.setVisible(true);
			}
		});
		btnEquipo.setBounds(10, 327, 110, 23);
		contentPane.add(btnEquipo);
		
		String DicWords[] = {"Buscar Palabra", "Active", "Algorithm"};
		comboBox = new JComboBox(DicWords);
		comboBox.setBounds(386, 187, 118, 20);
		contentPane.add(comboBox);
	}
}
