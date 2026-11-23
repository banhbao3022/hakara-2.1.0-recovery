package p007c.p085g.p086a.p089m;

import java.security.MessageDigest;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p112s.CachedHashCodeArrayMap;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.g.a.m.n, reason: use source file name */
/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes.dex */
public final class Options implements Key {

    /* JADX INFO: renamed from: b */
    public final ArrayMap<Option<?>, Object> f3039b = new CachedHashCodeArrayMap();

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            ArrayMap<Option<?>, Object> arrayMap = this.f3039b;
            if (i >= arrayMap.f36667l) {
                return;
            }
            Option<?> optionM15611h = arrayMap.m15611h(i);
            Object objM15612l = this.f3039b.m15612l(i);
            Option.b<?> bVar = optionM15611h.f3036c;
            if (optionM15611h.f3038e == null) {
                optionM15611h.f3038e = optionM15611h.f3037d.getBytes(Key.f3032a);
            }
            bVar.mo1706a(optionM15611h.f3038e, objM15612l, messageDigest);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> T m1707c(Option<T> option) {
        return this.f3039b.m15608e(option) >= 0 ? (T) this.f3039b.getOrDefault(option, null) : option.f3035b;
    }

    /* JADX INFO: renamed from: d */
    public void m1708d(Options options) {
        this.f3039b.mo2035i(options.f3039b);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f3039b.equals(((Options) obj).f3039b);
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3039b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Options{values=");
        sbM1556G.append(this.f3039b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
