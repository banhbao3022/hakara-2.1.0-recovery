package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p210a2.BaseDataSource;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final Resources f28454e;

    /* JADX INFO: renamed from: f */
    public final String f28455f;

    /* JADX INFO: renamed from: g */
    public Uri f28456g;

    /* JADX INFO: renamed from: h */
    public AssetFileDescriptor f28457h;

    /* JADX INFO: renamed from: i */
    public InputStream f28458i;

    /* JADX INFO: renamed from: j */
    public long f28459j;

    /* JADX INFO: renamed from: k */
    public boolean f28460k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.RawResourceDataSource$a */
    public static class C5889a extends IOException {
        public C5889a(String str) {
            super(str);
        }

        public C5889a(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f28454e = context.getResources();
        this.f28455f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0035 */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.google.android.exoplayer2.upstream.RawResourceDataSource.C5889a {
        /*
            r4 = this;
            r0 = 0
            r4.f28456g = r0
            r1 = 0
            java.io.InputStream r2 = r4.f28458i     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
        Lb:
            r4.f28458i = r0
            android.content.res.AssetFileDescriptor r2 = r4.f28457h     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
        L14:
            r4.f28457h = r0
            boolean r0 = r4.f28460k
            if (r0 == 0) goto L1f
            r4.f28460k = r1
            r4.m2923r()
        L1f:
            return
        L20:
            r2 = move-exception
            goto L29
        L22:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a     // Catch: java.lang.Throwable -> L20
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L29:
            r4.f28457h = r0
            boolean r0 = r4.f28460k
            if (r0 == 0) goto L34
            r4.f28460k = r1
            r4.m2923r()
        L34:
            throw r2
        L35:
            r2 = move-exception
            goto L3e
        L37:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a     // Catch: java.lang.Throwable -> L35
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r3     // Catch: java.lang.Throwable -> L35
        L3e:
            r4.f28458i = r0
            android.content.res.AssetFileDescriptor r3 = r4.f28457h     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
        L47:
            r4.f28457h = r0
            boolean r0 = r4.f28460k
            if (r0 == 0) goto L52
            r4.f28460k = r1
            r4.m2923r()
        L52:
            throw r2
        L53:
            r2 = move-exception
            goto L5c
        L55:
            r2 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$a r3 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$a     // Catch: java.lang.Throwable -> L53
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5c:
            r4.f28457h = r0
            boolean r0 = r4.f28460k
            if (r0 == 0) goto L67
            r4.f28460k = r1
            r4.m2923r()
        L67:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws C5889a {
        int identifier;
        Uri uri = dataSpec.f6137a;
        this.f28456g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme())) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment);
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new C5889a("Resource identifier must be an integer.");
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                Objects.requireNonNull(lastPathSegment2);
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    Objects.requireNonNull(lastPathSegment3);
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new C5889a("URI must either use scheme rawresource or android.resource");
            }
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = this.f28454e.getIdentifier(outline.m1550A(new StringBuilder(), TextUtils.isEmpty(host) ? "" : outline.m1599u(host, ":"), path), "raw", this.f28455f);
            if (identifier == 0) {
                throw new C5889a("Resource not found.");
            }
        }
        m2924s(dataSpec);
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f28454e.openRawResourceFd(identifier);
        this.f28457h = assetFileDescriptorOpenRawResourceFd;
        if (assetFileDescriptorOpenRawResourceFd == null) {
            throw new C5889a(outline.m1596r("Resource is compressed: ", uri));
        }
        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
        this.f28458i = fileInputStream;
        try {
            fileInputStream.skip(assetFileDescriptorOpenRawResourceFd.getStartOffset());
            if (fileInputStream.skip(dataSpec.f6142f) < dataSpec.f6142f) {
                throw new EOFException();
            }
            long j2 = dataSpec.f6143g;
            if (j2 != -1) {
                this.f28459j = j2;
            } else {
                long length = assetFileDescriptorOpenRawResourceFd.getLength();
                this.f28459j = length != -1 ? length - dataSpec.f6142f : -1L;
            }
            this.f28460k = true;
            m2925t(dataSpec);
            return this.f28459j;
        } catch (IOException e) {
            throw new C5889a(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f28456g;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws C5889a {
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f28459j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i2 = (int) Math.min(j2, i2);
            } catch (IOException e) {
                throw new C5889a(e);
            }
        }
        InputStream inputStream = this.f28458i;
        int i3 = Util6.f6307a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f28459j == -1) {
                return -1;
            }
            throw new C5889a(new EOFException());
        }
        long j3 = this.f28459j;
        if (j3 != -1) {
            this.f28459j = j3 - ((long) i4);
        }
        m2922q(i4);
        return i4;
    }
}
