package class20;


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
	public  String toString(int a,int b) {  //�Q��overloading
		if(a>=b) {
			return super.toString();
		}
		else {
			return "Argument Error";
		}
	}
}

public class Class20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crectangle rect=new crectangle(2,6);
		System.out.println(rect.toString());//�I�s�L�޼�toString() 
		System.out.println(rect.toString(3,7));//�I�s���޼�toString() 
		System.out.println(rect.toString(7,3));//�I�s���޼�toString() �]���ŦXa>=b �Ǧ^���ت�toString���
	}

}
