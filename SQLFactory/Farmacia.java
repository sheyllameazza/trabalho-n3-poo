public class Farmacia extends SQLClass {

    @Key
    int id;

    String nome;
    String cnpj;
    String fone;
    String endereco;

    Farmacia() {
        this.setTableName("farmacia");
    }

    public void printObject() {
        System.out.println(
                this.nome + ", " +
                        this.cnpj + ", " +
                        this.fone + ", " +
                        this.endereco

        );
    }
}
