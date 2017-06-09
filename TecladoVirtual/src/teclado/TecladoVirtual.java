package teclado;

import java.awt.Color;
import java.awt.Component;

/**
 * Teclado Virtual Classe responsável por criar os componentes de um teclado
 * virtual e identificar as ações referentes a cada botão
 * 
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public class TecladoVirtual extends javax.swing.JFrame {

	private final Color colorBtn;
	public Acao act;

	/*
	 * Construtor da classe Teclado Virtual
	 *
	 * responsável por chamar o método initComponentes (inicializa os componntes
	 * GUI) e capturar a color default do botão e salvar em uma constante
	 */

	// construtor da classe, responsável por inicializar os componentes criados
	public TecladoVirtual() {
		initComponents();
		colorBtn = btnA.getBackground();
	}

	/**
	 * InitComponents Método responsável por criar os componentes de Interface
	 * Gráfica do teclado posicionando na posição correta
	 * 
	 * @param null
	 * @return Components[]
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		title = new javax.swing.JLabel();
		panelTxt = new javax.swing.JScrollPane();
		txtArea = new javax.swing.JTextArea();
		btnOthers = new javax.swing.JButton();
		btnOne = new javax.swing.JButton();
		btnTwo = new javax.swing.JButton();
		btnThree = new javax.swing.JButton();
		btnFour = new javax.swing.JButton();
		btnFive = new javax.swing.JButton();
		btnSix = new javax.swing.JButton();
		btnSeven = new javax.swing.JButton();
		btnEight = new javax.swing.JButton();
		btnNine = new javax.swing.JButton();
		btnZero = new javax.swing.JButton();
		btnIfen = new javax.swing.JButton();
		btnBackspace = new javax.swing.JButton();
		btnPlus = new javax.swing.JButton();
		btnI = new javax.swing.JButton();
		btnY = new javax.swing.JButton();
		btnU = new javax.swing.JButton();
		btnO = new javax.swing.JButton();
		btnP = new javax.swing.JButton();
		btnObrac = new javax.swing.JButton();
		btnCbrac = new javax.swing.JButton();
		btnTab = new javax.swing.JButton();
		btnQ = new javax.swing.JButton();
		btnW = new javax.swing.JButton();
		btnE = new javax.swing.JButton();
		btnR = new javax.swing.JButton();
		btnT = new javax.swing.JButton();
		btnJ = new javax.swing.JButton();
		btnL = new javax.swing.JButton();
		btnTwoPoints = new javax.swing.JButton();
		btnAcento = new javax.swing.JButton();
		btnEnter = new javax.swing.JButton();
		btnCaps = new javax.swing.JButton();
		btnA = new javax.swing.JButton();
		btnS = new javax.swing.JButton();
		btnD = new javax.swing.JButton();
		btnF = new javax.swing.JButton();
		btnG = new javax.swing.JButton();
		btnK = new javax.swing.JButton();
		btnH = new javax.swing.JButton();
		btnBarInvert = new javax.swing.JButton();
		btnB = new javax.swing.JButton();
		btnVirg = new javax.swing.JButton();
		btnN = new javax.swing.JButton();
		btnM = new javax.swing.JButton();
		btnPoint = new javax.swing.JButton();
		btnInterrog = new javax.swing.JButton();
		btnUp = new javax.swing.JButton();
		btnShift = new javax.swing.JButton();
		btnZ = new javax.swing.JButton();
		btnX = new javax.swing.JButton();
		btnC = new javax.swing.JButton();
		btnV = new javax.swing.JButton();
		btnSpace = new javax.swing.JButton();
		btnRight = new javax.swing.JButton();
		btnLeft = new javax.swing.JButton();
		btnDown = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		title.setText(
				"Teste a qualidade do teclado virtual! Digite a seguinte frase: \"Um pequeno jabuti xereta viu dez cegonhas felizes\"");

		panelTxt.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		txtArea.setColumns(20);
		txtArea.setRows(5);
		txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtAreaKeyPressed(evt);
			}

			public void keyReleased(java.awt.event.KeyEvent evt) {
				txtAreaKeyReleased(evt);
			}
		});
		panelTxt.setViewportView(txtArea);

		btnOthers.setText("~");

		btnOne.setText("1");

		btnTwo.setText("2");

		btnThree.setText("3");

		btnFour.setText("4");

		btnFive.setText("5");

		btnSix.setText("8");

		btnSeven.setText("6");

		btnEight.setText("7");

		btnNine.setText("9");

		btnZero.setText("0");

		btnIfen.setText("-");

		btnBackspace.setText("Backspace");

		btnPlus.setText("=");

		btnI.setText("I");

		btnY.setText("Y");

		btnU.setText("U");

		btnO.setText("O");

		btnP.setText("P");

		btnObrac.setText("[");

		btnCbrac.setText("]");

		btnTab.setText("Tab");

		btnQ.setText("Q");

		btnW.setText("W");

		btnE.setText("E");

		btnR.setText("R");

		btnT.setText("T");

		btnJ.setText("J");

		btnL.setText("L");

		btnTwoPoints.setText(":");

		btnAcento.setText("´");

		btnEnter.setText("ENTER");

		btnCaps.setText("Caps");

		btnA.setText("A");

		btnS.setText("S");

		btnD.setText("D");

		btnF.setText("F");

		btnG.setText("G");

		btnK.setText("K");

		btnH.setText("H");

		btnBarInvert.setText("\\");

		btnB.setText("B");

		btnVirg.setText(",");

		btnN.setText("N");
		btnN.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNActionPerformed(evt);
			}
		});

		btnM.setText("M");

		btnPoint.setText(".");

		btnInterrog.setText("?");

		btnUp.setText("^");

		btnShift.setText("Shift");

		btnZ.setText("Z");

		btnX.setText("X");

		btnC.setText("C");

		btnV.setText("V");

		btnSpace.setText("space");

		btnRight.setText(">");

		btnLeft.setText("<");

		btnDown.setText("v");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout
														.createSequentialGroup().addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(layout.createSequentialGroup()
																				.addGap(14, 14, 14).addComponent(
																						title,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						652,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(btnTab,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						70,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnQ,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnW,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnE,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnR,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnT,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnY,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnU,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnI,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnO,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnP,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnObrac,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnCbrac,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						btnBarInvert,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGroup(layout.createSequentialGroup().addGroup(layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				layout.createSequentialGroup()
																						.addComponent(btnCaps,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								70,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnA,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnS,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnD,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnF,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnG,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnH,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnJ,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnK,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnL,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnTwoPoints,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnAcento,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				layout.createSequentialGroup()
																						.addComponent(btnShift,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								98,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnZ,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(layout
																								.createParallelGroup(
																										javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(layout
																										.createSequentialGroup()
																										.addGap(10, 10,
																												10)
																										.addComponent(
																												btnSpace,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												307,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGroup(
																										layout.createSequentialGroup()
																												.addComponent(
																														btnX,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnC,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnV,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnB,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnN,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnM,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnVirg,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnPoint,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addPreferredGap(
																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																												.addComponent(
																														btnInterrog,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														40,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))
																						.addGap(24, 24, 24)))
																		.addGroup(layout
																				.createParallelGroup(
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(layout.createSequentialGroup()
																						.addGap(10, 10, 10)
																						.addComponent(btnUp,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						btnEnter,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						86,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addContainerGap())
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
														.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup().addGroup(layout
																				.createParallelGroup(
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(panelTxt,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						683,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(layout
																						.createSequentialGroup()
																						.addComponent(btnOthers,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnOne,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnTwo,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnThree,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnFour,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnFive,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnSeven,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnEight,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnSix,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnNine,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnZero,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnIfen,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(btnPlus,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								40,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								btnBackspace,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								86,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
																				.addGap(20, 20, 20))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup()
																				.addComponent(btnLeft,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnDown,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(btnRight,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						40,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(26, 26, 26)))))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(panelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnOthers)
						.addComponent(btnOne).addComponent(btnTwo).addComponent(btnThree).addComponent(btnFour)
						.addComponent(btnFive).addComponent(btnSeven).addComponent(btnEight).addComponent(btnSix)
						.addComponent(btnNine).addComponent(btnZero).addComponent(btnIfen).addComponent(btnPlus)
						.addComponent(btnBackspace))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnTab)
						.addComponent(btnQ).addComponent(btnW).addComponent(btnE).addComponent(btnR).addComponent(btnT)
						.addComponent(btnY).addComponent(btnU).addComponent(btnI).addComponent(btnO).addComponent(btnP)
						.addComponent(btnObrac).addComponent(btnCbrac).addComponent(btnBarInvert))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnCaps)
						.addComponent(btnA).addComponent(btnS).addComponent(btnD).addComponent(btnF).addComponent(btnG)
						.addComponent(btnH).addComponent(btnJ).addComponent(btnK).addComponent(btnL)
						.addComponent(btnTwoPoints).addComponent(btnAcento).addComponent(btnEnter))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnShift)
						.addComponent(btnZ).addComponent(btnX).addComponent(btnC).addComponent(btnV).addComponent(btnB)
						.addComponent(btnN).addComponent(btnM).addComponent(btnVirg).addComponent(btnPoint)
						.addComponent(btnInterrog).addComponent(btnUp))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnSpace)
						.addComponent(btnRight).addComponent(btnLeft).addComponent(btnDown))
				.addContainerGap(24, Short.MAX_VALUE)));

		panelTxt.getAccessibleContext().setAccessibleName("panelTxt");
		btnOthers.getAccessibleContext().setAccessibleName("");

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// metodo responsavel por ...
	private void btnNActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNActionPerformed

	}// GEN-LAST:event_btnNActionPerformed

	/**
	 * txtAreaKeyPressed Método responsável por capturar o evento de
	 * Pressed(precionado) em um botão (JButton) do teclado, criar um array de
	 * componentes existentes na classe e enviar esses dados a Classe Acao, para
	 * seu tratamento.
	 * 
	 * @param evt
	 *            - java.awt.event.KeyEvent
	 * @return modifica a cor de fundo do botão clicado(pegado da classe Acao)
	 *         pelo usuário para 'Vermelho'
	 */

	/**
	 * txtAreaKeyReleased Método responsável por capturar o evento de Released
	 * (ao soltar um tecla) em um botão (JButton) do teclado, criar um array de
	 * componentes existentes na classe e enviar esses dados a Classe Acao, para
	 * seu tratamento.
	 * 
	 * @param evt
	 *            - java.awt.event.KeyEvent
	 * @return modifica a cor de fundo do botão soltado(pegado da classe Acao)
	 *         pelo usuário, para a cor de Fundo default dos botões (COLORBTN)
	 */
	private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtAreaKeyPressed
		int keycode = evt.getKeyCode();
		Component components[] = getContentPane().getComponents();

		act = new Acao(components, keycode);
		if (act.mapeamento() != null) {
			act.mapeamento().setBackground(Color.red);
		} else {
			btnOthers.setBackground(Color.red);
		}
	}// GEN-LAST:event_txtAreaKeyPressed

	// metodo responsavel por retornar a cor original do btn, ao soltar
	// (release) um tecla do teclado
	private void txtAreaKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtAreaKeyReleased
		int keycode = evt.getKeyCode();
		Component components[] = getContentPane().getComponents();

		act = new Acao(components, keycode);
		if (act.mapeamento() != null) {
			act.mapeamento().setBackground(this.colorBtn);
		} else {
			btnOthers.setBackground(this.colorBtn);
		}
	}// GEN-LAST:event_txtAreaKeyReleased

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnA;
	private javax.swing.JButton btnAcento;
	private javax.swing.JButton btnB;
	private javax.swing.JButton btnBackspace;
	private javax.swing.JButton btnBarInvert;
	private javax.swing.JButton btnC;
	private javax.swing.JButton btnCaps;
	private javax.swing.JButton btnCbrac;
	private javax.swing.JButton btnD;
	private javax.swing.JButton btnDown;
	private javax.swing.JButton btnE;
	private javax.swing.JButton btnEight;
	private javax.swing.JButton btnEnter;
	private javax.swing.JButton btnF;
	private javax.swing.JButton btnFive;
	private javax.swing.JButton btnFour;
	private javax.swing.JButton btnG;
	private javax.swing.JButton btnH;
	private javax.swing.JButton btnI;
	private javax.swing.JButton btnIfen;
	private javax.swing.JButton btnInterrog;
	private javax.swing.JButton btnJ;
	private javax.swing.JButton btnK;
	private javax.swing.JButton btnL;
	private javax.swing.JButton btnLeft;
	private javax.swing.JButton btnM;
	private javax.swing.JButton btnN;
	private javax.swing.JButton btnNine;
	private javax.swing.JButton btnO;
	private javax.swing.JButton btnObrac;
	private javax.swing.JButton btnOne;
	private javax.swing.JButton btnOthers;
	private javax.swing.JButton btnP;
	private javax.swing.JButton btnPlus;
	private javax.swing.JButton btnPoint;
	private javax.swing.JButton btnQ;
	private javax.swing.JButton btnR;
	private javax.swing.JButton btnRight;
	private javax.swing.JButton btnS;
	private javax.swing.JButton btnSeven;
	private javax.swing.JButton btnShift;
	private javax.swing.JButton btnSix;
	private javax.swing.JButton btnSpace;
	private javax.swing.JButton btnT;
	private javax.swing.JButton btnTab;
	private javax.swing.JButton btnThree;
	private javax.swing.JButton btnTwo;
	private javax.swing.JButton btnTwoPoints;
	private javax.swing.JButton btnU;
	private javax.swing.JButton btnUp;
	private javax.swing.JButton btnV;
	private javax.swing.JButton btnVirg;
	private javax.swing.JButton btnW;
	private javax.swing.JButton btnX;
	private javax.swing.JButton btnY;
	private javax.swing.JButton btnZ;
	private javax.swing.JButton btnZero;
	private javax.swing.JScrollPane panelTxt;
	private javax.swing.JLabel title;
	private javax.swing.JTextArea txtArea;
	// End of variables declaration//GEN-END:variables
}
