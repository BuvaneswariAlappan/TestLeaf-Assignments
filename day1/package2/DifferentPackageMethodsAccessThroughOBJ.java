package week1.day1.package2;

import week1.day1.Day1Class22Feb;

public class DifferentPackageMethodsAccessThroughOBJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1Class22Feb newobj = new Day1Class22Feb();
		newobj.method1();
		newobj.method2();
		newobj.method3PassingParameters(6,2);
	}

}
