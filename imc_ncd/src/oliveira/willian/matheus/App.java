package oliveira.willian.matheus;


import oliveira.willian.matheus.model.Calculo;
import oliveira.willian.matheus.model.Pessoa;

public class App {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Calculo imc = new Calculo();
		Calculo ncd = new Calculo();
		p.setAltura(1.74);
		p.setPeso(100);
		p.setdataNasc("15/02/1996");
		System.out.println(p.getIdade());
		System.out.println(imc.getImc());
		System.out.println(ncd.getNcd());
		System.out.println(p.getAltura());
		System.out.println(p.getPeso());
		

		
		
	}
	
	
}
	
	
	
	
	
/*	public static void teste() {
		LocalDate data1 = LocalDate.of(1996, 02, 15);
		LocalDate data2 = LocalDate.of(2020, 02, 01);
		
		Period idade = Period.between(data1, data2);
		int anos = idade.getYears();
		
		System.out.println(anos);
		
	} */
