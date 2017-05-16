package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

public class Properties extends JPanel{
	
	public Properties() {
        JPanel panel1 = new JPanel();
        JLabel lbl1 = new JLabel("C:\'Documents and...");
        JButton btn1 = new JButton("...");
        panel1.add(lbl1);
        panel1.add(btn1);
        
        Object[][] data1 = {
        		{"Name", "ContactEditorUI"},
        		{"All Files", "C:\'Documents and..."},
        		{"File size", "1807"},
        		{"Modification time", "1807"},
        		{"Syncronisation mode", "Confirm all chan..."}
        };
        String[] column1 = {"Properties", ""};
        
        class TableCellRenderer1 extends JPanel implements TableCellRenderer {
            public Component getTableCellRendererComponent(
                                final JTable table, Object value,
                                boolean isSelected, boolean hasFocus,
                                int row, int column) {
            	if(row == 1 && column == 1) {
            		JPanel p = new JPanel();
            		JTextField f = new JTextField("C:\'Documents and...");
            		f.setEditable(false);
            		JButton b = new JButton("...");
            		b.setPreferredSize(new Dimension(15, 15));
            		p.add(f, BorderLayout.EAST);
            		p.add(b, BorderLayout.WEST);
            		this.add(p);
            	}
            	if(row == 4 && column == 1) {
            		String[] s = {"Confirm all chan..."};
                    JComboBox cb = new JComboBox(s);
                    this.add(cb);
            	}
            	return this;
            }
        }
        
        final JTable table1 = new JTable(data1, column1);
        table1.setDefaultRenderer(Object.class, new TableCellRenderer1());
        table1.setPreferredScrollableViewportSize(new Dimension(500, 150));
        table1.setFillsViewportHeight(true);
        
        Object[][] data2 = {
        		{"Encoding", ""}
        };
        String[] column2 = {"Text", ""};
        
        class TableCellRenderer2 extends JPanel implements TableCellRenderer {
            public Component getTableCellRendererComponent(
                                final JTable table, Object value,
                                boolean isSelected, boolean hasFocus,
                                int row, int column) {
            	if(row == 0 && column == 1) {
            		JPanel p = new JPanel();
            		JTextField f = new JTextField("");
            		f.setEditable(false);
            		JButton b = new JButton("...");
            		b.setPreferredSize(new Dimension(15, 15));
            		p.add(f, BorderLayout.EAST);
            		p.add(b, BorderLayout.WEST);
            		this.add(p);
            	}
            	return this;
            }
        }
        
        final JTable table2 = new JTable(data2, column2);
        table2.setDefaultRenderer(Object.class, new TableCellRenderer2());
        table2.setPreferredScrollableViewportSize(new Dimension(500, 150));
        table2.setFillsViewportHeight(true);
        
        Object[][] data3 = {
        		{"Compile Classpath", "C:\'Drivers & Softw..."},
        		{"Runtime Classpath", "C:\'Drivers & Softw..."},
        		{"Boot Classpath", "C:\'jdk.1.5.0_04.jre..."}
        };
        String[] column3 = {"Classpaths", ""};
        
        class TableCellRenderer3 extends JPanel implements TableCellRenderer {
            public Component getTableCellRendererComponent(
                                final JTable table, Object value,
                                boolean isSelected, boolean hasFocus,
                                int row, int column) {
            	if(row == 0 && column == 1) {
            		JPanel p = new JPanel();
            		JTextField f = new JTextField("C:\'Drivers & Softw...");
            		f.setEditable(false);
            		JButton b = new JButton("...");
            		b.setPreferredSize(new Dimension(15, 15));
            		p.add(f, BorderLayout.EAST);
            		p.add(b, BorderLayout.WEST);
            		this.add(p);
            	}
            	if(row == 1 && column == 1) {
            		JPanel p = new JPanel();
            		JTextField f = new JTextField("C:\'Drivers & Softw...");
            		f.setEditable(false);
            		JButton b = new JButton("...");
            		b.setPreferredSize(new Dimension(15, 15));
            		p.add(f, BorderLayout.EAST);
            		p.add(b, BorderLayout.WEST);
            		this.add(p);
            	}
            	if(row == 2 && column == 1) {
            		JPanel p = new JPanel();
            		JTextField f = new JTextField("C:\'jdk.1.5.0_04.jre...");
            		f.setEditable(false);
            		JButton b = new JButton("...");
            		b.setPreferredSize(new Dimension(15, 15));
            		p.add(f, BorderLayout.EAST);
            		p.add(b, BorderLayout.WEST);
            		this.add(p);
            	}
            	return this;
            }
        }
        
        final JTable table3 = new JTable(data3, column3);
        table3.setDefaultRenderer(Object.class, new TableCellRenderer3());
        table3.setPreferredScrollableViewportSize(new Dimension(500, 150));
        table3.setFillsViewportHeight(true);
        
        JLabel label1 = new JLabel("Properties");
        JLabel label2 = new JLabel("Text");
        JLabel label3 = new JLabel("Classpaths");
        JLabel label4 = new JLabel("ContactEditorUI.java");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(label1,c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(table1,c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(label2,c);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(table2,c);
        c.gridx = 0;
        c.gridy = 4;
        panel.add(label3,c);
        c.gridx = 0;
        c.gridy = 5;
        panel.add(table3,c);
        c.gridx = 0;
        c.gridy = 6;
        panel.add(label4,c);

        JScrollPane scrollPane = new JScrollPane(panel);

        add(scrollPane);
	}
}
