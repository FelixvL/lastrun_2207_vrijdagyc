// BI

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new Wandelaar();
		Wandelaar frits = new Wandelaar();
		frits.a++;
		System.out.println(frits.wandelen());
	}
}
class Wandelaar{
	static int a;
	Wandelaar wandelen(){
		System.out.println(a++);
		return new Wandelaar();
	}
}