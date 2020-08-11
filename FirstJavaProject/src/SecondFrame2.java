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
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class SecondFrame2 extends JFrame {
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
					SecondFrame2 frame = new SecondFrame2();
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
	public SecondFrame2() {
		getContentPane().setBackground(SystemColor.window);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 784);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{641, 0};
		gridBagLayout.rowHeights = new int[]{621, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel_1.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{16, 80, 200, 0};
		gbl_panel_3.rowHeights = new int[]{25, 45, 45, 45, 45, 50, 45, 45, 45, 35, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JTextArea txtrGroupDetails = new JTextArea();
		txtrGroupDetails.setText("Group Details");
		txtrGroupDetails.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_txtrGroupDetails = new GridBagConstraints();
		gbc_txtrGroupDetails.insets = new Insets(0, 0, 5, 5);
		gbc_txtrGroupDetails.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrGroupDetails.gridx = 1;
		gbc_txtrGroupDetails.gridy = 0;
		panel_3.add(txtrGroupDetails, gbc_txtrGroupDetails);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrName.setText("Name");
		GridBagConstraints gbc_txtrName = new GridBagConstraints();
		gbc_txtrName.insets = new Insets(0, 0, 5, 5);
		gbc_txtrName.fill = GridBagConstraints.BOTH;
		gbc_txtrName.gridx = 1;
		gbc_txtrName.gridy = 1;
		panel_3.add(txtrName, gbc_txtrName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 1;
		panel_3.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JTextArea txtrClassification = new JTextArea();
		txtrClassification.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrClassification.setText("Classification");
		GridBagConstraints gbc_txtrClassification = new GridBagConstraints();
		gbc_txtrClassification.insets = new Insets(0, 0, 5, 5);
		gbc_txtrClassification.fill = GridBagConstraints.BOTH;
		gbc_txtrClassification.gridx = 1;
		gbc_txtrClassification.gridy = 2;
		panel_3.add(txtrClassification, gbc_txtrClassification);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 2;
		panel_3.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JTextArea txtrUnderGroup = new JTextArea();
		txtrUnderGroup.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrUnderGroup.setText("Under Group");
		GridBagConstraints gbc_txtrUnderGroup = new GridBagConstraints();
		gbc_txtrUnderGroup.insets = new Insets(0, 0, 5, 5);
		gbc_txtrUnderGroup.fill = GridBagConstraints.BOTH;
		gbc_txtrUnderGroup.gridx = 1;
		gbc_txtrUnderGroup.gridy = 3;
		panel_3.add(txtrUnderGroup, gbc_txtrUnderGroup);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 3;
		panel_3.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JTextArea txtrStockMaintaine = new JTextArea();
		txtrStockMaintaine.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrStockMaintaine.setText("Stock Maintenance");
		GridBagConstraints gbc_txtrStockMaintaine = new GridBagConstraints();
		gbc_txtrStockMaintaine.insets = new Insets(0, 0, 5, 5);
		gbc_txtrStockMaintaine.fill = GridBagConstraints.BOTH;
		gbc_txtrStockMaintaine.gridx = 1;
		gbc_txtrStockMaintaine.gridy = 4;
		panel_3.add(txtrStockMaintaine, gbc_txtrStockMaintaine);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
		comboBox.setBackground(Color.WHITE);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 4;
		panel_3.add(comboBox, gbc_comboBox);
		
		JTextArea txtrPurchaseLedger = new JTextArea();
		txtrPurchaseLedger.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrPurchaseLedger.setText("Purchase Ledger");
		GridBagConstraints gbc_txtrPurchaseLedger = new GridBagConstraints();
		gbc_txtrPurchaseLedger.insets = new Insets(0, 0, 5, 5);
		gbc_txtrPurchaseLedger.fill = GridBagConstraints.BOTH;
		gbc_txtrPurchaseLedger.gridx = 1;
		gbc_txtrPurchaseLedger.gridy = 5;
		panel_3.add(txtrPurchaseLedger, gbc_txtrPurchaseLedger);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.BOTH;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 5;
		panel_3.add(comboBox_1, gbc_comboBox_1);
		
		JTextArea txtrPurchaseReturn = new JTextArea();
		txtrPurchaseReturn.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrPurchaseReturn.setText("Purchase Return");
		GridBagConstraints gbc_txtrPurchaseReturn = new GridBagConstraints();
		gbc_txtrPurchaseReturn.insets = new Insets(0, 0, 5, 5);
		gbc_txtrPurchaseReturn.fill = GridBagConstraints.BOTH;
		gbc_txtrPurchaseReturn.gridx = 1;
		gbc_txtrPurchaseReturn.gridy = 6;
		panel_3.add(txtrPurchaseReturn, gbc_txtrPurchaseReturn);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.BOTH;
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 6;
		panel_3.add(comboBox_2, gbc_comboBox_2);
		
		JTextArea txtrSalesLedger = new JTextArea();
		txtrSalesLedger.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrSalesLedger.setBackground(new Color(255, 255, 255));
		txtrSalesLedger.setText("Sales Ledger");
		GridBagConstraints gbc_txtrSalesLedger = new GridBagConstraints();
		gbc_txtrSalesLedger.insets = new Insets(0, 0, 5, 5);
		gbc_txtrSalesLedger.fill = GridBagConstraints.BOTH;
		gbc_txtrSalesLedger.gridx = 1;
		gbc_txtrSalesLedger.gridy = 7;
		panel_3.add(txtrSalesLedger, gbc_txtrSalesLedger);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.BOTH;
		gbc_comboBox_3.gridx = 2;
		gbc_comboBox_3.gridy = 7;
		panel_3.add(comboBox_3, gbc_comboBox_3);
		
		JTextArea txtrSalesReturn = new JTextArea();
		txtrSalesReturn.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtrSalesReturn.setText("Sales Return");
		GridBagConstraints gbc_txtrSalesReturn = new GridBagConstraints();
		gbc_txtrSalesReturn.insets = new Insets(0, 0, 5, 5);
		gbc_txtrSalesReturn.fill = GridBagConstraints.BOTH;
		gbc_txtrSalesReturn.gridx = 1;
		gbc_txtrSalesReturn.gridy = 8;
		panel_3.add(txtrSalesReturn, gbc_txtrSalesReturn);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_4.fill = GridBagConstraints.BOTH;
		gbc_comboBox_4.gridx = 2;
		gbc_comboBox_4.gridy = 8;
		panel_3.add(comboBox_4, gbc_comboBox_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Enable expire date feature");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.gridx = 2;
		gbc_chckbxNewCheckBox.gridy = 9;
		panel_3.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel_1.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{76, 49, 77, 59, 80, 49, 62, 97, 74, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JTextArea txtrGroups = new JTextArea();
		txtrGroups.setText("Groups");
		txtrGroups.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_txtrGroups = new GridBagConstraints();
		gbc_txtrGroups.insets = new Insets(0, 0, 5, 5);
		gbc_txtrGroups.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrGroups.gridx = 0;
		gbc_txtrGroups.gridy = 0;
		panel_2.add(txtrGroups, gbc_txtrGroups);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 10;
		panel_2.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{171, 152, 149, 143, 141, 0};
		gbl_panel.rowHeights = new int[]{20, 30, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 1;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 1;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 1;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
	}

}
