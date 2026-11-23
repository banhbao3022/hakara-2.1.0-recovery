package p007c.p056c.p057a;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p056c.p057a.p059b0.Font;
import p007c.p056c.p057a.p059b0.FontCharacter;
import p007c.p056c.p057a.p059b0.Marker;
import p007c.p056c.p057a.p059b0.p062l.Layer;
import p007c.p056c.p057a.p066e0.Logger2;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.SparseArrayCompat;

/* JADX INFO: renamed from: c.c.a.f, reason: use source file name */
/* JADX INFO: compiled from: LottieComposition.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieComposition {

    /* JADX INFO: renamed from: c */
    public Map<String, List<Layer>> f2345c;

    /* JADX INFO: renamed from: d */
    public Map<String, LottieImageAsset> f2346d;

    /* JADX INFO: renamed from: e */
    public Map<String, Font> f2347e;

    /* JADX INFO: renamed from: f */
    public List<Marker> f2348f;

    /* JADX INFO: renamed from: g */
    public SparseArrayCompat<FontCharacter> f2349g;

    /* JADX INFO: renamed from: h */
    public LongSparseArray<Layer> f2350h;

    /* JADX INFO: renamed from: i */
    public List<Layer> f2351i;

    /* JADX INFO: renamed from: j */
    public Rect f2352j;

    /* JADX INFO: renamed from: k */
    public float f2353k;

    /* JADX INFO: renamed from: l */
    public float f2354l;

    /* JADX INFO: renamed from: m */
    public float f2355m;

    /* JADX INFO: renamed from: n */
    public boolean f2356n;

    /* JADX INFO: renamed from: a */
    public final PerformanceTracker f2343a = new PerformanceTracker();

    /* JADX INFO: renamed from: b */
    public final HashSet<String> f2344b = new HashSet<>();

    /* JADX INFO: renamed from: o */
    public int f2357o = 0;

    /* JADX INFO: renamed from: a */
    public void m1443a(String str) {
        Logger2.m1420b(str);
        this.f2344b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public float m1444b() {
        return (long) ((m1445c() / this.f2355m) * 1000.0f);
    }

    /* JADX INFO: renamed from: c */
    public float m1445c() {
        return this.f2354l - this.f2353k;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX INFO: renamed from: d */
    public Marker m1446d(String str) {
        this.f2348f.size();
        for (int i = 0; i < this.f2348f.size(); i++) {
            Marker marker = this.f2348f.get(i);
            boolean z = true;
            if (!marker.f1997a.equalsIgnoreCase(str)) {
                if (marker.f1997a.endsWith("\r")) {
                    String str2 = marker.f1997a;
                    if (!str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                return marker;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Layer m1447e(long j2) {
        return this.f2350h.m15590j(j2, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f2351i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m1360a("\t"));
        }
        return sb.toString();
    }
}
