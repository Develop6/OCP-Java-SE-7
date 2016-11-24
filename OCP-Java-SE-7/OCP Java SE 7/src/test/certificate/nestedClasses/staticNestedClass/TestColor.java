package test.certificate.nestedClasses.staticNestedClass;

import test.certificate.nestedClasses.staticNestedClass.Shape.Color;

public class TestColor {

	public static void main(String []args) {
		// since Color is a static nested class,
		// we access it using the name of the outer class, as in Shape.Color
		// note that we do not (and cannot) instantiate Shape class for using Color class
		
		Shape.Color white = new Shape.Color(255, 255, 255);
		System.out.println("White color has values:" + white);
		
		System.out.println("Count: " + Shape.count);
		
		Shape.Color black = new Shape.Color(0, 0, 0);
		System.out.println("Black color has values:" + white);
		
		System.out.println("Count: " + Shape.count);
		
		Shape shape = new Shape();
		System.out.println("Test: " + Color.test);
	}		
}
