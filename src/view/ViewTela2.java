package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JButton;

public class ViewTela2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTela2 frame = new ViewTela2();
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
	public ViewTela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Novo An\u00FAncio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 11, 232, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setForeground(Color.BLUE);
		lblNome.setBounds(10, 58, 46, 20);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(60, 59, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente: ");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCliente.setForeground(Color.BLUE);
		lblCliente.setBounds(10, 84, 46, 20);
		contentPane.add(lblCliente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(60, 85, 186, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataDeInicio = new JLabel("Data de Inicio:");
		lblDataDeInicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataDeInicio.setForeground(Color.BLUE);
		lblDataDeInicio.setBounds(10, 109, 89, 20);
		contentPane.add(lblDataDeInicio);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("dd/MM/yyyy");
		formattedTextField.setDropMode(DropMode.INSERT);
		formattedTextField.setBounds(108, 109, 138, 20);
		contentPane.add(formattedTextField);
		
		JLabel lblDataFinal = new JLabel("Data Final: ");
		lblDataFinal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataFinal.setForeground(Color.BLUE);
		lblDataFinal.setBounds(10, 134, 70, 20);
		contentPane.add(lblDataFinal);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(108, 134, 138, 20);
		contentPane.add(formattedTextField_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(Color.LIGHT_GRAY);
		btnSalvar.setForeground(Color.BLUE);
		btnSalvar.setBounds(185, 202, 89, 37);
		contentPane.add(btnSalvar);
		
		JLabel lblInvestimentoPorDia = new JLabel("Investimento por dia:");
		lblInvestimentoPorDia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInvestimentoPorDia.setForeground(Color.BLUE);
		lblInvestimentoPorDia.setBounds(10, 159, 121, 20);
		contentPane.add(lblInvestimentoPorDia);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(129, 161, 117, 20);
		contentPane.add(formattedTextField_2);
	}
}
