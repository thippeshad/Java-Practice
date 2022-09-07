
public class TypeCast_Long {

	public static void main(String[] args) {
		
		long d= 68;
		System.out.println(d);
		// as the byte, short and int are smaller than long there is need for explicit type-casting
		byte d1= (byte)d;
		System.out.println(d1);// output 13
		
		short d2=(short)d;
		System.out.println(d2);// output 13
		
		int d3=(int)d;
		System.out.println(d3);// output 13
		
		float d4=d;
		System.out.println(d4);// output 13.0
		
		double d5=d;
		System.out.println(d5);// output 13.0
		
		char d6=(char)d;
		System.out.println(d6); // output D
		
		//boolean d7=d;
		//System.out.println(d7); Compilation Error

	}

}
