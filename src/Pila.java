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
    
    private  int  data[] ; // tipo object ;
    private int tope;
    private int x;

  
   
  public int getTope(){
      int x;
      if(tope ==-1){
        return 0;  //0 significa que esta vacia la pila
      }
      x = data[tope];
      return x;
  }
    
    
    
    public Pila(int valor){
       data = new int[valor];
       tope = -1;
    }
   
    
    
   
    
    
    public boolean Insertar( int valor){
        if(tope == 5){				      
        return false; 
    }						      
         tope++;						      
   	 data[tope] = valor;
         return true;
    }
    
    public boolean  Eliminar(){
       int x;
    if( tope == -1){				      
      	 return false;						      
    }
       
        x = data[ tope ];
        tope--;
        return true;
    }

   
   

   
    
}
