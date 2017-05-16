package gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class Explorer extends JPanel{

	public Explorer() {
		JTabbedPane pane = new JTabbedPane();
		
		JComponent panel1 = makeTreePanel();
		pane.addTab("Projects", panel1);
		pane.setMnemonicAt(0, KeyEvent.VK_1);
        
        JComponent panel2 = makeTextPanel("Files");
        pane.addTab("Files", panel2);
        pane.setMnemonicAt(1, KeyEvent.VK_2);
        
        JComponent panel3 = makeTextPanel("Runtime");
        pane.addTab("Runtime", panel3);
        pane.setMnemonicAt(2, KeyEvent.VK_3);
        
        add(new JScrollPane(pane));
	}
	
	protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
	
	protected JComponent makeTreePanel() {
        JPanel panel = new JPanel();
      //Create the nodes.
        DefaultMutableTreeNode top =
            new DefaultMutableTreeNode("ContactEditorUI");
        createNodes(top);

        //Create a tree that allows one selection at a time.
        JTree tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);

        Dimension minimumSize = new Dimension(100, 50);
        treeView.setMinimumSize(minimumSize);
        
        panel.setLayout(new GridLayout(1, 1));
        panel.add(treeView);
        panel.setPreferredSize(new Dimension(250, 250));
        return panel;
    }
	
	private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Source Packages");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
            category.add(book);

        category = new DefaultMutableTreeNode("Text Packages");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
        category.add(book);
        
        category = new DefaultMutableTreeNode("Libraries");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
            category.add(book);

        category = new DefaultMutableTreeNode("Text Libraries");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
        category.add(book);
    }
}
