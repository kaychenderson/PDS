// Cenário: Uma aplicação de geração de documentos precisa permitir que os usuários escolham entre diferentes formatos de 
// exportação (PDF, DOCX, HTML).

// Questão 1-A) Modele o padrão Factory Method para encapsular a criação de exportadores de documentos.

public class ExportadorHTML implements ExportadorDocumento {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando como HTML: " + conteudo);
    }
}
