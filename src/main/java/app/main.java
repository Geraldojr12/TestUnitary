package app;

import java.util.ArrayList;
import java.util.Date;

import entidades.Banco;
import entidades.Conta;
import entidades.Usuario;
import servicos.Transferencia;

public class main {

	public static void main(String[] args) {
		Banco bb = new Banco();
		Usuario junior = new Usuario("Junior");
		Usuario	emilio = new Usuario("Emilio");
		Conta contaJunior = new Conta(junior, "12345", "987654", new Double(500.00), new Date(2021, 00, 10));
		Conta contaEmilio = new Conta(emilio, "12345", "987123", new Double(1000.00), new Date(2021, 10, 05));
	
		
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(junior);
		usuarios.add(emilio);
		
		bb.setNome("Banco do Brasil");
		bb.setUsuarios(usuarios);
		
		Transferencia almoco = new Transferencia();
		almoco.transferenciaMesmoBanco(contaJunior, contaEmilio, new Double(30.00));	
		
		Date teste = new Date(2021, 00, 10);
		int result = teste.compareTo(contaJunior.getDataAbertura());
		if(result == 0) {
			System.out.println("Datas Iguais");
		}else {
			System.out.println(result+ " DIAS");
		}
		
		
	}

}
