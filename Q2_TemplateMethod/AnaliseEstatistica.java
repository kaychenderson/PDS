// Cenário: Um sistema de análise de dados precisa executar rotinas similares de pré-processamento, processamento e 
// pós-processamento, variando apenas o núcleo de processamento.

// Questão 2-A) Crie um diagrama UML e uma implementação que demonstre o uso do Template Method.

package Q2_TemplateMethod;

public class AnaliseEstatistica extends AnaliseDados {
    @Override
    protected void processar() {
        System.out.println("Processando dados estatísticos...");
    }
}

