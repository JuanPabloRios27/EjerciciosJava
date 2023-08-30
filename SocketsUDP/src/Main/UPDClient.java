package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.SocketTimeoutException;

public class UPDClient {
	public static void main(String[] args) throws Exception{
		try {
			String serverHostName= new String("192.168.56.1");
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			DatagramSocket clientSocket = new DatagramSocket();
			InetAddress IPadress = InetAddress.getByName(serverHostName);
			System.out.println("Atendiendo conexión para "+IPadress+" ) via UPD puerto 9876");
			byte[] senddata = new byte[10];
			byte[] receivedata = new byte[10];
			System.out.println("Ingrese un mensaje: ");
			String sentence = inFromUser.readLine();
			senddata = sentence.getBytes();
			System.out.println("Enviando los datos de "+senddata.length+
					" bytes hasta el servidor. ");
			DatagramPacket sendPacket = new DatagramPacket(senddata, senddata.length,IPadress,9876);
			clientSocket.send(sendPacket);
			DatagramPacket receivePacket = new DatagramPacket(receivedata, receivedata.length);
			System.out.println("Esperando paquete de retorno...");
			clientSocket.setSoTimeout(100000);
			try {
				clientSocket.receive(receivePacket);
				String modifiedSentence = new String(receivePacket.getData());
				InetAddress returnIPAddress = receivePacket.getAddress();
				int port = receivePacket.getPort();
				System.out.println("From server at: "+returnIPAddress+":"+port);
				System.out.println("Message: "+modifiedSentence);
			}catch(SocketTimeoutException ste) {
				System.out.println("Perdimos el server");
			}
			clientSocket.close();
		}catch(IOException e) {
			
		}
	}
}
