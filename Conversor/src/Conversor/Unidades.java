package Conversor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Unidades {
	
	Scanner sc = new Scanner(System.in);
	int unidade;
	int unidadeM;
	int unidadeL;
	int unidadeG;
	int unidadeH;
	int unidadeT;
		
	void escolherUnidade() {
 		 unidade = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Metro (Massa) \n 2- Litro (Volume) \n 3 - Grama (Massa) "
		 		+ "\n 4 - Hertz (Frequ�ncia) \n 5 - Segundos (Tempo) ", "Digite a unidade que voc� deseja converter:"
		 		, JOptionPane.INFORMATION_MESSAGE));
				
	
		 
switch(unidade){
		
	case 1:	
					
		unidadeM = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilometro \n 2- Hectograma \n 3 - Decametro "
		+ "\n 4 - Dec�metro \n 5 - Cent�metro \n 6 - Mil�metro", "Digite a unidade de comprimento que voc� deseja converter:"
		, JOptionPane.INFORMATION_MESSAGE));
			
			switch (unidadeM){
							
				case 1:
							
					double numeroKm;
					numeroKm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Kilometros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoKm = numeroKm / 1000;
			
					JOptionPane.showMessageDialog(null, "" + operacaoKm + "Km", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );	
							
				break;
					
				case 2:
			
					double numeroHm;
					numeroHm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Hectometros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoHm = numeroHm / 100;
				
					JOptionPane.showMessageDialog(null, "" + operacaoHm + "Hm", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					
				break;			
					
				case 3:
							
					double numeroDam;
					numeroDam = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Decametros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDam = numeroDam / 10;
						
					JOptionPane.showMessageDialog(null, "" + operacaoDam + "Dam", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				
				break;
					
				case 4:
								
					double numeroDm;
					numeroDm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Dec�metros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDm = numeroDm * 10;
					
					JOptionPane.showMessageDialog(null, "" + operacaoDm + "Dm", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
					
				case 5:
							
					double numeroCm;
					numeroCm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Cent�metros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoCm = numeroCm * 100;
				
					JOptionPane.showMessageDialog(null, "" + operacaoCm + "Cm", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
					
				case 6:
							
					double numeroMm;
					numeroMm = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Mil�metros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoMm = numeroMm * 1000;
				
					JOptionPane.showMessageDialog(null, "" + operacaoMm + "Mm", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					
				break;
				
			}
				
	case 2:
			
		unidadeL = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilolitro \n 2- Hectolitro \n 3 - Decalitro "
		+ "\n 4 - Dec�litro \n 5 - Cent�litro \n 6 - Mil�litro", "Digite a unidade de volume que voc� deseja converter:"
		, JOptionPane.INFORMATION_MESSAGE));
			
			switch (unidadeG ){
			
				case 1:
				
					double numeroKl;
					numeroKl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o valor para convers�o em Kilolitros:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoKl= numeroKl / 1000;

					JOptionPane.showMessageDialog(null, "" + operacaoKl+ "Kl", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );	
					
				break;
		
				case 2:
					
					double numeroHl;
								numeroHl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Hectolitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoHl = numeroHl / 100;
	
							JOptionPane.showMessageDialog(null, "" + operacaoHl + "Hl", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
		
					break;
			
		
					case 3:
				
								double numeroDal;
								numeroDal = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Decalitros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoDam = numeroDal / 10;
			
							JOptionPane.showMessageDialog(null, "" + operacaoDam + "Dal", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 4:
					
								double numeroDl;
								numeroDl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Dec�litros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoDl = numeroDl * 10;
		
							JOptionPane.showMessageDialog(null, "" + operacaoDl + "Dl", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 5:
				
								double numeroCl;
								numeroCl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Cent�litros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoCl = numeroCl * 100;
	
							JOptionPane.showMessageDialog(null, "" + operacaoCl + "Cl", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
		
					case 6:
				
								double numeroMl;
								numeroMl = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Mil�metros:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoMl = numeroMl * 1000;
								
							JOptionPane.showMessageDialog(null, "" + operacaoMl + "Ml", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
	
}
	 
			case 3:	
						unidadeG = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilograma \n 2- Hectograma \n 3 - Decagrama "
						+ "\n 4 - Dec�grama \n 5 - Cent�grama \n 6 - Mil�grama", "Digite a unidade de massa que voc� deseja converter:"
						, JOptionPane.INFORMATION_MESSAGE));
		
					switch (unidadeG){
						
						case 1:
						
									double numeroKg;
									numeroKg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Kilogramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoKg = numeroKg / 1000;
		
								JOptionPane.showMessageDialog(null, "" + operacaoKg + "Kg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );	
						
						break;
		
				
						case 2:
		
									double numeroHg;
									numeroHg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Hectogramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoHg = numeroHg / 100;
			
								JOptionPane.showMessageDialog(null, "" + operacaoHg + "Hg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				
						break;
					
				
						case 3:
						
									double numeroDag;
									numeroDag = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Decagramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoDag = numeroDag / 10;
					
								JOptionPane.showMessageDialog(null, "" + operacaoDag + "Dag", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
						break;
					
				
						case 4:
							
									double numeroDg;
									numeroDg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Dec�gramas:", JOptionPane.INFORMATION_MESSAGE ));				
									double operacaoDg = numeroDg * 10;
				
								JOptionPane.showMessageDialog(null, "" + operacaoDg + "Dg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
						break;
			
			
					case 5:
					
								double numeroCg;
								numeroCg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Cent�gramas:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoCg = numeroCg * 100;
								
							JOptionPane.showMessageDialog(null, "" + operacaoCg + "Cg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
			
			
					case 6:
					
								double numeroMg;
								numeroMg = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Mil�gramas:", JOptionPane.INFORMATION_MESSAGE ));				
								double operacaoMg = numeroMg * 1000;
		
							JOptionPane.showMessageDialog(null, "" + operacaoMg + "Mg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
					break;
		
	}
			case 4:	
				
				unidadeH = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Kilo-hertz \n 2- Mega-hertz \n 3 - Giga-hertz "
				, "Digite a unidade de frequ�ncia que voc� deseja converter:"
				, JOptionPane.INFORMATION_MESSAGE));

			switch (unidadeH){
				
				case 1:
				
							double numeroKHz;
							numeroKHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Kilo-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoKHz = numeroKHz / 1000;

						JOptionPane.showMessageDialog(null, "" + operacaoKHz + "KHz", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );	
				
				break;

		
				case 2:

							double numeroMHz;
							numeroMHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros para convers�o em Mega-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoMHz = numeroMHz / 1000000;
	
						JOptionPane.showMessageDialog(null, "" + operacaoMHz + "MHz", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
		
				break;
			
		
				case 3:
				
							double numeroGHz;
							numeroGHz = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite em metros o para convers�o em Giga-hertz:", JOptionPane.INFORMATION_MESSAGE ));				
							double operacaoGHz = numeroGHz / 1000000000;
			
						JOptionPane.showMessageDialog(null, "" + operacaoGHz + "GHz", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				break;
			
			
				}
			
			case 5:
				
				unidadeT = Integer.parseInt(JOptionPane.showInputDialog( null, "1 - Segundos \n 2-  Horas \n 3 - Dias "
						+ "\n 4 - Semanas \n 5 - Meses \n 6 - Anos", "Digite a unidade de tempo que voc� deseja converter:"
						, JOptionPane.INFORMATION_MESSAGE));
				switch(unidadeT){
				
				case 1:
					
					double segundos;
					segundos = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantos Minutos voc� quer converter para Segundos:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoSeg = segundos * 60;

				JOptionPane.showMessageDialog(null, "" + operacaoSeg + "seg", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );	
		
				break;


				case 2:

					double horas;
					horas = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantas Horas voc� quer converter para Minutos:", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoHr = horas * 60;

				JOptionPane.showMessageDialog(null, "" + operacaoHr + "hr", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );

				break;
	

				case 3:
		
					double dias;
					dias = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite quantos Dias voc� deseja para convers�o em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoDias = dias * 1440;
	
				JOptionPane.showMessageDialog(null, "" + operacaoDias + "Min", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				break;
	

				case 4:
			
					double semana;
					semana = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantas Semanas voc� deseja para convers�o em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
					double operacaoSem = semana * 10;

				JOptionPane.showMessageDialog(null, "" + operacaoSem + "Semana(s)", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				break;


				case 5:
	
				double mes;
				mes = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantos Meses voc� deseja para convers�o em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
				double operacaoMes = mes * 43800;
				
				JOptionPane.showMessageDialog(null, "" + operacaoMes + "M�s(es)", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
				break;
		

				case 6:
	
				double ano;
				ano = Double.parseDouble(JOptionPane.showInputDialog(null, "","Digite a quantoos Anos voc� deseja para convers�o em Minutos", JOptionPane.INFORMATION_MESSAGE ));				
				double operacaoAno = ano * 525600;

			JOptionPane.showMessageDialog(null, "" + operacaoAno + "Ano(s)", "O valor da convers�o:", JOptionPane.INFORMATION_MESSAGE );
			break;
					
				}
		 	}
		}
	}
	

			
			
	

