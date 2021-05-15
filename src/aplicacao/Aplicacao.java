package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cadastro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		List<Cadastro> list = new ArrayList<>();
		
		boolean resposta = true;
		
		while (resposta == true){
			
			System.out.println("Deseja cadastrar um anúncio? (Responda 1 para Sim ou 2 para Nao)");
			int resp = sc.nextInt();
			if (resp == 1){
				resposta = true;
				System.out.println("Informe o nome do anúncio: ");
				String nome = sc.next();
				System.out.println("Informe o cliente: ");
				String cliente = sc.next();
				System.out.println("Informe a data de inicio da campanha: (dd/MM/aaaa)");
				String dataInicial = sc.next();
				Date dataInicio = null;
				try {
					dataInicio = formato.parse(dataInicial);
				} catch (ParseException e1) {
					
					e1.printStackTrace();
				}
				System.out.println("Informe a data final da campanha: (dd/MM/aaaa)");
				String dataFim = sc.next();
				Date dataFinal = null;
				try {
					dataFinal = formato.parse(dataFim);
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
				System.out.println("Informe o valor do investimento diário: ");
				double investimento = sc.nextDouble();
				
				list.add(new Cadastro (nome, cliente, dataInicio, dataFinal, investimento));
				
			} else if(resp == 2){
				resposta = false;
				System.out.println("Deseja exibir algum relatório? (Responda 1 para sim ou 2 para não)");
				int re = sc.nextInt();
				 if(re == 1){
					 System.out.println("Deseja pesquisar por data ou cliente? (responda 1 para data ou 2 para cliente)");
					 int res = sc.nextInt();
					 if(res == 1){
						 System.out.println("Informe a data do inicio da campanha: (dd/MM/aaaa)");
						 String data1 = sc.next();
						 Date dataIni = null;
						 try {
								dataIni = formato.parse(data1);
							} catch (ParseException e) {
								
								e.printStackTrace();
							}
						 System.out.println("Informe a data fianl da campanha: (dd/MM/aaaa");
						 String data2 = sc.next();
						 Date dataFi = null;
						 try {
								dataFi = formato.parse(data2);
							} catch (ParseException e) {
								
								e.printStackTrace();
							}
						 for(Cadastro cadastro: list){
							 if(cadastro.getDataInicio().equals(dataIni) & cadastro.getDataFim().equals(dataFi)){
								 System.out.println(cadastro);
								 double invest = cadastro.calculaInvestimento(cadastro.getDataInicio(), cadastro.getDataFim(), cadastro.getInvestimento());
								 System.out.println("Valor total Investido: " + invest);
								 cadastro.calculadora(invest);
								 
							 }
						 }
					 } else if (res == 2){
						 System.out.println("Informe o cliente que deseja pesquisar: ");
						 String cli = sc.next();
						 for(Cadastro cadastro: list){
							 if(cadastro.getCliente().contains(cli)){
								 System.out.println(cadastro);
								 double invest = cadastro.calculaInvestimento(cadastro.getDataInicio(), cadastro.getDataFim(), cadastro.getInvestimento());
								 System.out.println("Valor total Investido: " + invest);
								 cadastro.calculadora(invest);
							 } else {
								 System.out.println("Cadastro não encontrado");
							 }
							 
						 }
					 }
				 }
			} else {
				System.out.println("Resposta inválida");
			}
			
		}
		
		
		
		
		sc.close();
	}
}