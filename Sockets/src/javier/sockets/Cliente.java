package javier.sockets;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;

public class Cliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
		addWindowListener(new EnvioOnline());
		
		}	
	
}

//-------------Envio de se�al online --------------------------------------------------
class EnvioOnline extends WindowAdapter{
	
	public void windowOpened(WindowEvent e) {
		
		try {
			
			Socket misocket=new Socket("192.168.0.19",9999);
			
			PaqueteEnvio datos=new PaqueteEnvio();
			
			datos.setMensaje(" online");
			
			ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
			
			paquete_datos.writeObject(datos);
			
			misocket.close();
			
		}catch(Exception e2) {
			
		}
		
		
	}
	
}

//----------------------------------------------------------------------------------------------------------------------------
class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		String nick_usuario=JOptionPane.showInputDialog("Nick:  ");
		
		JLabel n_nick=new JLabel("Nick: ");
		
		add(n_nick);
		
		nick=new JLabel();
		
		nick.setText(nick_usuario);
		
		add(nick);
	
		JLabel texto=new JLabel(" Online: ");
		
		add(texto);
		
		ip=new JComboBox();
		
		/*ip.addItem("Usuario 1");
		
		ip.addItem("Usuario 2");
		
		ip.addItem("Usuario 3");*/
		
		/*ip.addItem("192.168.0.197");
		
		ip.addItem("192.168.0.198");*/
		
		
		add(ip);
		
		campochat=new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento=new EnviaTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
		
		Thread mihilo=new Thread(this);
		
		mihilo.start();
		
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			//System.out.println(campo1.getText());
			
						campochat.append("\n" +campo1.getText());
			
						try {
							
							Socket misocket=new Socket("192.168.1.102",9999);
							
							PaqueteEnvio datos=new PaqueteEnvio();
							
							datos.setNick(nick.getText());
							
							datos.setIp(ip.getSelectedItem().toString());
							
							datos.setMensaje(campo1.getText());
							
							ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
							
							paquete_datos.writeObject(datos);
							
							
							
							
							misocket.close();
							
							
							
							/*DataOutputStream flujo_salida=new DataOutputStream(misocket.getOutputStream());
							
							flujo_salida.writeUTF(campo1.getText());
							
							flujo_salida.close();*/
							
							
							
							
							
						} catch (UnknownHostException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							
							e.printStackTrace();
							
							System.out.println(e.getMessage());
							
							
						}
					
					
			
			
			
		}
		
		
	}
	
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		
		try {
			
			ServerSocket servidor_cliente=new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				
				cliente=servidor_cliente.accept();
				
				ObjectInputStream flujoentrada=new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) flujoentrada.readObject();
				
				if(paqueteRecibido.getMensaje().equals(" online")) {
					
					campochat.append("\n" + paqueteRecibido.getNick() + " : " + paqueteRecibido.getMensaje());
				
				}else {
				
					//campochat.append("\n" + paqueteRecibido.getIps());
					
					ArrayList<String>IpsMenu=new ArrayList<String>();
					
					IpsMenu=paqueteRecibido.getIps();
					
					ip.removeAllItems();
					
					for(String z: IpsMenu) {
						
						ip.addItem(z);
						
					}
				}
				
				
			}
			
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
		
	private JTextField campo1;
	
	private JComboBox ip;
	
	private JLabel nick;
	
	private JTextArea campochat;
	
	private JButton miboton;

	
	
}




class PaqueteEnvio implements Serializable{
	 
	private String nick,ip,mensaje;
	
	private ArrayList<String> Ips;

	/**
	 * @return the ips
	 */
	public ArrayList<String> getIps() {
		return Ips;
	}

	/**
	 * @param ips the ips to set
	 */
	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}