package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.TypeCastException;
import p477d1.p480c0.Sequence;
import p477d1.p480c0.Sequences;
import p477d1.p480c0.Sequences2;
import p477d1.p481d0.Appendable;
import p477d1.p481d0.Strings5;
import p477d1.p483s.Collections2;
import p477d1.p483s.Collections4;
import p477d1.p483s.CollectionsJVM;
import p477d1.p483s.Sequences5;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p509g1.p510j0.p519l.Platform;
import p524h1.GzipSource;
import p524h1.JvmOkio;
import p524h1.RealBufferedSource;
import p524h1.Timeout2;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f34071e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f34072f = new CountDownLatch(1);

    /* JADX INFO: renamed from: g */
    public byte[] f34073g;

    /* JADX INFO: renamed from: h */
    public byte[] f34074h;

    /* JADX INFO: renamed from: d */
    public static final C7391a f34070d = new C7391a(null);

    /* JADX INFO: renamed from: a */
    public static final byte[] f34067a = {(byte) 42};

    /* JADX INFO: renamed from: b */
    public static final List<String> f34068b = CollectionsJVM.m13036a("*");

    /* JADX INFO: renamed from: c */
    public static final PublicSuffixDatabase f34069c = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    public static final class C7391a {
        public C7391a() {
        }

        /* JADX INFO: renamed from: a */
        public static final String m14478a(C7391a c7391a, byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int i4;
            Objects.requireNonNull(c7391a);
            int length = bArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = (i5 + length) / 2;
                while (i6 > -1 && bArr[i6] != ((byte) 10)) {
                    i6--;
                }
                int i7 = i6 + 1;
                int i8 = 1;
                while (true) {
                    i2 = i7 + i8;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i8++;
                }
                int i9 = i2 - i7;
                int i10 = i;
                boolean z2 = false;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        byte b = bArr2[i10][i11];
                        byte[] bArr3 = Util9.f30070a;
                        int i13 = b & 255;
                        z = z2;
                        i3 = i13;
                    }
                    byte b2 = bArr[i7 + i12];
                    byte[] bArr4 = Util9.f30070a;
                    i4 = i3 - (b2 & 255);
                    if (i4 != 0) {
                        break;
                    }
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    }
                    if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else {
                        if (i10 == bArr2.length - 1) {
                            break;
                        }
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                }
                if (i4 >= 0) {
                    if (i4 <= 0) {
                        int i14 = i9 - i12;
                        int length2 = bArr2[i10].length - i11;
                        int length3 = bArr2.length;
                        for (int i15 = i10 + 1; i15 < length3; i15++) {
                            length2 += bArr2[i15].length;
                        }
                        if (length2 >= i14) {
                            if (length2 <= i14) {
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics2.m13086b(charset, "UTF_8");
                                return new String(bArr, i7, i9, charset);
                            }
                        }
                    }
                    i5 = i2 + 1;
                }
                length = i7 - 1;
            }
            return null;
        }

        public C7391a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m14475a(String str) throws IOException {
        String strM14478a;
        String strM14478a2;
        String strM14478a3;
        List<String> listM13001D;
        int size;
        int size2;
        Intrinsics2.m13090f(str, "domain");
        String unicode = IDN.toUnicode(str);
        Intrinsics2.m13086b(unicode, "unicodeDomain");
        List<String> listM14477c = m14477c(unicode);
        int i = 0;
        if (this.f34071e.get() || !this.f34071e.compareAndSet(false, true)) {
            try {
                this.f34072f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            m14476b();
                            if (!z) {
                                break;
                            }
                            Thread.currentThread().interrupt();
                            break;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        Objects.requireNonNull(Platform.f30547c);
                        Platform.f30545a.m13605i("Failed to read public suffix list", 5, e);
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                }
            }
        }
        if (!(this.f34073g != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listM14477c.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = listM14477c.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics2.m13086b(charset, "UTF_8");
            if (str2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str2.getBytes(charset);
            Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strM14478a = null;
                break;
            }
            C7391a c7391a = f34070d;
            byte[] bArr2 = this.f34073g;
            if (bArr2 == null) {
                Intrinsics2.m13096l("publicSuffixListBytes");
                throw null;
            }
            strM14478a = C7391a.m14478a(c7391a, bArr2, bArr, i3);
            if (strM14478a != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strM14478a2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strM14478a2 = null;
                break;
            }
            bArr3[i4] = f34067a;
            C7391a c7391a2 = f34070d;
            byte[] bArr4 = this.f34073g;
            if (bArr4 == null) {
                Intrinsics2.m13096l("publicSuffixListBytes");
                throw null;
            }
            strM14478a2 = C7391a.m14478a(c7391a2, bArr4, bArr3, i4);
            if (strM14478a2 != null) {
                break;
            }
            i4++;
        }
        if (strM14478a2 == null) {
            strM14478a3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strM14478a3 = null;
                break;
            }
            C7391a c7391a3 = f34070d;
            byte[] bArr5 = this.f34074h;
            if (bArr5 == null) {
                Intrinsics2.m13096l("publicSuffixExceptionListBytes");
                throw null;
            }
            strM14478a3 = C7391a.m14478a(c7391a3, bArr5, bArr, i6);
            if (strM14478a3 != null) {
                break;
            }
            i6++;
        }
        if (strM14478a3 != null) {
            listM13001D = Strings5.m13001D('!' + strM14478a3, new char[]{'.'}, false, 0, 6);
        } else if (strM14478a == null && strM14478a2 == null) {
            listM13001D = f34068b;
        } else {
            List<String> listM13001D2 = strM14478a != null ? Strings5.m13001D(strM14478a, new char[]{'.'}, false, 0, 6) : Collections4.f29519f;
            listM13001D = strM14478a2 != null ? Strings5.m13001D(strM14478a2, new char[]{'.'}, false, 0, 6) : Collections4.f29519f;
            if (listM13001D2.size() > listM13001D.size()) {
                listM13001D = listM13001D2;
            }
        }
        if (listM14477c.size() == listM13001D.size() && listM13001D.get(0).charAt(0) != '!') {
            return null;
        }
        if (listM13001D.get(0).charAt(0) == '!') {
            size = listM14477c.size();
            size2 = listM13001D.size();
        } else {
            size = listM14477c.size();
            size2 = listM13001D.size() + 1;
        }
        int i7 = size - size2;
        List<String> listM14477c2 = m14477c(str);
        Intrinsics2.m13089e(listM14477c2, "$this$asSequence");
        Sequence sequences5 = new Sequences5(listM14477c2);
        Intrinsics2.m13089e(sequences5, "$this$drop");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(outline.m1592n("Requested element count ", i7, " is less than zero.").toString());
        }
        if (i7 != 0) {
            sequences5 = sequences5 instanceof Sequences2 ? ((Sequences2) sequences5).mo12974a(i7) : new Sequences(sequences5, i7);
        }
        Intrinsics2.m13089e(sequences5, "$this$joinToString");
        Intrinsics2.m13089e(".", "separator");
        Intrinsics2.m13089e("", "prefix");
        Intrinsics2.m13089e("", "postfix");
        Intrinsics2.m13089e("...", "truncated");
        StringBuilder sb = new StringBuilder();
        Intrinsics2.m13089e(sequences5, "$this$joinTo");
        Intrinsics2.m13089e(sb, "buffer");
        Intrinsics2.m13089e(".", "separator");
        Intrinsics2.m13089e("", "prefix");
        Intrinsics2.m13089e("", "postfix");
        Intrinsics2.m13089e("...", "truncated");
        sb.append((CharSequence) "");
        for (Object obj : sequences5) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            Appendable.m12984a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        Intrinsics2.m13088d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m14476b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            Intrinsics2.m13090f(resourceAsStream, "$this$source");
            GzipSource gzipSource = new GzipSource(new JvmOkio(resourceAsStream, new Timeout2()));
            Intrinsics2.m13090f(gzipSource, "$this$buffer");
            RealBufferedSource realBufferedSource = new RealBufferedSource(gzipSource);
            try {
                byte[] bArrMo13745h0 = realBufferedSource.mo13745h0(realBufferedSource.readInt());
                byte[] bArrMo13745h1 = realBufferedSource.mo13745h0(realBufferedSource.readInt());
                C5729a.m12455j(realBufferedSource, null);
                synchronized (this) {
                    try {
                        if (bArrMo13745h0 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        this.f34073g = bArrMo13745h0;
                        if (bArrMo13745h1 == null) {
                            Intrinsics2.m13095k();
                            throw null;
                        }
                        this.f34074h = bArrMo13745h1;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f34072f.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5729a.m12455j(realBufferedSource, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m14477c(String str) {
        int i = 0;
        List<String> listM13001D = Strings5.m13001D(str, new char[]{'.'}, false, 0, 6);
        if (!Intrinsics2.m13085a((String) _Collections.m13047l(listM13001D), "")) {
            return listM13001D;
        }
        Intrinsics2.m13089e(listM13001D, "$this$dropLast");
        int size = listM13001D.size() - 1;
        if (size < 0) {
            size = 0;
        }
        Intrinsics2.m13089e(listM13001D, "$this$take");
        if (!(size >= 0)) {
            throw new IllegalArgumentException(outline.m1592n("Requested element count ", size, " is less than zero.").toString());
        }
        if (size == 0) {
            return Collections4.f29519f;
        }
        if (size >= listM13001D.size()) {
            return _Collections.m13049n(listM13001D);
        }
        if (size == 1) {
            Intrinsics2.m13089e(listM13001D, "$this$first");
            return CollectionsJVM.m13036a(_Collections.m13044i(listM13001D));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<T> it = listM13001D.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        return Collections2.m13040e(arrayList);
    }
}
