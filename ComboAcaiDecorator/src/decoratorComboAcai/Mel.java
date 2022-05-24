package decoratorComboAcai;

public class Mel extends BaseDecorator {
	public Mel(Adicional adicional) {
		super(adicional);
	}

	public String getDescricao() {
		return adicional.getDescricao() + ", Mel";
	}
	public double custo() {
		return adicional.custo() + 2.50;
	}
}
