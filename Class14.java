package class14;

class caaa{
	public static int num1;
	public  static int num2;
	public caaa(int a,int b){ //定義有引數建構元
		num1=a;
		num2=b;
	}
}

class cbbb extends caaa{
	 public cbbb(int a, int b) {//呼叫caaa有引數的建構元
		 super(a,b);  //使用super呼叫父類別caaa的預設值(a,b)
		 System.out.println(num1+" "+num2);
	 }
}

public class Class14 {

	public static void main(String[] args) {
		cbbb bb=new cbbb(3,7);
	}

}