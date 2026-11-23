package p007c.p085g.p086a.p089m.p092t.p093c0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.t.c0.j, reason: use source file name */
/* JADX INFO: compiled from: LruBitmapPool.java */
/* JADX INFO: loaded from: classes.dex */
public class LruBitmapPool implements BitmapPool {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config f3120a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public final LruPoolStrategy f3121b;

    /* JADX INFO: renamed from: c */
    public final Set<Bitmap.Config> f3122c;

    /* JADX INFO: renamed from: d */
    public final a f3123d;

    /* JADX INFO: renamed from: e */
    public long f3124e;

    /* JADX INFO: renamed from: f */
    public long f3125f;

    /* JADX INFO: renamed from: g */
    public int f3126g;

    /* JADX INFO: renamed from: h */
    public int f3127h;

    /* JADX INFO: renamed from: i */
    public int f3128i;

    /* JADX INFO: renamed from: j */
    public int f3129j;

    /* JADX INFO: renamed from: c.g.a.m.t.c0.j$a */
    /* JADX INFO: compiled from: LruBitmapPool.java */
    public interface a {
    }

    /* JADX INFO: renamed from: c.g.a.m.t.c0.j$b */
    /* JADX INFO: compiled from: LruBitmapPool.java */
    public static final class b implements a {
    }

    public LruBitmapPool(long j2) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f3124e = j2;
        this.f3121b = sizeConfigStrategy;
        this.f3122c = setUnmodifiableSet;
        this.f3123d = new b();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo1749a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            m1768i(0L);
        } else if (i >= 20 || i == 15) {
            m1768i(this.f3124e / 2);
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: b */
    public void mo1750b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m1768i(0L);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: c */
    public Bitmap mo1751c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM1767h = m1767h(i, i2, config);
        if (bitmapM1767h != null) {
            return bitmapM1767h;
        }
        if (config == null) {
            config = f3120a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: d */
    public synchronized void mo1752d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
                if (Util4.m2049d(bitmap) <= this.f3124e && this.f3122c.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
                    int iM2049d = Util4.m2049d(bitmap);
                    ((SizeConfigStrategy) this.f3121b).m1774f(bitmap);
                    Objects.requireNonNull((b) this.f3123d);
                    this.f3128i++;
                    this.f3125f += (long) iM2049d;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((SizeConfigStrategy) this.f3121b).m1773e(bitmap));
                    }
                    m1765f();
                    m1768i(this.f3124e);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((SizeConfigStrategy) this.f3121b).m1773e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f3122c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: e */
    public Bitmap mo1753e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM1767h = m1767h(i, i2, config);
        if (bitmapM1767h != null) {
            bitmapM1767h.eraseColor(0);
            return bitmapM1767h;
        }
        if (config == null) {
            config = f3120a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: f */
    public final void m1765f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m1766g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1766g() {
        StringBuilder sbM1556G = outline.m1556G("Hits=");
        sbM1556G.append(this.f3126g);
        sbM1556G.append(", misses=");
        sbM1556G.append(this.f3127h);
        sbM1556G.append(", puts=");
        sbM1556G.append(this.f3128i);
        sbM1556G.append(", evictions=");
        sbM1556G.append(this.f3129j);
        sbM1556G.append(", currentSize=");
        sbM1556G.append(this.f3125f);
        sbM1556G.append(", maxSize=");
        sbM1556G.append(this.f3124e);
        sbM1556G.append("\nStrategy=");
        sbM1556G.append(this.f3121b);
        Log.v("LruBitmapPool", sbM1556G.toString());
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Bitmap m1767h(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM1771b;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        bitmapM1771b = ((SizeConfigStrategy) this.f3121b).m1771b(i, i2, config != null ? config : f3120a);
        if (bitmapM1771b == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
                sb.append(SizeConfigStrategy.m1769c(Util4.m2048c(i, i2, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f3127h++;
        } else {
            this.f3126g++;
            long j2 = this.f3125f;
            Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
            this.f3125f = j2 - ((long) Util4.m2049d(bitmapM1771b));
            Objects.requireNonNull((b) this.f3123d);
            bitmapM1771b.setHasAlpha(true);
            bitmapM1771b.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
            sb2.append(SizeConfigStrategy.m1769c(Util4.m2048c(i, i2, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m1765f();
        return bitmapM1771b;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m1768i(long j2) {
        while (this.f3125f > j2) {
            SizeConfigStrategy sizeConfigStrategy = (SizeConfigStrategy) this.f3121b;
            Bitmap bitmapM1756c = sizeConfigStrategy.f3136g.m1756c();
            if (bitmapM1756c != null) {
                sizeConfigStrategy.m1770a(Integer.valueOf(Util4.m2049d(bitmapM1756c)), bitmapM1756c);
            }
            if (bitmapM1756c == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m1766g();
                }
                this.f3125f = 0L;
                return;
            }
            Objects.requireNonNull((b) this.f3123d);
            long j3 = this.f3125f;
            Objects.requireNonNull((SizeConfigStrategy) this.f3121b);
            this.f3125f = j3 - ((long) Util4.m2049d(bitmapM1756c));
            this.f3129j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((SizeConfigStrategy) this.f3121b).m1773e(bitmapM1756c));
            }
            m1765f();
            bitmapM1756c.recycle();
        }
    }

    public LruBitmapPool(long j2, Set<Bitmap.Config> set) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        this.f3124e = j2;
        this.f3121b = sizeConfigStrategy;
        this.f3122c = set;
        this.f3123d = new b();
    }
}
