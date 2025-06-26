// Cenário: Um sistema de análise de dados precisa executar rotinas similares de pré-processamento, processamento e 
// pós-processamento, variando apenas o núcleo de processamento.

// Questão 2-A) Crie um diagrama UML e uma implementação que demonstre o uso do Template Method.

package Q2_TemplateMethod;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        System.out.println("Teste do padrão Template Method");
        System.out.println("====================================");
        System.out.println("Analise Estatística:");
        AnaliseDados analise1 = new AnaliseEstatistica();
        analise1.executar();

        System.out.println("\nAnalise Financeira:");
        AnaliseDados analise2 = new AnaliseFinanceira();
        analise2.executar();

        System.out.println("\nAnalise Climática:");
        AnaliseDados analise3 = new AnaliseClimatica();
        analise3.executar();
    }
}

