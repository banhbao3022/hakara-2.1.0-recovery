package p007c.p190n.p194b.p209b.p218q1;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import java.util.UUID;

/* JADX INFO: renamed from: c.n.b.b.q1.l */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1672l implements ExoMediaDrm.d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1672l f7354a = new C1672l();

    @Override // p007c.p190n.p194b.p209b.p218q1.ExoMediaDrm.d
    /* JADX INFO: renamed from: a */
    public final ExoMediaDrm mo3663a(UUID uuid) {
        int i = FrameworkMediaDrm.f7330a;
        try {
            try {
                return new FrameworkMediaDrm(uuid);
            } catch (UnsupportedDrmException unused) {
                Log.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new DummyExoMediaDrm();
            }
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }
}
