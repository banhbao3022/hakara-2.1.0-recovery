package p636z0.p725k.p729e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.cgfay.media.IMediaPlayer;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p736i.FontsContractCompat2;

/* JADX INFO: renamed from: z0.k.e.k, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatBaseImpl2 {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, FontResourcesParserCompat2> f37876a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: z0.k.e.k$a */
    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        int mo16193a(T t);

        /* JADX INFO: renamed from: b */
        boolean mo16194b(T t);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m16195e(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(aVar.mo16193a(t2) - i2) * 2) + (aVar.mo16194b(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo16178a(Context context, FontResourcesParserCompat2 fontResourcesParserCompat2, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo16179b(Context context, CancellationSignal cancellationSignal, FontsContractCompat2[] fontsContractCompat2Arr, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface mo16192c(Context context, InputStream inputStream) {
        File fileM16031B = C8162a.m16031B(context);
        if (fileM16031B == null) {
            return null;
        }
        try {
            if (C8162a.m16070o(fileM16031B, inputStream)) {
                return Typeface.createFromFile(fileM16031B.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM16031B.delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public Typeface mo16183d(Context context, Resources resources, int i, String str, int i2) {
        File fileM16031B = C8162a.m16031B(context);
        if (fileM16031B == null) {
            return null;
        }
        try {
            if (C8162a.m16069n(fileM16031B, resources, i)) {
                return Typeface.createFromFile(fileM16031B.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM16031B.delete();
        }
    }
}
