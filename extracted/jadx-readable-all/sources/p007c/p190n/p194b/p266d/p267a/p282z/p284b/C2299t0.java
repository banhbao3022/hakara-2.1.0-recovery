package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p314j.p315a.C3443qo;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.t0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2299t0 {

    /* JADX INFO: renamed from: a */
    public final View f10777a;

    /* JADX INFO: renamed from: b */
    public Activity f10778b;

    /* JADX INFO: renamed from: c */
    public boolean f10779c;

    /* JADX INFO: renamed from: d */
    public boolean f10780d;

    /* JADX INFO: renamed from: e */
    public boolean f10781e;

    /* JADX INFO: renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f10782f;

    public C2299t0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f10778b = activity;
        this.f10777a = view;
        this.f10782f = onGlobalLayoutListener;
    }

    /* JADX INFO: renamed from: c */
    public static ViewTreeObserver m4803c(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* JADX INFO: renamed from: a */
    public final void m4804a() {
        ViewTreeObserver viewTreeObserverM4803c;
        if (this.f10779c) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10782f;
        Activity activity = this.f10778b;
        if (activity != null && (viewTreeObserverM4803c = m4803c(activity)) != null) {
            viewTreeObserverM4803c.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        C3443qo c3443qo = C2330u.f10884a.f10886B;
        C3443qo.m8220a(this.f10777a, this.f10782f);
        this.f10779c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4805b() {
        Activity activity = this.f10778b;
        if (activity != null && this.f10779c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f10782f;
            ViewTreeObserver viewTreeObserverM4803c = m4803c(activity);
            if (viewTreeObserverM4803c != null) {
                C2253d c2253d = C2330u.f10884a.f10891f;
                viewTreeObserverM4803c.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f10779c = false;
        }
    }
}
