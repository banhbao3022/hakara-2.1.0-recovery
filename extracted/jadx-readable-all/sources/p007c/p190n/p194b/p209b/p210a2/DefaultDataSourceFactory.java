package p007c.p190n.p194b.p209b.p210a2;

import android.content.Context;

/* JADX INFO: renamed from: c.n.b.b.a2.t, reason: use source file name */
/* JADX INFO: compiled from: DefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultDataSourceFactory implements DataSource3.a {

    /* JADX INFO: renamed from: a */
    public final Context f6204a;

    /* JADX INFO: renamed from: b */
    public final TransferListener f6205b;

    /* JADX INFO: renamed from: c */
    public final DataSource3.a f6206c;

    public DefaultDataSourceFactory(Context context) {
        this(context, (String) null, (TransferListener) null);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3.a
    /* JADX INFO: renamed from: a */
    public DataSource3 mo2953a() {
        DefaultDataSource defaultDataSource = new DefaultDataSource(this.f6204a, this.f6206c.mo2953a());
        TransferListener transferListener = this.f6205b;
        if (transferListener != null) {
            defaultDataSource.mo2915c(transferListener);
        }
        return defaultDataSource;
    }

    public DefaultDataSourceFactory(Context context, String str) {
        this(context, str, (TransferListener) null);
    }

    public DefaultDataSourceFactory(Context context, String str, TransferListener transferListener) {
        DefaultHttpDataSource.a aVar = new DefaultHttpDataSource.a();
        aVar.f6226b = str;
        this(context, transferListener, aVar);
    }

    public DefaultDataSourceFactory(Context context, DataSource3.a aVar) {
        this(context, (TransferListener) null, aVar);
    }

    public DefaultDataSourceFactory(Context context, TransferListener transferListener, DataSource3.a aVar) {
        this.f6204a = context.getApplicationContext();
        this.f6205b = transferListener;
        this.f6206c = aVar;
    }
}
