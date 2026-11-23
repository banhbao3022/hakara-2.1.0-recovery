package p007c.p190n.p194b.p367f.p368a.p377h;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: c.n.b.f.a.h.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5156t implements InterfaceC5139c, InterfaceC5138b {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f26123a = new CountDownLatch(1);

    public /* synthetic */ C5156t(byte[] bArr) {
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5139c
    /* JADX INFO: renamed from: a */
    public final void mo11421a(Object obj) {
        this.f26123a.countDown();
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p377h.InterfaceC5138b
    /* JADX INFO: renamed from: c */
    public final void mo11426c(Exception exc) {
        this.f26123a.countDown();
    }
}
