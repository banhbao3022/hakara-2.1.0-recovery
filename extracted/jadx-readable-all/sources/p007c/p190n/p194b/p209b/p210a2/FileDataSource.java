package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a2.y, reason: use source file name */
/* JADX INFO: compiled from: FileDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f6237e;

    /* JADX INFO: renamed from: f */
    public Uri f6238f;

    /* JADX INFO: renamed from: g */
    public long f6239g;

    /* JADX INFO: renamed from: h */
    public boolean f6240h;

    /* JADX INFO: renamed from: c.n.b.b.a2.y$a */
    /* JADX INFO: compiled from: FileDataSource.java */
    public static final class a implements DataSource3.a {
        @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: a */
        public DataSource3 mo2953a() {
            return new FileDataSource();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.y$b */
    /* JADX INFO: compiled from: FileDataSource.java */
    public static class b extends IOException {
        public b(IOException iOException) {
            super(iOException);
        }

        public b(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* JADX INFO: renamed from: u */
    public static RandomAccessFile m3027u(Uri uri) throws b {
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws p007c.p190n.p194b.p209b.p210a2.FileDataSource.b {
        /*
            r4 = this;
            r0 = 0
            r4.f6238f = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r4.f6237e     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r4.f6237e = r0
            boolean r0 = r4.f6240h
            if (r0 == 0) goto L16
            r4.f6240h = r1
            r4.m2923r()
        L16:
            return
        L17:
            r2 = move-exception
            goto L20
        L19:
            r2 = move-exception
            c.n.b.b.a2.y$b r3 = new c.n.b.b.a2.y$b     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L20:
            r4.f6237e = r0
            boolean r0 = r4.f6240h
            if (r0 == 0) goto L2b
            r4.f6240h = r1
            r4.m2923r()
        L2b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p210a2.FileDataSource.close():void");
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws b {
        try {
            Uri uri = dataSpec.f6137a;
            this.f6238f = uri;
            m2924s(dataSpec);
            RandomAccessFile randomAccessFileM3027u = m3027u(uri);
            this.f6237e = randomAccessFileM3027u;
            randomAccessFileM3027u.seek(dataSpec.f6142f);
            long length = dataSpec.f6143g;
            if (length == -1) {
                length = this.f6237e.length() - dataSpec.f6142f;
            }
            this.f6239g = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f6240h = true;
            m2925t(dataSpec);
            return this.f6239g;
        } catch (IOException e) {
            throw new b(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f6238f;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws b {
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f6239g;
        if (j2 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6237e;
            int i3 = Util6.f6307a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j2, i2));
            if (i4 > 0) {
                this.f6239g -= (long) i4;
                m2922q(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new b(e);
        }
    }
}
