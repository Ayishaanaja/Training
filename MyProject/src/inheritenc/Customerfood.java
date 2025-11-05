package inheritenc;

import java.util.Scanner;

public class Customerfood extends Hotel{
	public void customer()
	{
		System.out.println("customer info");
	}
public static void main(String[] args) {
	Vegfood vg=new Customerfood();
	Customerfood c=new Customerfood();
	Nonvegfood non=new Customerfood();
	Hotel h=new Customerfood();
	h.vegnoodles();
	h.chickennoodles();
	h.total();
	vg.pulaav();
	vg.vegnoodles();
	c.cb();
	c.total();
	c.customer();
	non.chickennoodles();
}
}
