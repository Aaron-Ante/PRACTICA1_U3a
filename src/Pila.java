/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron
 */
public class Pila {
    
    private  int []data = new int[6]; // tipo object ;
    private int tope;
    private int x;
    
    
    public int getTope(){  
      return tope;
    }
    
  
    public Pila(){     
       tope = -1;
    }
    
    public boolean Insertar( int valor){
        if(tope == data.length-1){				      
        return false; 
    }						      
         tope++;						      
   	 data[tope] = valor;
         return true;
    }
    
    
    public boolean  Eliminar(){
      
    if( tope == -1){				      
      	 return false;						      
    }
        x = data[ tope ];
        tope--;
        return true;
    }

    public int[] mostrar(){
       return data;
    }
   
   
   
    public int mostrarx(){
       return x;
    }
   
    
}
