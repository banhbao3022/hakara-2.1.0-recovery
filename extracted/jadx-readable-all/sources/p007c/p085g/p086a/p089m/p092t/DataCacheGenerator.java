package p007c.p085g.p086a.p089m.p092t;

import java.io.File;
import java.util.List;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;

/* JADX INFO: renamed from: c.g.a.m.t.d, reason: use source file name */
/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.a<Object> {

    /* JADX INFO: renamed from: f */
    public final List<Key> f3142f;

    /* JADX INFO: renamed from: g */
    public final DecodeHelper<?> f3143g;

    /* JADX INFO: renamed from: h */
    public final DataFetcherGenerator.a f3144h;

    /* JADX INFO: renamed from: i */
    public int f3145i;

    /* JADX INFO: renamed from: j */
    public Key f3146j;

    /* JADX INFO: renamed from: k */
    public List<ModelLoader<File, ?>> f3147k;

    /* JADX INFO: renamed from: l */
    public int f3148l;

    /* JADX INFO: renamed from: m */
    public volatile ModelLoader.a<?> f3149m;

    /* JADX INFO: renamed from: n */
    public File f3150n;

    public DataCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.a aVar) {
        List<Key> listM1788a = decodeHelper.m1788a();
        this.f3145i = -1;
        this.f3142f = listM1788a;
        this.f3143g = decodeHelper;
        this.f3144h = aVar;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    /* JADX INFO: renamed from: a */
    public boolean mo1734a() {
        while (true) {
            List<ModelLoader<File, ?>> list = this.f3147k;
            if (list != null) {
                if (this.f3148l < list.size()) {
                    this.f3149m = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f3148l < this.f3147k.size())) {
                            break;
                        }
                        List<ModelLoader<File, ?>> list2 = this.f3147k;
                        int i = this.f3148l;
                        this.f3148l = i + 1;
                        ModelLoader<File, ?> modelLoader = list2.get(i);
                        File file = this.f3150n;
                        DecodeHelper<?> decodeHelper = this.f3143g;
                        this.f3149m = modelLoader.mo1847b(file, decodeHelper.f3205e, decodeHelper.f3206f, decodeHelper.f3209i);
                        if (this.f3149m != null && this.f3143g.m1794g(this.f3149m.f3435c.mo1712a())) {
                            this.f3149m.f3435c.mo1718e(this.f3143g.f3215o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f3145i + 1;
            this.f3145i = i2;
            if (i2 >= this.f3142f.size()) {
                return false;
            }
            Key key = this.f3142f.get(this.f3145i);
            DecodeHelper<?> decodeHelper2 = this.f3143g;
            File fileMo1777b = decodeHelper2.m1789b().mo1777b(new DataCacheKey(key, decodeHelper2.f3214n));
            this.f3150n = fileMo1777b;
            if (fileMo1777b != null) {
                this.f3146j = key;
                this.f3147k = this.f3143g.f3203c.f2881c.m1633f(fileMo1777b);
                this.f3148l = 0;
            }
        }
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: c */
    public void mo1720c(Exception exc) {
        this.f3144h.mo1735f(this.f3146j, exc, this.f3149m.f3435c, DataSource.DATA_DISK_CACHE);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    public void cancel() {
        ModelLoader.a<?> aVar = this.f3149m;
        if (aVar != null) {
            aVar.f3435c.cancel();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher.a
    /* JADX INFO: renamed from: f */
    public void mo1721f(Object obj) {
        this.f3144h.mo1737j(this.f3146j, obj, this.f3149m.f3435c, DataSource.DATA_DISK_CACHE, this.f3146j);
    }

    public DataCacheGenerator(List<Key> list, DecodeHelper<?> decodeHelper, DataFetcherGenerator.a aVar) {
        this.f3145i = -1;
        this.f3142f = list;
        this.f3143g = decodeHelper;
        this.f3144h = aVar;
    }
}
