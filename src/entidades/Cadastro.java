package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Cadastro {
	
	String nome, cliente;
	Date dataInicio, dataFim;
	double investimento;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cadastro(){
		
	}
	
	public Cadastro(String nome, String cliente, Date dataInicio, Date dataFim, double investimento) {
		super();
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.investimento = investimento;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public double getInvestimento() {
		return investimento;
	}
	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	@Override
	public String toString() {
		return "Cadastro [Nome do anúncio: " + nome + ", Cliente: " + cliente + ", data inicial: " + dataInicio + ", data final: "
				+ dataFim + ", Investimento diário: " + investimento + "]";
	}
	
	public double calculaInvestimento(Date dataInicio, Date dataFim, double investimento){
		
		long difEmMil = Math.abs(dataFim.getTime() - dataInicio.getTime()); /* Calcula a difereça das datas em milesegundos */
		
		long dias = TimeUnit.DAYS.convert(difEmMil, TimeUnit.MILLISECONDS); /*Transforma milisegundos em dias */
		return investimento * dias;
	}
	
	public void calculadora(double investimento){
		int contVisualizacoes = 0;
		int contClick = 0;
		int contCompartilhamentos = 0;
		int maxCompartilhamento = 0;
		for(int i = 0; i < investimento; i++){ 
			
			 contVisualizacoes += 30; /*A cada 1 real investido geram 30 visualizações */
			
			if(contVisualizacoes >= 100){
			contClick = ((contVisualizacoes / 100 ) * 12);  /* Para cada 100 visualizações geram 12 cliques no link */
			
			} if (contClick >= 20){
				contCompartilhamentos = ((contClick / 20) * 3); /*Para cada 20 cliques geram 3 compartilhamentos */
				
				maxCompartilhamento ++; /*Contador de vezes compartilhado */
				
				if (maxCompartilhamento <= 4){	/* se chegou na 4 pessoa não entra mais no loop */	
					
				contVisualizacoes += 40 * contCompartilhamentos; /* Cada compartilhamento geram + 40 novas visualizações */
				
				contClick = ((contVisualizacoes / 100 ) * 12);
				contCompartilhamentos = ((contClick / 20) * 3);
				}
				
			}
			
		}
		System.out.println("O anuncio teve " + contVisualizacoes + " visualizações, foi clicado " + contClick + " vezes, e foi compartilhado " + contCompartilhamentos 
				+ " vezes");
	}

}
