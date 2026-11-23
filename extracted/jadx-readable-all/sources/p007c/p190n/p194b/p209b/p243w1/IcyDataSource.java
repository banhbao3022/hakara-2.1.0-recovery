package p007c.p190n.p194b.p209b.p243w1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.w, reason: use source file name */
/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class IcyDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final DataSource3 f9337a;

    /* JADX INFO: renamed from: b */
    public final int f9338b;

    /* JADX INFO: renamed from: c */
    public final a f9339c;

    /* JADX INFO: renamed from: d */
    public final byte[] f9340d;

    /* JADX INFO: renamed from: e */
    public int f9341e;

    /* JADX INFO: renamed from: c.n.b.b.w1.w$a */
    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
    }

    public IcyDataSource(DataSource3 dataSource3, int i, a aVar) {
        C2096e.m4566b(i > 0);
        this.f9337a = dataSource3;
        this.f9338b = i;
        this.f9339c = aVar;
        this.f9340d = new byte[1];
        this.f9341e = i;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f9337a.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        return this.f9337a.mo2916j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f9337a.mo2914n();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long jMax;
        if (this.f9341e == 0) {
            boolean z = true;
            if (this.f9337a.read(this.f9340d, 0, 1) == -1) {
                z = false;
                break;
            }
            int i3 = (this.f9340d[0] & 255) << 4;
            if (i3 != 0) {
                byte[] bArr2 = new byte[i3];
                int i4 = i3;
                int i5 = 0;
                while (true) {
                    if (i4 <= 0) {
                        while (i3 > 0) {
                            int i6 = i3 - 1;
                            if (bArr2[i6] != 0) {
                                break;
                            }
                            i3 = i6;
                        }
                        if (i3 <= 0) {
                            break;
                        }
                        a aVar = this.f9339c;
                        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr2, i3);
                        ProgressiveMediaPeriod.a aVar2 = (ProgressiveMediaPeriod.a) aVar;
                        if (aVar2.f8939n) {
                            ProgressiveMediaPeriod progressiveMediaPeriod = ProgressiveMediaPeriod.this;
                            Map<String, String> map = ProgressiveMediaPeriod.f8886f;
                            jMax = Math.max(progressiveMediaPeriod.m4124x(), aVar2.f8935j);
                        } else {
                            jMax = aVar2.f8935j;
                        }
                        int iM3196a = parsableByteArray.m3196a();
                        TrackOutput2 trackOutput2 = aVar2.f8938m;
                        Objects.requireNonNull(trackOutput2);
                        trackOutput2.mo3758c(parsableByteArray, iM3196a);
                        trackOutput2.mo3759d(jMax, 1, iM3196a, 0, null);
                        aVar2.f8939n = true;
                        break;
                    }
                    int i7 = this.f9337a.read(bArr2, i5, i4);
                    if (i7 == -1) {
                        z = false;
                        break;
                    }
                    i5 += i7;
                    i4 -= i7;
                }
            }
            if (!z) {
                return -1;
            }
            this.f9341e = this.f9338b;
        }
        int i8 = this.f9337a.read(bArr, i, Math.min(this.f9341e, i2));
        if (i8 != -1) {
            this.f9341e -= i8;
        }
        return i8;
    }
}
