
public class Atividade2{

    public static void main (String [] args){

        System.out.println(somatorio(4));

    }

    public static int somatorio(int i){
        if(i<0){
            System.out.println("numero invalido");
            return -1;
        }
    
        if(i==0){
            return 0;
        }
        return somatorio(i-1)+i;
    
    }
}