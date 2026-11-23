package p007c.p190n.p194b.p209b.p212b2;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.b2.f, reason: use source file name */
/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes.dex */
public final class AtomicFile {

    /* JADX INFO: renamed from: a */
    public final File f6292a;

    /* JADX INFO: renamed from: b */
    public final File f6293b;

    /* JADX INFO: renamed from: c.n.b.b.b2.f$a */
    /* JADX INFO: compiled from: AtomicFile.java */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: f */
        public final FileOutputStream f6294f;

        /* JADX INFO: renamed from: g */
        public boolean f6295g = false;

        public a(File file) throws FileNotFoundException {
            this.f6294f = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f6295g) {
                return;
            }
            this.f6295g = true;
            this.f6294f.flush();
            try {
                this.f6294f.getFD().sync();
            } catch (IOException e) {
                Log.m3156d("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f6294f.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f6294f.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.f6294f.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f6294f.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f6294f.write(bArr, i, i2);
        }
    }

    public AtomicFile(File file) {
        this.f6292a = file;
        this.f6293b = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: a */
    public boolean m3075a() {
        return this.f6292a.exists() || this.f6293b.exists();
    }

    /* JADX INFO: renamed from: b */
    public InputStream m3076b() throws FileNotFoundException {
        if (this.f6293b.exists()) {
            this.f6292a.delete();
            this.f6293b.renameTo(this.f6292a);
        }
        return new FileInputStream(this.f6292a);
    }

    /* JADX INFO: renamed from: c */
    public OutputStream m3077c() throws IOException {
        if (this.f6292a.exists()) {
            if (this.f6293b.exists()) {
                this.f6292a.delete();
            } else if (!this.f6292a.renameTo(this.f6293b)) {
                StringBuilder sbM1556G = outline.m1556G("Couldn't rename file ");
                sbM1556G.append(this.f6292a);
                sbM1556G.append(" to backup file ");
                sbM1556G.append(this.f6293b);
                Log.w("AtomicFile", sbM1556G.toString());
            }
        }
        try {
            return new a(this.f6292a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f6292a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder sbM1556G2 = outline.m1556G("Couldn't create ");
                sbM1556G2.append(this.f6292a);
                throw new IOException(sbM1556G2.toString(), e);
            }
            try {
                return new a(this.f6292a);
            } catch (FileNotFoundException e2) {
                StringBuilder sbM1556G3 = outline.m1556G("Couldn't create ");
                sbM1556G3.append(this.f6292a);
                throw new IOException(sbM1556G3.toString(), e2);
            }
        }
    }
}
