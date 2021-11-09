
class caaa{
	public static int num1;
	public static int num2;
	
}
class cbbb extends caaa{ //©w¸qcbbbÄ~©Ócaaa
	 void set_sum(int n1,int n2) {
		num1=n1;
		num2=n2;
	}
	static void show() {
		System.out.println(num1+" "+num2);
	}
}

public class Class01 {

	public static void main(String[] args) {
		cbbb bb=new cbbb();
		bb.set_sum(5, 10);
		bb.show();
	}

}
