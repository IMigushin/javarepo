package main;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;

public class JInternalFrameMain extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameMain frame = new JInternalFrameMain();
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
	public JInternalFrameMain() {
		setTitle("Master-Detail");
		setClosable(true);
		setMaximizable(true);
		setResizable(true);
		setBounds(100, 100, 450, 300);
		
		JPanel panelDocuments = new JPanel();
		panelDocuments.setBorder(new TitledBorder(null, "Documents", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(panelDocuments, BorderLayout.NORTH);
		panelDocuments.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNumber = new JLabel("Number");
		panelDocuments.add(lblNumber, "2, 2");
		
		JLabel lblDate = new JLabel("Date");
		panelDocuments.add(lblDate, "4, 2");
		
		JLabel lblNote = new JLabel("Note");
		panelDocuments.add(lblNote, "6, 2");

	}

}
