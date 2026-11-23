package p007c.p085g.p086a.p112s.p113k;

import android.util.Log;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools4;

/* JADX INFO: renamed from: c.g.a.s.k.a, reason: use source file name */
/* JADX INFO: compiled from: FactoryPools.java */
/* JADX INFO: loaded from: classes.dex */
public final class FactoryPools {

    /* JADX INFO: renamed from: a */
    public static final e<Object> f3831a = new a();

    /* JADX INFO: renamed from: c.g.a.s.k.a$a */
    /* JADX INFO: compiled from: FactoryPools.java */
    public class a implements e<Object> {
        @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.e
        /* JADX INFO: renamed from: a */
        public void mo2056a(Object obj) {
        }
    }

    /* JADX INFO: renamed from: c.g.a.s.k.a$b */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface b<T> {
        T create();
    }

    /* JADX INFO: renamed from: c.g.a.s.k.a$c */
    /* JADX INFO: compiled from: FactoryPools.java */
    public static final class c<T> implements Pools2<T> {

        /* JADX INFO: renamed from: a */
        public final b<T> f3832a;

        /* JADX INFO: renamed from: b */
        public final e<T> f3833b;

        /* JADX INFO: renamed from: c */
        public final Pools2<T> f3834c;

        public c(Pools2<T> pools2, b<T> bVar, e<T> eVar) {
            this.f3834c = pools2;
            this.f3832a = bVar;
            this.f3833b = eVar;
        }

        @Override // p636z0.p725k.p738k.Pools2
        /* JADX INFO: renamed from: a */
        public T mo2057a() {
            T tMo2057a = this.f3834c.mo2057a();
            if (tMo2057a == null) {
                tMo2057a = this.f3832a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sbM1556G = outline.m1556G("Created new ");
                    sbM1556G.append(tMo2057a.getClass());
                    Log.v("FactoryPools", sbM1556G.toString());
                }
            }
            if (tMo2057a instanceof d) {
                ((StateVerifier.b) ((d) tMo2057a).mo1785l()).f3835a = false;
            }
            return tMo2057a;
        }

        @Override // p636z0.p725k.p738k.Pools2
        /* JADX INFO: renamed from: b */
        public boolean mo2058b(T t) {
            if (t instanceof d) {
                ((StateVerifier.b) ((d) t).mo1785l()).f3835a = true;
            }
            this.f3833b.mo2056a(t);
            return this.f3834c.mo2058b(t);
        }
    }

    /* JADX INFO: renamed from: c.g.a.s.k.a$d */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface d {
        /* JADX INFO: renamed from: l */
        StateVerifier mo1785l();
    }

    /* JADX INFO: renamed from: c.g.a.s.k.a$e */
    /* JADX INFO: compiled from: FactoryPools.java */
    public interface e<T> {
        /* JADX INFO: renamed from: a */
        void mo2056a(T t);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends d> Pools2<T> m2055a(int i, b<T> bVar) {
        return new c(new Pools4(i), bVar, f3831a);
    }
}
