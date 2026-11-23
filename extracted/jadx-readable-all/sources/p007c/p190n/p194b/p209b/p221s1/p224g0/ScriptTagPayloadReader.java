package p007c.p190n.p194b.p209b.p221s1.p224g0;

import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;

/* JADX INFO: renamed from: c.n.b.b.s1.g0.d, reason: use source file name */
/* JADX INFO: compiled from: ScriptTagPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public long f7643b;

    /* JADX INFO: renamed from: c */
    public long[] f7644c;

    /* JADX INFO: renamed from: d */
    public long[] f7645d;

    public ScriptTagPayloadReader() {
        super(new DummyTrackOutput());
        this.f7643b = -9223372036854775807L;
        this.f7644c = new long[0];
        this.f7645d = new long[0];
    }

    /* JADX INFO: renamed from: d */
    public static Object m3765d(ParsableByteArray parsableByteArray, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.m3208m()));
        }
        if (i == 1) {
            return Boolean.valueOf(parsableByteArray.m3214s() == 1);
        }
        if (i == 2) {
            return m3767f(parsableByteArray);
        }
        if (i != 3) {
            if (i == 8) {
                return m3766e(parsableByteArray);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(parsableByteArray.m3208m())).doubleValue());
                parsableByteArray.m3195E(2);
                return date;
            }
            int iM3217v = parsableByteArray.m3217v();
            ArrayList arrayList = new ArrayList(iM3217v);
            for (int i2 = 0; i2 < iM3217v; i2++) {
                Object objM3765d = m3765d(parsableByteArray, parsableByteArray.m3214s());
                if (objM3765d != null) {
                    arrayList.add(objM3765d);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM3767f = m3767f(parsableByteArray);
            int iM3214s = parsableByteArray.m3214s();
            if (iM3214s == 9) {
                return map;
            }
            Object objM3765d2 = m3765d(parsableByteArray, iM3214s);
            if (objM3765d2 != null) {
                map.put(strM3767f, objM3765d2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static HashMap<String, Object> m3766e(ParsableByteArray parsableByteArray) {
        int iM3217v = parsableByteArray.m3217v();
        HashMap<String, Object> map = new HashMap<>(iM3217v);
        for (int i = 0; i < iM3217v; i++) {
            String strM3767f = m3767f(parsableByteArray);
            Object objM3765d = m3765d(parsableByteArray, parsableByteArray.m3214s());
            if (objM3765d != null) {
                map.put(strM3767f, objM3765d);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: f */
    public static String m3767f(ParsableByteArray parsableByteArray) {
        int iM3219x = parsableByteArray.m3219x();
        int i = parsableByteArray.f6393b;
        parsableByteArray.m3195E(iM3219x);
        return new String(parsableByteArray.f6392a, i, iM3219x);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo3762b(ParsableByteArray parsableByteArray) {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p224g0.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo3763c(ParsableByteArray parsableByteArray, long j2) {
        if (parsableByteArray.m3214s() != 2 || !"onMetaData".equals(m3767f(parsableByteArray)) || parsableByteArray.m3214s() != 8) {
            return false;
        }
        HashMap<String, Object> mapM3766e = m3766e(parsableByteArray);
        Object obj = mapM3766e.get(CainMediaMetadataRetriever.METADATA_KEY_DURATION);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f7643b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM3766e.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f7644c = new long[size];
                this.f7645d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f7644c = new long[0];
                        this.f7645d = new long[0];
                        break;
                    }
                    this.f7644c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f7645d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
