package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.d.j.a.to */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3554to {

    /* JADX INFO: renamed from: f */
    public final WeakReference<View> f19927f;

    public AbstractC3554to(View view) {
        this.f19927f = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserver m8437a() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f19927f.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
