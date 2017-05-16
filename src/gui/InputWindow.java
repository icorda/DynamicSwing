package gui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InputWindow extends JFrame {

	Container pane = this.getContentPane();
	String[] mainPositions = { "Up", "Down", "Left", "Right", "Center", "NONE" };
	String[] subPositions = { "up", "down", "left", "right", "center" };
	String[] information = { "Up", "up", "Up", "down", "Left", "up", "Left", "down", "Center", "up", "Right", "up", "Right", "down" };
	
	public InputWindow() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
	    int screenWidth = screenSize.width;
	    setSize(screenWidth / 2, screenHeight / 2);
	    setTitle("Input Window");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	    pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
	    
		
	//Labels
		
	    JLabel lbl=new JLabel("Set the components in the desired locations:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 2;
		c.gridy = 0;
	    pane.add(lbl, c);
	    
	    JLabel lblm=new JLabel("Main position:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 2;
		c.gridy = 1;
	    pane.add(lblm, c);
	    
	    JLabel lbls=new JLabel("Sub position:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 1;
		c.gridy = 1;
	    pane.add(lbls, c);
	    
	    JLabel lblMenuBar=new JLabel("Menu Bar:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
	    pane.add(lblMenuBar, c);
	    JLabel lblToolBar=new JLabel("Tool Bar:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
	    pane.add(lblToolBar, c);
	    JLabel lblExplorer=new JLabel("Explorer:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
	    pane.add(lblExplorer, c);
	    JLabel lblInspector=new JLabel("Inspector:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
	    pane.add(lblInspector, c);
	    JLabel lblDocuments=new JLabel("Documents:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 6;
	    pane.add(lblDocuments, c);
	    JLabel lblPalette=new JLabel("Palette:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 7;
	    pane.add(lblPalette, c);
	    JLabel lblProperties=new JLabel("Properties:");
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 8;
	    pane.add(lblProperties, c);
	    
	    
	//Combo boxes
	    
	    //MenuBar
	    JComboBox mainMenuBar = new JComboBox(mainPositions);
	    mainMenuBar.setSelectedIndex(0);
	    //information[0] = (String)mainMenuBar.getSelectedItem();
	    mainMenuBar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg1) {
				JComboBox cb = (JComboBox)arg1.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[0] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
	    pane.add(mainMenuBar, c);
	    JComboBox subMenuBar = new JComboBox(subPositions);
	    subMenuBar.setSelectedIndex(0);
	    //information[1] = (String)subMenuBar.getSelectedItem();
	    subMenuBar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg2) {
				JComboBox cb = (JComboBox)arg2.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[1] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
	    pane.add(subMenuBar, c);
	    
	    //ToolBar
	    JComboBox mainToolBar = new JComboBox(mainPositions);
	    mainToolBar.setSelectedIndex(0);
	    //information[2] = (String)mainToolBar.getSelectedItem();
	    mainToolBar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg3) {
				JComboBox cb = (JComboBox)arg3.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[2] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
	    pane.add(mainToolBar, c);
	    JComboBox subToolBar = new JComboBox(subPositions);
	    subToolBar.setSelectedIndex(1);
	    //information[3] = (String)subToolBar.getSelectedItem();
	    subToolBar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg4) {
				JComboBox cb = (JComboBox)arg4.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[3] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
	    pane.add(subToolBar, c);
	    
	    //Explorer
	    JComboBox mainExplorer = new JComboBox(mainPositions);
	    mainExplorer.setSelectedIndex(2);
	    //information[4] = (String)mainExplorer.getSelectedItem();
	    mainExplorer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg5) {
				JComboBox cb = (JComboBox)arg5.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[4] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
	    pane.add(mainExplorer, c);
	    JComboBox subExplorer = new JComboBox(subPositions);
	    subExplorer.setSelectedIndex(0);
	    //information[5] = (String)subExplorer.getSelectedItem();
	    subExplorer.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg6) {
				JComboBox cb = (JComboBox)arg6.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[5] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
	    pane.add(subExplorer, c);
	    
	    //Inspector
	    JComboBox mainInspector = new JComboBox(mainPositions);
	    mainInspector.setSelectedIndex(2);
	    //information[6] = (String)mainInspector.getSelectedItem();
	    mainInspector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg7) {
				JComboBox cb = (JComboBox)arg7.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[6] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
	    pane.add(mainInspector, c);
	    JComboBox subInspector = new JComboBox(subPositions);
	    subInspector.setSelectedIndex(1);
	    //information[7] = (String)subInspector.getSelectedItem();
	    subInspector.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg8) {
				JComboBox cb = (JComboBox)arg8.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[7] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
	    pane.add(subInspector, c);
	    
	    //Documents
	    JComboBox mainDocuments = new JComboBox(mainPositions);
	    mainDocuments.setSelectedIndex(4);
	    //information[8] = (String)mainDocuments.getSelectedItem();
	    mainDocuments.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg9) {
				JComboBox cb = (JComboBox)arg9.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[8] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 6;
	    pane.add(mainDocuments, c);
	    JComboBox subDocuments = new JComboBox(subPositions);
	    subDocuments.setSelectedIndex(0);
	    //information[9] = (String)subDocuments.getSelectedItem();
	    subDocuments.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg10) {
				JComboBox cb = (JComboBox)arg10.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[9] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
	    pane.add(subDocuments, c);
	    
	    
	    //Palette
	    JComboBox mainPalette = new JComboBox(mainPositions);
	    mainPalette.setSelectedIndex(3);
	    //information[10] = (String)mainPalette.getSelectedItem();
	    mainPalette.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg11) {
				JComboBox cb = (JComboBox)arg11.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[10] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 7;
	    pane.add(mainPalette, c);
	    JComboBox subPalette = new JComboBox(subPositions);
	    subPalette.setSelectedIndex(0);
	    //information[11] = (String)subPalette.getSelectedItem();
	    subPalette.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg12) {
				JComboBox cb = (JComboBox)arg12.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[11] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 7;
	    pane.add(subPalette, c);
	    
	    //Properties
	    JComboBox mainProperties = new JComboBox(mainPositions);
	    mainProperties.setSelectedIndex(3);
	    //information[12] = (String)mainProperties.getSelectedItem();
	    mainProperties.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg13) {
				JComboBox cb = (JComboBox)arg13.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[12] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 8;
	    pane.add(mainProperties, c);
	    JComboBox subProperties = new JComboBox(subPositions);
	    subProperties.setSelectedIndex(1);
	    //information[13] = (String)subProperties.getSelectedItem();
	    subProperties.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg14) {
				JComboBox cb = (JComboBox)arg14.getSource();
		        String s = (String)cb.getSelectedItem();
		        information[13] = s;
			}
        });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 8;
	    pane.add(subProperties, c);
	    
	    
	//Button
	    
	    JButton btn=new JButton("Generate");
	    btn.setToolTipText("Generate the GUI");
	    btn.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	        	EventQueue.invokeLater(new Runnable() {
	                @Override
	                public void run() {
	                	GeneratedWindow gw = new GeneratedWindow(information);
	                    gw.setVisible(true);
	                }
	            });
	        }
	    });
	    c.weightx = 0.5;
	    c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 2;
		c.gridy = 9;
	    pane.add(btn, c);
	}
}
