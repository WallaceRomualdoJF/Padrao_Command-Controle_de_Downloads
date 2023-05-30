package org.example.wallace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Gerenciador de downloads
public class GerenciadorDownload {
    private List<String> downloads;
    private Map<Integer, Boolean> downloadPausado;

    public GerenciadorDownload() {
        this.downloads = new ArrayList<>();
        this.downloadPausado = new HashMap<>();
    }

    public void adicionarDownload(String url) {
        downloads.add(url);
        int idDownload = downloads.size();
        downloadPausado.put(idDownload, false);
    }

    public void pausarDownload(int idDownload) {
        if (downloadPausado.containsKey(idDownload)) {
            downloadPausado.put(idDownload, true);
        } else {
            throw new IllegalArgumentException("Download não encontrado: " + idDownload);
        }
    }

    public void retomarDownload(int idDownload) {
        if (downloadPausado.containsKey(idDownload)) {
            downloadPausado.put(idDownload, false);
        } else {
            throw new IllegalArgumentException("Download não encontrado: " + idDownload);
        }
    }

    public void cancelarDownload(int idDownload) {
        if (downloadPausado.containsKey(idDownload)) {
            downloads.remove(idDownload - 1);
            downloadPausado.remove(idDownload);
        } else {
            throw new IllegalArgumentException("Download não encontrado: " + idDownload);
        }
    }

    public int getQuantidadeDownloads() {
        return downloads.size();
    }

    public boolean isDownloadPausado(int idDownload) {
        if (downloadPausado.containsKey(idDownload)) {
            return downloadPausado.get(idDownload);
        }
        return false;
    }
}