package inheritenc;

public class Monkey extends Tiger {
void eat()
{
	super.eat();
	System.out.println("Eats banana");
}
public static void main(String[] args) {
	Monkey m=new Monkey();
	m.eat();
	m.run();
}
}
