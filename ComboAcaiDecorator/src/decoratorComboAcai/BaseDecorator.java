package decoratorComboAcai;

public class BaseDecorator implements Adicional {
	public Adicional adicional;

	public BaseDecorator(Adicional adicional) {
		this.adicional = adicional;
	}

	public String getDescricao() {
		return adicional.getDescricao();
	}

	public double custo() {
		return adicional.custo();
	}
}
