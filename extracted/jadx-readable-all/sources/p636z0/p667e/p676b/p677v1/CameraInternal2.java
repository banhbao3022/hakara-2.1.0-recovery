package p636z0.p667e.p676b.p677v1;

import java.util.Collection;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.CameraInfo;
import p636z0.p667e.p676b.UseCase;

/* JADX INFO: renamed from: z0.e.b.v1.b0, reason: use source file name */
/* JADX INFO: compiled from: CameraInternal.java */
/* JADX INFO: loaded from: classes.dex */
public interface CameraInternal2 extends Camera2, UseCase.b {

    /* JADX INFO: renamed from: z0.e.b.v1.b0$a */
    /* JADX INFO: compiled from: CameraInternal.java */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);


        /* JADX INFO: renamed from: n */
        public final boolean f36109n;

        a(boolean z) {
            this.f36109n = z;
        }
    }

    /* JADX INFO: renamed from: e */
    CameraControlInternal mo15162e();

    /* JADX INFO: renamed from: f */
    CameraInfo mo15163f();

    /* JADX INFO: renamed from: g */
    void mo15164g(Collection<UseCase> collection);

    /* JADX INFO: renamed from: h */
    void mo15165h(Collection<UseCase> collection);

    /* JADX INFO: renamed from: i */
    CameraInfoInternal mo15166i();

    ListenableFuture<Void> release();
}
