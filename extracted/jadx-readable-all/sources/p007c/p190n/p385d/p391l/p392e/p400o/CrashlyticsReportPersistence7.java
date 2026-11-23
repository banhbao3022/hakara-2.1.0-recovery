package p007c.p190n.p385d.p391l.p392e.p400o;

import com.facebook.stetho.common.Utf8Charset;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;

/* JADX INFO: renamed from: c.n.d.l.e.o.g, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsReportPersistence7 {

    /* JADX INFO: renamed from: a */
    public static final Charset f26898a = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: b */
    public static final int f26899b = 15;

    /* JADX INFO: renamed from: c */
    public static final CrashlyticsReportJsonTransform8 f26900c = new CrashlyticsReportJsonTransform8();

    /* JADX INFO: renamed from: d */
    public static final Comparator<? super File> f26901d = new Comparator() { // from class: c.n.d.l.e.o.e
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Charset charset = CrashlyticsReportPersistence7.f26898a;
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: e */
    public static final FilenameFilter f26902e = new FilenameFilter() { // from class: c.n.d.l.e.o.f
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            Charset charset = CrashlyticsReportPersistence7.f26898a;
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f26903f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public final File f26904g;

    /* JADX INFO: renamed from: h */
    public final File f26905h;

    /* JADX INFO: renamed from: i */
    public final File f26906i;

    /* JADX INFO: renamed from: j */
    public final File f26907j;

    /* JADX INFO: renamed from: k */
    public final SettingsDataProvider f26908k;

    public CrashlyticsReportPersistence7(File file, SettingsDataProvider settingsDataProvider) {
        File file2 = new File(file, "report-persistence");
        this.f26904g = new File(file2, "sessions");
        this.f26905h = new File(file2, "priority-reports");
        this.f26906i = new File(file2, "reports");
        this.f26907j = new File(file2, "native-reports");
        this.f26908k = settingsDataProvider;
    }

    /* JADX INFO: renamed from: a */
    public static List<File> m11971a(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (List<File> list : listArr) {
            size += list.size();
        }
        arrayList.ensureCapacity(size);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static List<File> m11972d(File file) {
        return m11973f(file, null);
    }

    /* JADX INFO: renamed from: f */
    public static List<File> m11973f(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: g */
    public static List<File> m11974g(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    /* JADX INFO: renamed from: i */
    public static File m11975i(File file) throws IOException {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    /* JADX INFO: renamed from: j */
    public static String m11976j(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f26898a);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m11977k(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m11977k(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: l */
    public static void m11978l(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f26898a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m11979b() {
        Iterator it = ((ArrayList) m11981e()).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m11980c(final String str) {
        FilenameFilter filenameFilter = new FilenameFilter(str) { // from class: c.n.d.l.e.o.a

            /* JADX INFO: renamed from: a */
            public final String f26892a;

            {
                this.f26892a = str;
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                String str3 = this.f26892a;
                Charset charset = CrashlyticsReportPersistence7.f26898a;
                return str2.startsWith(str3);
            }
        };
        Iterator it = ((ArrayList) m11971a(m11974g(this.f26905h, filenameFilter), m11974g(this.f26907j, filenameFilter), m11974g(this.f26906i, filenameFilter))).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<File> m11981e() {
        List[] listArr = {m11971a(m11972d(this.f26905h), m11972d(this.f26907j)), m11972d(this.f26906i)};
        for (int i = 0; i < 2; i++) {
            Collections.sort(listArr[i], f26901d);
        }
        return m11971a(listArr);
    }

    /* JADX INFO: renamed from: h */
    public final File m11982h(String str) {
        return new File(this.f26904g, str);
    }
}
