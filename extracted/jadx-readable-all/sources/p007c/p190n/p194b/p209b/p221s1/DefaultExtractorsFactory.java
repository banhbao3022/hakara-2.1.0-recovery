package p007c.p190n.p194b.p209b.p221s1;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.p221s1.p222e0.AmrExtractor;
import p007c.p190n.p194b.p209b.p221s1.p223f0.FlacExtractor;
import p007c.p190n.p194b.p209b.p221s1.p224g0.FlvExtractor;
import p007c.p190n.p194b.p209b.p221s1.p225h0.JpegExtractor;
import p007c.p190n.p194b.p209b.p221s1.p226i0.MatroskaExtractor;
import p007c.p190n.p194b.p209b.p221s1.p227j0.Mp3Extractor;
import p007c.p190n.p194b.p209b.p221s1.p228k0.FragmentedMp4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p228k0.Mp4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p229l0.OggExtractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.Ac3Extractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.Ac4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.AdtsExtractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.PsExtractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.TsExtractor;
import p007c.p190n.p194b.p209b.p221s1.p232o0.WavExtractor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.f, reason: use source file name */
/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory2 {

    /* JADX INFO: renamed from: a */
    public static final int[] f7598a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: b */
    public static final Constructor<? extends Extractor> f7599b;

    /* JADX INFO: renamed from: c */
    public int f7600c = 1;

    /* JADX INFO: renamed from: d */
    public int f7601d = 112800;

    static {
        Constructor<? extends Extractor> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f7599b = constructor;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
    /* JADX INFO: renamed from: a */
    public synchronized Extractor[] mo3745a() {
        return mo3746b(Uri.EMPTY, new HashMap());
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
    /* JADX INFO: renamed from: b */
    public synchronized Extractor[] mo3746b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iM4578n = C2096e.m4578n(map);
        if (iM4578n != -1) {
            m3753c(iM4578n, arrayList);
        }
        int iM4579o = C2096e.m4579o(uri);
        if (iM4579o != -1 && iM4579o != iM4578n) {
            m3753c(iM4579o, arrayList);
        }
        for (int i : f7598a) {
            if (i != iM4578n && i != iM4579o) {
                m3753c(i, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c */
    public final void m3753c(int i, List<Extractor> list) {
        switch (i) {
            case 0:
                list.add(new Ac3Extractor());
                return;
            case 1:
                list.add(new Ac4Extractor());
                return;
            case 2:
                list.add(new AdtsExtractor(0));
                return;
            case 3:
                list.add(new AmrExtractor(0));
                return;
            case 4:
                Constructor<? extends Extractor> constructor = f7599b;
                if (constructor == null) {
                    list.add(new FlacExtractor(0));
                    return;
                }
                try {
                    list.add(constructor.newInstance(0));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                }
            case 5:
                list.add(new FlvExtractor());
                return;
            case 6:
                list.add(new MatroskaExtractor(0));
                return;
            case 7:
                list.add(new Mp3Extractor(0));
                return;
            case 8:
                list.add(new FragmentedMp4Extractor(0));
                list.add(new Mp4Extractor(0));
                return;
            case 9:
                list.add(new OggExtractor());
                return;
            case 10:
                list.add(new PsExtractor());
                return;
            case 11:
                list.add(new TsExtractor(this.f7600c, 0, this.f7601d));
                return;
            case 12:
                list.add(new WavExtractor());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new JpegExtractor());
                return;
        }
    }
}
