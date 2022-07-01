// CG

class Demo{
	public static void main(String[] args)throws Exception{
		System.out.println("start");
		Fiets f = new MountainBike();
		MountainBike m = new MountainBike();
		f.gaan();
		m.gaan();
		System.out.println(f.snelheid);
		System.out.println(m.snelheid);

	}
}


class Fiets{
	int snelheid = 4;
	void gaan(){
		System.out.println("fiets");
		System.out.println(snelheid);
	}
}

class MountainBike extends Fiets{
	int snelheid = 6;
	void gaan(){
		System.out.println("mtb");
		System.out.println(snelheid);
	}
}