package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p325k.BinderC4274nc;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p194b.p266d.p314j.p325k.C4261n;
import p007c.p190n.p194b.p266d.p314j.p325k.C4275o;
import p007c.p190n.p194b.p266d.p314j.p325k.C4303q;
import p007c.p190n.p194b.p266d.p314j.p325k.C4317r;
import p007c.p190n.p194b.p266d.p314j.p325k.C4331s;
import p007c.p190n.p194b.p266d.p314j.p325k.C4345t;
import p007c.p190n.p194b.p266d.p314j.p325k.C4359u;
import p007c.p190n.p194b.p266d.p314j.p325k.C4411y;
import p007c.p190n.p194b.p266d.p327k.p328a.C4444a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ed */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2988ed extends AbstractBinderC3042fu {

    /* JADX INFO: renamed from: f */
    public final C4444a f13556f;

    public BinderC2988ed(C4444a c4444a) {
        this.f13556f = c4444a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: I */
    public final void mo6619I(String str) throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4317r(c4177h, str));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: M2 */
    public final void mo6620M2(InterfaceC2799a interfaceC2799a, String str, String str2) throws RemoteException {
        C4444a c4444a = this.f13556f;
        Activity activity = interfaceC2799a != null ? (Activity) BinderC2800b.m5639T1(interfaceC2799a) : null;
        C4177h c4177h = c4444a.f23687a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4261n(c4177h, activity, str, str2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: f0 */
    public final void mo6621f0(String str, String str2, Bundle bundle) throws RemoteException {
        this.f13556f.f23687a.m9639e(str, str2, bundle, true, true, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: j */
    public final String mo6622j() throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4345t(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: k */
    public final String mo6623k() throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4331s(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(50L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: m */
    public final long mo6624m() throws RemoteException {
        return this.f13556f.f23687a.m9642j();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: o */
    public final String mo6625o() throws RemoteException {
        return this.f13556f.f23687a.f23203j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: q */
    public final String mo6626q() throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4411y(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: s1 */
    public final void mo6627s1(Bundle bundle) throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4275o(c4177h, bundle));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: z */
    public final String mo6628z() throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4359u(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3079gu
    /* JADX INFO: renamed from: z0 */
    public final void mo6629z0(String str) throws RemoteException {
        C4177h c4177h = this.f13556f.f23687a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4303q(c4177h, str));
    }
}
