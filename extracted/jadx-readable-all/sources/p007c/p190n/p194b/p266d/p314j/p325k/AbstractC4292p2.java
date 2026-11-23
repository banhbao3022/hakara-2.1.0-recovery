package p007c.p190n.p194b.p266d.p314j.p325k;

import android.net.Uri;
import android.util.Log;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.p2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4292p2<T> {

    /* JADX INFO: renamed from: a */
    public static final Object f23392a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile AbstractC4401x2 f23393b;

    /* JADX INFO: renamed from: c */
    public static C4414y2 f23394c;

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f23395d;

    /* JADX INFO: renamed from: e */
    public final C4362u2 f23396e;

    /* JADX INFO: renamed from: f */
    public final String f23397f;

    /* JADX INFO: renamed from: g */
    public final T f23398g;

    /* JADX INFO: renamed from: h */
    public volatile int f23399h = -1;

    /* JADX INFO: renamed from: i */
    public volatile T f23400i;

    /* JADX INFO: renamed from: j */
    public final boolean f23401j;

    static {
        new AtomicReference();
        f23394c = new C4414y2(C4320r2.f23427a);
        f23395d = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4292p2(C4362u2 c4362u2, String str, Object obj, boolean z, C4306q2 c4306q2) {
        if (c4362u2.f23494a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f23396e = c4362u2;
        this.f23397f = str;
        this.f23398g = obj;
        this.f23401j = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo10134a(Object obj);

    /* JADX INFO: renamed from: b */
    public final String m10135b(String str) {
        if (str != null && str.isEmpty()) {
            return this.f23397f;
        }
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(this.f23397f);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    /* JADX INFO: renamed from: c */
    public final String m10136c() {
        return m10135b(this.f23396e.f23496c);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0121 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0126 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[Catch: all -> 0x0141, TryCatch #0 {, blocks: (B:8:0x0021, B:10:0x0025, B:14:0x002d, B:16:0x0044, B:22:0x0055, B:24:0x005b, B:26:0x0069, B:30:0x0086, B:32:0x0090, B:50:0x00e3, B:52:0x00f3, B:54:0x0106, B:58:0x0117, B:60:0x0121, B:61:0x0126, B:62:0x012b, B:64:0x0134, B:65:0x0137, B:66:0x013b, B:43:0x00c2, B:45:0x00d8, B:49:0x00e1, B:28:0x007c, B:33:0x0095, B:35:0x009e, B:37:0x00b0, B:39:0x00bb, B:38:0x00b5, B:67:0x013f), top: B:74:0x0021 }] */
    /* JADX INFO: renamed from: d */
    public final T m10137d() {
        T tMo10134a;
        Object objMo9407f;
        AbstractC4097b3<C4236l2> abstractC4097b3Zza;
        C4236l2 c4236l2Mo9338c;
        Uri uri;
        String str;
        String str2;
        Map<String, String> map;
        String strValueOf;
        InterfaceC4138e2 interfaceC4138e2M10308a;
        Object objMo9407f2;
        boolean z = true;
        if (!this.f23401j) {
            C4414y2 c4414y2 = f23394c;
            String str3 = this.f23397f;
            Objects.requireNonNull(c4414y2);
            Objects.requireNonNull(str3, "flagName must not be null");
            C2622l.m5367f2(true, "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f23395d.get();
        if (this.f23399h < i) {
            synchronized (this) {
                if (this.f23399h < i) {
                    AbstractC4401x2 abstractC4401x2 = f23393b;
                    C2622l.m5367f2(abstractC4401x2 != null, "Must call PhenotypeFlag.init() first");
                    String str4 = (String) C4152f2.m9595a(abstractC4401x2.mo10329a()).mo9407f("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
                    if (str4 == null || !C4400x1.f23603c.matcher(str4).matches()) {
                        z = false;
                    }
                    String str5 = null;
                    if (!z) {
                        if (this.f23396e.f23494a != null) {
                            interfaceC4138e2M10308a = C4264n2.m10025a(abstractC4401x2.mo10329a(), this.f23396e.f23494a) ? C4096b2.m9404a(abstractC4401x2.mo10329a().getContentResolver(), this.f23396e.f23494a) : null;
                        } else {
                            interfaceC4138e2M10308a = C4388w2.m10308a(abstractC4401x2.mo10329a());
                        }
                        if (interfaceC4138e2M10308a != null && (objMo9407f2 = interfaceC4138e2M10308a.mo9407f(m10136c())) != null) {
                            tMo10134a = mo10134a(objMo9407f2);
                        }
                        if (tMo10134a == null) {
                            objMo9407f = C4152f2.m9595a(abstractC4401x2.mo10329a()).mo9407f(m10135b(this.f23396e.f23495b));
                            if (objMo9407f != null) {
                                tMo10134a = mo10134a(objMo9407f);
                            } else {
                                tMo10134a = null;
                            }
                            if (tMo10134a != null) {
                                tMo10134a = this.f23398g;
                            }
                        }
                        abstractC4097b3Zza = abstractC4401x2.mo10330b().zza();
                        if (abstractC4097b3Zza.mo9337b()) {
                            c4236l2Mo9338c = abstractC4097b3Zza.mo9338c();
                            C4362u2 c4362u2 = this.f23396e;
                            uri = c4362u2.f23494a;
                            str = c4362u2.f23496c;
                            str2 = this.f23397f;
                            Objects.requireNonNull(c4236l2Mo9338c);
                            if (uri != null) {
                                map = c4236l2Mo9338c.f23283a.get(uri.toString());
                                if (map != null) {
                                    if (str != null) {
                                        strValueOf = String.valueOf(str2);
                                        if (strValueOf.length() != 0) {
                                            str2 = str.concat(strValueOf);
                                        } else {
                                            str2 = new String(str);
                                        }
                                    }
                                    str5 = map.get(str2);
                                }
                            }
                            if (str5 == null) {
                                tMo10134a = this.f23398g;
                            } else {
                                tMo10134a = mo10134a(str5);
                            }
                        }
                        this.f23400i = tMo10134a;
                        this.f23399h = i;
                    } else if (Log.isLoggable("PhenotypeFlag", 3)) {
                        String strValueOf2 = String.valueOf(m10136c());
                        Log.d("PhenotypeFlag", strValueOf2.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf2) : new String("Bypass reading Phenotype values for flag: "));
                    }
                    tMo10134a = null;
                    if (tMo10134a == null) {
                        objMo9407f = C4152f2.m9595a(abstractC4401x2.mo10329a()).mo9407f(m10135b(this.f23396e.f23495b));
                        if (objMo9407f != null) {
                            tMo10134a = mo10134a(objMo9407f);
                        } else {
                            tMo10134a = null;
                        }
                        if (tMo10134a != null) {
                            tMo10134a = this.f23398g;
                        }
                    }
                    abstractC4097b3Zza = abstractC4401x2.mo10330b().zza();
                    if (abstractC4097b3Zza.mo9337b()) {
                        c4236l2Mo9338c = abstractC4097b3Zza.mo9338c();
                        C4362u2 c4362u3 = this.f23396e;
                        uri = c4362u3.f23494a;
                        str = c4362u3.f23496c;
                        str2 = this.f23397f;
                        Objects.requireNonNull(c4236l2Mo9338c);
                        if (uri != null) {
                            map = c4236l2Mo9338c.f23283a.get(uri.toString());
                            if (map != null) {
                                if (str != null) {
                                    strValueOf = String.valueOf(str2);
                                    if (strValueOf.length() != 0) {
                                        str2 = str.concat(strValueOf);
                                    } else {
                                        str2 = new String(str);
                                    }
                                }
                                str5 = map.get(str2);
                            }
                        }
                        if (str5 == null) {
                            tMo10134a = this.f23398g;
                        } else {
                            tMo10134a = mo10134a(str5);
                        }
                    }
                    this.f23400i = tMo10134a;
                    this.f23399h = i;
                }
            }
        }
        return this.f23400i;
    }
}
