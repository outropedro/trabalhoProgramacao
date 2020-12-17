import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        //CHAMAR OS METODOS DAS QUESTÕES DENTRO DA MAIN, E CRIAR AS FUNÇÕES SEPARAS. EX: roboVigia();

        //roboVigia();
        smurfsDaSegundona();

    }

    public static void roboVigia(){


    }

    public static void smurfsDaSegundona() {
        int tamanhoChuteira, qtdChuteiras,aux,contE, contD;
        String l;
 

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a quantidade de chuteiras individuais: ");
        qtdChuteiras = teclado.nextInt();
        aux=1;
        contE=0;
        contD=0;

        //informa tamanho e quantidades
        for(int i = 0; i<qtdChuteiras; i++){
            aux = 1+i;
            System.out.print("Insira o número da " + aux + "ª chuteira: ");
            tamanhoChuteira = teclado.nextInt();
            System.out.print("Essa chuteira é de qual pé:\nD - Direito\nE - Esquerdo: ");
            teclado.nextLine();
            l=teclado.nextLine();


            if(tamanhoChuteira == tamanhoChuteira){
                //conta quantas chuteiras tem de cada pé
                 if(l.equals("d") || l.equals("D")){
                    contD++;
                }
                else if(l.equals("E") || l.equals("e")){
                    contE++;
                }
            
       
        }   
        }

        if(contD==contE){
            System.out.print(contD);
        }
        else if(contD<contE){
            System.out.print(contD);
        }
        else if(contE<contD){
            System.out.print(contE);
        }
    }

    public static void semRepeticao(){
        int tamVetor, min, max,aux =0, cont=0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o numero minimo desejado: ");
        min = teclado.nextInt();

        System.out.print("Insira o numero maximo desejado: ");
        max = teclado.nextInt();

        tamVetor = max-min;
        int vetor[] = new int[tamVetor];
        

        for (int i=0; i<tamVetor; i++){
            //IMPLEMENTAR UMA FORMA QUE O VETOR RECEBA NUMERO POR NUMERO DESMEBRADO E EXECUTE A COMPARAÇÃO SE TEM ALGUM IGUAL, DEPOIS ZERAR VETOR, DEPOIS COLOCAR IF 
            // E ELSE PARA CONTAR QUANTAS NUMEROS SEM OS DIGITOS REPETIDOS TEM DENTRO DO INTERVALO
        }
        


    }


















































}// fechamento do metodo main