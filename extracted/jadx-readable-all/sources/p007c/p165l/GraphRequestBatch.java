package p007c.p165l;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c.l.v, reason: use source file name */
/* JADX INFO: compiled from: GraphRequestBatch.java */
/* JADX INFO: loaded from: classes.dex */
public class GraphRequestBatch extends AbstractList<GraphRequest2> {

    /* JADX INFO: renamed from: f */
    public static AtomicInteger f5400f = new AtomicInteger();

    /* JADX INFO: renamed from: g */
    public Handler f5401g;

    /* JADX INFO: renamed from: h */
    public List<GraphRequest2> f5402h;

    /* JADX INFO: renamed from: i */
    public int f5403i;

    /* JADX INFO: renamed from: j */
    public final String f5404j;

    /* JADX INFO: renamed from: k */
    public List<a> f5405k;

    /* JADX INFO: renamed from: c.l.v$a */
    /* JADX INFO: compiled from: GraphRequestBatch.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2264a(GraphRequestBatch graphRequestBatch);
    }

    /* JADX INFO: renamed from: c.l.v$b */
    /* JADX INFO: compiled from: GraphRequestBatch.java */
    public interface b extends a {
        /* JADX INFO: renamed from: b */
        void m2703b(GraphRequestBatch graphRequestBatch, long j2, long j3);
    }

    public GraphRequestBatch() {
        this.f5402h = new ArrayList();
        this.f5403i = 0;
        this.f5404j = Integer.valueOf(f5400f.incrementAndGet()).toString();
        this.f5405k = new ArrayList();
        this.f5402h = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        this.f5402h.add(i, (GraphRequest2) obj);
    }

    /* JADX INFO: renamed from: c */
    public final GraphRequest2 m2702c(int i) {
        return this.f5402h.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f5402h.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.f5402h.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.f5402h.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        return this.f5402h.set(i, (GraphRequest2) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5402h.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        return this.f5402h.add((GraphRequest2) obj);
    }

    public GraphRequestBatch(Collection<GraphRequest2> collection) {
        this.f5402h = new ArrayList();
        this.f5403i = 0;
        this.f5404j = Integer.valueOf(f5400f.incrementAndGet()).toString();
        this.f5405k = new ArrayList();
        this.f5402h = new ArrayList(collection);
    }

    public GraphRequestBatch(GraphRequest2... graphRequest2Arr) {
        this.f5402h = new ArrayList();
        this.f5403i = 0;
        this.f5404j = Integer.valueOf(f5400f.incrementAndGet()).toString();
        this.f5405k = new ArrayList();
        this.f5402h = Arrays.asList(graphRequest2Arr);
    }

    public GraphRequestBatch(GraphRequestBatch graphRequestBatch) {
        this.f5402h = new ArrayList();
        this.f5403i = 0;
        this.f5404j = Integer.valueOf(f5400f.incrementAndGet()).toString();
        this.f5405k = new ArrayList();
        this.f5402h = new ArrayList(graphRequestBatch);
        this.f5401g = graphRequestBatch.f5401g;
        this.f5403i = graphRequestBatch.f5403i;
        this.f5405k = new ArrayList(graphRequestBatch.f5405k);
    }
}
