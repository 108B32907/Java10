package class19;

class crectangle{
	protected int length;
	protected int width;
	public crectangle(int l,int w) { //�w�q���޼ƪ��غc��
		length=l;
		width=w;
	}
	public String toString() { 
		String str="length="+length+",width="+width+",area="+width*length;
		return str; 
	}
}

public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crectangle rect=new crectangle(2,6);
		System.out.println(rect.toString()); //��^rect�w�q��crectangle(2,6)
	}

}
