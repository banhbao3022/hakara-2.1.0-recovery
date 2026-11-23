package p007c.p165l.p178k0;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: c.l.k0.r, reason: use source file name */
/* JADX INFO: compiled from: FetchedAppSettings.java */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppSettings {

    /* JADX INFO: renamed from: a */
    public boolean f5001a;

    /* JADX INFO: renamed from: b */
    public int f5002b;

    /* JADX INFO: renamed from: c */
    public EnumSet<SmartLoginOption> f5003c;

    /* JADX INFO: renamed from: d */
    public Map<String, Map<String, a>> f5004d;

    /* JADX INFO: renamed from: e */
    public boolean f5005e;

    /* JADX INFO: renamed from: f */
    public FacebookRequestErrorClassification3 f5006f;

    /* JADX INFO: renamed from: g */
    public boolean f5007g;

    /* JADX INFO: renamed from: h */
    public boolean f5008h;

    /* JADX INFO: renamed from: i */
    public String f5009i;

    /* JADX INFO: renamed from: j */
    public JSONArray f5010j;

    /* JADX INFO: renamed from: k */
    public String f5011k;

    /* JADX INFO: renamed from: l */
    public String f5012l;

    /* JADX INFO: renamed from: m */
    public String f5013m;

    /* JADX INFO: renamed from: c.l.k0.r$a */
    /* JADX INFO: compiled from: FetchedAppSettings.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f5014a;

        /* JADX INFO: renamed from: b */
        public String f5015b;

        /* JADX INFO: renamed from: c */
        public int[] f5016c;

        public a(String str, String str2, Uri uri, int[] iArr) {
            this.f5014a = str;
            this.f5015b = str2;
            this.f5016c = iArr;
        }
    }

    public FetchedAppSettings(boolean z, String str, boolean z2, int i, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, a>> map, boolean z3, FacebookRequestErrorClassification3 facebookRequestErrorClassification3, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, String str5, String str6, String str7) {
        this.f5001a = z;
        this.f5004d = map;
        this.f5006f = facebookRequestErrorClassification3;
        this.f5002b = i;
        this.f5005e = z3;
        this.f5003c = enumSet;
        this.f5007g = z4;
        this.f5008h = z5;
        this.f5010j = jSONArray;
        this.f5009i = str4;
        this.f5011k = str5;
        this.f5012l = str6;
        this.f5013m = str7;
    }
}
