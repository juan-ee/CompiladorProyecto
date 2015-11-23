package comp;

public class TokenClass {
	String tipo,token;
	int num_linea,num_column;	
	public TokenClass(String tipo, String token) {
		super();
		this.tipo = tipo;
		this.token = token;		
		this.num_linea = -1;
	}
	public TokenClass(String tipo, String token, int linea, int column) {
		super();
		this.tipo = tipo;
		this.token = token;		
		this.num_linea = linea;
		this.num_column = column;
	}
	
	@Override
	public String toString() {		
		if(num_linea==-1){
			return tipo + "-> " + token ;
		}else{
			return tipo + "-> " + token + " en la linea:" + num_linea+" columna: "+num_column;
		}
		
	}	
	
}
