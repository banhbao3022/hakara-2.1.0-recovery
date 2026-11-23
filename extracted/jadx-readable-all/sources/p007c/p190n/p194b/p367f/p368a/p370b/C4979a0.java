package p007c.p190n.p194b.p367f.p368a.p370b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.f.a.b.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4979a0 extends AbstractC4986c {

    /* JADX INFO: renamed from: a */
    public final long f25695a;

    /* JADX INFO: renamed from: b */
    public final Map<String, AssetPackState> f25696b;

    public C4979a0(long j2, Map<String, AssetPackState> map) {
        this.f25695a = j2;
        this.f25696b = map;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.AbstractC4986c
    /* JADX INFO: renamed from: a */
    public final Map<String, AssetPackState> mo11417a() {
        return this.f25696b;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.AbstractC4986c
    /* JADX INFO: renamed from: b */
    public final long mo11418b() {
        return this.f25695a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4986c) {
            AbstractC4986c abstractC4986c = (AbstractC4986c) obj;
            if (this.f25695a == abstractC4986c.mo11418b() && this.f25696b.equals(abstractC4986c.mo11417a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f25695a;
        return this.f25696b.hashCode() ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j2 = this.f25695a;
        String strValueOf = String.valueOf(this.f25696b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 61);
        outline.m1570U(sb, "AssetPackStates{totalBytes=", j2, ", packStates=");
        return outline.m1550A(sb, strValueOf, "}");
    }
}
