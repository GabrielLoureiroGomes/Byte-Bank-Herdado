public class TestaGerente {

    public static void main(String[] args) {
        Gerente jessica = new Gerente();
        jessica.setNome("Jessica Rizerio");
        jessica.setCpf("333.333.333-33");
        jessica.setSalario(8000);
        jessica.setSenha(2107);

        System.out.println(jessica.getNome());
        System.out.println(jessica.getCpf());
        System.out.println(jessica.getSalario());

        boolean autenticou = jessica.autentica(2107);
        System.out.println(autenticou);
    }

}
