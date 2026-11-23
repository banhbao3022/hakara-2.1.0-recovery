package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.d.w, reason: use source file name */
/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final Downsampler f3592a;

    public ParcelFileDescriptorBitmapDecoder(Downsampler downsampler) {
        this.f3592a = downsampler;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(ParcelFileDescriptor parcelFileDescriptor, Options options) throws IOException {
        Objects.requireNonNull(this.f3592a);
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, Options options) throws IOException {
        Downsampler downsampler = this.f3592a;
        return downsampler.m1904a(new ImageReader.b(parcelFileDescriptor, downsampler.f3570l, downsampler.f3569k), i, i2, options, Downsampler.f3564f);
    }
}
