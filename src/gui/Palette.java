package gui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Palette extends JPanel{

	private final Map<String, ImageIcon> imageMap;
	
	public Palette() {
		setLayout(new FlowLayout());
		String[] nameList = { "JRadiobutton", "ButtonGroup", "JComboBox", "JList", "JTextField", "JTextArea", "JPanel", "JTabbedPane", "JScrollBar" };
		imageMap = createImageMap(nameList);
		@SuppressWarnings("unchecked")
		JList list = new JList(nameList);
		list.setCellRenderer(new ListRenderer());
		list.setSelectedIndex(0);
		add(new JScrollPane(list));
	}
	
	private Map<String, ImageIcon> createImageMap(String[] list) {
        Map<String, ImageIcon> map = new HashMap<>();
        for (String s : list) {
            map.put(s, new ImageIcon("images/"+ s +".png"));
        }
        return map;
    }
	
	public class ListRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);
            label.setIcon(imageMap.get((String) value));
            label.setHorizontalTextPosition(JLabel.RIGHT);
            return label;
        }
    }
}
