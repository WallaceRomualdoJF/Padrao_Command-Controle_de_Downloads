package org.example.wallace;

public class Principal {
    public static void main(String[] args) {
        // Criando o objeto do gerenciador de downloads
        GerenciadorDownload gerenciadorDownload = new GerenciadorDownload();

        // Criando os comandos
        Comando comandoAdicionar = new ComandoAdicionarDownload(gerenciadorDownload, "http://exemplo.com/wallace1");
        Comando comandoPausar = new ComandoPausarDownload(gerenciadorDownload, 1);
        Comando comandoRetomar = new ComandoRetomarDownload(gerenciadorDownload, 2);
        Comando comandoCancelar = new ComandoCancelarDownload(gerenciadorDownload, 3);

        // Executando os comandos
        comandoAdicionar.executar();
        comandoPausar.executar();
        comandoRetomar.executar();
        comandoCancelar.executar();
    }
}
