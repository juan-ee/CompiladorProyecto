package comp;

import java.util.ArrayList;

public class Programa {
	ArrayList<DeclaracionVector> vectores; //Coleccion usada para los vectores globales
	ArrayList<Declaracion> var_globales; //Coleccion usada para las variables globales
	

	public Programa() {
		super();
		this.vectores = new ArrayList<>();
		this.var_globales = new ArrayList<>();
				
	}
	
	//Metodo para buscar el inidice de alguna variable global declarada
		private int buscar_vglobales(String id){
			for(Declaracion n:var_globales){
				if(n.id.equals(id)){
					return var_globales.indexOf(n);
				}
			}
			return -1;
		}
		
	//Metodo para buscar el indice de algun vector declarado
	public int buscar_vectores(String id){
		for(DeclaracionVector n:vectores){
			if(n.id.equals(id)){
				return vectores.indexOf(n);
			}			
		}
		return -1;
	}
	

	//Metodo para insertar variables globales
	public void insertar_vglobales(int tipo, String id, int linea){
		if(buscar_vectores(id)==-1){
			if(buscar_vglobales(id)==-1){				
				var_globales.add(new Declaracion(tipo, id));
			}else{
				System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada anteriormente");
			}
		}else{
			System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada anteriormente");
		}
	}

	//Metodo para insertar vectores
	public void insertar_vectores(int tipo, String id,int tamano, int linea){
		if(buscar_vectores(id)==-1){
			if(buscar_vglobales(id)==-1){
				vectores.add(new DeclaracionVector(tipo, id, tamano));				
			}else{
				System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada anteriormente");				
			}
		}else{
			System.out.println("ERROR SEMANTICO en linea: "+linea+". La variable \""+id+"\" ya ha sido declarada anteriormente");
		}		
	}
	
	
	
	
}
