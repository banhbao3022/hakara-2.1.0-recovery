package p636z0.p769x;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: renamed from: z0.x.b, reason: use source file name */
/* JADX INFO: compiled from: MultiDexExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class MultiDexExtractor implements FileFilter {
    public MultiDexExtractor(MultiDexExtractor2 multiDexExtractor2) {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
