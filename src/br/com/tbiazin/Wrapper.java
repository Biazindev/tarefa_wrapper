package br.com.tbiazin;

public class Wrapper {

public static void main(String args[]) {
		
		long aleatorio = 12345678910l;
		long aleatorio2 = Long.valueOf(aleatorio);
	
		/*casting explicito
		 * é quando a variavel maior byte tera que ser trocada por uma variavel de menor byte
		*/
		int fone = 10;
		byte cel = (byte) fone;
		
		long serial = 1111122211111116661l;
		System.out.println(serial);
		int senha = (int) serial;
		System.out.println(senha);
		
		/*casting implicito
		 * é quando a variavel menorr byte tera que ser trocada por uma variavel de maior byte
		 **/
		
		int preço = 10;
		long preçoX = preço;
	}
	

}
