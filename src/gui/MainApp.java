package gui;
import java.awt.EventQueue;


public class MainApp {

	public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
            	InputWindow iw = new InputWindow();
                iw.setVisible(true);
            }
        });
    }
	
}
