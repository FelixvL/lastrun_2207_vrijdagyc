// BF

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandenlaar joost = new Wandelaar();
		Wandenlaar frits = new Wandelaar();
		frits.a++;
		frits.a++;
		System.out.println(joost.a);
		System.out.println(frits.a);
	}
	void gaan(){
		System.out.println("iets");
		new Wandelaar().wandelen();
	}
}
class Wandelaar{
	int a;
	void wandelen(){
		System.out.println(a++);
	}
}