package main;

public class pruebas {
	
	
	public static void main(String[] args) throws Exception {
		
		String cadena="ola k ase";
		String subcadena;
		
		for(int i=0;i<cadena.length();i++){
		
			subcadena= cadena.substring(i,i+1);
			System.out.println(i+"==="+subcadena+"\n");
			char ch='£';
			System.out.println((int)ch);
		
	};

}
}