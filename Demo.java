// BJ

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new Wandelaar();
		Wandelaar frits = new Wandelaar();
		frits.a++;
		System.out.println(frits.wandelen(4).a);
	}
}
class Wandelaar{
	static int a;
	Wandelaar wandelen(int a){
		System.out.println(a++);
		return new Wandelaar();
	}
}