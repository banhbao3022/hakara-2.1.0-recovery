package p636z0.p765v;

import android.os.Build;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: z0.v.a, reason: use source file name */
/* JADX INFO: compiled from: MediaSessionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {

    /* JADX INFO: renamed from: a */
    public MediaSessionManagerImplBase f38791a;

    public MediaSessionManager(String str, int i, int i2) {
        Objects.requireNonNull(str, "package shouldn't be null");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f38791a = new MediaSessionManagerImplApi28(str, i, i2);
        } else {
            this.f38791a = new MediaSessionManagerImplBase(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionManager) {
            return this.f38791a.equals(((MediaSessionManager) obj).f38791a);
        }
        return false;
    }

    public int hashCode() {
        return this.f38791a.hashCode();
    }

    public MediaSessionManager(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        Objects.requireNonNull(packageName, "package shouldn't be null");
        if (!TextUtils.isEmpty(packageName)) {
            this.f38791a = new MediaSessionManagerImplApi28(remoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
