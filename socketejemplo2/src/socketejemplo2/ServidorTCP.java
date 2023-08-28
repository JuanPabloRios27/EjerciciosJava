package socketejemplo2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServidorTCP {
	public static void main(String[] args) {
		try {
			System.out.println("SERVIDOR > Host: "+InetAddress.getLocalHost().toString());
		}catch(UnknownHostException e) {
			System.err.print("No se detecto ninguna dirección IP: "+e);
		}
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(1233);
		}catch(IOException e) {
			System.err.print("Error al abrir el socket"+e);
		}
		int entrada;
		int salida;
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				int puerto = socket.getPort();
				int puertolocal = socket.getLocalPort();
				InetAddress direccionIP = socket.getInetAddress();
				entrada = dis.readInt();
				salida = (int) ((long)entrada * (long)entrada) ;
				dos.writeLong(salida);
				dis.close();
				dos.close();
				socket.close();
				System.out.println("Puerto Local: "+puertolocal+" "+
				"Cliente"+direccionIP+" -Puerto"+puerto+" Entrada"+entrada+" Salida"+salida);
			}catch(Exception e) {
				System.out.println("Se produjo un problema en "+e);
			}
		}
	}
}
