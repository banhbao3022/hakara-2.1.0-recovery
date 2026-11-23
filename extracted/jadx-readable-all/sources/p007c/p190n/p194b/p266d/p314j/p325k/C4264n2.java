package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.j.k.n2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4264n2 {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC4097b3<Boolean> f23333a = C4083a3.f23027f;

    /* JADX INFO: renamed from: b */
    public static final Object f23334b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m10025a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (f23333a.mo9337b()) {
            return f23333a.mo9338c().booleanValue();
        }
        synchronized (f23334b) {
            if (f23333a.mo9337b()) {
                return f23333a.mo9338c().booleanValue();
            }
            if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                try {
                    z = (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (z) {
                    z2 = true;
                }
            }
            f23333a = AbstractC4097b3.m9408a(Boolean.valueOf(z2));
            return f23333a.mo9338c().booleanValue();
        }
    }
}
