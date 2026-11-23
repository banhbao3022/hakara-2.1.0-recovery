package p007c.p085g.p086a.p087k;

import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: c.g.a.k.c, reason: use source file name */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class Util3 {

    /* JADX INFO: renamed from: a */
    public static final Charset f2966a = Charset.forName("US-ASCII");

    static {
        Charset.forName(Utf8Charset.NAME);
    }

    /* JADX INFO: renamed from: a */
    public static void m1682a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m1682a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
