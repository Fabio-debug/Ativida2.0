
// package Veterinario.java;

public class Veterinario{
    
    private static String especi;
 
    public Veterinario(String speci)
    {
        this.especi = speci;
    }
    
    
    public String examinar()
    {
        String especi = this.especi;
        
        if(especi == "cachorro"){
            String examinado = "UaUau";
            return  examinado;
        }
        if(especi == "gato"){
            String examinado = "Minhaau";
            return  examinado;
        
        }
        if(especi == "boi"){
           String examinado = "Mooon";
           return  examinado;
        
        }
        else{
             String examinado = "Animal não examinado";
        
            return  examinado;
        }
        
        // return "false";
        
        // switch(especi){
            
        //     case "cachorro":
        //         System.out.println("UaUau");
        //     break;
            
        //     case "gato":
        //         System.out.println("Minhaau");
        //     break;
            
        //     case "boi":
        //         System.out.println("Mooon");
        //     break;
    
        //     default:
        //         System.out.println("Nao tem Animal com essa especi");
        // }
        
    }
    // return examinar()
        
}
    
