import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        //CHAMAR OS METODOS DAS QUESTÕES DENTRO DA MAIN, E CRIAR AS FUNÇÕES SEPARAS. EX: roboVigia();

        //roboVigia();
        //smurfsDaSegundona();
        semRepeticao();
    }

    public static void roboVigia(){
        int estacao, numComandos, qtdNinho;

 

        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a quantidade de ninhos que serão vigiados: ");
        qtdNinho = teclado.nextInt();
        System.out.print("Insira a quantidade de comandos que você irá inserir(comando deve ser 1 e -1): ");
        numComandos = teclado.nextInt();

        int comandos[] = new int[numComandos];
        int ninhos[] = new int[qtdNinho];
        int ninhosInvertido[] = new int[qtdNinho];


        estacao=0;
        //GERA VETOR COM NUMEROS DOS NINHOS;
        for(int i=0; i<qtdNinho; i++){
            ninhos[i] = i+1;
        }       

        //INVERTE VETOR COM NUMERO DOS NINHOS
        for(int inv=qtdNinho-1; inv>=0; inv--){
            for(int o=0; o<qtdNinho; o++){
                ninhosInvertido[o] = ninhos[inv]; 
            }
        }

        for(int j=0; j<numComandos; j++){
            System.out.print("Insira o " + j+1 + "º comando");
            comandos[j] = teclado.nextInt();
        }
        //VERIFICA COMANDO, COLOCA NA ESTAÇÃO   

        for(int c=1; c<=numComandos;c++){
            if(comandos[c] ==1){
                estacao +=1;
            }
            else if(comandos[c] == -1){
                estacao-=1;
                if(estacao <= -1){
                    //SE COMANDO FOR -1, E ESTAÇÃO DER -1, ESTAÇÃO VAI RECEBER O VALOR DA ULTIMA ESTAÇÃO;
                    for(int j = 0; j<qtdNinho; j++){
                        estacao = ninhosInvertido[j];
                    }
                }
            }
        }
        System.out.print(estacao);


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
            /* desmembra = num%10
            num/=10
            desmabra = num%10 */
        
        int max, min, tVet1, cont, cont2, qtdNun=0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira o numero maximo de digitos que seu numero maximo tem: ");
        int qtdMax= teclado.nextInt();
        System.out.print("insrira o numero minimo que você deseja obter: ");
        min = teclado.nextInt();
        System.out.print("insrira o numero maximo que você deseja obter: ");
        max = teclado.nextInt();
        
        tVet1=max-min;

        int operacao[] = new int[qtdMax];
        int numEntre[]=new int[tVet1];
        int vetAux[]=new int[tVet1];

        cont =0;
        cont2=0;

        //PREENCHE VETOR 
        for(int i=min; i<tVet1; i++){
            numEntre[i] = i;
            vetAux[i] = numEntre[i];
        }
        for(int j=0; j<tVet1; j++){
            for(int k=0; k<tVet1; k++){
                operacao[j]=vetAux[j]%10;
                vetAux[j]/=10;
    
                if(j==0 && k==0){
                    if(operacao[j] == operacao[j+k]){
                        cont++;
                    }
                }
                else if(j==(tVet1-1)){
                    if(operacao[j] == operacao[j-k]){
                        cont++;
                    }
                }
                if(j!=0){

                    //VERIFICA SE TEM NUMEROS IGUAIS
                    if(operacao[j] == operacao[j-k] && operacao[j] == operacao[j+k]){
                        cont++;
                    }
                    else{
                        cont2++;
                    }
                }
            }
            
        }
        if(cont <2){
            qtdNun = cont2-cont;
        }
        else if(0<qtdNun) {
            System.out.print("0");
        }
        else{
            System.out.print(cont);
        }
            
    }


















































}// fechamento do metodo main