package class14;

class caaa{
	public static int num1;
	public  static int num2;
	public caaa(int a,int b){ //�w�q���޼ƫغc��
		num1=a;
		num2=b;
	}
}

class cbbb extends caaa{
	 public cbbb(int a, int b) {//�I�scaaa���޼ƪ��غc��
		 super(a,b);  //�ϥ�super�I�s�����Ocaaa���w�]��(a,b)
		 System.out.println(num1+" "+num2);
	 }
}

public class Class14 {

	public static void main(String[] args) {
		cbbb bb=new cbbb(3,7);
	}

}