package p007c.p190n.p194b.p266d.p314j.p325k;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.d5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4127d5 {

    /* JADX INFO: renamed from: a */
    public static final Charset f23112a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: b */
    public static final byte[] f23113b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f23113b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC4154f4.m9597c(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m9545a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: renamed from: b */
    public static int m9546b(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: c */
    public static Object m9547c(Object obj, Object obj2) {
        InterfaceC4240l6 interfaceC4240l6 = (InterfaceC4240l6) obj2;
        AbstractC4321r3 abstractC4321r3 = (AbstractC4321r3) ((InterfaceC4240l6) obj).mo9415b();
        Objects.requireNonNull(abstractC4321r3);
        if (((AbstractC4099b5.b) abstractC4321r3).f23085f.getClass().isInstance(interfaceC4240l6)) {
            return ((AbstractC4099b5.b) abstractC4321r3.mo9424j((AbstractC4293p3) interfaceC4240l6)).m9432s();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
