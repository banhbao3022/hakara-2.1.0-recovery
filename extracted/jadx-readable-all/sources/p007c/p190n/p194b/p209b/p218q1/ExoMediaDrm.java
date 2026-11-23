package p007c.p190n.p194b.p209b.p218q1;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: c.n.b.b.q1.c0, reason: use source file name */
/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes.dex */
public interface ExoMediaDrm {

    /* JADX INFO: renamed from: c.n.b.b.q1.c0$a */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class a implements d {

        /* JADX INFO: renamed from: a */
        public final ExoMediaDrm f7318a;

        public a(ExoMediaDrm exoMediaDrm) {
            this.f7318a = exoMediaDrm;
        }

        @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm.d
        /* JADX INFO: renamed from: a */
        public ExoMediaDrm mo3663a(UUID uuid) {
            this.f7318a.mo3651a();
            return this.f7318a;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.c0$b */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final byte[] f7319a;

        /* JADX INFO: renamed from: b */
        public final String f7320b;

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public b(byte[] bArr, String str, int i) {
            this.f7319a = bArr;
            this.f7320b = str;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.c0$c */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface c {
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.c0$d */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        ExoMediaDrm mo3663a(UUID uuid);
    }

    /* JADX INFO: renamed from: c.n.b.b.q1.c0$e */
    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final byte[] f7321a;

        /* JADX INFO: renamed from: b */
        public final String f7322b;

        public e(byte[] bArr, String str) {
            this.f7321a = bArr;
            this.f7322b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo3651a();

    /* JADX INFO: renamed from: b */
    Class<? extends ExoMediaCrypto> mo3652b();

    /* JADX INFO: renamed from: c */
    Map<String, String> mo3653c(byte[] bArr);

    /* JADX INFO: renamed from: d */
    ExoMediaCrypto mo3654d(byte[] bArr) throws MediaCryptoException;

    /* JADX INFO: renamed from: e */
    e mo3655e();

    /* JADX INFO: renamed from: f */
    byte[] mo3656f() throws MediaDrmException;

    /* JADX INFO: renamed from: g */
    void mo3657g(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: h */
    void mo3658h(byte[] bArr);

    /* JADX INFO: renamed from: i */
    void mo3659i(c cVar);

    /* JADX INFO: renamed from: j */
    byte[] mo3660j(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    /* JADX INFO: renamed from: k */
    void mo3661k(byte[] bArr) throws DeniedByServerException;

    /* JADX INFO: renamed from: l */
    b mo3662l(byte[] bArr, List<DrmInitData.b> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    void release();
}
