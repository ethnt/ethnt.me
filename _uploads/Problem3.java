
public class Problem3 {

	
	public static boolean checksum(double[] s1, double[] s2, double x)
	{
		// complete the checksum() method to find out
		// if there exists a number from s1, and a number from s2
		// such that, their sum is exactly x
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your checksum() method here
		double[] testarray1 = {1, 10, 45};
		double[] testarray2 = {-8, 4, 6};
		double target1 = 16;
		double target2 = 70;
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target1 + "?");
		System.out.println(checksum(testarray1,testarray2, target1));
		// should print true
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target2 + "?");
		System.out.println(checksum(testarray1,testarray2, target2));
		// should print false
		
	}

}
