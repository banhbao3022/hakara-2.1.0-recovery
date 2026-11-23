package p007c.p085g.p086a.p089m;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.e, reason: use source file name */
/* JADX INFO: compiled from: HttpException.java */
/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int i) {
        this(outline.m1590l("Http request failed with status code: ", i), i);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(String str, int i, Throwable th) {
        super(str, th);
    }
}
