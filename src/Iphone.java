
import interfaces.AparelhoTelefonico;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    // Implementação da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz...");
    }

    // Implementação da interface Navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma Página da Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo Aba no Navegador da Internet...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma Página no Navegador da Internet ...");
    }

    // Implementação da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando uma Música no Reprodutor...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma Música no Reprodutor...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma Música no Reprodutor...");
    }
}

// Método main para testar todos os métodos
public static void main(String[] args) {
    iPhone iphone = new iPhone();

    // Testando os métodos da interface AparelhoTelefonico
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();

    // Testando os métodos da interface Navegador
    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    // Testando os métodos da interface ReprodutorMusical
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();
}