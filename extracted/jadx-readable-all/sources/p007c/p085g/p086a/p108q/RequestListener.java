package p007c.p085g.p086a.p108q;

import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.p092t.GlideException;
import p007c.p085g.p086a.p108q.p109h.Target;

/* JADX INFO: renamed from: c.g.a.q.d, reason: use source file name */
/* JADX INFO: compiled from: RequestListener.java */
/* JADX INFO: loaded from: classes.dex */
public interface RequestListener<R> {
    /* JADX INFO: renamed from: a */
    boolean m2003a(GlideException glideException, Object obj, Target<R> target, boolean z);

    /* JADX INFO: renamed from: b */
    boolean m2004b(R r, Object obj, Target<R> target, DataSource dataSource, boolean z);
}
