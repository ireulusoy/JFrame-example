package w6_JFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Fam extends JFrame implements ActionListener {

	JLabel lblName=new JLabel("Name&Surname");
	JLabel lblCol=new JLabel("Favourite Colour");
	JLabel lblGen=new JLabel("Gender");
	JLabel lblHob=new JLabel("Hobbies");
	JTextField txtName=new JTextField("<input your name>");
	JRadioButton rdFe=new JRadioButton("Female");
	JRadioButton rdMa=new JRadioButton("Male");
	JCheckBox chProg=new JCheckBox("Programming");
	JCheckBox chSwim=new JCheckBox("Swimming");
	JCheckBox chRead=new JCheckBox("Reading");
	JButton btnOk=new JButton("OK");
	JButton btnCnc=new JButton("Cancel");
	JComboBox cmbCol=new JComboBox(new String [] {"<Choose Your Favourite Colour>","Blue", "Yellow", "Black"});
	JLabel lblIcon=new JLabel(new ImageIcon("/Users/iremulusoy/Documents/programming/Java/icons/colors"));
	
	
	
	
	public Fam() {
		
		super("My Beloved Family");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocation(300, 300);
		
		
		JPanel pnlGen=new JPanel();
		pnlGen.setLayout(new FlowLayout());
		pnlGen.add(rdFe);
		pnlGen.add(rdMa);
		
		JPanel pnlHob=new JPanel(new FlowLayout());
		pnlHob.add(chProg);
		pnlHob.add(chRead);
		pnlHob.add(chSwim);
		
		JPanel pnlBut=new JPanel(new FlowLayout());
		pnlBut.add(btnOk);
		pnlBut.add(btnCnc);
		
		JPanel pnlCol=new JPanel(new FlowLayout());
		pnlCol.add(cmbCol);		pnlCol.add(lblIcon);

		
		JPanel pnlAll=new JPanel(new GridLayout(4,2));
		pnlAll.add(lblName);  	pnlAll.add(txtName);
		pnlAll.add(lblCol);		pnlAll.add(pnlCol);
		pnlAll.add(lblGen); 	pnlAll.add(pnlGen);
		pnlAll.add(lblHob);		pnlAll.add(pnlHob);
		
		
		ButtonGroup btngr=new ButtonGroup();
		btngr.add(rdFe);
		btngr.add(rdMa);
		
		JScrollPane scr=new JScrollPane(pnlAll);
	//	scr.add(pnlAll);
		
		super.add(scr, BorderLayout.CENTER);
		add(pnlBut, BorderLayout.SOUTH);
		
		
		pack();
		
		btnCnc.addActionListener(this);
		cmbCol.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		new Fam().setVisible(true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnCnc)
			System.exit(0);
		if(e.getSource()==cmbCol) {
			if(cmbCol.getSelectedItem().toString()=="Blue")
				lblIcon.setIcon(new ImageIcon("/Users/iremulusoy/Documents/programming/Java/icons/blue"));
			else if(cmbCol.getSelectedItem().toString()=="Yellow")
				lblIcon.setIcon(new ImageIcon("/Users/iremulusoy/Documents/programming/Java/icons/yellow"));
			else if(cmbCol.getSelectedItem().toString()=="Black")
				lblIcon.setIcon(new ImageIcon("/Users/iremulusoy/Documents/programming/Java/icons/black"));
			else if(cmbCol.getSelectedItem().toString()=="<Choose Your Favourite Colour>")
				lblIcon.setIcon(new ImageIcon("/Users/iremulusoy/Documents/programming/Java/icons/colors"));
		
		}
		
		
		
			
		
	}
	
	
	

	
	
}
