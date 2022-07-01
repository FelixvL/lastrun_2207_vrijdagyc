// CF

class Demo{
	public static void main(String[] args)throws Exception{
		System.out.println("start");
		Fiets f = new MountainBike();
		f.rondFietsen();
	}
}


class Fiets{

	public void rondFietsen()throws Exception{
		System.out.println("in fiets");
		throw new Exception();
	}
}

class MountainBike{
	void rondFietsen(){
		System.out.println("in mtb");
	}
}