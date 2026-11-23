package p007c.p190n.p194b.p209b.p218q1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.p210a2.DefaultHttpDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.q1.r, reason: use source file name */
/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionManagerProvider implements DrmSessionManagerProvider {

    /* JADX INFO: renamed from: a */
    public final Object f7425a = new Object();

    /* JADX INFO: renamed from: b */
    public MediaItem2.e f7426b;

    /* JADX INFO: renamed from: c */
    public DrmSessionManager2 f7427c;

    @Override // p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider
    /* JADX INFO: renamed from: a */
    public DrmSessionManager2 mo3685a(MediaItem2 mediaItem2) {
        DrmSessionManager2 drmSessionManager2;
        Objects.requireNonNull(mediaItem2.f7466b);
        MediaItem2.e eVar = mediaItem2.f7466b.f7520c;
        if (eVar == null || Util6.f6307a < 18) {
            return DrmSessionManager2.f7442a;
        }
        synchronized (this.f7425a) {
            if (!Util6.m3113a(eVar, this.f7426b)) {
                this.f7426b = eVar;
                this.f7427c = m3686b(eVar);
            }
            drmSessionManager2 = this.f7427c;
            Objects.requireNonNull(drmSessionManager2);
        }
        return drmSessionManager2;
    }

    /* JADX INFO: renamed from: b */
    public final DrmSessionManager2 m3686b(MediaItem2.e eVar) {
        DefaultHttpDataSource.a aVar = new DefaultHttpDataSource.a();
        aVar.f6226b = null;
        Uri uri = eVar.f7506b;
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(uri == null ? null : uri.toString(), eVar.f7510f, aVar);
        for (Map.Entry<String, String> entry : eVar.f7507c.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Objects.requireNonNull(key);
            Objects.requireNonNull(value);
            synchronized (httpMediaDrmCallback.f7339d) {
                httpMediaDrmCallback.f7339d.put(key, value);
            }
        }
        DefaultDrmSessionManager.b bVar = new DefaultDrmSessionManager.b();
        UUID uuid = eVar.f7505a;
        int i = FrameworkMediaDrm.f7330a;
        C1672l c1672l = C1672l.f7354a;
        Objects.requireNonNull(uuid);
        bVar.f7414b = uuid;
        bVar.f7415c = c1672l;
        bVar.f7416d = eVar.f7508d;
        bVar.f7418f = eVar.f7509e;
        int[] iArrM11011r0 = C4799a.m11011r0(eVar.f7511g);
        for (int i2 : iArrM11011r0) {
            boolean z = true;
            if (i2 != 2 && i2 != 1) {
                z = false;
            }
            C2096e.m4566b(z);
        }
        int[] iArr = (int[]) iArrM11011r0.clone();
        bVar.f7417e = iArr;
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(bVar.f7414b, bVar.f7415c, httpMediaDrmCallback, bVar.f7413a, bVar.f7416d, iArr, bVar.f7418f, bVar.f7419g, bVar.f7420h);
        byte[] bArr = eVar.f7512h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        C2096e.m4570f(defaultDrmSessionManager.f7401m.isEmpty());
        defaultDrmSessionManager.f7410v = 0;
        defaultDrmSessionManager.f7411w = bArrCopyOf;
        return defaultDrmSessionManager;
    }
}
