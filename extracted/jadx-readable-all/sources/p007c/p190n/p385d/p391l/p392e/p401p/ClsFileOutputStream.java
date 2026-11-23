package p007c.p190n.p385d.p391l.p392e.p401p;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.p.b, reason: use source file name */
/* JADX INFO: compiled from: ClsFileOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public class ClsFileOutputStream extends FileOutputStream {

    /* JADX INFO: renamed from: f */
    public static final FilenameFilter f26912f = new a();

    /* JADX INFO: renamed from: g */
    public final String f26913g;

    /* JADX INFO: renamed from: h */
    public File f26914h;

    /* JADX INFO: renamed from: i */
    public boolean f26915i;

    /* JADX INFO: renamed from: c.n.d.l.e.p.b$a */
    /* JADX INFO: compiled from: ClsFileOutputStream.java */
    public class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public ClsFileOutputStream(String str, String str2) throws FileNotFoundException {
        this(new File(str), str2);
    }

    /* JADX INFO: renamed from: a */
    public void m11985a() throws IOException {
        if (this.f26915i) {
            return;
        }
        this.f26915i = true;
        flush();
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f26915i) {
            return;
        }
        this.f26915i = true;
        flush();
        super.close();
        File file = new File(this.f26913g + ".cls");
        if (this.f26914h.renameTo(file)) {
            this.f26914h = null;
            return;
        }
        String str = "";
        if (file.exists()) {
            str = " (target already exists)";
        } else if (!this.f26914h.exists()) {
            str = " (source does not exist)";
        }
        throw new IOException("Could not rename temp file: " + this.f26914h + " -> " + file + str);
    }

    public ClsFileOutputStream(File file, String str) throws FileNotFoundException {
        super(new File(file, outline.m1599u(str, ".cls_temp")));
        this.f26915i = false;
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String strM1550A = outline.m1550A(sb, File.separator, str);
        this.f26913g = strM1550A;
        this.f26914h = new File(outline.m1599u(strM1550A, ".cls_temp"));
    }
}
