package exemplo7.modificador_acesso.subpacote;

import exemplo7.modificador_acesso.ModificadoresAcesso;

public class ModificadoresAcessoEspecifico

		extends ModificadoresAcesso {
	
	void testaAtributosSuperClasse(){
		//modificadorDefault = 0;
		modificadorPublic = 0;
		modificadorProtected = 0;
		//modificadorPrivate = 0;
	}
	
	
	
       void testaModificadores(){
		
		ModificadoresAcesso m = new ModificadoresAcesso();
		
		//m.modificadorDefault = 0;
		m.modificadorPublic = 0;
		//m.modificadorProtected = 0;
		//m.modificadorPrivate = 0;
	
	
	
	

}
       
}

