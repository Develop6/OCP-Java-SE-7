package test.certificate.nestedClasses.staticNestedClass;

class Shape {
	
	public static int count = 0;
	Color col;
	
	public Shape() {
		this.col = new Color(23,56,78);
		System.out.println("m_blue: " + this.col.m_blue);
		System.out.println("Test: " + Color.test);
	}

	public static class Color { // statc nested class
		int m_red, m_green, m_blue;
		public static int test = 4;

		public Color() {
			// call the other overloaded Color constructor by passing default values
			this(0, 0, 0);
		}

		public Color(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
			count ++;
			test ++;
		}

		public String toString() {
			return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
		}
	}
}