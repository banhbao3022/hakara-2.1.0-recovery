package p007c.p190n.p194b.p266d.p267a.p273d0.p274a;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3362oh;
import p007c.p190n.p194b.p266d.p314j.p315a.dv1;

/* JADX INFO: renamed from: c.n.b.d.a.d0.a.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2160r implements dv1<Uri> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3362oh f10517a;

    public C2160r(InterfaceC3362oh interfaceC3362oh) {
        this.f10517a = interfaceC3362oh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        try {
            InterfaceC3362oh interfaceC3362oh = this.f10517a;
            String strValueOf = String.valueOf(th.getMessage());
            interfaceC3362oh.mo7698S(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4617b(Uri uri) {
        try {
            this.f10517a.mo7699y5(Collections.singletonList(uri));
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
