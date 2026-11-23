package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.gx */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3082gx implements InterfaceC3046fy {

    /* JADX INFO: renamed from: a */
    public static final Logger f14689a = Logger.getLogger(AbstractC3082gx.class.getName());

    /* JADX INFO: renamed from: b */
    public final ThreadLocal<ByteBuffer> f14690b = new C3044fw();

    /* JADX INFO: renamed from: a */
    public abstract b10 mo7037a(String str, byte[] bArr, String str2);

    /* JADX INFO: renamed from: b */
    public final b10 m7038b(nc2 nc2Var, a20 a20Var) throws IOException {
        int iM7016a;
        long jLimit;
        C3076gr c3076gr = (C3076gr) nc2Var;
        long jM7017c = c3076gr.m7017c();
        this.f14690b.get().rewind().limit(8);
        do {
            iM7016a = c3076gr.m7016a(this.f14690b.get());
            if (iM7016a == 8) {
                this.f14690b.get().rewind();
                long jM5405n0 = C2622l.m5405n0(this.f14690b.get());
                byte[] bArr = null;
                if (jM5405n0 < 8 && jM5405n0 > 1) {
                    Logger logger = f14689a;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jM5405n0);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.f14690b.get().get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jM5405n0 == 1) {
                        this.f14690b.get().limit(16);
                        c3076gr.m7016a(this.f14690b.get());
                        this.f14690b.get().position(8);
                        jLimit = C2622l.m5270J2(this.f14690b.get()) - 16;
                    } else {
                        jLimit = jM5405n0 == 0 ? ((long) c3076gr.f14647f.limit()) - c3076gr.m7017c() : jM5405n0 - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.f14690b.get().limit(this.f14690b.get().limit() + 16);
                        c3076gr.m7016a(this.f14690b.get());
                        bArr = new byte[16];
                        for (int iPosition = this.f14690b.get().position() - 16; iPosition < this.f14690b.get().position(); iPosition++) {
                            bArr[iPosition - (this.f14690b.get().position() - 16)] = this.f14690b.get().get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j2 = jLimit;
                    b10 b10VarMo7037a = mo7037a(str, bArr, a20Var instanceof b10 ? ((b10) a20Var).mo5909a() : "");
                    b10VarMo7037a.mo5911f(a20Var);
                    this.f14690b.get().rewind();
                    b10VarMo7037a.mo5910c(c3076gr, this.f14690b.get(), j2, this);
                    return b10VarMo7037a;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iM7016a >= 0);
        c3076gr.m7018f(jM7017c);
        throw new EOFException();
    }
}
