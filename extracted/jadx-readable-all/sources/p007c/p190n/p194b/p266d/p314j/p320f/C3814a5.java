package p007c.p190n.p194b.p266d.p314j.p320f;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.a5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3814a5 {

    /* JADX INFO: renamed from: a */
    public static final Charset f22506a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: b */
    public static final byte[] f22507b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f22507b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        int i = length + 0;
        try {
            if (length < 0) {
                throw new C3884h5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if ((0 - 0) + length > Integer.MAX_VALUE) {
                throw new C3884h5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            int i2 = i + 0 + 0;
        } catch (C3884h5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m8930a(Object obj, Object obj2) {
        InterfaceC3895i6 interfaceC3895i6 = (InterfaceC3895i6) obj2;
        AbstractC4020v3 abstractC4020v3 = (AbstractC4020v3) ((InterfaceC3895i6) obj).mo9042b();
        Objects.requireNonNull(abstractC4020v3);
        if (((AbstractC4057z4.a) abstractC4020v3).f23001f.getClass().isInstance(interfaceC3895i6)) {
            return ((AbstractC4057z4.a) abstractC4020v3.mo9281j((AbstractC4029w3) interfaceC3895i6)).m9325o();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* JADX INFO: renamed from: b */
    public static int m8931b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
