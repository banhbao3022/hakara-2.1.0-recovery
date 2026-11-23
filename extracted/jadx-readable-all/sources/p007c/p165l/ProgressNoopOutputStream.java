package p007c.p165l;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.l.c0, reason: use source file name */
/* JADX INFO: compiled from: ProgressNoopOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ProgressNoopOutputStream extends OutputStream implements RequestOutputStream {

    /* JADX INFO: renamed from: f */
    public final Map<GraphRequest2, RequestProgress> f4515f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Handler f4516g;

    /* JADX INFO: renamed from: h */
    public GraphRequest2 f4517h;

    /* JADX INFO: renamed from: i */
    public RequestProgress f4518i;

    /* JADX INFO: renamed from: j */
    public int f4519j;

    public ProgressNoopOutputStream(Handler handler) {
        this.f4516g = handler;
    }

    @Override // p007c.p165l.RequestOutputStream
    /* JADX INFO: renamed from: a */
    public void mo2257a(GraphRequest2 graphRequest2) {
        this.f4517h = graphRequest2;
        this.f4518i = graphRequest2 != null ? this.f4515f.get(graphRequest2) : null;
    }

    /* JADX INFO: renamed from: c */
    public void m2258c(long j2) {
        if (this.f4518i == null) {
            RequestProgress requestProgress = new RequestProgress(this.f4516g, this.f4517h);
            this.f4518i = requestProgress;
            this.f4515f.put(this.f4517h, requestProgress);
        }
        this.f4518i.f4568f += j2;
        this.f4519j = (int) (((long) this.f4519j) + j2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        m2258c(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        m2258c(i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m2258c(1L);
    }
}
