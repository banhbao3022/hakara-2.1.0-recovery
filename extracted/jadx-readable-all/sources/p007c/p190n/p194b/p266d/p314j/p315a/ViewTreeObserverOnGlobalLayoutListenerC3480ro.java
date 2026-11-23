package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d;

/* JADX INFO: renamed from: c.n.b.d.j.a.ro */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3480ro extends AbstractC3554to implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g */
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f18978g;

    public ViewTreeObserverOnGlobalLayoutListenerC3480ro(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f18978g = new WeakReference<>(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: b */
    public final void m8302b(ViewTreeObserver viewTreeObserver) {
        C2253d c2253d = C2330u.f10884a.f10891f;
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f18978g.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        ViewTreeObserver viewTreeObserverM8437a = m8437a();
        if (viewTreeObserverM8437a != null) {
            m8302b(viewTreeObserverM8437a);
        }
    }
}
