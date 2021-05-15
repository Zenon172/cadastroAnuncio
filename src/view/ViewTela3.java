package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewTela3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTela3 frame = new ViewTela3();
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
	public ViewTela3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesquisarAnncio = new JLabel("Pesquisar An\u00FAncio");
		lblPesquisarAnncio.setForeground(Color.BLUE);
		lblPesquisarAnncio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPesquisarAnncio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesquisarAnncio.setBounds(140, 11, 153, 27);
		contentPane.add(lblPesquisarAnncio);
		
		JLabel lblDataIncio = new JLabel("Data in\u00EDcio:");
		lblDataIncio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataIncio.setForeground(Color.BLUE);
		lblDataIncio.setBounds(23, 61, 69, 20);
		contentPane.add(lblDataIncio);
		
		textField = new JTextField();
		textField.setBounds(23, 87, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDataFim = new JLabel("Data fim:");
		lblDataFim.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDataFim.setForeground(Color.BLUE);
		lblDataFim.setBounds(150, 56, 52, 30);
		contentPane.add(lblDataFim);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 87, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBackground(Color.LIGHT_GRAY);
		btnPesquisar.setForeground(Color.BLUE);
		btnPesquisar.setBounds(285, 86, 102, 23);
		contentPane.add(btnPesquisar);
		
		JLabel lblOu = new JLabel("OU");
		lblOu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOu.setForeground(Color.BLUE);
		lblOu.setBounds(121, 140, 46, 14);
		contentPane.add(lblOu);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCliente.setForeground(Color.BLUE);
		lblCliente.setBounds(23, 197, 46, 14);
		contentPane.add(lblCliente);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 194, 155, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("Pesquisar");
		button.setForeground(Color.BLUE);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(285, 194, 102, 23);
		contentPane.add(button);
	}
}
