package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.b.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5055t1 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25963a = new C5089f("SliceMetadataManager");

    /* JADX INFO: renamed from: c */
    public final C5056u f25965c;

    /* JADX INFO: renamed from: d */
    public final String f25966d;

    /* JADX INFO: renamed from: e */
    public final int f25967e;

    /* JADX INFO: renamed from: f */
    public final long f25968f;

    /* JADX INFO: renamed from: g */
    public final String f25969g;

    /* JADX INFO: renamed from: b */
    public final byte[] f25964b = new byte[8192];

    /* JADX INFO: renamed from: h */
    public int f25970h = -1;

    public C5055t1(C5056u c5056u, String str, int i, long j2, String str2) {
        this.f25965c = c5056u;
        this.f25966d = str;
        this.f25967e = i;
        this.f25968f = j2;
        this.f25969g = str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11471a(String str, long j2, long j3, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f25970h));
        FileOutputStream fileOutputStream = new FileOutputStream(m11483m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11472b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f25970h));
        FileOutputStream fileOutputStream = new FileOutputStream(m11483m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            C5056u c5056u = this.f25965c;
            String str = this.f25966d;
            int i2 = this.f25967e;
            long j2 = this.f25968f;
            String str2 = this.f25969g;
            Objects.requireNonNull(c5056u);
            File file = new File(c5056u.m11501r(str, i2, j2, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable th2) {
                    C5084c0.f26038a.mo11527a(th, th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
                C5084c0.f26038a.mo11527a(th3, th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11473c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m11479i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f25970h));
        FileOutputStream fileOutputStream = new FileOutputStream(m11483m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11474d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f25970h));
        FileOutputStream fileOutputStream = new FileOutputStream(m11483m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C5052s1 m11475e() throws IOException {
        File fileM11500q = this.f25965c.m11500q(this.f25966d, this.f25967e, this.f25968f, this.f25969g);
        if (!fileM11500q.exists()) {
            throw new C5011i0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileM11500q);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new C5011i0("Slice checkpoint file corrupt.");
            }
            try {
                int i = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j2 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j3 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f25970h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new C5052s1(i, property, j2, j3, i2);
            } catch (NumberFormatException e) {
                throw new C5011i0("Slice checkpoint file corrupt.", e);
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

    /* JADX INFO: renamed from: f */
    public final void m11476f(byte[] bArr) throws IOException {
        this.f25970h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m11482l(), String.format("%s-LFH.dat", Integer.valueOf(this.f25970h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    C5084c0.f26038a.mo11527a(th, th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C5011i0("Could not write metadata file.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11477g(byte[] bArr, InputStream inputStream) throws IOException {
        this.f25970h++;
        FileOutputStream fileOutputStream = new FileOutputStream(m11479i());
        try {
            fileOutputStream.write(bArr);
            int i = inputStream.read(this.f25964b);
            while (i > 0) {
                fileOutputStream.write(this.f25964b, 0, i);
                i = inputStream.read(this.f25964b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11478h(long j2, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m11479i(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final File m11479i() {
        return new File(m11482l(), String.format("%s-NAM.dat", Integer.valueOf(this.f25970h)));
    }

    /* JADX INFO: renamed from: j */
    public final int m11480j() throws IOException {
        File fileM11500q = this.f25965c.m11500q(this.f25966d, this.f25967e, this.f25968f, this.f25969g);
        if (!fileM11500q.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileM11500q);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C5011i0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11481k(byte[] bArr, int i) throws IOException {
        this.f25970h++;
        FileOutputStream fileOutputStream = new FileOutputStream(m11479i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5084c0.f26038a.mo11527a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public final File m11482l() {
        File fileM11501r = this.f25965c.m11501r(this.f25966d, this.f25967e, this.f25968f, this.f25969g);
        if (!fileM11501r.exists()) {
            fileM11501r.mkdirs();
        }
        return fileM11501r;
    }

    /* JADX INFO: renamed from: m */
    public final File m11483m() throws IOException {
        File fileM11500q = this.f25965c.m11500q(this.f25966d, this.f25967e, this.f25968f, this.f25969g);
        fileM11500q.getParentFile().mkdirs();
        fileM11500q.createNewFile();
        return fileM11500q;
    }
}
