package inheritenc;

public class Theater3 implements MalayalamMovies,TamilMovies{

	@Override
	public void ratsan() {
		// TODO Auto-generated method stub
		System.out.println("Ratsan rate=200");
	}

	@Override
	public void dude() {
		// TODO Auto-generated method stub
		System.out.println("Dude rate=220");
	}

	@Override
	public void dragon() {
		// TODO Auto-generated method stub
		System.out.println("Dragon rate=190");
	}

	@Override
	public void malik() {
		// TODO Auto-generated method stub
		System.out.println("Malik rate=250");
	}

	@Override
	public void thalvara() {
		// TODO Auto-generated method stub
		System.out.println("Thalavara rate=230");
	}

	@Override
	public void mirage() {
		// TODO Auto-generated method stub
		System.out.println("Mirage rate=240");
	}

}
