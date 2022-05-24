package decorator;

public class TestaDecorator {

	public static void main(String[] args) {
		Adicional adicional = new Acai();
		adicional.setTamanho('p');
		System.out.println(adicional.getDescricao());
		System.out.println(adicional.custoP());

		Adicional banana = new Banana(adicional);
		banana.setTamanho('g');
		System.out.println(banana.getDescricao());
		System.out.println(banana.custoG());

		Adicional mel = new Morango(adicional);
		mel = new Mel(mel);
		mel.setTamanho('m');
		System.out.println(mel.getDescricao());
		System.out.println(mel.custoM());
	}

}
