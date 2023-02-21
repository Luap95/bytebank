public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.titular = "Lucas";
        primeiraConta.deposita(200);

        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(300);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta();
        segundaConta.titular = "Fabíola";
        segundaConta.deposita(50);

        System.out.println("O saldo da conta do(a) " + primeiraConta.titular + " é de R$" + primeiraConta.getSaldo());
        System.out.println("O saldo da conta do(a) " + segundaConta.titular + " é de R$" + segundaConta.getSaldo());

        primeiraConta.transfere(100, segundaConta);

        System.out.println("O saldo da conta do(a) " + primeiraConta.titular + " é de R$" + primeiraConta.getSaldo());
        System.out.println("O saldo da conta do(a) " + segundaConta.titular + " é de R$" + segundaConta.getSaldo());
    }
}
