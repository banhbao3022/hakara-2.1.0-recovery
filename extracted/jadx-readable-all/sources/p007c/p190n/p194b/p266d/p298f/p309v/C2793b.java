package p007c.p190n.p194b.p266d.p298f.p309v;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.v.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2793b {

    /* JADX INFO: renamed from: a */
    @RecentlyNonNull
    public final Context f11958a;

    public C2793b(@RecentlyNonNull Context context) {
        this.f11958a = context;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public ApplicationInfo m5633a(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f11958a.getPackageManager().getApplicationInfo(str, i);
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public CharSequence m5634b(@RecentlyNonNull String str) throws PackageManager.NameNotFoundException {
        return this.f11958a.getPackageManager().getApplicationLabel(this.f11958a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: c */
    public PackageInfo m5635c(@RecentlyNonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f11958a.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m5636d() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2792a.m5632a(this.f11958a);
        }
        if (!C2622l.m5464z() || (nameForUid = this.f11958a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f11958a.getPackageManager().isInstantApp(nameForUid);
    }
}
