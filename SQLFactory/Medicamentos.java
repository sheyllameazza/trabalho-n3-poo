public class Medicamentos extends SQLClass {

    @Key
    int id;

    String nome;
    String fabricante;
    String fornecedor;
    String fabricacao;
    String validade;
    double lote;

    Medicamentos() {
        this.setTableName("medicamentos");
    }

    public void printObject() {
        System.out.println(
                this.nome + ", " +
                        this.fabricante + ", " +
                        this.fornecedor + ", " +
                        this.fabricacao + ", " +
                        this.validade + ", " +
                        this.lote);
    }
}