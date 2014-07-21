package com.thilina.pictogram.images;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.thilina.pictogram.model.PictogramBufferedImageModel;

/**
 * Example vertical pictogram image model
 * 
 * @author thilina
 * 
 */
public class VerticalPictogram extends PictogramBufferedImageModel {

	private int scale;
	private BufferedImage imageOne;
	private BufferedImage imageTwo;
	private int imageScale;
	private int percentage;

	public VerticalPictogram(int width, int height, String format, int scale, BufferedImage imageOne, BufferedImage imageTwo, int imageScale, int percentage) {
		super(width, height, format);
		this.scale = scale;
		this.imageOne = imageOne;
		this.imageTwo = imageTwo;
		this.imageScale = imageScale;
		this.percentage = percentage;
	}

	/**
	 * {@inheritDoc}
	 */
	public void draw(Graphics2D graphics) {
		graphics.setStroke(new BasicStroke(5));
		graphics.setBackground(Color.WHITE);
		graphics.fillRect(0, 0, scale, scale);

		int count = 1;
		for (int g = (scale - imageScale); g >= 0; g = g - imageScale) {
			for (int i = (scale - imageScale); i >= 0; i = i - imageScale) {
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
