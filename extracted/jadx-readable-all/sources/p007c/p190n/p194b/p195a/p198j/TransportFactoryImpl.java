package p007c.p190n.p194b.p195a.p198j;

import java.util.Set;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.Transformer;
import p007c.p190n.p194b.p195a.Transport;
import p007c.p190n.p194b.p195a.TransportFactory;

/* JADX INFO: renamed from: c.n.b.a.j.l, reason: use source file name */
/* JADX INFO: compiled from: TransportFactoryImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class TransportFactoryImpl implements TransportFactory {

    /* JADX INFO: renamed from: a */
    public final Set<Encoding> f5740a;

    /* JADX INFO: renamed from: b */
    public final TransportContext f5741b;

    /* JADX INFO: renamed from: c */
    public final TransportInternal f5742c;

    public TransportFactoryImpl(Set<Encoding> set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f5740a = set;
        this.f5741b = transportContext;
        this.f5742c = transportInternal;
    }

    @Override // p007c.p190n.p194b.p195a.TransportFactory
    /* JADX INFO: renamed from: a */
    public <T> Transport<T> mo2750a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.f5740a.contains(encoding)) {
            return new TransportImpl2(this.f5741b, str, encoding, transformer, this.f5742c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.f5740a));
    }
}
