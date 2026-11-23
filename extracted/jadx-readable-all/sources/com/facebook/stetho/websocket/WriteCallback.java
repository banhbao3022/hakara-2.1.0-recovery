package com.facebook.stetho.websocket;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface WriteCallback {
    void onFailure(IOException iOException);

    void onSuccess();
}
