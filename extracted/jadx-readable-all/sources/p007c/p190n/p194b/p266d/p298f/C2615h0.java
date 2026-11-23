package p007c.p190n.p194b.p266d.p298f;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractBinderC2744l0;
import p007c.p190n.p194b.p266d.p298f.p302q.C2742k0;
import p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2746m0;
import p007c.p190n.p194b.p266d.p298f.p307u.C2781a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2785e;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.f.h0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2615h0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractBinderC2611f0 f11572a;

    /* JADX INFO: renamed from: b */
    public static final AbstractBinderC2611f0 f11573b;

    /* JADX INFO: renamed from: c */
    public static volatile InterfaceC2746m0 f11574c;

    /* JADX INFO: renamed from: d */
    public static final Object f11575d;

    /* JADX INFO: renamed from: e */
    public static Context f11576e;

    static {
        new BinderC2798z(AbstractBinderC2607d0.m5199T1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new BinderC2601a0(AbstractBinderC2607d0.m5199T1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f11572a = new BinderC2603b0(AbstractBinderC2607d0.m5199T1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f11573b = new BinderC2605c0(AbstractBinderC2607d0.m5199T1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f11575d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static void m5213a() throws DynamiteModule.C5899a {
        InterfaceC2746m0 c2742k0;
        if (f11574c != null) {
            return;
        }
        Objects.requireNonNull(f11576e, "null reference");
        synchronized (f11575d) {
            try {
                if (f11574c == null) {
                    IBinder iBinderM12673c = DynamiteModule.m12666d(f11576e, DynamiteModule.f28676c, "com.google.android.gms.googlecertificates").m12673c("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = AbstractBinderC2744l0.f11888f;
                    if (iBinderM12673c == null) {
                        c2742k0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderM12673c.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c2742k0 = iInterfaceQueryLocalInterface instanceof InterfaceC2746m0 ? (InterfaceC2746m0) iInterfaceQueryLocalInterface : new C2742k0(iBinderM12673c);
                    }
                    f11574c = c2742k0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2710p0 m5214b(final String str, final AbstractBinderC2607d0 abstractBinderC2607d0, final boolean z, boolean z2) {
        try {
            m5213a();
            Objects.requireNonNull(f11576e, "null reference");
            try {
                return f11574c.mo5602C3(new C2625m0(str, abstractBinderC2607d0, z, z2), new BinderC2800b(f11576e.getPackageManager())) ? C2710p0.f11779a : new C2707o0(new Callable(z, str, abstractBinderC2607d0) { // from class: c.n.b.d.f.y

                    /* JADX INFO: renamed from: a */
                    public final boolean f11961a;

                    /* JADX INFO: renamed from: b */
                    public final String f11962b;

                    /* JADX INFO: renamed from: c */
                    public final AbstractBinderC2607d0 f11963c;

                    {
                        this.f11961a = z;
                        this.f11962b = str;
                        this.f11963c = abstractBinderC2607d0;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.f11961a;
                        String str2 = this.f11962b;
                        AbstractBinderC2607d0 abstractBinderC2607d1 = this.f11963c;
                        String str3 = true != (!z3 && C2615h0.m5214b(str2, abstractBinderC2607d1, true, false).f11780b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestM5620a = C2781a.m5620a("SHA-1");
                        Objects.requireNonNull(messageDigestM5620a, "null reference");
                        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str3, str2, C2785e.m5626a(messageDigestM5620a.digest(abstractBinderC2607d1.mo5202i1())), Boolean.valueOf(z3), "12451000.false");
                    }
                });
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C2710p0.m5560c("module call", e);
            }
        } catch (DynamiteModule.C5899a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String strValueOf = String.valueOf(e2.getMessage());
            return C2710p0.m5560c(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e2);
        }
    }
}
