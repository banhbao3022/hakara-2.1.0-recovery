package p500e1.p501a;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: e1.a.n0 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6287n0 implements InterfaceC6317x0 {

    /* JADX INFO: renamed from: f */
    public final boolean f29775f;

    public C6287n0(boolean z) {
        this.f29775f = z;
    }

    @Override // p500e1.p501a.InterfaceC6317x0
    /* JADX INFO: renamed from: a */
    public boolean mo13216a() {
        return this.f29775f;
    }

    @Override // p500e1.p501a.InterfaceC6317x0
    /* JADX INFO: renamed from: e */
    public C6282l1 mo13217e() {
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Empty{");
        sbM1556G.append(this.f29775f ? "Active" : "New");
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
