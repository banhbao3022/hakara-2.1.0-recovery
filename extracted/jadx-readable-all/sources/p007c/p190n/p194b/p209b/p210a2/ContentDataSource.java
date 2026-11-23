package p007c.p190n.p194b.p209b.p210a2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a2.h, reason: use source file name */
/* JADX INFO: compiled from: ContentDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f6008e;

    /* JADX INFO: renamed from: f */
    public Uri f6009f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f6010g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f6011h;

    /* JADX INFO: renamed from: i */
    public long f6012i;

    /* JADX INFO: renamed from: j */
    public boolean f6013j;

    /* JADX INFO: renamed from: c.n.b.b.a2.h$a */
    /* JADX INFO: compiled from: ContentDataSource.java */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f6008e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws p007c.p190n.p194b.p209b.p210a2.ContentDataSource.a {
        /*
            r4 = this;
            r0 = 0
            r4.f6009f = r0
            r1 = 0
            java.io.FileInputStream r2 = r4.f6011h     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        Lb:
            r4.f6011h = r0
            android.content.res.AssetFileDescriptor r2 = r4.f6010g     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
        L14:
            r4.f6010g = r0
            boolean r0 = r4.f6013j
            if (r0 == 0) goto L1f
            r4.f6013j = r1
            r4.m2923r()
        L1f:
            return
        L20:
            r2 = move-exception
            goto L29
        L22:
            r2 = move-exception
            c.n.b.b.a2.h$a r3 = new c.n.b.b.a2.h$a     // Catch: java.lang.Throwable -> L20
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L29:
            r4.f6010g = r0
            boolean r0 = r4.f6013j
            if (r0 == 0) goto L34
            r4.f6013j = r1
            r4.m2923r()
        L34:
            throw r2
        L35:
            r2 = move-exception
            goto L3e
        L37:
            r2 = move-exception
            c.n.b.b.a2.h$a r3 = new c.n.b.b.a2.h$a     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L35
        L3e:
            r4.f6011h = r0
            android.content.res.AssetFileDescriptor r3 = r4.f6010g     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
        L47:
            r4.f6010g = r0
            boolean r0 = r4.f6013j
            if (r0 == 0) goto L52
            r4.f6013j = r1
            r4.m2923r()
        L52:
            throw r2
        L53:
            r2 = move-exception
            goto L5c
        L55:
            r2 = move-exception
            c.n.b.b.a2.h$a r3 = new c.n.b.b.a2.h$a     // Catch: java.lang.Throwable -> L53
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5c:
            r4.f6010g = r0
            boolean r0 = r4.f6013j
            if (r0 == 0) goto L67
            r4.f6013j = r1
            r4.m2923r()
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p210a2.ContentDataSource.close():void");
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws a {
        try {
            Uri uri = dataSpec.f6137a;
            this.f6009f = uri;
            m2924s(dataSpec);
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f6008e.openAssetFileDescriptor(uri, "r");
            this.f6010g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + uri);
            }
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f6011h = fileInputStream;
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(dataSpec.f6142f + startOffset) - startOffset;
            if (jSkip != dataSpec.f6142f) {
                throw new EOFException();
            }
            long j2 = dataSpec.f6143g;
            if (j2 != -1) {
                this.f6012i = j2;
            } else {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f6012i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f6012i = jPosition;
                        if (jPosition < 0) {
                            throw new EOFException();
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.f6012i = j3;
                    if (j3 < 0) {
                        throw new EOFException();
                    }
                }
            }
            this.f6013j = true;
            m2925t(dataSpec);
            return this.f6012i;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f6009f;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f6012i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i2 = (int) Math.min(j2, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        FileInputStream fileInputStream = this.f6011h;
        int i3 = Util6.f6307a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f6012i == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j3 = this.f6012i;
        if (j3 != -1) {
            this.f6012i = j3 - ((long) i4);
        }
        m2922q(i4);
        return i4;
    }
}
