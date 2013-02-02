package com.thilina.pictogram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.Serializable;

public class VerticlePictogram implements Pictogram, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int scale;
	private BufferedImage imageOne;
	private BufferedImage imageTwo;
	private int imageScale;
	private int percentage;
	
	public VerticlePictogram(int scale, BufferedImage imageOne,
			BufferedImage imageTwo, int imageScale, int percentage) {
		this.scale = scale;
		this.imageOne = imageOne;
		this.imageTwo = imageTwo;
		this.imageScale = imageScale;
		this.percentage = percentage;
	}

	
	public void draw(Graphics2D graphics) {
		
		graphics.setStroke(new BasicStroke(5));
		graphics.setBackground(Color.WHITE);
		graphics.fillRect(0, 0, scale, scale);
		

		int count =1;		
		for (int g = (scale-imageScale); g >= 0; g = g - imageScale) {
			for (int i = (scale-imageScale); i >= 0; i = i - imageScale) {
				if (count <= percentage) {
					graphics.drawImage(imageTwo, g, i, null);
				} else {
					graphics.drawImage(imageOne, g, i, null);
				}
				++count;
			}
		}

	}

}
