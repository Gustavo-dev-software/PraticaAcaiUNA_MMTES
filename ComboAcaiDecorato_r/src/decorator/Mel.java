package decorator;

public class Mel extends BaseDecorator {
	public Mel(Adicional adicional) {
		super(adicional);
	}

	public String getDescricao() {
		return super.getDescricao() + ", Mel";
	}

	public double custoP() {
		return super.custoP() + 1.00;
	}

	public double custoM() {
		return super.custoM() + 1.50;
	}

	public double custoG() {
		return super.custoG() + 2.00;
	}
}
