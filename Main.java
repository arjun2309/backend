package practice1;

public class Main {
	public static void main(String args[]) {
Person person1=new Person("Arjun",23);
Person person2=new Person("Kumar",25);
System.out.println("Person1 name is "+person1.getName()+" and he is "+person1.getAge()+" years old");
System.out.println("Person2 name is "+person2.getName()+" and he is "+person2.getAge()+" years old");

person1.setAge(27);
person1.setName("Arun");
System.out.println("Person1 name is "+person1.getName()+" and he is "+person1.getAge()+" years old");


Rectangle rectangle1=new Rectangle(23,3);
Rectangle rectangle2=new Rectangle(7,3);
//Area
System.out.println("Area of height: "+rectangle1.getHeight()+" and width: "+rectangle1.getWidth()+" is "+rectangle1.getArea());
System.out.println("Area of height: "+rectangle2.getHeight()+" and width: "+rectangle2.getWidth()+" is "+rectangle2.getArea());

//perimeter
System.out.println("perimeter of height: "+rectangle1.getHeight()+" and width: "+rectangle1.getWidth()+" is "+rectangle1.getPerimeter());
System.out.println("perimeter of height: "+rectangle2.getHeight()+" and width: "+rectangle2.getWidth()+" is "+rectangle2.getPerimeter());
	}

}
