package p526i1.p530b.p531a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: i1.b.a.j, reason: use source file name */
/* JADX INFO: compiled from: PendingPost.java */
/* JADX INFO: loaded from: classes2.dex */
public final class PendingPost {

    /* JADX INFO: renamed from: a */
    public static final List<PendingPost> f30829a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Object f30830b;

    /* JADX INFO: renamed from: c */
    public Subscription f30831c;

    /* JADX INFO: renamed from: d */
    public PendingPost f30832d;

    public PendingPost(Object obj, Subscription subscription) {
        this.f30830b = obj;
        this.f30831c = subscription;
    }

    /* JADX INFO: renamed from: a */
    public static PendingPost m13824a(Subscription subscription, Object obj) {
        List<PendingPost> list = f30829a;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost pendingPostRemove = list.remove(size - 1);
            pendingPostRemove.f30830b = obj;
            pendingPostRemove.f30831c = subscription;
            pendingPostRemove.f30832d = null;
            return pendingPostRemove;
        }
    }
}
