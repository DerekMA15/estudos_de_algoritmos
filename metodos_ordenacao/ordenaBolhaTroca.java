package metodos_ordenacao;
public class ordenaBolhaTroca {

    // a ideia nesse algoritmo é sempre organizar de traz pra frente(no tail) sempre pegando o maior valor e jogando para traz

    public static void ordBubbleSort(int array[ ]) {
        int fim, temp; boolean troquei;
        fim = array.length;
        
        do {
            troquei = false;
            for (int i = 0; i < fim-1; i++) //fim - 1 para sempre checar até o ultimo valor
                if (array[i] > array[i+1]) {
                    temp = array[i]; // <- aqui que acontece a troca dos valores e onde tem a mudança 
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    troquei = true;
            }
            fim--; // <- vai subtraindo o rabo e encurtando até enquanto houver trocas e o fim for maior que 1 
            }while (troquei && fim > 1);

    }

    public static void main(String[] args) {
        int [] teste = {3,4,1,3,1};
        ordBubbleSort(teste);

        for ( int i : teste) {
            System.out.print( i + " ");
        }
            
    }


}