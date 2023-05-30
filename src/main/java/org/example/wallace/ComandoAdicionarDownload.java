package org.example.wallace;

// Comando para adicionar um download
class ComandoAdicionarDownload implements Comando {
    private GerenciadorDownload gerenciadorDownload;
    private String url;

    public ComandoAdicionarDownload(GerenciadorDownload gerenciadorDownload, String url) {
        this.gerenciadorDownload = gerenciadorDownload;
        this.url = url;
    }

    public void executar() {
        gerenciadorDownload.adicionarDownload(url);
    }
}
