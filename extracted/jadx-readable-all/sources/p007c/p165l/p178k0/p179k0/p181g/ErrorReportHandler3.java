package p007c.p165l.p178k0.p179k0.p181g;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: c.l.k0.k0.g.d, reason: use source file name */
/* JADX INFO: compiled from: ErrorReportHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class ErrorReportHandler3 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.matches(String.format("^%s[0-9]+.json$", "error_log_"));
    }
}
