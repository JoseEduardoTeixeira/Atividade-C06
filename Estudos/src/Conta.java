import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.HashSet;

public class Conta {
    
    private double saldo;
    private double limite;
    private HashSet<Cliente> clientes = new HashSet<Cliente>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void mostrainfo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println();

        for(Cliente cliente : clientes){
            try {
                System.out.println("Nome :" + cliente.nome);
                System.out.println("CPF: " + cliente.cpf);
            } catch (NullPointerException e){
                System.out.println("Erro: " + e);
            }
        }
    }
}
