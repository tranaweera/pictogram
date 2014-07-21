package com.thilina.pictogram.model;

import java.awt.Graphics2D;

/**
 * Pictogram 2D image drawing model
 * 
 * @author thilina
 * 
 */
public interface PictogramImageModel {
	/**
	 * Draw the 2D image according to specified scenario
	 * 
	 * @param graphics
	 */
	public void draw(Graphics2D graphics);
}
