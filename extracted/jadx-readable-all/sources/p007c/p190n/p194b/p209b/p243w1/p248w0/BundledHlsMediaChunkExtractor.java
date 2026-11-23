package p007c.p190n.p194b.p209b.p243w1.p248w0;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.f, reason: use source file name */
/* JADX INFO: compiled from: BundledHlsMediaChunkExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class BundledHlsMediaChunkExtractor implements HlsMediaChunkExtractor {

    /* JADX INFO: renamed from: a */
    public static final PositionHolder f9350a = new PositionHolder();

    /* JADX INFO: renamed from: b */
    public final Extractor f9351b;

    /* JADX INFO: renamed from: c */
    public final Format f9352c;

    /* JADX INFO: renamed from: d */
    public final TimestampAdjuster f9353d;

    public BundledHlsMediaChunkExtractor(Extractor extractor, Format format, TimestampAdjuster timestampAdjuster) {
        this.f9351b = extractor;
        this.f9352c = format;
        this.f9353d = timestampAdjuster;
    }
}
