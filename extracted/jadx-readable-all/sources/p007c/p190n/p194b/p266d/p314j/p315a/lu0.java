package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2294r;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lu0 implements dv1<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3252li f16510a;

    public lu0(InterfaceC3252li interfaceC3252li) {
        this.f16510a = interfaceC3252li;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        try {
            InterfaceC3252li interfaceC3252li = this.f16510a;
            Parcelable.Creator<C2294r> creator = C2294r.CREATOR;
            yv2 yv2VarM5465z0 = C2622l.m5465z0(th);
            String message = th.getMessage();
            int i = fs1.f14109a;
            interfaceC3252li.mo7345o6(new C2294r(message == null || message.isEmpty() ? yv2VarM5465z0.f22117g : th.getMessage(), yv2VarM5465z0.f22116f));
        } catch (RemoteException e) {
            C2096e.m4554C("Service can't call client", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4617b(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.f16510a.mo7346t4(parcelFileDescriptor);
        } catch (RemoteException e) {
            C2096e.m4554C("Service can't call client", e);
        }
    }
}
