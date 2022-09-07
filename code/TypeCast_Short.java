
public class TypeCast_Short {

	public static void main(String[] args) {
		
		short b= 69;
		System.out.println(b);
		// as the byte is smaller than short there is need for explicit type-casting
		byte b1= (byte)b;
		System.out.println(b1);// output 69
		
		int b2=b;
		System.out.println(b2);// output 69
		
		long b3=b;
		System.out.println(b3);// output 69
		
		float b4=b;
		System.out.println(b4);// output 69.0
		
		double b5=b;
		System.out.println(b5);// output 69.0
		
		char b6=(char)b;
		System.out.println(b6); // output E
		
		//boolean b7=b;
		//System.out.println(b7); Compilation Error
		

	}

}
