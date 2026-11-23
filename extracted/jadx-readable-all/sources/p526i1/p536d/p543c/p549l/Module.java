package p526i1.p536d.p543c.p549l;

import java.util.ArrayList;
import java.util.Objects;
import p526i1.p536d.p543c.p545h.Options4;
import p526i1.p536d.p543c.p553p.ScopeDefinition;

/* JADX INFO: renamed from: i1.d.c.l.a, reason: use source file name */
/* JADX INFO: compiled from: Module.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Module {

    /* JADX INFO: renamed from: a */
    public final ScopeDefinition f30927a;

    /* JADX INFO: renamed from: b */
    public boolean f30928b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<ScopeDefinition> f30929c;

    /* JADX INFO: renamed from: d */
    public final boolean f30930d;

    /* JADX INFO: renamed from: e */
    public final boolean f30931e;

    public Module(boolean z, boolean z2) {
        this.f30930d = z;
        this.f30931e = z2;
        Objects.requireNonNull(ScopeDefinition.f30954b);
        this.f30927a = new ScopeDefinition(ScopeDefinition.f30953a, true, null, 4, null);
        this.f30929c = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final Options4 m13855a(boolean z, boolean z2) {
        return new Options4(this.f30930d || z2, this.f30931e || z);
    }
}
