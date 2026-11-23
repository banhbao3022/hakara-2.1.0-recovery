package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.gg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3065gg extends C3287mg {

    /* JADX INFO: renamed from: c */
    public String f14553c;

    /* JADX INFO: renamed from: d */
    public boolean f14554d;

    /* JADX INFO: renamed from: e */
    public int f14555e;

    /* JADX INFO: renamed from: f */
    public int f14556f;

    /* JADX INFO: renamed from: g */
    public int f14557g;

    /* JADX INFO: renamed from: h */
    public int f14558h;

    /* JADX INFO: renamed from: i */
    public int f14559i;

    /* JADX INFO: renamed from: j */
    public int f14560j;

    /* JADX INFO: renamed from: k */
    public final Object f14561k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC3410ps f14562l;

    /* JADX INFO: renamed from: m */
    public final Activity f14563m;

    /* JADX INFO: renamed from: n */
    public C3005eu f14564n;

    /* JADX INFO: renamed from: o */
    public ImageView f14565o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f14566p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC3324ng f14567q;

    /* JADX INFO: renamed from: r */
    public PopupWindow f14568r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f14569s;

    /* JADX INFO: renamed from: t */
    public ViewGroup f14570t;

    static {
        Set setM5300Q0 = C2622l.m5300Q0(7, false);
        Collections.addAll(setM5300Q0, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(setM5300Q0);
    }

    public C3065gg(InterfaceC3410ps interfaceC3410ps, InterfaceC3324ng interfaceC3324ng) {
        super(interfaceC3410ps, "resize");
        this.f14553c = "top-right";
        this.f14554d = true;
        this.f14555e = 0;
        this.f14556f = 0;
        this.f14557g = -1;
        this.f14558h = 0;
        this.f14559i = 0;
        this.f14560j = -1;
        this.f14561k = new Object();
        this.f14562l = interfaceC3410ps;
        this.f14563m = interfaceC3410ps.mo6482h();
        this.f14567q = interfaceC3324ng;
    }

    /* JADX INFO: renamed from: f */
    public final void m6996f(boolean z) {
        synchronized (this.f14561k) {
            try {
                PopupWindow popupWindow = this.f14568r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.f14569s.removeView((View) this.f14562l);
                    ViewGroup viewGroup = this.f14570t;
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f14565o);
                        this.f14570t.addView((View) this.f14562l);
                        this.f14562l.mo6437D0(this.f14564n);
                    }
                    if (z) {
                        m7695d("default");
                        InterfaceC3324ng interfaceC3324ng = this.f14567q;
                        if (interfaceC3324ng != null) {
                            ((wl0) interfaceC3324ng).f21257a.f21583b.m7108A0(i70.f15101a);
                        }
                    }
                    this.f14568r = null;
                    this.f14569s = null;
                    this.f14570t = null;
                    this.f14566p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
