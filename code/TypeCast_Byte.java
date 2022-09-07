
public class TypeCast_Byte {

	public static void main(String[] args) {
		
		byte a= 70;
		System.out.println(a);
		/* A byte data type can be type-casted automatically into any other 
		data type( except boolean) because its the small 
		data type compared to other */
		short a1=a;
		System.out.println(a1);// output 70
		
		int a2=a;
		System.out.println(a2);// output 70
		
		long a3=a;
		System.out.println(a3);// output 70
		
		float a4=a;
		System.out.println(a4);// output 70.0
		
		double a5=a;
		System.out.println(a5);// output 70.0
		
		char a6= (char)a;
		System.out.println(a6);// output F
		
		//boolean a7=a;
		//System.out.println(a7); Compilation Error

	}

}
