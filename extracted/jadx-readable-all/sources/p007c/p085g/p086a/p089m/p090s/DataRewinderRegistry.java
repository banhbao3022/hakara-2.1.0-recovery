package p007c.p085g.p086a.p089m.p090s;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.g.a.m.s.f, reason: use source file name */
/* JADX INFO: compiled from: DataRewinderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class DataRewinderRegistry {

    /* JADX INFO: renamed from: a */
    public static final DataRewinder.a<?> f3050a = new a();

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, DataRewinder.a<?>> f3051b = new HashMap();

    /* JADX INFO: renamed from: c.g.a.m.s.f$a */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public class a implements DataRewinder.a<Object> {
        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: a */
        public Class<Object> mo1724a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: b */
        public DataRewinder<Object> mo1725b(Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.s.f$b */
    /* JADX INFO: compiled from: DataRewinderRegistry.java */
    public static final class b implements DataRewinder<Object> {

        /* JADX INFO: renamed from: a */
        public final Object f3052a;

        public b(Object obj) {
            this.f3052a = obj;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
        /* JADX INFO: renamed from: a */
        public Object mo1722a() {
            return this.f3052a;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
        /* JADX INFO: renamed from: b */
        public void mo1723b() {
        }
    }
}
