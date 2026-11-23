package p007c.p190n.p194b.p209b.p243w1;

import android.content.Context;
import android.util.SparseArray;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DefaultDataSourceFactory;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;

/* JADX INFO: renamed from: c.n.b.b.w1.t, reason: use source file name */
/* JADX INFO: compiled from: DefaultMediaSourceFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {

    /* JADX INFO: renamed from: a */
    public final DataSource3.a f9071a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<MediaSourceFactory> f9072b;

    /* JADX INFO: renamed from: c */
    public final int[] f9073c;

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSourceFactory(context));
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory2 extractorsFactory2) {
        this(new DefaultDataSourceFactory(context), extractorsFactory2);
    }

    public DefaultMediaSourceFactory(DataSource3.a aVar) {
        this(aVar, new DefaultExtractorsFactory());
    }

    public DefaultMediaSourceFactory(DataSource3.a aVar, ExtractorsFactory2 extractorsFactory2) {
        this.f9071a = aVar;
        SparseArray<MediaSourceFactory> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(MediaSourceFactory.class).getConstructor(DataSource3.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(MediaSourceFactory.class).getConstructor(DataSource3.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (MediaSourceFactory) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(MediaSourceFactory.class).getConstructor(DataSource3.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new ProgressiveMediaSource.b(aVar, extractorsFactory2));
        this.f9072b = sparseArray;
        this.f9073c = new int[sparseArray.size()];
        for (int i = 0; i < this.f9072b.size(); i++) {
            this.f9073c[i] = this.f9072b.keyAt(i);
        }
    }
}
