package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;

public class Documents extends JPanel{
	
	public Documents() {
		JTabbedPane tp = new JTabbedPane();
		JComponent panel1 = makeTextAreaPanel();
	    tp.addTab("ContactEditorUI.java", panel1);
	    tp.setMnemonicAt(0, KeyEvent.VK_1);
	    add(tp, BorderLayout.CENTER);
	}
	
	protected JComponent makeTextAreaPanel() {
		JToolBar tb = new JToolBar();
		
		JButton b1 = new JButton("Source");
		tb.add(b1);
		JButton b2 = new JButton("Design");
		tb.add(b2);
		
		tb.addSeparator();
		
		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon("images/mouse_pointer.png"));
		tb.add(btn1);
		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon("images/arrow_circle.png"));
		tb.add(btn2);
		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon("images/open.png"));
		tb.add(btn3);
		
		tb.addSeparator();
		
		JButton btn4 = new JButton();
		btn4.setIcon(new ImageIcon("images/nav_right.png"));
		tb.add(btn4);
		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon("images/nav_left.png"));
		tb.add(btn5);
		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon("images/nav_down.png"));
		tb.add(btn6);
		JButton btn7 = new JButton();
		btn7.setIcon(new ImageIcon("images/nav_up.png"));
		tb.add(btn7);
		
		tb.addSeparator();
		
		JButton btn8 = new JButton();
		btn8.setIcon(new ImageIcon("images/sort_left_right.png"));
		tb.add(btn8);
		JButton btn9 = new JButton();
		btn9.setIcon(new ImageIcon("images/sort_up_down.png"));
		tb.add(btn9);
		
		ImagePanel imagePanel = new ImagePanel(new ImageIcon("images/gray.png").getImage());
		
		JPanel container = new JPanel();
		container.add(imagePanel);
		container.setBackground(Color.WHITE);
		container.setSize(500, 500);
		JPanel panel = new JPanel(false);
		JScrollPane pane = new JScrollPane(container);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
		panel.add(tb, c);
		c.gridx = 0;
        c.gridy = 1;
		panel.add(pane, c);
		
		return panel;
	}
	
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		  }
		  @Override
		  public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, this);
		  }
	}
}
