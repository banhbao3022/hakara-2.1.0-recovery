package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;

/* JADX INFO: renamed from: c.n.b.d.f.q.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2763v<T extends IInterface> extends AbstractC2735i<T> {

    /* JADX INFO: renamed from: A */
    public final C2628a.h<T> f11924A;

    public C2763v(Context context, Looper looper, int i, AbstractC2632e.a aVar, AbstractC2632e.b bVar, C2720d c2720d, C2628a.h<T> hVar) {
        super(context, looper, i, c2720d, aVar, bVar);
        this.f11924A = hVar;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public String mo4923h() {
        return this.f11924A.m5482h();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public T mo4924i(IBinder iBinder) {
        return (T) this.f11924A.m5483i(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public String mo4926n() {
        return this.f11924A.m5484n();
    }
}
