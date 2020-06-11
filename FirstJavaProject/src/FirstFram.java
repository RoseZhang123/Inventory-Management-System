import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JTable;
import java.awt.Scrollbar;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;

public class FirstFram extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFram frame = new FirstFram();
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
	public FirstFram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 483);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 22, 539, 0};
		gridBagLayout.rowHeights = new int[]{77, 441, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 3;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		panel.setLayout(new GridLayout(1, 20, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("scrollbar"));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.anchor = GridBagConstraints.WEST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{50, 0};
		gbl_panel_1.rowHeights = new int[]{21, 21, 21, 21, 21, 21, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_1.setForeground(new Color(51, 102, 255));
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton.setForeground(new Color(51, 102, 255));
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_2.setForeground(new Color(51, 102, 255));
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 3;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Refresh");
		btnNewButton_3.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_3.setForeground(new Color(51, 102, 255));
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 6;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Quick Link");
		btnNewButton_4.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_4.setForeground(new Color(51, 102, 255));
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 7;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Import");
		btnNewButton_5.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_5.setForeground(new Color(51, 102, 255));
		btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 8;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 1;
		getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{170, 372, 0};
		gbl_panel_2.rowHeights = new int[]{218, 218, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel_2.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{160, 82, 0};
		gbl_panel_6.rowHeights = new int[]{53, 48, 0, 0, 0, 36, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
		
		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.gridwidth = 2;
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 0;
		panel_6.add(panel_8, gbc_panel_8);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 1;
		panel_6.add(panel_7, gbc_panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{40, 74, 0};
		gbl_panel_7.rowHeights = new int[]{10, 10, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JTextArea txtrUnitOfMeasure = new JTextArea();
		txtrUnitOfMeasure.setBackground(SystemColor.menu);
		txtrUnitOfMeasure.setText("Unit of Measure");
		txtrUnitOfMeasure.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_txtrUnitOfMeasure = new GridBagConstraints();
		gbc_txtrUnitOfMeasure.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrUnitOfMeasure.insets = new Insets(0, 0, 5, 5);
		gbc_txtrUnitOfMeasure.gridx = 0;
		gbc_txtrUnitOfMeasure.gridy = 0;
		panel_7.add(txtrUnitOfMeasure, gbc_txtrUnitOfMeasure);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 0;
		panel_7.add(spinner, gbc_spinner);
		
		JTextArea txtrMrp = new JTextArea();
		txtrMrp.setText("MRP");
		GridBagConstraints gbc_txtrMrp = new GridBagConstraints();
		gbc_txtrMrp.insets = new Insets(0, 0, 0, 5);
		gbc_txtrMrp.fill = GridBagConstraints.BOTH;
		gbc_txtrMrp.gridx = 0;
		gbc_txtrMrp.gridy = 1;
		panel_7.add(txtrMrp, gbc_txtrMrp);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.gridx = 1;
		gbc_panel_9.gridy = 1;
		panel_6.add(panel_9, gbc_panel_9);
		
		JTextArea txtrReorderLevel_1 = new JTextArea();
		GridBagConstraints gbc_txtrReorderLevel_1 = new GridBagConstraints();
		gbc_txtrReorderLevel_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtrReorderLevel_1.gridx = 0;
		gbc_txtrReorderLevel_1.gridy = 2;
		panel_6.add(txtrReorderLevel_1, gbc_txtrReorderLevel_1);
		txtrReorderLevel_1.setText("Re-Order level");
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 0, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 5;
		panel_6.add(panel_10, gbc_panel_10);
		
		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 1;
		gbc_panel_12.gridy = 5;
		panel_6.add(panel_12, gbc_panel_12);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{60, 60, 60, 0};
		gbl_panel_8.rowHeights = new int[]{20, 20, 20, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
								
								JTextArea txtrName = new JTextArea();
								txtrName.setFont(new Font("Arial Black", Font.PLAIN, 8));
								txtrName.setBackground(SystemColor.menu);
								txtrName.setText("Name");
								GridBagConstraints gbc_txtrName = new GridBagConstraints();
								gbc_txtrName.fill = GridBagConstraints.BOTH;
								gbc_txtrName.insets = new Insets(0, 0, 5, 5);
								gbc_txtrName.gridx = 0;
								gbc_txtrName.gridy = 0;
								panel_8.add(txtrName, gbc_txtrName);
								
								textField_2 = new JTextField();
								GridBagConstraints gbc_textField_2 = new GridBagConstraints();
								gbc_textField_2.gridwidth = 2;
								gbc_textField_2.insets = new Insets(0, 0, 5, 0);
								gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
								gbc_textField_2.gridx = 1;
								gbc_textField_2.gridy = 0;
								panel_8.add(textField_2, gbc_textField_2);
								textField_2.setColumns(10);
							
								JTextArea txtrAlias = new JTextArea();
								txtrAlias.setRows(1);
								txtrAlias.setBackground(SystemColor.menu);
								txtrAlias.setFont(new Font("Arial Black", Font.PLAIN, 8));
								txtrAlias.setText("Alias");
								GridBagConstraints gbc_txtrAlias = new GridBagConstraints();
								gbc_txtrAlias.fill = GridBagConstraints.BOTH;
								gbc_txtrAlias.insets = new Insets(0, 0, 5, 5);
								gbc_txtrAlias.gridx = 0;
								gbc_txtrAlias.gridy = 1;
								panel_8.add(txtrAlias, gbc_txtrAlias);
										
										textField_3 = new JTextField();
										GridBagConstraints gbc_textField_3 = new GridBagConstraints();
										gbc_textField_3.gridwidth = 2;
										gbc_textField_3.insets = new Insets(0, 0, 5, 0);
										gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
										gbc_textField_3.gridx = 1;
										gbc_textField_3.gridy = 1;
										panel_8.add(textField_3, gbc_textField_3);
										textField_3.setColumns(10);
									
										JTextArea txtrUnderGroup = new JTextArea();
										txtrUnderGroup.setRows(2);
										txtrUnderGroup.setBackground(SystemColor.menu);
										txtrUnderGroup.setFont(new Font("Arial Black", Font.PLAIN, 8));
										txtrUnderGroup.setText("Under Group");
										GridBagConstraints gbc_txtrUnderGroup = new GridBagConstraints();
										gbc_txtrUnderGroup.insets = new Insets(0, 0, 0, 5);
										gbc_txtrUnderGroup.fill = GridBagConstraints.BOTH;
										gbc_txtrUnderGroup.gridx = 0;
										gbc_txtrUnderGroup.gridy = 2;
										panel_8.add(txtrUnderGroup, gbc_txtrUnderGroup);
										
										JComboBox comboBox = new JComboBox();
										comboBox.setBackground(SystemColor.window);
										GridBagConstraints gbc_comboBox = new GridBagConstraints();
										gbc_comboBox.gridwidth = 2;
										gbc_comboBox.insets = new Insets(0, 0, 0, 5);
										gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
										gbc_comboBox.gridx = 1;
										gbc_comboBox.gridy = 2;
										panel_8.add(comboBox, gbc_comboBox);
//		
//		JComboBox comboBox = new JComboBox();
//		panel_6.add(comboBox);
//		
//		JTextArea txtrUnitOfMeasure = new JTextArea();
//		txtrUnitOfMeasure.setText("Unit of Measure");
//		panel_6.add(txtrUnitOfMeasure);
//		
//		JSpinner spinner = new JSpinner();
//		panel_6.add(spinner);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 0;
		panel_2.add(panel_4, gbc_panel_4);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 2;
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		panel_2.add(panel_5, gbc_panel_5);
	}

}
