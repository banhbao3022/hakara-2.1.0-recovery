package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.MotionEvent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class od2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f17599f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17600g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17601h;

    public od2(int i, int i2, int i3) {
        this.f17599f = i;
        this.f17600g = i2;
        this.f17601h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pd2.f17936z.mo4852a(MotionEvent.obtain(0L, this.f17599f, 0, this.f17600g, this.f17601h, 0));
        } catch (Exception e) {
            pd2.f17931B.m7914c(2022, -1L, e);
        }
    }
}
