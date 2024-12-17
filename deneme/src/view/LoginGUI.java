package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import db.DatabaseConnection; 


@SuppressWarnings("unused")
public class LoginGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel w_pane;
	private JTextField fld_hastaTc;
	private JTextField fld_hastaSifre;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hastane Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 405);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(255, 255, 255));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel jLabel = new JLabel(new ImageIcon(getClass().getResource("turk-kizilay.png")));
		jLabel.setBounds(87, 0, 313, 59);
		w_pane.add(jLabel);
		
		JLabel wcLbl = new JLabel("Hastane Yönetim Sistemine Hoş Geldiniz");
		wcLbl.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		wcLbl.setBounds(33, 54, 413, 30);
		w_pane.add(wcLbl);
		
		JTabbedPane w_tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		w_tabbedPane.setBounds(10, 95, 473, 260);
		w_pane.add(w_tabbedPane);
		
		JPanel hastaGiris = new JPanel();
		w_tabbedPane.addTab("Hasta Girişi", null, hastaGiris, null);
		hastaGiris.setLayout(null);
		
		JLabel lblTcGirii = new JLabel("T.C. Numaranız : ");
		lblTcGirii.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblTcGirii.setBounds(26, 27, 141, 30);
		hastaGiris.add(lblTcGirii);
		
		JLabel lblifreniz = new JLabel("Şifreniz : ");
		lblifreniz.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblifreniz.setBounds(26, 68, 141, 30);
		hastaGiris.add(lblifreniz);
		
		fld_hastaTc = new JTextField();
		fld_hastaTc.setHorizontalAlignment(SwingConstants.CENTER);
		fld_hastaTc.setFont(new Font("Yu Gothic Light", Font.PLAIN, 17));
		fld_hastaTc.setBounds(177, 27, 248, 30);
		hastaGiris.add(fld_hastaTc);
		fld_hastaTc.setColumns(10);
		
		fld_hastaSifre = new JTextField();
		fld_hastaSifre.setHorizontalAlignment(SwingConstants.CENTER);
		fld_hastaSifre.setFont(new Font("Yu Gothic Light", Font.PLAIN, 17));
		fld_hastaSifre.setColumns(10);
		fld_hastaSifre.setBounds(177, 76, 248, 30);
		hastaGiris.add(fld_hastaSifre);
		
		JButton btnHastaKayit = new JButton("Kayıt Ol");
		btnHastaKayit.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnHastaKayit.setBounds(26, 149, 185, 50);
		hastaGiris.add(btnHastaKayit);
		
		JButton btnGiriYap_Hasta = new JButton("Giriş Yap");
		btnGiriYap_Hasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGiriYap_Hasta.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String hastaTc = fld_hastaTc.getText();
				        String hastaSifre = fld_hastaSifre.getText();
				        DatabaseConnection dbConn = new DatabaseConnection();
				        dbConn.connect(); 
				        if (dbConn.isValidUser(hastaTc, hastaSifre)) {
				            JOptionPane.showMessageDialog(null, "Giriş Başarılı!");
				        } else {
				            JOptionPane.showMessageDialog(null, "Hatalı T.C. veya Şifre");
				        }
				    }
				});

			}
		});
		btnGiriYap_Hasta.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnGiriYap_Hasta.setBounds(240, 149, 185, 50);
		hastaGiris.add(btnGiriYap_Hasta);
		
		JPanel personelGiris = new JPanel();
		w_tabbedPane.addTab("Doktor Girişi", null, personelGiris, null);
		personelGiris.setLayout(null);
		
		JLabel lblTcGirii_1 = new JLabel("T.C. Numaranız : ");
		lblTcGirii_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblTcGirii_1.setBounds(35, 26, 141, 30);
		personelGiris.add(lblTcGirii_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Yu Gothic Light", Font.PLAIN, 17));
		textField.setColumns(10);
		textField.setBounds(186, 26, 248, 30);
		personelGiris.add(textField);
		
		JLabel lblifreniz_1 = new JLabel("Şifreniz : ");
		lblifreniz_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblifreniz_1.setBounds(35, 67, 141, 30);
		personelGiris.add(lblifreniz_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(186, 75, 248, 30);
		personelGiris.add(textField_1);
		
		JButton btnGiriYap_Dr = new JButton("Giriş Yap");
		btnGiriYap_Dr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnGiriYap_Dr.setBounds(84, 147, 300, 50);
		personelGiris.add(btnGiriYap_Dr);
	}
}
