package p007c.p190n.p194b.p266d.p267a.p282z;

import android.view.MotionEvent;
import android.view.View;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;

/* JADX INFO: renamed from: c.n.b.d.a.z.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2325p implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2329t f10867f;

    public ViewOnTouchListenerC2325p(BinderC2329t binderC2329t) {
        this.f10867f = binderC2329t;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rd2 rd2Var = this.f10867f.f10882m;
        if (rd2Var == null) {
            return false;
        }
        rd2Var.f18750d.mo4852a(motionEvent);
        return false;
    }
}
