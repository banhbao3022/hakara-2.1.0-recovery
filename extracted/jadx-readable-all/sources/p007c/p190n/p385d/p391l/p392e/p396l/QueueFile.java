package p007c.p190n.p385d.p391l.p392e.p396l;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.d.l.e.l.c, reason: use source file name */
/* JADX INFO: compiled from: QueueFile.java */
/* JADX INFO: loaded from: classes.dex */
public class QueueFile implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final Logger f26653f = Logger.getLogger(QueueFile.class.getName());

    /* JADX INFO: renamed from: g */
    public final RandomAccessFile f26654g;

    /* JADX INFO: renamed from: h */
    public int f26655h;

    /* JADX INFO: renamed from: i */
    public int f26656i;

    /* JADX INFO: renamed from: j */
    public b f26657j;

    /* JADX INFO: renamed from: k */
    public b f26658k;

    /* JADX INFO: renamed from: l */
    public final byte[] f26659l = new byte[16];

    /* JADX INFO: renamed from: c.n.d.l.e.l.c$a */
    /* JADX INFO: compiled from: QueueFile.java */
    public class a implements d {

        /* JADX INFO: renamed from: a */
        public boolean f26660a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StringBuilder f26661b;

        public a(QueueFile queueFile, StringBuilder sb) {
            this.f26661b = sb;
        }

        @Override // p007c.p190n.p385d.p391l.p392e.p396l.QueueFile.d
        /* JADX INFO: renamed from: a */
        public void mo11833a(InputStream inputStream, int i) throws IOException {
            if (this.f26660a) {
                this.f26660a = false;
            } else {
                this.f26661b.append(", ");
            }
            this.f26661b.append(i);
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.l.c$b */
    /* JADX INFO: compiled from: QueueFile.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final b f26662a = new b(0, 0);

        /* JADX INFO: renamed from: b */
        public final int f26663b;

        /* JADX INFO: renamed from: c */
        public final int f26664c;

        public b(int i, int i2) {
            this.f26663b = i;
            this.f26664c = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f26663b);
            sb.append(", length = ");
            return outline.m1603y(sb, this.f26664c, "]");
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.l.c$d */
    /* JADX INFO: compiled from: QueueFile.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo11833a(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m11820t0(bArr, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f26654g = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f26659l);
        int iM11818H = m11818H(this.f26659l, 0);
        this.f26655h = iM11818H;
        if (iM11818H > randomAccessFile2.length()) {
            StringBuilder sbM1556G = outline.m1556G("File is truncated. Expected length: ");
            sbM1556G.append(this.f26655h);
            sbM1556G.append(", Actual length: ");
            sbM1556G.append(randomAccessFile2.length());
            throw new IOException(sbM1556G.toString());
        }
        this.f26656i = m11818H(this.f26659l, 4);
        int iM11818H2 = m11818H(this.f26659l, 8);
        int iM11818H3 = m11818H(this.f26659l, 12);
        this.f26657j = m11822D(iM11818H2);
        this.f26658k = m11822D(iM11818H3);
    }

    /* JADX INFO: renamed from: H */
    public static int m11818H(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* JADX INFO: renamed from: a */
    public static int m11819a(QueueFile queueFile, int i) {
        int i2 = queueFile.f26655h;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* JADX INFO: renamed from: t0 */
    public static void m11820t0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: B */
    public synchronized boolean m11821B() {
        return this.f26656i == 0;
    }

    /* JADX INFO: renamed from: D */
    public final b m11822D(int i) throws IOException {
        if (i == 0) {
            return b.f26662a;
        }
        this.f26654g.seek(i);
        return new b(i, this.f26654g.readInt());
    }

    /* JADX INFO: renamed from: O */
    public synchronized void m11823O() throws IOException {
        if (m11821B()) {
            throw new NoSuchElementException();
        }
        if (this.f26656i == 1) {
            m11827f();
        } else {
            b bVar = this.f26657j;
            int iM11829g0 = m11829g0(bVar.f26663b + 4 + bVar.f26664c);
            m11824R(iM11829g0, this.f26659l, 0, 4);
            int iM11818H = m11818H(this.f26659l, 0);
            m11831n0(this.f26655h, this.f26656i - 1, iM11829g0, this.f26658k.f26663b);
            this.f26656i--;
            this.f26657j = new b(iM11829g0, iM11818H);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11824R(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f26655h;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.f26654g.seek(i);
            this.f26654g.readFully(bArr, i2, i3);
            return;
        }
        int i5 = i4 - i;
        this.f26654g.seek(i);
        this.f26654g.readFully(bArr, i2, i5);
        this.f26654g.seek(16L);
        this.f26654g.readFully(bArr, i2 + i5, i3 - i5);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11825b0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f26655h;
        if (i >= i4) {
            i = (i + 16) - i4;
        }
        if (i + i3 <= i4) {
            this.f26654g.seek(i);
            this.f26654g.write(bArr, i2, i3);
            return;
        }
        int i5 = i4 - i;
        this.f26654g.seek(i);
        this.f26654g.write(bArr, i2, i5);
        this.f26654g.seek(16L);
        this.f26654g.write(bArr, i2 + i5, i3 - i5);
    }

    /* JADX INFO: renamed from: c */
    public void m11826c(byte[] bArr) throws IOException {
        int iM11829g0;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                if (length <= bArr.length - 0) {
                    m11830h(length);
                    boolean zM11821B = m11821B();
                    if (zM11821B) {
                        iM11829g0 = 16;
                    } else {
                        b bVar = this.f26658k;
                        iM11829g0 = m11829g0(bVar.f26663b + 4 + bVar.f26664c);
                    }
                    b bVar2 = new b(iM11829g0, length);
                    m11820t0(this.f26659l, 0, length);
                    m11825b0(iM11829g0, this.f26659l, 0, 4);
                    m11825b0(iM11829g0 + 4, bArr, 0, length);
                    m11831n0(this.f26655h, this.f26656i + 1, zM11821B ? iM11829g0 : this.f26657j.f26663b, iM11829g0);
                    this.f26658k = bVar2;
                    this.f26656i++;
                    if (zM11821B) {
                        this.f26657j = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f26654g.close();
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m11827f() throws IOException {
        m11831n0(4096, 0, 0, 0);
        this.f26656i = 0;
        b bVar = b.f26662a;
        this.f26657j = bVar;
        this.f26658k = bVar;
        if (this.f26655h > 4096) {
            this.f26654g.setLength(4096);
            this.f26654g.getChannel().force(true);
        }
        this.f26655h = 4096;
    }

    /* JADX INFO: renamed from: f0 */
    public int m11828f0() {
        if (this.f26656i == 0) {
            return 16;
        }
        b bVar = this.f26658k;
        int i = bVar.f26663b;
        int i2 = this.f26657j.f26663b;
        return i >= i2 ? (i - i2) + 4 + bVar.f26664c + 16 : (((i + 4) + bVar.f26664c) + this.f26655h) - i2;
    }

    /* JADX INFO: renamed from: g0 */
    public final int m11829g0(int i) {
        int i2 = this.f26655h;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* JADX INFO: renamed from: h */
    public final void m11830h(int i) throws IOException {
        int i2 = i + 4;
        int iM11828f0 = this.f26655h - m11828f0();
        if (iM11828f0 >= i2) {
            return;
        }
        int i3 = this.f26655h;
        do {
            iM11828f0 += i3;
            i3 <<= 1;
        } while (iM11828f0 < i2);
        this.f26654g.setLength(i3);
        this.f26654g.getChannel().force(true);
        b bVar = this.f26658k;
        int iM11829g0 = m11829g0(bVar.f26663b + 4 + bVar.f26664c);
        if (iM11829g0 < this.f26657j.f26663b) {
            FileChannel channel = this.f26654g.getChannel();
            channel.position(this.f26655h);
            long j2 = iM11829g0 - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f26658k.f26663b;
        int i5 = this.f26657j.f26663b;
        if (i4 < i5) {
            int i6 = (this.f26655h + i4) - 16;
            m11831n0(i3, this.f26656i, i5, i6);
            this.f26658k = new b(i6, this.f26658k.f26664c);
        } else {
            m11831n0(i3, this.f26656i, i5, i4);
        }
        this.f26655h = i3;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m11831n0(int i, int i2, int i3, int i4) throws IOException {
        byte[] bArr = this.f26659l;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            m11820t0(bArr, i5, iArr[i6]);
            i5 += 4;
        }
        this.f26654g.seek(0L);
        this.f26654g.write(this.f26659l);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QueueFile.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f26655h);
        sb.append(", size=");
        sb.append(this.f26656i);
        sb.append(", first=");
        sb.append(this.f26657j);
        sb.append(", last=");
        sb.append(this.f26658k);
        sb.append(", element lengths=[");
        try {
            m11832u(new a(this, sb));
        } catch (IOException e) {
            f26653f.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m11832u(d dVar) throws IOException {
        int iM11829g0 = this.f26657j.f26663b;
        for (int i = 0; i < this.f26656i; i++) {
            b bVarM11822D = m11822D(iM11829g0);
            dVar.mo11833a(new c(bVarM11822D, null), bVarM11822D.f26664c);
            iM11829g0 = m11829g0(bVarM11822D.f26663b + 4 + bVarM11822D.f26664c);
        }
    }

    /* JADX INFO: renamed from: c.n.d.l.e.l.c$c */
    /* JADX INFO: compiled from: QueueFile.java */
    public final class c extends InputStream {

        /* JADX INFO: renamed from: f */
        public int f26665f;

        /* JADX INFO: renamed from: g */
        public int f26666g;

        public c(b bVar, a aVar) {
            int i = bVar.f26663b + 4;
            int i2 = QueueFile.this.f26655h;
            this.f26665f = i >= i2 ? (i + 16) - i2 : i;
            this.f26666g = bVar.f26664c;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f26666g;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.this.m11824R(this.f26665f, bArr, i, i2);
            this.f26665f = QueueFile.m11819a(QueueFile.this, this.f26665f + i2);
            this.f26666g -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f26666g == 0) {
                return -1;
            }
            QueueFile.this.f26654g.seek(this.f26665f);
            int i = QueueFile.this.f26654g.read();
            this.f26665f = QueueFile.m11819a(QueueFile.this, this.f26665f + 1);
            this.f26666g--;
            return i;
        }
    }
}
