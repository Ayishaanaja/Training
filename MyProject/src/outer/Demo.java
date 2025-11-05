package outer;

import pack.Calc;

public class Demo extends Calc {
	public static void main(String[] args) {
		Calc.add(56, 78);
		Demo d=new Demo();
		d.pinne();
	}

}
