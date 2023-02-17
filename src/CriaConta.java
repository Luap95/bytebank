public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Lucas";
        primeiraConta.saldo = 200.00;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 300.00;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.titular = "Fabíola";
        segundaConta.saldo = 50.00;

        System.out.println("O saldo da conta do(a) " + primeiraConta.titular + " é de R$" + primeiraConta.saldo);
        System.out.println("O saldo da conta do(a) " + segundaConta.titular + " é de R$" + segundaConta.saldo);
    }
}
