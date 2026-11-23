package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jc2 implements b10 {

    /* JADX INFO: renamed from: f */
    public static final tc2 f15554f = tc2.m8414b(jc2.class);

    /* JADX INFO: renamed from: g */
    public final String f15555g;

    /* JADX INFO: renamed from: j */
    public ByteBuffer f15558j;

    /* JADX INFO: renamed from: k */
    public long f15559k;

    /* JADX INFO: renamed from: m */
    public nc2 f15561m;

    /* JADX INFO: renamed from: l */
    public long f15560l = -1;

    /* JADX INFO: renamed from: i */
    public boolean f15557i = true;

    /* JADX INFO: renamed from: h */
    public boolean f15556h = true;

    public jc2(String str) {
        this.f15555g = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b10
    /* JADX INFO: renamed from: a */
    public final String mo5909a() {
        return this.f15555g;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7323b() {
        if (this.f15557i) {
            return;
        }
        try {
            tc2 tc2Var = f15554f;
            String str = this.f15555g;
            tc2Var.mo7995a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f15558j = ((C3076gr) this.f15561m).m7019h(this.f15559k, this.f15560l);
            this.f15557i = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b10
    /* JADX INFO: renamed from: c */
    public final void mo5910c(nc2 nc2Var, ByteBuffer byteBuffer, long j2, InterfaceC3046fy interfaceC3046fy) throws IOException {
        C3076gr c3076gr = (C3076gr) nc2Var;
        this.f15559k = c3076gr.m7017c();
        byteBuffer.remaining();
        this.f15560l = j2;
        this.f15561m = c3076gr;
        c3076gr.m7018f(c3076gr.m7017c() + j2);
        this.f15557i = false;
        this.f15556h = false;
        m7324e();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo5926d(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: e */
    public final synchronized void m7324e() {
        m7323b();
        tc2 tc2Var = f15554f;
        String str = this.f15555g;
        tc2Var.mo7995a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f15558j;
        if (byteBuffer != null) {
            this.f15556h = true;
            byteBuffer.rewind();
            mo5926d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.f15558j = null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.b10
    /* JADX INFO: renamed from: f */
    public final void mo5911f(a20 a20Var) {
    }
}
