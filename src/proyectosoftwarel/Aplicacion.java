package proyectosoftwarel;

import java.applet.AudioClip;
import javax.crypto.spec.PSource;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.net.URL;
import javax.swing.JApplet;



/**
 *
 * @author Carmen Bravo
 */
public class Aplicacion extends javax.swing.JFrame implements MouseListener{
    
    
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagen5;
    private javax.swing.JLabel lblImagen6;
    private javax.swing.JLabel lblImagen7;
    private javax.swing.JLabel lblImagen8;
    private javax.swing.JLabel lblImagen9;
    private javax.swing.JLabel lblImagen10;
    private javax.swing.JLabel lblImagen11;
    private javax.swing.JLabel lblImagen12;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JPanel jplCentral;
    private javax.swing.JPanel jplImagenes;
    private javax.swing.JPanel jplInferior;
    private javax.swing.JPanel jplInformacion;
    private javax.swing.JPanel jplSuperior;
    private JButton btnIniciar; 

    
    int NumeroImagenes[]=new int[12];//Arreglo nos mostrara el numero de imagenes que se cargaran
    JLabel arregloImagenes[]=new JLabel[12];
    int controlarRepeticiones[]=new int[6];//Controla las repeticiones 
    int controlarParejas[]=new int[12];//Va controlar las imagenes que sean parejas
    int arregloClic[]=new int[12];
	
    int clic=0;
    int ima;
    int ima2;//cuantas veces se ha mirado esta imagen
    int puntaje=0;//lleva a cabo el puntaje 
    
   AudioClip sonido;

      public Aplicacion() {
    	
        initComponents();
        inicializarArreglos();
        setSize(574, 517);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         URL url1 =  this.getClass().getResource("/Audio/Fondo.wav");
                                   AudioClip sonido = JApplet.newAudioClip(url1);
                                   sonido.loop(); 
    }

  
	@SuppressWarnings("unchecked")                        
    private void initComponents() {

            lblTitulo = new JLabel();
            lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 20)); 
            lblTitulo.setText("**JUEGO CONCENTRACIÓN**");
            lblTitulo.addMouseListener(this);
            lblTitulo.setVisible(true);
        
            
            btnIniciar=new JButton();
            btnIniciar.setFont(new java.awt.Font("Times New Roman", 0, 36)); 
            btnIniciar.setText("Reiniciar");
            btnIniciar.setBounds(10, 310, 230, 80);
            btnIniciar.addMouseListener(this);
        
            lblPuntaje = new JLabel();
            lblPuntaje.setFont(new java.awt.Font("Times New Roman", 0, 48)); 
            lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblPuntaje.setText("Puntaje");
            lblPuntaje.setBounds(50, 0, 170, 120);
        
            lblPuntos = new JLabel();
            lblPuntos.setFont(new java.awt.Font("Times New Roman", 0, 100)); 
            lblPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblPuntos.setText("0");
            lblPuntos.setBounds(40, 120, 170, 130);
            
        lblImagen1 = new JLabel();
        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen1.setBounds(5, 0, 100, 100);
        
       
        lblImagen2 = new JLabel();
        lblImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
        lblImagen2.setBounds(113, 0, 100, 100);

        lblImagen3 = new JLabel();
        lblImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen3.setBounds(220, 0, 100, 100);

        lblImagen4 = new JLabel();
        lblImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen4.setBounds(5, 100, 100, 100);
        
       
        lblImagen5 = new JLabel();
        lblImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen5.setBounds(113, 100, 100, 100);

        lblImagen6 = new JLabel();
        lblImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen6.setBounds(220, 100, 100, 100);

        lblImagen7 = new JLabel();
        lblImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen7.setBounds(5, 200, 100, 100);

        lblImagen8 = new JLabel();
        lblImagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen8.setBounds(113, 200, 100, 100);

        lblImagen9 = new JLabel();
        lblImagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen9.setBounds(220, 200, 100, 100);

        lblImagen10 = new JLabel();
        lblImagen10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
        lblImagen10.setBounds(5, 300, 100, 100);

        lblImagen11 = new JLabel();
        lblImagen11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg"))); 
        lblImagen11.setBounds(113, 300, 100, 100);
        
        lblImagen12 = new JLabel();
        lblImagen12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
        lblImagen12.setBounds(220, 300, 100, 100);
        
        
        jplImagenes = new JPanel();
        jplImagenes .setBackground(new java.awt.Color( 205, 255, 255));
        jplImagenes .setLayout(null);
        jplImagenes .setBounds(0, 0, 320, 465);
        jplImagenes .add(lblImagen1);
        jplImagenes .add(lblImagen2);
        jplImagenes .add(lblImagen3);
        jplImagenes .add(lblImagen4);
        jplImagenes .add(lblImagen5);
        jplImagenes .add(lblImagen6);
        jplImagenes .add(lblImagen7);
        jplImagenes .add(lblImagen8);
        jplImagenes .add(lblImagen9);
        jplImagenes .add(lblImagen10);
        jplImagenes .add(lblImagen11);
        jplImagenes .add(lblImagen12);

        
        jplSuperior = new JPanel();
        jplSuperior.setBackground(new java.awt.Color(204, 204, 153));
        jplSuperior.add(lblTitulo);
        
        jplInformacion = new JPanel();
        jplInformacion.setBackground(new java.awt.Color( 204, 204, 204));
        jplInformacion.setLayout(null);
        jplInformacion.setBounds(320, 0, 260, 420);
        jplInformacion.add(btnIniciar);
        jplInformacion.add(lblPuntaje);
        jplInformacion.add(lblPuntos);
        
        jplCentral = new JPanel();
        jplCentral.setBackground(new java.awt.Color( 204, 204, 204));
        jplCentral.setLayout(null);
        jplCentral.add(jplImagenes);
        jplCentral.add(jplInformacion);
        
        jplInferior = new JPanel();
        jplInferior.setBackground(new java.awt.Color(204, 204, 153));
        FlowLayout miLayout=new FlowLayout(FlowLayout.RIGHT);
        jplInferior.setLayout(miLayout);
   

        add(jplCentral, java.awt.BorderLayout.CENTER);
        add(jplInferior, java.awt.BorderLayout.SOUTH);
        add(jplSuperior, java.awt.BorderLayout.NORTH);

        pack();
    }  
    
    


    private void inicializarArreglos() {
        	
			inicializaArregloImagenes();
			//inicializa los arreglos en cero
			llenarArreglos(controlarRepeticiones);
			llenarArreglos(NumeroImagenes);
			llenarArreglos(controlarParejas);
			llenarArreglos(arregloClic);
			//Genera numeros aleatorios			
			 Random random=new Random();
			 int posicionImagen;
			  for (int i = 0; i < 12; i++) {
				
				 posicionImagen=random.nextInt(6);
	            
	            if(controlarRepeticiones[posicionImagen]<2){
	                NumeroImagenes[i]=posicionImagen+1;
	            	controlarRepeticiones[posicionImagen]++;
	            }else{
	                i--;
	            }
			}
			 
		}
    
    private void inicializaArregloImagenes() {
			arregloImagenes[0]=lblImagen1;  arregloImagenes[1]=lblImagen2;   arregloImagenes[2]=lblImagen3;
			arregloImagenes[3]=lblImagen4;  arregloImagenes[4]=lblImagen5;   arregloImagenes[5]=lblImagen6;
			arregloImagenes[6]=lblImagen7;  arregloImagenes[7]=lblImagen8;   arregloImagenes[8]=lblImagen9;
			arregloImagenes[9]=lblImagen10; arregloImagenes[10]=lblImagen11; arregloImagenes[11]=lblImagen12;
			
			for (int i = 0; i < 12; i++) {
				 arregloImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
                                 
				 arregloImagenes[i].addMouseListener(this);
			 }
                        
		}

