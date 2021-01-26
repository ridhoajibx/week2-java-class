package reverse;

public class App {
	public static void main(String[] args) {
//		First step
//		String str = "ridho";
//				  
//		System.out.println("Sebelum di balik : "+str);
//		int length = str.length();
//		  
//		String akhir = "";
//		for(int i = length -1; i >= 0; i-- ){
//		akhir = akhir + str.charAt(i);
//		}
//		  
//		System.out.println("Setelah di balik : "+ akhir);
		
//		Second Step
		String str = "ridho";

		System.out.println("Sebelum di balik : "+ str);
		System.out.println("Setelah di balik : "+ new StringBuffer(str).reverse());
	}
}
