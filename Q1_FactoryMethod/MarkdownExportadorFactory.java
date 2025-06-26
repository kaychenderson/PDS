// Cenário: Uma aplicação de geração de documentos precisa permitir que os usuários escolham entre diferentes formatos de 
// exportação (PDF, DOCX, HTML).

// Questão 1-B) Estenda a solução para permitir a adição futura de novos formatos sem alterar o código cliente.

public class MarkdownExportadorFactory extends ExportadorFactory {
    public ExportadorDocumento criarExportador() {
        return new ExportadorMarkdown();
    }
}
