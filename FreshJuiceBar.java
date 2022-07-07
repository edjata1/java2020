class FreshJuice{
	enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	FreshJuiceSize size;
}
class JuiceType{
	enum FreshJuiceType{ APPLE , ORANGE, TOMATO, CARROT, WATERMELON, LEMONADE, BEETS, DETOX, SUNSHINE, CLEANSE, RAW }
	FreshJuiceType type;
}

class AddOnExtras{
	
}

public class FreshJuiceBar{
	
	public static void main (String[] args){
		
		FreshJuice juice = new FreshJuice();
		JuiceType jType = new JuiceType();
		
		juice.size = FreshJuice.FreshJuiceSize.LARGE;
		jType.type = JuiceType.FreshJuiceType.RAW;
		
		String jSize;
		double price;
		
		//converts size to string
		jSize = juice.size.toString();
		System.out.println(jSize.compareTo("MEDIUM"));

		//checks size and gives price and print output
		if(jSize.contains("SMALL")){
			price = 6.95;
			System.out.println(jType.type + " Size: " +  " " + juice.size + " $" + price);	
		}
		else if(jSize.contains("MEDIUM")){
			price = 8.95;
			System.out.println(jType.type + " Size: " + " " + juice.size + " $" + price);
			
		}else if(jSize.contains("LARGE")){
			price = 10.95;
			System.out.println(jType.type + " Size: " + " " + juice.size + " $" + price);
			
		}else{
			
			System.out.println("nothing");
		}		
				
	}
}