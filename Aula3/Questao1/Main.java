public class Main{
	public static void main(String [] args){
		Credit ct = new Credit();

                int aux1 = ct.getCred();
                System.out.println(aux1);

		ct.setCred(100);
		int aux2 = ct.getCred();
		System.out.println(aux2);

		ct.topUp(900);
		ct.consumir(10);
		System.out.println(ct.getCred());
	}
}
