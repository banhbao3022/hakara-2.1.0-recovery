package p007c.p190n.p194b.p209b.p243w1.p246v0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.FormatHolder;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p217p1.DecoderInputBuffer;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessageEncoder;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.EventStream;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.j, reason: use source file name */
/* JADX INFO: compiled from: EventSampleStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class EventSampleStream implements SampleStream {

    /* JADX INFO: renamed from: f */
    public final Format f9223f;

    /* JADX INFO: renamed from: h */
    public long[] f9225h;

    /* JADX INFO: renamed from: i */
    public boolean f9226i;

    /* JADX INFO: renamed from: j */
    public EventStream f9227j;

    /* JADX INFO: renamed from: k */
    public boolean f9228k;

    /* JADX INFO: renamed from: l */
    public int f9229l;

    /* JADX INFO: renamed from: g */
    public final EventMessageEncoder f9224g = new EventMessageEncoder();

    /* JADX INFO: renamed from: m */
    public long f9230m = -9223372036854775807L;

    public EventSampleStream(EventStream eventStream, Format format, boolean z) {
        this.f9223f = format;
        this.f9227j = eventStream;
        this.f9225h = eventStream.f9283b;
        m4251d(eventStream, z);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: a */
    public void mo4128a() throws IOException {
    }

    /* JADX INFO: renamed from: b */
    public void m4250b(long j2) {
        int iM3114b = Util6.m3114b(this.f9225h, j2, true, false);
        this.f9229l = iM3114b;
        if (!(this.f9226i && iM3114b == this.f9225h.length)) {
            j2 = -9223372036854775807L;
        }
        this.f9230m = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: c */
    public boolean mo4129c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m4251d(EventStream eventStream, boolean z) {
        int i = this.f9229l;
        long j2 = i == 0 ? -9223372036854775807L : this.f9225h[i - 1];
        this.f9226i = z;
        this.f9227j = eventStream;
        long[] jArr = eventStream.f9283b;
        this.f9225h = jArr;
        long j3 = this.f9230m;
        if (j3 != -9223372036854775807L) {
            m4250b(j3);
        } else if (j2 != -9223372036854775807L) {
            this.f9229l = Util6.m3114b(jArr, j2, false, false);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: j */
    public int mo4130j(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (z || !this.f9228k) {
            formatHolder.f7259b = this.f9223f;
            this.f9228k = true;
            return -5;
        }
        int i = this.f9229l;
        if (i == this.f9225h.length) {
            if (this.f9226i) {
                return -3;
            }
            decoderInputBuffer.f7262f = 4;
            return -4;
        }
        this.f9229l = i + 1;
        byte[] bArrM4021a = this.f9224g.m4021a(this.f9227j.f9282a[i]);
        decoderInputBuffer.m3637z(bArrM4021a.length);
        decoderInputBuffer.f7287h.put(bArrM4021a);
        decoderInputBuffer.f7289j = this.f9225h[i];
        decoderInputBuffer.f7262f = 1;
        return -4;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleStream
    /* JADX INFO: renamed from: o */
    public int mo4131o(long j2) {
        int iMax = Math.max(this.f9229l, Util6.m3114b(this.f9225h, j2, true, false));
        int i = iMax - this.f9229l;
        this.f9229l = iMax;
        return i;
    }
}
