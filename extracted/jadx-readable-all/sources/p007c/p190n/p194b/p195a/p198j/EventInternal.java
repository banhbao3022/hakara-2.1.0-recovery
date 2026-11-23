package p007c.p190n.p194b.p195a.p198j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.a.j.g, reason: use source file name */
/* JADX INFO: compiled from: EventInternal.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventInternal {

    /* JADX INFO: renamed from: c.n.b.a.j.g$a */
    /* JADX INFO: compiled from: EventInternal.java */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public final a m2818a(String str, String str2) {
            mo2801c().put(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public abstract EventInternal mo2800b();

        /* JADX INFO: renamed from: c */
        public abstract Map<String, String> mo2801c();
    }

    /* JADX INFO: renamed from: a */
    public final String m2815a(String str) {
        String str2 = mo2794b().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public abstract Map<String, String> mo2794b();

    /* JADX INFO: renamed from: c */
    public abstract Integer mo2795c();

    /* JADX INFO: renamed from: d */
    public abstract EncodedPayload mo2796d();

    /* JADX INFO: renamed from: e */
    public abstract long mo2797e();

    /* JADX INFO: renamed from: f */
    public final int m2816f(String str) {
        String str2 = mo2794b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo2798g();

    /* JADX INFO: renamed from: h */
    public abstract long mo2799h();

    /* JADX INFO: renamed from: i */
    public a m2817i() {
        AutoValue_EventInternal.b bVar = new AutoValue_EventInternal.b();
        bVar.m2806h(mo2798g());
        bVar.f5707b = mo2795c();
        bVar.m2804f(mo2796d());
        bVar.m2805g(mo2797e());
        bVar.m2807i(mo2799h());
        bVar.m2802d(new HashMap(mo2794b()));
        return bVar;
    }
}
