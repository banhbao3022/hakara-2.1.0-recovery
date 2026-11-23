package p007c.p165l.p178k0.p179k0;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.p179k0.p181g.ErrorReportData;
import p007c.p165l.p178k0.p179k0.p181g.ErrorReportHandler;
import p007c.p165l.p178k0.p179k0.p181g.ErrorReportHandler2;
import p007c.p165l.p178k0.p179k0.p181g.ErrorReportHandler3;

/* JADX INFO: renamed from: c.l.k0.k0.c, reason: use source file name */
/* JADX INFO: compiled from: InstrumentManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentManager2 implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z && FacebookSdk.m2659a()) {
            File fileM2505b = InstrumentUtility2.m2505b();
            File[] fileArrListFiles = fileM2505b == null ? new File[0] : fileM2505b.listFiles(new ErrorReportHandler3());
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                ErrorReportData errorReportData = new ErrorReportData(file);
                if ((errorReportData.f4977b == null || errorReportData.f4978c == null) ? false : true) {
                    arrayList.add(errorReportData);
                }
            }
            Collections.sort(arrayList, new ErrorReportHandler());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < arrayList.size() && i < 1000; i++) {
                jSONArray.put(arrayList.get(i));
            }
            InstrumentUtility2.m2507d("error_reports", jSONArray, new ErrorReportHandler2(arrayList));
        }
    }
}
