package GUI;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;


public class main extends JFrame {
	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(4, 4, 4, 4));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLMS = new JLabel("  Library Management System");
		lblLMS.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLMS.setBounds(177, 93, 308, 58);
		contentPane.add(lblLMS);

		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginAdminFrame admin = new LoginAdminFrame(); 
				admin.setVisible(true);
				
				
			}
		});
		btnAdmin.setBounds(207, 221, 219, 25);
		contentPane.add(btnAdmin);
		
		JButton btnLibrarian = new JButton("Librarian Login");
		btnLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginLibrarianFrame librarian = new LoginLibrarianFrame(); 
				librarian.setVisible(true);
			}
		});
		btnLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLibrarian.setBounds(206, 307, 221, 26);
		contentPane.add(btnLibrarian);
	}
