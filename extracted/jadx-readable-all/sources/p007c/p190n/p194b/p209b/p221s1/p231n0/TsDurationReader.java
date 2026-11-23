package p007c.p190n.p194b.p209b.p221s1.p231n0;

import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.g0, reason: use source file name */
/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class TsDurationReader {

    /* JADX INFO: renamed from: a */
    public final int f8151a;

    /* JADX INFO: renamed from: d */
    public boolean f8154d;

    /* JADX INFO: renamed from: e */
    public boolean f8155e;

    /* JADX INFO: renamed from: f */
    public boolean f8156f;

    /* JADX INFO: renamed from: b */
    public final TimestampAdjuster f8152b = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: g */
    public long f8157g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f8158h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f8159i = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f8153c = new ParsableByteArray();

    public TsDurationReader(int i) {
        this.f8151a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m3875a(ExtractorInput extractorInput) {
        this.f8153c.m3191A(Util6.f6312f);
        this.f8154d = true;
        extractorInput.mo3736k();
        return 0;
    }
}
