
/******************************************************************************
4- Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada jaula um animal diferente, 
percorra cada jaula e emita o som e, 
se o tipo de animal possuir o comportamento, faça-o correr. (2,5 pontos

*******************************************************************************/



public class Main{
    public static void main(String[] args)
    {
    
        String[] Anima = {"gato","leao","onça","boi","elefante","papaguaio","gato","zebra","cavalo","cobra","galinha","burro"};
        
    	Zoologico Zoolog = new Zoologico(Anima);
        Zoolog.Jaulas();
    	
    }
}