package p007c.p085g.p086a.p089m.p090s;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.g.a.m.s.n, reason: use source file name */
/* JADX INFO: compiled from: StreamAssetPathFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class StreamAssetPathFetcher extends AssetPathFetcher<InputStream> {
    public StreamAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo1712a() {
        return InputStream.class;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.AssetPathFetcher
    /* JADX INFO: renamed from: c */
    public void mo1716c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p007c.p085g.p086a.p089m.p090s.AssetPathFetcher
    /* JADX INFO: renamed from: f */
    public InputStream mo1719f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
