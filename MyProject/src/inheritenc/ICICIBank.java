package inheritenc;

public class ICICIBank implements Loan {

	@Override
	public void interestRate(int amount) {
		System.out.println("the interest for the given amount "+amount+" in ICICIBank is : "+amount*0.2);
		
	}

}
