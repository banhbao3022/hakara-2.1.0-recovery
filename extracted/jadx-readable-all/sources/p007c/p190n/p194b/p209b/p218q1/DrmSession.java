package p007c.p190n.p194b.p209b.p218q1;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: c.n.b.b.q1.t, reason: use source file name */
/* JADX INFO: compiled from: DrmSession.java */
/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    /* JADX INFO: renamed from: c.n.b.b.q1.t$a */
    /* JADX INFO: compiled from: DrmSession.java */
    public static class a extends IOException {
        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo3645a(DrmSessionEventListener2.a aVar);

    /* JADX INFO: renamed from: b */
    void mo3646b(DrmSessionEventListener2.a aVar);

    /* JADX INFO: renamed from: c */
    UUID mo3647c();

    /* JADX INFO: renamed from: d */
    boolean mo3648d();

    /* JADX INFO: renamed from: e */
    ExoMediaCrypto mo3649e();

    /* JADX INFO: renamed from: f */
    a mo3650f();

    int getState();
}
