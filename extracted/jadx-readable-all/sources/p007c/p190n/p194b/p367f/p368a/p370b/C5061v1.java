package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;

/* JADX INFO: renamed from: c.n.b.f.a.b.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5061v1 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f25988a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX INFO: renamed from: a */
    public static List<File> m11505a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(C5058u1.f25979a);
        if (fileArrListFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[fileArrListFiles.length];
            for (File file3 : fileArrListFiles) {
                int i = Integer.parseInt(file3.getName().split("-")[0]);
                if (i > fileArrListFiles.length || fileArr2[i] != null) {
                    throw new C5011i0("Metadata folder ordering corrupt.");
                }
                fileArr2[i] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C5070y1 c5070y1M11427a = new C4987c0(fileInputStream).m11427a();
                    if (c5070y1M11427a.f26021a == null) {
                        throw new C5011i0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, c5070y1M11427a.f26021a);
                    if (!file5.exists()) {
                        throw new C5011i0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C5084c0.f26038a.mo11527a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
