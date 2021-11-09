package class05;

class caaa{
	private int num;
	public caaa() {
		this(2); // 存取本類別的建構元num=2
	}
	public caaa(int n) {
		num=n;
	}
	public int get() {
		return num;
	}
}
class cbbb extends caaa{
	public cbbb() {
	}
	public void show() {
		System.out.println(super.get());
	}
}
public class Class05 {

	public static void main(String[] args) {
		cbbb b=new cbbb(); //呼叫無引數建構元
		b.show();
	}
}