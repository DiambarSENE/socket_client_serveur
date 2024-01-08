package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main(String[] args) {
		try {
			System.out.println("Attente d'une connexion du client");
			ServerSocket ss = new ServerSocket(3000);
			Socket s = ss.accept();
			System.out.println("Connexion etablie");
			System.out.println("J'attends un nombre du client");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			int nombre = is.read();
			System.out.println("Reception du nombre"+nombre);
			
			int resultat = nombre*2;
			System.out.println("J'envoie la reponse");
			
			os.write(resultat);
			s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
