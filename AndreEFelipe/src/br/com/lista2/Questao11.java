package br.com.lista2;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b;
		a = Teclado.lerInt("Digite a base: ");
		b = Teclado.lerInt("Digite o expoente: ");
		int result = a;
		for(int i = 1; i < b; i++) {
			a = result * a;
		}
		System.out.println(a);
	}
}