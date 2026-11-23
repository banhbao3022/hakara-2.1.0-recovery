package p007c.p190n.p194b.p209b.p243w1.p248w0;

import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.q, reason: use source file name */
/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsSampleStream implements SampleStream {

    /* JADX INFO: renamed from: f */
    public final int f9439f;

    /* JADX INFO: renamed from: g */
    public final HlsSampleStreamWrapper f9440g;

    /* JADX INFO: renamed from: h */
    public int f9441h = -1;

    public HlsSampleStream(HlsSampleStreamWrapper hlsSampleStreamWrapper, int i) {
        this.f9440g = hlsSampleStreamWrapper;
        this.f9439f = i;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: a */
    public void mo4128a() throws IOException {
        int i = this.f9441h;
        if (i == -2) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9440g;
            hlsSampleStreamWrapper.m4328v();
            TrackGroupArray trackGroupArray = hlsSampleStreamWrapper.f9456N;
            throw new SampleQueueMappingException(trackGroupArray.f9069h[this.f9439f].f9065g[0].f6934q);
        }
        if (i == -1) {
            this.f9440g.m4323E();
        } else if (i != -3) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper2 = this.f9440g;
            hlsSampleStreamWrapper2.m4323E();
            hlsSampleStreamWrapper2.f9443A[i].m4173x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX INFO: renamed from: b */
    public void m4315b() {
        C2096e.m4566b(this.f9441h == -1);
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9440g;
        int i = this.f9439f;
        hlsSampleStreamWrapper.m4328v();
        Objects.requireNonNull(hlsSampleStreamWrapper.f9458P);
        int i2 = hlsSampleStreamWrapper.f9458P[i];
        if (i2 != -1) {
            boolean[] zArr = hlsSampleStreamWrapper.f9461S;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (hlsSampleStreamWrapper.f9457O.contains(hlsSampleStreamWrapper.f9456N.f9069h[i])) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.f9441h = i2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: c */
    public boolean mo4129c() {
        if (this.f9441h != -3) {
            if (!m4316d()) {
                return false;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9440g;
            if (!(!hlsSampleStreamWrapper.m4321C() && hlsSampleStreamWrapper.f9443A[this.f9441h].m4171v(hlsSampleStreamWrapper.f9467Y))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4316d() {
        int i = this.f9441h;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: j */
    public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        Format format;
        if (this.f9441h == -3) {
            decoderInputBuffer.m3624m(4);
            return -4;
        }
        if (!m4316d()) {
            return -3;
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9440g;
        int i = this.f9441h;
        if (hlsSampleStreamWrapper.m4321C()) {
            return -3;
        }
        int i2 = 0;
        if (!hlsSampleStreamWrapper.f9484s.isEmpty()) {
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= hlsSampleStreamWrapper.f9484s.size() - 1) {
                    break;
                }
                int i4 = hlsSampleStreamWrapper.f9484s.get(i3).f9402l;
                int length = hlsSampleStreamWrapper.f9443A.length;
                for (int i5 = 0; i5 < length; i5++) {
                    if (hlsSampleStreamWrapper.f9461S[i5] && hlsSampleStreamWrapper.f9443A[i5].m4175z() == i4) {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    break;
                }
                i3++;
            }
            Util6.m3103L(hlsSampleStreamWrapper.f9484s, 0, i3);
            HlsMediaChunk hlsMediaChunk = hlsSampleStreamWrapper.f9484s.get(0);
            Format format2 = hlsMediaChunk.f9112d;
            if (!format2.equals(hlsSampleStreamWrapper.f9454L)) {
                hlsSampleStreamWrapper.f9481p.m4099b(hlsSampleStreamWrapper.f9472g, format2, hlsMediaChunk.f9113e, hlsMediaChunk.f9114f, hlsMediaChunk.f9115g);
            }
            hlsSampleStreamWrapper.f9454L = format2;
        }
        if (!hlsSampleStreamWrapper.f9484s.isEmpty() && !hlsSampleStreamWrapper.f9484s.get(0).f9401L) {
            return -3;
        }
        int iM4149B = hlsSampleStreamWrapper.f9443A[i].m4149B(formatHolder, decoderInputBuffer, z, hlsSampleStreamWrapper.f9467Y);
        if (iM4149B == -5) {
            Format formatM3518e = formatHolder.f7259b;
            Objects.requireNonNull(formatM3518e);
            if (i == hlsSampleStreamWrapper.f9449G) {
                int iM4175z = hlsSampleStreamWrapper.f9443A[i].m4175z();
                while (i2 < hlsSampleStreamWrapper.f9484s.size() && hlsSampleStreamWrapper.f9484s.get(i2).f9402l != iM4175z) {
                    i2++;
                }
                if (i2 < hlsSampleStreamWrapper.f9484s.size()) {
                    format = hlsSampleStreamWrapper.f9484s.get(i2).f9112d;
                } else {
                    format = hlsSampleStreamWrapper.f9453K;
                    Objects.requireNonNull(format);
                }
                formatM3518e = formatM3518e.m3518e(format);
            }
            formatHolder.f7259b = formatM3518e;
        }
        return iM4149B;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: o */
    public int mo4131o(long j2) {
        if (!m4316d()) {
            return 0;
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9440g;
        int i = this.f9441h;
        if (hlsSampleStreamWrapper.m4321C()) {
            return 0;
        }
        HlsSampleStreamWrapper.d dVar = hlsSampleStreamWrapper.f9443A[i];
        int iM4167r = dVar.m4167r(j2, hlsSampleStreamWrapper.f9467Y);
        int iM4165p = dVar.m4165p();
        for (int i2 = 0; i2 < hlsSampleStreamWrapper.f9484s.size(); i2++) {
            HlsMediaChunk hlsMediaChunk = hlsSampleStreamWrapper.f9484s.get(i2);
            int iM4308g = hlsSampleStreamWrapper.f9484s.get(i2).m4308g(i);
            if (iM4165p + iM4167r <= iM4308g) {
                break;
            }
            if (!hlsMediaChunk.f9401L) {
                iM4167r = iM4308g - iM4165p;
                break;
            }
        }
        dVar.m4155H(iM4167r);
        return iM4167r;
    }
}
