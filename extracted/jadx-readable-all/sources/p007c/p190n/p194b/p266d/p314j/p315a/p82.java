package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p82 {

    /* JADX INFO: renamed from: a */
    public static final Charset f17879a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: b */
    public static final byte[] f17880b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f17880b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m8088a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static int m8089b(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: c */
    public static Object m8090c(Object obj, Object obj2) {
        s62 s62VarMo6958a = ((l92) obj).mo6958a();
        l92 l92Var = (l92) obj2;
        Objects.requireNonNull(s62VarMo6958a);
        if (((d82) s62VarMo6958a).f13189f.getClass().isInstance(l92Var)) {
            return s62VarMo6958a.mo6296j((t62) l92Var).mo6297k();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
