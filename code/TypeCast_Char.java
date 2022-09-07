
public class TypeCast_Char {

	public static void main(String[] args) {
		/* this program shows various type-cast operation that can be performed on the char data-type
		 * 
		 */
		char a1='A';
		int a2=a1;
		System.out.println(a2);// output 65
		
		/* The out put of this program is 65. because 65 is the ASCII valu of the letter 'A'
		 * the Char data-type will be automatically converted to int without any explicit command
		 * but vice versa is not possible  
		 *
		
		    int b1=65;
			char b2=b1;
			System.out.println(a2); //this program will through a error during the compailation
		*/
		
		int b1=65;
		char b2=(char)b1;
		System.out.println(b2);// output is A
		
		/* To convert the int to char there is a need of explicit command
		 * 
		 */
		
		int c1=63+6;
		char c2=(char)c1;
		System.out.println(c2);// output is E, because the ASCII code of 69 is E symbol
		
		byte d1=65;
		char d2=(char)d1;
		System.out.println(d2);// output is A
		
		long e1=66;
		char e2=(char)e1;
		System.out.println(e2);//out put is B
		
		float f1=67;
		char f2= (char)f1;
		System.out.println(f2);//out put is C
		
		double g1=68;
		char g2=(char)g1;
		System.out.println(g2);//out put is D
		

	}

}
