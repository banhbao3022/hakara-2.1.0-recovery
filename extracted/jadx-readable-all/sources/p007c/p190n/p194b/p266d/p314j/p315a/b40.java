package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.util.Date;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 extends jc2 implements b10 {

    /* JADX INFO: renamed from: n */
    public int f12515n;

    /* JADX INFO: renamed from: o */
    public Date f12516o;

    /* JADX INFO: renamed from: p */
    public Date f12517p;

    /* JADX INFO: renamed from: q */
    public long f12518q;

    /* JADX INFO: renamed from: r */
    public long f12519r;

    /* JADX INFO: renamed from: s */
    public double f12520s;

    /* JADX INFO: renamed from: t */
    public float f12521t;

    /* JADX INFO: renamed from: u */
    public uc2 f12522u;

    /* JADX INFO: renamed from: v */
    public long f12523v;

    public b40() {
        super("mvhd");
        this.f12520s = 1.0d;
        this.f12521t = 1.0f;
        this.f12522u = uc2.f20269a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jc2
    /* JADX INFO: renamed from: d */
    public final void mo5926d(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.f12515n = i;
        C2622l.m5244E1(byteBuffer);
        byteBuffer.get();
        if (!this.f15556h) {
            m7324e();
        }
        if (this.f12515n == 1) {
            this.f12516o = C2622l.m5296P0(C2622l.m5270J2(byteBuffer));
            this.f12517p = C2622l.m5296P0(C2622l.m5270J2(byteBuffer));
            this.f12518q = C2622l.m5405n0(byteBuffer);
            this.f12519r = C2622l.m5270J2(byteBuffer);
        } else {
            this.f12516o = C2622l.m5296P0(C2622l.m5405n0(byteBuffer));
            this.f12517p = C2622l.m5296P0(C2622l.m5405n0(byteBuffer));
            this.f12518q = C2622l.m5405n0(byteBuffer);
            this.f12519r = C2622l.m5405n0(byteBuffer);
        }
        this.f12520s = C2622l.m5334Y2(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f12521t = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        C2622l.m5244E1(byteBuffer);
        C2622l.m5405n0(byteBuffer);
        C2622l.m5405n0(byteBuffer);
        uc2 uc2Var = uc2.f20269a;
        this.f12522u = new uc2(C2622l.m5334Y2(byteBuffer), C2622l.m5334Y2(byteBuffer), C2622l.m5334Y2(byteBuffer), C2622l.m5334Y2(byteBuffer), C2622l.m5383i3(byteBuffer), C2622l.m5383i3(byteBuffer), C2622l.m5383i3(byteBuffer), C2622l.m5334Y2(byteBuffer), C2622l.m5334Y2(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f12523v = C2622l.m5405n0(byteBuffer);
    }

    public final String toString() {
        StringBuilder sbM1556G = outline.m1556G("MovieHeaderBox[creationTime=");
        sbM1556G.append(this.f12516o);
        sbM1556G.append(";modificationTime=");
        sbM1556G.append(this.f12517p);
        sbM1556G.append(";timescale=");
        sbM1556G.append(this.f12518q);
        sbM1556G.append(";duration=");
        sbM1556G.append(this.f12519r);
        sbM1556G.append(";rate=");
        sbM1556G.append(this.f12520s);
        sbM1556G.append(";volume=");
        sbM1556G.append(this.f12521t);
        sbM1556G.append(";matrix=");
        sbM1556G.append(this.f12522u);
        sbM1556G.append(";nextTrackId=");
        sbM1556G.append(this.f12523v);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
