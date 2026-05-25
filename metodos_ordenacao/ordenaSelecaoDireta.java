package metodos_ordenacao;

/*  
    Esse método consiste do seguinte:
    • Procura-se o menor valor entre os elementos A1, A2, ... AN e
    coloca-se em A1;
    • Procura-se o menor valor entre os elementos A2, A3, ... AN e
    coloca-se em A2;
    • Continua-se com o processo até chegar a condição de
    procurarmos o menor valor entre AN-1 e AN. Neste caso
    colocamos o menor em AN-1 e o maior em AN e terminamos o
    processo. 
*/
public class ordenaSelecaoDireta {
    public static void ordSelecao(int array[]) {
    int IMenor, temp;
        for (int i = 0; i < array.length -1; i++) {
            IMenor = i; // <- esse vai ser o valor de comparação, ou seja, vamos pegar o pivo de cada indice e comparar com o seu adjacente
            for (int k = i+1; k < array.length; k++) // esse "i+1" é justamente oque obriga a olher o seguinte
                if (array[k] < array[IMenor])
                IMenor = k;
                if (i != IMenor) {
                temp = array[i];
                array[i] = array[IMenor];
                array[IMenor] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] teste = {3,4,1,3,1};
        ordSelecao(teste);

        for ( int i : teste) {
            System.out.print( i + " ");
        }
            
    }

}
