package br.com.lista2;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = Teclado.lerInt("Digite um inteiro: ");
		int mult;
		
		for(int i = 1; i < 11; i++) {
			mult = i * num;
			System.out.println(num + " . " + i + " = " + mult);
		}
	}
}