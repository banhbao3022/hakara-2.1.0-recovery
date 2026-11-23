package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 implements ia1, ha1 {

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo f12546a;

    /* JADX INFO: renamed from: b */
    public final PackageInfo f12547b;

    public b91(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f12546a = applicationInfo;
        this.f12547b = packageInfo;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo5696d(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f12546a.packageName;
        PackageInfo packageInfo = this.f12547b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f12547b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ha1<Bundle>> zza() {
        return cw0.m6231a(this);
    }
}
