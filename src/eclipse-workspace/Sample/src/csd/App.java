/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki demo örnekte switch deyiminin aşağı düşme özelliğinden yararlanılmıştır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Telefon kodunu giriniz:");
		int code = kb.nextInt();	
	
		switch (code) {
		case 212:
			System.out.print("Avrupa ");			
		case 216:
			System.out.println("İstanbul");
			break;
		case 232:
			System.out.println("İzmir");
			break;
		case 312:
			System.out.println("Ankara");
			break;
		case 372:
			System.out.println("Zonguldak");
			break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}