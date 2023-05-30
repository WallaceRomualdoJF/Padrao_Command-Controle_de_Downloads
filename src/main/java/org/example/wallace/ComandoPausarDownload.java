package org.example.wallace;

// Comando para pausar um download
class ComandoPausarDownload implements Comando {
    private GerenciadorDownload gerenciadorDownload;
    private int idDownload;

    public ComandoPausarDownload(GerenciadorDownload gerenciadorDownload, int idDownload) {
        this.gerenciadorDownload = gerenciadorDownload;
        this.idDownload = idDownload;
    }

    public void executar() {
        gerenciadorDownload.pausarDownload(idDownload);
    }
}
