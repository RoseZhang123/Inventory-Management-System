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

public class SecondFrame extends JFrame {
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
					SecondFrame frame = new SecondFrame();
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
	public SecondFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 784);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{93, 843, 0};
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
		gbl_panel_1.rowHeights = new int[]{23, 21, 21, 21, 21, 21, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JTextArea txtrLoginDate = new JTextArea();
		txtrLoginDate.setBackground(SystemColor.scrollbar);
		txtrLoginDate.setText("Login Date");
		txtrLoginDate.setFont(new Font("Arial Black", Font.PLAIN, 8));
		GridBagConstraints gbc_txtrLoginDate = new GridBagConstraints();
		gbc_txtrLoginDate.anchor = GridBagConstraints.NORTH;
		gbc_txtrLoginDate.insets = new Insets(0, 0, 5, 0);
		gbc_txtrLoginDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtrLoginDate.gridx = 0;
		gbc_txtrLoginDate.gridy = 0;
		panel_1.add(txtrLoginDate, gbc_txtrLoginDate);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 1;
		panel_1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{100, 365, 99, 0};
		gbl_panel_2.rowHeights = new int[]{80, 275, 80, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 2;
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel_2.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 2;
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 2;
		panel_2.add(panel_4, gbc_panel_4);
	}

}
