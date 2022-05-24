package decoratorComboAcai;

public class TestaDecoratorComboAcai {

	public static void main(String[] args) {
		Adicional acai = new Acai();
		System.out.println(acai.getDescricao());
		System.out.println(acai.custo());
		Adicional acaiNovo = new Morango(acai);
		System.out.println(acaiNovo.getDescricao());
		System.out.println(acaiNovo.custo());
		Adicional novoAcai = new Banana(acaiNovo);
		System.out.println(novoAcai.getDescricao());
		System.out.println(novoAcai.custo());
		Adicional acaiBanana = new Banana(acai);
		System.out.println(acaiBanana.getDescricao());
		System.out.println(acaiBanana.custo());
		Adicional acaiMel = new Mel(acaiNovo);
		System.out.println(acaiMel.getDescricao());
		System.out.println(acaiMel.custo());
		Adicional acaiTodos = new Banana(acaiMel);
		System.out.println(acaiTodos.getDescricao());
		System.out.println(acaiTodos.custo());
	}

}
