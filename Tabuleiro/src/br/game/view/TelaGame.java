package br.game.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import br.game.model.bean.Jogador1;
import br.game.model.bean.Jogador2;

public class TelaGame extends JFrame implements ActionListener{	
	private static final long serialVersionUID = 1L;
	JLabel logo;
	JLabel logo2;
	JLabel logo3;
	int semJogarJ1=0;
	int semJogarJ2=0;
	Jogador1 jogador1 = new Jogador1();
	Jogador2 jogador2 = new Jogador2();
	int posicaoAvancar=0;
	int posicaoAvancar2=0;
	int posicaoVoltar=0;
	int posicaoVoltar2=0;
	public  JButton voltar;
	public  JButton jogarDado1;
	public  JButton jogarDado2;
	public  JButton pista1;
	public  JButton pista2;
	public  JButton pista3;
	public  JButton pista4;
	public  JButton pista5;
	public  JButton pista6;
	public  JButton pista7;
	public  JButton pista8;
	public  JButton pista9;
	public  JButton pista10;
	public  JButton pista11;
	public  JButton pista12;
	public  JButton pista13;
	public  JButton pista14;
	public  JButton pista15;
	public  JButton pista16;
	public  JButton pista17;
	public  JButton pista18;
	public  JButton pista19;
	public  JButton pista20;
	public  JButton pista21;
	public  JButton pista22;
	public  JButton pista23;
	public  JButton pista24;
	public  JButton pista25;
	public  JButton pista26;
	public  JButton pista27;
	public  JButton pista28;
	public  JButton pista29;
	public  JButton pista30;
	public  JButton pista31;
	public  JButton pista32;
	public  JButton pista33;
	public  JButton pista34;
	public  JButton pista35;
	public  JButton pista36;
	public  JButton pista37;
	public  JButton pista38;
	public  JButton pista39;
	public  JButton pista40;
	public  JButton pista41;

	private JPanel p1;

	ImageIcon iconeJogador1=new ImageIcon("src/jogador1.gif");
	ImageIcon iconeJogador2=new ImageIcon("src/jogador2.gif");
	ImageIcon iconeDuplo=new ImageIcon("src/jogadores.gif");
	ImageIcon icone=new ImageIcon("");
	ImageIcon logo1=new ImageIcon("src/logo1.jpg");
	ImageIcon logos3=new ImageIcon("src/logo3.jpg");
	ImageIcon icone1=new ImageIcon("src/dado1.png");
	ImageIcon icone2=new ImageIcon("src/dado2.png");
	ImageIcon icone3=new ImageIcon("src/dado3.png");
	ImageIcon icone4=new ImageIcon("src/dado4.png");
	ImageIcon icone5=new ImageIcon("src/dado5.png");
	ImageIcon icone6=new ImageIcon("src/dado6.png");
	ImageIcon dados=new ImageIcon("src/dados.gif");

