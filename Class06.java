package class06;

class  ctriangle{
	protected int base; //使子類別能直接使用base
	protected int height; //使子類別能直接使用height
	
	public ctriangle(int b, int h) { //父類別有引數建構元
		base=b;
		height=h;
	}
	protected void show() {
		System.out.println(base+" " +height);
	}
}
class cdata extends ctriangle{ //子類別cdata 繼承 父類別ctriangle
	public cdata(int b,int h) {  //子類別有引數建構元
		super(b,h); // 繼承父類別的b,h
	}
	public void area() {
		show(); //直接使用父類別的show函數
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
