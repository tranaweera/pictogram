package com.thilina.pictogram;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome Pictogram" );
        try{
        int width = 300, height = 300;
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        
        BufferedImage image1= ImageIO.read(new File("man.png"));
        BufferedImage image2= ImageIO.read(new File("woman.png"));
        
        HorizontalPictogram hp=new HorizontalPictogram(height, image1,image2, 30,5);
        Graphics2D ig2 = bi.createGraphics();
        hp.draw(ig2);
        ImageIO.write(bi, "PNG", new File("PICTOGRAM.png"));
        }catch(IOException e){
        	e.printStackTrace();
        }

    }
}
