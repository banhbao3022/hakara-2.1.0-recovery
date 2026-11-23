package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ve */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3619ve extends AbstractBinderC2915ce {

    /* JADX INFO: renamed from: f */
    public final AbstractC2124r f20741f;

    public BinderC3619ve(AbstractC2124r abstractC2124r) {
        this.f20741f = abstractC2124r;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: C */
    public final void mo5962C() {
        Objects.requireNonNull(this.f20741f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: G1 */
    public final void mo5963G1(InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) {
        this.f20741f.mo2733a((View) BinderC2800b.m5639T1(interfaceC2799a), (HashMap) BinderC2800b.m5639T1(interfaceC2799a2), (HashMap) BinderC2800b.m5639T1(interfaceC2799a3));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: O */
    public final float mo5964O() {
        Objects.requireNonNull(this.f20741f);
        return 0.0f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: b0 */
    public final float mo5965b0() {
        Objects.requireNonNull(this.f20741f);
        return 0.0f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: c */
    public final String mo5966c() {
        return this.f20741f.f10453a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: d */
    public final List mo5967d() {
        List<AbstractC2201d> list = this.f20741f.f10454b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AbstractC2201d abstractC2201d : list) {
                arrayList.add(new BinderC3091h5(abstractC2201d.mo4640a(), abstractC2201d.mo4642c(), abstractC2201d.mo4641b(), abstractC2201d.mo4643d(), abstractC2201d.mo4644e()));
            }
        }
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: e0 */
    public final void mo5968e0(InterfaceC2799a interfaceC2799a) {
        AbstractC2124r abstractC2124r = this.f20741f;
        Objects.requireNonNull(abstractC2124r);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: f */
    public final String mo5969f() {
        return this.f20741f.f10455c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: g */
    public final InterfaceC3610v5 mo5970g() {
        AbstractC2201d abstractC2201d = this.f20741f.f10456d;
        if (abstractC2201d != null) {
            return new BinderC3091h5(abstractC2201d.mo4640a(), abstractC2201d.mo4642c(), abstractC2201d.mo4641b(), abstractC2201d.mo4643d(), abstractC2201d.mo4644e());
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: h */
    public final String mo5971h() {
        return this.f20741f.f10458f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: i */
    public final String mo5972i() {
        return this.f20741f.f10457e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: j */
    public final String mo5973j() {
        return this.f20741f.f10460h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: k */
    public final double mo5974k() {
        Double d = this.f20741f.f10459g;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: l */
    public final InterfaceC2799a mo5975l() {
        Objects.requireNonNull(this.f20741f);
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: m */
    public final String mo5976m() {
        return this.f20741f.f10461i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: n */
    public final InterfaceC2799a mo5977n() {
        Objects.requireNonNull(this.f20741f);
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: o */
    public final boolean mo5978o() {
        return this.f20741f.f10465m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: p */
    public final InterfaceC3087h1 mo5979p() {
        InterfaceC3087h1 interfaceC3087h1;
        C2193t c2193t = this.f20741f.f10462j;
        if (c2193t == null) {
            return null;
        }
        synchronized (c2193t.f10590a) {
            interfaceC3087h1 = c2193t.f10591b;
        }
        return interfaceC3087h1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: q */
    public final Bundle mo5980q() {
        return this.f20741f.f10464l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: q2 */
    public final void mo5981q2(InterfaceC2799a interfaceC2799a) {
        AbstractC2124r abstractC2124r = this.f20741f;
        Objects.requireNonNull(abstractC2124r);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: r */
    public final boolean mo5982r() {
        return this.f20741f.f10466n;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: u */
    public final InterfaceC3350o5 mo5983u() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: v */
    public final float mo5984v() {
        Objects.requireNonNull(this.f20741f);
        return 0.0f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: z */
    public final InterfaceC2799a mo5985z() {
        Object obj = this.f20741f.f10463k;
        if (obj == null) {
            return null;
        }
        return new BinderC2800b(obj);
    }
}
