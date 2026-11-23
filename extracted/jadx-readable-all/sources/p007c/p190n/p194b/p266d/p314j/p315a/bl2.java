package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class bl2 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f12726a;

    /* JADX INFO: renamed from: b */
    public static final HashMap<wk2, List<rk2>> f12727b;

    /* JADX INFO: renamed from: c */
    public static final SparseIntArray f12728c;

    /* JADX INFO: renamed from: d */
    public static final SparseIntArray f12729d;

    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> f12730e;

    /* JADX INFO: renamed from: f */
    public static int f12731f;

    static {
        Objects.requireNonNull("OMX.google.raw.decoder");
        f12726a = Pattern.compile("^\\D?(\\d+)$");
        f12727b = new HashMap<>();
        f12731f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12728c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f12729d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f12730e = map;
        outline.m1563N(1, map, "L30", 4, "L60", 16, "L63", 64, "L90");
        outline.m1563N(256, map, "L93", 1024, "L120", 4096, "L123", 16384, "L150");
        outline.m1563N(65536, map, "L153", 262144, "L156", 1048576, "L180", 4194304, "L183");
        outline.m1563N(16777216, map, "L186", 2, "H30", 8, "H60", 32, "H63");
        outline.m1563N(128, map, "H90", 512, "H93", 2048, "H120", 8192, "H123");
        outline.m1563N(32768, map, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    /* JADX INFO: renamed from: a */
    public static rk2 m6039a(String str, boolean z) throws xk2 {
        List<rk2> listUnmodifiableList;
        synchronized (bl2.class) {
            wk2 wk2Var = new wk2(str, z);
            HashMap<wk2, List<rk2>> map = f12727b;
            listUnmodifiableList = map.get(wk2Var);
            if (listUnmodifiableList == null) {
                int i = jo2.f15673a;
                List<rk2> listM6041c = m6041c(wk2Var, i >= 21 ? new al2(z) : new zk2());
                if (z && ((ArrayList) listM6041c).isEmpty() && i >= 21 && i <= 23) {
                    listM6041c = m6041c(wk2Var, new zk2());
                    ArrayList arrayList = (ArrayList) listM6041c;
                    if (!arrayList.isEmpty()) {
                        String str2 = ((rk2) arrayList.get(0)).f18914a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                        sb.append("MediaCodecList API didn't list secure decoder for: ");
                        sb.append(str);
                        sb.append(". Assuming: ");
                        sb.append(str2);
                        Log.w("MediaCodecUtil", sb.toString());
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(listM6041c);
                map.put(wk2Var, listUnmodifiableList);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return listUnmodifiableList.get(0);
    }

    /* JADX INFO: renamed from: b */
    public static int m6040b() throws xk2 {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (f12731f == -1) {
            int iMax = 0;
            rk2 rk2VarM6039a = m6039a("video/avc", false);
            if (rk2VarM6039a != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = rk2VarM6039a.f18919f;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i = codecProfileLevelArr[iMax].level;
                    int i2 = 9437184;
                    if (i != 1 && i != 2) {
                        switch (i) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, jo2.f15673a >= 21 ? 345600 : 172800);
            }
            f12731f = iMax;
        }
        return f12731f;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019c A[Catch: Exception -> 0x01b6, TryCatch #4 {Exception -> 0x01b6, blocks: (B:102:0x0192, B:104:0x019c, B:106:0x01a4, B:108:0x01ac, B:115:0x01c4, B:120:0x01ce, B:118:0x01ca), top: B:162:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a4 A[Catch: Exception -> 0x01b6, TryCatch #4 {Exception -> 0x01b6, blocks: (B:102:0x0192, B:104:0x019c, B:106:0x01a4, B:108:0x01ac, B:115:0x01c4, B:120:0x01ce, B:118:0x01ca), top: B:162:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4 A[Catch: Exception -> 0x01b6, TryCatch #4 {Exception -> 0x01b6, blocks: (B:102:0x0192, B:104:0x019c, B:106:0x01a4, B:108:0x01ac, B:115:0x01c4, B:120:0x01ce, B:118:0x01ca), top: B:162:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x022d A[Catch: Exception -> 0x02a9, TRY_ENTER, TryCatch #2 {Exception -> 0x02a9, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:138:0x0225, B:141:0x022d, B:143:0x0233, B:144:0x0257, B:145:0x0289), top: B:158:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x028a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0257 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126 A[Catch: Exception -> 0x02a9, TRY_ENTER, TryCatch #2 {Exception -> 0x02a9, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:138:0x0225, B:141:0x022d, B:143:0x0233, B:144:0x0257, B:145:0x0289), top: B:158:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    /* JADX WARN: Code duplicated, block: B:91:0x0162 A[Catch: Exception -> 0x02a9, TryCatch #2 {Exception -> 0x02a9, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:138:0x0225, B:141:0x022d, B:143:0x0233, B:144:0x0257, B:145:0x0289), top: B:158:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0172 A[Catch: Exception -> 0x02a9, TryCatch #2 {Exception -> 0x02a9, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:138:0x0225, B:141:0x022d, B:143:0x0233, B:144:0x0257, B:145:0x0289), top: B:158:0x0004 }] */
    /* JADX INFO: renamed from: c */
    public static List<rk2> m6041c(wk2 wk2Var, yk2 yk2Var) throws xk2 {
        int i;
        String[] supportedTypes;
        int length;
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        String[] strArr;
        String str3;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        String str5;
        boolean z;
        wk2 wk2Var2 = wk2Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = wk2Var2.f21254a;
            int iZza = yk2Var.zza();
            boolean zMo5827b = yk2Var.mo5827b();
            int i5 = 0;
            while (i5 < iZza) {
                MediaCodecInfo mediaCodecInfoMo5825A = yk2Var.mo5825A(i5);
                String name = mediaCodecInfoMo5825A.getName();
                if (!mediaCodecInfoMo5825A.isEncoder()) {
                    String str7 = ".secure";
                    if ((zMo5827b || !name.endsWith(".secure")) && (((i = jo2.f15673a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(jo2.f15674b))))) {
                        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                            String str8 = jo2.f15674b;
                            if (!"dlxu".equals(str8) && !"protou".equals(str8) && !"ville".equals(str8) && !"villeplus".equals(str8) && !"villec2".equals(str8) && !str8.startsWith("gee") && !"C6602".equals(str8) && !"C6603".equals(str8) && !"C6606".equals(str8) && !"C6616".equals(str8) && !"L36h".equals(str8) && !"SO-02E".equals(str8)) {
                                if (i != 16) {
                                    if (i > 19) {
                                        if (i <= 19) {
                                            supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                            length = supportedTypes.length;
                                            i2 = 0;
                                            while (true) {
                                                str = supportedTypes[i2];
                                                if (str.equalsIgnoreCase(str6)) {
                                                    capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                    boolean zMo5826a = yk2Var.mo5826a(str6, capabilitiesForType);
                                                    if (jo2.f15673a <= 22) {
                                                        str5 = jo2.f15676d;
                                                        if (str5.equals("ODROID-XU3")) {
                                                        }
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (zMo5827b) {
                                                        i3 = i2;
                                                        i4 = length;
                                                        strArr = supportedTypes;
                                                        str3 = str7;
                                                        str2 = str;
                                                        if (!zMo5827b) {
                                                            boolean z2 = z;
                                                            str4 = name;
                                                            arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z2, true));
                                                            return arrayList;
                                                        }
                                                    } else {
                                                        i3 = i2;
                                                        i4 = length;
                                                        strArr = supportedTypes;
                                                        str3 = str7;
                                                        str2 = str;
                                                        if (!zMo5827b) {
                                                            boolean z3 = z;
                                                            str4 = name;
                                                            arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z3, true));
                                                            return arrayList;
                                                        }
                                                    }
                                                    i2 = i3 + 1;
                                                    str7 = str3;
                                                    name = str4;
                                                    length = i4;
                                                    supportedTypes = strArr;
                                                    wk2Var2 = wk2Var;
                                                    yk2Var = yk2Var;
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                }
                                                str4 = name;
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            }
                                        } else {
                                            supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                            length = supportedTypes.length;
                                            i2 = 0;
                                            while (true) {
                                                str = supportedTypes[i2];
                                                if (str.equalsIgnoreCase(str6)) {
                                                    capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                    boolean zMo5826a2 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                    if (jo2.f15673a <= 22) {
                                                        str5 = jo2.f15676d;
                                                        if (str5.equals("ODROID-XU3")) {
                                                        }
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (zMo5827b) {
                                                        i3 = i2;
                                                        i4 = length;
                                                        strArr = supportedTypes;
                                                        str3 = str7;
                                                        str2 = str;
                                                        if (!zMo5827b) {
                                                            boolean z4 = z;
                                                            str4 = name;
                                                            arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z4, true));
                                                            return arrayList;
                                                        }
                                                    } else {
                                                        i3 = i2;
                                                        i4 = length;
                                                        strArr = supportedTypes;
                                                        str3 = str7;
                                                        str2 = str;
                                                        if (!zMo5827b) {
                                                            boolean z5 = z;
                                                            str4 = name;
                                                            arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z5, true));
                                                            return arrayList;
                                                        }
                                                    }
                                                    i2 = i3 + 1;
                                                    str7 = str3;
                                                    name = str4;
                                                    length = i4;
                                                    supportedTypes = strArr;
                                                    wk2Var2 = wk2Var;
                                                    yk2Var = yk2Var;
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                }
                                                str4 = name;
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            }
                                        }
                                    } else if (i <= 19) {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a3 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z6 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z6, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z7 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z7, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    } else {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a4 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z8 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z8, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z9 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z9, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    }
                                } else if (i > 19) {
                                    if (i <= 19) {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a5 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z10 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z10, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z11 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z11, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    } else {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a6 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z12 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z12, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z13 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z13, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    }
                                } else if (i <= 19) {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a7 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                if (str5.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z14 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z14, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z15 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z15, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a8 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                if (str5.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z16 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z16, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z17 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z17, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                }
                            }
                        } else if (i != 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                            String str9 = jo2.f15674b;
                            if (!"C1504".equals(str9) && !"C1505".equals(str9) && !"C1604".equals(str9) && !"C1605".equals(str9)) {
                                if (i > 19) {
                                    if (i <= 19) {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a9 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z18 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z18, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z19 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z19, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    } else {
                                        supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (true) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str6)) {
                                                capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                                boolean zMo5826a10 = yk2Var.mo5826a(str6, capabilitiesForType);
                                                if (jo2.f15673a <= 22) {
                                                    str5 = jo2.f15676d;
                                                    if (str5.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if (zMo5827b) {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z110 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z110, true));
                                                        return arrayList;
                                                    }
                                                } else {
                                                    i3 = i2;
                                                    i4 = length;
                                                    strArr = supportedTypes;
                                                    str3 = str7;
                                                    str2 = str;
                                                    if (!zMo5827b) {
                                                        boolean z111 = z;
                                                        str4 = name;
                                                        arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z111, true));
                                                        return arrayList;
                                                    }
                                                }
                                                i2 = i3 + 1;
                                                str7 = str3;
                                                name = str4;
                                                length = i4;
                                                supportedTypes = strArr;
                                                wk2Var2 = wk2Var;
                                                yk2Var = yk2Var;
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                            }
                                            str4 = name;
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                    }
                                } else if (i <= 19) {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a11 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                if (str5.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z112 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z112, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z113 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z113, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a12 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                if (str5.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z114 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z114, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z115 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z115, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                }
                            }
                        } else if (i > 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(jo2.f15675c)) {
                            String str10 = jo2.f15674b;
                            if (!str10.startsWith("d2") && !str10.startsWith("serrano") && !str10.startsWith("jflte") && !str10.startsWith("santos") && !str10.startsWith("t0")) {
                                if (i <= 19) {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a13 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                z = str5.equals("ODROID-XU3") ? true : true;
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z116 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z116, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z117 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z117, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (true) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str6)) {
                                            capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                            boolean zMo5826a14 = yk2Var.mo5826a(str6, capabilitiesForType);
                                            if (jo2.f15673a <= 22) {
                                                str5 = jo2.f15676d;
                                                if (str5.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            if (zMo5827b) {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z118 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z118, true));
                                                    return arrayList;
                                                }
                                            } else {
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                if (!zMo5827b) {
                                                    boolean z119 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z119, true));
                                                    return arrayList;
                                                }
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        } else {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                        }
                                        str4 = name;
                                        i2 = i3 + 1;
                                        str7 = str3;
                                        name = str4;
                                        length = i4;
                                        supportedTypes = strArr;
                                        wk2Var2 = wk2Var;
                                        yk2Var = yk2Var;
                                    }
                                }
                            }
                        } else if (i <= 19 || !jo2.f15674b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                            supportedTypes = mediaCodecInfoMo5825A.getSupportedTypes();
                            length = supportedTypes.length;
                            i2 = 0;
                            while (i2 < length) {
                                str = supportedTypes[i2];
                                if (str.equalsIgnoreCase(str6)) {
                                    try {
                                        capabilitiesForType = mediaCodecInfoMo5825A.getCapabilitiesForType(str);
                                        boolean zMo5826a15 = yk2Var.mo5826a(str6, capabilitiesForType);
                                        if (jo2.f15673a <= 22) {
                                            try {
                                                str5 = jo2.f15676d;
                                                if ((str5.equals("ODROID-XU3") && !str5.equals("Nexus 10")) || (!"OMX.Exynos.AVC.Decoder".equals(name) && !"OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                                    z = false;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                i3 = i2;
                                                i4 = length;
                                                strArr = supportedTypes;
                                                str3 = str7;
                                                str2 = str;
                                                str4 = name;
                                                if (jo2.f15673a <= 23) {
                                                }
                                                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                                sb.append("Failed to query codec ");
                                                sb.append(str4);
                                                sb.append(" (");
                                                sb.append(str2);
                                                sb.append(")");
                                                Log.e("MediaCodecUtil", sb.toString());
                                                throw e;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        if ((zMo5827b || wk2Var2.f21255b != zMo5826a15) && (zMo5827b || wk2Var2.f21255b)) {
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                            str2 = str;
                                            if (!zMo5827b && zMo5826a15) {
                                                try {
                                                    boolean z1110 = z;
                                                    str4 = name;
                                                    arrayList.add(new rk2(String.valueOf(name).concat(str3), str6, capabilitiesForType, z1110, true));
                                                    return arrayList;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str4 = name;
                                                    if (jo2.f15673a <= 23) {
                                                    }
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                                    sb2.append("Failed to query codec ");
                                                    sb2.append(str4);
                                                    sb2.append(" (");
                                                    sb2.append(str2);
                                                    sb2.append(")");
                                                    Log.e("MediaCodecUtil", sb2.toString());
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            str2 = str;
                                            i3 = i2;
                                            i4 = length;
                                            strArr = supportedTypes;
                                            str3 = str7;
                                            boolean z20 = z;
                                            str4 = name;
                                            try {
                                                arrayList.add(new rk2(name, str6, capabilitiesForType, z20, false));
                                            } catch (Exception e3) {
                                                e = e3;
                                                if (jo2.f15673a <= 23) {
                                                }
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                                sb3.append("Failed to query codec ");
                                                sb3.append(str4);
                                                sb3.append(" (");
                                                sb3.append(str2);
                                                sb3.append(")");
                                                Log.e("MediaCodecUtil", sb3.toString());
                                                throw e;
                                            }
                                            i2 = i3 + 1;
                                            str7 = str3;
                                            name = str4;
                                            length = i4;
                                            supportedTypes = strArr;
                                            wk2Var2 = wk2Var;
                                            yk2Var = yk2Var;
                                        }
                                        e = e3;
                                    } catch (Exception e4) {
                                        e = e4;
                                        str2 = str;
                                        i3 = i2;
                                        i4 = length;
                                        strArr = supportedTypes;
                                        str3 = str7;
                                    }
                                    if (jo2.f15673a <= 23 || arrayList.isEmpty()) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 25 + str2.length());
                                        sb4.append("Failed to query codec ");
                                        sb4.append(str4);
                                        sb4.append(" (");
                                        sb4.append(str2);
                                        sb4.append(")");
                                        Log.e("MediaCodecUtil", sb4.toString());
                                        throw e;
                                    }
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 46);
                                    sb5.append("Skipping codec ");
                                    sb5.append(str4);
                                    sb5.append(" (failed to query capabilities)");
                                    Log.e("MediaCodecUtil", sb5.toString());
                                    i2 = i3 + 1;
                                    str7 = str3;
                                    name = str4;
                                    length = i4;
                                    supportedTypes = strArr;
                                    wk2Var2 = wk2Var;
                                    yk2Var = yk2Var;
                                } else {
                                    i3 = i2;
                                    i4 = length;
                                    strArr = supportedTypes;
                                    str3 = str7;
                                }
                                str4 = name;
                                i2 = i3 + 1;
                                str7 = str3;
                                name = str4;
                                length = i4;
                                supportedTypes = strArr;
                                wk2Var2 = wk2Var;
                                yk2Var = yk2Var;
                            }
                        }
                    }
                }
                i5++;
                wk2Var2 = wk2Var;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new xk2(e5);
        }
    }
}
