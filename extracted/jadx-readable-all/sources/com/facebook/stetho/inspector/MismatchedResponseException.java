package com.facebook.stetho.inspector;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class MismatchedResponseException extends MessageHandlingException {
    public long mRequestId;

    public MismatchedResponseException(long j2) {
        super(outline.m1595q("Response for request id ", j2, ", but no such request is pending"));
        this.mRequestId = j2;
    }

    public long getRequestId() {
        return this.mRequestId;
    }
}
