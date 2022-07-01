// BK

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new Wandelaar();
		Wandelaar frits = new Wandelaar();
		frits.a++;
		frits.wandelen(85);
		System.out.println(frits.wandelen(4).a);
	}
}
class Wandelaar{
	int a;
	Wandelaar(){
		System.out.println("ik ben er");
	}
	Wandelaar wandelen(int a){
		System.out.println(a++);
		return new Wandelaar();
	}
}