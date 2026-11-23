package p509g1;

import java.io.IOException;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.BufferedSink;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.e0, reason: use source file name */
/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RequestBody2 extends RequestBody {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteString3 f29987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MediaType2 f29988c;

    public RequestBody2(ByteString3 byteString3, MediaType2 mediaType2) {
        this.f29987b = byteString3;
        this.f29988c = mediaType2;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo13326a() {
        return this.f29987b.mo13765j();
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType2 mo13327b() {
        return this.f29988c;
    }

    @Override // p509g1.RequestBody
    /* JADX INFO: renamed from: d */
    public void mo13328d(BufferedSink bufferedSink) throws IOException {
        Intrinsics2.m13090f(bufferedSink, "sink");
        bufferedSink.mo13749m0(this.f29987b);
    }
}
