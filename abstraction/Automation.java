package abstraction;

public class Automation extends MultipleLanguage{

	public void Javalan() {
		// TODO Auto-generated method stub
		System.out.println("Javalan");
	}

	public void Seleniumlan() {
		// TODO Auto-generated method stub
		System.out.println("Seleniumlan");

	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("python");

	}

	@Override
	public void Ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");

	}
	
	public static void main(String[] args) {
		
		Automation a = new Automation();
		
		a.Javalan();
		a.Ruby();
		a.python();
		a.Seleniumlan();
		
	}
	
	

}
