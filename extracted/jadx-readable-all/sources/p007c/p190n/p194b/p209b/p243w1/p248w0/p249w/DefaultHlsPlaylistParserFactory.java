package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.c, reason: use source file name */
/* JADX INFO: compiled from: DefaultHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistParserFactory implements HlsPlaylistParserFactory {
    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory
    /* JADX INFO: renamed from: a */
    public ParsingLoadable.a<HlsPlaylist> mo4332a(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        return new HlsPlaylistParser(hlsMasterPlaylist, hlsMediaPlaylist);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory
    /* JADX INFO: renamed from: b */
    public ParsingLoadable.a<HlsPlaylist> mo4333b() {
        return new HlsPlaylistParser();
    }
}
