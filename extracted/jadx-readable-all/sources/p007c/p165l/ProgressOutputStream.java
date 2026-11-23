package p007c.p165l;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.d0, reason: use source file name */
/* JADX INFO: compiled from: ProgressOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ProgressOutputStream extends FilterOutputStream implements RequestOutputStream {

    /* JADX INFO: renamed from: f */
    public final Map<GraphRequest2, RequestProgress> f4543f;

    /* JADX INFO: renamed from: g */
    public final GraphRequestBatch f4544g;

    /* JADX INFO: renamed from: h */
    public final long f4545h;

    /* JADX INFO: renamed from: i */
    public long f4546i;

    /* JADX INFO: renamed from: j */
    public long f4547j;

    /* JADX INFO: renamed from: k */
    public long f4548k;

    /* JADX INFO: renamed from: l */
    public RequestProgress f4549l;

    /* JADX INFO: renamed from: c.l.d0$a */
    /* JADX INFO: compiled from: ProgressOutputStream.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ GraphRequestBatch.b f4550f;

        public a(GraphRequestBatch.b bVar) {
            this.f4550f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            GraphRequestBatch.b bVar = this.f4550f;
            ProgressOutputStream progressOutputStream = ProgressOutputStream.this;
            bVar.m2703b(progressOutputStream.f4544g, progressOutputStream.f4546i, progressOutputStream.f4548k);
        }
    }

    public ProgressOutputStream(OutputStream outputStream, GraphRequestBatch graphRequestBatch, Map<GraphRequest2, RequestProgress> map, long j2) {
        super(outputStream);
        this.f4544g = graphRequestBatch;
        this.f4543f = map;
        this.f4548k = j2;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        this.f4545h = FacebookSdk.f5359h.get();
    }

    @Override // p007c.p165l.RequestOutputStream
    /* JADX INFO: renamed from: a */
    public void mo2257a(GraphRequest2 graphRequest2) {
        this.f4549l = graphRequest2 != null ? this.f4543f.get(graphRequest2) : null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2265c(long j2) {
        RequestProgress requestProgress = this.f4549l;
        if (requestProgress != null) {
            long j3 = requestProgress.f4566d + j2;
            requestProgress.f4566d = j3;
            if (j3 >= requestProgress.f4567e + requestProgress.f4565c || j3 >= requestProgress.f4568f) {
                requestProgress.m2267a();
            }
        }
        long j4 = this.f4546i + j2;
        this.f4546i = j4;
        if (j4 >= this.f4547j + this.f4545h || j4 >= this.f4548k) {
            m2266f();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<RequestProgress> it = this.f4543f.values().iterator();
        while (it.hasNext()) {
            it.next().m2267a();
        }
        m2266f();
    }

    /* JADX INFO: renamed from: f */
    public final void m2266f() {
        if (this.f4546i > this.f4547j) {
            for (GraphRequestBatch.a aVar : this.f4544g.f5405k) {
                if (aVar instanceof GraphRequestBatch.b) {
                    GraphRequestBatch graphRequestBatch = this.f4544g;
                    Handler handler = graphRequestBatch.f5401g;
                    GraphRequestBatch.b bVar = (GraphRequestBatch.b) aVar;
                    if (handler == null) {
                        bVar.m2703b(graphRequestBatch, this.f4546i, this.f4548k);
                    } else {
                        handler.post(new a(bVar));
                    }
                }
            }
            this.f4547j = this.f4546i;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        m2265c(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        m2265c(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        m2265c(1L);
    }
}
