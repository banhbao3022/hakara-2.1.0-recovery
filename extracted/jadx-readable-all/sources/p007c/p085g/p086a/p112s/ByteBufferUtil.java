package p007c.p085g.p086a.p112s;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.g.a.s.a, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferUtil {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<byte[]> f3804a = new AtomicReference<>();

    /* JADX INFO: renamed from: c.g.a.s.a$b */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f3807a;

        /* JADX INFO: renamed from: b */
        public final int f3808b;

        /* JADX INFO: renamed from: c */
        public final byte[] f3809c;

        public b(byte[] bArr, int i, int i2) {
            this.f3809c = bArr;
            this.f3807a = i;
            this.f3808b = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m2033a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2034b(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: c.g.a.s.a$a */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static class a extends InputStream {

        /* JADX INFO: renamed from: f */
        public final ByteBuffer f3805f;

        /* JADX INFO: renamed from: g */
        public int f3806g = -1;

        public a(ByteBuffer byteBuffer) {
            this.f3805f = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3805f.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f3806g = this.f3805f.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f3805f.hasRemaining()) {
                return this.f3805f.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f3806g;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f3805f.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
            if (!this.f3805f.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j2, available());
            ByteBuffer byteBuffer = this.f3805f;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f3805f.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f3805f.get(bArr, i, iMin);
            return iMin;
        }
    }
}
