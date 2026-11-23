package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.r2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3458r2 {

    /* JADX INFO: renamed from: a */
    public final Context f18690a;

    public C3458r2(Context context) {
        C2622l.m5379i(context, "Context can not be null");
        this.f18690a = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8242a() {
        return ((Boolean) C2096e.m4588x(this.f18690a, new CallableC3421q2())).booleanValue() && C2794c.m5637a(this.f18690a).f11958a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: b */
    public final boolean m8243b() {
        return m8244c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8244c(Intent intent) {
        C2622l.m5379i(intent, "Intent can not be null");
        return !this.f18690a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
