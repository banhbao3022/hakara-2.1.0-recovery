package com.facebook.stetho.server;

import android.content.Context;
import android.net.Credentials;
import android.net.LocalSocket;
import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public abstract class SecureSocketHandler implements SocketHandler {
    private final Context mContext;

    public SecureSocketHandler(Context context) {
        this.mContext = context;
    }

    private static void enforcePermission(Context context, LocalSocket localSocket) throws IOException, PeerAuthorizationException {
        Credentials peerCredentials = localSocket.getPeerCredentials();
        int uid = peerCredentials.getUid();
        int pid = peerCredentials.getPid();
        if (LogUtil.isLoggable(2)) {
            LogUtil.m12608v("Got request from uid=%d, pid=%d", Integer.valueOf(uid), Integer.valueOf(pid));
        }
        if (context.checkPermission("android.permission.DUMP", pid, uid) == 0) {
            return;
        }
        StringBuilder sbM1559J = outline.m1559J("Peer pid=", pid, ", uid=", uid, " does not have ");
        sbM1559J.append("android.permission.DUMP");
        throw new PeerAuthorizationException(sbM1559J.toString());
    }

    @Override // com.facebook.stetho.server.SocketHandler
    public final void onAccepted(LocalSocket localSocket) throws IOException {
        try {
            enforcePermission(this.mContext, localSocket);
            onSecured(localSocket);
        } catch (PeerAuthorizationException e) {
            StringBuilder sbM1556G = outline.m1556G("Unauthorized request: ");
            sbM1556G.append(e.getMessage());
            LogUtil.m12599e(sbM1556G.toString());
        }
    }

    public abstract void onSecured(LocalSocket localSocket) throws IOException;
}
