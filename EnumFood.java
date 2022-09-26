
enum Food {CandyCorn, Reeses, Chocolate, Gummies, SourCandy}

public class EnumFood {

	public static void main(String[] args) {
		
		Food f1 = Food.Gummies;
		
		Food f2 = Food.Chocolate;
		
		Food f3 = Food.CandyCorn;
		
		Food f4 = Food.SourCandy;
		
		System.out.println(f1);
		System.out.println(f1.ordinal());
		System.out.println(f2);
		System.out.println(f2.ordinal());
		System.out.println(f3);
		System.out.println(f3.ordinal());
		System.out.println(f4);
		System.out.println(f4.ordinal());

		

	}

}
