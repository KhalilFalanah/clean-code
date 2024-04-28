package questao2;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;

public class questao2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questao2 frame = new questao2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public questao2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnSair = new JButton("Sair");
		panel.add(btnSair);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerLocation(200);
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		splitPane.setLeftComponent(scrollPane);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblFigura = new JLabel("");
		lblFigura.setBounds(0, 0, 197, 214);
		panel_2.add(lblFigura);
		File arq = new File("S:\\eclipse-workspace\\AFC03\\src\\questao1\\figuras\\homer.jpg");
		lblFigura.setIcon(new ImageIcon((ImageIO.read(arq).getScaledInstance(lblFigura.getWidth(), lblFigura.getHeight(),BufferedImage.TYPE_INT_RGB))));
		
		
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome da imagem: "+arq.getName());
		lblNome.setBounds(10, 11, 184, 14);
		panel_1.add(lblNome);
		
		JLabel lblLargura = new JLabel("Largura da Imagem:"+lblFigura.getWidth());
		lblLargura.setBounds(10, 56, 139, 14);
		panel_1.add(lblLargura);
		
		
		
		JLabel lblAltura = new JLabel("Altura da Imagem:"+lblFigura.getHeight());
		lblAltura.setBounds(10, 114, 139, 14);
		panel_1.add(lblAltura);
		
	}
}
