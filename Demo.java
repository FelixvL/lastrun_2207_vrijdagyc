// BG

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new Wandelaar();
		Wandelaar frits = new Wandelaar();
		frits.a++;
		frits.wandelen();
		gaan();
		System.out.println(joost.a);
		System.out.println(frits.a);
	}
	static void gaan(){
		System.out.println("iets");
		Wandelaar w = new Wandelaar();
		w.wandelen();
		System.out.println(w.a);
	}
}
class Wandelaar{
	int a;
	void wandelen(){
		System.out.println(a++);
	}
}