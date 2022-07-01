// BO

class Demo{
	public static void main(String [] args){
		System.out.println("hoi");
		Wandelaar joost = new SnelWandelaar();
		joost.wandelen(5);
	}
}
class Wandelaar{
	int a;
	Wandelaar(int z){
		System.out.println("ik ben er");
	}
	Wandelaar wandelen(int a){
		System.out.println(a++);
		return new Wandelaar();
	}
}
class SnelWandelaar extends Wandelaar{
	int a;
	Wandelaar wandelen(int b){
		System.out.println("dat gaat snel");
		return null;
	}

}
//1 zelfde sig
//2 returntype covariant
//3 access modifier NIET kleiner
//4 throws covariant