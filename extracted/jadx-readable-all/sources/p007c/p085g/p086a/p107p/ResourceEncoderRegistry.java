package p007c.p085g.p086a.p107p;

import java.util.ArrayList;
import java.util.List;
import p007c.p085g.p086a.p089m.ResourceEncoder;

/* JADX INFO: renamed from: c.g.a.p.f, reason: use source file name */
/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceEncoderRegistry {

    /* JADX INFO: renamed from: a */
    public final List<a<?>> f3717a = new ArrayList();

    /* JADX INFO: renamed from: c.g.a.p.f$a */
    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f3718a;

        /* JADX INFO: renamed from: b */
        public final ResourceEncoder<T> f3719b;

        public a(Class<T> cls, ResourceEncoder<T> resourceEncoder) {
            this.f3718a = cls;
            this.f3719b = resourceEncoder;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z> ResourceEncoder<Z> m1968a(Class<Z> cls) {
        int size = this.f3717a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.f3717a.get(i);
            if (aVar.f3718a.isAssignableFrom(cls)) {
                return (ResourceEncoder<Z>) aVar.f3719b;
            }
        }
        return null;
    }
}
