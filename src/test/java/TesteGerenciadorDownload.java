import org.example.wallace.GerenciadorDownload;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteGerenciadorDownload {

    @Test
    public void testAdicionarDownload() {
        GerenciadorDownload gerenciador = new GerenciadorDownload();
        gerenciador.adicionarDownload("http://exemplo.com/arquivo1");
        int quantidadeDownloads = gerenciador.getQuantidadeDownloads();
        Assertions.assertEquals(1, quantidadeDownloads);
    }

    @Test
    public void testPausarDownload() {
        GerenciadorDownload gerenciador = new GerenciadorDownload();
        gerenciador.adicionarDownload("http://exemplo.com/arquivo1");
        gerenciador.pausarDownload(1);
        boolean downloadPausado = gerenciador.isDownloadPausado(1);
        Assertions.assertTrue(downloadPausado);
    }

    @Test
    public void testRetomarDownload() {
        GerenciadorDownload gerenciador = new GerenciadorDownload();
        gerenciador.adicionarDownload("http://exemplo.com/arquivo1");
        gerenciador.pausarDownload(1);
        gerenciador.retomarDownload(1);
        boolean downloadPausado = gerenciador.isDownloadPausado(1);
        Assertions.assertFalse(downloadPausado);
    }

    @Test
    public void testCancelarDownload() {
        GerenciadorDownload gerenciador = new GerenciadorDownload();
        gerenciador.adicionarDownload("http://exemplo.com/arquivo1");
        gerenciador.cancelarDownload(1);
        int quantidadeDownloads = gerenciador.getQuantidadeDownloads();
        Assertions.assertEquals(0, quantidadeDownloads);
    }
}
