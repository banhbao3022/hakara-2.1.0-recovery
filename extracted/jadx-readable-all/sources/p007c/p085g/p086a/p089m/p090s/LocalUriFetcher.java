package p007c.p085g.p086a.p089m.p090s;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;

/* JADX INFO: renamed from: c.g.a.m.s.l, reason: use source file name */
/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {

    /* JADX INFO: renamed from: f */
    public final Uri f3067f;

    /* JADX INFO: renamed from: g */
    public final ContentResolver f3068g;

    /* JADX INFO: renamed from: h */
    public T f3069h;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.f3068g = contentResolver;
        this.f3067f = uri;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: b */
    public void mo1715b() {
        T t = this.f3069h;
        if (t != null) {
            try {
                mo1713c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1713c(T t) throws IOException;

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
    public final void mo1718e(Priority priority, DataFetcher.a<? super T> aVar) {
        try {
            T tMo1714f = mo1714f(this.f3067f, this.f3068g);
            this.f3069h = tMo1714f;
            aVar.mo1721f(tMo1714f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo1720c(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract T mo1714f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
