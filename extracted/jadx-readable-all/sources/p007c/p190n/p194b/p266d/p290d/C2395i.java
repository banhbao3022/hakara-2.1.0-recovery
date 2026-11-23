package p007c.p190n.p194b.p266d.p290d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.p296c.C2521b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2395i extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public static final a f11046g;

    /* JADX INFO: renamed from: h */
    public final List<C2708a> f11047h;

    /* JADX INFO: renamed from: i */
    public final Bundle f11048i;

    /* JADX INFO: renamed from: j */
    public int f11049j;

    /* JADX INFO: renamed from: f */
    public static final String[] f11045f = {null, "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C2395i> CREATOR = new C2570z0();

    /* JADX INFO: renamed from: c.n.b.d.d.i$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<String, String> f11050a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Map<String, String> f11051b = new HashMap();

        /* JADX INFO: renamed from: c */
        public final Map<String, Integer> f11052c = new HashMap();

        /* JADX INFO: renamed from: a */
        public final a m4966a(String str, String str2, int i) {
            this.f11050a.put(str, str2);
            this.f11051b.put(str2, str);
            this.f11052c.put(str, Integer.valueOf(i));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final int m4967b(String str) {
            Integer num = this.f11052c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    static {
        a aVar = new a();
        aVar.m4966a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        aVar.m4966a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        aVar.m4966a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        aVar.m4966a("com.google.android.gms.cast.metadata.TITLE", CainMediaMetadataRetriever.METADATA_KEY_TITLE, 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.ARTIST", CainMediaMetadataRetriever.METADATA_KEY_ARTIST, 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.COMPOSER", CainMediaMetadataRetriever.METADATA_KEY_COMPOSER, 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        aVar.m4966a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        aVar.m4966a("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        aVar.m4966a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        aVar.m4966a("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        aVar.m4966a("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        aVar.m4966a("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        aVar.m4966a("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        aVar.m4966a("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f11046g = aVar;
    }

    public C2395i(List<C2708a> list, Bundle bundle, int i) {
        this.f11047h = list;
        this.f11048i = bundle;
        this.f11049j = i;
    }

    /* JADX INFO: renamed from: H */
    public final void m4962H(JSONObject jSONObject) {
        this.f11048i.clear();
        this.f11047h.clear();
        this.f11049j = 0;
        try {
            this.f11049j = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            C2521b.m5126a(this.f11047h, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f11049j;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!"metadataType".equals(next)) {
                    a aVar = f11046g;
                    String str = aVar.f11051b.get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f11048i.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f11048i.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f11048i.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int iM4967b = aVar.m4967b(str);
                                if (iM4967b != 1) {
                                    if (iM4967b != 2) {
                                        if (iM4967b == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                this.f11048i.putDouble(str, dOptDouble);
                                            }
                                        } else if (iM4967b != 4) {
                                            if (iM4967b == 5) {
                                                this.f11048i.putLong(str, C2516a.m5112b(jSONObject.optLong(next)));
                                            }
                                        } else if ((obj2 instanceof String) && C2521b.m5127b((String) obj2) != null) {
                                            this.f11048i.putString(str, (String) obj2);
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f11048i.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f11048i.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    /* JADX INFO: renamed from: K */
    public String m4963K(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iM4967b = f11046g.m4967b(str);
        if (iM4967b == 1 || iM4967b == 0) {
            return this.f11048i.getString(str);
        }
        String str2 = f11045f[1];
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + str.length() + 21);
        sb.append("Value for ");
        sb.append(str);
        sb.append(" must be a ");
        sb.append(str2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: L */
    public boolean m4964L() {
        List<C2708a> list = this.f11047h;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m4965M(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m4965M((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2395i)) {
            return false;
        }
        C2395i c2395i = (C2395i) obj;
        return m4965M(this.f11048i, c2395i.f11048i) && this.f11047h.equals(c2395i.f11047h);
    }

    public int hashCode() {
        Iterator<String> it = this.f11048i.keySet().iterator();
        int iHashCode = 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + this.f11048i.get(it.next()).hashCode();
        }
        return this.f11047h.hashCode() + (iHashCode * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5331Y(parcel, 2, this.f11047h, false);
        C2622l.m5295P(parcel, 3, this.f11048i, false);
        int i2 = this.f11049j;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2395i() {
        this(0);
    }

    public C2395i(int i) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        this.f11047h = arrayList;
        this.f11048i = bundle;
        this.f11049j = i;
    }
}
