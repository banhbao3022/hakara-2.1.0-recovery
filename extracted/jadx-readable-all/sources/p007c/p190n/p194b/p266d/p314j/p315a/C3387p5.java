package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2200c;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.p5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3387p5 extends AbstractC2200c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3350o5 f17840a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC2201d> f17841b = new ArrayList();

    public C3387p5(InterfaceC3350o5 interfaceC3350o5) {
        IBinder iBinder;
        this.f17840a = interfaceC3350o5;
        try {
            interfaceC3350o5.mo6604a();
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
        try {
            for (InterfaceC3610v5 interfaceC3610v5 : interfaceC3350o5.mo6605b()) {
                InterfaceC3610v5 c3535t5 = null;
                if ((interfaceC3610v5 instanceof IBinder) && (iBinder = (IBinder) interfaceC3610v5) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    c3535t5 = iInterfaceQueryLocalInterface instanceof InterfaceC3610v5 ? (InterfaceC3610v5) iInterfaceQueryLocalInterface : new C3535t5(iBinder);
                }
                if (c3535t5 != null) {
                    this.f17841b.add(new C3647w5(c3535t5));
                }
            }
        } catch (RemoteException e2) {
            C2622l.m5438t3("", e2);
        }
    }
}
