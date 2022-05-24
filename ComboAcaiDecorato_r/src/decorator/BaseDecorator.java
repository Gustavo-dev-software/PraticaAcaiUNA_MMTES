package decorator;

public class BaseDecorator implements Adicional {
	public Adicional wrapper;

	public BaseDecorator(Adicional adicional) {
		this.wrapper = adicional;
	}

	public String getDescricao() {
		return wrapper.getDescricao();
	}

	public double custoP() {
		return wrapper.custoP();
	}

	public double custoM() {
		return wrapper.custoM();
	}

	public double custoG() {
		return wrapper.custoG();
	}

	@Override
	public void setTamanho(char t) {
		wrapper.setTamanho(t);
	}
}
