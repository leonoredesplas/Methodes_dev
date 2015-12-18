package game.impl.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import game.impl.view.LevelSelectionScreen;
import game.interfaces.IController;

public class LevelSelectionController 
	implements IController,MouseListener, MouseMotionListener {
	private LevelSelectionScreen screen;
	
	public LevelSelectionController() {
		this.screen = new LevelSelectionScreen();
		this.screen.addMouseListener(this);
	}

	public LevelSelectionScreen getScreen() {
		return screen;
	}

	public void setScreen(LevelSelectionScreen screen) {
		this.screen = screen;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

}
