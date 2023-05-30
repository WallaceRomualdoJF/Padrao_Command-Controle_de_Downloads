package org.example.wallace;

// Comando para retomar um download
class ComandoRetomarDownload implements Comando {
    private GerenciadorDownload gerenciadorDownload;
    private int idDownload;

    public ComandoRetomarDownload(GerenciadorDownload gerenciadorDownload, int idDownload) {
        this.gerenciadorDownload = gerenciadorDownload;
        this.idDownload = idDownload;
    }

    public void executar() {
        gerenciadorDownload.retomarDownload(idDownload);
    }
}
