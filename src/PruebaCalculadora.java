import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;

class VentanaInicio extends JFrame implements ActionListener{
	//Declaramos de instancia
	JTextField cuadro1;
	double resultado = 0;
	String ultimaOp = "=";
	boolean opNueva = true;
	double memoria = 0;

	public VentanaInicio () {
		getContentPane().setLayout(null);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("CALCULADORA"); 
		setSize(450, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Pnantalla
		cuadro1 = new JTextField("0"); //por predeterminado aparece 0
		cuadro1.setEditable(false);
		cuadro1.setHorizontalAlignment(JTextField.RIGHT);
		cuadro1.setBounds(10, 10, 400, 40);
		add(cuadro1);
		
		//botones primera fila (mc al m2)
		JButton mc = new JButton ("MC");
		mc.setBounds(10, 60, 60, 30);
		add(mc);
		mc.addActionListener(this);
		
		JButton mr = new JButton ("MR");
		mr.setBounds(80, 60, 60, 30);
		add(mr);
		mr.addActionListener(this);
		
		JButton mMas = new JButton ("M+");
		mMas.setBounds(150, 60, 60, 30);
		add(mMas);
		mMas.addActionListener(this);
		
		JButton mMenos = new JButton ("M-");
		mMenos.setBounds(220, 60, 60, 30);
		add(mMenos);
		mMenos.addActionListener(this);
		
		JButton ms = new JButton ("MS");
		ms.setBounds(290, 60, 60, 30);
		add(ms);
		ms.addActionListener(this);
		
		JButton m2 = new JButton ("M");
		m2.setBounds(360, 60, 50, 30);
		add(m2);
		m2.addActionListener(this);
		
		//botones segunda fila (% al 1/x)
		JButton porciento = new JButton ("%");
		porciento.setBounds(10, 100, 90, 30);
		add(porciento);
		porciento.addActionListener(this);
		
		JButton raiz = new JButton ("√");
		raiz.setBounds(110, 100, 90, 30);
		add(raiz);
		raiz.addActionListener(this);
		
		JButton xCuadrada = new JButton ("x²");
		xCuadrada.setBounds(210, 100, 90, 30);
		add(xCuadrada);
		xCuadrada.addActionListener(this);
		
		JButton unox = new JButton ("1/X");
		unox.setBounds(310, 100, 90, 30);
		add(unox);
		unox.addActionListener(this);
		
		//botones tercera fila (ce al /)
		JButton ce = new JButton ("CE");
		ce.setBounds(10, 140, 90, 30);
		add(ce);
		ce.addActionListener(this);
		
		JButton c = new JButton ("C");
		c.setBounds(110, 140, 90, 30);
		add(c);
		c.addActionListener(this);
		
		JButton regresar = new JButton ("←");
		regresar.setBounds(210, 140, 90, 30);
		add(regresar);
		regresar.addActionListener(this);
		
		JButton dividir = new JButton ("÷");
		dividir.setBounds(310, 140, 90, 30);
		add(dividir);
		dividir.addActionListener(this);
		
		//botones cuarta fila (7 al x)
		JButton siete = new JButton ("7");
		siete.setBounds(10, 180, 90, 50);
		add(siete);
		siete.addActionListener(this);
		
		JButton ocho = new JButton ("8");
		ocho.setBounds(110, 180, 90, 50);
		add(ocho);
		ocho.addActionListener(this);
		
		JButton nueve = new JButton ("9");
		nueve.setBounds(210, 180, 90, 50);
		add(nueve);
		nueve.addActionListener(this);
		
		JButton multiplicar = new JButton ("*");
		multiplicar.setBounds(310, 180, 90, 50);
		add(multiplicar);
		multiplicar.addActionListener(this);
		
		//botones quinta fila (4 al -) 
		JButton cuatro = new JButton ("4");
		cuatro.setBounds(10, 240, 90, 50);
		add(cuatro);
		cuatro.addActionListener(this);
		
		JButton cinco = new JButton ("5");
		cinco.setBounds(110, 240, 90, 50);
		add(cinco);
		cinco.addActionListener(this);
		
		JButton seis = new JButton ("6");
		seis.setBounds(210, 240, 90, 50);
		add(seis);
		seis.addActionListener(this);
		
		JButton menos = new JButton ("-");
		menos.setBounds(310, 240, 90, 50);
		add(menos);
		menos.addActionListener(this);
		
		//botones sexta fila (1 al +)
		JButton uno = new JButton ("1");
		uno.setBounds(10, 300, 90, 50);
		add(uno);
		uno.addActionListener(this);
		
		JButton dos = new JButton ("2");
		dos.setBounds(110, 300, 90, 50);
		add(dos);
		dos.addActionListener(this);
		
		JButton tres = new JButton ("3");
		tres.setBounds(210, 300, 90, 50);
		add(tres);
		tres.addActionListener(this);
		
		JButton mas = new JButton ("+");
		mas.setBounds(310, 300, 90, 50);
		add(mas);
		mas.addActionListener(this);
		
		//botones septima fila (ultima)
		
		JButton masMenos = new JButton ("±");
		masMenos.setBounds(10, 360, 90, 50);
		add(masMenos);
		masMenos.addActionListener(this);
		
		JButton cero = new JButton ("0");
		cero.setBounds(110, 360, 90, 50);
		add(cero);
		cero.addActionListener(this);
		
		JButton punto = new JButton (".");
		punto.setBounds(210, 360, 90, 50);
		add(punto);
		punto.addActionListener(this);
		
		JButton igual = new JButton ("=");
		igual.setBounds(310, 360, 90, 50);
		add(igual);
		igual.addActionListener(this);
		
		
	}//public VentanaInicio

	public void keyPressed(KeyEvent e) {}
	
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {/*TODO Auto-generated method stub*/}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		//verificar si es un numero entre 0 y 9
	if (comando.equals("0") || comando.equals("1") || comando.equals("2") || comando.equals("3") || comando.equals("4") || comando.equals("5") || comando.equals("6") || comando.equals("7") || comando.equals("8") || comando.equals("9")) {
		
		if (opNueva) {
			cuadro1.setText(comando); //remplazo por la variable del comadno
			opNueva = false; //se podra agregar mas
		} else {
			cuadro1.setText(cuadro1.getText() + comando); //concatenar el valor
		}//if else interno	
		
	} else if (comando.equals(".")) {
		if (!cuadro1.getText().contains(".")) { //solo si el texto no tiene .
			cuadro1.setText(cuadro1.getText() + "."); //lo que esta le concantena un punto
		}
		
	}else if (comando.equals("±")) {
		try {
            double valor = Double.parseDouble(cuadro1.getText());
            cuadro1.setText(String.valueOf(-valor)); //cambia el signo
        } catch (NumberFormatException ex) {
            cuadro1.setText("0"); //coloca un 0 para que no truene
        }//try catch
		
	}else if (comando.equals("C")) { //Es para borrar todo en general
		cuadro1.setText("0");
		resultado = 0;
		ultimaOp = "=";
		opNueva = true;
		
	}else if (comando.equals("CE")) { //borra lo actual, mantiene lo anterior
		cuadro1.setText("0");
		opNueva = true;
		
	}else if (comando.equals("←")) {
		String txt = cuadro1.getText();
		if (txt.length() > 1) {
            cuadro1.setText(txt.substring(0, txt.length() - 1));
        } else {
            cuadro1.setText("0");
            opNueva = true;
        }//if else
		
	}else if (comando.equals("%")) {
		try {
            double valor = Double.parseDouble(cuadro1.getText());
            cuadro1.setText(String.valueOf(valor / 100)); //divide entre 100
            opNueva = true;
        } catch (NumberFormatException ex) {
            cuadro1.setText("0");
        }//try catch
		
	}else if (comando.equals("√")) {
		try {
            double valor = Double.parseDouble(cuadro1.getText());
            if (valor >= 0) {
                cuadro1.setText(String.valueOf(Math.sqrt(valor))); //sacar la raiz del numero
                opNueva = true;
            } else {
                cuadro1.setText("Error");
            }
        } catch (NumberFormatException ex) {
            cuadro1.setText("Error");
        }//try catch
		
	}else if (comando.equals("x²")) {
		try {
            double valor = Double.parseDouble(cuadro1.getText());
            cuadro1.setText(String.valueOf(valor * valor)); //multiplica el numero pos i mismo
            opNueva = true;
        } catch (NumberFormatException ex) {
            cuadro1.setText("Error");
        }//try catch
		
	}else if (comando.equals("1/X")) {
		 try {
			 double valor = Double.parseDouble(cuadro1.getText());
	         if (valor != 0) {
	        	 cuadro1.setText(String.valueOf(1 / valor)); //1 sobre el nuemro
	             opNueva = true;
	         } else {
	             cuadro1.setText("Error");
	            }
	        } catch (NumberFormatException ex) {
	            cuadro1.setText("Error");   
	        }//Try catch
		
	} else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("÷")) {
        try {
            double valor = Double.parseDouble(cuadro1.getText());
            if (ultimaOp.equals("=")) {
                resultado = valor;
            } else {
                calcularResultado(valor);
            }
            ultimaOp = comando;
            opNueva= true;
        } catch (NumberFormatException ex) {
            cuadro1.setText("Error");
        }//try catch
        
	} else if (comando.equals("=")) {
        try {
            double valor = Double.parseDouble(cuadro1.getText());
            calcularResultado(valor);
            ultimaOp = "=";
            opNueva = true;
        } catch (NumberFormatException ex) {
            cuadro1.setText("Error");
        }//try catch
        
	} else if (comando.equals("MC")) { //borra el valor almacenado en la memoria
		memoria = 0;
		
	} else if (comando.equals("MR")) { //recupera y muestra el valor
		cuadro1.setText(String.valueOf(memoria));
		opNueva = true;
		
	} else if (comando.equals("M+")) { //suma el numero actual al valor en memoria
		try {
            memoria += Double.parseDouble(cuadro1.getText());
        } catch (NumberFormatException ex) {
            // No hacer nada si hay error
        }//trycatch
		
	} else if (comando.equals("M-")) { //resta el numero actual al valor en memoria
		 try {
	            memoria -= Double.parseDouble(cuadro1.getText());
	        } catch (NumberFormatException ex) {
	            // No hacer nada si hay error
	        }//try catch
		 
	} else if (comando.equals("MS")) { //guarda el numero en pantalla en la memoeria
        try {
            memoria = Double.parseDouble(cuadro1.getText());
        } catch (NumberFormatException ex) {
            // No hacer nada si hay error
        }
    } else if (comando.equals("M")) { //recupera memoria
        if (memoria != 0) {
            cuadro1.setText(String.valueOf(memoria));
            opNueva = true;
        }//if
    
    }//else if

	}//actionPerformed

	//metodo para calcular
	public void calcularResultado(double valor) {
        switch (ultimaOp) {
            case "+":
                resultado += valor;
                break;
            case "-":
                resultado -= valor;
                break;
            case "*":
                resultado *= valor;
                break;
            case "÷":
                if (valor != 0) {
                    resultado /= valor;
                } else {
                    cuadro1.setText("Error");
                    return;
                }
                break;
            case "=":
                resultado = valor;
                break;
        }//Switch
        cuadro1.setText(String.valueOf(resultado));
    
	}//metodo
	
}//class VentanaIncial

public class PruebaCalculadora {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() { 
			
			@Override
			public void run() {
				
				new VentanaInicio();
				
			}
		});
		
	}//void main

}//public class
