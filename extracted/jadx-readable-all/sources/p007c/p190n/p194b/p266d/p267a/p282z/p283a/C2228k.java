package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2277l;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2228k extends RelativeLayout {

    /* JADX INFO: renamed from: f */
    public final C2277l f10645f;

    /* JADX INFO: renamed from: g */
    public boolean f10646g;

    public C2228k(Context context, String str, String str2, String str3) {
        super(context);
        C2277l c2277l = new C2277l(context, str);
        this.f10645f = c2277l;
        c2277l.f10736d = str2;
        c2277l.f10735c = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f10646g) {
            return false;
        }
        this.f10645f.m4787a(motionEvent);
        return false;
    }
}
