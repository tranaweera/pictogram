package com.thilina.pictogram.model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Pictogram BufferedImage drawing model
 * 
 * @author thilina
 * 
 */
public abstract class PictogramBufferedImageModel implements PictogramImageModel {

	private static final long serialVersionUID = 1L;

	// private final String format = "png";

	/**
	 * Image width
	 */
	private int width;

	/**
	 * Image height
	 */
	private int height;

	/**
	 * Image format
	 */
	private String format;

	/**
	 * Initialize pictogram image dimensions and type
	 * 
	 * @param width
	 * @param height
	 * @param format
	 */
	public PictogramBufferedImageModel(final int width, final int height, final String format) {
		super();
		this.width = width;
		this.height = height;
		this.format = format;
	}

	/**
	 * Create buffered image
	 * 
	 * @return {@link BufferedImage}
	 */
	public BufferedImage getBufferedImage() {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		draw(g2);
		g2.dispose();
		return image;
	}

	/**
	 * Create image byte array
	 * 
	 * @return Image byte array
	 */
	public byte[] toImageData() {
		BufferedImage image = getBufferedImage();
		try {
			// Create output stream
			final ByteArrayOutputStream out = new ByteArrayOutputStream();

			// Write image using any matching ImageWriter
			ImageIO.write(image, format, out);

			// Return the image data
			return out.toByteArray();
		} catch (IOException e) {
			throw new RuntimeException("Unable to convert dynamic image to stream", e);
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
