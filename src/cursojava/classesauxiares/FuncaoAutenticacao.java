package cursojava.classesauxiares;

import cursojava.interfaces.PermitirAcesso;

//Realmente e somente receber algum que tem o contrato da interface de PermitirAcesso e chamar o autenticacao// 
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
