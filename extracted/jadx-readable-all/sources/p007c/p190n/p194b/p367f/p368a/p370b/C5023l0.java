package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: c.n.b.f.a.b.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5023l0 extends OutputStream {

    /* JADX INFO: renamed from: f */
    public final C5004g1 f25860f = new C5004g1();

    /* JADX INFO: renamed from: g */
    public final File f25861g;

    /* JADX INFO: renamed from: h */
    public final C5055t1 f25862h;

    /* JADX INFO: renamed from: i */
    public long f25863i;

    /* JADX INFO: renamed from: j */
    public long f25864j;

    /* JADX INFO: renamed from: k */
    public FileOutputStream f25865k;

    /* JADX INFO: renamed from: l */
    public C5070y1 f25866l;

    public C5023l0(File file, C5055t1 c5055t1) {
        this.f25861g = file;
        this.f25862h = c5055t1;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        while (i2 > 0) {
            if (this.f25863i == 0 && this.f25864j == 0) {
                int iM11445a = this.f25860f.m11445a(bArr, i, i2);
                if (iM11445a == -1) {
                    return;
                }
                i += iM11445a;
                i2 -= iM11445a;
                C5070y1 c5070y1M11446b = this.f25860f.m11446b();
                this.f25866l = c5070y1M11446b;
                if (c5070y1M11446b.f26025e) {
                    this.f25863i = 0L;
                    C5055t1 c5055t1 = this.f25862h;
                    byte[] bArr2 = c5070y1M11446b.f26026f;
                    c5055t1.m11481k(bArr2, bArr2.length);
                    this.f25864j = this.f25866l.f26026f.length;
                } else if (!c5070y1M11446b.m11523b() || this.f25866l.m11522a()) {
                    byte[] bArr3 = this.f25866l.f26026f;
                    this.f25862h.m11481k(bArr3, bArr3.length);
                    this.f25863i = this.f25866l.f26022b;
                } else {
                    this.f25862h.m11476f(this.f25866l.f26026f);
                    File file = new File(this.f25861g, this.f25866l.f26021a);
                    file.getParentFile().mkdirs();
                    this.f25863i = this.f25866l.f26022b;
                    this.f25865k = new FileOutputStream(file);
                }
            }
            if (!this.f25866l.m11522a()) {
                C5070y1 c5070y1 = this.f25866l;
                if (c5070y1.f26025e) {
                    this.f25862h.m11478h(this.f25864j, bArr, i, i2);
                    this.f25864j += (long) i2;
                    iMin = i2;
                } else if (c5070y1.m11523b()) {
                    iMin = (int) Math.min(i2, this.f25863i);
                    this.f25865k.write(bArr, i, iMin);
                    long j2 = this.f25863i - ((long) iMin);
                    this.f25863i = j2;
                    if (j2 == 0) {
                        this.f25865k.close();
                    }
                } else {
                    iMin = (int) Math.min(i2, this.f25863i);
                    C5070y1 c5070y2 = this.f25866l;
                    int length = c5070y2.f26026f.length;
                    this.f25862h.m11478h((((long) length) + c5070y2.f26022b) - this.f25863i, bArr, i, iMin);
                    this.f25863i -= (long) iMin;
                }
                i += iMin;
                i2 -= iMin;
            }
        }
    }
}
