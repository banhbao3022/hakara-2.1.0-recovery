package p007c.p165l.p178k0.p179k0.p181g;

import java.util.Comparator;

/* JADX INFO: renamed from: c.l.k0.k0.g.b, reason: use source file name */
/* JADX INFO: compiled from: ErrorReportHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorReportHandler implements Comparator<ErrorReportData> {
    @Override // java.util.Comparator
    public int compare(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
        ErrorReportData errorReportData3 = errorReportData2;
        Long l = errorReportData.f4978c;
        if (l == null) {
            return -1;
        }
        Long l2 = errorReportData3.f4978c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }
}
