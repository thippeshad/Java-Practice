
public class TypeCast_Double {

	public static void main(String[] args) {
		
		double f= 66;
		System.out.println(f);//output 66.0
		/*as the byte, short and int are smaller than float there is need for explicit type-casting
		float and long are respectively smaller and equal than double but as there is a chance 
		of it might decimal number there is a need for explicit type-casting */
		
		byte f1= (byte)f;
		System.out.println(f1);// output 66
		
		short f2=(short)f;
		System.out.println(f2);// output 66
		
		int f3=(int)f;
		System.out.println(f3);// output 66
		
		long f4=(long)f;
		System.out.println(f4);// output 66
		
		float f5=(float)f;
		System.out.println(f5);// output 66.0
		
		char f6=(char)f;
		System.out.println(f6); // output B
		
		//boolean f7=f;
		//System.out.println(f7); Compilation Error


	}

}
