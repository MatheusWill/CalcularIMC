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
	private String tipoAtividade; 
	
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
		dataNasc.replace("/", "");
		return this.dataNasc;
	}
	public int getIdade() {
		
		LocalDate nascimento = LocalDate.parse(this.dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate hoje = LocalDate.now();
		int idade = Period.between(nascimento, hoje).getYears();
		return this.idade = idade; 
	}
	public void setTipoDeAtividade(String tipoDeAtividade){
		
		switch (tipoDeAtividade) {
		case "Leve":
			if(getSexo().equals("Masculino")) {
				this.tipoAtividade = String.valueOf(1.5);
				break;
			} else if (getSexo().equals("Feminino")){
				this.tipoAtividade = String.valueOf(1.6);
				break;
			}
		case "Moderada":
			if(getSexo().equals("Masculino")) {
				this.tipoAtividade = String.valueOf(1.8);
				break;
			} else if (getSexo().equals("Feminino")){
				this.tipoAtividade = String.valueOf(1.6);
				break;
			}
		case "Intensa":
			if(getSexo().equals("Masculino")) {
				this.tipoAtividade = String.valueOf(2.1);
				break;
			} else if (getSexo().equals("Feminino")){
				this.tipoAtividade = String.valueOf(1.8);
				break;
			}
		}
	}
	public String getTipoAtividade() {
		return this.tipoAtividade;
	}
	public double getImc() {
		return  getPeso()/(getAltura()*getAltura());
	}
	public String getStatusImc() {
		if (getPeso()/(getAltura()*getAltura()) < 17){			
	           return ("Muito abaixo do peso");
			} else if (getPeso()/(getAltura()*getAltura()) >= 17 && getPeso()/(getAltura()*getAltura()) < 18.5){
				return ("Abaixo do peso");
			} else if (getPeso()/(getAltura()*getAltura()) >= 18.5 && getPeso()/(getAltura()*getAltura()) < 25){
				return ("Peso normal");
			} else if (getPeso()/(getAltura()*getAltura()) >= 25 && getPeso()/(getAltura()*getAltura()) < 30){
				return ("Acima do peso");
			} else if (getPeso()/(getAltura()*getAltura()) >= 30 && getPeso()/(getAltura()*getAltura()) < 35){
				return ("Obesidade I");
			} else if (getPeso()/(getAltura()*getAltura()) >= 35 && getPeso()/(getAltura()*getAltura()) < 40){
				return ("Obesidade II (severa)");
			} else {
	            return ("Obesidade III (mórbida)");
			}
	}
	
	public double getNcd() {
		
		if(getSexo().equals("Masculino")) {
			if(getIdade() >= 18 && getIdade() <= 30) {
				return  (15.3 * getPeso() + 679) * Double.parseDouble(getTipoAtividade());
			} else if(getIdade() > 30 && getIdade() <= 60) {
				return (11.6 * getPeso() + 879) * Double.parseDouble(getTipoAtividade());
			} else {
				return (13.5 * getPeso() + 487) * Double.parseDouble(getTipoAtividade());
			}
		} else if (getSexo().equals("Feminino")) {
			if(getIdade() >= 18 && getIdade() <= 30) {
				return (14.7 * getPeso() + 496) * Double.parseDouble(getTipoAtividade());
			} else if(getIdade() > 30 && getIdade() <= 60) {
				return (8.7 * getPeso() + 829) * Double.parseDouble(getTipoAtividade());
			} else {
				return (10.5 * getPeso() + 596) * Double.parseDouble(getTipoAtividade());
			}
		} return 0;
		}

}

/*	public String getStatusNcd() {
	switch (getStatusImc()) {
	case "Muito abaixo do peso":
		return "Você precisa ingerir entre 0,5 à 1kg por semana para ganhar peso";
	case "Peso normal":
		return "Você está no peso ideal";
	case "Obesidade I":
		return "Você precisa ingerir entre 0,5 à 1kg por semana para perder peso";
				
	} return ""; 
	
} */
