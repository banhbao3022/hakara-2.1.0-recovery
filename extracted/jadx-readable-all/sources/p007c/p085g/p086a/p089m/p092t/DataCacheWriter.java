package p007c.p085g.p086a.p089m.p092t;

import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache;

/* JADX INFO: renamed from: c.g.a.m.t.f, reason: use source file name */
/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class DataCacheWriter<DataType> implements DiskCache.b {

    /* JADX INFO: renamed from: a */
    public final Encoder<DataType> f3198a;

    /* JADX INFO: renamed from: b */
    public final DataType f3199b;

    /* JADX INFO: renamed from: c */
    public final Options f3200c;

    public DataCacheWriter(Encoder<DataType> encoder, DataType datatype, Options options) {
        this.f3198a = encoder;
        this.f3199b = datatype;
        this.f3200c = options;
    }
}
