package selfreview;

public class Cat extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();
	}

	@Override
	void testClassMethod() {
		// TODO Auto-generated method stub
		System.out.println("The class method in Cat.");
	}
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat.");
	}

}
