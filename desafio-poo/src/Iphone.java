public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.selecionarMusica("música favorita");
        iphone.ligar("12345678");
        iphone.exibirPagina("www.arroz.com.br");
    }
    public void tocar() {
        System.out.println("tocando música... ");
    }    
    public void pausar() {
        System.err.println("pausando música...");
    }
    public void selecionarMusica(String musica) {
        System.err.println("selecionando música: " + musica);
    }
    public void ligar(String numero) {
        System.out.println("ligando para o número: " + numero);
    }
    public void atender() {
        System.out.println("atendendo chamada.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz.");
    }
    public void exibirPagina(String url) {
        System.out.println("exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba.");
    }
    public void atualizarPagina() {
        System.err.println("atualizando página.");
    }
}
