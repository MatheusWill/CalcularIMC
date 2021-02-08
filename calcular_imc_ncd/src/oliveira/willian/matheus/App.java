package oliveira.willian.matheus;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import oliveira.willian.matheus.gui.FrameFront;
import oliveira.willian.matheus.model.Pessoa;

public class App {

	public static void main(String[] args) {
		
		DecimalFormat formatado = new DecimalFormat("#,##0.00");
		formatado.setRoundingMode(RoundingMode.DOWN);
		
		FrameFront tela = new FrameFront();
		tela.criarTela();

		Pessoa p = new Pessoa();
		Pessoa f = new Pessoa();
		
		p.setPeso(100);
		p.setAltura(1.74);
		p.setdataNasc("15/02/1996");
		p.setSexo("Masculino");
		p.setTipoDeAtividade("Leve");
		f.setSexo("Feminino");
		
		
		System.out.println(p.getdataNasc());
		System.out.println(p.getIdade());
		System.out.println(p.getTipoAtividade());
		System.out.println(p.getPeso());
		System.out.println(p.getAltura());
		System.out.println(formatado.format(p.getImc()));
		System.out.println(p.getStatusImc());
		System.out.println(p.getNcd());
		System.out.println(p.getSexo());
		System.out.println(f.getSexo());
		
	}

}
