package p007c.p165l.p178k0;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.l.k0.f0, reason: use source file name */
/* JADX INFO: compiled from: Utility.java */
/* JADX INFO: loaded from: classes.dex */
public final class Utility2 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }
}
