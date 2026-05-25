package metodos_ordenacao;

public class ordenaBolhaSelecao{


    public static void ordBuble(int array[ ]){
        int x, y, aux;
            for(x=0; x<array.length -1;x++)
                for(y=x+1; y<array.length; y++)
                    if(array[x] > array[y]){
                    aux = array[x];
                    array[x] = array[y];
                    array[y] = aux;
        }
    }

    public static void main(String[] args) {
        int [] teste = {3,4,1,3,1};
        ordBuble(teste);

        for ( int i : teste) {
            System.out.print( i + " ");
        }
            
    }

}
