package p007c.p190n.p194b.p266d.p314j.p317c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p285b.p286a.C2331a;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;

/* JADX INFO: renamed from: c.n.b.d.j.c.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3798f extends AbstractC2735i<InterfaceC3800h> {

    /* JADX INFO: renamed from: A */
    public final C2331a.a f22467A;

    public C3798f(Context context, Looper looper, C2720d c2720d, C2331a.a aVar, AbstractC2632e.a aVar2, AbstractC2632e.b bVar) {
        super(context, looper, 68, c2720d, aVar2, bVar);
        C2331a.a.C8514a c8514a = new C2331a.a.C8514a(aVar == null ? C2331a.a.f10917f : aVar);
        byte[] bArr = new byte[16];
        C3793a.f22463a.nextBytes(bArr);
        c8514a.f10923c = Base64.encodeToString(bArr, 11);
        this.f22467A = new C2331a.a(c8514a);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3800h ? (InterfaceC3800h) iInterfaceQueryLocalInterface : new C3799g(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 12800000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: s */
    public final Bundle mo5135s() {
        C2331a.a aVar = this.f22467A;
        Objects.requireNonNull(aVar);
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", aVar.f10918g);
        bundle.putBoolean("force_save_dialog", aVar.f10919h);
        bundle.putString("log_session_id", aVar.f10920i);
        return bundle;
    }
}
