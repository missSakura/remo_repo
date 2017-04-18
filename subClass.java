package laioffer;

public class SubClass extends SuperClass{
	public static void staticMethod() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
		SuperClass superWithSuper = new SuperClass();
		SuperClass subWithSuper = new SubClass();
		SubClass subWithSub = new SubClass();
		
		superWithSuper.staticMethod();
		subWithSuper.staticMethod();
		subWithSub.staticMethod();
	}
}
