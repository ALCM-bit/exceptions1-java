package model.exceptions;

public class DomainException extends Exception{
	// USANDO RuntimeExeception NÃO É NECESSARIO O USO DE THROWS DECLARATION
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		//REPASSANDO A MENSAGEM PARA O CONSTRUTOR DA SUPER CLASSE:
		super(msg); 
	}

}
