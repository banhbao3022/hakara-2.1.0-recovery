package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 extends TimerTask {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AlertDialog f21381f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Timer f21382g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC2232o f21383h;

    public ww0(AlertDialog alertDialog, Timer timer, BinderC2232o binderC2232o) {
        this.f21381f = alertDialog;
        this.f21382g = timer;
        this.f21383h = binderC2232o;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f21381f.dismiss();
        this.f21382g.cancel();
        BinderC2232o binderC2232o = this.f21383h;
        if (binderC2232o != null) {
            binderC2232o.m4683a();
        }
    }
}
