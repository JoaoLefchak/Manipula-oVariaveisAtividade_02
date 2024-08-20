//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "João Gabriel";
        int idade = 22;
        int salarioMensal = 5000;
        int mesesTrabalhados = 12;
        int quantidadeProdutos = 5;
        int valorProduto1 = 10;
        int descontos = 100;

    ///Operações///


        double multiplicacao = salarioMensal*mesesTrabalhados;
        double subtracao = salarioMensal-descontos;
        int total = quantidadeProdutos * valorProduto1 / quantidadeProdutos;
        double total2 = subtracao*mesesTrabalhados;

    ///Declarações de resultados////

        System.out.println("Minha idade é: " + idade);
        System.out.println("Meu salário Mensal é: " + salarioMensal);
        System.out.println("Sálario liquido: " + subtracao);
        System.out.println("Meses trabalhados do ano: " + mesesTrabalhados);
        System.out.println("Salário anual bruto: " + multiplicacao);
        System.out.println("Produtos consumidos: " + quantidadeProdutos);
        System.out.println("Valor médio por produto: " + total);
        System.out.println("Eu sou; " + nome + " Meu salário anual liguido é: " + total2);




    }
}