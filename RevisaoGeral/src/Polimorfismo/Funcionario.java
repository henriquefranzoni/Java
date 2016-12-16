package Polimorfismo;

import Exercicio6.RegistraPonto;

public class Funcionario implements RegistraPonto {

	@Override
	public void RegistraEntrada() {
		System.out.println("Registrando Entrada");

	}

	@Override
	public void RegistraSaida() {
	System.out.println("Registrando Saida");

	}

	@Override
	public void ResgistraHoraExtra() {
		System.out.println("Registro de Suas horas Extras");

	}

}
