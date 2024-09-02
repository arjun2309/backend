package practice1;


	public class Animal {
	    // Method in the parent class
	    public void sound() {
	        System.out.println("The animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    // Overriding the sound() method
	    @Override
	    public void sound() {
	        System.out.println("The dog barks");
	    }
	}

	class Cat extends Animal {
	    // Overriding the sound() method
	    @Override
	    public void sound() {
	        System.out.println("The cat meows");
	    }
	
	
	public static void main(String[] args) {
		  Animal myAnimal = new Animal();
	        // Creates a Dog object, but references it as an Animal
	        Animal myDog = new Dog();
	        // Creates a Cat object, but references it as an Animal
	        Animal myCat = new Cat();

	        // Calls the sound() method on each object
	        myAnimal.sound(); // Output: The animal makes a sound
	        myDog.sound();    // Output: The dog barks
	        myCat.sound();
	}
}

