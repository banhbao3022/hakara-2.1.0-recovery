package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2602b;

/* JADX INFO: renamed from: c.n.b.d.f.q.t0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2760t0 extends AbstractC2733h0 {

    /* JADX INFO: renamed from: g */
    public final IBinder f11916g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC2717c f11917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2760t0(AbstractC2717c abstractC2717c, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2717c, i, bundle);
        this.f11917h = abstractC2717c;
        this.f11916g = iBinder;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2733h0
    /* JADX INFO: renamed from: d */
    public final boolean mo5596d() {
        try {
            IBinder iBinder = this.f11916g;
            Objects.requireNonNull(iBinder, "null reference");
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f11917h.mo4923h().equals(interfaceDescriptor)) {
                String strMo4923h = this.f11917h.mo4923h();
                Log.e("GmsClient", outline.m1553D(new StringBuilder(String.valueOf(strMo4923h).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strMo4923h, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceMo4924i = this.f11917h.mo4924i(this.f11916g);
            if (iInterfaceMo4924i == null || !(AbstractC2717c.m5567A(this.f11917h, 2, 4, iInterfaceMo4924i) || AbstractC2717c.m5567A(this.f11917h, 3, 4, iInterfaceMo4924i))) {
                return false;
            }
            AbstractC2717c abstractC2717c = this.f11917h;
            abstractC2717c.f11818t = null;
            Bundle bundleMo5134r = abstractC2717c.mo5134r();
            AbstractC2717c.a aVar = this.f11917h.f11814p;
            if (aVar == null) {
                return true;
            }
            aVar.mo5563c0(bundleMo5134r);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2733h0
    /* JADX INFO: renamed from: e */
    public final void mo5597e(C2602b c2602b) {
        AbstractC2717c.b bVar = this.f11917h.f11815q;
        if (bVar != null) {
            bVar.mo5565W(c2602b);
        }
        this.f11917h.mo5136v(c2602b);
    }
}
