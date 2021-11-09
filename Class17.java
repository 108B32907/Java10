package class17;

class car{
	protected String owner;
	protected String id;
	public car(String own,String s) {
		owner=own;
		id=s;
	}
	final void show() {
		System.out.println(owner);
		System.out.println(id);
	}

}
class ccolor extends car{
	public String color;
	public ccolor(String own,String s,String col) {
		super(own,s);
		color=col;
	}
	//public void show() { //父類別的show()被定義終止繼承,所以子類別的show()無法覆寫父類別的show()
		
		//System.out.println(owner);
		//System.out.println(id);
		//System.out.println(color);
	//}
	
}

public class Class17 {

	public static void main(String[] args) {
		ccolor mycar=new ccolor("Riaan","A-2345","Black");
		mycar.show();
		System.out.println(mycar.color);
	}

}
