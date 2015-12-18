package main;

import game.impl.controller.LevelSelectionController;
import game.impl.view.LevelSelectionScreen;
import game.impl.view.MainWindow;

public class Main {
	public static void main(String[] args){
		LevelSelectionController lvlcontroller = new LevelSelectionController();

		MainWindow w = new MainWindow(lvlcontroller.getScreen());
	}
}
