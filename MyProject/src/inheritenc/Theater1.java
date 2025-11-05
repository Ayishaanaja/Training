package inheritenc;

public class Theater1 implements MalayalamMovies{

	@Override
	public void malik() {
		System.out.println("Malik rate=180");
		
	}

	@Override
	public void thalvara() {
		System.out.println("Thalavara rate=190");
		
	}

	@Override
	public void mirage() {
		System.out.println("Mirage rate=180");
		
	}

}
