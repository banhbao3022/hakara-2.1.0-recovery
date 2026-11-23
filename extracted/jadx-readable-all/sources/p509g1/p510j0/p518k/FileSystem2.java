package p509g1.p510j0.p518k;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.JvmOkio;
import p524h1.Sink;
import p524h1.Source;
import p524h1.Timeout2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.k.b, reason: use source file name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface FileSystem2 {

    /* JADX INFO: renamed from: a */
    public static final FileSystem2 f30514a;

    /* JADX INFO: renamed from: g1.j0.k.b$a */
    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f30514a = new FileSystem2() { // from class: g1.j0.k.a$a
            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: a */
            public Source mo13582a(File file) throws FileNotFoundException {
                Intrinsics2.m13090f(file, "file");
                Intrinsics2.m13090f(file, "$this$source");
                FileInputStream fileInputStream = new FileInputStream(file);
                Intrinsics2.m13090f(fileInputStream, "$this$source");
                return new JvmOkio(fileInputStream, new Timeout2());
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: b */
            public Sink mo13583b(File file) throws FileNotFoundException {
                Intrinsics2.m13090f(file, "file");
                try {
                    return SkuDao.a.m14074Z(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return SkuDao.a.m14074Z(file, false, 1, null);
                }
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: c */
            public void mo13584c(File file) throws IOException {
                Intrinsics2.m13090f(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    Intrinsics2.m13086b(file2, "file");
                    if (file2.isDirectory()) {
                        mo13584c(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: d */
            public boolean mo13585d(File file) {
                Intrinsics2.m13090f(file, "file");
                return file.exists();
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: e */
            public void mo13586e(File file, File file2) throws IOException {
                Intrinsics2.m13090f(file, "from");
                Intrinsics2.m13090f(file2, "to");
                mo13587f(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: f */
            public void mo13587f(File file) throws IOException {
                Intrinsics2.m13090f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: g */
            public Sink mo13588g(File file) throws FileNotFoundException {
                Intrinsics2.m13090f(file, "file");
                try {
                    return SkuDao.a.m14077b(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return SkuDao.a.m14077b(file);
                }
            }

            @Override // p509g1.p510j0.p518k.FileSystem2
            /* JADX INFO: renamed from: h */
            public long mo13589h(File file) {
                Intrinsics2.m13090f(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        };
    }

    /* JADX INFO: renamed from: a */
    Source mo13582a(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: b */
    Sink mo13583b(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: c */
    void mo13584c(File file) throws IOException;

    /* JADX INFO: renamed from: d */
    boolean mo13585d(File file);

    /* JADX INFO: renamed from: e */
    void mo13586e(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: f */
    void mo13587f(File file) throws IOException;

    /* JADX INFO: renamed from: g */
    Sink mo13588g(File file) throws FileNotFoundException;

    /* JADX INFO: renamed from: h */
    long mo13589h(File file);
}
