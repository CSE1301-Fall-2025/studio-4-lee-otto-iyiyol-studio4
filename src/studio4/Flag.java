package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.8,0.8,0.8,0.4);
		
		StdDraw.setPenRadius(0.4);
		StdDraw.setPenColor(Color.RED);
		StdDraw.point(0.5,0.5);

		//StdDraw.setPenColor(Color.BLUE);
		//StdDraw.filledRectangle(0.1,0.4,0.2,0.8);

		//StdDraw.setPenColor(Color.WHITE);
		//StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.7);

		//StdDraw.setPenColor(Color.RED);
		//StdDraw.filledRectangle(0.7, 0.2, 0.4, 0.5);
	}
}