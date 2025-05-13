
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(500, 10000);

        Cliente c1 = new Cliente("jose", 123);
        Cliente c2 = new Cliente("maria", 456);
        Cliente c3 = null;

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostrainfo();

        System.out.println("Terminou o processo");
    }
}