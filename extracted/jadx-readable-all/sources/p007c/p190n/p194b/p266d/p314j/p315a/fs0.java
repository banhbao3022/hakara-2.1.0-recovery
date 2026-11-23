package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fs0 implements zc2<PackageInfo> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f14107a;

    /* JADX INFO: renamed from: b */
    public final gd2<ApplicationInfo> f14108b;

    public fs0(gd2<Context> gd2Var, gd2<ApplicationInfo> gd2Var2) {
        this.f14107a = gd2Var;
        this.f14108b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4613a() {
        try {
            return C2794c.m5637a(this.f14107a.mo4613a()).m5635c(((as0) this.f14108b).mo4613a().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
