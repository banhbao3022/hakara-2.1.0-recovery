package p007c.p190n.p385d.p386j;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.BinderC4274nc;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p194b.p266d.p314j.p325k.C4205j;
import p007c.p190n.p194b.p266d.p314j.p325k.C4247m;
import p007c.p190n.p194b.p266d.p314j.p325k.C4303q;
import p007c.p190n.p194b.p266d.p314j.p325k.C4317r;
import p007c.p190n.p194b.p266d.p314j.p325k.C4331s;
import p007c.p190n.p194b.p266d.p314j.p325k.C4345t;
import p007c.p190n.p194b.p266d.p314j.p325k.C4359u;
import p007c.p190n.p194b.p266d.p314j.p325k.C4411y;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7;

/* JADX INFO: renamed from: c.n.d.j.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5241c implements InterfaceC4489d7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4177h f26350a;

    public C5241c(C4177h c4177h) {
        this.f26350a = c4177h;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: E */
    public final int mo10495E(String str) {
        return this.f26350a.m9641i(str);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: V */
    public final void mo10496V(Bundle bundle) {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4205j(c4177h, bundle));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: a */
    public final String mo10497a() {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4411y(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: b */
    public final String mo10498b() {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4331s(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(50L);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: c */
    public final long mo10499c() {
        return this.f26350a.m9642j();
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: d */
    public final List<Bundle> mo10500d(String str, String str2) {
        return this.f26350a.m9640f(str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: e */
    public final String mo10501e() {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4345t(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: f */
    public final void mo10502f(String str) {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4317r(c4177h, str));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: g */
    public final Map<String, Object> mo10503g(String str, String str2, boolean z) {
        return this.f26350a.m9637c(str, str2, z);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: h */
    public final void mo10504h(String str, String str2, Bundle bundle) {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4247m(c4177h, str, str2, bundle));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: i */
    public final void mo10505i(String str, String str2, Bundle bundle) {
        this.f26350a.m9639e(str, str2, bundle, true, true, null);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    /* JADX INFO: renamed from: t */
    public final void mo10506t(String str) {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        c4177h.f23198e.execute(new C4303q(c4177h, str));
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4489d7
    public final String zza() {
        C4177h c4177h = this.f26350a;
        Objects.requireNonNull(c4177h);
        BinderC4274nc binderC4274nc = new BinderC4274nc();
        c4177h.f23198e.execute(new C4359u(c4177h, binderC4274nc));
        return binderC4274nc.m10099T1(500L);
    }
}
