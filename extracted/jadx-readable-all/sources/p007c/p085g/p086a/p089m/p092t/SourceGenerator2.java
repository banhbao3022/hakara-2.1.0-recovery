package p007c.p085g.p086a.p089m.p092t;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Encoder;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p096u.ModelLoader;
import p007c.p085g.p086a.p112s.LogTime;

/* JADX INFO: renamed from: c.g.a.m.t.b0, reason: use source file name */
/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class SourceGenerator2 implements DataFetcherGenerator, DataFetcherGenerator.a {

    /* JADX INFO: renamed from: f */
    public final DecodeHelper<?> f3097f;

    /* JADX INFO: renamed from: g */
    public final DataFetcherGenerator.a f3098g;

    /* JADX INFO: renamed from: h */
    public int f3099h;

    /* JADX INFO: renamed from: i */
    public DataCacheGenerator f3100i;

    /* JADX INFO: renamed from: j */
    public Object f3101j;

    /* JADX INFO: renamed from: k */
    public volatile ModelLoader.a<?> f3102k;

    /* JADX INFO: renamed from: l */
    public DataCacheKey f3103l;

    public SourceGenerator2(DecodeHelper<?> decodeHelper, DataFetcherGenerator.a aVar) {
        this.f3097f = decodeHelper;
        this.f3098g = aVar;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    /* JADX INFO: renamed from: a */
    public boolean mo1734a() {
        Object obj = this.f3101j;
        if (obj != null) {
            this.f3101j = null;
            int i = LogTime.f3820b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                Encoder<X> encoderM1792e = this.f3097f.m1792e(obj);
                DataCacheWriter dataCacheWriter = new DataCacheWriter(encoderM1792e, obj, this.f3097f.f3209i);
                Key key = this.f3102k.f3433a;
                DecodeHelper<?> decodeHelper = this.f3097f;
                this.f3103l = new DataCacheKey(key, decodeHelper.f3214n);
                decodeHelper.m1789b().mo1776a(this.f3103l, dataCacheWriter);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f3103l + ", data: " + obj + ", encoder: " + encoderM1792e + ", duration: " + LogTime.m2040a(jElapsedRealtimeNanos));
                }
                this.f3102k.f3435c.mo1715b();
                this.f3100i = new DataCacheGenerator(Collections.singletonList(this.f3102k.f3433a), this.f3097f, this);
            } catch (Throwable th) {
                this.f3102k.f3435c.mo1715b();
                throw th;
            }
        }
        DataCacheGenerator dataCacheGenerator = this.f3100i;
        if (dataCacheGenerator != null && dataCacheGenerator.mo1734a()) {
            return true;
        }
        this.f3100i = null;
        this.f3102k = null;
        boolean z = false;
        while (!z) {
            if (!(this.f3099h < this.f3097f.m1790c().size())) {
                break;
            }
            List<ModelLoader.a<?>> listM1790c = this.f3097f.m1790c();
            int i2 = this.f3099h;
            this.f3099h = i2 + 1;
            this.f3102k = listM1790c.get(i2);
            if (this.f3102k != null && (this.f3097f.f3216p.mo1811c(this.f3102k.f3435c.mo1717d()) || this.f3097f.m1794g(this.f3102k.f3435c.mo1712a()))) {
                this.f3102k.f3435c.mo1718e(this.f3097f.f3215o, new SourceGenerator(this, this.f3102k));
                z = true;
            }
        }
        return z;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator
    public void cancel() {
        ModelLoader.a<?> aVar = this.f3102k;
        if (aVar != null) {
            aVar.f3435c.cancel();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: f */
    public void mo1735f(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        this.f3098g.mo1735f(key, exc, dataFetcher, this.f3102k.f3435c.mo1717d());
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: h */
    public void mo1736h() {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: j */
    public void mo1737j(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.f3098g.mo1737j(key, obj, dataFetcher, this.f3102k.f3435c.mo1717d(), key);
    }
}
