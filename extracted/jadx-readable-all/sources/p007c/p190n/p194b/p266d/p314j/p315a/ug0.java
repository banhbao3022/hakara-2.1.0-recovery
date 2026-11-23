package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 extends AbstractBinderC3758z5 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wh0 {

    /* JADX INFO: renamed from: f */
    public final WeakReference<View> f20304f;

    /* JADX INFO: renamed from: g */
    public final Map<String, WeakReference<View>> f20305g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map<String, WeakReference<View>> f20306h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Map<String, WeakReference<View>> f20307i = new HashMap();

    /* JADX INFO: renamed from: j */
    public wf0 f20308j;

    /* JADX INFO: renamed from: k */
    public jp2 f20309k;

    public ug0(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2330u c2330u = C2330u.f10884a;
        C3443qo c3443qo = c2330u.f10886B;
        C3443qo.m8220a(view, this);
        C3443qo c3443qo2 = c2330u.f10886B;
        C3443qo.m8221b(view, this);
        this.f20304f = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f20305g.put(key, new WeakReference<>(value));
                if (!"1098".equals(key) && !"3011".equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f20307i.putAll(this.f20305g);
        for (Map.Entry<String, View> entry2 : map2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f20306h.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f20307i.putAll(this.f20306h);
        this.f20309k = new jp2(view.getContext(), view);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: E0 */
    public final FrameLayout mo8488E0() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: K2 */
    public final View mo8489K2() {
        return this.f20304f.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: T1 */
    public final synchronized void mo8490T1(String str, View view, boolean z) {
        this.f20307i.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f20305g.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: g */
    public final jp2 mo8491g() {
        return this.f20309k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: h */
    public final synchronized Map<String, WeakReference<View>> mo8492h() {
        return this.f20307i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: j */
    public final synchronized Map<String, WeakReference<View>> mo8493j() {
        return this.f20306h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo8494k() {
        return this.f20305g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: n */
    public final synchronized JSONObject mo8495n() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        wf0 wf0Var = this.f20308j;
        if (wf0Var != null) {
            wf0Var.m8638l(view, mo8489K2(), mo8492h(), mo8494k(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        wf0 wf0Var = this.f20308j;
        if (wf0Var != null) {
            wf0Var.m8639m(mo8489K2(), mo8492h(), mo8494k(), wf0.m8628n(mo8489K2()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        wf0 wf0Var = this.f20308j;
        if (wf0Var != null) {
            wf0Var.m8639m(mo8489K2(), mo8492h(), mo8494k(), wf0.m8628n(mo8489K2()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        wf0 wf0Var = this.f20308j;
        if (wf0Var != null) {
            View viewMo8489K2 = mo8489K2();
            synchronized (wf0Var) {
                wf0Var.f21053k.mo5742a(view, motionEvent, viewMo8489K2);
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: p */
    public final synchronized String mo8496p() {
        return "1007";
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: q3 */
    public final synchronized View mo8497q3(String str) {
        WeakReference<View> weakReference = this.f20307i.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: u */
    public final synchronized InterfaceC2799a mo8498u() {
        return null;
    }
}
