public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Daisy";
        String nomeDois = new String("Daisy");

        System.out.println(nomeUm.equals(nomeDois));



        int numero1 = 1;
        int numero2 = 2;   

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){ //true
            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igaul a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        

    }
    
}
