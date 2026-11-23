package p007c.p085g.p086a.p089m.p092t;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Registry;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p089m.p096u.ModelLoaderRegistry;
import p007c.p085g.p086a.p107p.ModelToResourceClassCache;
import p007c.p085g.p086a.p112s.MultiClassKey;

/* JADX INFO: renamed from: c.g.a.m.t.x, reason: use source file name */
/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.a<Object> {

    /* JADX INFO: renamed from: f */
    public final DataFetcherGenerator.a f3370f;

    /* JADX INFO: renamed from: g */
    public final DecodeHelper<?> f3371g;

    /* JADX INFO: renamed from: h */
    public int f3372h;

    /* JADX INFO: renamed from: i */
    public int f3373i = -1;

    /* JADX INFO: renamed from: j */
    public Key f3374j;

    /* JADX INFO: renamed from: k */
    public List<ModelLoader<File, ?>> f3375k;

    /* JADX INFO: renamed from: l */
    public int f3376l;

    /* JADX INFO: renamed from: m */
    public volatile ModelLoader.a<?> f3377m;

    /* JADX INFO: renamed from: n */
    public File f3378n;

    /* JADX INFO: renamed from: o */
    public ResourceCacheKey f3379o;

    public ResourceCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.a aVar) {
        this.f3371g = decodeHelper;
        this.f3370f = aVar;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    /* JADX INFO: renamed from: a */
    public boolean mo1734a() {
        List<Class<?>> orDefault;
        List<Class<?>> listM1867d;
        List<Key> listM1788a = this.f3371g.m1788a();
        if (listM1788a.isEmpty()) {
            return false;
        }
        DecodeHelper<?> decodeHelper = this.f3371g;
        Registry registry = decodeHelper.f3203c.f2881c;
        Class<?> cls = decodeHelper.f3204d.getClass();
        Class<?> cls2 = decodeHelper.f3207g;
        Class<?> cls3 = decodeHelper.f3211k;
        ModelToResourceClassCache modelToResourceClassCache = registry.f2902h;
        MultiClassKey andSet = modelToResourceClassCache.f3710a.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2, cls3);
        } else {
            andSet.f3825a = cls;
            andSet.f3826b = cls2;
            andSet.f3827c = cls3;
        }
        synchronized (modelToResourceClassCache.f3711b) {
            orDefault = modelToResourceClassCache.f3711b.getOrDefault(andSet, null);
        }
        modelToResourceClassCache.f3710a.set(andSet);
        List list = orDefault;
        if (orDefault == null) {
            ArrayList arrayList = new ArrayList();
            ModelLoaderRegistry modelLoaderRegistry = registry.f2895a;
            synchronized (modelLoaderRegistry) {
                listM1867d = modelLoaderRegistry.f3436a.m1867d(cls);
            }
            Iterator it = ((ArrayList) listM1867d).iterator();
            while (it.hasNext()) {
                for (Class cls4 : (ArrayList) registry.f2897c.m1966b((Class) it.next(), cls2)) {
                    if (!((ArrayList) registry.f2900f.m1935a(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            ModelToResourceClassCache modelToResourceClassCache2 = registry.f2902h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (modelToResourceClassCache2.f3711b) {
                modelToResourceClassCache2.f3711b.put(new MultiClassKey(cls, cls2, cls3), listUnmodifiableList);
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.f3371g.f3211k)) {
                return false;
            }
            StringBuilder sbM1556G = outline.m1556G("Failed to find any load path from ");
            sbM1556G.append(this.f3371g.f3204d.getClass());
            sbM1556G.append(" to ");
            sbM1556G.append(this.f3371g.f3211k);
            throw new IllegalStateException(sbM1556G.toString());
        }
        while (true) {
            List<ModelLoader<File, ?>> list2 = this.f3375k;
            if (list2 != null) {
                if (this.f3376l < list2.size()) {
                    this.f3377m = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f3376l < this.f3375k.size())) {
                            break;
                        }
                        List<ModelLoader<File, ?>> list3 = this.f3375k;
                        int i = this.f3376l;
                        this.f3376l = i + 1;
                        ModelLoader<File, ?> modelLoader = list3.get(i);
                        File file = this.f3378n;
                        DecodeHelper<?> decodeHelper2 = this.f3371g;
                        this.f3377m = modelLoader.mo1847b(file, decodeHelper2.f3205e, decodeHelper2.f3206f, decodeHelper2.f3209i);
                        if (this.f3377m != null && this.f3371g.m1794g(this.f3377m.f3435c.mo1712a())) {
                            this.f3377m.f3435c.mo1718e(this.f3371g.f3215o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f3373i + 1;
            this.f3373i = i2;
            if (i2 >= list.size()) {
                int i3 = this.f3372h + 1;
                this.f3372h = i3;
                if (i3 >= listM1788a.size()) {
                    return false;
                }
                this.f3373i = 0;
            }
            Key key = listM1788a.get(this.f3372h);
            Class cls5 = (Class) list.get(this.f3373i);
            Transformation<Z> transformationM1793f = this.f3371g.m1793f(cls5);
            DecodeHelper<?> decodeHelper3 = this.f3371g;
            this.f3379o = new ResourceCacheKey(decodeHelper3.f3203c.f2880b, key, decodeHelper3.f3214n, decodeHelper3.f3205e, decodeHelper3.f3206f, transformationM1793f, cls5, decodeHelper3.f3209i);
            File fileMo1777b = decodeHelper3.m1789b().mo1777b(this.f3379o);
            this.f3378n = fileMo1777b;
            if (fileMo1777b != null) {
                this.f3374j = key;
                this.f3375k = this.f3371g.f3203c.f2881c.m1633f(fileMo1777b);
                this.f3376l = 0;
            }
        }
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: c */
    public void mo1720c(Exception exc) {
        this.f3370f.mo1735f(this.f3379o, exc, this.f3377m.f3435c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    public void cancel() {
        ModelLoader.a<?> aVar = this.f3377m;
        if (aVar != null) {
            aVar.f3435c.cancel();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: f */
    public void mo1721f(Object obj) {
        this.f3370f.mo1737j(this.f3374j, obj, this.f3377m.f3435c, DataSource.RESOURCE_DISK_CACHE, this.f3379o);
    }
}
