package com.ghostchu.peerbanhelper.downloader.impl.deluge;

import com.ghostchu.peerbanhelper.bittorrent.peer.Peer;
import com.ghostchu.peerbanhelper.bittorrent.torrent.Torrent;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public final class DelugeTorrent implements Torrent {
    private String id;
    private String name;
    private String hash;
    private double progress;
    private long size;
    private long completedSize;
    private long rtUploadSpeed;
    private long rtDownloadSpeed;
    private List<Peer> peers;
    private boolean privateTorrent;

    @Override
    public boolean isPrivate() {
        return privateTorrent;
    }
}
