package org.example.wallace;

// Comando para cancelar um download
class ComandoCancelarDownload implements Comando {
    private GerenciadorDownload gerenciadorDownload;
    private int idDownload;

    public ComandoCancelarDownload(GerenciadorDownload gerenciadorDownload, int idDownload) {
        this.gerenciadorDownload = gerenciadorDownload;
        this.idDownload = idDownload;
    }

    public void executar() {
        gerenciadorDownload.cancelarDownload(idDownload);
    }
}
