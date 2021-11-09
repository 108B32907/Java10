package class13;

class caaa{
	protected int num1;
	protected int num2;
	public caaa(){ //定義沒有引數建構元
		num1=1; //給定預設值
		num2=1;
	}

	
}
class cbbb extends caaa{ //cbbb繼承caaa
	 public cbbb() {
		 super(); //使用super呼叫父類別caaa的預設值
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