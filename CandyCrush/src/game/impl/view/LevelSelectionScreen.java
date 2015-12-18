package game.impl.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

public class LevelSelectionScreen extends Panel {
	private static final long serialVersionUID = 3625091149745214897L;
	private List<Button> buttons;
	Image buffer;
	
	public LevelSelectionScreen(){
		buttons = new ArrayList<Button>();
		Button testButton = new Button("TEST");
		buttons.add(testButton);this.repaint();
	}
	
	// évite le syntillements
	@Override
    public void update(Graphics g) {
        paint(g);
    }

	@Override
	public void paint(Graphics g2) {
		if(buffer == null) buffer = createImage(800, 600);
        Graphics2D g = (Graphics2D) buffer.getGraphics();

        // fond
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // afficher la grille vide
        g.setColor(Color.BLACK);
        for(int i = 0; i < 9; i++) {
            g.drawLine(32 * i, 0, 32 * i, 8 * 32 + 1); 
            g.drawLine(0, 32 * i, 8 * 32 + 1, 32 * i); 
        }
     // copier l'image à l'écran
        g2.drawImage(buffer, 0, 0, null);
	}
	
	public void run(){
		this.repaint();
	}

}
