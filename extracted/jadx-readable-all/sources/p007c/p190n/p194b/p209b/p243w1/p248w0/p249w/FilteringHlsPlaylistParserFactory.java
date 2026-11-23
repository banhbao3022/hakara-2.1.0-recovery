package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import java.util.List;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p242v1.FilteringManifestParser;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.e, reason: use source file name */
/* JADX INFO: compiled from: FilteringHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class FilteringHlsPlaylistParserFactory implements HlsPlaylistParserFactory {

    /* JADX INFO: renamed from: a */
    public final HlsPlaylistParserFactory f9550a;

    /* JADX INFO: renamed from: b */
    public final List<StreamKey> f9551b;

    public FilteringHlsPlaylistParserFactory(HlsPlaylistParserFactory hlsPlaylistParserFactory, List<StreamKey> list) {
        this.f9550a = hlsPlaylistParserFactory;
        this.f9551b = list;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory
    /* JADX INFO: renamed from: a */
    public ParsingLoadable.a<HlsPlaylist> mo4332a(HlsMasterPlaylist hlsMasterPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        return new FilteringManifestParser(this.f9550a.mo4332a(hlsMasterPlaylist, hlsMediaPlaylist), this.f9551b);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistParserFactory
    /* JADX INFO: renamed from: b */
    public ParsingLoadable.a<HlsPlaylist> mo4333b() {
        return new FilteringManifestParser(this.f9550a.mo4333b(), this.f9551b);
    }
}
