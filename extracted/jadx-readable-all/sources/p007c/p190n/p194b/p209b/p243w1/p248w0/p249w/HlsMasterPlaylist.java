package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.f, reason: use source file name */
/* JADX INFO: compiled from: HlsMasterPlaylist.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {

    /* JADX INFO: renamed from: d */
    public static final HlsMasterPlaylist f9552d = new HlsMasterPlaylist("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: e */
    public final List<Uri> f9553e;

    /* JADX INFO: renamed from: f */
    public final List<b> f9554f;

    /* JADX INFO: renamed from: g */
    public final List<a> f9555g;

    /* JADX INFO: renamed from: h */
    public final List<a> f9556h;

    /* JADX INFO: renamed from: i */
    public final List<a> f9557i;

    /* JADX INFO: renamed from: j */
    public final List<a> f9558j;

    /* JADX INFO: renamed from: k */
    public final Format f9559k;

    /* JADX INFO: renamed from: l */
    public final List<Format> f9560l;

    /* JADX INFO: renamed from: m */
    public final Map<String, String> f9561m;

    /* JADX INFO: renamed from: n */
    public final List<DrmInitData> f9562n;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.f$a */
    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Uri f9563a;

        /* JADX INFO: renamed from: b */
        public final Format f9564b;

        /* JADX INFO: renamed from: c */
        public final String f9565c;

        public a(Uri uri, Format format, String str, String str2) {
            this.f9563a = uri;
            this.f9564b = format;
            this.f9565c = str2;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.f$b */
    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f9566a;

        /* JADX INFO: renamed from: b */
        public final Format f9567b;

        /* JADX INFO: renamed from: c */
        public final String f9568c;

        /* JADX INFO: renamed from: d */
        public final String f9569d;

        /* JADX INFO: renamed from: e */
        public final String f9570e;

        /* JADX INFO: renamed from: f */
        public final String f9571f;

        public b(Uri uri, Format format, String str, String str2, String str3, String str4) {
            this.f9566a = uri;
            this.f9567b = format;
            this.f9568c = str;
            this.f9569d = str2;
            this.f9570e = str3;
            this.f9571f = str4;
        }
    }

    public HlsMasterPlaylist(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, Format format, List<Format> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).f9566a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        m4344b(list3, arrayList);
        m4344b(list4, arrayList);
        m4344b(list5, arrayList);
        m4344b(list6, arrayList);
        this.f9553e = Collections.unmodifiableList(arrayList);
        this.f9554f = Collections.unmodifiableList(list2);
        this.f9555g = Collections.unmodifiableList(list3);
        this.f9556h = Collections.unmodifiableList(list4);
        this.f9557i = Collections.unmodifiableList(list5);
        this.f9558j = Collections.unmodifiableList(list6);
        this.f9559k = format;
        this.f9560l = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f9561m = Collections.unmodifiableMap(map);
        this.f9562n = Collections.unmodifiableList(list8);
    }

    /* JADX INFO: renamed from: b */
    public static void m4344b(List<a> list, List<Uri> list2) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i).f9563a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> List<T> m4345c(List<T> list, int i, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            T t = list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                StreamKey streamKey = list2.get(i3);
                if (streamKey.f8820g == i && streamKey.f8821h == i2) {
                    arrayList.add(t);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p209b.p242v1.FilterableManifest
    /* JADX INFO: renamed from: a */
    public HlsPlaylist mo4049a(List list) {
        return new HlsMasterPlaylist(this.f9611a, this.f9612b, m4345c(this.f9554f, 0, list), Collections.emptyList(), m4345c(this.f9556h, 1, list), m4345c(this.f9557i, 2, list), Collections.emptyList(), this.f9559k, this.f9560l, this.f9613c, this.f9561m, this.f9562n);
    }
}
