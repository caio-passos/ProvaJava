/* Equipe: 
    Caio Passos
    Alessandra Lima 
    Arthur Silva
 * 
 */
public class operacao {

   
    public String Add(Integer n, Integer r){ //o usuário está digitando caracteres string 
        
        return   n + " + " + r + " = " + ( n + r + "\n") ;
        }        
    
    public String Subtraction( Integer n, Integer r){
        
        return n + " - " + r + " = " + (n - r + "\n");
    }

    public String Multiply(Integer n, Integer r){
        
        return n + " x " + r + " = " + (n * r + "\n");
    }

    
    public String Divide(Integer n, Integer r){

        return ((n*r)+ " / " + n + " = " + r+"\n");
    }
    
    
}
