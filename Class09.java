package class09;

class caaa{
	public void display() {
		System.out.println("printed from caaa class");
	}
}
class cbbb extends caaa{
	
	public void display() {
		System.out.println("printed from cbbb class");//��g�����O�����e
	}
}
public class Class09 {

	public static void main(String[] args) {
		caaa bb1=new cbbb();
		bb1.display();  //��X�l���O�����e

	}

}
