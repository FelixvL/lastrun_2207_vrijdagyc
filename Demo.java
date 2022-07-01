// CH

class Demo{
	public static void main(String[] args)throws Exception{
		System.out.println("start");
		Fiets f = new MountainBike();
		MountainBike m = new MountainBike();
		f.gaan(5);
		m.gaan(10);
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
	void gaan(int snelheid){
		System.out.println("mtb");
		System.out.println(snelheid);
	}
}