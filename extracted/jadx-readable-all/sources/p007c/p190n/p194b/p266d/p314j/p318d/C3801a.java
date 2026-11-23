package p007c.p190n.p194b.p266d.p314j.p318d;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import p007c.p190n.p194b.p266d.p285b.p286a.C2332b;
import p007c.p190n.p194b.p266d.p285b.p286a.C2333c;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i;
import p007c.p190n.p194b.p266d.p298f.p302q.C2720d;

/* JADX INFO: renamed from: c.n.b.d.j.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3801a extends AbstractC2735i<InterfaceC3802b> {

    /* JADX INFO: renamed from: A */
    public final Bundle f22468A;

    public C3801a(Context context, Looper looper, C2720d c2720d, C2333c c2333c, AbstractC2632e.a aVar, AbstractC2632e.b bVar) {
        super(context, looper, 16, c2720d, aVar, bVar);
        if (c2333c != null) {
            throw new NoSuchMethodError();
        }
        this.f22468A = new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: h */
    public final String mo4923h() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ IInterface mo4924i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3802b ? (InterfaceC3802b) iInterfaceQueryLocalInterface : new C3803c(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2735i, p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: k */
    public final int mo4925k() {
        return 12451000;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c, p007c.p190n.p194b.p266d.p298f.p299o.C2628a.f
    /* JADX INFO: renamed from: m */
    public final boolean mo5480m() {
        Set hashSet;
        C2720d c2720d = this.f11877x;
        Account account = c2720d.f11824a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        C2720d.b bVar = c2720d.f11827d.get(C2332b.f10926c);
        if (bVar == null || bVar.f11838a.isEmpty()) {
            hashSet = c2720d.f11825b;
        } else {
            hashSet = new HashSet(c2720d.f11825b);
            hashSet.addAll(bVar.f11838a);
        }
        return !hashSet.isEmpty();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: n */
    public final String mo4926n() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.AbstractC2717c
    /* JADX INFO: renamed from: s */
    public final Bundle mo5135s() {
        return this.f22468A;
    }
}
