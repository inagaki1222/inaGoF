package field;

public class Sample {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.useLocal();
		mc.useLocal();
		mc.useLocal();
		mc.useLocal();
		mc.useLocal();
		mc.useLocal();
		System.out.println("-------------mc2-------------");
		MyClass mc2 = new MyClass();
		mc2.useLocal();
		mc2.useLocal();
	}
}
