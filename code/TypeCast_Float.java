
public class TypeCast_Float {

	public static void main(String[] args) {
		
		float e= 67;
		System.out.println(e); //output 67.0
		/* as the byte and short are smaller than float there is need for explicit type-casting
		int and long are respectively equal and greater than float but as there is a chance 
		of it might decimal number there is a need for explicit type-casting */
		byte e1= (byte)e;
		System.out.println(e1);// output 67
		
		short e2=(short)e;
		System.out.println(e2);// output 67
		
		int e3=(int)e;
		System.out.println(e3);// output 67
		
		long e4=(long)e;
		System.out.println(e4);// output 67
		
		double e5=e;
		System.out.println(e5);// output 67.0
		
		char e6=(char)e;
		System.out.println(e6); // output C
		
		//boolean e7=e;
		//System.out.println(e7); Compilation Error
		
	}

}
