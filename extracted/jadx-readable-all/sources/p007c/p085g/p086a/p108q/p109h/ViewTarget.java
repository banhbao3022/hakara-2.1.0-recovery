package p007c.p085g.p086a.p108q.p109h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p108q.Request2;
import p007c.p085g.p086a.p108q.SingleRequest;

/* JADX INFO: renamed from: c.g.a.q.h.j, reason: use source file name */
/* JADX INFO: compiled from: ViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* JADX INFO: renamed from: g */
    public final T f3783g;

    /* JADX INFO: renamed from: h */
    public final a f3784h;

    /* JADX INFO: renamed from: c.g.a.q.h.j$a */
    /* JADX INFO: compiled from: ViewTarget.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static Integer f3785a;

        /* JADX INFO: renamed from: b */
        public final View f3786b;

        /* JADX INFO: renamed from: c */
        public final List<SizeReadyCallback> f3787c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public boolean f3788d;

        /* JADX INFO: renamed from: e */
        public ViewTreeObserverOnPreDrawListenerC8506a f3789e;

        /* JADX INFO: renamed from: c.g.a.q.h.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewTarget.java */
        public static final class ViewTreeObserverOnPreDrawListenerC8506a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: f */
            public final WeakReference<a> f3790f;

            public ViewTreeObserverOnPreDrawListenerC8506a(a aVar) {
                this.f3790f = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f3790f.get();
                if (aVar == null || aVar.f3787c.isEmpty()) {
                    return true;
                }
                int iM2029d = aVar.m2029d();
                int iM2028c = aVar.m2028c();
                if (!aVar.m2030e(iM2029d, iM2028c)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f3787c).iterator();
                while (it.hasNext()) {
                    ((SizeReadyCallback) it.next()).mo2005a(iM2029d, iM2028c);
                }
                aVar.m2026a();
                return true;
            }
        }

        public a(View view) {
            this.f3786b = view;
        }

        /* JADX INFO: renamed from: a */
        public void m2026a() {
            ViewTreeObserver viewTreeObserver = this.f3786b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3789e);
            }
            this.f3789e = null;
            this.f3787c.clear();
        }

        /* JADX INFO: renamed from: b */
        public final int m2027b(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f3788d && this.f3786b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f3786b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f3786b.getContext();
            if (f3785a == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3785a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3785a.intValue();
        }

        /* JADX INFO: renamed from: c */
        public final int m2028c() {
            int paddingBottom = this.f3786b.getPaddingBottom() + this.f3786b.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f3786b.getLayoutParams();
            return m2027b(this.f3786b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        /* JADX INFO: renamed from: d */
        public final int m2029d() {
            int paddingRight = this.f3786b.getPaddingRight() + this.f3786b.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f3786b.getLayoutParams();
            return m2027b(this.f3786b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        /* JADX INFO: renamed from: e */
        public final boolean m2030e(int i, int i2) {
            if (i > 0 || i == Integer.MIN_VALUE) {
                if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public ViewTarget(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f3783g = t;
        this.f3784h = new a(t);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: a */
    public void mo2023a(SizeReadyCallback sizeReadyCallback) {
        this.f3784h.f3787c.remove(sizeReadyCallback);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: c */
    public void mo2018c(Request2 request2) {
        this.f3783g.setTag(R.id.glide_custom_view_target_tag, request2);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: f */
    public void mo2020f(Drawable drawable) {
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: g */
    public Request2 mo2021g() {
        Object tag = this.f3783g.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request2) {
            return (Request2) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p007c.p085g.p086a.p108q.p109h.BaseTarget, p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: h */
    public void mo1933h(Drawable drawable) {
        this.f3784h.m2026a();
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: i */
    public void mo2024i(SizeReadyCallback sizeReadyCallback) throws Throwable {
        a aVar = this.f3784h;
        int iM2029d = aVar.m2029d();
        int iM2028c = aVar.m2028c();
        if (aVar.m2030e(iM2029d, iM2028c)) {
            ((SingleRequest) sizeReadyCallback).mo2005a(iM2029d, iM2028c);
            return;
        }
        if (!aVar.f3787c.contains(sizeReadyCallback)) {
            aVar.f3787c.add(sizeReadyCallback);
        }
        if (aVar.f3789e == null) {
            ViewTreeObserver viewTreeObserver = aVar.f3786b.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC8506a viewTreeObserverOnPreDrawListenerC8506a = new a.ViewTreeObserverOnPreDrawListenerC8506a(aVar);
            aVar.f3789e = viewTreeObserverOnPreDrawListenerC8506a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8506a);
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Target for: ");
        sbM1556G.append(this.f3783g);
        return sbM1556G.toString();
    }

    @Deprecated
    public ViewTarget(T t, boolean z) {
        this(t);
        if (z) {
            this.f3784h.f3788d = true;
        }
    }
}
