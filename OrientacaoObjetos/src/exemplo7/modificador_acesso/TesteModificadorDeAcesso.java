package exemplo7.modificador_acesso;

public class TesteModificadorDeAcesso {

	
	void testaModificadores(){
		
		ModificadoresAcesso m = new ModificadoresAcesso();
		
		m.modificadorDefault = 0;
		m.modificadorPublic = 0;
		m.modificadorProtected = 0;
		//m.modificadorPrivate = 0; nao esta na mesma classe porem da erro.
	}
		
		

	}


