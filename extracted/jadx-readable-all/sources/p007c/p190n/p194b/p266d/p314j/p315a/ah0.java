package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ah0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2305w0 f12120a;

    /* JADX INFO: renamed from: b */
    public final ii1 f12121b;

    /* JADX INFO: renamed from: c */
    public final hg0 f12122c;

    /* JADX INFO: renamed from: d */
    public final bg0 f12123d;

    /* JADX INFO: renamed from: e */
    public final mh0 f12124e;

    /* JADX INFO: renamed from: f */
    public final uh0 f12125f;

    /* JADX INFO: renamed from: g */
    public final Executor f12126g;

    /* JADX INFO: renamed from: h */
    public final Executor f12127h;

    /* JADX INFO: renamed from: i */
    public final C3165j5 f12128i;

    /* JADX INFO: renamed from: j */
    public final yf0 f12129j;

    public ah0(InterfaceC2305w0 interfaceC2305w0, ii1 ii1Var, hg0 hg0Var, bg0 bg0Var, mh0 mh0Var, uh0 uh0Var, Executor executor, Executor executor2, yf0 yf0Var) {
        this.f12120a = interfaceC2305w0;
        this.f12121b = ii1Var;
        this.f12128i = ii1Var.f15196i;
        this.f12122c = hg0Var;
        this.f12123d = bg0Var;
        this.f12124e = mh0Var;
        this.f12125f = uh0Var;
        this.f12126g = executor;
        this.f12127h = executor2;
        this.f12129j = yf0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m5784c(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5785a(wh0 wh0Var) {
        if (wh0Var == null) {
            return;
        }
        Context context = wh0Var.mo8489K2().getContext();
        if (C2096e.m4562K(context, this.f12122c.f14840a)) {
            if (!(context instanceof Activity)) {
                C2622l.m5318U2("Activity context is needed for policy validator.");
                return;
            }
            if (this.f12125f == null || wh0Var.mo8488E0() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f12125f.m8500a(wh0Var.mo8488E0(), windowManager), C2096e.m4563L());
            } catch (C3781zs e) {
                C2096e.m4554C("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5786b(ViewGroup viewGroup) {
        View viewM6000f = this.f12123d.m6000f();
        if (viewM6000f == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewM6000f.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewM6000f.getParent()).removeView(viewM6000f);
        }
        viewGroup.addView(viewM6000f, ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14270T1)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
