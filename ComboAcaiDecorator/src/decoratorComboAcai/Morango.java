package decoratorComboAcai;

public class Morango extends BaseDecorator {
	public Morango(Adicional adicional) {
		super(adicional);
	}

	public String getDescricao() {
		return adicional.getDescricao() + ", Morango";
	}
	public double custo() {
		return adicional.custo() + 3.50;
	}
}
