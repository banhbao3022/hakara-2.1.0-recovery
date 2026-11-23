package p623k1;

import p509g1.Response3;
import p509g1.ResponseBody;

/* JADX INFO: renamed from: k1.y, reason: use source file name */
/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes2.dex */
public final class Response4<T> {

    /* JADX INFO: renamed from: a */
    public final Response3 f33292a;

    /* JADX INFO: renamed from: b */
    public final T f33293b;

    /* JADX INFO: renamed from: c */
    public final ResponseBody f33294c;

    public Response4(Response3 response3, T t, ResponseBody responseBody) {
        this.f33292a = response3;
        this.f33293b = t;
        this.f33294c = responseBody;
    }

    /* JADX INFO: renamed from: b */
    public static <T> Response4<T> m14314b(T t, Response3 response3) {
        if (response3.m13338f()) {
            return new Response4<>(response3, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* JADX INFO: renamed from: a */
    public boolean m14315a() {
        return this.f33292a.m13338f();
    }

    public String toString() {
        return this.f33292a.toString();
    }
}
