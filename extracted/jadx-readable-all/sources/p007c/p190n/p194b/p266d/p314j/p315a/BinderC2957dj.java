package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.dj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2957dj extends AbstractBinderC3031fj {

    /* JADX INFO: renamed from: f */
    public final String f13282f;

    /* JADX INFO: renamed from: g */
    public final int f13283g;

    public BinderC2957dj(String str, int i) {
        this.f13282f = str;
        this.f13283g = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof BinderC2957dj)) {
            BinderC2957dj binderC2957dj = (BinderC2957dj) obj;
            if (C2622l.m5459y(this.f13282f, binderC2957dj.f13282f) && C2622l.m5459y(Integer.valueOf(this.f13283g), Integer.valueOf(binderC2957dj.f13283g))) {
                return true;
            }
        }
        return false;
    }
}
