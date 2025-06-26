// Cenário: Uma aplicação de geração de documentos precisa permitir que os usuários escolham entre diferentes formatos de 
// exportação (PDF, DOCX, HTML).

// Questão 1-A) Modele o padrão Factory Method para encapsular a criação de exportadores de documentos.

public class HTMLExportadorFactory extends ExportadorFactory {
    public ExportadorDocumento criarExportador() {
        return new ExportadorHTML();
    }
}
