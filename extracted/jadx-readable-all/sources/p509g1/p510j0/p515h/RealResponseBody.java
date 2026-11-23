package p509g1.p510j0.p515h;

import p477d1.p493x.p495c.Intrinsics2;
import p509g1.MediaType2;
import p509g1.ResponseBody;
import p524h1.BufferedSource;

/* JADX INFO: renamed from: g1.j0.h.h, reason: use source file name */
/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: f */
    public final String f30296f;

    /* JADX INFO: renamed from: g */
    public final long f30297g;

    /* JADX INFO: renamed from: h */
    public final BufferedSource f30298h;

    public RealResponseBody(String str, long j2, BufferedSource bufferedSource) {
        Intrinsics2.m13090f(bufferedSource, "source");
        this.f30296f = str;
        this.f30297g = j2;
        this.f30298h = bufferedSource;
    }

    @Override // p509g1.ResponseBody
    public long contentLength() {
        return this.f30297g;
    }

    @Override // p509g1.ResponseBody
    public MediaType2 contentType() {
        String str = this.f30296f;
        if (str != null) {
            return MediaType2.f30664c.m13688b(str);
        }
        return null;
    }

    @Override // p509g1.ResponseBody
    public BufferedSource source() {
        return this.f30298h;
    }
}
