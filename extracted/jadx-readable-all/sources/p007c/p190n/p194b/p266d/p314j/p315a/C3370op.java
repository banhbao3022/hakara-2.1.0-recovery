package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.ViewGroup;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.op */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3370op {

    /* JADX INFO: renamed from: a */
    public final Context f17709a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3704xp f17710b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f17711c;

    /* JADX INFO: renamed from: d */
    public C3333np f17712d;

    public C3370op(Context context, ViewGroup viewGroup, InterfaceC3410ps interfaceC3410ps) {
        this.f17709a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f17711c = viewGroup;
        this.f17710b = interfaceC3410ps;
        this.f17712d = null;
    }

    /* JADX INFO: renamed from: a */
    public final C3333np m8050a() {
        C2622l.m5354d("getAdVideoUnderlay must be called from the UI thread.");
        return this.f17712d;
    }
}
