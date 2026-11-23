package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: c.n.b.d.j.a.qo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3443qo {
    /* JADX INFO: renamed from: a */
    public static final void m8220a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserverOnGlobalLayoutListenerC3480ro viewTreeObserverOnGlobalLayoutListenerC3480ro = new ViewTreeObserverOnGlobalLayoutListenerC3480ro(view, onGlobalLayoutListener);
        ViewTreeObserver viewTreeObserverM8437a = viewTreeObserverOnGlobalLayoutListenerC3480ro.m8437a();
        if (viewTreeObserverM8437a != null) {
            viewTreeObserverM8437a.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3480ro);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8221b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ViewTreeObserverOnScrollChangedListenerC3517so viewTreeObserverOnScrollChangedListenerC3517so = new ViewTreeObserverOnScrollChangedListenerC3517so(view, onScrollChangedListener);
        ViewTreeObserver viewTreeObserverM8437a = viewTreeObserverOnScrollChangedListenerC3517so.m8437a();
        if (viewTreeObserverM8437a != null) {
            viewTreeObserverM8437a.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC3517so);
        }
    }
}
