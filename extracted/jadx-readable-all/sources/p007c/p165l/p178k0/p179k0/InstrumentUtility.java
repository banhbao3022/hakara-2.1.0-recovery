package p007c.p165l.p178k0.p179k0;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: c.l.k0.k0.d, reason: use source file name */
/* JADX INFO: compiled from: InstrumentUtility.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentUtility implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.matches(String.format("^%s[0-9]+.json$", "crash_log_"));
    }
}
