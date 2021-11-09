package class09;

class caaa{
	public void display() {
		System.out.println("printed from caaa class");
	}
}
class cbbb extends caaa{
	
	public void display() {
		System.out.println("printed from cbbb class");//改寫父類別的內容
	}
}
public class Class09 {

	public static void main(String[] args) {
		caaa bb1=new cbbb();
		bb1.display();  //輸出子類別的內容

	}

}
