// Cenário: Uma aplicação de geração de documentos precisa permitir que os usuários escolham entre diferentes formatos de 
// exportação (PDF, DOCX, HTML).

public class ExportadorPDF implements ExportadorDocumento {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando como PDF: " + conteudo);
    }
}
