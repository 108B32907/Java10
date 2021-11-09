package class12;

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

	public ccircle(int r){	 //�w�q���޼ƪ��غc��
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

	public csquare(int l) {//�w�q���޼ƪ��غc��
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

	public  ctriangle(int g,int h) { //�w�q���޼ƪ��غc��
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

public class Class12 {
	public static double largest(cshape csh[]) { //�w�q�Ƶ{��largest()�Ψӧ������O�}�Ccsh[]���̤j���� �æ^��
		double max=0;
		for(int i=0;i<3;i++) {
			if(max<csh[i].area())
				max=csh[i].area();
		}
		return max;
	}
	public static void main(String[] args) {
		cshape csh[]=new cshape[3];  //�w�q�����O�}�C
		csh[0]=new ccircle(2);  //�H�����O�}�C�I�s�l���Oarea()
		csh[1]=new csquare(3);//�H�����O�}�C�I�s�l���Oarea()
		csh[2]=new ctriangle(5,7);//�H�����O�}�C�I�s�l���Oarea()
		for(int i=0;i<3;i++) {
			System.out.println(csh[i].area());
		}
		System.out.println(largest(csh));
	}
	
}