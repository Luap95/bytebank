public class CriaConta {
    public static void main(String[] args) {
        Conta conta = new Conta(1016, 16854);

        //cadastro do titular da conta
        conta.getTitular().setNome("Michael Jackson");
        conta.getTitular().setCpf("12345678900");
        conta.getTitular().setProfissao("Cantor");

        Conta conta2 = new Conta(1016, 55446);

        //cadastro do titular da conta2
        conta2.getTitular().setNome("Billie Jean");
        conta2.getTitular().setCpf("00011874166");
        conta2.getTitular().setProfissao("Dançarina");

        //movimentações
        System.out.println("O saldo da conta de " + conta.getTitular().getNome()+ " é de R$" + conta.getSaldo());
        System.out.println("O saldo da conta de " + conta2.getTitular().getNome()+ " é de R$" + conta2.getSaldo());

        conta.deposita(100.00);
        conta2.deposita(200.00);

        System.out.println("O saldo da conta de " + conta.getTitular().getNome()+ " é de R$" + conta.getSaldo());
        System.out.println("O saldo da conta de " + conta2.getTitular().getNome()+ " é de R$" + conta2.getSaldo());

        conta.saca(50.00);
        conta2.saca(50.00);

        System.out.println("O saldo da conta de " + conta.getTitular().getNome()+ " é de R$" + conta.getSaldo());
        System.out.println("O saldo da conta de " + conta2.getTitular().getNome()+ " é de R$" + conta2.getSaldo());

        //Michael tranfere dinheiro da pensão para Billie Jean
        conta.transfere(100.00, conta2);

        System.out.println("O saldo da conta de " + conta.getTitular().getNome()+ " é de R$" + conta.getSaldo());
        System.out.println("O saldo da conta de " + conta2.getTitular().getNome()+ " é de R$" + conta2.getSaldo());

        System.out.println("O numero de contas ativas é: " + Conta.getTotalContas());
    }
}
