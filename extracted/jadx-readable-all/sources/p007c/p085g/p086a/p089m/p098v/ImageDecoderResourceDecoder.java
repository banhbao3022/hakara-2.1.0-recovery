package p007c.p085g.p086a.p089m.p098v;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.DecodeFormat;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.PreferredColorSpace;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.Downsampler;
import p007c.p085g.p086a.p089m.p098v.p099d.HardwareConfigState;

/* JADX INFO: renamed from: c.g.a.m.v.a, reason: use source file name */
/* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageDecoderResourceDecoder<T> implements ResourceDecoder<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: a */
    public final HardwareConfigState f3503a = HardwareConfigState.m1908a();

    /* JADX INFO: renamed from: c.g.a.m.v.a$a */
    /* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
    public class a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3504a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f3505b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f3506c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DecodeFormat f3507d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DownsampleStrategy f3508e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PreferredColorSpace f3509f;

        /* JADX INFO: renamed from: c.g.a.m.v.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ImageDecoderResourceDecoder.java */
        public class C8505a implements ImageDecoder.OnPartialImageListener {
            public C8505a(a aVar) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public a(int i, int i2, boolean z, DecodeFormat decodeFormat, DownsampleStrategy downsampleStrategy, PreferredColorSpace preferredColorSpace) {
            this.f3504a = i;
            this.f3505b = i2;
            this.f3506c = z;
            this.f3507d = decodeFormat;
            this.f3508e = downsampleStrategy;
            this.f3509f = preferredColorSpace;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (ImageDecoderResourceDecoder.this.f3503a.m1909b(this.f3504a, this.f3505b, this.f3506c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f3507d == DecodeFormat.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C8505a(this));
            Size size = imageInfo.getSize();
            int width = this.f3504a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f3505b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fMo1895b = this.f3508e.mo1895b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fMo1895b);
            int iRound2 = Math.round(size.getHeight() * fMo1895b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder sbM1556G = outline.m1556G("Resizing from [");
                sbM1556G.append(size.getWidth());
                sbM1556G.append("x");
                sbM1556G.append(size.getHeight());
                sbM1556G.append("] to [");
                sbM1556G.append(iRound);
                sbM1556G.append("x");
                sbM1556G.append(iRound2);
                sbM1556G.append("] scaleFactor: ");
                sbM1556G.append(fMo1895b);
                Log.v("ImageDecoder", sbM1556G.toString());
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i = Build.VERSION.SDK_INT;
            if (i < 28) {
                if (i >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (this.f3509f == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(ImageDecoder.Source source, Options options) throws IOException {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract Resource2<T> mo1870c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Resource2<T> mo1710b(ImageDecoder.Source source, int i, int i2, Options options) throws IOException {
        DecodeFormat decodeFormat = (DecodeFormat) options.m1707c(Downsampler.f3559a);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.m1707c(DownsampleStrategy.f3557f);
        Option<Boolean> option = Downsampler.f3562d;
        return mo1870c(source, i, i2, new a(i, i2, options.m1707c(option) != null && ((Boolean) options.m1707c(option)).booleanValue(), decodeFormat, downsampleStrategy, (PreferredColorSpace) options.m1707c(Downsampler.f3560b)));
    }
}
