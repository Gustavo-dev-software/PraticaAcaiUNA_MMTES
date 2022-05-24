package decorator;

public class Morango extends BaseDecorator {
	public Morango(Adicional adicional) {
		super(adicional);
	}

	public String getDescricao() {
		return super.getDescricao() + ", Morango";
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
