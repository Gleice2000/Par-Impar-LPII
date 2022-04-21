import java.util.*;

public class Main
        
{
    public static void main(String[] args){
        MediaParImpar mpi = new MediaParImpar(); //criando uma classe
        
        Scanner enter = new Scanner(System.in); // recebendo os dados do usuário
        
        System.out.print("Quantos numeros você quer adicionar? "); // perguntar ao usuario quantos numeros adicionar
        int qnt = enter.nextInt(); // variavel que guarda a quantidade de numeros que seram digitados
        
        for(int cont = 0; cont < qnt; cont++) {
            System.out.print("Digite o numero: "); // digita o numero
            int number = enter.nextInt();// recebe o numero que foi digitado
            mpi.addLista( number);// chama a função
        }
        
        System.out.println("A media aritimetica é: " + mpi.mediaA(qnt) + "\n"); //chamar o metodo dentro do system
        mpi.parImpar(qnt);// chamando o metodo
         System.out.println("A media geométrica é: " + mpi.mediaGeo(qnt) + "\n");
    
}
}
