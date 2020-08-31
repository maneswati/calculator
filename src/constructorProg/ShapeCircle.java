package constructorProg;

public class ShapeCircle {
	
	float radius, pi=3.5f;
	
	ShapeCircle(float radius)
	{
		this.radius=radius;
		
	}
	ShapeCircle(float radius,float pi)
	{
		this.radius=radius;
		this.pi=pi;
		
	}

	void shapecircle(float radius)
	{
		float shape=radius*radius*pi;
		System.out.println("The Shape of circle is :"+shape);
	}
}
