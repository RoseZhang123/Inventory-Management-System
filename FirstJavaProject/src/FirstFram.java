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
	private JTextField textField_4;
	private JTextField textField_5;

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
		setBounds(100, 100, 945, 784);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 539, 0};
		gridBagLayout.rowHeights = new int[]{77, 441, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 2;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{52, 48, 47, 54, 59, 32, 46, 45, 43, 47, 0};
		gbl_panel.rowHeights = new int[]{72, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		panel.add(tabbedPane, gbc_tabbedPane);
		
		JTextArea txtrHome = new JTextArea();
		txtrHome.setBackground(SystemColor.menu);
		txtrHome.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrHome.setText("Home");
		tabbedPane.addTab("New tab", null, txtrHome, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_1 = new GridBagConstraints();
		gbc_tabbedPane_1.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_1.gridx = 1;
		gbc_tabbedPane_1.gridy = 0;
		panel.add(tabbedPane_1, gbc_tabbedPane_1);
		
		JTextArea txtrPurchase = new JTextArea();
		txtrPurchase.setBackground(SystemColor.menu);
		txtrPurchase.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrPurchase.setText("Purchase");
		tabbedPane_1.addTab("New tab", null, txtrPurchase, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_2 = new GridBagConstraints();
		gbc_tabbedPane_2.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_2.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_2.gridx = 2;
		gbc_tabbedPane_2.gridy = 0;
		panel.add(tabbedPane_2, gbc_tabbedPane_2);
		
		JTextArea txtrSale = new JTextArea();
		txtrSale.setBackground(SystemColor.menu);
		txtrSale.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrSale.setText("Sale");
		tabbedPane_2.addTab("New tab", null, txtrSale, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_3 = new GridBagConstraints();
		gbc_tabbedPane_3.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_3.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_3.gridx = 3;
		gbc_tabbedPane_3.gridy = 0;
		panel.add(tabbedPane_3, gbc_tabbedPane_3);
		
		JTextArea txtrVoucher = new JTextArea();
		txtrVoucher.setBackground(SystemColor.menu);
		txtrVoucher.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrVoucher.setText("Voucher");
		tabbedPane_3.addTab("New tab", null, txtrVoucher, null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_4 = new GridBagConstraints();
		gbc_tabbedPane_4.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_4.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_4.gridx = 4;
		gbc_tabbedPane_4.gridy = 0;
		panel.add(tabbedPane_4, gbc_tabbedPane_4);
		
		JTextArea txtrMaterialsDetail = new JTextArea();
		txtrMaterialsDetail.setBackground(SystemColor.menu);
		txtrMaterialsDetail.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrMaterialsDetail.setText("Materials Detail");
		tabbedPane_4.addTab("New tab", null, txtrMaterialsDetail, null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_5 = new GridBagConstraints();
		gbc_tabbedPane_5.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_5.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_5.gridx = 5;
		gbc_tabbedPane_5.gridy = 0;
		panel.add(tabbedPane_5, gbc_tabbedPane_5);
		
		JTextArea txtrSuppliers = new JTextArea();
		txtrSuppliers.setBackground(SystemColor.menu);
		txtrSuppliers.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrSuppliers.setText("Suppliers");
		tabbedPane_5.addTab("New tab", null, txtrSuppliers, null);
		
		JTabbedPane tabbedPane_6 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_6 = new GridBagConstraints();
		gbc_tabbedPane_6.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_6.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_6.gridx = 6;
		gbc_tabbedPane_6.gridy = 0;
		panel.add(tabbedPane_6, gbc_tabbedPane_6);
		
		JTextArea txtrCustomers = new JTextArea();
		txtrCustomers.setBackground(SystemColor.menu);
		txtrCustomers.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrCustomers.setText("Customers");
		tabbedPane_6.addTab("New tab", null, txtrCustomers, null);
		
		JTabbedPane tabbedPane_7 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_7 = new GridBagConstraints();
		gbc_tabbedPane_7.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_7.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_7.gridx = 7;
		gbc_tabbedPane_7.gridy = 0;
		panel.add(tabbedPane_7, gbc_tabbedPane_7);
		
		JTextArea txtrA = new JTextArea();
		txtrA.setBackground(SystemColor.menu);
		txtrA.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrA.setText("Accounts");
		tabbedPane_7.addTab("New tab", null, txtrA, null);
		
		JTabbedPane tabbedPane_8 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_8 = new GridBagConstraints();
		gbc_tabbedPane_8.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_8.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane_8.gridx = 8;
		gbc_tabbedPane_8.gridy = 0;
		panel.add(tabbedPane_8, gbc_tabbedPane_8);
		
		JTextArea txtrSettings = new JTextArea();
		txtrSettings.setBackground(SystemColor.menu);
		txtrSettings.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrSettings.setText("Settings");
		tabbedPane_8.addTab("New tab", null, txtrSettings, null);
		
		JTabbedPane tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane_9 = new GridBagConstraints();
		gbc_tabbedPane_9.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane_9.gridx = 9;
		gbc_tabbedPane_9.gridy = 0;
		panel.add(tabbedPane_9, gbc_tabbedPane_9);
		
		JTextArea txtrAboutApps = new JTextArea();
		txtrAboutApps.setBackground(SystemColor.menu);
		txtrAboutApps.setText("About Apps");
		txtrAboutApps.setFont(new Font("Arial Black", Font.PLAIN, 8));
		tabbedPane_9.addTab("New tab", null, txtrAboutApps, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("scrollbar"));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
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
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton.setForeground(new Color(51, 102, 255));
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_2.setForeground(new Color(51, 102, 255));
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 3;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Refresh");
		btnNewButton_3.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_3.setForeground(new Color(51, 102, 255));
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 6;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Quick Link");
		btnNewButton_4.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_4.setForeground(new Color(51, 102, 255));
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 7;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Import");
		btnNewButton_5.setBackground(UIManager.getColor("TextArea.inactiveForeground"));
		btnNewButton_5.setForeground(new Color(51, 102, 255));
		btnNewButton_5.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 8;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
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
		gbl_panel_6.columnWidths = new int[]{140, 115, 0};
		gbl_panel_6.rowHeights = new int[]{53, 153, 22, 0};
		gbl_panel_6.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
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
		gbl_panel_7.rowHeights = new int[]{10, 10, 20, 27, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
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
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 0;
		panel_7.add(comboBox_1, gbc_comboBox_1);
		
		JTextArea txtrMrp = new JTextArea();
		txtrMrp.setBackground(SystemColor.menu);
		txtrMrp.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrMrp.setText("MRP");
		GridBagConstraints gbc_txtrMrp = new GridBagConstraints();
		gbc_txtrMrp.anchor = GridBagConstraints.WEST;
		gbc_txtrMrp.insets = new Insets(0, 0, 5, 5);
		gbc_txtrMrp.gridx = 0;
		gbc_txtrMrp.gridy = 1;
		panel_7.add(txtrMrp, gbc_txtrMrp);
		
		JSpinner spinner = new JSpinner();
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 0);
		gbc_spinner.fill = GridBagConstraints.BOTH;
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 1;
		panel_7.add(spinner, gbc_spinner);
		
		JTextArea txtrSellingRate = new JTextArea();
		GridBagConstraints gbc_txtrSellingRate = new GridBagConstraints();
		gbc_txtrSellingRate.anchor = GridBagConstraints.WEST;
		gbc_txtrSellingRate.insets = new Insets(0, 0, 5, 5);
		gbc_txtrSellingRate.gridx = 0;
		gbc_txtrSellingRate.gridy = 2;
		panel_7.add(txtrSellingRate, gbc_txtrSellingRate);
		txtrSellingRate.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrSellingRate.setBackground(SystemColor.menu);
		txtrSellingRate.setText("Selling Rate");
		
		JSpinner spinner_1 = new JSpinner();
		GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
		gbc_spinner_1.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_1.gridx = 1;
		gbc_spinner_1.gridy = 2;
		panel_7.add(spinner_1, gbc_spinner_1);
		
		JTextArea txtrReorderLevel = new JTextArea();
		txtrReorderLevel.setBackground(SystemColor.menu);
		txtrReorderLevel.setText("Reorder Level");
		txtrReorderLevel.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_txtrReorderLevel = new GridBagConstraints();
		gbc_txtrReorderLevel.anchor = GridBagConstraints.WEST;
		gbc_txtrReorderLevel.insets = new Insets(0, 0, 5, 5);
		gbc_txtrReorderLevel.gridx = 0;
		gbc_txtrReorderLevel.gridy = 3;
		panel_7.add(txtrReorderLevel, gbc_txtrReorderLevel);
		
		JSpinner spinner_2 = new JSpinner();
		GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
		gbc_spinner_2.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_2.gridx = 1;
		gbc_spinner_2.gridy = 3;
		panel_7.add(spinner_2, gbc_spinner_2);
		
		JTextArea txtrAverageweight = new JTextArea();
		txtrAverageweight.setBackground(SystemColor.menu);
		txtrAverageweight.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrAverageweight.setText("AvgWeight");
		GridBagConstraints gbc_txtrAverageweight = new GridBagConstraints();
		gbc_txtrAverageweight.anchor = GridBagConstraints.WEST;
		gbc_txtrAverageweight.insets = new Insets(0, 0, 5, 5);
		gbc_txtrAverageweight.gridx = 0;
		gbc_txtrAverageweight.gridy = 4;
		panel_7.add(txtrAverageweight, gbc_txtrAverageweight);
		
		JSpinner spinner_3 = new JSpinner();
		GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
		gbc_spinner_3.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_3.gridx = 1;
		gbc_spinner_3.gridy = 4;
		panel_7.add(spinner_3, gbc_spinner_3);
		
		JTextArea txtrQuantity = new JTextArea();
		txtrQuantity.setBackground(SystemColor.menu);
		txtrQuantity.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrQuantity.setText("Quantity");
		GridBagConstraints gbc_txtrQuantity = new GridBagConstraints();
		gbc_txtrQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_txtrQuantity.fill = GridBagConstraints.BOTH;
		gbc_txtrQuantity.gridx = 0;
		gbc_txtrQuantity.gridy = 5;
		panel_7.add(txtrQuantity, gbc_txtrQuantity);
		
		JSpinner spinner_4 = new JSpinner();
		GridBagConstraints gbc_spinner_4 = new GridBagConstraints();
		gbc_spinner_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_4.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_4.gridx = 1;
		gbc_spinner_4.gridy = 5;
		panel_7.add(spinner_4, gbc_spinner_4);
		
		JTextArea txtrRateoftax = new JTextArea();
		txtrRateoftax.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrRateoftax.setForeground(Color.BLACK);
		txtrRateoftax.setBackground(SystemColor.menu);
		txtrRateoftax.setText("Rate of Tax %");
		GridBagConstraints gbc_txtrRateoftax = new GridBagConstraints();
		gbc_txtrRateoftax.insets = new Insets(0, 0, 0, 5);
		gbc_txtrRateoftax.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrRateoftax.gridx = 0;
		gbc_txtrRateoftax.gridy = 6;
		panel_7.add(txtrRateoftax, gbc_txtrRateoftax);
		
		JSpinner spinner_5 = new JSpinner();
		GridBagConstraints gbc_spinner_5 = new GridBagConstraints();
		gbc_spinner_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_5.gridx = 1;
		gbc_spinner_5.gridy = 6;
		panel_7.add(spinner_5, gbc_spinner_5);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.gridx = 1;
		gbc_panel_9.gridy = 1;
		panel_6.add(panel_9, gbc_panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{66, 73, 0};
		gbl_panel_9.rowHeights = new int[]{22, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_9.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JTextArea txtrProfitOn = new JTextArea();
		txtrProfitOn.setBackground(SystemColor.menu);
		txtrProfitOn.setText("% Profit on MRP");
		txtrProfitOn.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_txtrProfitOn = new GridBagConstraints();
		gbc_txtrProfitOn.insets = new Insets(0, 0, 5, 5);
		gbc_txtrProfitOn.anchor = GridBagConstraints.WEST;
		gbc_txtrProfitOn.gridx = 0;
		gbc_txtrProfitOn.gridy = 0;
		panel_9.add(txtrProfitOn, gbc_txtrProfitOn);
		
		JSpinner spinner_6 = new JSpinner();
		GridBagConstraints gbc_spinner_6 = new GridBagConstraints();
		gbc_spinner_6.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_6.gridx = 1;
		gbc_spinner_6.gridy = 0;
		panel_9.add(spinner_6, gbc_spinner_6);
		
		JTextArea txtrDiscountOnMrp = new JTextArea();
		txtrDiscountOnMrp.setBackground(SystemColor.menu);
		txtrDiscountOnMrp.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrDiscountOnMrp.setText("Discount on MRP");
		GridBagConstraints gbc_txtrDiscountOnMrp = new GridBagConstraints();
		gbc_txtrDiscountOnMrp.anchor = GridBagConstraints.WEST;
		gbc_txtrDiscountOnMrp.insets = new Insets(0, 0, 5, 5);
		gbc_txtrDiscountOnMrp.gridx = 0;
		gbc_txtrDiscountOnMrp.gridy = 1;
		panel_9.add(txtrDiscountOnMrp, gbc_txtrDiscountOnMrp);
		
		JSpinner spinner_7 = new JSpinner();
		GridBagConstraints gbc_spinner_7 = new GridBagConstraints();
		gbc_spinner_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_7.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_7.gridx = 1;
		gbc_spinner_7.gridy = 1;
		panel_9.add(spinner_7, gbc_spinner_7);
		
		JTextArea txtrDiscount = new JTextArea();
		txtrDiscount.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrDiscount.setBackground(SystemColor.menu);
		txtrDiscount.setText("Discount");
		GridBagConstraints gbc_txtrDiscount = new GridBagConstraints();
		gbc_txtrDiscount.anchor = GridBagConstraints.WEST;
		gbc_txtrDiscount.insets = new Insets(0, 0, 5, 5);
		gbc_txtrDiscount.gridx = 0;
		gbc_txtrDiscount.gridy = 2;
		panel_9.add(txtrDiscount, gbc_txtrDiscount);
		
		JSpinner spinner_8 = new JSpinner();
		GridBagConstraints gbc_spinner_8 = new GridBagConstraints();
		gbc_spinner_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_8.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_8.gridx = 1;
		gbc_spinner_8.gridy = 2;
		panel_9.add(spinner_8, gbc_spinner_8);
		
		JTextArea txtrPurchaseUnit = new JTextArea();
		txtrPurchaseUnit.setBackground(SystemColor.menu);
		txtrPurchaseUnit.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrPurchaseUnit.setText("Purchase Unit");
		GridBagConstraints gbc_txtrPurchaseUnit = new GridBagConstraints();
		gbc_txtrPurchaseUnit.anchor = GridBagConstraints.WEST;
		gbc_txtrPurchaseUnit.insets = new Insets(0, 0, 5, 5);
		gbc_txtrPurchaseUnit.gridx = 0;
		gbc_txtrPurchaseUnit.gridy = 3;
		panel_9.add(txtrPurchaseUnit, gbc_txtrPurchaseUnit);
		
		JSpinner spinner_9 = new JSpinner();
		GridBagConstraints gbc_spinner_9 = new GridBagConstraints();
		gbc_spinner_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_9.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_9.gridx = 1;
		gbc_spinner_9.gridy = 3;
		panel_9.add(spinner_9, gbc_spinner_9);
		
		JTextArea txtrRackNo = new JTextArea();
		txtrRackNo.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrRackNo.setBackground(SystemColor.menu);
		txtrRackNo.setText("Rack No.");
		GridBagConstraints gbc_txtrRackNo = new GridBagConstraints();
		gbc_txtrRackNo.anchor = GridBagConstraints.WEST;
		gbc_txtrRackNo.insets = new Insets(0, 0, 5, 5);
		gbc_txtrRackNo.gridx = 0;
		gbc_txtrRackNo.gridy = 4;
		panel_9.add(txtrRackNo, gbc_txtrRackNo);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 4;
		panel_9.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JTextArea txtrStockValue = new JTextArea();
		txtrStockValue.setBackground(SystemColor.menu);
		txtrStockValue.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrStockValue.setText("Stock Value");
		GridBagConstraints gbc_txtrStockValue = new GridBagConstraints();
		gbc_txtrStockValue.anchor = GridBagConstraints.WEST;
		gbc_txtrStockValue.insets = new Insets(0, 0, 5, 5);
		gbc_txtrStockValue.gridx = 0;
		gbc_txtrStockValue.gridy = 5;
		panel_9.add(txtrStockValue, gbc_txtrStockValue);
		
		JSpinner spinner_10 = new JSpinner();
		GridBagConstraints gbc_spinner_10 = new GridBagConstraints();
		gbc_spinner_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner_10.insets = new Insets(0, 0, 5, 0);
		gbc_spinner_10.gridx = 1;
		gbc_spinner_10.gridy = 5;
		panel_9.add(spinner_10, gbc_spinner_10);
		
		JTextArea txtrBarcode = new JTextArea();
		txtrBarcode.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrBarcode.setBackground(SystemColor.menu);
		txtrBarcode.setText("Barcode");
		GridBagConstraints gbc_txtrBarcode = new GridBagConstraints();
		gbc_txtrBarcode.anchor = GridBagConstraints.WEST;
		gbc_txtrBarcode.insets = new Insets(0, 0, 0, 5);
		gbc_txtrBarcode.gridx = 0;
		gbc_txtrBarcode.gridy = 6;
		panel_9.add(txtrBarcode, gbc_txtrBarcode);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 6;
		panel_9.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.gridwidth = 2;
		gbc_panel_10.insets = new Insets(0, 0, 0, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 2;
		panel_6.add(panel_10, gbc_panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{39, 74, 0};
		gbl_panel_10.rowHeights = new int[]{16, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JTextArea txtrTax = new JTextArea();
		txtrTax.setBackground(SystemColor.menu);
		txtrTax.setFont(new Font("Arial Black", Font.PLAIN, 8));
		txtrTax.setText("Tax/VAT Ledger");
		GridBagConstraints gbc_txtrTax = new GridBagConstraints();
		gbc_txtrTax.insets = new Insets(0, 0, 0, 5);
		gbc_txtrTax.anchor = GridBagConstraints.WEST;
		gbc_txtrTax.gridx = 0;
		gbc_txtrTax.gridy = 0;
		panel_10.add(txtrTax, gbc_txtrTax);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 0;
		panel_10.add(comboBox_2, gbc_comboBox_2);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{60, 60, 60, 0};
		gbl_panel_8.rowHeights = new int[]{20, 20, 18, 0};
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
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{190, 0, 0};
		gbl_panel_4.rowHeights = new int[]{35, 268, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JTextArea txtrName_1 = new JTextArea();
		txtrName_1.setBackground(SystemColor.inactiveCaption);
		txtrName_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrName_1.setText("Name");
		GridBagConstraints gbc_txtrName_1 = new GridBagConstraints();
		gbc_txtrName_1.fill = GridBagConstraints.BOTH;
		gbc_txtrName_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtrName_1.gridx = 0;
		gbc_txtrName_1.gridy = 0;
		panel_4.add(txtrName_1, gbc_txtrName_1);
		
		JTextArea txtrGroupName = new JTextArea();
		txtrGroupName.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrGroupName.setBackground(SystemColor.inactiveCaption);
		txtrGroupName.setText("Group Name");
		GridBagConstraints gbc_txtrGroupName = new GridBagConstraints();
		gbc_txtrGroupName.insets = new Insets(0, 0, 5, 0);
		gbc_txtrGroupName.fill = GridBagConstraints.BOTH;
		gbc_txtrGroupName.gridx = 1;
		gbc_txtrGroupName.gridy = 0;
		panel_4.add(txtrGroupName, gbc_txtrGroupName);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 2;
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		panel_2.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{70, 0, 0, 66, 52, 0, 0, 0, 88, 0};
		gbl_panel_5.rowHeights = new int[]{30, 203, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JTextArea txtrBatchNo = new JTextArea();
		txtrBatchNo.setBackground(SystemColor.inactiveCaption);
		txtrBatchNo.setText("Batch No.");
		txtrBatchNo.setForeground(Color.BLACK);
		txtrBatchNo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		GridBagConstraints gbc_txtrBatchNo = new GridBagConstraints();
		gbc_txtrBatchNo.anchor = GridBagConstraints.WEST;
		gbc_txtrBatchNo.fill = GridBagConstraints.VERTICAL;
		gbc_txtrBatchNo.insets = new Insets(0, 0, 5, 5);
		gbc_txtrBatchNo.gridx = 0;
		gbc_txtrBatchNo.gridy = 0;
		panel_5.add(txtrBatchNo, gbc_txtrBatchNo);
		
		JTextArea txtrBatchDate = new JTextArea();
		txtrBatchDate.setBackground(SystemColor.inactiveCaption);
		txtrBatchDate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrBatchDate.setText("Batch Date");
		GridBagConstraints gbc_txtrBatchDate = new GridBagConstraints();
		gbc_txtrBatchDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtrBatchDate.fill = GridBagConstraints.BOTH;
		gbc_txtrBatchDate.gridx = 1;
		gbc_txtrBatchDate.gridy = 0;
		panel_5.add(txtrBatchDate, gbc_txtrBatchDate);
		
		JTextArea txtrQuantity_1 = new JTextArea();
		txtrQuantity_1.setText("Quantity");
		txtrQuantity_1.setBackground(SystemColor.inactiveCaption);
		txtrQuantity_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		GridBagConstraints gbc_txtrQuantity_1 = new GridBagConstraints();
		gbc_txtrQuantity_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtrQuantity_1.fill = GridBagConstraints.BOTH;
		gbc_txtrQuantity_1.gridx = 2;
		gbc_txtrQuantity_1.gridy = 0;
		panel_5.add(txtrQuantity_1, gbc_txtrQuantity_1);
		
		JTextArea txtrMrp_1 = new JTextArea();
		txtrMrp_1.setText("MRP");
		txtrMrp_1.setBackground(SystemColor.inactiveCaption);
		txtrMrp_1.setFont(new Font("Arial Black", Font.PLAIN, 11));
		GridBagConstraints gbc_txtrMrp_1 = new GridBagConstraints();
		gbc_txtrMrp_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtrMrp_1.fill = GridBagConstraints.BOTH;
		gbc_txtrMrp_1.gridx = 3;
		gbc_txtrMrp_1.gridy = 0;
		panel_5.add(txtrMrp_1, gbc_txtrMrp_1);
		
		JTextArea txtrTradePrice = new JTextArea();
		txtrTradePrice.setBackground(SystemColor.inactiveCaption);
		txtrTradePrice.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrTradePrice.setText("Trade Price");
		GridBagConstraints gbc_txtrTradePrice = new GridBagConstraints();
		gbc_txtrTradePrice.insets = new Insets(0, 0, 5, 5);
		gbc_txtrTradePrice.fill = GridBagConstraints.BOTH;
		gbc_txtrTradePrice.gridx = 4;
		gbc_txtrTradePrice.gridy = 0;
		panel_5.add(txtrTradePrice, gbc_txtrTradePrice);
		
		JTextArea txtrLandingCost = new JTextArea();
		txtrLandingCost.setBackground(SystemColor.inactiveCaption);
		txtrLandingCost.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrLandingCost.setText("Landing Cost");
		GridBagConstraints gbc_txtrLandingCost = new GridBagConstraints();
		gbc_txtrLandingCost.insets = new Insets(0, 0, 5, 5);
		gbc_txtrLandingCost.fill = GridBagConstraints.BOTH;
		gbc_txtrLandingCost.gridx = 5;
		gbc_txtrLandingCost.gridy = 0;
		panel_5.add(txtrLandingCost, gbc_txtrLandingCost);
		
		JTextArea txtrPurchaseBillNo = new JTextArea();
		txtrPurchaseBillNo.setBackground(SystemColor.inactiveCaption);
		txtrPurchaseBillNo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrPurchaseBillNo.setText("Purchase Bill No.");
		GridBagConstraints gbc_txtrPurchaseBillNo = new GridBagConstraints();
		gbc_txtrPurchaseBillNo.insets = new Insets(0, 0, 5, 5);
		gbc_txtrPurchaseBillNo.fill = GridBagConstraints.BOTH;
		gbc_txtrPurchaseBillNo.gridx = 6;
		gbc_txtrPurchaseBillNo.gridy = 0;
		panel_5.add(txtrPurchaseBillNo, gbc_txtrPurchaseBillNo);
		
		JTextArea txtrBillDate = new JTextArea();
		txtrBillDate.setBackground(SystemColor.inactiveCaption);
		txtrBillDate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrBillDate.setText("Bill Date");
		GridBagConstraints gbc_txtrBillDate = new GridBagConstraints();
		gbc_txtrBillDate.fill = GridBagConstraints.BOTH;
		gbc_txtrBillDate.insets = new Insets(0, 0, 5, 5);
		gbc_txtrBillDate.gridx = 7;
		gbc_txtrBillDate.gridy = 0;
		panel_5.add(txtrBillDate, gbc_txtrBillDate);
		
		JTextArea txtrExpireDate = new JTextArea();
		txtrExpireDate.setBackground(SystemColor.inactiveCaption);
		txtrExpireDate.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtrExpireDate.setText("Expire Date");
		GridBagConstraints gbc_txtrExpireDate = new GridBagConstraints();
		gbc_txtrExpireDate.insets = new Insets(0, 0, 5, 0);
		gbc_txtrExpireDate.fill = GridBagConstraints.BOTH;
		gbc_txtrExpireDate.gridx = 8;
		gbc_txtrExpireDate.gridy = 0;
		panel_5.add(txtrExpireDate, gbc_txtrExpireDate);
	}

}
