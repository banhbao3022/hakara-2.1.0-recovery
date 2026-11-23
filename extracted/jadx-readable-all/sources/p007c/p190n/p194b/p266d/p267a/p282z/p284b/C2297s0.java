package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.s0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2297s0 {

    /* JADX INFO: renamed from: b */
    public static List<MediaCodecInfo> f10775b;

    /* JADX INFO: renamed from: a */
    public static final Map<String, List<Map<String, Object>>> f10774a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final Object f10776c = new Object();

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    public static List<Map<String, Object>> m4801a(String str) {
        ArrayList arrayList;
        Object obj = f10776c;
        synchronized (obj) {
            Map<String, List<Map<String, Object>>> map = f10774a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f10775b == null) {
                        f10775b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f10775b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap map2 = new HashMap();
                            map2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            map2.put("profileLevels", arrayList2);
                            int i = Build.VERSION.SDK_INT;
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map2.put("bitRatesBps", m4802b(videoCapabilities.getBitrateRange()));
                            map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map2.put("frameRates", m4802b(videoCapabilities.getSupportedFrameRates()));
                            map2.put("widths", m4802b(videoCapabilities.getSupportedWidths()));
                            map2.put("heights", m4802b(videoCapabilities.getSupportedHeights()));
                            if (i >= 23) {
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(map2);
                        }
                    }
                    f10774a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                f10774a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: b */
    public static Integer[] m4802b(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
