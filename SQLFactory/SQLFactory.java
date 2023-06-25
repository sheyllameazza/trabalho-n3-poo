import java.lang.management.MonitorInfo;

public class SQLFactory {
  public static void main(String[] args) {
    Medicamentos medicamentos = new Medicamentos();

    medicamentos.id = 1;
    medicamentos.nome = "Paracetamol";
    medicamentos.fabricante = "EMS Farmacêutica";
    medicamentos.fornecedor = "EMS Farmacêutica";
    medicamentos.fabricacao = "05/09/2022";
    medicamentos.validade = "05/09/2023";
    medicamentos.lote = 324198;

    medicamentos.printObject();

    Farmacia farmacia = new Farmacia();

    farmacia.id = 1;
    farmacia.nome = "Farmacia Saude";
    farmacia.cnpj = "12.345.678/0001-00";
    farmacia.fone = "(66) 3515-5052";
    farmacia.endereco = "Bairro toscana rua das flores 1544";

    Clientes clientes = new Clientes();

    clientes.id = 1;
    clientes.nome = "Rafaela";
    clientes.cpf = "987.654.321-11";
    clientes.fone = "(66) 99876-5432";
    clientes.endereco = "Rua das Pedras, 789, Bairro Bom Fim";
    clientes.problema = "dor de cabeca";
    clientes.interesse = "Dipirona";

    // CRUD

    // Database.inserirRegistro(medicamentos);

    // Database.atualizarRegistro(clientes);

    // Database.deletarRegistro(clientes);

    // Database.abrirID(medicamentos, 1);
    // medicamentos.printObject();

  }
}
