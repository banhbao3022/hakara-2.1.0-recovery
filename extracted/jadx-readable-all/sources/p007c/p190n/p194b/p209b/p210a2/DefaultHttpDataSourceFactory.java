package p007c.p190n.p194b.p209b.p210a2;

/* JADX INFO: renamed from: c.n.b.b.a2.v, reason: use source file name */
/* JADX INFO: compiled from: DefaultHttpDataSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class DefaultHttpDataSourceFactory extends HttpDataSource.a {

    /* JADX INFO: renamed from: b */
    public final String f6230b;

    /* JADX INFO: renamed from: c */
    public final TransferListener f6231c;

    /* JADX INFO: renamed from: d */
    public final int f6232d;

    /* JADX INFO: renamed from: e */
    public final int f6233e;

    /* JADX INFO: renamed from: f */
    public final boolean f6234f;

    public DefaultHttpDataSourceFactory() {
        this(null);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.HttpDataSource.a
    /* JADX INFO: renamed from: b */
    public HttpDataSource mo3023b(HttpDataSource.g gVar) {
        DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.f6230b, this.f6232d, this.f6233e, this.f6234f, gVar);
        TransferListener transferListener = this.f6231c;
        if (transferListener != null) {
            defaultHttpDataSource.mo2915c(transferListener);
        }
        return defaultHttpDataSource;
    }

    public DefaultHttpDataSourceFactory(String str) {
        this(str, null);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener transferListener) {
        this(str, transferListener, 8000, 8000, false);
    }

    public DefaultHttpDataSourceFactory(String str, int i, int i2, boolean z) {
        this(str, null, i, i2, z);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener transferListener, int i, int i2, boolean z) {
        this.f6230b = str;
        this.f6231c = transferListener;
        this.f6232d = i;
        this.f6233e = i2;
        this.f6234f = z;
    }
}
