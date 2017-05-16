package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class Tool extends JToolBar{

	public Tool() {
		super(SwingConstants.HORIZONTAL);
		JProgressBar bar = new JProgressBar();
		add(bar);
		
		addSeparator();
		
		JButton btn1 = new JButton();
		btn1.setIcon(new ImageIcon("images/new.png"));
		add(btn1);
		JButton btn2 = new JButton();
		btn2.setIcon(new ImageIcon("images/double_new.png"));
		add(btn2);
		JButton btn3 = new JButton();
		btn3.setIcon(new ImageIcon("images/open.png"));
		add(btn3);
		JButton btn4 = new JButton();
		btn4.setIcon(new ImageIcon("images/save.png"));
		add(btn4);
		
		addSeparator();
		
		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon("images/cut.png"));
		add(btn5);
		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon("images/copy.png"));
		add(btn6);
		JButton btn7 = new JButton();
		btn7.setIcon(new ImageIcon("images/paste.png"));
		add(btn7);
		JButton btn8 = new JButton();
		btn8.setIcon(new ImageIcon("images/undo.png"));
		add(btn8);
		JButton btn9 = new JButton();
		btn9.setIcon(new ImageIcon("images/redo.png"));
		add(btn9);
		JButton btn10 = new JButton();
		btn10.setIcon(new ImageIcon("images/search.png"));
		add(btn10);
		
		addSeparator();
		
		JButton btn11 = new JButton();
		btn11.setIcon(new ImageIcon("images/wrench.png"));
		add(btn11);
		JButton btn12 = new JButton();
		btn12.setIcon(new ImageIcon("images/tools.png"));
		add(btn12);
		JButton btn13 = new JButton();
		btn13.setIcon(new ImageIcon("images/build.png"));
		add(btn13);
		JButton btn14 = new JButton();
		btn14.setIcon(new ImageIcon("images/run.png"));
		add(btn14);
		JButton btn15 = new JButton();
		btn15.setIcon(new ImageIcon("images/run_last.png"));
		add(btn15);
	}
}
