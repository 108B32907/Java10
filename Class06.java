package class06;

class  ctriangle{
	protected int base; //�Ϥl���O�ઽ���ϥ�base
	protected int height; //�Ϥl���O�ઽ���ϥ�height
	
	public ctriangle(int b, int h) { //�����O���޼ƫغc��
		base=b;
		height=h;
	}
	protected void show() {
		System.out.println(base+" " +height);
	}
}
class cdata extends ctriangle{ //�l���Ocdata �~�� �����Octriangle
	public cdata(int b,int h) {  //�l���O���޼ƫغc��
		super(b,h); // �~�Ӥ����O��b,h
	}
	public void area() {
		show(); //�����ϥΤ����O��show���
		System.out.println(base*height/2.0);
	}
}
public class Class06
{
   public static void main(String args[])
   {
	  cdata obj=new cdata(3,8);
      obj.area();
   }
}
