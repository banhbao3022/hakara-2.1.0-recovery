package p007c.p085g.p086a.p107p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p085g.p086a.p089m.p092t.DecodePath;
import p007c.p085g.p086a.p089m.p092t.LoadPath;
import p007c.p085g.p086a.p089m.p098v.p104i.UnitTranscoder;
import p007c.p085g.p086a.p112s.MultiClassKey;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.g.a.p.c, reason: use source file name */
/* JADX INFO: compiled from: LoadPathCache.java */
/* JADX INFO: loaded from: classes.dex */
public class LoadPathCache {

    /* JADX INFO: renamed from: a */
    public static final LoadPath<?, ?, ?> f3707a = new LoadPath<>(Object.class, Object.class, Object.class, Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, Collections.emptyList(), new UnitTranscoder(), null)), null);

    /* JADX INFO: renamed from: b */
    public final ArrayMap<MultiClassKey, LoadPath<?, ?, ?>> f3708b = new ArrayMap<>();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<MultiClassKey> f3709c = new AtomicReference<>();
}
