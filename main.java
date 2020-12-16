import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        //CHAMAR OS METODOS DAS QUESTÕES DENTRO DA MAIN, E CRIAR AS FUNÇÕES SEPARAS. EX: roboVigia();

        roboVigia();
        smurfsDaSegundona();


    }

    public static void roboVigia(){


    }

    public static void smurfsDaSegundona() {
        int tamanhoChuteira, qtdChuteiras,aux,contE, contD;
        String l;
        String direito="Direito", esquerdo="Esquedro";
 

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
            System.out.print("Qual dos pés ela pertence?\nD - Direito\nE - Esquerdo:  ");
            l = teclado.nextLine();
            //l = teclado.next().charAt(0); //so para teste
            teclado.nextLine();

            //Não quer entrar no IF

            if(l.equals("D")){
                System.out.print("teste");
            }
            else{
               
            }

            
        }


        //System.out.print(contE +" "+contD);
    }




















































}// fechamento do metodo main