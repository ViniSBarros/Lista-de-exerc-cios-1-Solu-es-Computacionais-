import java.util.Scanner;
import java.lang.Math;

class Exercicio1ao17 {
    public static void main (String[] args) {
      
      Scanner leitor = new Scanner(System.in);
      
      /*Exercício 1
        System.out.println("Vinícius dos Santos Barros\n125111365423\nCiência da Computação");
      */

      /*Exercicio 2
      System.out.println("19\n1.84m\nonline");
      */

      /*Exercicio 3
      double[] notas = new double[] {8.0, 7.5, 4.5, 9.0};
      double soma = 0;

      for(int i = 0;i < notas.length; i++) {
        soma += notas[i];
      }
      soma /= 4;
      System.out.println(soma);
      */

      /*Exercicio 4
      int[] N = new int[2];
      int total = 0;
      
      System.out.println("Informe o primeiro numero inteiro: ");
      N[0] = leitor.nextInt();
      System.out.println("Informe o segundo numero inteiro: ");
      
      N[1] = leitor.nextInt();
      total = N[0] * N[1];
      System.out.println(total);
      */

      /*Exercicio 5
      float[] N = new float[2];
      System.out.println("Informe o primeiro número: ");
      N[0] = leitor.nextFloat();
      System.out.println("Informe o segundo número: ");
      N[1] = leitor.nextFloat();

      if(N[0] > N[1]) {
        System.out.println(N[0] + " " + N[1]);
      } else if( N[1] > N[0]) {
        System.out.println(N[1] + " " + N[0]);
        } else {
        System.out.println("Os 2 números são iguais" );
          }
      */

      /*Exercicio 6
      int num;
      System.out.println("informe o numero inteiro: ");
      num = leitor.nextInt();
      if(num >= 50 && num <= 100) {
        System.out.println("Pertence ao intervalo");
      } else {
        System.out.println("Não pertence ao intervalo");
      }
      */

      /*Exercicio 7
      String periodo;
      System.out.println("Informe em qual periodo você estuda utilizando M para matutino, V para vespertino e N para noturno: ");
      periodo = leitor.nextLine();
      if(periodo.charAt(0) == 'M') {
        System.out.println("Bom dia");
      } else if(periodo.charAt(0) == 'V') {
        System.out.println("Boa tarde");
      } else {
        System.out.println("Boa noite");
      }
      */

      /*Exercicio 8
      int raio = 5;
      System.out.println(Math.PI * Math.pow(raio, 2));
      */

      /*Exercicio 9
      int[] ano = new int[2];
      int idade, futuro;
      
      System.out.println("Informe em qual ano vc nasceu: ");
      ano[0] = leitor.nextInt();
      System.out.println("Informe em qual ano estamos: ");
      ano[1] = leitor.nextInt();

      idade = ano[1] - ano[0];
      futuro = 2030 - ano[0];
      System.out.println("Você tem " + idade + " anos");
      System.out.println("Em 2030 você terá " + futuro + " anos");
      */

      /*Exercicio 10
      String senha;
      
      System.out.println("Digite a senha: ");
      senha = leitor.nextLine();
      
      if(senha.equals("R10p5")) {
        System.out.println("Acesso concedido");
      } else {
        System.out.println("Acesso negado");
      */

      /*Exercicio 11
      float salarioBruto, valorPrestacao;

      System.out.println("Digite o seu salário bruto: ");
      salarioBruto = leitor.nextFloat();
      System.out.println("Digite o valor da prestação: ");
      valorPrestacao = leitor.nextFloat();

      if((salarioBruto * 0.3) > valorPrestacao) {
        System.out.println("Empréstimo pode ser concedido!");
      } else {
        System.out.println("Empréstimo não pode ser concedido!");
      }
      */

      /*Exercicio 12
      int idade;

      System.out.println("Digite a sua idade: ");
      idade = leitor.nextInt();

      if(idade >= 5 && idade <= 7){
        System.out.println("A sua categoria é infantilA");
      } else if(idade >= 8 && idade <= 10) {
        System.out.println("A sua categoria é infantilB");
      } else if(idade >= 11 && idade <= 13) {
        System.out.println("A sua categoria é juvenilA");
      } else if(idade >= 14 && idade <= 17) {
        System.out.println("A sua categoria é juvenilB");
      } else if(idade >= 18) {
        System.out.println("A sua categoria é Sênior");
      } else {
        System.out.println("Você está abaixo da idade miníma");
      }
      */

      /*Exercicio 13
      float[] num = new float[2];
      char opcao;

      System.out.println("Digite o primeiro número: ");
      num[0] = leitor.nextFloat();
      System.out.println("Digite o segundo número: ");
      num[1] = leitor.nextFloat();

      System.out.println("Digite a letra da opção escolhida(média = M, diferença = S, produto = P e divisão = D)");
      opcao = leitor.next().charAt(0);

      switch(opcao) {
        case 'M':
          System.out.println((num[0] + num[1]) / 2);
          break;
        case 'S':
          if(num[0] >= num[1]){
            System.out.println(num[0] - num[1]);
          } else {
            System.out.println(num[1] - num[0]);
          }
          break;
        case 'P':
          System.out.println(num[0] * num[1]);
          break;
        case 'D':
          System.out.println(num[0] / num[1]);
          break;
      }
      */

      /*Exercicio 14
      float num;

      System.out.println("Digite o número: ");
      num = leitor.nextFloat();

      System.out.println(Math.pow(num, 2));
      System.out.println(Math.pow(num, (1.0/3.0)));
      System.out.println(Math.sqrt(num));
      System.out.println(Math.pow(num, 10));
      */

      /*Exercicio 15
      float salario;

      System.out.println("Digite o seu salário: ");
      salario = leitor.nextFloat();

      if(salario <= 600) {
        System.out.println("Você está isento de desconto");
      } else if (salario > 600 && salario <= 1200) {
        System.out.println("Será descontado " + salario * 0.2);
      } else if (salario > 1200 && salario <= 2000) {
        System.out.println("Será descontado " + salario * 0.25);
      } else {
        System.out.println("Será descontado " + salario * 0.3);
        }
      */

      /*Exercicio 16
      float num[] = new float[2];
      char sinal;

      System.out.println("Digite o primeiro número: ");
      num[0] = leitor.nextFloat();
      System.out.println("Digite o segundo número: ");    
      num[1] = leitor.nextFloat();
      System.out.println("Digite o sinal da operação a ser realizada:");
      sinal = leitor.next().charAt(0);

      switch(sinal) {
        case '+':
          System.out.println(num[0] + num[1]);
          break;
        case '-':
          System.out.println(num[0] - num[1]);
          break;
        case '/':
          if(num[1] <= 0){
            System.out.println("Impossível dividir")
            break;
          }
          System.out.println(num[0] / num[1]);
          break;
        case '*':
          System.out.println(num[0] * num[1]);
          break;
        default:
          System.out.println("Sinal Inválido");
          break;
      }
      */

      /*Exercicio 17
      int codigo;
      int quantidade;

      System.out.println("Digite o código do produto: ");
      codigo = leitor.nextInt();
      System.out.println("Digite a quantidade: ");
      quantidade = leitor.nextInt();

      switch(codigo) {
        case 100:
          System.out.println("Valor a ser pago pelo cachorro quente R$" + 1.20 * quantidade);
        break;
        case 101:
          System.out.println("Valor a ser pago pelo Bauru simple R$" + 1.30 * quantidade);
        break;
        case 102:
          System.out.println("Valor a ser pago pelo Bauru com ovo R$" + 1.50 * quantidade);
        break;
        case 103:
          System.out.println("Valor a ser pago pelo Hambúrguer R$" + 1.20 * quantidade);
        break;
        case 104:
          System.out.println("Valor a ser pago pelo cheeseburguer R$" + 1.30 * quantidade);
        break;
        case 105:
          System.out.println("Valor a ser pago pelo refrigerante R$" + quantidade + ",00");
        break;
      }
      */
      

    leitor.close(); 
    }
}