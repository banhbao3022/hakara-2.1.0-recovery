package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2275k0;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2231n extends AbstractC2245a0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC2232o f10653b;

    public /* synthetic */ C2231n(BinderC2232o binderC2232o) {
        this.f10653b = binderC2232o;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0
    /* JADX INFO: renamed from: a */
    public final void mo4671a() {
        C2330u c2330u = C2330u.f10884a;
        C2275k0 c2275k0 = c2330u.f10907v;
        Bitmap bitmap = c2275k0.f10732a.get(Integer.valueOf(this.f10653b.f10659i.f28481t.f10862k));
        if (bitmap != null) {
            C2253d c2253d = c2330u.f10891f;
            BinderC2232o binderC2232o = this.f10653b;
            Activity activity = binderC2232o.f10658h;
            C2321l c2321l = binderC2232o.f10659i.f28481t;
            final Drawable drawableMo4715d = c2253d.mo4715d(activity, bitmap, c2321l.f10860i, c2321l.f10861j);
            C2267h1.f10713a.post(new Runnable(this, drawableMo4715d) { // from class: c.n.b.d.a.z.a.m

                /* JADX INFO: renamed from: f */
                public final C2231n f10651f;

                /* JADX INFO: renamed from: g */
                public final Drawable f10652g;

                {
                    this.f10651f = this;
                    this.f10652g = drawableMo4715d;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2231n c2231n = this.f10651f;
                    c2231n.f10653b.f10658h.getWindow().setBackgroundDrawable(this.f10652g);
                }
            });
        }
    }
}
