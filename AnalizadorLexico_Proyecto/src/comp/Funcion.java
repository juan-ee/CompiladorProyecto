package comp;

import java.util.ArrayList;

public class Funcion {
	int tipo;
	String id;
	ArrayList<Declaracion> var_param;
	ArrayList<Declaracion> var_loc;
	
	public Funcion(int tipo, String id) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.var_param = new ArrayList<>();
		this.var_loc = new ArrayList<>();
	}
	
	public int buscar_vparam(String id){		
		for (Declaracion x:var_param){
			if(x.id.equals(id)){
				return var_param.indexOf(x);
			}
		}
		return -1;
	}
	
	public int buscar_vlocales(String id){
		for (Declaracion x:var_loc){
			if(x.id.equals(id)){
				return var_loc.indexOf(x);
			}
		}
		return -1;
	}
	
	public void insertar_vparam(int tipo,String id, int linea){
		if(buscar_vparam(id)==-1){
			var_param.add(new Declaracion(tipo, id));
		}else{
			System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada en otro parametro");
		}
	}
	
	public void insertar_vlocales(int tipo,String id, int linea){
		if(buscar_vparam(id)==-1){
			if(buscar_vlocales(id)==-1){
				var_loc.add(new Declaracion(tipo, id));
			}else{
				System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable local \""+id+"\" ya ha sido declarada antes");
			}			
		}else{
			System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada en un parametro");
		}
	}
	
}

