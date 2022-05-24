package decoratorComboAcai;

public class Banana extends BaseDecorator {
	public Banana(Adicional adicional) {
		super(adicional);
	}

	public String getDescricao() {
		return adicional.getDescricao() + ", Banana";
	}
	public double custo() {
		return adicional.custo() + 1.50;
	}
}
