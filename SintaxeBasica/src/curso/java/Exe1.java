package curso.java;

import javax.swing.JOptionPane;

public class Exe1 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome:");
		System.out.println(nome);
		
		
				
		String t1 = JOptionPane.showInputDialog("Entre com o primeiro Numero");
	    String t2 = JOptionPane.showInputDialog("Entre com segundo Número");
	    
	    	    
	    
	    //momento em que ocorre a conversão de palavra pra numero
	    int n1 = Integer.parseInt(t1);
	    int n2 = Integer.parseInt(t2);
	    
	  
	    if (n2 !=0){
	    		    	
	    	System.out.println("Soma:" + (n1 + n2));
		    System.out.println("sub:"  + (n1 - n2));
		    System.out.println("Mult:" + n1 * n2);
		    System.out.println("Div:"  + n1 / n2);	
	    }else{
	    	System.out.println("Não foi executado por cauda da divisão por 0");
	    }
	   	
	
		
		
	}

}
