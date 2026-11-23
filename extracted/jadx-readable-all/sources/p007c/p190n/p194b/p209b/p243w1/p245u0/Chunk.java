package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.e, reason: use source file name */
/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Chunk implements Loader.e {

    /* JADX INFO: renamed from: a */
    public final long f9109a;

    /* JADX INFO: renamed from: b */
    public final DataSpec f9110b;

    /* JADX INFO: renamed from: c */
    public final int f9111c;

    /* JADX INFO: renamed from: d */
    public final Format f9112d;

    /* JADX INFO: renamed from: e */
    public final int f9113e;

    /* JADX INFO: renamed from: f */
    public final Object f9114f;

    /* JADX INFO: renamed from: g */
    public final long f9115g;

    /* JADX INFO: renamed from: h */
    public final long f9116h;

    /* JADX INFO: renamed from: i */
    public final StatsDataSource f9117i;

    public Chunk(DataSource3 dataSource3, DataSpec dataSpec, int i, Format format, int i2, Object obj, long j2, long j3) {
        this.f9117i = new StatsDataSource(dataSource3);
        Objects.requireNonNull(dataSpec);
        this.f9110b = dataSpec;
        this.f9111c = i;
        this.f9112d = format;
        this.f9113e = i2;
        this.f9114f = obj;
        this.f9115g = j2;
        this.f9116h = j3;
        this.f9109a = LoadEventInfo.m4367a();
    }
}
