package oliveira.willian.matheus.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import oliveira.willian.matheus.model.Pessoa;

public class FrameFront {

	public void criarTela(){
		
		DecimalFormat formatado = new DecimalFormat("#,##0.00");
		formatado.setRoundingMode(RoundingMode.DOWN);
		
		Font fonte = new Font("Helvetica", Font.BOLD+Font.ITALIC, 20);
		Font fontText = new Font("Helvetica", Font.ITALIC, 18);
		Font fontRad = new Font("Helvetica", Font.BOLD+Font.ITALIC, 15);
		
//		Criação da tela principal
		JFrame telaFront = new JFrame();
		telaFront.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaFront.setSize(450, 500);
		telaFront.setTitle("Cálculo de IMC e NCD");
		telaFront.setLayout(null);
		telaFront.setLocationRelativeTo(null);
		telaFront.setFont(fonte);
		
		
		MaskFormatter mascaraDataNasc = null;
		try {
			mascaraDataNasc = new MaskFormatter("##/##/####");
			mascaraDataNasc.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		Criação das label
		
//		Label do Nome
		JLabel labelNome = new JLabel();
		labelNome.setFont(fonte);;
		labelNome.setText("Nome:");
		labelNome.setBounds(10, 10, 80, 30);
//		Label Data de Nascimento
		JLabel labelDataNasc = new JLabel();
		labelDataNasc.setFont(fonte);
		labelDataNasc.setText("Data de nascimento:");
		labelDataNasc.setBounds(10, 50, 220, 30);
//		Label Sexo
		JLabel labelSexo = new JLabel();
		labelSexo.setFont(fonte);
		labelSexo.setText("Sexo:");
		labelSexo.setBounds(10, 90, 80, 30);
//		Label Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setFont(fonte);
		labelPeso.setText("Peso:");
		labelPeso.setBounds(10, 130, 80, 30);
//		Label Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setFont(fonte);
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 170, 80, 30);
//		Label Atividade Fisica
		JLabel labelAtividadeFisica = new JLabel();
		labelAtividadeFisica.setFont(fonte);
		labelAtividadeFisica.setText("Atividade Física:");
		labelAtividadeFisica.setBounds(10, 215, 170, 20);
//		labelAtividadeFisica.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		Label IMC
		JLabel labelImc	= new JLabel();
		labelImc.setFont(fonte);
		labelImc.setText("Seu IMC é:");
		labelImc.setBounds(10, 275, 110, 30);
//		Label NCD
		JLabel labelNcd	= new JLabel();
		labelNcd.setFont(fonte);
		labelNcd.setText("Seu NCD é:");
		labelNcd.setBounds(10, 315, 110, 30);
//		Label Status IMC
		JLabel labelStatusImc	= new JLabel();
		labelStatusImc.setFont(fonte);
		labelStatusImc.setBounds(240, 275, 150, 30);
//		labelStatusImc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		Label Status NCD
		JLabel labelStatusNcd	= new JLabel();
		labelStatusNcd.setFont(fonte);
		labelStatusNcd.setBounds(240, 315, 80, 30);
		labelStatusNcd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
//		Criação das fields
		
//		Field Nome
		JTextField txtNome = new JTextField();
		txtNome.setBounds(100, 10, 280, 30);
		txtNome.setFont(fontText);
// 		Field Data de Nascimento
		JTextField txtDataNasc = new JTextField();
		txtDataNasc.setFont(fontText);
//		txtDataNasc.setBounds(230, 50, 110, 30);
		JFormattedTextField jFormattedTxtDataNasc = new JFormattedTextField(mascaraDataNasc);
		jFormattedTxtDataNasc.setBounds(230, 50, 110, 30);
		jFormattedTxtDataNasc.setFont(fontText);
		jFormattedTxtDataNasc.setHorizontalAlignment(SwingConstants.CENTER); 
//		Field Peso
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(100, 130, 80, 30);
		txtPeso.setFont(fontText);
//		Field Altura
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(100, 170, 80, 30);
		txtAltura.setFont(fontText);
		
//		Field Resultado IMC
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setBounds(130, 275, 80, 30);
		labelResultadoImc.setFont(fonte);
//		labelResultadoImc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		Field Resultado NCD
		JLabel labelResultadoNcd = new JLabel();
		labelResultadoNcd.setBounds(130, 315, 80, 30);
		labelResultadoNcd.setFont(fonte);
//		labelResultadoNcd.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
//		Radio Sexo
		JRadioButton radSexoM = new JRadioButton("Masculino");
		radSexoM.setLocation(100, 96);
		radSexoM.setSize(140, 20);
		radSexoM.setFont(fontRad);
		JRadioButton radSexoF = new JRadioButton("Feminino");
		radSexoF.setLocation(240, 96);
		radSexoF.setSize(140, 20);
		radSexoF.setFont(fontRad);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radSexoF);
		buttonGroup.add(radSexoM);
		
//		Combobox Atividade Fisica
		String[] opcoesAtividadeFisica = {"", "Leve", "Moderada", "Intensa"};
		JComboBox<String> listAtividadeFisica = new JComboBox<String>(opcoesAtividadeFisica);
		listAtividadeFisica.setBounds(190, 215, 120, 20);
		listAtividadeFisica.setFont(fontText);
		
//		Botão Calcular
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(10, 400, 160, 30);
		btnCalcular.setFont(fontText);
//		Botão Limpar
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(220, 400, 160, 30);
		btnLimpar.setFont(fontText);
		
		
		telaFront.getContentPane().add(labelNome);
		telaFront.getContentPane().add(labelDataNasc);
		telaFront.getContentPane().add(labelStatusImc);
//		telaFront.getContentPane().add(labelStatusNcd);
		telaFront.getContentPane().add(labelSexo);
		telaFront.getContentPane().add(labelPeso);
		telaFront.getContentPane().add(labelAltura);
		telaFront.getContentPane().add(labelAtividadeFisica);
		telaFront.getContentPane().add(labelImc);
		telaFront.getContentPane().add(labelNcd);
		telaFront.getContentPane().add(txtNome);
//		telaFront.getContentPane().add(txtDataNasc);
		telaFront.getContentPane().add(txtPeso);
		telaFront.getContentPane().add(txtAltura);
		telaFront.getContentPane().add(labelNcd);
		telaFront.getContentPane().add(labelImc);
		telaFront.getContentPane().add(radSexoF);
		telaFront.getContentPane().add(radSexoM);
		telaFront.getContentPane().add(listAtividadeFisica);
		telaFront.getContentPane().add(jFormattedTxtDataNasc);
		telaFront.getContentPane().add(btnCalcular);
		telaFront.getContentPane().add(btnLimpar);
		telaFront.getContentPane().add(labelResultadoNcd);
		telaFront.getContentPane().add(labelResultadoImc);

		
		telaFront.setVisible(true);
	
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Pessoa p = new Pessoa();
				
				p.setAltura(Double.parseDouble(txtAltura.getText()));
				p.setPeso(Double.parseDouble(txtPeso.getText()));
//				p.setdataNasc("15/02/1996");
				p.setdataNasc(jFormattedTxtDataNasc.getText());
				if(radSexoF.isSelected()) {
					p.setSexo("Feminino");
				} else {
					p.setSexo("Masculino");
				}
				p.setTipoDeAtividade(listAtividadeFisica.getSelectedItem().toString());
				
				labelResultadoImc.setText(String.valueOf(formatado.format(p.getImc())));
				labelResultadoNcd.setText(String.valueOf(formatado.format(p.getNcd())));
				labelStatusImc.setText(p.getStatusImc());
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				txtNome.setText(null);
				jFormattedTxtDataNasc.setText(null);
				buttonGroup.clearSelection();
				txtPeso.setText(null);
				txtAltura.setText(null);
				listAtividadeFisica.setSelectedIndex(0);
				labelResultadoImc.setText(null);
				labelResultadoNcd.setText(null);
				labelStatusImc.setText(null);
				
			}
		});
		
		
		
	}
	
}
