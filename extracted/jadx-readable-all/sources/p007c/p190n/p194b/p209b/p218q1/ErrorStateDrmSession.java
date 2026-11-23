package p007c.p190n.p194b.p209b.p218q1;

import java.util.Objects;
import java.util.UUID;
import p007c.p190n.p194b.p209b.C;

/* JADX INFO: renamed from: c.n.b.b.q1.a0, reason: use source file name */
/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorStateDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final DrmSession.a f7315a;

    public ErrorStateDrmSession(DrmSession.a aVar) {
        Objects.requireNonNull(aVar);
        this.f7315a = aVar;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: a */
    public void mo3645a(DrmSessionEventListener2.a aVar) {
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo3646b(DrmSessionEventListener2.a aVar) {
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: c */
    public final UUID mo3647c() {
        return C.f6403a;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: d */
    public boolean mo3648d() {
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: e */
    public ExoMediaCrypto mo3649e() {
        return null;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    /* JADX INFO: renamed from: f */
    public DrmSession.a mo3650f() {
        return this.f7315a;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSession
    public int getState() {
        return 1;
    }
}
