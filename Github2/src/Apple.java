
public class Apple {
	String color;
	Apple(String color)
	{
		this.color=color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple A1 = new Apple("Red");
		String color = A1.getColor();
		System.out.println("color of apple is " + color);


	}

}
