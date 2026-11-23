package p007c.p165l.p175i0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.media.MediaFormat;
import android.text.Spannable;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;
import p007c.p165l.p182l0.LoginLogger;
import p007c.p165l.p183m0.p184b.OpenGraphJSONUtility;
import p007c.p165l.p183m0.p185c.ShareOpenGraphAction;
import p007c.p165l.p183m0.p185c.ShareOpenGraphObject;
import p007c.p165l.p183m0.p185c.SharePhoto;
import p007c.p190n.p194b.p195a.p196i.CctTransportBackend;
import p007c.p190n.p194b.p195a.p196i.CctTransportBackend3;
import p007c.p190n.p194b.p195a.p198j.p202u.RetryStrategy;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p216o1.DatabaseIOException;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.FlacStreamMetadata;
import p007c.p190n.p194b.p209b.p221s1.Id3Peeker;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p221s1.VorbisUtil2;
import p007c.p190n.p194b.p209b.p221s1.p228k0.PsshAtomUtil;
import p007c.p190n.p194b.p209b.p221s1.p232o0.WavHeader;
import p007c.p190n.p194b.p209b.p221s1.p232o0.WavHeaderReader;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.C1860a;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.RangedUri;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation;
import p007c.p190n.p194b.p209b.p252x1.p259t.TtmlStyle;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.l.i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1095a {

    /* JADX INFO: renamed from: a */
    public static LoginLogger f4867a;

    /* JADX INFO: renamed from: A */
    public static long m2374A(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.m3194D(i);
        if (parsableByteArray.m3196a() < 5) {
            return -9223372036854775807L;
        }
        int iM3201f = parsableByteArray.m3201f();
        if ((8388608 & iM3201f) != 0 || ((2096896 & iM3201f) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((iM3201f & 32) != 0) && parsableByteArray.m3214s() >= 7 && parsableByteArray.m3196a() >= 7) {
            if ((parsableByteArray.m3214s() & 16) == 16) {
                byte[] bArr = new byte[6];
                System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr, 0, 6);
                parsableByteArray.f6393b += 6;
                return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: B */
    public static FlacStreamMetadata.a m2375B(ParsableByteArray parsableByteArray) {
        parsableByteArray.m3195E(1);
        int iM3216u = parsableByteArray.m3216u();
        long j2 = ((long) parsableByteArray.f6393b) + ((long) iM3216u);
        int i = iM3216u / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM3208m = parsableByteArray.m3208m();
            if (jM3208m == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM3208m;
            jArrCopyOf2[i2] = parsableByteArray.m3208m();
            parsableByteArray.m3195E(2);
        }
        parsableByteArray.m3195E((int) (j2 - ((long) parsableByteArray.f6393b)));
        return new FlacStreamMetadata.a(jArrCopyOf, jArrCopyOf2);
    }

    /* JADX INFO: renamed from: C */
    public static VorbisUtil2 m2376C(ParsableByteArray parsableByteArray, boolean z, boolean z2) throws ParserException {
        if (z) {
            m2384K(3, parsableByteArray, false);
        }
        String strM3211p = parsableByteArray.m3211p((int) parsableByteArray.m3205j());
        int length = strM3211p.length() + 11;
        long jM3205j = parsableByteArray.m3205j();
        String[] strArr = new String[(int) jM3205j];
        int length2 = length + 4;
        for (int i = 0; i < jM3205j; i++) {
            strArr[i] = parsableByteArray.m3211p((int) parsableByteArray.m3205j());
            length2 = length2 + 4 + strArr[i].length();
        }
        if (z2 && (parsableByteArray.m3214s() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new VorbisUtil2(strM3211p, strArr, length2 + 1);
    }

    /* JADX INFO: renamed from: D */
    public static TtmlStyle m2377D(TtmlStyle ttmlStyle, String[] strArr, Map<String, TtmlStyle> map) {
        int i = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    ttmlStyle2.m4473a(map.get(strArr[i]));
                    i++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ttmlStyle.m4473a(map.get(strArr[0]));
                return ttmlStyle;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ttmlStyle.m4473a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ttmlStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [TResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [TInput, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [c.n.b.a.i.b, c.n.b.a.i.b<TInput, TResult, TException extends java.lang.Throwable>] */
    /* JADX INFO: renamed from: E */
    public static <TInput, TResult, TException extends Throwable> TResult m2378E(int i, TInput tinput, CctTransportBackend<TInput, TResult, TException> cctTransportBackend, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        ?? r0;
        boolean z;
        if (i < 1) {
            return (TResult) cctTransportBackend.m2754a(tinput);
        }
        while (true) {
            r0 = (TResult) cctTransportBackend.m2754a(tinput);
            CctTransportBackend3.a aVar = (CctTransportBackend3.a) tinput;
            CctTransportBackend3.b bVar = (CctTransportBackend3.b) r0;
            URL url = bVar.f5541b;
            if (url != null) {
                m2397m("CctTransportBackend", "Following redirect to: %s", url);
                z = (TInput) new CctTransportBackend3.a(bVar.f5541b, aVar.f5538b, aVar.f5539c);
            } else {
                tinput = 0;
            }
            if (tinput == 0 || (i = i - 1) < 1) {
                tinput = z;
                break;
            }
            tinput = z;
        }
        return r0;
    }

    /* JADX INFO: renamed from: F */
    public static void m2379F(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(outline.m1590l("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m2380G(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws DatabaseIOException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m2381H(int i) {
        return Util6.m3126n("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    /* JADX INFO: renamed from: I */
    public static JSONObject m2382I(ShareOpenGraphAction shareOpenGraphAction, OpenGraphJSONUtility openGraphJSONUtility) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.m2651b()) {
            jSONObject.put(str, m2383J(shareOpenGraphAction.m2650a(str), openGraphJSONUtility));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: J */
    public static Object m2383J(Object obj, OpenGraphJSONUtility openGraphJSONUtility) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (openGraphJSONUtility != null) {
                return openGraphJSONUtility.mo2618a((SharePhoto) obj);
            }
            return null;
        }
        if (obj instanceof ShareOpenGraphObject) {
            ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.m2651b()) {
                jSONObject.put(str, m2383J(shareOpenGraphObject.m2650a(str), openGraphJSONUtility));
            }
            return jSONObject;
        }
        if (!(obj instanceof List)) {
            StringBuilder sbM1556G = outline.m1556G("Invalid object found for JSON serialization: ");
            sbM1556G.append(obj.toString());
            throw new IllegalArgumentException(sbM1556G.toString());
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            jSONArray.put(m2383J(it.next(), openGraphJSONUtility));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m2384K(int i, ParsableByteArray parsableByteArray, boolean z) throws ParserException {
        if (parsableByteArray.m3196a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sbM1556G = outline.m1556G("too short header: ");
            sbM1556G.append(parsableByteArray.m3196a());
            throw new ParserException(sbM1556G.toString());
        }
        if (parsableByteArray.m3214s() != i) {
            if (z) {
                return false;
            }
            StringBuilder sbM1556G2 = outline.m1556G("expected header type ");
            sbM1556G2.append(Integer.toHexString(i));
            throw new ParserException(sbM1556G2.toString());
        }
        if (parsableByteArray.m3214s() == 118 && parsableByteArray.m3214s() == 111 && parsableByteArray.m3214s() == 114 && parsableByteArray.m3214s() == 98 && parsableByteArray.m3214s() == 105 && parsableByteArray.m3214s() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x0012, B:13:0x0016, B:14:0x0024), top: B:20:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0016 A[Catch: all -> 0x0028, TryCatch #0 {, blocks: (B:6:0x0006, B:11:0x0012, B:13:0x0016, B:14:0x0024), top: B:20:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    /* JADX INFO: renamed from: a */
    public static LoginLogger m2385a(Context context) {
        LoginLogger loginLogger;
        synchronized (C1095a.class) {
            if (context == null) {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                context = FacebookSdk.f5360i;
                if (context == null) {
                    loginLogger = null;
                } else {
                    if (f4867a == null) {
                        HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                        Validate.m2479h();
                        f4867a = new LoginLogger(context, FacebookSdk.f5354c);
                    }
                    loginLogger = f4867a;
                }
            } else if (context == null) {
                loginLogger = null;
            } else {
                if (f4867a == null) {
                    HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
                    Validate.m2479h();
                    f4867a = new LoginLogger(context, FacebookSdk.f5354c);
                }
                loginLogger = f4867a;
            }
            throw th;
        }
        return loginLogger;
    }

    /* JADX INFO: renamed from: b */
    public static void m2386b() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        FacebookSdk.f5360i.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    /* JADX INFO: renamed from: c */
    public static void m2387c(Spannable spannable, Object obj, int i, int i2, int i3) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }

    /* JADX INFO: renamed from: d */
    public static DataSpec m2388d(Representation representation, RangedUri rangedUri, int i) {
        DataSpec.b bVar = new DataSpec.b();
        bVar.f6147a = C2096e.m4586v(representation.f9300b, rangedUri.f9297c);
        bVar.f6152f = rangedUri.f9295a;
        bVar.f6153g = rangedUri.f9296b;
        bVar.f6154h = representation.mo4283k();
        bVar.f6155i = i;
        return bVar.m3005a();
    }

    /* JADX INFO: renamed from: e */
    public static List<byte[]> m2389e(byte[] bArr) {
        long j2 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m2390f(j2));
        arrayList.add(m2390f(80000000L));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m2390f(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m2391g(UUID uuid, byte[] bArr) {
        return m2392h(uuid, null, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m2392h(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = outline.m1591m(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: i */
    public static void m2393i(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2394j(long j2, ParsableByteArray parsableByteArray, TrackOutput2[] trackOutput2Arr) {
        while (true) {
            if (parsableByteArray.m3196a() <= 1) {
                return;
            }
            int iM2410z = m2410z(parsableByteArray);
            int iM2410z2 = m2410z(parsableByteArray);
            int i = parsableByteArray.f6393b + iM2410z2;
            if (iM2410z2 == -1 || iM2410z2 > parsableByteArray.m3196a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i = parsableByteArray.f6394c;
            } else if (iM2410z == 4 && iM2410z2 >= 8) {
                int iM3214s = parsableByteArray.m3214s();
                int iM3219x = parsableByteArray.m3219x();
                int iM3201f = iM3219x == 49 ? parsableByteArray.m3201f() : 0;
                int iM3214s2 = parsableByteArray.m3214s();
                if (iM3219x == 47) {
                    parsableByteArray.m3195E(1);
                }
                boolean z = iM3214s == 181 && (iM3219x == 49 || iM3219x == 47) && iM3214s2 == 3;
                if (iM3219x == 49) {
                    z &= iM3201f == 1195456820;
                }
                if (z) {
                    m2395k(j2, parsableByteArray, trackOutput2Arr);
                }
            }
            parsableByteArray.m3194D(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2395k(long j2, ParsableByteArray parsableByteArray, TrackOutput2[] trackOutput2Arr) {
        int iM3214s = parsableByteArray.m3214s();
        if ((iM3214s & 64) != 0) {
            parsableByteArray.m3195E(1);
            int i = (iM3214s & 31) * 3;
            int i2 = parsableByteArray.f6393b;
            for (TrackOutput2 trackOutput2 : trackOutput2Arr) {
                parsableByteArray.m3194D(i2);
                trackOutput2.mo3758c(parsableByteArray, i);
                trackOutput2.mo3759d(j2, 1, i, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m2396l(String str) {
        return "." + str + ",." + str + " *";
    }

    /* JADX INFO: renamed from: m */
    public static void m2397m(String str, String str2, Object obj) {
        Log.d(m2400p(str), String.format(str2, obj));
    }

    /* JADX INFO: renamed from: n */
    public static void m2398n(String str, String str2, Object... objArr) {
        Log.d(m2400p(str), String.format(str2, objArr));
    }

    /* JADX INFO: renamed from: o */
    public static void m2399o(String str, String str2, Throwable th) {
        Log.e(m2400p(str), str2, th);
    }

    /* JADX INFO: renamed from: p */
    public static String m2400p(String str) {
        return outline.m1599u("TransportRuntime.", str);
    }

    /* JADX INFO: renamed from: q */
    public static int m2401q(SQLiteDatabase sQLiteDatabase, int i, String str) throws DatabaseIOException {
        try {
            if (!Util6.m3109R(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i2 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m2402r(String str, String str2) {
        Log.i(m2400p(str), str2);
    }

    /* JADX INFO: renamed from: s */
    public static int m2403s(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public static void m2404t(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: u */
    public static PsshAtomUtil m2405u(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.f6394c < 32) {
            return null;
        }
        parsableByteArray.m3194D(0);
        if (parsableByteArray.m3201f() != parsableByteArray.m3196a() + 4 || parsableByteArray.m3201f() != 1886614376) {
            return null;
        }
        int iM3201f = (parsableByteArray.m3201f() >> 24) & 255;
        if (iM3201f > 1) {
            outline.m1565P("Unsupported pssh version: ", iM3201f, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.m3208m(), parsableByteArray.m3208m());
        if (iM3201f == 1) {
            parsableByteArray.m3195E(parsableByteArray.m3217v() * 16);
        }
        int iM3217v = parsableByteArray.m3217v();
        if (iM3217v != parsableByteArray.m3196a()) {
            return null;
        }
        byte[] bArr2 = new byte[iM3217v];
        System.arraycopy(parsableByteArray.f6392a, parsableByteArray.f6393b, bArr2, 0, iM3217v);
        parsableByteArray.f6393b += iM3217v;
        return new PsshAtomUtil(uuid, iM3201f, bArr2);
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m2406v(byte[] bArr, UUID uuid) {
        PsshAtomUtil psshAtomUtilM2405u = m2405u(bArr);
        if (psshAtomUtilM2405u == null) {
            return null;
        }
        if (uuid.equals(psshAtomUtilM2405u.f7967a)) {
            return psshAtomUtilM2405u.f7969c;
        }
        Log.w("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + psshAtomUtilM2405u.f7967a + ".");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static WavHeader m2407w(ExtractorInput extractorInput) throws IOException {
        byte[] bArr;
        Objects.requireNonNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (WavHeaderReader.m3913a(extractorInput, parsableByteArray).f8489a != 1380533830) {
            return null;
        }
        extractorInput.mo3739o(parsableByteArray.f6392a, 0, 4);
        parsableByteArray.m3194D(0);
        int iM3201f = parsableByteArray.m3201f();
        if (iM3201f != 1463899717) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + iM3201f);
            return null;
        }
        WavHeaderReader wavHeaderReaderM3913a = WavHeaderReader.m3913a(extractorInput, parsableByteArray);
        while (wavHeaderReaderM3913a.f8489a != 1718449184) {
            extractorInput.mo3733f((int) wavHeaderReaderM3913a.f8490b);
            wavHeaderReaderM3913a = WavHeaderReader.m3913a(extractorInput, parsableByteArray);
        }
        C2096e.m4570f(wavHeaderReaderM3913a.f8490b >= 16);
        extractorInput.mo3739o(parsableByteArray.f6392a, 0, 16);
        parsableByteArray.m3194D(0);
        int iM3207l = parsableByteArray.m3207l();
        int iM3207l2 = parsableByteArray.m3207l();
        int iM3206k = parsableByteArray.m3206k();
        int iM3206k2 = parsableByteArray.m3206k();
        int iM3207l3 = parsableByteArray.m3207l();
        int iM3207l4 = parsableByteArray.m3207l();
        int i = ((int) wavHeaderReaderM3913a.f8490b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            extractorInput.mo3739o(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = Util6.f6312f;
        }
        return new WavHeader(iM3207l, iM3207l2, iM3206k, iM3206k2, iM3207l3, iM3207l4, bArr);
    }

    /* JADX INFO: renamed from: x */
    public static Metadata m2408x(ExtractorInput extractorInput, boolean z) throws IOException {
        C1860a c1860a;
        if (z) {
            c1860a = null;
        } else {
            int i = Id3Decoder.f8734a;
            c1860a = new Id3Decoder.a() { // from class: c.n.b.b.u1.m.a
                @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder.a
                /* JADX INFO: renamed from: a */
                public final boolean mo3796a(int i2, int i3, int i4, int i5, int i6) {
                    int i7 = Id3Decoder.f8734a;
                    return false;
                }
            };
        }
        Metadata metadataM3925a = new Id3Peeker().m3925a(extractorInput, c1860a);
        if (metadataM3925a == null || metadataM3925a.f8661f.length == 0) {
            return null;
        }
        return metadataM3925a;
    }

    /* JADX INFO: renamed from: y */
    public static int m2409y(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iMo3735i = extractorInput.mo3735i(bArr, i + i3, i2 - i3);
            if (iMo3735i == -1) {
                break;
            }
            i3 += iMo3735i;
        }
        return i3;
    }

    /* JADX INFO: renamed from: z */
    public static int m2410z(ParsableByteArray parsableByteArray) {
        int i = 0;
        while (parsableByteArray.m3196a() != 0) {
            int iM3214s = parsableByteArray.m3214s();
            i += iM3214s;
            if (iM3214s != 255) {
                return i;
            }
        }
        return -1;
    }
}
