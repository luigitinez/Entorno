import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		JPanel panel_1 = new JPanel();
		panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		final JTextPane pantalla = new JTextPane();
		pantalla.setFont(new Font("FreeMono", Font.ITALIC, 42));
		pantalla.setDisabledTextColor(Color.BLACK);
		
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			pantalla.setText(" ");
			}
		});
		panel_1.add(btnNewButton);
		
		JButton button_9 = new JButton("÷");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_9.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("X");
		button_10.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button_11.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_12);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"7");
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_1);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"8");
			}
		});
		button_3.setBackground(Color.WHITE);
		panel_1.add(button_3);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"9");
			}
		});
		button_6.setBackground(Color.WHITE);
		panel_1.add(button_6);
		
		JButton button_13 = new JButton("=");
		button_13.setBackground(Color.LIGHT_GRAY);
		panel_1.add(button_13);
		
		JButton button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"4");
			}
		});
		button.setBackground(Color.WHITE);
		panel_1.add(button);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"5");
			}
		});
		button_4.setBackground(Color.WHITE);
		panel_1.add(button_4);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"6");
			}
		});
		button_7.setBackground(Color.WHITE);
		panel_1.add(button_7);
		
		JButton button_2 = new JButton("0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				if(screen.length()>=8){
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
						    "¡Error! ¡No se pueden insertar más de 8 carácteres!",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE); 
				}
				else{
				pantalla.setText(screen+"0");
				}
			}
		});
		button_2.setBackground(Color.WHITE);
		panel_1.add(button_2);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				if(screen.length()>=8){
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
						    "¡Error! ¡No se pueden insertar más de 8 carácteres!",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else{
				pantalla.setText(screen+"1");
			}}
		});
		button_1.setBackground(Color.WHITE);
		panel_1.add(button_1);
		
		JButton button_5 = new JButton("2");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				pantalla.setText(screen+"2");
			}
		});
		button_5.setBackground(Color.WHITE);
		panel_1.add(button_5);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String screen = pantalla.getText();
				if(screen.length()>=8){
					Component frame = null;
					JOptionPane.showMessageDialog(frame,
						    "¡Error! ¡No se pueden insertar más de 8 carácteres!",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
				}
				else
				pantalla.setText(screen+"3");
			}
		});
		public void dialogerror(){
			
			Component frame = null;
			JOptionPane.showMessageDialog(frame,
				    "¡Error! ¡No se pueden insertar más de 8 carácteres!",
				    "Inane error",
				    JOptionPane.ERROR_MESSAGE);
		
	}
		button_8.setBackground(Color.WHITE);
		panel_1.add(button_8);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(pantalla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(pantalla, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
	
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private void dialogerror() {
		// TODO Auto-generated method stub
		
	}
}
