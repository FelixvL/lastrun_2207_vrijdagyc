// CL

class Demo{
	public static void main(String[] args)throws Exception{
		System.out.println("start");
		Fiets f = new MountainBike();
		System.out.println( f.gaan(3).snelheid );

	}
}


abstract class Fiets{
	int snelheid = 4;
	abstract Fiets gaan(int snelheid);
}

class MountainBike extends Fiets{
	int snelheid = 6;
	MountainBike gaan(int q){
		System.out.println("mtb");
		System.out.println(snelheid);
		return new MountainBike();
	}
}