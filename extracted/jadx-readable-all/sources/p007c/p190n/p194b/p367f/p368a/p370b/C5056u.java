package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5056u {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25971a = new C5089f("AssetPackStorage");

    /* JADX INFO: renamed from: b */
    public static final long f25972b;

    /* JADX INFO: renamed from: c */
    public static final long f25973c;

    /* JADX INFO: renamed from: d */
    public final Context f25974d;

    /* JADX INFO: renamed from: e */
    public final C5040p1 f25975e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f25972b = timeUnit.toMillis(14L);
        f25973c = timeUnit.toMillis(28L);
    }

    public C5056u(Context context, C5040p1 c5040p1) {
        this.f25974d = context;
        this.f25975e = c5040p1;
    }

    /* JADX INFO: renamed from: b */
    public static void m11484b(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jM11485c = m11485c(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jM11485c)) && !file2.getName().equals("stale.tmp")) {
                m11486h(file2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m11485c(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f25971a.m11533b(5, "Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f25971a.m11532a(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11486h(File file) {
        boolean zM11486h;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            zM11486h = true;
            for (File file2 : fileArrListFiles) {
                zM11486h &= m11486h(file2);
            }
        } else {
            zM11486h = true;
        }
        return file.delete() && true == zM11486h;
    }

    /* JADX INFO: renamed from: a */
    public final File m11487a(String str) {
        return new File(m11491g(), str);
    }

    /* JADX INFO: renamed from: d */
    public final List<File> m11488d() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m11491g().exists() && m11491g().listFiles() != null) {
                for (File file : m11491g().listFiles()) {
                    if (!file.getCanonicalPath().equals(m11490f().getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
                return arrayList;
            }
            return arrayList;
        } catch (IOException e) {
            f25971a.m11533b(6, "Could not process directory while scanning installed packs. %s", new Object[]{e});
        }
    }

    /* JADX INFO: renamed from: e */
    public final File m11489e(String str, int i, long j2) {
        return new File(new File(new File(m11490f(), str), String.valueOf(i)), String.valueOf(j2));
    }

    /* JADX INFO: renamed from: f */
    public final File m11490f() {
        return new File(m11491g(), "_tmp");
    }

    /* JADX INFO: renamed from: g */
    public final File m11491g() {
        return new File(this.f25974d.getFilesDir(), "assetpacks");
    }

    /* JADX INFO: renamed from: i */
    public final Map<String, Long> m11492i() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            for (File file : (ArrayList) m11488d()) {
                AbstractC4982b abstractC4982bM11493j = m11493j(file.getName());
                if (abstractC4982bM11493j != null) {
                    map2.put(file.getName(), abstractC4982bM11493j);
                }
            }
        } catch (IOException e) {
            f25971a.m11533b(6, "Could not process directory while scanning installed packs: %s", new Object[]{e});
        }
        for (String str : map2.keySet()) {
            map.put(str, Long.valueOf(m11504u(str)));
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX INFO: renamed from: j */
    public final AbstractC4982b m11493j(String str) throws IOException {
        int length;
        String canonicalPath;
        File file;
        File file2 = new File(m11491g(), str);
        if (file2.exists()) {
            File file3 = new File(file2, String.valueOf(this.f25975e.m11467a()));
            if (file3.exists()) {
                File[] fileArrListFiles = file3.listFiles();
                if (fileArrListFiles != null && (length = fileArrListFiles.length) != 0) {
                    if (length > 1) {
                        f25971a.m11533b(6, "Multiple pack versions found for pack name: %s app version: %s", new Object[]{str, Integer.valueOf(this.f25975e.m11467a())});
                    } else {
                        canonicalPath = fileArrListFiles[0].getCanonicalPath();
                    }
                    if (canonicalPath == null) {
                        return null;
                    }
                    file = new File(canonicalPath, "assets");
                    if (!file.isDirectory()) {
                        f25971a.m11533b(6, "Failed to find assets directory: %s", new Object[]{file});
                        return null;
                    }
                    String canonicalPath2 = file.getCanonicalPath();
                    int i = AbstractC4982b.f25703a;
                    return new C5065x(0, canonicalPath, canonicalPath2);
                }
                f25971a.m11533b(3, "No pack version found for pack name: %s app version: %s", new Object[]{str, Integer.valueOf(this.f25975e.m11467a())});
            } else {
                f25971a.m11533b(3, "Pack not found with pack name: %s app version: %s", new Object[]{str, Integer.valueOf(this.f25975e.m11467a())});
            }
        } else {
            f25971a.m11533b(3, "Pack not found with pack name: %s", new Object[]{str});
        }
        canonicalPath = null;
        if (canonicalPath == null) {
            return null;
        }
        file = new File(canonicalPath, "assets");
        if (!file.isDirectory()) {
            f25971a.m11533b(6, "Failed to find assets directory: %s", new Object[]{file});
            return null;
        }
        String canonicalPath3 = file.getCanonicalPath();
        int i2 = AbstractC4982b.f25703a;
        return new C5065x(0, canonicalPath, canonicalPath3);
    }

    /* JADX INFO: renamed from: k */
    public final File m11494k(String str, int i, long j2) {
        return new File(new File(m11487a(str), String.valueOf(i)), String.valueOf(j2));
    }

    /* JADX INFO: renamed from: l */
    public final File m11495l(String str, int i, long j2, String str2) {
        return new File(new File(new File(m11489e(str, i, j2), "_slices"), "_unverified"), str2);
    }

    /* JADX INFO: renamed from: m */
    public final File m11496m(String str, int i, long j2, String str2) {
        return new File(new File(new File(m11489e(str, i, j2), "_slices"), "_verified"), str2);
    }

    /* JADX INFO: renamed from: n */
    public final File m11497n(String str, int i, long j2) {
        return new File(m11489e(str, i, j2), "_packs");
    }

    /* JADX INFO: renamed from: o */
    public final int m11498o(String str, int i, long j2) throws IOException {
        File file = new File(m11497n(str, i, j2), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new C5011i0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e) {
                throw new C5011i0("Merge checkpoint file corrupt.", e);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11499p(String str, int i, long j2, int i2) throws IOException {
        File file = new File(m11497n(str, i, j2), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* JADX INFO: renamed from: q */
    public final File m11500q(String str, int i, long j2, String str2) {
        return new File(m11501r(str, i, j2, str2), "checkpoint.dat");
    }

    /* JADX INFO: renamed from: r */
    public final File m11501r(String str, int i, long j2, String str2) {
        return new File(new File(new File(m11489e(str, i, j2), "_slices"), "_metadata"), str2);
    }

    /* JADX INFO: renamed from: s */
    public final void m11502s() {
        for (File file : (ArrayList) m11488d()) {
            if (file.listFiles() != null) {
                m11484b(file);
                long jM11485c = m11485c(file, false);
                if (this.f25975e.m11467a() != jM11485c) {
                    try {
                        new File(new File(file, String.valueOf(jM11485c)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f25971a.m11533b(6, "Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    m11484b(file2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m11503t(String str) {
        return (int) m11485c(m11487a(str), true);
    }

    /* JADX INFO: renamed from: u */
    public final long m11504u(String str) {
        return m11485c(new File(m11487a(str), String.valueOf((int) m11485c(m11487a(str), true))), true);
    }
}
