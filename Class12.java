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

	public ccircle(int r){	 //定義有引數的建構元
		radius=r;
	}
	public double area() { //改寫父類別的area()
		return radius*radius*3.14;
	}
	public void show() {
		System.out.println(area());
	}
}

class csquare extends cshape{

	public csquare(int l) {//定義有引數的建構元
		length=l;
	}
	public double area() { //改寫父類別的area()
		return Math.pow(length,2);
	}
	public void show() {
		System.out.println(area());
	}
}
class ctriangle extends cshape{

	public  ctriangle(int g,int h) { //定義有引數的建構元
		ground=g;
		height=h;
	}
	public double area() { //改寫父類別的area()
		return ground*height/2.0;
	}
	public void show() {
		System.out.println(area());
	}
}

public class Class12 {
	public static double largest(cshape csh[]) { //定義副程式largest()用來找到父類別陣列csh[]中最大的值 並回傳
		double max=0;
		for(int i=0;i<3;i++) {
			if(max<csh[i].area())
				max=csh[i].area();
		}
		return max;
	}
	public static void main(String[] args) {
		cshape csh[]=new cshape[3];  //定義父類別陣列
		csh[0]=new ccircle(2);  //以父類別陣列呼叫子類別area()
		csh[1]=new csquare(3);//以父類別陣列呼叫子類別area()
		csh[2]=new ctriangle(5,7);//以父類別陣列呼叫子類別area()
		for(int i=0;i<3;i++) {
			System.out.println(csh[i].area());
		}
		System.out.println(largest(csh));
	}
	
}