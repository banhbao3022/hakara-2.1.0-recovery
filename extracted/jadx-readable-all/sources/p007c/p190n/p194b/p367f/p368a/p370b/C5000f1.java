package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.f.a.b.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5000f1 extends InputStream {

    /* JADX INFO: renamed from: f */
    public final Enumeration<File> f25782f;

    /* JADX INFO: renamed from: g */
    public InputStream f25783g;

    public C5000f1(Enumeration<File> enumeration) throws IOException {
        this.f25782f = enumeration;
        m11442a();
    }

    /* JADX INFO: renamed from: a */
    public final void m11442a() throws IOException {
        InputStream inputStream = this.f25783g;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f25783g = this.f25782f.hasMoreElements() ? new FileInputStream(this.f25782f.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f25783g;
        if (inputStream != null) {
            inputStream.close();
            this.f25783g = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f25783g;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            m11442a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f25783g == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f25783g.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            m11442a();
        } while (this.f25783g != null);
        return -1;
    }
}
