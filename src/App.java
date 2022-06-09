import java.util.ArrayList;
import java.util.List;

import br.com.desafio.bancodigital.models.Banco;
import br.com.desafio.bancodigital.models.Cliente;
import br.com.desafio.bancodigital.models.Conta;
import br.com.desafio.bancodigital.models.ContaCorrente;
import br.com.desafio.bancodigital.models.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Banco bancoRD = new Banco("Banco RD");


        Cliente cliente1 = new Cliente(1, "Rodrigo", "000.000.000-00");
        Cliente cliente2 = new Cliente(2, "Maira", "111.111.111-11");

        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);

        List<Conta> contasBanco = new  ArrayList<Conta>(){{
            add(cc);
            add(cp);
        }};

        cc.depositar(1000.00);
        cc.transferir(200, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cp.sacar(500d);

        
        bancoRD.setContas(contasBanco);
        System.out.println(bancoRD.toString());

        
        
        

    }
}
