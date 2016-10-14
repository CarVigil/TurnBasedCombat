package ui.desktop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import logic.*;
import entities.*;

public class ABMCCombate extends JFrame {

	private JPanel contentPane;
	private JTextField txtPersonaje1;
	private JTextField txtPersonaje2;
	private JTextField txtEnergia1;
	private JTextField txtEnergia2;
	private JTextField txtVida1;
	private JTextField txtVida2;
	private JTextField txtEnergiaAtaque;
	private JTextField txtTurno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABMCCombate frame = new ABMCCombate();
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
	public ABMCCombate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPersonaje = new JLabel("Personaje 1:");
		lblPersonaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPersonaje.setBounds(53, 74, 83, 14);
		contentPane.add(lblPersonaje);
		
		JLabel lblPersonaje_1 = new JLabel("Personaje 2: ");
		lblPersonaje_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPersonaje_1.setBounds(260, 74, 83, 14);
		contentPane.add(lblPersonaje_1);
		
		JLabel lblEnergia = new JLabel("Energia:");
		lblEnergia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnergia.setBounds(53, 111, 63, 14);
		contentPane.add(lblEnergia);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVida.setBounds(53, 144, 46, 14);
		contentPane.add(lblVida);
		
		JLabel lblEnergia_1 = new JLabel("Energia:");
		lblEnergia_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnergia_1.setBounds(260, 111, 63, 14);
		contentPane.add(lblEnergia_1);
		
		JLabel lblVida_1 = new JLabel("Vida: ");
		lblVida_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVida_1.setBounds(260, 144, 46, 14);
		contentPane.add(lblVida_1);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTurno.setBounds(53, 202, 46, 14);
		contentPane.add(lblTurno);
		
		JLabel lblEnergiaParaAtacar = new JLabel("Energia para atacar:");
		lblEnergiaParaAtacar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnergiaParaAtacar.setBounds(53, 254, 134, 14);
		contentPane.add(lblEnergiaParaAtacar);
		
		JButton btnAtacar = new JButton("Atacar");
		btnAtacar.setBounds(274, 251, 89, 23);
		contentPane.add(btnAtacar);
		
		JButton btnDefender = new JButton("Defender");
		btnDefender.setBounds(387, 251, 89, 23);
		contentPane.add(btnDefender);
		
		JLabel lblJavaCombat = new JLabel("JAVA Combat");
		lblJavaCombat.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJavaCombat.setBounds(24, 17, 153, 23);
		contentPane.add(lblJavaCombat);
		
		txtPersonaje1 = new JTextField();
		txtPersonaje1.setBounds(146, 72, 86, 20);
		contentPane.add(txtPersonaje1);
		txtPersonaje1.setColumns(10);
		
		txtPersonaje2 = new JTextField();
		txtPersonaje2.setBounds(353, 72, 86, 20);
		contentPane.add(txtPersonaje2);
		txtPersonaje2.setColumns(10);
		
		txtEnergia1 = new JTextField();
		txtEnergia1.setBounds(146, 109, 86, 20);
		contentPane.add(txtEnergia1);
		txtEnergia1.setColumns(10);
		
		txtEnergia2 = new JTextField();
		txtEnergia2.setBounds(353, 109, 86, 20);
		contentPane.add(txtEnergia2);
		txtEnergia2.setColumns(10);
		
		txtVida1 = new JTextField();
		txtVida1.setBounds(146, 142, 86, 20);
		contentPane.add(txtVida1);
		txtVida1.setColumns(10);
		
		txtVida2 = new JTextField();
		txtVida2.setBounds(353, 142, 86, 20);
		contentPane.add(txtVida2);
		txtVida2.setColumns(10);
		
		txtEnergiaAtaque = new JTextField();
		txtEnergiaAtaque.setBounds(181, 252, 46, 20);
		contentPane.add(txtEnergiaAtaque);
		txtEnergiaAtaque.setColumns(10);
		
		txtTurno = new JTextField();
		txtTurno.setBounds(109, 200, 86, 20);
		contentPane.add(txtTurno);
		txtTurno.setColumns(10);
	}
}
