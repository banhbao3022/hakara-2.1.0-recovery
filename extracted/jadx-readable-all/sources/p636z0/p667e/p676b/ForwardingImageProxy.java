package p636z0.p667e.p676b;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z0.e.b.z0, reason: use source file name */
/* JADX INFO: compiled from: ForwardingImageProxy.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingImageProxy implements ImageProxy {

    /* JADX INFO: renamed from: f */
    public final ImageProxy f36367f;

    /* JADX INFO: renamed from: g */
    public final Set<a> f36368g = new HashSet();

    /* JADX INFO: renamed from: z0.e.b.z0$a */
    /* JADX INFO: compiled from: ForwardingImageProxy.java */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo15277b(ImageProxy imageProxy);
    }

    public ForwardingImageProxy(ImageProxy imageProxy) {
        this.f36367f = imageProxy;
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: X */
    public synchronized void mo15261X(Rect rect) {
        this.f36367f.mo15261X(rect);
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: Z */
    public synchronized ImageInfo mo15262Z() {
        return this.f36367f.mo15262Z();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m15456a(a aVar) {
        this.f36368g.add(aVar);
    }

    @Override // p636z0.p667e.p676b.ImageProxy, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        synchronized (this) {
            this.f36367f.close();
        }
        synchronized (this) {
            hashSet = new HashSet(this.f36368g);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo15277b(this);
        }
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    public synchronized int getHeight() {
        return this.f36367f.getHeight();
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    public synchronized int getWidth() {
        return this.f36367f.getWidth();
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: j0 */
    public synchronized Image mo15263j0() {
        return this.f36367f.mo15263j0();
    }
}
