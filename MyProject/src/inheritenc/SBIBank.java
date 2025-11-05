package inheritenc;

public class SBIBank implements Loan{

	@Override
	public void interestRate(int amount) {
		System.out.println("the interest for the given amount "+amount+" in SBIBank is : "+amount*0.1);

		
	}

}
