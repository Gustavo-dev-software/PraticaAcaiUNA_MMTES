package decorator;

public class Acai implements Adicional {
	public char tamanho = 'P';

	public String getDescricao() {
		return "Creme de Açai " + tamanho;
	}

	public double custoP() {
		return 10.90;
	}
	
	public double custoM() {
		return 12.90;
	}
	
	public double custoG() {
		return 14.90;
	}
	@Override
	public void setTamanho(char t) {
		this.tamanho = t;
	}

}
