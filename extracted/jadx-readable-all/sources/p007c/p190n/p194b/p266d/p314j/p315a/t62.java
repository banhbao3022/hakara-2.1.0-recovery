package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p315a.s62;
import p007c.p190n.p194b.p266d.p314j.p315a.t62;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t62<MessageType extends t62<MessageType, BuilderType>, BuilderType extends s62<MessageType, BuilderType>> implements l92 {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static <T> void m8399h(Iterable<T> iterable, List<? super T> list) {
        Charset charset = p82.f17879a;
        Objects.requireNonNull(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String string = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(t);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l92
    /* JADX INFO: renamed from: b */
    public final g72 mo7573b() {
        try {
            g82 g82Var = (g82) this;
            int iMo6961e = g82Var.mo6961e();
            g72 g72Var = g72.f14513f;
            byte[] bArr = new byte[iMo6961e];
            Logger logger = o72.f17551a;
            m72 m72Var = new m72(bArr, 0, iMo6961e);
            g82Var.m6966r(m72Var);
            if (m72Var.m7678z() == 0) {
                return new e72(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(outline.m1552C(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public int mo6959c() {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo6962f(int i) {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l92
    /* JADX INFO: renamed from: w */
    public final byte[] mo7574w() {
        try {
            g82 g82Var = (g82) this;
            int iMo6961e = g82Var.mo6961e();
            byte[] bArr = new byte[iMo6961e];
            Logger logger = o72.f17551a;
            m72 m72Var = new m72(bArr, 0, iMo6961e);
            g82Var.m6966r(m72Var);
            if (m72Var.m7678z() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(outline.m1552C(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
