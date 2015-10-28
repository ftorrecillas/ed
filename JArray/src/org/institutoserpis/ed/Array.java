package org.institutoserpis.ed;

public class Array {

	public static void main (String[] args) {
		int[] v = new int[]{4,9,7,12,21};
		//v[0]=33; 
		
		//System.out.println("quinto elemento "+ v[0]);
		//System.out.println("segundo elemento "+ v[1]);
		
		for (int index =0; index < v.length; index++)
		System.out.println(" elemento con index= "+index+ " : "+ v[index]);
		
		System.out.println("suma del array "+ suma(v));
		System.out.println("suma de otro array "+ suma(new int[]{14,24}));
		System.out.println("suma de otro array "+ suma(new int[]{ }));
		
		System.out.println("el menor del array "+ menor(v));
		System.out.println("el puesto del nuemro en el array "+ puesto(v,9));
	}
	//metodo suma
	public static int suma(int[] w) {
		// muestra la longitud del vector numero de elementos v.length
		int sumas;
		sumas=0;
		for (int index =0; index <w.length; index++)
			
			sumas=sumas+w[index];
		
		return sumas;
	}
	//devuelve el menor
	public static int menor(int[] w) {
		int menos=w[0];
		
		for (int index =0; index <w.length; index++){
		
			if (w[index]<menos){
				menos=w[index];
			}
				
		}
			
		return menos;
	}
	//por ejemplo buscamos si esta el 4 (que no estara porq es 33 primera posicion ) tendra q devolver -1
	public static int puesto(int[] w,int valor) {
		
		
		
		
		for (int index =0; index <w.length; index++)
			if (w[index]==valor)
				return index; //no hace falta llaves porq solo tienen una sentancia el for-> if y el if->return
		return -1;//si no lo encuentra devolvera -1
			
		}
	
}

