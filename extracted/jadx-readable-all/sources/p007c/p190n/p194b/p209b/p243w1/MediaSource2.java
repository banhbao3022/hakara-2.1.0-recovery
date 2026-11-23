package p007c.p190n.p194b.p209b.p243w1;

import android.os.Handler;
import java.io.IOException;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;

/* JADX INFO: renamed from: c.n.b.b.w1.e0, reason: use source file name */
/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public interface MediaSource2 {

    /* JADX INFO: renamed from: c.n.b.b.w1.e0$a */
    /* JADX INFO: compiled from: MediaSource.java */
    public static final class a extends MediaPeriodId {
        public a(Object obj) {
            super(obj);
        }

        /* JADX INFO: renamed from: b */
        public a m4097b(Object obj) {
            return new a(this.f8857a.equals(obj) ? this : new MediaPeriodId(obj, this.f8858b, this.f8859c, this.f8860d, this.f8861e));
        }

        public a(Object obj, long j2) {
            super(obj, j2);
        }

        public a(Object obj, long j2, int i) {
            super(obj, j2, i);
        }

        public a(Object obj, int i, int i2, long j2) {
            super(obj, i, i2, j2);
        }

        public a(MediaPeriodId mediaPeriodId) {
            super(mediaPeriodId);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.e0$b */
    /* JADX INFO: compiled from: MediaSource.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4067a(MediaSource2 mediaSource2, Timeline timeline);
    }

    /* JADX INFO: renamed from: a */
    MediaPeriod mo4084a(a aVar, Allocator allocator, long j2);

    /* JADX INFO: renamed from: b */
    void mo4085b(b bVar);

    /* JADX INFO: renamed from: c */
    void mo4086c(Handler handler, MediaSourceEventListener mediaSourceEventListener);

    /* JADX INFO: renamed from: d */
    void mo4087d(MediaSourceEventListener mediaSourceEventListener);

    /* JADX INFO: renamed from: e */
    void mo4088e(b bVar);

    /* JADX INFO: renamed from: f */
    MediaItem2 mo4089f();

    /* JADX INFO: renamed from: g */
    void mo4090g(Handler handler, DrmSessionEventListener2 drmSessionEventListener2);

    /* JADX INFO: renamed from: h */
    void mo4091h() throws IOException;

    /* JADX INFO: renamed from: i */
    boolean mo4092i();

    /* JADX INFO: renamed from: j */
    void mo4093j(MediaPeriod mediaPeriod);

    /* JADX INFO: renamed from: m */
    Timeline mo4094m();

    /* JADX INFO: renamed from: n */
    void mo4095n(b bVar, TransferListener transferListener);

    /* JADX INFO: renamed from: o */
    void mo4096o(b bVar);
}
