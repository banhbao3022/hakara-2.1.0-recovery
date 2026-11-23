package p007c.p085g.p086a.p089m.p090s;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.g.a.m.s.i, reason: use source file name */
/* JADX INFO: compiled from: FileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorLocalUriFetcher extends LocalUriFetcher<ParcelFileDescriptor> {
    public FileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo1712a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.LocalUriFetcher
    /* JADX INFO: renamed from: c */
    public void mo1713c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // p007c.p085g.p086a.p089m.p090s.LocalUriFetcher
    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor mo1714f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(outline.m1596r("FileDescriptor is null for: ", uri));
    }
}
