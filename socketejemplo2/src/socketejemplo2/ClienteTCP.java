package socketejemplo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteTCP {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("CLIENTE > Digite Host: ");
		String host = entrada.next();
		System.out.println("Digite los numeros sepaados con coma: ");
		String msg = entrada.next();
		String[] mensaje = msg.split(",");
		InetAddress direccionIp = null;
		try {
			direccionIp = InetAddress.getByName(host);
		}catch(UnknownHostException e) {
			System.out.println("No se ha encontrado el host.");
		}
		int puerto = 1233;
		for(int n=0; n<mensaje.length; n++) {
			Socket socket = null;
			DataInputStream dis = null;
			DataOutputStream dos = null;
			try {
				int numero = Integer.parseInt(mensaje[n]);
				socket = new Socket(direccionIp,puerto);
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				dos.writeInt(numero);
				long resultado = dis.readLong();
				System.out.print("Puerto Local: "+socket.getLocalPort()+" Puerto: "+socket.getLocalPort());
				System.out.print("Solicitud= "+numero+"\t Resultado = "+resultado);
				dis.close();
				dos.close();
			}catch(Exception e) {
				System.out.println("Se produjo un error en "+e);
			}try {
				if(socket!=null) {
					socket.close();
				}
			}catch(IOException e) {
				System.err.print("Error al ejecutar el socket"+e);
			}
		}
	}
}
