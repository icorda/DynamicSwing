package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Menu extends JMenuBar{

	public Menu() {
		JMenu file=new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu view=new JMenu("View");
		JMenu goTo=new JMenu("Go To");
		JMenu source=new JMenu("Source");
		JMenu build=new JMenu("Build");
		JMenu run=new JMenu("Run");
		JMenu refactor=new JMenu("Refactor");
		JMenu cvs=new JMenu("CVS");
		JMenu tools=new JMenu("Tools");
		JMenu window=new JMenu("Window");
		JMenu help=new JMenu("Help");
		
		add(file);
		add(edit);
		add(view);
		add(goTo);
		add(source);
		add(build);
		add(run);
		add(refactor);
		add(cvs);
		add(tools);
		add(window);
		add(help);
	}
}
