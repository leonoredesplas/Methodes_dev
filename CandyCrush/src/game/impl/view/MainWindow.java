package game.impl.view;

import java.awt.Frame;
import java.awt.Panel;

/**
 * Container of the views
 * @author Leonore des PLAS
 *
 */
public class MainWindow extends Frame{
	private static final long serialVersionUID = 1879795689794948962L;
	
	private Panel view;
	
	public MainWindow(Panel view){
		this.view = view;
		this.add(view);
		this.setVisible(true);
	}
	
	public void setView(Panel view){
		this.view=view;
	}
	
	public Panel getView(){
		return this.view;
	}
}
