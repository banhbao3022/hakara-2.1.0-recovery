package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.eg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2991eg extends C3287mg {

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f13579c;

    /* JADX INFO: renamed from: d */
    public final Context f13580d;

    /* JADX INFO: renamed from: e */
    public final String f13581e;

    /* JADX INFO: renamed from: f */
    public final long f13582f;

    /* JADX INFO: renamed from: g */
    public final long f13583g;

    /* JADX INFO: renamed from: h */
    public final String f13584h;

    /* JADX INFO: renamed from: i */
    public final String f13585i;

    public C2991eg(InterfaceC3410ps interfaceC3410ps, Map<String, String> map) {
        long j2;
        super(interfaceC3410ps, "createCalendarEvent");
        this.f13579c = map;
        this.f13580d = interfaceC3410ps.mo6482h();
        this.f13581e = m6632f(CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
        this.f13584h = m6632f("summary");
        String str = map.get("start_ticks");
        long j3 = -1;
        if (str == null) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j2 = -1;
            }
        }
        this.f13582f = j2;
        String str2 = this.f13579c.get("end_ticks");
        if (str2 != null) {
            try {
                j3 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f13583g = j3;
        this.f13585i = m6632f("location");
    }

    /* JADX INFO: renamed from: f */
    public final String m6632f(String str) {
        return TextUtils.isEmpty(this.f13579c.get(str)) ? "" : this.f13579c.get(str);
    }
}
