package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframe extends JFrame {

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
					Jframe frame = new Jframe();
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
	public Jframe() {
		setTitle("Тестовое задание");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelDocuments = new JPanel();
		panelDocuments.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0414\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u044B", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panelDocuments, BorderLayout.NORTH);
		panelDocuments.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel labelDocumentsNumber = new JLabel("Номер");
		panelDocuments.add(labelDocumentsNumber, "2, 2, right, default");
		
		textField = new JTextField();
		panelDocuments.add(textField, "4, 2, fill, default");
		textField.setColumns(10);
		
		JLabel labelDocumentsDate = new JLabel("Дата");
		panelDocuments.add(labelDocumentsDate, "2, 4, right, default");
		
		textField_1 = new JTextField();
		panelDocuments.add(textField_1, "4, 4, fill, default");
		textField_1.setColumns(10);
		
		JLabel labelDocumentsNote = new JLabel("Примечание");
		panelDocuments.add(labelDocumentsNote, "2, 6, right, default");
		
		textField_2 = new JTextField();
		panelDocuments.add(textField_2, "4, 6, fill, default");
		textField_2.setColumns(10);
		
		JPanel panelItems = new JPanel();
		panelItems.setBorder(new TitledBorder(null, "\u041F\u043E\u0437\u0438\u0446\u0438\u0438", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panelItems, BorderLayout.SOUTH);
		panelItems.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel labelItemNumber = new JLabel("Номер");
		panelItems.add(labelItemNumber, "2, 2, right, default");
		
		textField_3 = new JTextField();
		panelItems.add(textField_3, "4, 2, fill, default");
		textField_3.setColumns(10);
		
		JLabel labelitemName = new JLabel("Наименование");
		panelItems.add(labelitemName, "2, 4, right, default");
		
		textField_4 = new JTextField();
		panelItems.add(textField_4, "4, 4, fill, default");
		textField_4.setColumns(10);
		
		JLabel labelItemSummary = new JLabel("Сумма");
		panelItems.add(labelItemSummary, "2, 6, right, default");
		
		textField_5 = new JTextField();
		panelItems.add(textField_5, "4, 6, fill, default");
		textField_5.setColumns(10);
		
		JButton btnAddDocument = new JButton("Добавить документ");
		btnAddDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnAddDocument, BorderLayout.WEST);
		
		JButton buttonDeleteDocument = new JButton("Удалить документ");
		contentPane.add(buttonDeleteDocument, BorderLayout.EAST);
		
		JButton buttonEditDocument = new JButton("Редактировать");
		contentPane.add(buttonEditDocument, BorderLayout.CENTER);
	}

}
