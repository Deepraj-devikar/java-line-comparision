package com.linecomparision;

import com.linecomparision.Line;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		
		Line line = new Line(1.5, 1.4, 8.3, 9.1);
		
		System.out.println("length of line is "+line.length());
		
	}
}
