package com.thilina.pictogram;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.thilina.pictogram.images.HorizontalPictogram;
import com.thilina.pictogram.images.VerticalPictogram;

/**
 * Pictogram image drawing example
 * 
 * @author thilina
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		BufferedImage image1 = ImageIO.read(new File("man.png"));
		BufferedImage image2 = ImageIO.read(new File("woman.png"));

		HorizontalPictogram hp = new HorizontalPictogram(300, 300, "PNG", 300, image1, image2, 30, 5);
		ImageIO.write(hp.getBufferedImage(), "PNG", new File("PICTOGRAMH.png"));

		VerticalPictogram vp = new VerticalPictogram(300, 300, "PNG", 300, image1, image2, 30, 5);
		ImageIO.write(vp.getBufferedImage(), "PNG", new File("PICTOGRAMV.png"));
	}

}
