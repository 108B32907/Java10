package class11;

class cshape{ 
	protected double radius;
	protected double length;
	protected double ground;
	protected double height;
	public double area() { 
		return 0.0;
	} 
}

class ccircle extends cshape{

	public void ccircle(int r){	 //�w�q���޼ƪ��غc��
		radius=r;
	}
	public double area() { //��g�����O��area()
		return radius*radius*3.14;
	}
	public void show() {
		System.out.println(area());
	}
}

class csquare extends cshape{

	public void csquare(int l) {//�w�q���޼ƪ��غc��
		length=l;
	}
	public double area() { //��g�����O��area()
		return Math.pow(length,2);
	}
	public void show() {
		System.out.println(area());
	}
}
class ctriangle extends cshape{

	public void ctriangle(int g,int h) { //�w�q���޼ƪ��غc��
		ground=g;
		height=h;
	}
	public double area() { //��g�����O��area()
		return ground*height/2.0;
	}
	public void show() {
		System.out.println(area());
	}
}

public class Class11 {
	public static double largest(double num[]) { //�w�q�Ƶ{��largest()�Ψӧ��num[]�}�C���̤j���� �æ^��
		double max=0;
		for(int i=0;i<3;i++) {
			if(max<num[i])
				max=num[i];
		}
		return max;
	}
	public static void main(String[] args) {
		double num[]=new double[3];
		ccircle cr=new ccircle();
		cr.ccircle(2);
		cr.area();	
		num[0]=cr.area();
		cr.show();
		csquare cs=new csquare();
		cs.csquare(6);
		cs.area();
		num[1]=cs.area();
		cs.show();
		ctriangle ct=new ctriangle();
		ct.ctriangle(2,5);
		ct.area();
		num[2]=ct.area();
		ct.show();
		System.out.println(largest(num));
	}
	
}
