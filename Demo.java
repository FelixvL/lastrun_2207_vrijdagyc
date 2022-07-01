// BE

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		int a = 5;
		System.out.println(a++);
		new Demo.gaan();
		System.out.println(a);
	}
	void gaan(){
		System.out.println("iets");
		new Wandelaar().wandelen();
	}
}
class Wandelaar{
	double a;
	void wandelen(){
		System.out.println(a);
	}
}