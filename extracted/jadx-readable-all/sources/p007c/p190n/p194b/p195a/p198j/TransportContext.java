package p007c.p190n.p194b.p195a.p198j;

import android.util.Base64;
import p007c.p190n.p194b.p195a.Priority2;

/* JADX INFO: renamed from: c.n.b.a.j.k, reason: use source file name */
/* JADX INFO: compiled from: TransportContext.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransportContext {

    /* JADX INFO: renamed from: c.n.b.a.j.k$a */
    /* JADX INFO: compiled from: TransportContext.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract TransportContext mo2811a();

        /* JADX INFO: renamed from: b */
        public abstract a mo2812b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo2813c(byte[] bArr);

        /* JADX INFO: renamed from: d */
        public abstract a mo2814d(Priority2 priority2);
    }

    /* JADX INFO: renamed from: a */
    public static a m2819a() {
        AutoValue_TransportContext.b bVar = new AutoValue_TransportContext.b();
        bVar.mo2814d(Priority2.DEFAULT);
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo2808b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo2809c();

    /* JADX INFO: renamed from: d */
    public abstract Priority2 mo2810d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo2808b();
        objArr[1] = mo2810d();
        objArr[2] = mo2809c() == null ? "" : Base64.encodeToString(mo2809c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
