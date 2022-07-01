// CB

class Demo{
	public static void main(String[] args){
		System.out.println("start");
		Fiets f = new Fiets();
		f.main(null);
	}
}


class Fiets{

	public void main(String[] args){
		throw new RuntimeException();
	}
}