package br.com.lista2;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1, b = 1;
		System.out.println(1);
		for(int i = 1; i < 15; i+=2) {
			b += a;
			System.out.println(a);
			a += b;
			System.out.println(b);
		}
	}
}