package p636z0.p765v;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: z0.v.b, reason: use source file name */
/* JADX INFO: compiled from: MediaSessionManagerImplApi28.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManagerImplApi28 extends MediaSessionManagerImplBase {
    public MediaSessionManagerImplApi28(String str, int i, int i2) {
        super(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public MediaSessionManagerImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}
