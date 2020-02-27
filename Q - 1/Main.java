/******************************************************************************

1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal: (2,5 pontos

*******************************************************************************/



public class Main
{
	public static void main(String[] args) {
	
        cachorro Cachorro = new cachorro();
        
        Cachorro.name = "Rabito";
        Cachorro.age = 19;
        Cachorro.type = "Cachorro";
        
       
        System.out.println("Animal: " + Cachorro.type);
        System.out.println(Cachorro.name);
        System.out.println(Cachorro.age);
        System.out.println(Cachorro.som("AuAuAU"));
        System.out.println(Cachorro.correr());
        
        System.out.println("=================================================================");
          
         cavalo Cavalo = new cavalo();
        
        Cavalo.name = "PÉDEPANO";
        Cavalo.age = 20;
        Cavalo.type = "Cavalo";
        
       
        System.out.println("Animal: " + Cavalo.type);
        System.out.println(Cavalo.name);
        System.out.println(Cavalo.age);
        System.out.println(Cavalo.som("BRUUUUINNNBRUUUN"));
        System.out.println(Cavalo.correr());
        
        System.out.println("=================================================================");
            
	        
        gato Gato = new gato();
        
        Gato.name = "Gafio";
        Gato.age = 19;
        Gato.type = "Gato";
        
       
        System.out.println("Animal: " + Gato.type);
        System.out.println(Gato.name);
        System.out.println(Gato.age);
        System.out.println(Gato.som("MIAAAU"));
        System.out.println(Gato.correr());
        
        System.out.println("=================================================================");
	}
}
