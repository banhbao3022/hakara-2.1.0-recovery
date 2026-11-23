package p509g1.p510j0.p512e;

import java.io.IOException;
import p524h1.ForwardingSource;
import p524h1.Source;

/* JADX INFO: renamed from: g1.j0.e.f, reason: use source file name */
/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache3 extends ForwardingSource {

    /* JADX INFO: renamed from: g */
    public boolean f30153g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DiskLruCache2.c f30154h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Source f30155i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache3(DiskLruCache2.c cVar, Source source, Source source2) {
        super(source2);
        this.f30154h = cVar;
        this.f30155i = source;
    }

    @Override // p524h1.ForwardingSource, p524h1.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f30153g) {
            return;
        }
        this.f30153g = true;
        synchronized (this.f30154h.f30146j) {
            DiskLruCache2.c cVar = this.f30154h;
            int i = cVar.f30143g - 1;
            cVar.f30143g = i;
            if (i == 0 && cVar.f30141e) {
                cVar.f30146j.m13403f0(cVar);
            }
        }
    }
}
