public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario gabriel = new Funcionario();
        gabriel.setNome("Gabriel Loureiro");
        gabriel.setCpf("000.000.000-00");
        gabriel.setSalario(3000);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getBonificacao());
    }

}
