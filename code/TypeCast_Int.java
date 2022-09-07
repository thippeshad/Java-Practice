
public class TypeCast_Int {

	public static void main(String[] args) {
		
		int c= 65;
		System.out.println(c);
		// as the byte and short are smaller than int there is need for explicit type-casting
		byte c1= (byte)c;
		System.out.println(c1);// output 65
		
		short c2=(short)c;
		System.out.println(c2);// output 65
		
		long c3=c;
		System.out.println(c3);// output 65
		
		float c4=c;
		System.out.println(c4);// output 65.0
		
		double c5=c;
		System.out.println(c5);// output 65.0
		
		char c6=(char)c;
		System.out.println(c6); // output A
		
		//boolean c7=c;
		//System.out.println(c7); Compilation Error

	}

}
