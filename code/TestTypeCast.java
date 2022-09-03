
public class TestTypeCast {

	public static void main(String[] args) {
		
	byte a= 10;
	System.out.println(a);
	// A byte data type can be type-casted automatically into any other 
	// data type( except boolean and char) because its the small 
	// data type compared to other.
	short a1=a;
	System.out.println(a1);// output 10
	
	int a2=a;
	System.out.println(a2);// output 10
	
	long a3=a;
	System.out.println(a3);// output 10
	
	float a4=a;
	System.out.println(a4);// output 10.0
	
	double a5=a;
	System.out.println(a5);// output 10.0
	
	//char a6=a;
	//System.out.println(a6); Compilation Error
	
	//boolean a7=a;
	//System.out.println(a7); Compilation Error
	
	short b= 11;
	System.out.println(b);
	// as the byte is smaller than short there is need for explicit type-casting
	byte b1= (byte)b;
	System.out.println(b1);// output 11
	
	int b2=b;
	System.out.println(b2);// output 11
	
	long b3=b;
	System.out.println(b3);// output 11
	
	float b4=b;
	System.out.println(b4);// output 11.0
	
	double b5=b;
	System.out.println(b5);// output 11.0
	
	//char b6=b;
	//System.out.println(b6); Compilation Error
	
	//boolean b7=b;
	//System.out.println(b7); Compilation Error
	
	int c= 12;
	System.out.println(c);
	// as the byte and short are smaller than int there is need for explicit type-casting
	byte c1= (byte)c;
	System.out.println(c1);// output 12
	
	short c2=(short)c;
	System.out.println(c2);// output 12
	
	long c3=c;
	System.out.println(c3);// output 12
	
	float c4=c;
	System.out.println(c4);// output 12.0
	
	double c5=c;
	System.out.println(c5);// output 12.0
	
	//char c6=c;
	//System.out.println(c6); Compilation Error
	
	//boolean c7=c;
	//System.out.println(c7); Compilation Error
	

	long d= 13;
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
	
	//char d6=d;
	//System.out.println(d6); Compilation Error
	
	//boolean d7=d;
	//System.out.println(d7); Compilation Error
	
	float e= 14;
	System.out.println(e); //output 14.0
	// as the byte and short are smaller than float there is need for explicit type-casting
	//int and long are respectively equal and greater than float but as there is a chance 
	//of it might decimal number there is a need for explicit type-casting
	byte e1= (byte)e;
	System.out.println(e1);// output 14
	
	short e2=(short)e;
	System.out.println(e2);// output 14
	
	int e3=(int)e;
	System.out.println(e3);// output 14
	
	long e4=(long)e;
	System.out.println(e4);// output 14
	
	double e5=e;
	System.out.println(e5);// output 14.0
	
	//char e6=e;
	//System.out.println(e6); Compilation Error
	
	//boolean e7=e;
	//System.out.println(e7); Compilation Error
	
	double f= 15;
	System.out.println(f);//output 14.0
	// as the byte, short and int are smaller than float there is need for explicit type-casting
	//float and long are respectively smaller and equal than double but as there is a chance 
	//of it might decimal number there is a need for explicit type-casting
	byte f1= (byte)f;
	System.out.println(f1);// output 15
	
	short f2=(short)f;
	System.out.println(f2);// output 15
	
	int f3=(int)f;
	System.out.println(f3);// output 15
	
	long f4=(long)f;
	System.out.println(f4);// output 15
	
	float f5=(float)f;
	System.out.println(f5);// output 15.0
	
	//char f6=f;
	//System.out.println(f6); Compilation Error
	
	//boolean f7=f;
	//System.out.println(f7); Compilation Error


	}

}
