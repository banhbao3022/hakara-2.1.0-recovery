package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3362oh;
import p007c.p190n.p194b.p266d.p314j.p315a.dv1;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2159q implements dv1<ArrayList<Uri>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3362oh f10516a;

    public C2159q(InterfaceC3362oh interfaceC3362oh) {
        this.f10516a = interfaceC3362oh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        try {
            InterfaceC3362oh interfaceC3362oh = this.f10516a;
            String strValueOf = String.valueOf(th.getMessage());
            interfaceC3362oh.mo7698S(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4617b(ArrayList<Uri> arrayList) {
        try {
            this.f10516a.mo7699y5(arrayList);
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
