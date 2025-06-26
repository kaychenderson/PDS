// Cenário: Uma aplicação de geração de documentos precisa permitir que os usuários escolham entre diferentes formatos de 
// exportação (PDF, DOCX, HTML).

// Questão 1-B) Estenda a solução para permitir a adição futura de novos formatos sem alterar o código cliente.

public class ExportadorMarkdown implements ExportadorDocumento {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando como Markdown: " + conteudo);
    }
}
