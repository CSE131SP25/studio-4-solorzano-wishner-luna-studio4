package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		String string = in.next();
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		StdDraw.setPenColor(red, blue, green);
		boolean filled = in.nextBoolean();
		if(string.equals("ellipse")) {
			double a= in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			double d=in.nextDouble();
			if(filled==true) {
				StdDraw.filledEllipse(a, b, c, d);
			}else {
				StdDraw.ellipse(a, b, c, d);}
			
	
			
		
		}else if (string.equals("rectangle")) {
			double a= in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			double d=in.nextDouble();
			if (filled==true) {
				StdDraw.filledRectangle(a, b, c, d);
			}
				StdDraw.rectangle(a, b, c, d);
		}else {
			double a= in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			double d=in.nextDouble();
			double e=in.nextDouble();
			double g=in.nextDouble();
			
			double[] arrayX= {a,b,c};
			double [] arrayY = {d,e,g};
			if (filled==true) {
				StdDraw.filledPolygon(arrayX, arrayY);
			}else {
				StdDraw.polygon(arrayX, arrayY);
			}
			
			
		}
		
	
		}
		
		
		
		
		
	}

