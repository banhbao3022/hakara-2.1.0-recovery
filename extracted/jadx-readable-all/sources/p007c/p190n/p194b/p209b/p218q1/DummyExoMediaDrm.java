package p007c.p190n.p194b.p209b.p218q1;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.b.q1.z, reason: use source file name */
/* JADX INFO: compiled from: DummyExoMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: a */
    public void mo3651a() {
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: b */
    public Class<UnsupportedMediaCrypto> mo3652b() {
        return UnsupportedMediaCrypto.class;
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: c */
    public Map<String, String> mo3653c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: d */
    public ExoMediaCrypto mo3654d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: e */
    public ExoMediaDrm.e mo3655e() {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: f */
    public byte[] mo3656f() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: g */
    public void mo3657g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: h */
    public void mo3658h(byte[] bArr) {
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: i */
    public void mo3659i(ExoMediaDrm.c cVar) {
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: j */
    public byte[] mo3660j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: k */
    public void mo3661k(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    /* JADX INFO: renamed from: l */
    public ExoMediaDrm.b mo3662l(byte[] bArr, List<DrmInitData.b> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm
    public void release() {
    }
}
