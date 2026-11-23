package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2371a;
import p007c.p190n.p194b.p266d.p290d.C2374b;
import p007c.p190n.p194b.p266d.p290d.C2395i;
import p007c.p190n.p194b.p266d.p290d.C2413o;
import p007c.p190n.p194b.p266d.p290d.C2416p;
import p007c.p190n.p194b.p266d.p290d.C2566x0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2786f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class MediaInfo extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C2566x0();

    /* JADX INFO: renamed from: f */
    public String f28564f;

    /* JADX INFO: renamed from: g */
    public int f28565g;

    /* JADX INFO: renamed from: h */
    public String f28566h;

    /* JADX INFO: renamed from: i */
    public C2395i f28567i;

    /* JADX INFO: renamed from: j */
    public long f28568j;

    /* JADX INFO: renamed from: k */
    public List<MediaTrack> f28569k;

    /* JADX INFO: renamed from: l */
    public C2413o f28570l;

    /* JADX INFO: renamed from: m */
    public String f28571m;

    /* JADX INFO: renamed from: n */
    public List<C2374b> f28572n;

    /* JADX INFO: renamed from: o */
    public List<C2371a> f28573o;

    /* JADX INFO: renamed from: p */
    public String f28574p;

    /* JADX INFO: renamed from: q */
    public C2416p f28575q;

    /* JADX INFO: renamed from: r */
    public long f28576r;

    /* JADX INFO: renamed from: s */
    public String f28577s;

    /* JADX INFO: renamed from: t */
    public String f28578t;

    /* JADX INFO: renamed from: u */
    public JSONObject f28579u;

    public MediaInfo(String str, int i, String str2, C2395i c2395i, long j2, List<MediaTrack> list, C2413o c2413o, String str3, List<C2374b> list2, List<C2371a> list3, String str4, C2416p c2416p, long j3, String str5, String str6) {
        this.f28564f = str;
        this.f28565g = i;
        this.f28566h = str2;
        this.f28567i = c2395i;
        this.f28568j = j2;
        this.f28569k = list;
        this.f28570l = c2413o;
        this.f28571m = str3;
        if (str3 != null) {
            try {
                this.f28579u = new JSONObject(this.f28571m);
            } catch (JSONException unused) {
                this.f28579u = null;
                this.f28571m = null;
            }
        } else {
            this.f28579u = null;
        }
        this.f28572n = list2;
        this.f28573o = list3;
        this.f28574p = str4;
        this.f28575q = c2416p;
        this.f28576r = j3;
        this.f28577s = str5;
        this.f28578t = str6;
    }

    /* JADX INFO: renamed from: H */
    public final void m12648H(JSONObject jSONObject) throws JSONException {
        C2371a c2371a;
        C2371a c2371a2;
        String[] strArr;
        C2374b c2374b;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            this.f28572n = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Parcelable.Creator<C2374b> creator = C2374b.CREATOR;
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long jM5112b = C2516a.m5112b(jSONObject2.getLong("position"));
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jM5112b2 = C2516a.m5112b(jSONObject2.optLong(CainMediaMetadataRetriever.METADATA_KEY_DURATION));
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        if (jSONArrayOptJSONArray != null) {
                            String[] strArr2 = new String[jSONArrayOptJSONArray.length()];
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                strArr2[i2] = jSONArrayOptJSONArray.getString(i2);
                            }
                            strArr = strArr2;
                        } else {
                            strArr = null;
                        }
                        c2374b = new C2374b(jM5112b, string, jM5112b2, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"));
                    } catch (JSONException e) {
                        Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e.getMessage()));
                        c2374b = null;
                    }
                } else {
                    c2374b = null;
                }
                if (c2374b == null) {
                    this.f28572n.clear();
                    break;
                }
                this.f28572n.add(c2374b);
            }
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            this.f28573o = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                Parcelable.Creator<C2371a> creator2 = C2371a.CREATOR;
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jM5112b3 = C2516a.m5112b(jSONObject3.optLong(CainMediaMetadataRetriever.METADATA_KEY_DURATION));
                        c2371a = null;
                        try {
                            String strOptString = jSONObject3.optString("clickThroughUrl", null);
                            String strOptString2 = jSONObject3.optString("contentUrl", null);
                            String strOptString3 = jSONObject3.optString("mimeType", null);
                            if (strOptString3 == null) {
                                strOptString3 = jSONObject3.optString("contentType", null);
                            }
                            String str = strOptString3;
                            String strOptString4 = jSONObject3.optString(CainMediaMetadataRetriever.METADATA_KEY_TITLE, null);
                            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                            c2371a2 = new C2371a(string2, strOptString4, jM5112b3, strOptString2, str, strOptString, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), jSONObject3.optString("contentId", null), jSONObject3.optString("posterUrl", null), jSONObject3.has("whenSkippable") ? C2516a.m5112b(((Integer) jSONObject3.get("whenSkippable")).intValue()) : -1L, jSONObject3.optString("hlsSegmentFormat", null), C2416p.m4990H(jSONObject3.optJSONObject("vastAdsRequest")));
                        } catch (JSONException e2) {
                            e = e2;
                            Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e.getMessage()));
                            c2371a2 = c2371a;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        c2371a = null;
                    }
                } else {
                    c2371a2 = null;
                }
                if (c2371a2 == null) {
                    this.f28573o.clear();
                    return;
                }
                this.f28573o.add(c2371a2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f28579u;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.f28579u;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C2786f.m5628a(jSONObject, jSONObject2)) && C2516a.m5114d(this.f28564f, mediaInfo.f28564f) && this.f28565g == mediaInfo.f28565g && C2516a.m5114d(this.f28566h, mediaInfo.f28566h) && C2516a.m5114d(this.f28567i, mediaInfo.f28567i) && this.f28568j == mediaInfo.f28568j && C2516a.m5114d(this.f28569k, mediaInfo.f28569k) && C2516a.m5114d(this.f28570l, mediaInfo.f28570l) && C2516a.m5114d(this.f28572n, mediaInfo.f28572n) && C2516a.m5114d(this.f28573o, mediaInfo.f28573o) && C2516a.m5114d(this.f28574p, mediaInfo.f28574p) && C2516a.m5114d(this.f28575q, mediaInfo.f28575q) && this.f28576r == mediaInfo.f28576r && C2516a.m5114d(this.f28577s, mediaInfo.f28577s) && C2516a.m5114d(this.f28578t, mediaInfo.f28578t);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28564f, Integer.valueOf(this.f28565g), this.f28566h, this.f28567i, Long.valueOf(this.f28568j), String.valueOf(this.f28579u), this.f28569k, this.f28570l, this.f28572n, this.f28573o, this.f28574p, this.f28575q, Long.valueOf(this.f28576r), this.f28577s});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f28579u;
        this.f28571m = jSONObject == null ? null : jSONObject.toString();
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f28564f, false);
        int i2 = this.f28565g;
        parcel.writeInt(262147);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 4, this.f28566h, false);
        C2622l.m5311T(parcel, 5, this.f28567i, i, false);
        long j2 = this.f28568j;
        parcel.writeInt(524294);
        parcel.writeLong(j2);
        C2622l.m5331Y(parcel, 7, this.f28569k, false);
        C2622l.m5311T(parcel, 8, this.f28570l, i, false);
        C2622l.m5315U(parcel, 9, this.f28571m, false);
        List<C2374b> list = this.f28572n;
        C2622l.m5331Y(parcel, 10, list == null ? null : Collections.unmodifiableList(list), false);
        List<C2371a> list2 = this.f28573o;
        C2622l.m5331Y(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null, false);
        C2622l.m5315U(parcel, 12, this.f28574p, false);
        C2622l.m5311T(parcel, 13, this.f28575q, i, false);
        long j3 = this.f28576r;
        parcel.writeInt(524302);
        parcel.writeLong(j3);
        C2622l.m5315U(parcel, 15, this.f28577s, false);
        C2622l.m5315U(parcel, 16, this.f28578t, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        MediaInfo mediaInfo;
        String str;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            mediaInfo = this;
            mediaInfo.f28565g = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(strOptString)) {
                mediaInfo.f28565g = 1;
            } else if ("LIVE".equals(strOptString)) {
                mediaInfo.f28565g = 2;
            } else {
                mediaInfo.f28565g = -1;
            }
        }
        mediaInfo.f28566h = jSONObject.optString("contentType", null);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            C2395i c2395i = new C2395i(jSONObject2.getInt("metadataType"));
            mediaInfo.f28567i = c2395i;
            c2395i.m4962H(jSONObject2);
        }
        mediaInfo.f28568j = -1L;
        if (jSONObject.has(CainMediaMetadataRetriever.METADATA_KEY_DURATION) && !jSONObject.isNull(CainMediaMetadataRetriever.METADATA_KEY_DURATION)) {
            double dOptDouble = jSONObject.optDouble(CainMediaMetadataRetriever.METADATA_KEY_DURATION, 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble)) {
                mediaInfo.f28568j = C2516a.m5112b(dOptDouble);
            }
        }
        String str2 = "customData";
        if (jSONObject.has("tracks")) {
            mediaInfo.f28569k = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                MediaTrack mediaTrack = new MediaTrack(0L, 0, null, null, null, null, -1, null);
                String str3 = str2;
                mediaTrack.f28580f = jSONObject3.getLong("trackId");
                String string = jSONObject3.getString("type");
                if ("TEXT".equals(string)) {
                    mediaTrack.f28581g = 1;
                } else if ("AUDIO".equals(string)) {
                    mediaTrack.f28581g = 2;
                } else if ("VIDEO".equals(string)) {
                    mediaTrack.f28581g = 3;
                } else {
                    String strValueOf = String.valueOf(string);
                    throw new JSONException(strValueOf.length() != 0 ? "invalid type: ".concat(strValueOf) : new String("invalid type: "));
                }
                mediaTrack.f28582h = jSONObject3.optString("trackContentId", null);
                mediaTrack.f28583i = jSONObject3.optString("trackContentType", null);
                mediaTrack.f28584j = jSONObject3.optString("name", null);
                mediaTrack.f28585k = jSONObject3.optString(CainMediaMetadataRetriever.METADATA_KEY_LANGUAGE, null);
                if (jSONObject3.has("subtype")) {
                    String string2 = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string2)) {
                        mediaTrack.f28586l = 1;
                    } else if ("CAPTIONS".equals(string2)) {
                        mediaTrack.f28586l = 2;
                    } else if ("DESCRIPTIONS".equals(string2)) {
                        mediaTrack.f28586l = 3;
                    } else if ("CHAPTERS".equals(string2)) {
                        mediaTrack.f28586l = 4;
                    } else if ("METADATA".equals(string2)) {
                        mediaTrack.f28586l = 5;
                    } else {
                        mediaTrack.f28586l = -1;
                    }
                } else {
                    mediaTrack.f28586l = 0;
                }
                mediaTrack.f28588n = jSONObject3.optJSONObject(str3);
                mediaInfo.f28569k.add(mediaTrack);
                i++;
                str2 = str3;
            }
            str = str2;
        } else {
            str = "customData";
            mediaInfo.f28569k = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            C2413o c2413o = new C2413o();
            c2413o.f11116f = (float) jSONObject4.optDouble("fontScale", 1.0d);
            c2413o.f11117g = C2413o.m4989H(jSONObject4.optString("foregroundColor"));
            c2413o.f11118h = C2413o.m4989H(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string3 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string3)) {
                    c2413o.f11119i = 0;
                } else if ("OUTLINE".equals(string3)) {
                    c2413o.f11119i = 1;
                } else if ("DROP_SHADOW".equals(string3)) {
                    c2413o.f11119i = 2;
                } else if ("RAISED".equals(string3)) {
                    c2413o.f11119i = 3;
                } else if ("DEPRESSED".equals(string3)) {
                    c2413o.f11119i = 4;
                }
            }
            c2413o.f11120j = C2413o.m4989H(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string4 = jSONObject4.getString("windowType");
                if ("NONE".equals(string4)) {
                    c2413o.f11121k = 0;
                } else if ("NORMAL".equals(string4)) {
                    c2413o.f11121k = 1;
                } else if ("ROUNDED_CORNERS".equals(string4)) {
                    c2413o.f11121k = 2;
                }
            }
            c2413o.f11122l = C2413o.m4989H(jSONObject4.optString("windowColor"));
            if (c2413o.f11121k == 2) {
                c2413o.f11123m = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            c2413o.f11124n = jSONObject4.optString("fontFamily", null);
            if (jSONObject4.has("fontGenericFamily")) {
                String string5 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string5)) {
                    c2413o.f11125o = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string5)) {
                    c2413o.f11125o = 1;
                } else if ("SERIF".equals(string5)) {
                    c2413o.f11125o = 2;
                } else if ("MONOSPACED_SERIF".equals(string5)) {
                    c2413o.f11125o = 3;
                } else if ("CASUAL".equals(string5)) {
                    c2413o.f11125o = 4;
                } else if ("CURSIVE".equals(string5)) {
                    c2413o.f11125o = 5;
                } else if ("SMALL_CAPITALS".equals(string5)) {
                    c2413o.f11125o = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string6 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string6)) {
                    c2413o.f11126p = 0;
                } else if ("BOLD".equals(string6)) {
                    c2413o.f11126p = 1;
                } else if ("ITALIC".equals(string6)) {
                    c2413o.f11126p = 2;
                } else if ("BOLD_ITALIC".equals(string6)) {
                    c2413o.f11126p = 3;
                }
            }
            c2413o.f11128r = jSONObject4.optJSONObject(str);
            mediaInfo.f28570l = c2413o;
        } else {
            mediaInfo.f28570l = null;
        }
        m12648H(jSONObject);
        mediaInfo.f28579u = jSONObject.optJSONObject(str);
        mediaInfo.f28574p = jSONObject.optString("entity", null);
        mediaInfo.f28577s = jSONObject.optString("atvEntity", null);
        mediaInfo.f28575q = C2416p.m4990H(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0.0d) {
                mediaInfo.f28576r = C2516a.m5112b(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.f28578t = jSONObject.optString("contentUrl");
        }
    }
}
