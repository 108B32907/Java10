package class05;

class caaa{
	private int num;
	public caaa() {
		this(2); // �s�������O���غc��num=2
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
		cbbb b=new cbbb(); //�I�s�L�޼ƫغc��
		b.show();
	}
}