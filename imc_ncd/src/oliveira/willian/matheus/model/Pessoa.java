package oliveira.willian.matheus.model;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Pessoa {

	private String nome;
	private double peso;
	private double altura;
	private String sexo;
	private String dataNasc;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setdataNasc(String dataNasc) {
		this.dataNasc = dataNasc;		
	}
	public String getdataNasc() {		
		return this.dataNasc;
	}
	public int getIdade() {
		LocalDate nascimento = LocalDate.parse(this.dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate hoje = LocalDate.now();
		int idade = Period.between(nascimento, hoje).getYears();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
		//String dataFormatado = hoje.format(formatter);
		return this.idade = idade;
	}
/*	LocalDate d1 = LocalDate.parse("2018-05-26", DateTimeFormatter.ISO_LOCAL_DATE);
	LocalDate d2 = LocalDate.parse("2018-05-28", DateTimeFormatter.ISO_LOCAL_DATE);
	Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
	long diffDays = diff.toDays(); */
	 
/*	public String getIdade() {
		LocalDate agora =  LocalDate.now();
		LocalDate dataNasc = LocalDate.parse(idade);
		
		return this.idade = String.valueOf(Period.between(dataNasc, agora));
	} */
	
	
		
/*	public static int calculaIdade(java.util.Date dataNasc) {

	    Calendar dataNascimento = Calendar.getInstance();  
	    dataNascimento.setTime(dataNasc); 
	    Calendar hoje = Calendar.getInstance();  

	    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

	    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
	      idade--;  
	    } 
	    else 
	    { 
	        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
	            idade--; 
	        }
	    } 

	    return idade;
	} */
	/*		String[] dataSeparada = idade.split("/");
	LocalDate hoje = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));
	this.idade = idade; */    
	
}
