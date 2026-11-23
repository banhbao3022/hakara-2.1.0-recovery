package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p267a.p282z.AbstractC2314e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 extends AbstractC2314e<yq1> {

    /* JADX INFO: renamed from: x */
    public final int f19962x;

    public tq1(Context context, Looper looper, AbstractC2717c.a aVar, AbstractC2717c.b bVar, int i) {
        super(context, looper, 116, aVar, bVar);
        this.f19962x = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final yq1 m8446C() throws DeadObjectException {
        return (yq1) m5581u();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof yq1 ? (yq1) iInterfaceQueryLocalInterface : new yq1(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return this.f19962x;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.gass.START";
    }
}
