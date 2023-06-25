public class Clientes extends SQLClass {

    @Key
    int id;

    String nome;
    String cpf;
    String fone;
    String endereco;
    String problema;
    String interesse;

    Clientes() {
        this.setTableName("clientes");
    }

    public void printObject() {
        System.out.println(
                this.nome + ", " +
                        this.cpf + ", " +
                        this.fone + ", " +
                        this.endereco + ", " +
                        this.problema + ", " +
                        this.interesse);
    }

}
