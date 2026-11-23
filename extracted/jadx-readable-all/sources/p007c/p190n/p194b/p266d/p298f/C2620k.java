package p007c.p190n.p194b.p266d.p298f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: renamed from: c.n.b.d.f.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2620k {

    /* JADX INFO: renamed from: a */
    public static C2620k f11587a;

    /* JADX INFO: renamed from: b */
    public final Context f11588b;

    /* JADX INFO: renamed from: c */
    public volatile String f11589c;

    public C2620k(@RecentlyNonNull Context context) {
        this.f11588b = context.getApplicationContext();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static C2620k m5218a(@RecentlyNonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (C2620k.class) {
            if (f11587a == null) {
                AbstractBinderC2611f0 abstractBinderC2611f0 = C2615h0.f11572a;
                synchronized (C2615h0.class) {
                    if (C2615h0.f11576e == null) {
                        C2615h0.f11576e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f11587a = new C2620k(context);
            }
        }
        return f11587a;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractBinderC2607d0 m5219c(PackageInfo packageInfo, AbstractBinderC2607d0... abstractBinderC2607d0Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC2609e0 binderC2609e0 = new BinderC2609e0(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC2607d0Arr.length; i++) {
            if (abstractBinderC2607d0Arr[i].equals(binderC2609e0)) {
                return abstractBinderC2607d0Arr[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m5220d(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? m5219c(packageInfo, C2613g0.f11571a) : m5219c(packageInfo, C2613g0.f11571a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x013d  */
    /* JADX INFO: renamed from: b */
    public boolean m5221b(int i) {
        C2710p0 c2710p0M5559b;
        int length;
        boolean zMo5604f;
        C2710p0 c2710p0M5559b2;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.f11588b.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2710p0M5559b = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Objects.requireNonNull(c2710p0M5559b, "null reference");
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    c2710p0M5559b = C2710p0.m5559b("null pkg");
                } else if (str.equals(this.f11589c)) {
                    c2710p0M5559b = C2710p0.f11779a;
                } else {
                    AbstractBinderC2611f0 abstractBinderC2611f0 = C2615h0.f11572a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            C2615h0.m5213a();
                            zMo5604f = C2615h0.f11574c.mo5604f();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (RemoteException | DynamiteModule.C5899a e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        zMo5604f = false;
                    }
                    if (zMo5604f) {
                        boolean zM5216b = C2618j.m5216b(this.f11588b);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            Objects.requireNonNull(C2615h0.f11576e, "null reference");
                            try {
                                C2615h0.m5213a();
                                try {
                                    C2621k0 c2621k0Mo5603Z2 = C2615h0.f11574c.mo5603Z2(new C2617i0(str, zM5216b, false, new BinderC2800b(C2615h0.f11576e), false));
                                    if (c2621k0Mo5603Z2.f11590f) {
                                        c2710p0M5559b2 = C2710p0.f11779a;
                                    } else {
                                        String str2 = c2621k0Mo5603Z2.f11591g;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        c2710p0M5559b2 = C2622l.m5431s1(c2621k0Mo5603Z2.f11592h) == 4 ? C2710p0.m5560c(str2, new PackageManager.NameNotFoundException()) : C2710p0.m5559b(str2);
                                    }
                                } catch (RemoteException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    c2710p0M5559b2 = C2710p0.m5560c("module call", e2);
                                }
                            } catch (DynamiteModule.C5899a e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                String strValueOf = String.valueOf(e3.getMessage());
                                c2710p0M5559b2 = C2710p0.m5560c(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e3);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.f11588b.getPackageManager().getPackageInfo(str, 64);
                            boolean zM5216b2 = C2618j.m5216b(this.f11588b);
                            if (packageInfo == null) {
                                c2710p0M5559b2 = C2710p0.m5559b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    c2710p0M5559b2 = C2710p0.m5559b("single cert required");
                                } else {
                                    BinderC2609e0 binderC2609e0 = new BinderC2609e0(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        C2710p0 c2710p0M5214b = C2615h0.m5214b(str3, binderC2609e0, zM5216b2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!c2710p0M5214b.f11780b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            c2710p0M5559b2 = c2710p0M5214b;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                C2710p0 c2710p0M5214b2 = C2615h0.m5214b(str3, binderC2609e0, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (c2710p0M5214b2.f11780b) {
                                                    c2710p0M5559b2 = C2710p0.m5559b("debuggable release cert app rejected");
                                                } else {
                                                    c2710p0M5559b2 = c2710p0M5214b;
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            c2710p0M5559b = C2710p0.m5560c(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e4);
                        }
                    }
                    if (c2710p0M5559b2.f11780b) {
                        this.f11589c = str;
                    }
                    c2710p0M5559b = c2710p0M5559b2;
                }
                if (c2710p0M5559b.f11780b) {
                    break;
                }
                i2++;
            }
        } else {
            c2710p0M5559b = C2710p0.m5559b("no pkgs");
        }
        if (!c2710p0M5559b.f11780b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (c2710p0M5559b.f11782d != null) {
                Log.d("GoogleCertificatesRslt", c2710p0M5559b.mo5558a(), c2710p0M5559b.f11782d);
            } else {
                Log.d("GoogleCertificatesRslt", c2710p0M5559b.mo5558a());
            }
        }
        return c2710p0M5559b.f11780b;
    }
}