//Metodo para que los arreglos empiecen en cero
    private void llenarArreglos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
				arreglo[i]=0;
			}
    }
    
    private void validarPares(int valida1, int valida2, int i) {
		
		if (NumeroImagenes[valida1]==NumeroImagenes[valida2]) {
			
				puntaje+=15;
				lblPuntos.setText(puntaje+"");
				controlarParejas[valida1]=1;
				controlarParejas[valida2]=1;	
		}else{
			
			arregloImagenes[valida1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
			arregloImagenes[valida2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/Pregunta.jpg")));
			arregloClic[valida1]=0;
			arregloClic[valida2]=0;
		}
            }
    
    @Override
    	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource()==btnIniciar) {
	       inicializarArreglos();
	        clic=0;
	        puntaje=0;
	        lblPuntos.setText("0");
		}
		
		
		for (int i = 0; i < 12; i++) {
			
			if (e.getSource()==arregloImagenes[i] && ParejasAcertadas(i)) {
				arregloClic[i]++;
				if (arregloClic[i]<2) {
					
					clic++;
					arregloImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/"+NumeroImagenes[i]+".jpg")));
                                        
					
                                        if (clic==1) {
						ima=i;
					}else{
						 ima2=i;
						}
					}
				}
							
			}
		}
	
	
	private boolean ParejasAcertadas(int i) {
		
		if (controlarParejas[i]!=1) {
			return true;
		}else{
			return false;	
		}
        }
    

    @Override
    public void mouseExited(MouseEvent e) {

		for (int i = 0; i < 12; i++) {
			if (e.getSource()==arregloImagenes[i]) {
				if (clic==2) {
					validarPares(ima,ima2,i);
					clic=0;
				}				
			}
		}
	}
    
    @Override
 
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
  
    }

}
