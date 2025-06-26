// Cenário: Um sistema de análise de dados precisa executar rotinas similares de pré-processamento, processamento e 
// pós-processamento, variando apenas o núcleo de processamento.

// Questão 2-A) Crie um diagrama UML e uma implementação que demonstre o uso do Template Method.

package Q2_TemplateMethod;

public abstract class AnaliseDados {
    public final void executar() {
        preProcessar();
        processar();
        posProcessar();
    }

    protected void preProcessar() {
        System.out.println("Pré-processando os dados...");
    }

    protected abstract void processar(); // método a ser definido nas subclasses

    protected void posProcessar() {
        System.out.println("Pós-processamento dos resultados...");
    }
}

