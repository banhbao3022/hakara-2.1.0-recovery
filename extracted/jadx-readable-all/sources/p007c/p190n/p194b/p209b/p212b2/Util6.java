package p007c.p190n.p194b.p209b.p212b2;

import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.b2.h0, reason: use source file name */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class Util6 {

    /* JADX INFO: renamed from: a */
    public static final int f6307a;

    /* JADX INFO: renamed from: b */
    public static final String f6308b;

    /* JADX INFO: renamed from: c */
    public static final String f6309c;

    /* JADX INFO: renamed from: d */
    public static final String f6310d;

    /* JADX INFO: renamed from: e */
    public static final String f6311e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f6312f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f6313g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f6314h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f6315i;

    /* JADX INFO: renamed from: j */
    public static final Pattern f6316j;

    /* JADX INFO: renamed from: k */
    public static HashMap<String, String> f6317k;

    /* JADX INFO: renamed from: l */
    public static final String[] f6318l;

    /* JADX INFO: renamed from: m */
    public static final String[] f6319m;

    /* JADX INFO: renamed from: n */
    public static final int[] f6320n;

    /* JADX INFO: renamed from: o */
    public static final int[] f6321o;

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else {
            i = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        f6307a = i;
        String str2 = Build.DEVICE;
        f6308b = str2;
        String str3 = Build.MANUFACTURER;
        f6309c = str3;
        String str4 = Build.MODEL;
        f6310d = str4;
        f6311e = str2 + ", " + str4 + ", " + str3 + ", " + i;
        f6312f = new byte[0];
        f6313g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f6314h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f6315i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f6316j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f6318l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f6319m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f6320n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f6321o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static String m3092A(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            Log.m3154b("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static byte[] m3093B(String str) {
        return str.getBytes(Charsets.f26131c);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3094C(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
        if (parsableByteArray.m3196a() <= 0) {
            return false;
        }
        if (parsableByteArray2.f6392a.length < parsableByteArray.m3196a()) {
            parsableByteArray2.m3197b(parsableByteArray.m3196a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.f6392a, parsableByteArray.f6393b, parsableByteArray.m3196a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = parsableByteArray2.f6392a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.m3193C(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    byte[] bArr2 = parsableByteArray2.f6392a;
                    if (iInflate == bArr2.length) {
                        parsableByteArray2.m3197b(bArr2.length * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m3095D(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m3096E(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m3097F(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m3098G(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: H */
    public static String m3099H(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !"und".equals(strReplace)) {
            str = strReplace;
        }
        String strM3111T = m3111T(str);
        int i = 0;
        String str2 = m3107P(strM3111T, "-")[0];
        if (f6317k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f6318l.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f6318l;
                if (i2 >= strArr.length) {
                    break;
                }
                map.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f6317k = map;
        }
        String str4 = f6317k.get(str2);
        if (str4 != null) {
            StringBuilder sbM1556G = outline.m1556G(str4);
            sbM1556G.append(strM3111T.substring(str2.length()));
            strM3111T = sbM1556G.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM3111T;
        }
        while (true) {
            String[] strArr2 = f6319m;
            if (i >= strArr2.length) {
                return strM3111T;
            }
            if (strM3111T.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strM3111T.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: I */
    public static <T> T[] m3100I(T[] tArr, int i) {
        C2096e.m4566b(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    /* JADX INFO: renamed from: J */
    public static long m3101J(String str) throws ParserException {
        Matcher matcher = f6313g.matcher(str);
        if (!matcher.matches()) {
            throw new ParserException(outline.m1599u("Invalid date/time format: ", str));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            StringBuilder sbM1556G = outline.m1556G("0.");
            sbM1556G.append(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(sbM1556G.toString()).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m3102K(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static <T> void m3103L(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* JADX INFO: renamed from: M */
    public static long m3104M(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    /* JADX INFO: renamed from: N */
    public static void m3105N(long[] jArr, long j2, long j3) {
        int i = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j4;
                i++;
            }
            return;
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            double d = j2 / j3;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j5 = j2 / j3;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j5;
            i++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static String[] m3106O(String str, String str2) {
        return str.split(str2, -1);
    }

    /* JADX INFO: renamed from: P */
    public static String[] m3107P(String str, String str2) {
        return str.split(str2, 2);
    }

    /* JADX INFO: renamed from: Q */
    public static String[] m3108Q(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : m3106O(str.trim(), "(\\s*,\\s*)");
    }

    /* JADX INFO: renamed from: R */
    public static boolean m3109R(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    /* JADX INFO: renamed from: S */
    public static byte[] m3110S(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: T */
    public static String m3111T(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: U */
    public static long m3112U(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3113a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m3114b(long[] jArr, long j2, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    /* JADX INFO: renamed from: c */
    public static int m3115c(LongArray longArray, long j2, boolean z, boolean z2) {
        int i;
        int i2 = longArray.f6358a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (longArray.m3158b(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        if (z && (i = i2 + 1) < longArray.f6358a && longArray.m3158b(i) == j2) {
            return i;
        }
        if (z2 && i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public static <T extends Comparable<? super T>> int m3116d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(t) == 0);
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: e */
    public static int m3117e(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i);
            i2 = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m3118f(long[] jArr, long j2, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i = z ? iBinarySearch + 1 : iBinarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: g */
    public static int m3119g(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX INFO: renamed from: h */
    public static float m3120h(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* JADX INFO: renamed from: i */
    public static int m3121i(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* JADX INFO: renamed from: j */
    public static long m3122j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3123k(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m3113a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static Handler m3124l() {
        return m3125m(null);
    }

    /* JADX INFO: renamed from: m */
    public static Handler m3125m(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        C2096e.m4572h(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    /* JADX INFO: renamed from: n */
    public static String m3126n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: o */
    public static String m3127o(byte[] bArr) {
        return new String(bArr, Charsets.f26131c);
    }

    /* JADX INFO: renamed from: p */
    public static String m3128p(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charsets.f26131c);
    }

    /* JADX INFO: renamed from: q */
    public static int m3129q(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f6307a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m3130r(String str, int i) {
        int i2 = 0;
        for (String str2 : m3108Q(str)) {
            if (i == MimeTypes.m3167i(MimeTypes.m3163e(str2))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public static String m3131s(String str, int i) {
        String[] strArrM3108Q = m3108Q(str);
        if (strArrM3108Q.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM3108Q) {
            if (i == MimeTypes.m3167i(MimeTypes.m3163e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static Looper m3132t() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: u */
    public static long m3133u(long j2, float f) {
        return f == 1.0f ? j2 : Math.round(j2 * ((double) f));
    }

    /* JADX INFO: renamed from: v */
    public static int m3134v(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return f6307a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: w */
    public static long m3135w(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: x */
    public static int m3136x(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* JADX INFO: renamed from: y */
    public static int m3137y(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* JADX INFO: renamed from: z */
    public static long m3138z(long j2, float f) {
        return f == 1.0f ? j2 : Math.round(j2 / ((double) f));
    }
}
