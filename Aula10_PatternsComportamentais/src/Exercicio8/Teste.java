package Exercicio8;

/**
 * 
 * @author Lincoln de Freitas Almeida RA:816119071 SI3ANMCA
 *
 */


public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Marcelo", noticiario);
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Tópicos interessantes!");
	new Consumidor("Lincoln", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Tópico ruim");
	}
}
