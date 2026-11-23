package com.facebook.stetho.server;

import com.facebook.stetho.common.LogUtil;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class ServerManager {
    private static final String THREAD_PREFIX = "StethoListener";
    private final LocalSocketServer mServer;
    private volatile boolean mStarted;

    public ServerManager(LocalSocketServer localSocketServer) {
        this.mServer = localSocketServer;
    }

    private void startServer(final LocalSocketServer localSocketServer) {
        StringBuilder sbM1556G = outline.m1556G("StethoListener-");
        sbM1556G.append(localSocketServer.getName());
        new Thread(sbM1556G.toString()) { // from class: com.facebook.stetho.server.ServerManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    localSocketServer.run();
                } catch (IOException e) {
                    LogUtil.m12602e(e, "Could not start Stetho server: %s", localSocketServer.getName());
                }
            }
        }.start();
    }

    public void start() {
        if (this.mStarted) {
            throw new IllegalStateException("Already started");
        }
        this.mStarted = true;
        startServer(this.mServer);
    }
}
