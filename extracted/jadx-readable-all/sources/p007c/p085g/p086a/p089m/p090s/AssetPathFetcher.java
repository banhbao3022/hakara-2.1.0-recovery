package p007c.p085g.p086a.p089m.p090s;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;

/* JADX INFO: renamed from: c.g.a.m.s.b, reason: use source file name */
/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {

    /* JADX INFO: renamed from: f */
    public final String f3043f;

    /* JADX INFO: renamed from: g */
    public final AssetManager f3044g;

    /* JADX INFO: renamed from: h */
    public T f3045h;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.f3044g = assetManager;
        this.f3043f = str;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: b */
    public void mo1715b() {
        T t = this.f3045h;
        if (t == null) {
            return;
        }
        try {
            mo1716c(t);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1716c(T t) throws IOException;

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    public void cancel() {
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: d */
    public DataSource mo1717d() {
        return DataSource.LOCAL;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: e */
    public void mo1718e(Priority priority, DataFetcher.a<? super T> aVar) {
        try {
            T tMo1719f = mo1719f(this.f3044g, this.f3043f);
            this.f3045h = tMo1719f;
            aVar.mo1721f(tMo1719f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo1720c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo1719f(AssetManager assetManager, String str) throws IOException;
}
