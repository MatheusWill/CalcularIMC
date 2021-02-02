package oliveira.willian.matheus.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameFront {
	public void criarTela(){
//		Cria��o da tela principal
		JFrame telaFront = new JFrame();
		telaFront.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaFront.setSize(500, 600);
		telaFront.setTitle("C�lculo de IMC e NCD");
		telaFront.setLayout(null);
		telaFront.setLocationRelativeTo(null);
//		Cria��o das label
		
		JLabel fonte = new JLabel();
		fonte.setFont(new Font("Cursive", Font.ITALIC, 20));
//		Label do Nome
		JLabel labelNome = new JLabel();
		labelNome.setFont(new Font("Arial", Font.BOLD, 20));
		labelNome.setText("Nome:");
		labelNome.setBounds(10, 10, 80, 20);
//		Label Idade
		JLabel labelIdade = new JLabel();
		labelIdade.setFont(new Font("arial", Font.BOLD, 20));
		labelIdade.setText("Idade:");
		labelIdade.setBounds(10, 50, 80, 20);
//		Label Sexo
		JLabel labelSexo = new JLabel();
		labelSexo.setText("Sexo:");
		labelSexo.setBounds(10, 90, 80, 20);
//		Label Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(10, 130, 80, 20);
//		Label Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 170, 80, 20);
//		Label Atividade Fisica
		JLabel labelAtividadeFisica = new JLabel();
		labelAtividadeFisica.setFont(new Font("arial", Font.BOLD, 20));
		labelAtividadeFisica.setText("Atividade F�sica:");
		labelAtividadeFisica.setBounds(10, 210, 170, 20);
		labelAtividadeFisica.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		Label IMC
		JLabel labelImc	= new JLabel();
		labelImc.setFont(new Font("arial", Font.BOLD, 20));
		labelImc.setText("Seu IMC �:");
		labelImc.setBounds(10, 250, 110, 20);
//		Label NCD
		JLabel labelNcd	= new JLabel();
		labelNcd.setText("Seu NCD �:");
		labelNcd.setBounds(10, 290, 110, 20);
		
		
		
		
		telaFront.getContentPane().add(labelNome);
		telaFront.getContentPane().add(labelIdade);
		telaFront.getContentPane().add(labelSexo);
		telaFront.getContentPane().add(labelPeso);
		telaFront.getContentPane().add(labelAltura);
		telaFront.getContentPane().add(labelAtividadeFisica);
		telaFront.getContentPane().add(labelImc);
		telaFront.getContentPane().add(labelNcd);
		
		
		
		telaFront.setVisible(true);
	}
}