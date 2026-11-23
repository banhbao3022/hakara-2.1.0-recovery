package p007c.p165l.p178k0.p179k0.p181g;

import java.util.ArrayList;
import org.json.JSONException;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.p178k0.p179k0.InstrumentUtility2;

/* JADX INFO: renamed from: c.l.k0.k0.g.c, reason: use source file name */
/* JADX INFO: compiled from: ErrorReportHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorReportHandler2 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f4979a;

    public ErrorReportHandler2(ArrayList arrayList) {
        this.f4979a = arrayList;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        try {
            if (graphResponse.f5409d == null && graphResponse.f5408c.getBoolean("success")) {
                for (int i = 0; this.f4979a.size() > i; i++) {
                    InstrumentUtility2.m2504a(((ErrorReportData) this.f4979a.get(i)).f4976a);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
