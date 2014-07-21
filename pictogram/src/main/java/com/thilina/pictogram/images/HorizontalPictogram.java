package com.thilina.pictogram.images;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.thilina.pictogram.model.PictogramBufferedImageModel;

/**
 * Example horizontal pictogram image model
 * 
 * @author thilina
 * 
 */
public class HorizontalPictogram extends PictogramBufferedImageModel {

	private int scale;
	private BufferedImage imageOne;
	private BufferedImage imageTwo;
	private int imageScale;
	private int percentage;

	public HorizontalPictogram(int width, int height, String format, int scale, BufferedImage imageOne, BufferedImage imageTwo, int imageScale, int percentage) {
		super(width, height, format);
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

		int count = 1;
		for (int g = 1; g < scale; g = g + imageScale) {
			for (int i = 1; i < scale; i = i + imageScale) {

				if (count <= (100 - percentage)) {
					graphics.drawImage(imageOne, i, g, null);
				} else {
					graphics.drawImage(imageTwo, i, g, null);
				}
				++count;
			}
		}

	}

}
