package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
	
	try{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Connexion vers le serveur:");
		Socket s = new Socket("localhost",3000);
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("Entrer un nombre:");
		int nombre=scanner.nextInt();
		os.write(nombre);
		System.out.println("Attente de la reponse:");
		int rep = is.read();
		System.out.println("La reponse:" +rep);
		s.close();
	}catch(IOException e){
		e.printStackTrace();
	}				

	}

}
