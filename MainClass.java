

public class MainClass {
	public static void main(String[] args) {
		float b = 4, h = 13, area;
		displayNumbers();
		System.out.println("Area of the triangle");
		area = areaOfTriangle(b, h);
		System.out.println(area);

	}

	public static void displayNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i );
			if(i <10)
				System.out.print(",");
		}
		System.out.println();
	}

	public static float areaOfTriangle(float b, float h) {
		return (b * h) / 2;
	}
}
