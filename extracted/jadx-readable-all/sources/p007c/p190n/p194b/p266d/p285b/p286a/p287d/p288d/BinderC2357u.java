package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import android.os.Binder;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2357u extends AbstractBinderC2354r {

    /* JADX INFO: renamed from: f */
    public final Context f10952f;

    public BinderC2357u(Context context) {
        this.f10952f = context;
    }

    /* JADX INFO: renamed from: o */
    public final void m4937o() {
        if (C2622l.m5227B(this.f10952f, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
