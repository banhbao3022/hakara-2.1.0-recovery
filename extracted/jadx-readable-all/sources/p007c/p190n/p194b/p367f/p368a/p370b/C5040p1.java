package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import android.content.pm.PackageManager;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5040p1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25911a = new C5089f("PackageStateCache");

    /* JADX INFO: renamed from: b */
    public final Context f25912b;

    /* JADX INFO: renamed from: c */
    public int f25913c = -1;

    public C5040p1(Context context) {
        this.f25912b = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m11467a() {
        if (this.f25913c == -1) {
            try {
                this.f25913c = this.f25912b.getPackageManager().getPackageInfo(this.f25912b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f25911a.m11533b(6, "The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f25913c;
    }
}
