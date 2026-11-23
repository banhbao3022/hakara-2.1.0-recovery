package p007c.p190n.p194b.p209b.p243w1.p245u0;

import java.io.IOException;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.k, reason: use source file name */
/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataChunk extends Chunk {

    /* JADX INFO: renamed from: j */
    public byte[] f9154j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f9155k;

    public DataChunk(DataSource3 dataSource3, DataSpec dataSpec, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(dataSource3, dataSpec, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9154j = bArr == null ? Util6.f6312f : bArr;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public final void mo2909a() throws IOException {
        try {
            this.f9117i.mo2913h(this.f9110b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f9155k) {
                byte[] bArr = this.f9154j;
                if (bArr.length < i2 + 16384) {
                    this.f9154j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f9117i.read(this.f9154j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f9155k) {
                mo4223c(this.f9154j, i2);
            }
        } finally {
            StatsDataSource statsDataSource = this.f9117i;
            int i3 = Util6.f6307a;
            if (statsDataSource != null) {
                try {
                    statsDataSource.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public final void mo2910b() {
        this.f9155k = true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4223c(byte[] bArr, int i) throws IOException;
}