	public TelaGame(){
		super(".:: GAME ::.");	
		Container container = getContentPane();
		ImageIcon icone = new ImageIcon("src/dado1.png");
		setIconImage(icone.getImage());
		AudioPlayer.playLoop("src/som.wav" );
		jogador1.setNome("DOM PEDRO I");
		jogador1.setPosicao(0);
		jogador2.setNome("MARIA LEOPOLDINA");
		jogador2.setPosicao(0);

		pista1=new JButton("0",iconeDuplo);
		pista1.setBackground(Color.white);
		pista1.setEnabled(true);
		pista1.addActionListener(this);
		//pista1.setContentAreaFilled(false);
		//pista1.setBorderPainted(false);
		pista1.setFocusPainted(false);
		pista1.setBounds(3, 3,125,75);

		pista2=new JButton("1");
		pista2.setBackground(Color.white);
		pista2.setEnabled(true);
		pista2.addActionListener(this);
		//pista2.setContentAreaFilled(false);
		//pista2.setBorderPainted(false);
		pista2.setFocusPainted(false);
		pista2.setBounds(3,79,125,75);

		pista3=new JButton("2");
		pista3.setBackground(Color.white);
		pista3.setEnabled(true);
		pista3.addActionListener(this);
		//pista3.setContentAreaFilled(false);
		//pista3.setBorderPainted(false);
		pista3.setFocusPainted(false);
		pista3.setBounds(3,155,125,75);

		pista4=new JButton("3");
		pista4.setBackground(Color.white);
		pista4.setEnabled(true);
		pista4.addActionListener(this);
		//pista4.setContentAreaFilled(false);
		//pista4.setBorderPainted(false);
		pista4.setFocusPainted(false);
		pista4.setBounds(3,231,125,75);

		pista5=new JButton("4");
		pista5.setBackground(Color.white);
		pista5.setEnabled(true);
		pista5.addActionListener(this);
		//pista5.setContentAreaFilled(false);
		//pista5.setBorderPainted(false);
		pista5.setFocusPainted(false);
		pista5.setBounds(3,307,125,75);

		pista6=new JButton("5");
		pista6.setBackground(Color.white);
		pista6.setEnabled(true);
		pista6.addActionListener(this);
		//pista6.setContentAreaFilled(false);
		//pista6.setBorderPainted(false);
		pista6.setFocusPainted(false);
		pista6.setBounds(3,383,125,75);

		pista7=new JButton("6");
		pista7.setBackground(Color.white);
		pista7.setEnabled(true);
		pista7.addActionListener(this);
		//pista7.setContentAreaFilled(false);
		//pista7.setBorderPainted(false);
		pista7.setFocusPainted(false);
		pista7.setBounds(3,459,125,75);

		pista8=new JButton("7");
		pista8.setBackground(Color.white);
		pista8.setEnabled(true);
		pista8.addActionListener(this);
		//pista8.setContentAreaFilled(false);
		//pista8.setBorderPainted(false);
		pista8.setFocusPainted(false);
		pista8.setBounds(3,535,125,75);

		pista9=new JButton("8");
		pista9.setBackground(Color.white);
		pista9.setEnabled(true);
		pista9.addActionListener(this);
		//pista9.setContentAreaFilled(false);
		//pista9.setBorderPainted(false);
		pista9.setFocusPainted(false);
		pista9.setBounds(129,535,125,75);

		pista10=new JButton("9");
		pista10.setBackground(Color.white);
		pista10.setEnabled(true);
		pista10.addActionListener(this);
		//pista10.setContentAreaFilled(false);
		//pista10.setBorderPainted(false);
		pista10.setFocusPainted(false);
		pista10.setBounds(255,535,125,75);

		pista11=new JButton("10");
		pista11.setBackground(Color.white);
		pista11.setEnabled(true);
		pista11.addActionListener(this);
		//pista11.setContentAreaFilled(false);
		//pista11.setBorderPainted(false);
		pista11.setFocusPainted(false);
		pista11.setBounds(255,459,125,75);

		pista12=new JButton("11");
		pista12.setBackground(Color.white);
		pista12.setEnabled(true);
		pista12.addActionListener(this);
		//pista12.setContentAreaFilled(false);
		//pista12.setBorderPainted(false);
		pista12.setFocusPainted(false);
		pista12.setBounds(255,383,125,75);

		pista13=new JButton("12");
		pista13.setBackground(Color.white);
		pista13.setEnabled(true);
		pista13.addActionListener(this);
		//pista13.setContentAreaFilled(false);
		//pista13.setBorderPainted(false);
		pista13.setFocusPainted(false);
		pista13.setBounds(255,307,125,75);

		pista14=new JButton("13");
		pista14.setBackground(Color.white);
		pista14.setEnabled(true);
		pista14.addActionListener(this);
		//pista14.setContentAreaFilled(false);
		//pista14.setBorderPainted(false);
		pista14.setFocusPainted(false);
		pista14.setBounds(255,231,125,75);


		pista15=new JButton("14");
		pista15.setBackground(Color.white);
		pista15.setEnabled(true);
		pista15.addActionListener(this);
		//pista15.setContentAreaFilled(false);
		//pista15.setBorderPainted(false);
		pista15.setFocusPainted(false);
		pista15.setBounds(255,155,125,75);

		pista16=new JButton("15");
		pista16.setBackground(Color.white);
		pista16.setEnabled(true);
		pista16.addActionListener(this);
		//pista16.setContentAreaFilled(false);
		//pista16.setBorderPainted(false);
		pista16.setFocusPainted(false);
		pista16.setBounds(255,79,125,75);


		pista17=new JButton("16");
		pista17.setBackground(Color.white);
		pista17.setEnabled(true);
		pista17.addActionListener(this);
		//pista17.setContentAreaFilled(false);
		//pista17.setBorderPainted(false);
		pista17.setFocusPainted(false);

		pista17.setBounds(255,3,125,75);

		pista18=new JButton("17");
		pista18.setBackground(Color.white);
		pista18.setEnabled(true);
		pista18.addActionListener(this);
		//pista18.setContentAreaFilled(false);
		//pista18.setBorderPainted(false);
		pista18.setFocusPainted(false);
		pista18.setBounds(381,3,125,75);

		pista19=new JButton("18");
		pista19.setBackground(Color.white);
		pista19.setEnabled(true);
		pista19.addActionListener(this);
		//pista19.setContentAreaFilled(false);
		//pista19.setBorderPainted(false);
		pista19.setFocusPainted(false);
		pista19.setBounds(507,3,125,75);

		pista20=new JButton("19");
		pista20.setBackground(Color.white);
		pista20.setEnabled(true);
		pista20.addActionListener(this);
		//pista20.setContentAreaFilled(false);
		//pista20.setBorderPainted(false);
		pista20.setFocusPainted(false);
		pista20.setBounds(633,3,125,75);

		pista21=new JButton("20");
		pista21.setBackground(Color.white);
		pista21.setEnabled(true);
		pista21.addActionListener(this);
		//pista21.setContentAreaFilled(false);
		//pista21.setBorderPainted(false);
		pista21.setFocusPainted(false);
		pista21.setBounds(759,3,125,75);

		JLabel texto = new JLabel("LANÇAR O DADO");
		texto.setFont(new Font("Serif", Font.BOLD,18));
		texto.setForeground(Color.orange);
		texto.setBounds(940,-30,155,75);

		JLabel dado = new JLabel("DOM PEDRO I");
		dado.setFont(new Font("Serif", Font.BOLD,12));
		dado.setForeground(Color.orange);
		dado.setBounds(910,67,95,45);

		JLabel dado2 = new JLabel("MARIA LEOPOLDINA");
		dado2.setFont(new Font("Serif", Font.BOLD,12));
		dado2.setForeground(Color.orange);
		dado2.setBounds(1020,67,135,45);

		jogarDado1=new JButton(dados);
		jogarDado1.setBackground(Color.white);
		jogarDado1.setEnabled(true);
		jogarDado1.addActionListener(this);
		jogarDado1.setFocusPainted(false);
		jogarDado1.setBounds(915,28,66,55);

		jogarDado2=new JButton(dados);
		jogarDado2.setBackground(Color.white);
		jogarDado2.setEnabled(false);
		jogarDado2.addActionListener(this);
		jogarDado2.setFocusPainted(false);
		jogarDado2.setBounds(1045,28,66,55);

		pista22=new JButton("21");
		pista22.setBackground(Color.white);
		pista22.setEnabled(true);
		pista22.addActionListener(this);
		//pista22.setContentAreaFilled(false);
		//pista22.setBorderPainted(false);
		pista22.setFocusPainted(false);
		pista22.setBounds(759,79,125,75);

		pista23=new JButton("22");
		pista23.setBackground(Color.white);
		pista23.setEnabled(true);
		pista23.addActionListener(this);
		//pista23.setContentAreaFilled(false);
		//pista23.setBorderPainted(false);
		pista23.setFocusPainted(false);
		pista23.setBounds(759,155,125,75);

		pista24=new JButton("23");
		pista24.setBackground(Color.white);
		pista24.setEnabled(true);
		pista24.addActionListener(this);
		//pista24.setContentAreaFilled(false);
		//pista24.setBorderPainted(false);
		pista24.setFocusPainted(false);
		pista24.setBounds(759,231,125,75);

		pista25=new JButton("24");
		pista25.setBackground(Color.white);
		pista25.setEnabled(true);
		pista25.addActionListener(this);
		//pista25.setContentAreaFilled(false);
		//pista25.setBorderPainted(false);
		pista25.setFocusPainted(false);		
		pista25.setBounds(759,307,125,75);

		pista26=new JButton("25");
		pista26.setBackground(Color.white);
		pista26.setEnabled(true);
		pista26.addActionListener(this);
		//pista26.setContentAreaFilled(false);
		//pista26.setBorderPainted(false);
		pista26.setFocusPainted(false);
		pista26.setBounds(759,383,125,75);

		pista27=new JButton("26");
		pista27.setBackground(Color.white);
		pista27.setEnabled(true);
		pista27.addActionListener(this);
		//pista27.setContentAreaFilled(false);
		//pista27.setBorderPainted(false);
		pista27.setFocusPainted(false);
		pista27.setBounds(759,459,125,75);

		pista28=new JButton("27");
		pista28.setBackground(Color.white);
		pista28.setEnabled(true);
		pista28.addActionListener(this);
		//pista28.setContentAreaFilled(false);
		//pista28.setBorderPainted(false);
		pista28.setFocusPainted(false);
		pista28.setBounds(759,535,125,75);

		pista29=new JButton("28");
		pista29.setBackground(Color.white);
		pista29.setEnabled(true);
		pista29.addActionListener(this);
		//pista29.setContentAreaFilled(false);
		//pista29.setBorderPainted(false);
		pista29.setFocusPainted(false);
		pista29.setBounds(633,535,125,75);

		pista30=new JButton("29");
		pista30.setBackground(Color.white);
		pista30.setEnabled(true);
		pista30.addActionListener(this);
		//pista30.setContentAreaFilled(false);
		//pista30.setBorderPainted(false);
		pista30.setFocusPainted(false);
		pista30.setBounds(507,535,125,75);

		pista31=new JButton("30");
		pista31.setBackground(Color.white);
		pista31.setEnabled(true);
		pista31.addActionListener(this);
		//pista31.setContentAreaFilled(false);
		//pista31.setBorderPainted(false);
		pista31.setFocusPainted(false);
		pista31.setBounds(507,459,125,75);
		
		logo= new JLabel(logo1);
		logo.setBounds(800,-20,400,750);
			
		logo3= new JLabel(logos3);
		logo3.setBounds(-20,-187,900,950);

		p1 = new JPanel(new BorderLayout());
		p1.setLayout(null);
		p1.setBackground(Color.black);

		p1.add(pista1);
		p1.add(pista2);
		p1.add(pista3);
		p1.add(pista4);
		p1.add(pista5);
		p1.add(pista6);
		p1.add(pista7);
		p1.add(pista8);
		p1.add(pista9);
		p1.add(pista10);
		p1.add(pista11);
		p1.add(pista12);
		p1.add(pista13);
		p1.add(pista14);
		p1.add(pista15);
		p1.add(pista16);
		p1.add(pista17);
		p1.add(pista18);
		p1.add(pista19);
		p1.add(pista20);
		p1.add(pista21);
		p1.add(pista22);
		p1.add(pista23);
		p1.add(pista24);
		p1.add(pista25);
		p1.add(pista26);
		p1.add(pista27);
		p1.add(pista28);
		p1.add(pista29);
		p1.add(pista30);
		p1.add(pista31);
		p1.add(texto);
		p1.add(dado);
		p1.add(dado2);
		p1.add(jogarDado1);
		p1.add(jogarDado2);
		p1.add(logo);
		p1.add(logo3);
		container.add(p1);
		setSize(1150,625);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	/*AÇÃO PARA COLOCAR A IMAGEM DUPLA NA PISTA*/
	public void alterarPosicaoDupla(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(iconeDuplo);
			break;
		case 1:
			pista2.setIcon(iconeDuplo);
			break;
		case 2:
			pista3.setIcon(iconeDuplo);
			break;
		case 3:
			pista4.setIcon(iconeDuplo);
			break;
		case 4:
			pista5.setIcon(iconeDuplo);
			break;
		case 5:
			pista6.setIcon(iconeDuplo);
			break;
		case 6:
			pista7.setIcon(iconeDuplo);
			break;
		case 7:
			pista8.setIcon(iconeDuplo);
			break;
		case 8:
			pista9.setIcon(iconeDuplo);
			break;
		case 9:
			pista10.setIcon(iconeDuplo);
			break;
		case 10:
			pista11.setIcon(iconeDuplo);
			break;
		case 11:
			pista12.setIcon(iconeDuplo);
			break;
		case 12:
			pista13.setIcon(iconeDuplo);
			break;
		case 13:
			pista14.setIcon(iconeDuplo);
			break;
		case 14:
			pista15.setIcon(iconeDuplo);
			break;
		case 15:
			pista16.setIcon(iconeDuplo);
			break;
		case 16:
			pista17.setIcon(iconeDuplo);
			break;
		case 17:
			pista18.setIcon(iconeDuplo);
			break;
		case 18:
			pista19.setIcon(iconeDuplo);
			break;
		case 19:
			pista20.setIcon(iconeDuplo);
			break;
		case 20:
			pista21.setIcon(iconeDuplo);
			break;
		case 21:
			pista22.setIcon(iconeDuplo);
			break;
		case 22:
			pista23.setIcon(iconeDuplo);
			break;
		case 23:
			pista24.setIcon(iconeDuplo);
			break;
		case 24:
			pista25.setIcon(iconeDuplo);
			break;
		case 25:
			pista26.setIcon(iconeDuplo);
			break;
		case 26:
			pista27.setIcon(iconeDuplo);
			break;
		case 27:
			pista28.setIcon(iconeDuplo);
			break;
		case 28:
			pista29.setIcon(iconeDuplo);
			break;
		case 29:
			pista30.setIcon(iconeDuplo);
			break;
		case 30:
			pista31.setIcon(iconeDuplo);
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA COLOCAR A IMAGEM DO JOGADOR1 NA PISTA*/
	public void alterarPosicaoJogador1(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(iconeJogador1);
			break;
		case 1:
			pista2.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Hoje dia 7 de março de 1808, Dom Pedro I  tem 9 anos de idade,\nacaba de chegar ao Brasil, junto com a família real \nfugindo das tropas napoleônicas e instalou-se no/n Rio de Janeiro, na Quinta da Boa Vista. \nAvance 3 casas.","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			pista2.setIcon(icone);
			jogador1.setPosicao(posicaoAvancar);
			avancarJogador1(3);
			break;
		case 2:
			pista3.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Estamos em março de 1816, avó de Dom Pedro I Dona Maria I,\nrainha de Portugal, Morreu e Dom João VI é aclamado rei\n e Dom Pedro, mesmo com 18 anos, torna-se Príncipe Real\n e herdeiro direto do trono, em virtude da morte do seu irmão\n mais velho, Antônio.\n Fique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			semJogarJ1=1;
			break;
		case 3:
			pista4.setIcon(iconeJogador1);

			break;
		case 4:
			pista5.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Hoje dia 13 de maio de 1817 voce se casou com \n Leopoldina Josefa Carolina\n Seu adversario deve ficar 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			semJogarJ2=1;
			break;
		case 5:
			pista6.setIcon(iconeJogador1);
			break;
		case 6:
			pista7.setIcon(iconeJogador1);
			break;
		case 7:
			pista8.setIcon(iconeJogador1);
			break;
		case 8:
			pista9.setIcon(iconeJogador1);
			break;
		case 9:
			pista10.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Em 1820 Portugal passava por grave crise política e social. \nA Revolução Liberal do Porto se espalhou por todo pais.\n A Constituição era a palavra de ordem. \n No dia 26 de abril de 1821,\n Dom João VI e sua corte voltam para Portugal, \nficando Dom Pedro como Príncipe Regente do Brasil.\n A corte de Lisboa despachou então um decreto\n exigindo que o Príncipe retornasse a Portugal\n e que o Brasil voltasse à condição de colônia. \n O decreto vindo da corte provocou \n grande desagrado popular.\n Um abaixo-assinado com oito mil assinaturas \nfoi levado a Dom Pedro, solicitando sua permanência no Brasil.\n No dia 9 de janeiro de 1822, cedendo às pressões\n você príncipe declara: Como é para o bem de todos e felicidade geral da nação,\n estou pronto. Diga ao povo que fico. \nO Dia do Fico era mais um rompimento com Portugal.\n A atitude de Dom Pedro desagradou a Corte Portuguesa, \nque suspendeu o pagamento de seus rendimentos. \n Fique 2 vezes sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			semJogarJ1=2;
			break;
		case 10:
			pista11.setIcon(iconeJogador1);
			break;
		case 11:
			pista12.setIcon(iconeJogador1);
			break;
		case 12:
			pista13.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Voce está com popularidade cada vez mais em alta, mas viajando de Santos\n para a capital Paulista voce recebeu uma correspondência de Portugal,\n comunicando que fora rebaixado da condição de regente\n a mero Delegado das Cortes de Lisboa. Indignado, ali mesmo,\n em 7 de setembro de 1822, junto ao riacho do Ipiranga,\n voce resolveu romper definitivamente com a autoridade paterna e\n declarou: Independência ou morte! \nEstamos separados de Portugal!.\nVocê avança 4 casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			pista13.setIcon(icone);
			jogador1.setPosicao(posicaoAvancar);
			avancarJogador1(4);			
			break;
		case 13:
			pista14.setIcon(iconeJogador1);
			break;
		case 14:
			pista15.setIcon(iconeJogador1);
			break;
		case 15:
			pista16.setIcon(iconeJogador1);
			break;
		case 16:
			pista17.setIcon(iconeJogador1);
			break;
		case 17:
			pista18.setIcon(iconeJogador1);
			break;
		case 18:
			pista19.setIcon(iconeJogador1);
			break;
		case 19:
			pista20.setIcon(iconeJogador1);
			break;
		case 20:
			pista21.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Hoje dia 2 de julho de 1824 eclodiu em Pernambuco,\n se alastrando para outras províncias do Nordeste do Brasil\n a Confederação do Equador  um movimento revolucionário\n Volte para o Inicio","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			pista21.setIcon(icone);
			jogador1.setPosicao(0);
			voltarJogador1(0);
			break;
		case 21:
			pista22.setIcon(iconeJogador1);
			break;
		case 22:
			pista23.setIcon(iconeJogador1);			
			JOptionPane.showMessageDialog(null, "Estamos no periodo de 1825 a 1828 - Guerra da Cisplatina: \nmovimento que tornou a região \ndo Uruguai independente do Brasil. \nVolte casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			pista23.setIcon(icone);
			//jogador1.setPosicao(posicaoAvancar);
			voltarJogador1(2);
			break;
		case 23:
			pista24.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Estamos em 1831  Após muitos protestos populares\n e oposição de vários  setores da sociedade,\n D. Pedro I abdica ao trono em favor de seu filho. \nFique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			semJogarJ1=1;
			break;
		case 24:
			pista25.setIcon(iconeJogador1);
			break;
		case 25:
			pista26.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Estamos no perido de 1831 a 1840 várias revoltas sociais.\n A maior parte delas eram em protesto \ncontra as péssimas condições de vida,  alta de impostos, autoritarismo e\n abandono social das camadas mais populares da população. \nNeste contexto podemos citar:\n Balaiada, Cabanagem, Sabinada, Guerra dos Malês, Cabanada e Revolução Farroupilha.\nFique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			semJogarJ1=1;
			break;
		case 26:
			pista27.setIcon(iconeJogador1);
			break;
		case 27:
			pista28.setIcon(iconeJogador1);
			JOptionPane.showMessageDialog(null, "Hoje dia 7 de setembro de 1822 voce Proclamou a Independência do Brasil\n Avance casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			pista28.setIcon(icone);
			jogador1.setPosicao(posicaoAvancar);
			avancarJogador1(3);			
			break;
		case 28:
			pista29.setIcon(iconeJogador1);
			break;
		case 29:
			pista30.setIcon(iconeJogador1);
			break;
		case 30:
			pista31.setIcon(iconeJogador1);
			AudioPlayer.Stop();
			AudioPlayer.play("src/venceu.wav");
			JOptionPane.showMessageDialog(null, "Parabéns voce foi o Vencedor!","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador1.gif"));
			System.exit(0);
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA COLOCAR A IMAGEM JOGADOR1 NA PISTA*/
	public void alterarPosicaoJogador2(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(iconeJogador2);
			break;
		case 1:
			pista2.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Hoje dia 7 de março de 1808, Dom Pedro I  tem 9 anos de idade,\nacaba de chegar ao Brasil, junto com a família real \nfugindo das tropas napoleônicas e instalou-se no/n Rio de Janeiro, na Quinta da Boa Vista. \nAvance 3 casas.","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			pista2.setIcon(icone);
			jogador2.setPosicao(posicaoAvancar2);
			avancarJogador2(3);
			break;
		case 2:
			pista3.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Estamos em março de 1816, avó de Dom Pedro I Dona Maria I,\nrainha de Portugal, Morreu e Dom João VI é aclamado rei\n e Dom Pedro, mesmo com 18 anos, torna-se Príncipe Real\n e herdeiro direto do trono, em virtude da morte do seu irmão\n mais velho, Antônio.\n Fique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			semJogarJ2=1;
			break;
		case 3:
			pista4.setIcon(iconeJogador2);

			break;
		case 4:
			pista5.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Hoje dia 13 de maio de 1817 voce se casou com \n Leopoldina Josefa Carolina\n Seu adversario deve ficar 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			semJogarJ1=1;
			break;
		case 5:
			pista6.setIcon(iconeJogador2);
			break;
		case 6:
			pista7.setIcon(iconeJogador2);
			break;
		case 7:
			pista8.setIcon(iconeJogador2);
			break;
		case 8:
			pista9.setIcon(iconeJogador2);
			break;
		case 9:
			pista10.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Em 1820 Portugal passava por grave crise política e social. \nA Revolução Liberal do Porto se espalhou por todo pais.\n A Constituição era a palavra de ordem. \n No dia 26 de abril de 1821,\n Dom João VI e sua corte voltam para Portugal, \nficando Dom Pedro como Príncipe Regente do Brasil.\n A corte de Lisboa despachou então um decreto\n exigindo que o Príncipe retornasse a Portugal\n e que o Brasil voltasse à condição de colônia. \n O decreto vindo da corte provocou \n grande desagrado popular.\n Um abaixo-assinado com oito mil assinaturas \nfoi levado a Dom Pedro, solicitando sua permanência no Brasil.\n No dia 9 de janeiro de 1822, cedendo às pressões\n você príncipe declara: Como é para o bem de todos e felicidade geral da nação,\n estou pronto. Diga ao povo que fico. \nO Dia do Fico era mais um rompimento com Portugal.\n A atitude de Dom Pedro desagradou a Corte Portuguesa, \nque suspendeu o pagamento de seus rendimentos. \n Fique 2 vezes sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			semJogarJ2=2;
			break;
		case 10:
			pista11.setIcon(iconeJogador2);
			break;
		case 11:
			pista12.setIcon(iconeJogador2);
			break;
		case 12:
			pista13.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Voce está com popularidade cada vez mais em alta, mas viajando de Santos\n para a capital Paulista voce recebeu uma correspondência de Portugal,\n comunicando que fora rebaixado da condição de regente\n a mero Delegado das Cortes de Lisboa. Indignado, ali mesmo,\n em 7 de setembro de 1822, junto ao riacho do Ipiranga,\n voce resolveu romper definitivamente com a autoridade paterna e\n declarou: Independência ou morte! \nEstamos separados de Portugal!.\nVocê avança 4 casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			pista13.setIcon(icone);
			jogador2.setPosicao(posicaoAvancar2);
			avancarJogador2(4);
			break;
		case 13:
			pista14.setIcon(iconeJogador2);
			break;
		case 14:
			pista15.setIcon(iconeJogador2);
			break;
		case 15:
			pista16.setIcon(iconeJogador2);
			break;
		case 16:
			pista17.setIcon(iconeJogador2);
			break;
		case 17:
			pista18.setIcon(iconeJogador2);
			break;
		case 18:
			pista19.setIcon(iconeJogador2);
			break;
		case 19:
			pista20.setIcon(iconeJogador2);
			break;
		case 20:
			pista21.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Hoje dia 2 de julho de 1824 eclodiu em Pernambuco,\n se alastrando para outras províncias do Nordeste do Brasil\n a Confederação do Equador  um movimento revolucionário\n Volte para o Inicio","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			pista21.setIcon(icone);
			jogador2.setPosicao(0);
			voltarJogador2(0);
			break;
		case 21:
			pista22.setIcon(iconeJogador2);
			break;
		case 22:
			pista23.setIcon(iconeJogador2);			
			JOptionPane.showMessageDialog(null, "Estamos no periodo de 1825 a 1828 - Guerra da Cisplatina: \nmovimento que tornou a região \ndo Uruguai independente do Brasil. \nVolte casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			pista23.setIcon(icone);
			//jogador2.setPosicao(posicaoVoltar2);
			voltarJogador2(3);
			break;
		case 23:
			pista24.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Estamos em 1831  Após muitos protestos populares\n e oposição de vários  setores da sociedade,\n D. Pedro I abdica ao trono em favor de seu filho. \nFique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			semJogarJ2=1;
			break;
		case 24:
			pista25.setIcon(iconeJogador2);
			break;
		case 25:
			pista26.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Estamos no perido de 1831 a 1840 várias revoltas sociais.\n A maior parte delas eram em protesto \ncontra as péssimas condições de vida,  alta de impostos, autoritarismo e\n abandono social das camadas mais populares da população. \nNeste contexto podemos citar:\n Balaiada, Cabanagem, Sabinada, Guerra dos Malês, Cabanada e Revolução Farroupilha.\nFique 1 vez sem jogar","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			semJogarJ2=1;
			break;
		case 26:
			pista27.setIcon(iconeJogador2);
			break;
		case 27:
			pista28.setIcon(iconeJogador2);
			JOptionPane.showMessageDialog(null, "Hoje dia 7 de setembro de 1822 voce Proclamou a Independência do Brasil\n Avance casas","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			pista28.setIcon(icone);
			jogador2.setPosicao(posicaoAvancar2);
			avancarJogador2(3);
			break;
		case 28:
			pista29.setIcon(iconeJogador2);
			break;
		case 29:
			pista30.setIcon(iconeJogador2);
			break;
		case 30:
			pista31.setIcon(iconeJogador2);
			AudioPlayer.Stop();
			AudioPlayer.play("src/venceu.wav");
			JOptionPane.showMessageDialog(null, "Parabéns voce foi o Vencedor!","Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/jogador2.gif"));
			System.exit(0);
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA REMOVER A IMAGEM JOGADOR1 NA PISTA E DEIXAR A IMAGEM DO JOGADOR2*/
	public void alterarPosicaoBrancoDuplaJ1(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(iconeJogador2);
			break;
		case 1:
			pista2.setIcon(iconeJogador2);
			break;
		case 2:
			pista3.setIcon(iconeJogador2);
			break;
		case 3:
			pista4.setIcon(iconeJogador2);
			break;
		case 4:
			pista5.setIcon(iconeJogador2);
			break;
		case 5:
			pista6.setIcon(iconeJogador2);
			break;
		case 6:
			pista7.setIcon(iconeJogador2);
			break;
		case 7:
			pista8.setIcon(iconeJogador2);
			break;
		case 8:
			pista9.setIcon(iconeJogador2);
			break;
		case 9:
			pista10.setIcon(iconeJogador2);
			break;
		case 10:
			pista11.setIcon(iconeJogador2);
			break;
		case 11:
			pista12.setIcon(iconeJogador2);
			break;
		case 12:
			pista13.setIcon(iconeJogador2);
			break;
		case 13:
			pista14.setIcon(iconeJogador2);
			break;
		case 14:
			pista15.setIcon(iconeJogador2);
			break;
		case 15:
			pista16.setIcon(iconeJogador2);
			break;
		case 16:
			pista17.setIcon(iconeJogador2);
			break;
		case 17:
			pista18.setIcon(iconeJogador2);
			break;
		case 18:
			pista19.setIcon(iconeJogador2);
			break;
		case 19:
			pista20.setIcon(iconeJogador2);
			break;
		case 20:
			pista21.setIcon(iconeJogador2);
			break;
		case 21:
			pista22.setIcon(iconeJogador2);
			break;
		case 22:
			pista23.setIcon(iconeJogador2);
			break;
		case 23:
			pista24.setIcon(iconeJogador2);
			break;
		case 24:
			pista25.setIcon(iconeJogador2);
			break;
		case 25:
			pista26.setIcon(iconeJogador2);
			break;
		case 26:
			pista27.setIcon(iconeJogador2);
			break;
		case 27:
			pista28.setIcon(iconeJogador2);
			break;
		case 28:
			pista29.setIcon(iconeJogador2);
			break;
		case 29:
			pista30.setIcon(iconeJogador2);
			break;
		case 30:
			pista31.setIcon(iconeJogador2);
			break;

		default:
			break;
		}
	}
	/*AÇÃO PARA REMOVER A IMAGEM JOGADOR2 NA PISTA E DEIXAR A IMAGEM DO JOGADOR1*/
	public void alterarPosicaoBrancoDuplaJ2(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(iconeJogador1);
			break;
		case 1:
			pista2.setIcon(iconeJogador1);
			break;
		case 2:
			pista3.setIcon(iconeJogador1);
			break;
		case 3:
			pista4.setIcon(iconeJogador1);
			break;
		case 4:
			pista5.setIcon(iconeJogador1);
			break;
		case 5:
			pista6.setIcon(iconeJogador1);
			break;
		case 6:
			pista7.setIcon(iconeJogador1);
			break;
		case 7:
			pista8.setIcon(iconeJogador1);
			break;
		case 8:
			pista9.setIcon(iconeJogador1);
			break;
		case 9:
			pista10.setIcon(iconeJogador1);
			break;
		case 10:
			pista11.setIcon(iconeJogador1);
			break;
		case 11:
			pista12.setIcon(iconeJogador1);
			break;
		case 12:
			pista13.setIcon(iconeJogador1);
			break;
		case 13:
			pista14.setIcon(iconeJogador1);
			break;
		case 14:
			pista15.setIcon(iconeJogador1);
			break;
		case 15:
			pista16.setIcon(iconeJogador1);
			break;
		case 16:
			pista17.setIcon(iconeJogador1);
			break;
		case 17:
			pista18.setIcon(iconeJogador1);
			break;
		case 18:
			pista19.setIcon(iconeJogador1);
			break;
		case 19:
			pista20.setIcon(iconeJogador1);
			break;
		case 20:
			pista21.setIcon(iconeJogador1);
			break;
		case 21:
			pista22.setIcon(iconeJogador1);
			break;
		case 22:
			pista23.setIcon(iconeJogador1);
			break;
		case 23:
			pista24.setIcon(iconeJogador1);
			break;
		case 24:
			pista25.setIcon(iconeJogador1);
			break;
		case 25:
			pista26.setIcon(iconeJogador1);
			break;
		case 26:
			pista27.setIcon(iconeJogador1);
			break;
		case 27:
			pista28.setIcon(iconeJogador1);
			break;
		case 28:
			pista29.setIcon(iconeJogador1);
			break;
		case 29:
			pista30.setIcon(iconeJogador1);
			break;
		case 30:
			pista31.setIcon(iconeJogador1);			
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA RETIRAR A IMAGEM DO JOGADOR NA PISTA*/
	public void alterarPosicaoBranco(int posicao){
		switch (posicao) {
		case 0:
			pista1.setIcon(icone);
			break;
		case 1:
			pista2.setIcon(icone);
			break;
		case 2:
			pista3.setIcon(icone);
			break;
		case 3:
			pista4.setIcon(icone);
			break;
		case 4:
			pista5.setIcon(icone);
			break;
		case 5:
			pista6.setIcon(icone);
			break;
		case 6:
			pista7.setIcon(icone);
			break;
		case 7:
			pista8.setIcon(icone);
			break;
		case 8:
			pista9.setIcon(icone);
			break;
		case 9:
			pista10.setIcon(icone);
			break;
		case 10:
			pista11.setIcon(icone);
			break;
		case 11:
			pista12.setIcon(icone);
			break;
		case 12:
			pista13.setIcon(icone);
			break;
		case 13:
			pista14.setIcon(icone);
			break;
		case 14:
			pista15.setIcon(icone);
			break;
		case 15:
			pista16.setIcon(icone);
			break;
		case 16:
			pista17.setIcon(icone);
			break;
		case 17:
			pista18.setIcon(icone);
			break;
		case 18:
			pista19.setIcon(icone);
			break;
		case 19:
			pista20.setIcon(icone);
			break;
		case 20:
			pista21.setIcon(icone);
			break;
		case 21:
			pista22.setIcon(icone);
			break;
		case 22:
			pista23.setIcon(icone);
			break;
		case 23:
			pista24.setIcon(icone);
			break;
		case 24:
			pista25.setIcon(icone);
			break;
		case 25:
			pista26.setIcon(icone);
			break;
		case 26:
			pista27.setIcon(icone);
			break;
		case 27:
			pista28.setIcon(icone);
			break;
		case 28:
			pista29.setIcon(icone);
			break;
		case 29:
			pista30.setIcon(icone);
			break;
		case 30:
			pista31.setIcon(icone);
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA MOVER A IMAGEM DO JOGADOR1 NA PISTA*/
	public void avancarJogador1(int valorDado){
		System.out.println(posicaoAvancar);
		switch (valorDado) {
		case 1:
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 2:
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);			
			break;
		case 3:
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 4:
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 5:
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 6:	
			posicaoAvancar = jogador1.getPosicao()+valorDado;
			if(jogador2.getPosicao()==posicaoAvancar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoAvancar);
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoAvancar);
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		default:
			if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoDupla(30);
			}
			else{
				alterarPosicaoJogador1(30);
			}
			break;
		}
		System.out.println(posicaoAvancar);
	}
	/*AÇÃO PARA MOVER A IMAGEM DO JOGADOR2 NA PISTA*/
	public void avancarJogador2(int valorDado){
		switch (valorDado) {
		case 1:
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 2:
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 3:
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 4:
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 5:
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 6:	
			posicaoAvancar2 = jogador2.getPosicao()+valorDado;
			if(jogador1.getPosicao()==posicaoAvancar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoAvancar2);
			}
			else if(jogador1.getPosicao()==jogador2.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoAvancar2);
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		default:
			if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoDupla(30);
			}
			else{
				alterarPosicaoJogador2(30);
			}
			break;
		}
	}
	/*AÇÃO PARA VOLTAR A IMAGEM DO JOGADOR1 NA PISTA*/
	public void voltarJogador1(int valorDado){
		switch (valorDado) {
		case 1:
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 2:
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 3:
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 4:
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 5:
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		case 6:	
			posicaoVoltar = jogador1.getPosicao()-valorDado;
			if(jogador2.getPosicao()==posicaoVoltar){
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoDupla(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ1(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			else{
				alterarPosicaoBranco(jogador1.getPosicao());
				alterarPosicaoJogador1(posicaoVoltar);
				posicaoAvancar=posicaoVoltar;
			}
			jogador1.setPosicao(posicaoAvancar);
			break;
		default:
			if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoDupla(0);
				posicaoAvancar=0;
			}
			else{
				alterarPosicaoJogador1(0);
				posicaoAvancar=0;
			}
			break;
		}
	}
	/*AÇÃO PARA VOLTAR A IMAGEM DO JOGADOR2 NA PISTA*/
	public void voltarJogador2(int valorDado){
		switch (valorDado) {
		case 1:
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 2:
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 3:
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 4:
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 5:
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		case 6:	
			posicaoVoltar2 = jogador2.getPosicao()-valorDado;
			if(jogador1.getPosicao()==posicaoVoltar2){
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoDupla(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoBrancoDuplaJ2(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			else{
				alterarPosicaoBranco(jogador2.getPosicao());
				alterarPosicaoJogador2(posicaoVoltar2);
				posicaoAvancar2=posicaoVoltar2;
			}
			jogador2.setPosicao(posicaoAvancar2);
			break;
		default:
			if(jogador2.getPosicao()==jogador1.getPosicao()){
				alterarPosicaoDupla(0);
				posicaoAvancar2=0;
			}
			else{
				alterarPosicaoJogador2(0);
				posicaoAvancar2=0;
			}
			break;
		}
	}
	public void mostrarValorDados(int valor, String imgJogador){
		switch (valor) {
		case 1:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado1.png"));
			break;
		case 2:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado2.png"));
			break;
		case 3:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado3.png"));
			break;
		case 4:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado4.png"));
			break;
		case 5:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado5.png"));
			break;
		case 6:
			JOptionPane.showMessageDialog(null,new ImageIcon("src/"+imgJogador),"Atenção!",JOptionPane.ERROR_MESSAGE,new ImageIcon("src/dado6.png"));
			break;
		default:
			break;
		}
	}
	/*AÇÃO PARA OPERAÇÕES DE LANÇAMENTO DE DADOS E MENU*/
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jogarDado1){
			Random gerador = new Random();
			int dado=gerador.nextInt(6)+1;
			mostrarValorDados(dado, "jogador1.gif");
			avancarJogador1(dado);
			if(jogador1.getPosicao()>30){
				jogador1.setPosicao(30);
				avancarJogador1(0);
			}
			if(semJogarJ2==0){
				jogarDado1.setEnabled(false);
				jogarDado2.setEnabled(true);
			}
			else if(semJogarJ2>0){
				jogarDado1.setEnabled(true);
				jogarDado2.setEnabled(false);
				semJogarJ2--;
			}
		}
		if(e.getSource()==jogarDado2){
			Random gerador = new Random();
			int dado=gerador.nextInt(6)+1;
			mostrarValorDados(dado, "jogador2.gif");
			avancarJogador2(dado);
			if(jogador2.getPosicao()>30){
				jogador2.setPosicao(30);
				avancarJogador2(0);
			}
			if(semJogarJ1==0){
				jogarDado2.setEnabled(false);
				jogarDado1.setEnabled(true);
			}
			else if(semJogarJ1>0){
				jogarDado2.setEnabled(true);
				jogarDado1.setEnabled(false);
				semJogarJ1--;
			}
		}
	}
	public static void main(String[] args) {
		new TelaGame();
	}
}