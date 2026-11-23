package p623k1;

import java.util.Objects;

/* JADX INFO: renamed from: k1.j, reason: use source file name */
/* JADX INFO: compiled from: HttpException.java */
/* JADX INFO: loaded from: classes2.dex */
public class HttpException2 extends RuntimeException {

    /* JADX INFO: renamed from: f */
    public final int f33164f;

    /* JADX INFO: renamed from: g */
    public final transient Response4<?> f33165g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException2(Response4<?> response4) {
        super("HTTP " + response4.f33292a.f29993j + " " + response4.f33292a.f29992i);
        Objects.requireNonNull(response4, "response == null");
        this.f33164f = response4.f33292a.f29993j;
        this.f33165g = response4;
    }
}
