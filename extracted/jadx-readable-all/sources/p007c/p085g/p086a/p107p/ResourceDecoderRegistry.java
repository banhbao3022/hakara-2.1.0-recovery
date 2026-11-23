package p007c.p085g.p086a.p107p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p085g.p086a.p089m.ResourceDecoder;

/* JADX INFO: renamed from: c.g.a.p.e, reason: use source file name */
/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceDecoderRegistry {

    /* JADX INFO: renamed from: a */
    public final List<String> f3712a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final Map<String, List<a<?, ?>>> f3713b = new HashMap();

    /* JADX INFO: renamed from: c.g.a.p.e$a */
    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f3714a;

        /* JADX INFO: renamed from: b */
        public final Class<R> f3715b;

        /* JADX INFO: renamed from: c */
        public final ResourceDecoder<T, R> f3716c;

        public a(Class<T> cls, Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.f3714a = cls;
            this.f3715b = cls2;
            this.f3716c = resourceDecoder;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1967a(Class<?> cls, Class<?> cls2) {
            return this.f3714a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3715b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized List<a<?, ?>> m1965a(String str) {
        List<a<?, ?>> arrayList;
        if (!this.f3712a.contains(str)) {
            this.f3712a.add(str);
        }
        arrayList = this.f3713b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f3713b.put(str, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public synchronized <T, R> List<Class<R>> m1966b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f3712a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f3713b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.m1967a(cls, cls2) && !arrayList.contains(aVar.f3715b)) {
                        arrayList.add(aVar.f3715b);
                    }
                }
            }
        }
        return arrayList;
    }
}
