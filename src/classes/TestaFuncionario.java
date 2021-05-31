package classes;

public class TestaFuncionario {

    public static void main(String[] args) {
        Gerente gabriel = new Gerente();
        gabriel.setNome("Gabriel");
        gabriel.setCpf("223355646-9");
        gabriel.setSalario(2600.00);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getBonificacao());
    }
}
