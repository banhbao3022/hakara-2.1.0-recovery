package p007c.p165l;

/* JADX INFO: renamed from: c.l.r, reason: use source file name */
/* JADX INFO: compiled from: GraphRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class GraphRequest implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GraphRequest2.d f5371a;

    public GraphRequest(GraphRequest2.d dVar) {
        this.f5371a = dVar;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        GraphRequest2.d dVar = this.f5371a;
        if (dVar != null) {
            dVar.mo2692a(graphResponse.f5408c, graphResponse);
        }
    }
}
