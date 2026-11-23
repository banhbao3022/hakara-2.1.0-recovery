package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.a.e5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2980e5 extends AbstractBinderC3313n5 {

    /* JADX INFO: renamed from: f */
    public static final int f13493f;

    /* JADX INFO: renamed from: g */
    public static final int f13494g;

    /* JADX INFO: renamed from: h */
    public static final int f13495h;

    /* JADX INFO: renamed from: i */
    public static final int f13496i;

    /* JADX INFO: renamed from: j */
    public final String f13497j;

    /* JADX INFO: renamed from: k */
    public final List<BinderC3091h5> f13498k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC3610v5> f13499l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final int f13500m;

    /* JADX INFO: renamed from: n */
    public final int f13501n;

    /* JADX INFO: renamed from: o */
    public final int f13502o;

    /* JADX INFO: renamed from: p */
    public final int f13503p;

    /* JADX INFO: renamed from: q */
    public final int f13504q;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f13493f = iRgb;
        int iRgb2 = Color.rgb(204, 204, 204);
        f13494g = iRgb2;
        f13495h = iRgb2;
        f13496i = iRgb;
    }

    public BinderC2980e5(String str, List<BinderC3091h5> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f13497j = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            BinderC3091h5 binderC3091h5 = list.get(i3);
            this.f13498k.add(binderC3091h5);
            this.f13499l.add(binderC3091h5);
        }
        this.f13500m = num != null ? num.intValue() : f13495h;
        this.f13501n = num2 != null ? num2.intValue() : f13496i;
        this.f13502o = num3 != null ? num3.intValue() : 12;
        this.f13503p = i;
        this.f13504q = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3350o5
    /* JADX INFO: renamed from: a */
    public final String mo6604a() {
        return this.f13497j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3350o5
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC3610v5> mo6605b() {
        return this.f13499l;
    }
}
