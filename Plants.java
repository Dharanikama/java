class Plant{
	String name;
	void grow(){
	System.out.println("plants grow");
	}
    }
class Flowerplant extends Plant{
	String colour;
	/*void grow(){
	System.out.println("flower plants grow");
	}*/
	void blossom(){
	System.out.println("flowers blossom");
	}
}
class Fruitplant extends Plant{
	String fruit;
	void ripes(){
	System.out.println("fruits ripes");
	}
}
class Plants{
	public static void main(String args[]){
	Flowerplant F1=new Flowerplant();
	F1.grow();
	F1.blossom();
	Plant P1=new Plant();
	P1.grow();
	//Pblossom();
	Fruitplant f1= new Fruitplant();
	f1.grow();
	f1.ripes();
	}
}
