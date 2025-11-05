//INSTANCE VARIABLE EXAMPLE
/*package com.example;

public class Dog {
	int legs=4;//instance variable
	void eat()//instance method
	{
		System.out.println("eats bone");
	}
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println("Dog has" + d.legs +" legs");
	d.eat();
}
}*/
//STATIC VARIABLE EXAMPLE
package com.example;



public class Dog {

static int legs=4;

static void eat()

{

	System.out.println("Eats Bones");

}

public static void main(String[] args) {

	Dog.eat();

	System.out.println(Dog.legs);

	Dog d=new Dog();

	d.eat();

	System.out.println(d.legs);

}

}

