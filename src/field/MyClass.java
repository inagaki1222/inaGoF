package field;

public class MyClass {
	// フィールド
	private int fieldNo = 0;

	public void useLocal() {
		// フィールドの挙動
		System.out.println("fieldNo 1 : " + fieldNo);
		fieldNo ++;
		System.out.println("fieldNo 2 : " + fieldNo);
		System.out.println("-------------");

		// ローカル変数
		int localNo = 0;

		// ローカル変数の挙動
		System.out.println("localNo 1 : " + localNo);
		localNo ++;
		System.out.println("localNo 2 : " + localNo);
		System.out.println("-------------");
	}
}