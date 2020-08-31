package constructorProg;

public class Rectangle {

		int length, breadth;
		
		
		Rectangle()
		{
			length=0;
			breadth=0;
		}
		
		public Rectangle(int length, int breadth)
		{
			this.length=length;
			this.breadth=breadth;
		}

		public Rectangle(int number) {
			length=number;
			breadth=number;
			

		}

		public void calculatearea() {
			
			int area=length*breadth;
			System.out.println("The area of rectangle is :"+area);

		}
}
