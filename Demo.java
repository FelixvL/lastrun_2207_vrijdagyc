// BL

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new SnelWandelaar();
		joost.wandelen(5)
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
class SnelWandelaar{
	int a;
	void wandelen(){
		System.out.println("dat gaat snel");
	}

}