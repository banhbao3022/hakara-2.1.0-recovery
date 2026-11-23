package p007c.p190n.p194b.p209b.p210a2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.a2.e, reason: use source file name */
/* JADX INFO: compiled from: AssetDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final AssetManager f5984e;

    /* JADX INFO: renamed from: f */
    public Uri f5985f;

    /* JADX INFO: renamed from: g */
    public InputStream f5986g;

    /* JADX INFO: renamed from: h */
    public long f5987h;

    /* JADX INFO: renamed from: i */
    public boolean f5988i;

    /* JADX INFO: renamed from: c.n.b.b.a2.e$a */
    /* JADX INFO: compiled from: AssetDataSource.java */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f5984e = context.getAssets();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws p007c.p190n.p194b.p209b.p210a2.AssetDataSource.a {
        /*
            r4 = this;
            r0 = 0
            r4.f5985f = r0
            r1 = 0
            java.io.InputStream r2 = r4.f5986g     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r4.f5986g = r0
            boolean r0 = r4.f5988i
            if (r0 == 0) goto L16
            r4.f5988i = r1
            r4.m2923r()
        L16:
            return
        L17:
            r2 = move-exception
            goto L20
        L19:
            r2 = move-exception
            c.n.b.b.a2.e$a r3 = new c.n.b.b.a2.e$a     // Catch: java.lang.Throwable -> L17
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L20:
            r4.f5986g = r0
            boolean r0 = r4.f5988i
            if (r0 == 0) goto L2b
            r4.f5988i = r1
            r4.m2923r()
        L2b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p209b.p210a2.AssetDataSource.close():void");
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws a {
        try {
            Uri uri = dataSpec.f6137a;
            this.f5985f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m2924s(dataSpec);
            InputStream inputStreamOpen = this.f5984e.open(path, 1);
            this.f5986g = inputStreamOpen;
            if (inputStreamOpen.skip(dataSpec.f6142f) < dataSpec.f6142f) {
                throw new EOFException();
            }
            long j2 = dataSpec.f6143g;
            if (j2 != -1) {
                this.f5987h = j2;
            } else {
                long jAvailable = this.f5986g.available();
                this.f5987h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f5987h = -1L;
                }
            }
            this.f5988i = true;
            m2925t(dataSpec);
            return this.f5987h;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f5985f;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j2 = this.f5987h;
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
        InputStream inputStream = this.f5986g;
        int i3 = Util6.f6307a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f5987h == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j3 = this.f5987h;
        if (j3 != -1) {
            this.f5987h = j3 - ((long) i4);
        }
        m2922q(i4);
        return i4;
    }
}
