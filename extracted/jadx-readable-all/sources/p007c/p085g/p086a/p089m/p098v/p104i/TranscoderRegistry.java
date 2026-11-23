package p007c.p085g.p086a.p089m.p098v.p104i;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: c.g.a.m.v.i.f, reason: use source file name */
/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class TranscoderRegistry {

    /* JADX INFO: renamed from: a */
    public final List<a<?, ?>> f3664a = new ArrayList();

    /* JADX INFO: renamed from: c.g.a.m.v.i.f$a */
    /* JADX INFO: compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a */
        public final Class<Z> f3665a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f3666b;

        /* JADX INFO: renamed from: c */
        public final ResourceTranscoder<Z, R> f3667c;

        public a(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
            this.f3665a = cls;
            this.f3666b = cls2;
            this.f3667c = resourceTranscoder;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1936a(Class<?> cls, Class<?> cls2) {
            return this.f3665a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3666b);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized <Z, R> List<Class<R>> m1935a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator<a<?, ?>> it = this.f3664a.iterator();
        while (it.hasNext()) {
            if (it.next().m1936a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
