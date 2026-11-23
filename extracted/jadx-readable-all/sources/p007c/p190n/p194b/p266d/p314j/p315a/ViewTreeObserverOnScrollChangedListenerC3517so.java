package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.d.j.a.so */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC3517so extends AbstractC3554to implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: g */
    public final WeakReference<ViewTreeObserver.OnScrollChangedListener> f19629g;

    public ViewTreeObserverOnScrollChangedListenerC3517so(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f19629g = new WeakReference<>(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f19629g.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        ViewTreeObserver viewTreeObserverM8437a = m8437a();
        if (viewTreeObserverM8437a != null) {
            viewTreeObserverM8437a.removeOnScrollChangedListener(this);
        }
    }
}
