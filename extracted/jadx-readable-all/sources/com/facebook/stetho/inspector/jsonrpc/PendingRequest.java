package com.facebook.stetho.inspector.jsonrpc;

/* JADX INFO: loaded from: classes.dex */
public class PendingRequest {
    public final PendingRequestCallback callback;
    public final long requestId;

    public PendingRequest(long j2, PendingRequestCallback pendingRequestCallback) {
        this.requestId = j2;
        this.callback = pendingRequestCallback;
    }
}
