import java.util.ArrayList;
import java.util.List;

public class MediaParImpar {
   
    List<Integer> lista = new ArrayList(); // cria uma lista do tipo inteiro
    public void addLista( int number) {
            lista.add(number);// para add numeros na lista
	}
    public double mediaA (double qnt)  
    {
            int aux;// variavel para auxiliar
            double soma = 0;
            double resultado;
            for(int cont = 0; cont < qnt; cont++) {
		aux = lista.get(cont);// o auxiliar pega o primeiro valor
		soma = soma + aux;
            }
            resultado = soma / qnt;
            return resultado;
	}
    public void parImpar(int qtd){
            for(int cont = 0; cont < qtd; cont++){
            if(lista.get(cont) % 2 == 0){//verificando se o numero é par (o % significa o resto da divisão)
            System.out.println("Par: " + lista.get(cont));
            } else {
            System.out.println("Impar: " + lista.get(cont));// verificando se o numero é impar
                }
            }
        }
    public double mediaGeo(int qnt){
            int soma = 1;
            int aux;
            double resultado = 0;
            for(int cont = 0; cont < qnt; cont++){
             aux = lista.get(cont);
             soma = soma * aux; // multiplicando os numeros
            }
            double exponente = 1.0 / qnt;// estou invertendo a raiz e divedindo pela quantidade enésima
            resultado = Math.pow(soma, exponente);// math é uma classe, pow é potencia
            return resultado;// retorna o resultado
        }
}


