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
	//public void show() { //�����O��show()�Q�w�q�פ��~��,�ҥH�l���O��show()�L�k�мg�����O��show()
		
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
