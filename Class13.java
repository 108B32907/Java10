package class13;

class caaa{
	protected int num1;
	protected int num2;
	public caaa(){ //�w�q�S���޼ƫغc��
		num1=1; //���w�w�]��
		num2=1;
	}

	
}
class cbbb extends caaa{ //cbbb�~��caaa
	 public cbbb() {
		 super(); //�ϥ�super�I�s�����Ocaaa���w�]��
	 }
	 public void show() {
		 System.out.println(num1+" "+num2);
	 }
	 

}

public class Class13 {

	public static void main(String[] args) {
		cbbb bb=new cbbb();
		bb.show();
	}

}