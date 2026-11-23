package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w92 extends a72 {

    /* JADX INFO: renamed from: f */
    public final y92 f21024f;

    /* JADX INFO: renamed from: g */
    public a72 f21025g = m8615b();

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ aa2 f21026h;

    public w92(aa2 aa2Var) {
        this.f21026h = aa2Var;
        this.f21024f = new y92(aa2Var, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a72
    /* JADX INFO: renamed from: a */
    public final byte mo5700a() {
        a72 a72Var = this.f21025g;
        if (a72Var == null) {
            throw new NoSuchElementException();
        }
        byte bMo5700a = a72Var.mo5700a();
        if (!this.f21025g.hasNext()) {
            this.f21025g = m8615b();
        }
        return bMo5700a;
    }

    /* JADX INFO: renamed from: b */
    public final a72 m8615b() {
        if (this.f21024f.hasNext()) {
            return new z62(this.f21024f.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21025g != null;
    }
}
