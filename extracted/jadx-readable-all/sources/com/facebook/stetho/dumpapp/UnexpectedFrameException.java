package com.facebook.stetho.dumpapp;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b, byte b2) {
        super(outline.m1593o("Expected '", b, "', got: '", b2, "'"));
    }
}
