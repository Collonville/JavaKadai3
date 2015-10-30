import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.UIManager;


public class MainGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private ArcGraphics arcGraphics;
	private static MainGUI frame;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */

	
	public MainGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JTextArea stringArea = new JTextArea();
		/*
		arcFrame = new JFrame();
		arcGraphics = new ArcGraphics();
		arcFrame.add(arcGraphics);
		arcFrame.setBackground(Color.white);
		arcFrame.setVisible(true);
		arcFrame.pack();
		*/
	
		
		/*
		 * Buying Buttons
		 */
		JLabel buyingLabel = new JLabel("Buying");
		buyingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton buyVHighBtn = new JButton("vhigh");
		buyVHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("buying=vhigh");
			}
		});
		
		JButton buyHighBtn = new JButton("high");
		buyHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("buying=high");
			}
		});
		
		JButton buyMedBtn = new JButton("med");
		buyMedBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("buying=med");
			}
		});
		
		JButton buyLowBtn = new JButton("low");
		buyLowBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("buying=low");
			}
		});
		/*
		 * End Buyng Buttons
		 */
		
		/*
		 * Maint Buttons
		 */
		JLabel maintLabel = new JLabel("Maint");
		maintLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton maintVHighBtn = new JButton("vhigh");
		maintVHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("maint=vhigh");
			}
		});
		
		JButton maintHighBtn = new JButton("high");
		maintHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("maint=high");
			}
		});
		
		JButton maintMedBtn = new JButton("med");
		maintMedBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("maint=med");
			}
		});
		
		JButton maintLowBtn = new JButton("low");
		maintLowBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("maint=low");
			}
		});
		/*
		 * End Maint Buttons
		 */
		
		/*
		 * Doors Buttons
		 */
		JLabel doorsLabel = new JLabel("Doors");
		doorsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton door2Btn = new JButton("2");
		door2Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=2");
			}
		});
		
		JButton door3Btn = new JButton("3");
		door3Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=3");
			}
		});
		
		JButton door4Btn = new JButton("4");
		door4Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=4");
			}
		});
		
		JButton door5MoreBtn = new JButton("5more");
		door5MoreBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=5more");
			}
		});
		/*
		 * End Doors Buttons
		 */
		
		/*
		 * Persons Buttons
		 */
		JLabel personsLabel = new JLabel("Persons");
		personsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton per2Btn = new JButton("2");
		per2Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=2");
			}
		});
		
		JButton per4Btn = new JButton("4");
		per4Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=4");
			}
		});
		
		JButton perMoreBtn = new JButton("more");
		perMoreBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("persons=more");
			}
		});
		/*
		 * End Persons Buttons
		 */
		
		/*
		 * Luggage Buttons
		 */
		JLabel luggageLabel = new JLabel("Luggage");
		luggageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton lugSmallBtn = new JButton("small");
		lugSmallBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("luggage=small");
			}
		});
		
		JButton lugMedBtn = new JButton("med");
		lugMedBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("luggage=med");
			}
		});
		
		JButton lugHighBtn = new JButton("high");
		lugHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("luggage=high");
			}
		});
		
		/*
		 * Safety Buttons
		 */
		JLabel safetyLabel = new JLabel("Safety");
		safetyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton safteyLowBtn = new JButton("low");
		safteyLowBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("safety=low");
			}
		});
		
		JButton safetyMedBtn = new JButton("med");
		safetyMedBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("safety=med");
			}
		});
		
		JButton safetyHighBtn = new JButton("high");
		safetyHighBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("safety=high");
			}
		});
		/*
		 * End Safety Buttons
		 */
		
		/*
		 * Eval Buttons
		 */
		JLabel evalLabel = new JLabel("Eval");
		evalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnUnacc = new JButton("unacc");
		btnUnacc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("eval=unacc");
			}
		});
		
		JButton btnAcc = new JButton("acc");
		btnAcc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("eval=acc");
			}
		});
	
		JButton btnGood = new JButton("good");
		btnGood.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("eval=good");
			}
		});
		
		JButton btnVgood = new JButton("vgood");
		btnVgood.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append("eval=vgood");
			}
		});
		/*
		 * End Evals Buttons
		 */
		
		/*
		 * Operand Buttons
		 */
		JButton andBtn = new JButton("AND");
		andBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append(" and ");
			}
		});
		
		JButton orBtn = new JButton("OR");
		orBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.append(" or ");
			}
		});
		/*
		 * End Operand Buttons
		 */
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setForeground(Color.RED);
		resetBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				stringArea.setText("");
			}
		});
		
		JButton goBtn = new JButton("Go");
		goBtn.setForeground(UIManager.getColor("Button.light"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(stringArea, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(buyingLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(buyVHighBtn, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(maintLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(maintVHighBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(doorsLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(door2Btn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnVgood)
									.addGap(48)
									.addComponent(safteyLowBtn))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(87)
									.addComponent(btnUnacc)
									.addGap(341)
									.addComponent(maintHighBtn))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(258)
							.addComponent(perMoreBtn)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addComponent(buyLowBtn)
									.addGap(5)
									.addComponent(maintLowBtn)
									.addGap(5)
									.addComponent(door5MoreBtn))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(safetyHighBtn)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(5)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGap(5)
																	.addComponent(personsLabel)
																	.addGap(63))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																		.addComponent(evalLabel)
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(orBtn)
																			.addGap(260)))
																	.addPreferredGap(ComponentPlacement.RELATED))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGap(93)
																	.addComponent(door3Btn)
																	.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																	.addComponent(buyHighBtn)
																	.addPreferredGap(ComponentPlacement.RELATED))))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(6)
															.addComponent(maintMedBtn)
															.addGap(52)
															.addComponent(buyMedBtn)))
													.addGap(6)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lugSmallBtn)
															.addGap(5)
															.addComponent(lugMedBtn)
															.addGap(85)
															.addComponent(per2Btn)
															.addGap(5)
															.addComponent(per4Btn))
														.addComponent(goBtn)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(44)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(lugHighBtn)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGap(6)
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																		.addComponent(btnAcc)
																		.addComponent(door4Btn))))
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(btnGood))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGap(62)
															.addComponent(resetBtn))))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(93)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addComponent(safetyLabel)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(luggageLabel)
															.addGap(39)))
													.addGap(340)
													.addComponent(andBtn))))
										.addComponent(safetyMedBtn))))
							.addGap(249)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnVgood)
										.addComponent(safteyLowBtn))
									.addGap(5)
									.addComponent(maintHighBtn)
									.addGap(5))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnUnacc)
									.addGap(18))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(stringArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(buyingLabel)
								.addComponent(maintLabel)
								.addComponent(doorsLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(buyVHighBtn)
								.addComponent(maintVHighBtn)
								.addComponent(door2Btn))
							.addGap(1)))
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(perMoreBtn)
						.addComponent(buyLowBtn)
						.addComponent(maintLowBtn)
						.addComponent(door5MoreBtn))
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lugSmallBtn)
									.addComponent(lugMedBtn)
									.addComponent(per2Btn)
									.addComponent(per4Btn))
								.addGap(5)
								.addComponent(goBtn))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(6)
								.addComponent(personsLabel)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(buyHighBtn)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(door3Btn)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(andBtn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(21)
									.addComponent(orBtn)
									.addGap(5)
									.addComponent(luggageLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lugHighBtn)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(maintMedBtn)
									.addComponent(buyMedBtn))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(22)
									.addComponent(door4Btn))
								.addComponent(resetBtn))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(safetyLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(evalLabel)
										.addComponent(safetyHighBtn))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(safetyMedBtn))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnAcc))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(168)
							.addComponent(btnGood)))
					.addContainerGap(189, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		//contentPane.setLayout(gl_contentPane);
	}
}
