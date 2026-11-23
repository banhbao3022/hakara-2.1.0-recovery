package p007c.p085g.p086a.p089m.p090s;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: renamed from: c.g.a.m.s.h, reason: use source file name */
/* JADX INFO: compiled from: FileDescriptorAssetPathFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorAssetPathFetcher extends AssetPathFetcher<ParcelFileDescriptor> {
    public FileDescriptorAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo1712a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.AssetPathFetcher
    /* JADX INFO: renamed from: c */
    public void mo1716c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p007c.p085g.p086a.p089m.p090s.AssetPathFetcher
    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor mo1719f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
