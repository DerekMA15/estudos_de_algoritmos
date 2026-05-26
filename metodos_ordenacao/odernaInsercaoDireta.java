package metodos_ordenacao;
/*  
    Esse método consiste em se dividir a lista em duas: uma classificada e a outra
    desclassificada. A seguir, cada elemento da lista desclassificada é inserido na
    classificada, aumentando-se consequentemente o tamanho da classificada e
    diminuindo-se o tamanho da desclassificada

    Uma maneira de proceder a classificação é criar uma outra lista e, à medida que
    formos percorrendo os elementos da primeira lista iremos inserindo na segunda
    na posição correta. 

    Obs.: 
    Para implementar esse algoritmo, a primeira idéia que nos vem à mente é usar dois
    arrays. Mas, se for observado atentamente, notamos que a lista da esquerda cresce
    exatamente na mesma velocidade com que a da direita diminui. Assim nós só
    precisamos de um array, ficando uma lista à esquerda do array e a outra à direita.

*/
public class odernaInsercaoDireta {
    public static void ordInsercao(int array[ ])
    {
    int i, k, temp;
    
        for(i = 1; i<array.length; i++){
            k = i;
            temp = array[i];
                while((k>0) && (temp < array[k-1])){
                    array[k] = array[k-1];
                    k = k-1;
                }
            array[k] = temp;
            }
    }

    public static void main(String[] args) {
        int [] teste = {3,4,1,3,1};
        ordInsercao(teste);

        for ( int i : teste) {
            System.out.print( i + " ");
        }
            
    }

}
