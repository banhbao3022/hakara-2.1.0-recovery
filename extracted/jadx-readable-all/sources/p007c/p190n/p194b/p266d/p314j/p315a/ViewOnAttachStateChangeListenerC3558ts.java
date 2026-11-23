package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.View;

/* JADX INFO: renamed from: c.n.b.d.j.a.ts */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3558ts implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2884bl f19976f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3670ws f19977g;

    public ViewOnAttachStateChangeListenerC3558ts(C3670ws c3670ws, InterfaceC2884bl interfaceC2884bl) {
        this.f19977g = c3670ws;
        this.f19976f = interfaceC2884bl;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f19977g.m8677c(view, this.f19976f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
