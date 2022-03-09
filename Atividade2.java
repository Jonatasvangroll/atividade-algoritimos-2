
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
    
     public static String convBase2(int n){
          
          if(n<0){
              return "Erro";
            
        }

        if(n==0){
            return "0";

        }

        if(n==1){
            return "1";

        }

        int remainder=n%2;
        int result=n/2;
        String binary;

        if(remainder==1){
            binary="1";
        }
        else{
            binary="0";
        }

        return convBase2(result) + binary;


    }
}
