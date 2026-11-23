package p007c.p056c.p057a.p063c0;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.c0.b, reason: use source file name */
/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkCache {

    /* JADX INFO: renamed from: a */
    public final Context f2236a;

    public NetworkCache(Context context) {
        this.f2236a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static String m1366a(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sbM1556G = outline.m1556G("lottie_cache_");
        sbM1556G.append(str.replaceAll("\\W+", ""));
        if (z) {
            Objects.requireNonNull(fileExtension);
            str2 = ".temp" + fileExtension.f2235i;
        } else {
            str2 = fileExtension.f2235i;
        }
        sbM1556G.append(str2);
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: b */
    public final File m1367b() {
        File file = new File(this.f2236a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    public File m1368c(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m1367b(), m1366a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
