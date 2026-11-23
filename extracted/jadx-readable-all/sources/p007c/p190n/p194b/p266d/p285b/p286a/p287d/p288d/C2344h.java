package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;
import p007c.p190n.p194b.p266d.p314j.p317c.C3793a;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2344h extends AbstractC2735i<InterfaceC2355s> {

    /* JADX INFO: renamed from: A */
    public final GoogleSignInOptions f10945A;

    public C2344h(Context context, Looper looper, C2720d c2720d, GoogleSignInOptions googleSignInOptions, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        super(context, looper, 91, c2720d, aVar, bVar);
        GoogleSignInOptions.C5890a c5890a = googleSignInOptions != null ? new GoogleSignInOptions.C5890a(googleSignInOptions) : new GoogleSignInOptions.C5890a();
        byte[] bArr = new byte[16];
        C3793a.f22463a.nextBytes(bArr);
        c5890a.f28532i = Base64.encodeToString(bArr, 11);
        if (!c2720d.f11826c.isEmpty()) {
            Iterator<Scope> it = c2720d.f11826c.iterator();
            while (it.hasNext()) {
                c5890a.f28524a.add(it.next());
                c5890a.f28524a.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f10945A = c5890a.m12643a();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2355s ? (InterfaceC2355s) iInterfaceQueryLocalInterface : new C2358v(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 12451000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
