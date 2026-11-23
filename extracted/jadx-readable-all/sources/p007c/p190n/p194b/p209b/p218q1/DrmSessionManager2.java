package p007c.p190n.p194b.p209b.p218q1;

import android.os.Looper;
import p007c.p190n.p194b.p209b.Format;

/* JADX INFO: renamed from: c.n.b.b.q1.x, reason: use source file name */
/* JADX INFO: compiled from: DrmSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public interface DrmSessionManager2 {

    /* JADX INFO: renamed from: a */
    public static final DrmSessionManager2 f7442a = new a();

    /* JADX INFO: renamed from: c.n.b.b.q1.x$a */
    /* JADX INFO: compiled from: DrmSessionManager.java */
    public class a implements DrmSessionManager2 {
        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
        /* JADX INFO: renamed from: a */
        public DrmSession mo3679a(Looper looper, DrmSessionEventListener2.a aVar, Format format) {
            if (format.f6937t == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.a(new UnsupportedDrmException(1)));
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
        /* JADX INFO: renamed from: b */
        public Class<UnsupportedMediaCrypto> mo3680b(Format format) {
            if (format.f6937t != null) {
                return UnsupportedMediaCrypto.class;
            }
            return null;
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
        public /* synthetic */ void prepare() {
            DrmSessionManager.m3702a(this);
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2
        public /* synthetic */ void release() {
            DrmSessionManager.m3703b(this);
        }
    }

    /* JADX INFO: renamed from: a */
    DrmSession mo3679a(Looper looper, DrmSessionEventListener2.a aVar, Format format);

    /* JADX INFO: renamed from: b */
    Class<? extends ExoMediaCrypto> mo3680b(Format format);

    void prepare();

    void release();
}
