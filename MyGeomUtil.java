public class MyGeomUtil{
	int iAmNotPopular=13;
	static int iAmCelebrity=7;
	public static double luasSegiempat(float length, float width){
		return length*width;
	}
	public static double luasSegitiga(float alas, float tinggi){
		return 0.5*alas*tinggi;
	}
	public static double luasSegitiga(float A, float B, float gamma){
	//fungsi sin(double angel) menerima masukan sudut
	//dalam radian angle not angel, you prevet...!
	return 0.5*A*B*Math.sin(gamma/Math.PI);
	}
	public static void main(String[]args){
		double luassg=luasSegitiga(3,5);
		double luassg2=luasSegitiga(3,5,2);
		double luasse = MyGeomUtil.luasSegiempat(3,5);
		System.out.println("Luas segitiga ke-1 = "+luassg+" cm2");
		System.out.println("Luas segitiga ke-2 = "+luassg2+" cm2");
		System.out.println("Luas segiempat = "+luasse+" cm2");
	}
}	