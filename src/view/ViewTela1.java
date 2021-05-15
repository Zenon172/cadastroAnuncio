package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import view.ViewTela2;
public class ViewTela1 extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTela1 frame = new ViewTela1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		
	}

	
	public ViewTela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnRelatorio = new JButton("Relat\u00F3rio");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTela3 frame3 = new ViewTela3();
				frame3.setVisible(true);
			}
		});
		btnRelatorio.setBackground(Color.LIGHT_GRAY);
		btnRelatorio.setForeground(Color.BLUE);
		btnRelatorio.setBounds(227, 116, 118, 38);
		contentPane.add(btnRelatorio);

		JLabel lblCadastroDeAnncios = new JLabel("Cadastro de An\u00FAncios");
		lblCadastroDeAnncios.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCadastroDeAnncios.setForeground(new Color(0, 0, 255));
		lblCadastroDeAnncios.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAnncios.setBounds(64, 11, 270, 47);
		contentPane.add(lblCadastroDeAnncios);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTela2 frame2 = new ViewTela2();
				frame2.setVisible(true);
			}
		});
		btnCadastrar.setForeground(Color.BLUE);
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.setBounds(75, 116, 118, 38);
		contentPane.add(btnCadastrar);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
