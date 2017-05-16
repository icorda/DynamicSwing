package gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class Inspector extends JPanel{
	
	private JTree tree;
	private static boolean DEBUG = false;
	
	public Inspector() {
        DefaultMutableTreeNode top =
            new DefaultMutableTreeNode("Form ContactEditorUI");
        createNodes(top);

        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);

        JScrollPane treeView = new JScrollPane(tree);

        Dimension minimumSize = new Dimension(100, 50);
        treeView.setMinimumSize(minimumSize);
        setPreferredSize(new Dimension(250, 250));

        add(treeView);
	}
	
	private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Other Components");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
            category.add(book);

        category = new DefaultMutableTreeNode("[JFrame]");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Something");
        category.add(book);
    }
}
