package orientacaoObjetoAvancado;

public class UsaEstoque {

	public static void main(String[] args) {
		
		
		Estoque estoque1 = new Estoque();
		estoque1.nome = "Impressora Jato de Tinta";
	    estoque1.qtdAtual = 13;
	    estoque1.qtdMinima = 6;
	    
	    Estoque estoque2 = new Estoque();
	    estoque2.nome = "Monitor LCD 17 polegadas";
	    estoque2.qtdAtual = 11;
	    estoque2.qtdMinima = 13;
	    
	    Estoque estoque3 = new Estoque();
	    estoque3.nome = "Mouse �tico";
	    estoque3.qtdAtual = 6;
	    estoque3.qtdMinima = 2;
	    
	    
	    estoque1.darBaixa(5);
	    estoque2.repor(17);
	    estoque3.darBaixa(4);
	    
	    estoque1.precisaRepor();
	    estoque2.precisaRepor();
	    estoque3.precisaRepor();
	    
	    estoque1.mostra();
	    estoque2.mostra();
	    estoque3.mostra();
	    
	/*  a) Dar baixa em 5 unidades de estoque1. ok
	    b) Fazer a reposi��o de 7 unidades de estoque2. ok
	    c) Dar baixa em 4 unidades de estoque3. ok
	    d) Exibir a sa�da do m�todo precisaRepor dos 3 objetos.
	    e) Exibir a sa�da do m�todo mostra para apresentar as informa��es sobre os 3 objetos.
	    */
	    
		
		

	}

}
