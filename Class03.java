package class03;
class caaa{
	public static int num1;
	public  static int num2;
	public caaa(int a,int b){
		num1=a;
		num2=b;
	}
	public caaa(){
		num1=1;
		num2=1;
	}

	
}
class cbbb extends caaa{
	 public cbbb(){  //�I�scaaa�S���޼ƪ��غc��
		//�S���޼ƪ��غc�����ϥ�super
		 System.out.println(num1+" "+num2);
	 }
	 public cbbb(int a, int b) {
		 super(a,b); //�I�scaaa���޼ƪ��غc��
		 System.out.println(num1+" "+num2);
	 }

}

public class Class03 {

	public static void main(String[] args) {
		cbbb bb=new cbbb();
		cbbb bb1=new cbbb(3,7);
	}

}