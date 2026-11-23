package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.p296c.C2520a;
import p007c.p190n.p194b.p266d.p290d.p295s.p296c.C2521b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2786f;

/* JADX INFO: renamed from: c.n.b.d.d.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2410n extends AbstractC2767a {
    public static final Parcelable.Creator<C2410n> CREATOR;

    /* JADX INFO: renamed from: A */
    public C2401k f11093A;

    /* JADX INFO: renamed from: B */
    public final SparseArray<Integer> f11094B;

    /* JADX INFO: renamed from: f */
    public MediaInfo f11095f;

    /* JADX INFO: renamed from: g */
    public long f11096g;

    /* JADX INFO: renamed from: h */
    public int f11097h;

    /* JADX INFO: renamed from: i */
    public double f11098i;

    /* JADX INFO: renamed from: j */
    public int f11099j;

    /* JADX INFO: renamed from: k */
    public int f11100k;

    /* JADX INFO: renamed from: l */
    public long f11101l;

    /* JADX INFO: renamed from: m */
    public long f11102m;

    /* JADX INFO: renamed from: n */
    public double f11103n;

    /* JADX INFO: renamed from: o */
    public boolean f11104o;

    /* JADX INFO: renamed from: p */
    public long[] f11105p;

    /* JADX INFO: renamed from: q */
    public int f11106q;

    /* JADX INFO: renamed from: r */
    public int f11107r;

    /* JADX INFO: renamed from: s */
    public String f11108s;

    /* JADX INFO: renamed from: t */
    public JSONObject f11109t;

    /* JADX INFO: renamed from: u */
    public int f11110u;

    /* JADX INFO: renamed from: v */
    public final List<C2404l> f11111v;

    /* JADX INFO: renamed from: w */
    public boolean f11112w;

    /* JADX INFO: renamed from: x */
    public C2377c f11113x;

    /* JADX INFO: renamed from: y */
    public C2419q f11114y;

    /* JADX INFO: renamed from: z */
    public C2392h f11115z;

    static {
        new C2518b("MediaStatus");
        CREATOR = new C2391g1();
    }

    public C2410n(MediaInfo mediaInfo, long j2, int i, double d, int i2, int i3, long j3, long j4, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, List<C2404l> list, boolean z2, C2377c c2377c, C2419q c2419q, C2392h c2392h, C2401k c2401k) {
        this.f11111v = new ArrayList();
        this.f11094B = new SparseArray<>();
        this.f11095f = mediaInfo;
        this.f11096g = j2;
        this.f11097h = i;
        this.f11098i = d;
        this.f11099j = i2;
        this.f11100k = i3;
        this.f11101l = j3;
        this.f11102m = j4;
        this.f11103n = d2;
        this.f11104o = z;
        this.f11105p = jArr;
        this.f11106q = i4;
        this.f11107r = i5;
        this.f11108s = str;
        if (str != null) {
            try {
                this.f11109t = new JSONObject(this.f11108s);
            } catch (JSONException unused) {
                this.f11109t = null;
                this.f11108s = null;
            }
        } else {
            this.f11109t = null;
        }
        this.f11110u = i6;
        if (list != null && !list.isEmpty()) {
            m4988M(list);
        }
        this.f11112w = z2;
        this.f11113x = c2377c;
        this.f11114y = c2419q;
        this.f11115z = c2392h;
        this.f11093A = c2401k;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m4985L(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return i4 != 2;
            }
            if (i2 != 3) {
                return true;
            }
        }
        return i3 == 0;
    }

    /* JADX INFO: renamed from: H */
    public C2404l m4986H(int i) {
        Integer num = this.f11094B.get(i);
        if (num == null) {
            return null;
        }
        return this.f11111v.get(num.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:156:0x0267  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:312:0x0505  */
    /* JADX INFO: renamed from: K */
    public final int m4987K(JSONObject jSONObject, int i) throws JSONException {
        JSONObject jSONObject2;
        int i2;
        long[] jArr;
        boolean z;
        C2377c c2377c;
        byte b;
        int i3;
        C2419q c2419q;
        MediaInfo mediaInfo;
        boolean zM4968H;
        MediaInfo mediaInfo2;
        int i4;
        int i5;
        int i6;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject == null) {
            jSONObject2 = jSONObject;
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        }
        long j2 = jSONObject2.getLong("mediaSessionId");
        if (j2 != this.f11096g) {
            this.f11096g = j2;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i5 = 1;
            } else if (string.equals("PLAYING")) {
                i5 = 2;
            } else if (string.equals("PAUSED")) {
                i5 = 3;
            } else if (string.equals("BUFFERING")) {
                i5 = 4;
            } else {
                i5 = string.equals("LOADING") ? 5 : 0;
            }
            if (i5 != this.f11099j) {
                this.f11099j = i5;
                i2 |= 2;
            }
            if (i5 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i6 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i6 = 3;
                } else if (string2.equals("FINISHED")) {
                    i6 = 1;
                } else {
                    i6 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i6 != this.f11100k) {
                    this.f11100k = i6;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d = jSONObject2.getDouble("playbackRate");
            if (this.f11098i != d) {
                this.f11098i = d;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            long jM5112b = C2516a.m5112b(jSONObject2.getDouble("currentTime"));
            if (jM5112b != this.f11101l) {
                this.f11101l = jM5112b;
                i2 |= 2;
            }
            i2 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j3 = jSONObject2.getLong("supportedMediaCommands");
            if (j3 != this.f11102m) {
                this.f11102m = j3;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("volume") && (i & 1) == 0) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
            double d2 = jSONObject3.getDouble("level");
            if (d2 != this.f11103n) {
                this.f11103n = d2;
                i2 |= 2;
            }
            boolean z2 = jSONObject3.getBoolean("muted");
            if (z2 != this.f11104o) {
                this.f11104o = z2;
                i2 |= 2;
            }
        }
        C2392h c2392h = null;
        if (jSONObject2.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("activeTrackIds");
            Pattern pattern = C2516a.f11372a;
            if (jSONArray == null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    jArr[i7] = jSONArray.getLong(i7);
                }
            }
            long[] jArr2 = this.f11105p;
            if (jArr2 == null || jArr2.length != jArr.length) {
                z = true;
                break;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= jArr.length) {
                    z = false;
                    break;
                }
                if (this.f11105p[i8] != jArr[i8]) {
                    z = true;
                    break;
                }
                i8++;
            }
            if (z) {
                this.f11105p = jArr;
            }
        } else {
            jArr = null;
            z = this.f11105p != null;
        }
        if (z) {
            this.f11105p = jArr;
            i2 |= 2;
        }
        if (jSONObject2.has("customData")) {
            this.f11109t = jSONObject2.getJSONObject("customData");
            this.f11108s = null;
            i2 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.f11095f;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f11095f = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject4.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.f11097h != (i4 = jSONObject2.getInt("currentItemId"))) {
            this.f11097h = i4;
            i2 |= 2;
        }
        int iOptInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f11107r != iOptInt) {
            this.f11107r = iOptInt;
            i2 |= 16;
        }
        int iOptInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.f11106q != iOptInt2) {
            this.f11106q = iOptInt2;
            i2 |= 2;
        }
        MediaInfo mediaInfo5 = this.f11095f;
        if (m4985L(this.f11099j, this.f11100k, this.f11106q, mediaInfo5 == null ? -1 : mediaInfo5.f28565g)) {
            this.f11097h = 0;
            this.f11106q = 0;
            this.f11107r = 0;
            if (!this.f11111v.isEmpty()) {
                this.f11110u = 0;
                this.f11111v.clear();
                this.f11094B.clear();
                i2 |= 8;
            }
        } else {
            if (jSONObject2.has("repeatMode")) {
                Integer numM5125a = C2520a.m5125a(jSONObject2.getString("repeatMode"));
                Integer numValueOf = Integer.valueOf(numM5125a == null ? this.f11110u : numM5125a.intValue());
                if (this.f11110u != numValueOf.intValue()) {
                    this.f11110u = numValueOf.intValue();
                    zM4968H = true;
                } else {
                    zM4968H = false;
                }
            } else {
                zM4968H = false;
            }
            if (jSONObject2.has("items")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                int length = jSONArray2.length();
                SparseArray sparseArray = new SparseArray();
                for (int i9 = 0; i9 < length; i9++) {
                    sparseArray.put(i9, Integer.valueOf(jSONArray2.getJSONObject(i9).getInt("itemId")));
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < length; i10++) {
                    Integer num = (Integer) sparseArray.get(i10);
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i10);
                    C2404l c2404lM4986H = m4986H(num.intValue());
                    if (c2404lM4986H != null) {
                        zM4968H |= c2404lM4986H.m4968H(jSONObject5);
                        arrayList2.add(c2404lM4986H);
                        if (i10 != this.f11094B.get(num.intValue()).intValue()) {
                        }
                    } else if (num.intValue() != this.f11097h || (mediaInfo2 = this.f11095f) == null) {
                        arrayList2.add(new C2404l(jSONObject5));
                    } else {
                        C2404l c2404lM4969a = new C2404l.a(mediaInfo2).m4969a();
                        c2404lM4969a.m4968H(jSONObject5);
                        arrayList2.add(c2404lM4969a);
                    }
                    zM4968H = true;
                }
                if (this.f11111v.size() != length) {
                    zM4968H = true;
                }
                m4988M(arrayList2);
            }
            if (zM4968H) {
                i2 |= 8;
            }
        }
        int i11 = i2;
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("breakStatus");
        C2518b c2518b = C2377c.f11000f;
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("currentBreakTime") && jSONObjectOptJSONObject2.has("currentBreakClipTime")) {
            try {
                long jM5112b2 = C2516a.m5112b(jSONObjectOptJSONObject2.getLong("currentBreakTime"));
                long jM5112b3 = C2516a.m5112b(jSONObjectOptJSONObject2.getLong("currentBreakClipTime"));
                String strOptString = jSONObjectOptJSONObject2.optString("breakId", null);
                String strOptString2 = jSONObjectOptJSONObject2.optString("breakClipId", null);
                long jOptLong = jSONObjectOptJSONObject2.optLong("whenSkippable", -1L);
                c2377c = new C2377c(jM5112b2, jM5112b3, strOptString, strOptString2, jOptLong != -1 ? C2516a.m5112b(jOptLong) : jOptLong);
            } catch (JSONException e) {
                C2518b c2518b2 = C2377c.f11000f;
                Log.e(c2518b2.f11373a, c2518b2.m5123e("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                c2377c = null;
            }
        } else {
            c2377c = null;
        }
        C2377c c2377c2 = this.f11113x;
        if ((c2377c2 == null && c2377c != null) || (c2377c2 != null && !c2377c2.equals(c2377c))) {
            this.f11112w = c2377c != null;
            this.f11113x = c2377c;
            i11 |= 32;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("videoInfo");
        C2518b c2518b3 = C2419q.f11135f;
        if (jSONObjectOptJSONObject3 == null) {
            c2419q = null;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject3.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (string3.equals("sdr")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                    } else if (string3.equals("hdr")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (string3.equals("dv")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    i3 = 3;
                } else if (b == 1) {
                    i3 = 2;
                } else if (b == 2) {
                    i3 = 4;
                } else if (b != 3) {
                    C2419q.f11135f.m5119a("Unknown HDR type: %s", string3);
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                c2419q = new C2419q(jSONObjectOptJSONObject3.getInt("width"), jSONObjectOptJSONObject3.getInt("height"), i3);
            } catch (JSONException e2) {
                C2419q.f11135f.m5119a("Error while creating a VideoInfo instance from JSON: %s", e2.getMessage());
                c2419q = null;
            }
        }
        C2419q c2419q2 = this.f11114y;
        if ((c2419q2 == null && c2419q != null) || (c2419q2 != null && !c2419q2.equals(c2419q))) {
            this.f11114y = c2419q;
            i11 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo = this.f11095f) != null) {
            mediaInfo.m12648H(jSONObject2.getJSONObject("breakInfo"));
            i11 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            C2401k.a aVar = new C2401k.a();
            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
            C2401k c2401k = aVar.f11070a;
            Parcelable.Creator<C2401k> creator = C2401k.CREATOR;
            c2401k.clear();
            if (jSONObject6 != null) {
                c2401k.f11061f = jSONObject6.optString("id", null);
                c2401k.f11062g = jSONObject6.optString("entity", null);
                String strOptString3 = jSONObject6.optString("queueType");
                strOptString3.hashCode();
                switch (strOptString3) {
                    case "PODCAST_SERIES":
                        c2401k.f11063h = 5;
                        break;
                    case "RADIO_STATION":
                        c2401k.f11063h = 4;
                        break;
                    case "PLAYLIST":
                        c2401k.f11063h = 2;
                        break;
                    case "AUDIOBOOK":
                        c2401k.f11063h = 3;
                        break;
                    case "TV_SERIES":
                        c2401k.f11063h = 6;
                        break;
                    case "ALBUM":
                        c2401k.f11063h = 1;
                        break;
                    case "MOVIE":
                        c2401k.f11063h = 9;
                        break;
                    case "VIDEO_PLAYLIST":
                        c2401k.f11063h = 7;
                        break;
                    case "LIVE_TV":
                        c2401k.f11063h = 8;
                        break;
                }
                c2401k.f11064i = jSONObject6.optString("name", null);
                if (jSONObject6.has("containerMetadata")) {
                    C2398j.a aVar2 = new C2398j.a();
                    JSONObject jSONObjectOptJSONObject4 = jSONObject6.optJSONObject("containerMetadata");
                    C2398j c2398j = aVar2.f11058a;
                    c2398j.f11053f = 0;
                    c2398j.f11054g = null;
                    c2398j.f11055h = null;
                    c2398j.f11056i = null;
                    c2398j.f11057j = 0.0d;
                    if (jSONObjectOptJSONObject4 != null) {
                        String strOptString4 = jSONObjectOptJSONObject4.optString("containerType", "");
                        strOptString4.hashCode();
                        if (strOptString4.equals("AUDIOBOOK_CONTAINER")) {
                            c2398j.f11053f = 1;
                        } else if (strOptString4.equals("GENERIC_CONTAINER")) {
                            c2398j.f11053f = 0;
                        }
                        c2398j.f11054g = jSONObjectOptJSONObject4.optString(CainMediaMetadataRetriever.METADATA_KEY_TITLE, null);
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("sections");
                        if (jSONArrayOptJSONArray != null) {
                            c2398j.f11055h = new ArrayList();
                            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i12);
                                if (jSONObjectOptJSONObject5 != null) {
                                    C2395i c2395i = new C2395i();
                                    c2395i.m4962H(jSONObjectOptJSONObject5);
                                    c2398j.f11055h.add(c2395i);
                                }
                            }
                        }
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("containerImages");
                        if (jSONArrayOptJSONArray2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            c2398j.f11056i = arrayList3;
                            C2521b.m5126a(arrayList3, jSONArrayOptJSONArray2);
                        }
                        c2398j.f11057j = jSONObjectOptJSONObject4.optDouble("containerDuration", c2398j.f11057j);
                    }
                    c2401k.f11065j = new C2398j(aVar2.f11058a, null);
                }
                Integer numM5125a2 = C2520a.m5125a(jSONObject6.optString("repeatMode"));
                if (numM5125a2 != null) {
                    c2401k.f11066k = numM5125a2.intValue();
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    c2401k.f11067l = new ArrayList();
                    for (int i13 = 0; i13 < jSONArrayOptJSONArray3.length(); i13++) {
                        JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray3.optJSONObject(i13);
                        if (jSONObjectOptJSONObject6 != null) {
                            try {
                                c2401k.f11067l.add(new C2404l(jSONObjectOptJSONObject6));
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                }
                c2401k.f11068m = jSONObject6.optInt("startIndex", c2401k.f11068m);
                if (jSONObject6.has("startTime")) {
                    c2401k.f11069n = C2516a.m5112b(jSONObject6.optDouble("startTime", c2401k.f11069n));
                }
            }
            this.f11093A = new C2401k(aVar.f11070a, null);
        }
        if (!jSONObject2.has("liveSeekableRange")) {
            if (this.f11115z != null) {
                i11 |= 2;
            }
            this.f11115z = null;
            return i11;
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
        C2518b c2518b4 = C2392h.f11037f;
        if (jSONObjectOptJSONObject7 != null && jSONObjectOptJSONObject7.has("start") && jSONObjectOptJSONObject7.has("end")) {
            try {
                c2392h = new C2392h(C2516a.m5112b(jSONObjectOptJSONObject7.getDouble("start")), C2516a.m5112b(jSONObjectOptJSONObject7.getDouble("end")), jSONObjectOptJSONObject7.optBoolean("isMovingWindow"), jSONObjectOptJSONObject7.optBoolean("isLiveDone"));
            } catch (JSONException unused3) {
                C2518b c2518b5 = C2392h.f11037f;
                String strValueOf = String.valueOf(jSONObjectOptJSONObject7);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
                sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                sb.append(strValueOf);
                c2518b5.m5121c(sb.toString(), new Object[0]);
            }
        }
        this.f11115z = c2392h;
        return i11 | 2;
    }

    /* JADX INFO: renamed from: M */
    public final void m4988M(List<C2404l> list) {
        this.f11111v.clear();
        this.f11094B.clear();
        for (int i = 0; i < list.size(); i++) {
            C2404l c2404l = list.get(i);
            this.f11111v.add(c2404l);
            this.f11094B.put(c2404l.f11074g, Integer.valueOf(i));
        }
    }

    public boolean equals(Object obj) {
        JSONObject jSONObject;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2410n)) {
            return false;
        }
        C2410n c2410n = (C2410n) obj;
        if ((this.f11109t == null) == (c2410n.f11109t == null) && this.f11096g == c2410n.f11096g && this.f11097h == c2410n.f11097h && this.f11098i == c2410n.f11098i && this.f11099j == c2410n.f11099j && this.f11100k == c2410n.f11100k && this.f11101l == c2410n.f11101l && this.f11103n == c2410n.f11103n && this.f11104o == c2410n.f11104o && this.f11106q == c2410n.f11106q && this.f11107r == c2410n.f11107r && this.f11110u == c2410n.f11110u && Arrays.equals(this.f11105p, c2410n.f11105p) && C2516a.m5114d(Long.valueOf(this.f11102m), Long.valueOf(c2410n.f11102m)) && C2516a.m5114d(this.f11111v, c2410n.f11111v) && C2516a.m5114d(this.f11095f, c2410n.f11095f)) {
            JSONObject jSONObject2 = this.f11109t;
            if ((jSONObject2 == null || (jSONObject = c2410n.f11109t) == null || C2786f.m5628a(jSONObject2, jSONObject)) && this.f11112w == c2410n.f11112w && C2516a.m5114d(this.f11113x, c2410n.f11113x) && C2516a.m5114d(this.f11114y, c2410n.f11114y) && C2516a.m5114d(this.f11115z, c2410n.f11115z) && C2622l.m5459y(this.f11093A, c2410n.f11093A)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11095f, Long.valueOf(this.f11096g), Integer.valueOf(this.f11097h), Double.valueOf(this.f11098i), Integer.valueOf(this.f11099j), Integer.valueOf(this.f11100k), Long.valueOf(this.f11101l), Long.valueOf(this.f11102m), Double.valueOf(this.f11103n), Boolean.valueOf(this.f11104o), Integer.valueOf(Arrays.hashCode(this.f11105p)), Integer.valueOf(this.f11106q), Integer.valueOf(this.f11107r), String.valueOf(this.f11109t), Integer.valueOf(this.f11110u), this.f11111v, Boolean.valueOf(this.f11112w), this.f11113x, this.f11114y, this.f11115z, this.f11093A});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f11109t;
        this.f11108s = jSONObject == null ? null : jSONObject.toString();
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f11095f, i, false);
        long j2 = this.f11096g;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        int i2 = this.f11097h;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        double d = this.f11098i;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        int i3 = this.f11099j;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        int i4 = this.f11100k;
        parcel.writeInt(262151);
        parcel.writeInt(i4);
        long j3 = this.f11101l;
        parcel.writeInt(524296);
        parcel.writeLong(j3);
        long j4 = this.f11102m;
        parcel.writeInt(524297);
        parcel.writeLong(j4);
        double d2 = this.f11103n;
        parcel.writeInt(524298);
        parcel.writeDouble(d2);
        boolean z = this.f11104o;
        parcel.writeInt(262155);
        parcel.writeInt(z ? 1 : 0);
        long[] jArr = this.f11105p;
        if (jArr != null) {
            int iM5239D2 = C2622l.m5239D1(parcel, 12);
            parcel.writeLongArray(jArr);
            C2622l.m5447v2(parcel, iM5239D2);
        }
        int i5 = this.f11106q;
        parcel.writeInt(262157);
        parcel.writeInt(i5);
        int i6 = this.f11107r;
        parcel.writeInt(262158);
        parcel.writeInt(i6);
        C2622l.m5315U(parcel, 15, this.f11108s, false);
        int i7 = this.f11110u;
        parcel.writeInt(262160);
        parcel.writeInt(i7);
        C2622l.m5331Y(parcel, 17, this.f11111v, false);
        boolean z2 = this.f11112w;
        parcel.writeInt(262162);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5311T(parcel, 19, this.f11113x, i, false);
        C2622l.m5311T(parcel, 20, this.f11114y, i, false);
        C2622l.m5311T(parcel, 21, this.f11115z, i, false);
        C2622l.m5311T(parcel, 22, this.f11093A, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2410n(JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        m4987K(jSONObject, 0);
    }
}
