package br.com.orientacao.objeto.exercicios_oo.exercicio01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class PessoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PessoaApplication.class, args);

		Pessoa pessoa = new Pessoa();
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu nome: " );
		pessoa.setNome(scan.nextLine());
		System.out.println("Informe sua altura: " );
		pessoa.setAltura(Float.parseFloat(scan.nextLine()));
		pessoa.setAltura(Float.parseFloat(scan.nextLine()));
		System.out.println("Informe sua data de nasccimento: " );
		String dataNascimento = scan.nextLine();

		//Forma de converter a string dataNascimento para o formato de data
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data = df.parse(dataNascimento);

			pessoa.setDataNascimento(data);
		} catch (
				ParseException e) {
			e.printStackTrace();
		}

		pessoa.imprimirInformaceos();
	}




}
