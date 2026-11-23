package p007c.p085g.p086a.p089m.p092t;

import java.util.HashMap;
import java.util.Map;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.t.t, reason: use source file name */
/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes.dex */
public final class Jobs {

    /* JADX INFO: renamed from: a */
    public final Map<Key, EngineJob<?>> f3360a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<Key, EngineJob<?>> f3361b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Map<Key, EngineJob<?>> m1841a(boolean z) {
        return z ? this.f3361b : this.f3360a;
    }
}
