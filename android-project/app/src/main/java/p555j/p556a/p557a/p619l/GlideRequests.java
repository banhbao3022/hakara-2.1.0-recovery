package p555j.p556a.p557a.p619l;

import android.content.Context;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestBuilder;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p105n.Lifecycle2;
import p007c.p085g.p086a.p105n.RequestManagerTreeNode;
import p007c.p085g.p086a.p108q.RequestOptions;

/* JADX INFO: renamed from: j.a.a.l.j, reason: use source file name */
/* JADX INFO: compiled from: GlideRequests.java */
/* JADX INFO: loaded from: classes2.dex */
public class GlideRequests extends RequestManager {
    public GlideRequests(Glide glide, Lifecycle2 lifecycle2, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        super(glide, lifecycle2, requestManagerTreeNode, context);
    }

    @Override // p007c.p085g.p086a.RequestManager
    /* JADX INFO: renamed from: k */
    public RequestBuilder mo1651k(Class cls) {
        return new GlideRequest(this.f2917g, this, cls, this.f2918h);
    }

    @Override // p007c.p085g.p086a.RequestManager
    /* JADX INFO: renamed from: l */
    public RequestBuilder mo1652l() {
        return (GlideRequest) super.mo1652l();
    }

    @Override // p007c.p085g.p086a.RequestManager
    /* JADX INFO: renamed from: m */
    public RequestBuilder mo1653m() {
        return (GlideRequest) super.mo1653m();
    }

    @Override // p007c.p085g.p086a.RequestManager
    /* JADX INFO: renamed from: o */
    public RequestBuilder mo1655o(Integer num) {
        return (GlideRequest) mo1653m().mo1643O(num);
    }

    @Override // p007c.p085g.p086a.RequestManager
    /* JADX INFO: renamed from: r */
    public void mo1658r(RequestOptions requestOptions) {
        if (requestOptions instanceof GlideOptions) {
            super.mo1658r(requestOptions);
        } else {
            super.mo1658r(new GlideOptions().m14251G(requestOptions));
        }
    }
}
