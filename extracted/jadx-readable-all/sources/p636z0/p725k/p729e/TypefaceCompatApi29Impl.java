package p636z0.p725k.p729e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.cgfay.media.IMediaPlayer;
import java.io.IOException;
import java.io.InputStream;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat3;
import p636z0.p725k.p736i.FontsContractCompat2;

/* JADX INFO: renamed from: z0.k.e.i, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl2 {
    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: a */
    public Typeface mo16178a(Context context, FontResourcesParserCompat2 fontResourcesParserCompat2, Resources resources, int i) {
        try {
            FontResourcesParserCompat3[] fontResourcesParserCompat3Arr = fontResourcesParserCompat2.f37822a;
            int length = fontResourcesParserCompat3Arr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                FontResourcesParserCompat3 fontResourcesParserCompat3 = fontResourcesParserCompat3Arr[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, fontResourcesParserCompat3.f37828f).setWeight(fontResourcesParserCompat3.f37824b);
                    if (!fontResourcesParserCompat3.f37825c) {
                        i3 = 0;
                    }
                    Font fontBuild = weight.setSlant(i3).setTtcIndex(fontResourcesParserCompat3.f37827e).setFontVariationSettings(fontResourcesParserCompat3.f37826d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: b */
    public Typeface mo16179b(Context context, CancellationSignal cancellationSignal, FontsContractCompat2[] fontsContractCompat2Arr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = fontsContractCompat2Arr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                FontsContractCompat2 fontsContractCompat2 = fontsContractCompat2Arr[i2];
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fontsContractCompat2.f37926a, "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                        i2++;
                    } else {
                        try {
                            Font.Builder weight = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fontsContractCompat2.f37928c);
                            if (!fontsContractCompat2.f37929d) {
                                i3 = 0;
                            }
                            Font fontBuild = weight.setSlant(i3).setTtcIndex(fontsContractCompat2.f37927b).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
                i2++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: c */
    public Typeface mo16192c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p636z0.p725k.p729e.TypefaceCompatBaseImpl2
    /* JADX INFO: renamed from: d */
    public Typeface mo16183d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
