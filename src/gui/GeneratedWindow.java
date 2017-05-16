package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GeneratedWindow extends JFrame {

	public GeneratedWindow(String[] inf) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
	    int screenWidth = screenSize.width;
	    setSize(screenWidth, screenHeight);
	    setTitle("NetBeans IDE 20050919-1127 - ContactEditor");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    Documents container = new Documents();
	    Explorer explorer = new Explorer();
	    Inspector inspector = new Inspector();
	    Menu menu = new Menu();
	    Palette palette = new Palette();
	    Properties properties = new Properties();
	    Tool tool = new Tool();
	    
	    JPanel north = new JPanel();
	    JPanel south = new JPanel();
	    JPanel west = new JPanel();
	    JPanel east = new JPanel();
	    JPanel center = new JPanel();
	    
	    JPanel N_north = new JPanel();
	    JPanel N_south = new JPanel();
	    JPanel N_west = new JPanel();
	    JPanel N_east = new JPanel();
	    JPanel N_center = new JPanel();
	    
	    JPanel S_north = new JPanel();
	    JPanel S_south = new JPanel();
	    JPanel S_west = new JPanel();
	    JPanel S_east = new JPanel();
	    JPanel S_center = new JPanel();
	    
	    JPanel W_north = new JPanel();
	    JPanel W_south = new JPanel();
	    JPanel W_west = new JPanel();
	    JPanel W_east = new JPanel();
	    JPanel W_center = new JPanel();
	    
	    JPanel E_north = new JPanel();
	    JPanel E_south = new JPanel();
	    JPanel E_west = new JPanel();
	    JPanel E_east = new JPanel();
	    JPanel E_center = new JPanel();
	    
	    JPanel C_north = new JPanel();
	    JPanel C_south = new JPanel();
	    JPanel C_west = new JPanel();
	    JPanel C_east = new JPanel();
	    JPanel C_center = new JPanel();
	    
	//Munu bar
	    if(inf[0] == "Up") {
	    	if(inf[1] == "up") {
	    		N_north.add(menu);
	    	} else if(inf[1] == "down") {
	    		N_south.add(menu);
	    	} else if(inf[1] == "left") {
	    		N_west.add(menu);
	    	} else if(inf[1] == "right") {
	    		N_east.add(menu);
	    	} else if(inf[1] == "center") {
	    		N_center.add(menu);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[0] == "Down") {
	    	if(inf[1] == "up") {
	    		S_north.add(menu);
	    	} else if(inf[1] == "down") {
	    		S_south.add(menu);
	    	} else if(inf[1] == "left") {
	    		S_west.add(menu);
	    	} else if(inf[1] == "right") {
	    		S_east.add(menu);
	    	} else if(inf[1] == "center") {
	    		S_center.add(menu);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[0] == "Left") {
	    	if(inf[1] == "up") {
	    		W_north.add(menu);
	    	} else if(inf[1] == "down") {
	    		W_south.add(menu);
	    	} else if(inf[1] == "left") {
	    		W_west.add(menu);
	    	} else if(inf[1] == "right") {
	    		W_east.add(menu);
	    	} else if(inf[1] == "center") {
	    		W_center.add(menu);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[0] == "Right") {
	    	if(inf[1] == "up") {
	    		E_north.add(menu);
	    	} else if(inf[1] == "down") {
	    		E_south.add(menu);
	    	} else if(inf[1] == "left") {
	    		E_west.add(menu);
	    	} else if(inf[1] == "right") {
	    		E_east.add(menu);
	    	} else if(inf[1] == "center") {
	    		E_center.add(menu);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[0] == "Center") {
	    	if(inf[1] == "up") {
	    		C_north.add(menu);
	    	} else if(inf[1] == "down") {
	    		C_south.add(menu);
	    	} else if(inf[1] == "left") {
	    		C_west.add(menu);
	    	} else if(inf[1] == "right") {
	    		C_east.add(menu);
	    	} else if(inf[1] == "center") {
	    		C_center.add(menu);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	//Tool bar
	    if(inf[2] == "Up") {
	    	if(inf[3] == "up") {
	    		N_north.add(tool);
	    	} else if(inf[3] == "down") {
	    		N_south.add(tool);
	    	} else if(inf[3] == "left") {
	    		N_west.add(tool);
	    	} else if(inf[3] == "right") {
	    		N_east.add(tool);
	    	} else if(inf[3] == "center") {
	    		N_center.add(tool);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[2] == "Down") {
	    	if(inf[3] == "up") {
	    		S_north.add(tool);
	    	} else if(inf[3] == "down") {
	    		S_south.add(tool);
	    	} else if(inf[3] == "left") {
	    		S_west.add(tool);
	    	} else if(inf[3] == "right") {
	    		S_east.add(tool);
	    	} else if(inf[3] == "center") {
	    		S_center.add(tool);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[2] == "Left") {
	    	if(inf[3] == "up") {
	    		W_north.add(tool);
	    	} else if(inf[3] == "down") {
	    		W_south.add(tool);
	    	} else if(inf[3] == "left") {
	    		W_west.add(tool);
	    	} else if(inf[3] == "right") {
	    		W_east.add(tool);
	    	} else if(inf[3] == "center") {
	    		W_center.add(tool);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[2] == "Right") {
	    	if(inf[3] == "up") {
	    		E_north.add(tool);
	    	} else if(inf[3] == "down") {
	    		E_south.add(tool);
	    	} else if(inf[3] == "left") {
	    		E_west.add(tool);
	    	} else if(inf[3] == "right") {
	    		E_east.add(tool);
	    	} else if(inf[2] == "center") {
	    		E_center.add(tool);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[2] == "Center") {
	    	if(inf[3] == "up") {
	    		C_north.add(tool);
	    	} else if(inf[3] == "down") {
	    		C_south.add(tool);
	    	} else if(inf[3] == "left") {
	    		C_west.add(tool);
	    	} else if(inf[3] == "right") {
	    		C_east.add(tool);
	    	} else if(inf[3] == "center") {
	    		C_center.add(tool);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	  //Explorer
	    if(inf[4] == "Up") {
	    	if(inf[5] == "up") {
	    		N_north.add(explorer);
	    	} else if(inf[5] == "down") {
	    		N_south.add(explorer);
	    	} else if(inf[5] == "left") {
	    		N_west.add(explorer);
	    	} else if(inf[5] == "right") {
	    		N_east.add(explorer);
	    	} else if(inf[5] == "center") {
	    		N_center.add(explorer);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[4] == "Down") {
	    	if(inf[5] == "up") {
	    		S_north.add(explorer);
	    	} else if(inf[5] == "down") {
	    		S_south.add(explorer);
	    	} else if(inf[5] == "left") {
	    		S_west.add(explorer);
	    	} else if(inf[5] == "right") {
	    		S_east.add(explorer);
	    	} else if(inf[5] == "center") {
	    		S_center.add(explorer);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[4] == "Left") {
	    	if(inf[5] == "up") {
	    		W_north.add(explorer);
	    	} else if(inf[5] == "down") {
	    		W_south.add(explorer);
	    	} else if(inf[5] == "left") {
	    		W_west.add(explorer);
	    	} else if(inf[5] == "right") {
	    		W_east.add(explorer);
	    	} else if(inf[5] == "center") {
	    		W_center.add(explorer);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[4] == "Right") {
	    	if(inf[5] == "up") {
	    		E_north.add(explorer);
	    	} else if(inf[5] == "down") {
	    		E_south.add(explorer);
	    	} else if(inf[5] == "left") {
	    		E_west.add(explorer);
	    	} else if(inf[5] == "right") {
	    		E_east.add(explorer);
	    	} else if(inf[5] == "center") {
	    		E_center.add(explorer);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[4] == "Center") {
	    	if(inf[5] == "up") {
	    		C_north.add(explorer);
	    	} else if(inf[5] == "down") {
	    		C_south.add(explorer);
	    	} else if(inf[5] == "left") {
	    		C_west.add(explorer);
	    	} else if(inf[5] == "right") {
	    		C_east.add(explorer);
	    	} else if(inf[5] == "center") {
	    		C_center.add(explorer);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	  //Inspector
	    if(inf[6] == "Up") {
	    	if(inf[7] == "up") {
	    		N_north.add(inspector);
	    	} else if(inf[7] == "down") {
	    		N_south.add(inspector);
	    	} else if(inf[7] == "left") {
	    		N_west.add(inspector);
	    	} else if(inf[7] == "right") {
	    		N_east.add(inspector);
	    	} else if(inf[7] == "center") {
	    		N_center.add(inspector);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[6] == "Down") {
	    	if(inf[7] == "up") {
	    		S_north.add(inspector);
	    	} else if(inf[7] == "down") {
	    		S_south.add(inspector);
	    	} else if(inf[7] == "left") {
	    		S_west.add(inspector);
	    	} else if(inf[7] == "right") {
	    		S_east.add(inspector);
	    	} else if(inf[7] == "center") {
	    		S_center.add(inspector);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[6] == "Left") {
	    	if(inf[7] == "up") {
	    		W_north.add(inspector);
	    	} else if(inf[7] == "down") {
	    		W_south.add(inspector);
	    	} else if(inf[7] == "left") {
	    		W_west.add(inspector);
	    	} else if(inf[7] == "right") {
	    		W_east.add(inspector);
	    	} else if(inf[7] == "center") {
	    		W_center.add(inspector);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[6] == "Right") {
	    	if(inf[7] == "up") {
	    		E_north.add(inspector);
	    	} else if(inf[7] == "down") {
	    		E_south.add(inspector);
	    	} else if(inf[7] == "left") {
	    		E_west.add(inspector);
	    	} else if(inf[7] == "right") {
	    		E_east.add(inspector);
	    	} else if(inf[7] == "center") {
	    		E_center.add(inspector);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[6] == "Center") {
	    	if(inf[7] == "up") {
	    		C_north.add(inspector);
	    	} else if(inf[7] == "down") {
	    		C_south.add(inspector);
	    	} else if(inf[7] == "left") {
	    		C_west.add(inspector);
	    	} else if(inf[7] == "right") {
	    		C_east.add(inspector);
	    	} else if(inf[7] == "center") {
	    		C_center.add(inspector);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	  //Documents
	    if(inf[8] == "Up") {
	    	if(inf[9] == "up") {
	    		N_north.add(container);
	    	} else if(inf[9] == "down") {
	    		N_south.add(container);
	    	} else if(inf[9] == "left") {
	    		N_west.add(container);
	    	} else if(inf[9] == "right") {
	    		N_east.add(container);
	    	} else if(inf[9] == "center") {
	    		N_center.add(container);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[8] == "Down") {
	    	if(inf[9] == "up") {
	    		S_north.add(container);
	    	} else if(inf[9] == "down") {
	    		S_south.add(container);
	    	} else if(inf[9] == "left") {
	    		S_west.add(container);
	    	} else if(inf[9] == "right") {
	    		S_east.add(container);
	    	} else if(inf[9] == "center") {
	    		S_center.add(container);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[8] == "Left") {
	    	if(inf[9] == "up") {
	    		W_north.add(container);
	    	} else if(inf[9] == "down") {
	    		W_south.add(container);
	    	} else if(inf[9] == "left") {
	    		W_west.add(container);
	    	} else if(inf[9] == "right") {
	    		W_east.add(container);
	    	} else if(inf[9] == "center") {
	    		W_center.add(container);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[8] == "Right") {
	    	if(inf[9] == "up") {
	    		E_north.add(container);
	    	} else if(inf[9] == "down") {
	    		E_south.add(container);
	    	} else if(inf[9] == "left") {
	    		E_west.add(container);
	    	} else if(inf[9] == "right") {
	    		E_east.add(container);
	    	} else if(inf[9] == "center") {
	    		E_center.add(container);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[8] == "Center") {
	    	if(inf[9] == "up") {
	    		C_north.add(container);
	    	} else if(inf[9] == "down") {
	    		C_south.add(container);
	    	} else if(inf[9] == "left") {
	    		C_west.add(container);
	    	} else if(inf[9] == "right") {
	    		C_east.add(container);
	    	} else if(inf[9] == "center") {
	    		C_center.add(container);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	  //Palette
	    if(inf[10] == "Up") {
	    	if(inf[11] == "up") {
	    		N_north.add(palette);
	    	} else if(inf[11] == "down") {
	    		N_south.add(palette);
	    	} else if(inf[11] == "left") {
	    		N_west.add(palette);
	    	} else if(inf[11] == "right") {
	    		N_east.add(palette);
	    	} else if(inf[11] == "center") {
	    		N_center.add(palette);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[10] == "Down") {
	    	if(inf[11] == "up") {
	    		S_north.add(palette);
	    	} else if(inf[11] == "down") {
	    		S_south.add(palette);
	    	} else if(inf[11] == "left") {
	    		S_west.add(palette);
	    	} else if(inf[11] == "right") {
	    		S_east.add(palette);
	    	} else if(inf[11] == "center") {
	    		S_center.add(palette);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[10] == "Left") {
	    	if(inf[11] == "up") {
	    		W_north.add(palette);
	    	} else if(inf[11] == "down") {
	    		W_south.add(palette);
	    	} else if(inf[11] == "left") {
	    		W_west.add(palette);
	    	} else if(inf[11] == "right") {
	    		W_east.add(palette);
	    	} else if(inf[11] == "center") {
	    		W_center.add(palette);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[10] == "Right") {
	    	if(inf[11] == "up") {
	    		E_north.add(palette);
	    	} else if(inf[11] == "down") {
	    		E_south.add(palette);
	    	} else if(inf[11] == "left") {
	    		E_west.add(palette);
	    	} else if(inf[11] == "right") {
	    		E_east.add(palette);
	    	} else if(inf[11] == "center") {
	    		E_center.add(palette);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[10] == "Center") {
	    	if(inf[11] == "up") {
	    		C_north.add(palette);
	    	} else if(inf[11] == "down") {
	    		C_south.add(palette);
	    	} else if(inf[11] == "left") {
	    		C_west.add(palette);
	    	} else if(inf[11] == "right") {
	    		C_east.add(palette);
	    	} else if(inf[11] == "center") {
	    		C_center.add(palette);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	  //Properties
	    if(inf[12] == "Up") {
	    	if(inf[13] == "up") {
	    		N_north.add(properties);
	    	} else if(inf[13] == "down") {
	    		N_south.add(properties);
	    	} else if(inf[13] == "left") {
	    		N_west.add(properties);
	    	} else if(inf[13] == "right") {
	    		N_east.add(properties);
	    	} else if(inf[13] == "center") {
	    		N_center.add(properties);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[12] == "Down") {
	    	if(inf[13] == "up") {
	    		S_north.add(properties);
	    	} else if(inf[13] == "down") {
	    		S_south.add(properties);
	    	} else if(inf[13] == "left") {
	    		S_west.add(properties);
	    	} else if(inf[13] == "right") {
	    		S_east.add(properties);
	    	} else if(inf[13] == "center") {
	    		S_center.add(properties);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[12] == "Left") {
	    	if(inf[13] == "up") {
	    		W_north.add(properties);
	    	} else if(inf[13] == "down") {
	    		W_south.add(properties);
	    	} else if(inf[13] == "left") {
	    		W_west.add(properties);
	    	} else if(inf[13] == "right") {
	    		W_east.add(properties);
	    	} else if(inf[13] == "center") {
	    		W_center.add(properties);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[12] == "Right") {
	    	if(inf[13] == "up") {
	    		E_north.add(properties);
	    	} else if(inf[13] == "down") {
	    		E_south.add(properties);
	    	} else if(inf[13] == "left") {
	    		E_west.add(properties);
	    	} else if(inf[13] == "right") {
	    		E_east.add(properties);
	    	} else if(inf[13] == "center") {
	    		E_center.add(properties);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    } else if(inf[12] == "Center") {
	    	if(inf[13] == "up") {
	    		C_north.add(properties);
	    	} else if(inf[13] == "down") {
	    		C_south.add(properties);
	    	} else if(inf[13] == "left") {
	    		C_west.add(properties);
	    	} else if(inf[13] == "right") {
	    		C_east.add(properties);
	    	} else if(inf[13] == "center") {
	    		C_center.add(properties);
	    	} else {
	    		JOptionPane.showMessageDialog(this, "Something went wrong.");
	    	}
	    }
	    
	    north.add(N_north, BorderLayout.NORTH);
	    north.add(N_south, BorderLayout.SOUTH);
	    north.add(N_west, BorderLayout.WEST);
	    north.add(N_east, BorderLayout.EAST);
	    north.add(N_center, BorderLayout.CENTER);
	    
	    south.add(S_north, BorderLayout.NORTH);
	    south.add(S_south, BorderLayout.SOUTH);
	    south.add(S_west, BorderLayout.WEST);
	    south.add(S_east, BorderLayout.EAST);
	    south.add(S_center, BorderLayout.CENTER);
	    
	    west.add(W_north, BorderLayout.NORTH);
	    west.add(W_south, BorderLayout.SOUTH);
	    west.add(W_west, BorderLayout.WEST);
	    west.add(W_east, BorderLayout.EAST);
	    west.add(W_center, BorderLayout.CENTER);
	    
	    east.add(E_north, BorderLayout.NORTH);
	    east.add(E_south, BorderLayout.SOUTH);
	    east.add(E_west, BorderLayout.WEST);
	    east.add(E_east, BorderLayout.EAST);
	    east.add(E_center, BorderLayout.CENTER);
	    
	    center.add(C_north, BorderLayout.NORTH);
	    center.add(C_south, BorderLayout.SOUTH);
	    center.add(C_west, BorderLayout.WEST);
	    center.add(C_east, BorderLayout.EAST);
	    center.add(C_center, BorderLayout.CENTER);
	    
	    add(north, BorderLayout.NORTH);
	    add(south, BorderLayout.SOUTH);
	    add(west, BorderLayout.WEST);
	    add(east, BorderLayout.EAST);
	    add(center, BorderLayout.CENTER);
	}
	
}
