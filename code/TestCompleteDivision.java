
public class TestCompleteDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=3, y1=14;
		System.out.println(y1/x1);//output 4
		
		double x2=3; int y2=14;
		System.out.println(y2/x2);//output 4.666666666666667
		
		int x3=3; double y3=14;
		System.out.println(y3/x3);//output 4.666666666666667
		
		
		double x4=3, y4=14;
		System.out.println(y4/x4);// output 4.666666666666667
		//After implementing all the above codes we can conclude some 
		//important observation based on the datatype of divisor and dividend
		//int / int = int
		//double / int = double
		//int / double = double
		//double / double = double
		//To find the any data-type of the result of any operation use below formula
		//max(int, data-type of operand 1, data-type of operand 2);

		
		int x5=3; float y5=14;
		System.out.println(y5/x5);//output 4.6666665
		//if int and float comes together then the system will be biased towards the float
		// because
		//A signed 32-bit integer variable has a maximum value of 231 − 1 = 2,147,483,647, 
		//whereas an IEEE 754 32-bit base-2 floating-point variable has 
		//a maximum value of (2 − 2E−23) × 2127 ≈ 3.4028235 × 10E38.
		// means a float datatype can hold more information than int data type but it consumes 
		//lot of CPU processing power
		
		long x6=3; double y6=14;
		System.out.println(y6/x6);//output 4.666666666666667
		// same can be applied for the case of double and long the system chooses double over 
		//long because of its the extended form of float
	}

}
