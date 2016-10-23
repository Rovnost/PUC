/* Codigo do Max
*/
public class ValidarCPF{

  public static void metodo01( String cpf){
    int tamanho = cpf.length();

    while( tamanho != 12){
      MyIO.print("INVÁLIDO. Digite novamente: \n");
      cpf = MyIO.readString();
      tamanho = cpf.length();
    }

    int soma = 0;
    int caractere = 0;
    int j = 0;

    for( int i = 10; i >=2; i--){
      char b = cpf.charAt(j);
      String inutil = b + "";
      caractere = Integer.parseInt(inutil)*i;
      soma = soma + caractere;
      j++;
    }
    // MyIO.println(soma);

    String compare = soma*10 % 11 + "";
    String digito1 = cpf.charAt(10) + "";

    // Primeira verificacao
    if( compare.equals(digito1) ){

      int soma2 = 0;
      int caractere2 = 0;
      int j2 = 0;

      for( int i = 11; i >=3; i--){
        char b2 = cpf.charAt(j2);
        String inutil2 = b2 + "";
        caractere2 = Integer.parseInt(inutil2)*i;
        soma2 = soma2 + caractere2;
        j2++;
      }

      char b3 = cpf.charAt(10);
      String inutil3 = b3 + "";
      int caractere3 = Integer.parseInt(inutil3)*2;

      soma2 = soma2 + caractere3;

      // MyIO.println(soma2);

      String compare2 = soma2*10 % 11 + "";
      String digito2 = cpf.charAt(11) + "";

      // Segunda verificacao
      if( compare2.equals(digito2) ){
        MyIO.println("CPF VÁLIDO!");
      }
      else
      {
        MyIO.println("CPF INVALIDO!!");
      }

    }
    else
      MyIO.println("CPF INVALIDO!!");

}

  public static void main(String[] args) {

    String cpf;
    cpf = MyIO.readString("Digite seu CPF : "+"\n Exemplo: 529982247-25\n");
    metodo01(cpf);

  }

}
