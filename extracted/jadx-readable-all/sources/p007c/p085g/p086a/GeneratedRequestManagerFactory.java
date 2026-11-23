package p007c.p085g.p086a;

import android.content.Context;
import p007c.p085g.p086a.p105n.Lifecycle2;
import p007c.p085g.p086a.p105n.RequestManagerRetriever;
import p007c.p085g.p086a.p105n.RequestManagerTreeNode;
import p555j.p556a.p557a.p619l.GlideRequests;

/* JADX INFO: renamed from: c.g.a.a, reason: use source file name */
/* JADX INFO: compiled from: GeneratedRequestManagerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class GeneratedRequestManagerFactory implements RequestManagerRetriever.b {
    @Override // p007c.p085g.p086a.p105n.RequestManagerRetriever.b
    /* JADX INFO: renamed from: a */
    public RequestManager mo1622a(Glide glide, Lifecycle2 lifecycle2, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        return new GlideRequests(glide, lifecycle2, requestManagerTreeNode, context);
    }
}
