package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame2 frame = new JFrame2();
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
	public JFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u0414\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u044B", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("73px"),
				ColumnSpec.decode("89px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("89px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("89px"),},
			new RowSpec[] {
				RowSpec.decode("21px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("23px"),}));
		
		JLabel label = new JLabel("Номер");
		panel.add(label, "1, 1, right, default");
		
		textField = new JTextField();
		panel.add(textField, "2, 1, fill, default");
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Дата");
		panel.add(label_1, "1, 3, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "2, 3, fill, default");
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("Примечание");
		panel.add(label_2, "1, 5, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "2, 5, fill, default");
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Добавить");
		panel.add(btnNewButton_2, "2, 6, left, top");
		
		JButton btnNewButton_1 = new JButton("Изменить");
		panel.add(btnNewButton_1, "4, 6, left, top");
		
		JButton btnNewButton = new JButton("Удалить");
		panel.add(btnNewButton, "6, 6, left, top");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u041F\u043E\u0437\u0438\u0446\u0438\u0438 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("80px"),
				ColumnSpec.decode("89px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("89px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("89px"),},
			new RowSpec[] {
				RowSpec.decode("21px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				RowSpec.decode("23px"),}));
		
		JLabel lblNewLabel = new JLabel("Номер");
		panel_1.add(lblNewLabel, "1, 1, right, default");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "2, 1, fill, default");
		textField_3.setColumns(10);
		
		JLabel label_3 = new JLabel("Наименование");
		panel_1.add(label_3, "1, 3, right, default");
		
		textField_4 = new JTextField();
		panel_1.add(textField_4, "2, 3, fill, default");
		textField_4.setColumns(10);
		
		JLabel label_4 = new JLabel("Сумма");
		panel_1.add(label_4, "1, 5, right, default");
		
		textField_5 = new JTextField();
		panel_1.add(textField_5, "2, 5, fill, default");
		textField_5.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Добавить");
		panel_1.add(btnNewButton_4, "2, 6, left, top");
		
		JButton btnNewButton_3 = new JButton("Изменить");
		panel_1.add(btnNewButton_3, "4, 6, left, top");
		
		JButton btnNewButton_5 = new JButton("Удалить");
		panel_1.add(btnNewButton_5, "6, 6, left, top");
	}

}
