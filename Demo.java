// CD

class Demo{
	public static void main(String[] args){
		System.out.println("start");
		MountainBike f = new MountainBike();
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