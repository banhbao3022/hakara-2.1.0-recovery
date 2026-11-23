package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p210a2.DataSink;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p212b2.ReusableBufferedOutputStream;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.d, reason: use source file name */
/* JADX INFO: compiled from: CacheDataSink.java */
/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSink implements DataSink {

    /* JADX INFO: renamed from: a */
    public final Cache f6030a;

    /* JADX INFO: renamed from: b */
    public final long f6031b;

    /* JADX INFO: renamed from: c */
    public final int f6032c;

    /* JADX INFO: renamed from: d */
    public DataSpec f6033d;

    /* JADX INFO: renamed from: e */
    public long f6034e;

    /* JADX INFO: renamed from: f */
    public File f6035f;

    /* JADX INFO: renamed from: g */
    public OutputStream f6036g;

    /* JADX INFO: renamed from: h */
    public long f6037h;

    /* JADX INFO: renamed from: i */
    public long f6038i;

    /* JADX INFO: renamed from: j */
    public ReusableBufferedOutputStream f6039j;

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.d$a */
    /* JADX INFO: compiled from: CacheDataSink.java */
    public static final class a extends Cache.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.d$b */
    /* JADX INFO: compiled from: CacheDataSink.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public Cache f6040a;

        /* JADX INFO: renamed from: b */
        public long f6041b = 5242880;

        /* JADX INFO: renamed from: c */
        public int f6042c = 20480;
    }

    public CacheDataSink(Cache cache, long j2) {
        this(cache, j2, 20480);
    }

    /* JADX INFO: renamed from: a */
    public final void m2942a() throws IOException {
        OutputStream outputStream = this.f6036g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            OutputStream outputStream2 = this.f6036g;
            int i = Util6.f6307a;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException unused) {
                }
            }
            this.f6036g = null;
            File file = this.f6035f;
            this.f6035f = null;
            this.f6030a.mo2936g(file, this.f6037h);
        } catch (Throwable th) {
            OutputStream outputStream3 = this.f6036g;
            int i2 = Util6.f6307a;
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (IOException unused2) {
                }
            }
            this.f6036g = null;
            File file2 = this.f6035f;
            this.f6035f = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2943b(DataSpec dataSpec) throws IOException {
        long j2 = dataSpec.f6143g;
        long jMin = j2 != -1 ? Math.min(j2 - this.f6038i, this.f6034e) : -1L;
        Cache cache = this.f6030a;
        String str = dataSpec.f6144h;
        int i = Util6.f6307a;
        this.f6035f = cache.mo2930a(str, dataSpec.f6142f + this.f6038i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f6035f);
        if (this.f6032c > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.f6039j;
            if (reusableBufferedOutputStream == null) {
                this.f6039j = new ReusableBufferedOutputStream(fileOutputStream, this.f6032c);
            } else {
                reusableBufferedOutputStream.m3234a(fileOutputStream);
            }
            this.f6036g = this.f6039j;
        } else {
            this.f6036g = fileOutputStream;
        }
        this.f6037h = 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSink
    public void close() throws a {
        if (this.f6033d == null) {
            return;
        }
        try {
            m2942a();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSink
    /* JADX INFO: renamed from: g */
    public void mo2944g(byte[] bArr, int i, int i2) throws a {
        DataSpec dataSpec = this.f6033d;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.f6037h == this.f6034e) {
                    m2942a();
                    m2943b(dataSpec);
                }
                int iMin = (int) Math.min(i2 - i3, this.f6034e - this.f6037h);
                OutputStream outputStream = this.f6036g;
                int i4 = Util6.f6307a;
                outputStream.write(bArr, i + i3, iMin);
                i3 += iMin;
                long j2 = iMin;
                this.f6037h += j2;
                this.f6038i += j2;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSink
    /* JADX INFO: renamed from: h */
    public void mo2945h(DataSpec dataSpec) throws a {
        Objects.requireNonNull(dataSpec.f6144h);
        if (dataSpec.f6143g == -1 && dataSpec.m3002c(2)) {
            this.f6033d = null;
            return;
        }
        this.f6033d = dataSpec;
        this.f6034e = dataSpec.m3002c(4) ? this.f6031b : Long.MAX_VALUE;
        this.f6038i = 0L;
        try {
            m2943b(dataSpec);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public CacheDataSink(Cache cache, long j2, int i) {
        C2096e.m4571g(j2 > 0 || j2 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j2 != -1 && j2 < 2097152) {
            Log.w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        Objects.requireNonNull(cache);
        this.f6030a = cache;
        this.f6031b = j2 == -1 ? Long.MAX_VALUE : j2;
        this.f6032c = i;
    }
}
