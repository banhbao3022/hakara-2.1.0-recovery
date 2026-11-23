package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ov */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3376ov extends bb1 {

    /* JADX INFO: renamed from: a */
    public final ic1 f17741a;

    /* JADX INFO: renamed from: b */
    public final gd2<Integer> f17742b;

    /* JADX INFO: renamed from: c */
    public final gd2<ya1> f17743c;

    /* JADX INFO: renamed from: d */
    public final gd2<String> f17744d;

    /* JADX INFO: renamed from: e */
    public final gd2<hb1> f17745e;

    /* JADX INFO: renamed from: f */
    public final gd2<nb1> f17746f;

    /* JADX INFO: renamed from: g */
    public final gd2<rb1> f17747g;

    /* JADX INFO: renamed from: h */
    public final gd2<yb1> f17748h;

    /* JADX INFO: renamed from: i */
    public final gd2<fc1> f17749i;

    /* JADX INFO: renamed from: j */
    public final gd2<qc1> f17750j;

    /* JADX INFO: renamed from: k */
    public final gd2<String> f17751k;

    /* JADX INFO: renamed from: l */
    public final gd2<xn0> f17752l;

    /* JADX INFO: renamed from: m */
    public final gd2<xn0> f17753m;

    /* JADX INFO: renamed from: n */
    public final gd2<xn0> f17754n;

    /* JADX INFO: renamed from: o */
    public final gd2<xn0> f17755o;

    /* JADX INFO: renamed from: p */
    public final gd2<Map<rl1, xn0>> f17756p;

    /* JADX INFO: renamed from: q */
    public final gd2<Set<bc0<zl1>>> f17757q;

    /* JADX INFO: renamed from: r */
    public final gd2<Set<bc0<zl1>>> f17758r;

    /* JADX INFO: renamed from: s */
    public final gd2 f17759s;

    /* JADX INFO: renamed from: t */
    public final gd2<yl1> f17760t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C3600uw f17761u;

    public C3376ov(C3600uw c3600uw, ic1 ic1Var) {
        this.f17761u = c3600uw;
        this.f17741a = ic1Var;
        lc1 lc1Var = new lc1(ic1Var);
        this.f17742b = lc1Var;
        C3563tx c3563tx = C3526sx.f19729a;
        gd2<Context> gd2Var = c3600uw.f20627g;
        gd2<ScheduledExecutorService> gd2Var2 = c3600uw.f20639m;
        vk1 vk1Var = tk1.f19870a;
        this.f17743c = new ab1(c3563tx, gd2Var, gd2Var2, vk1Var, lc1Var);
        jc1 jc1Var = new jc1(ic1Var);
        this.f17744d = jc1Var;
        this.f17745e = new jb1(C2857av.f12277a, c3600uw.f20627g, jc1Var, vk1Var);
        this.f17746f = new pb1(c3563tx, lc1Var, c3600uw.f20627g, c3600uw.f20613X, c3600uw.f20639m, vk1Var);
        this.f17747g = new tb1(C3304mx.f16956a, vk1Var, c3600uw.f20627g);
        this.f17748h = new ac1(C3378ox.f17778a, vk1Var, jc1Var);
        this.f17749i = new hc1(C3452qx.f18656a, c3600uw.f20639m, c3600uw.f20627g);
        this.f17750j = new sc1(vk1Var);
        mc1 mc1Var = new mc1(ic1Var);
        this.f17751k = mc1Var;
        gd2<xn0> gd2VarM8791b = yc2.m8791b(pn0.f18035a);
        this.f17752l = gd2VarM8791b;
        gd2<xn0> gd2VarM8791b2 = yc2.m8791b(nn0.f17174a);
        this.f17753m = gd2VarM8791b2;
        gd2<xn0> gd2VarM8791b3 = yc2.m8791b(rn0.f18963a);
        this.f17754n = gd2VarM8791b3;
        gd2<xn0> gd2VarM8791b4 = yc2.m8791b(tn0.f19926a);
        this.f17755o = gd2VarM8791b4;
        int i = bd2.f12573b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2622l.m5245E2(4));
        linkedHashMap.put(rl1.GMS_SIGNALS, gd2VarM8791b);
        linkedHashMap.put(rl1.BUILD_URL, gd2VarM8791b2);
        linkedHashMap.put(rl1.HTTP, gd2VarM8791b3);
        linkedHashMap.put(rl1.PRE_PROCESS, gd2VarM8791b4);
        bd2 bd2Var = new bd2(linkedHashMap);
        this.f17756p = bd2Var;
        gd2<Set<bc0<zl1>>> vn0Var = new vn0(mc1Var, c3600uw.f20627g, vk1Var, bd2Var);
        vn0Var = vn0Var instanceof yc2 ? vn0Var : new yc2(vn0Var);
        this.f17757q = vn0Var;
        int i2 = ed2.f13561a;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(vn0Var);
        ed2 ed2Var = new ed2(listEmptyList, arrayList);
        this.f17758r = ed2Var;
        bm1 bm1Var = new bm1(ed2Var);
        this.f17759s = bm1Var;
        gd2<yl1> am1Var = new am1(vk1Var, c3600uw.f20639m, bm1Var);
        this.f17760t = am1Var instanceof yc2 ? am1Var : new yc2(am1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bb1
    /* JADX INFO: renamed from: a */
    public final ma1<JSONObject> mo5957a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        C3627vm c3627vm = new C3627vm();
        String str = this.f17741a.f15140a.f18298i;
        Objects.requireNonNull(str, "Cannot return null from a non-@Nullable @Provides method");
        a91 a91Var = new a91(new yb1(c3627vm, lv1Var, str, null), 0L, this.f17761u.f20639m.mo4613a());
        C3029fh c3029fh = new C3029fh();
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f17761u.f20639m.mo4613a();
        Context context = this.f17761u.f20617b.f17275b;
        Objects.requireNonNull(context, "Cannot return null from a non-@Nullable @Provides method");
        a91 a91Var2 = new a91(new fc1(c3029fh, scheduledExecutorServiceMo4613a, context, null), ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14327c2)).longValue(), this.f17761u.f20639m.mo4613a());
        C3701xm c3701xm = new C3701xm();
        Context context2 = this.f17761u.f20617b.f17275b;
        Objects.requireNonNull(context2, "Cannot return null from a non-@Nullable @Provides method");
        a91 a91Var3 = new a91(new ya1(c3701xm, context2, this.f17761u.f20639m.mo4613a(), lv1Var, this.f17741a.f15141b, null), 0L, this.f17761u.f20639m.mo4613a());
        a91 a91Var4 = new a91(new qc1(lv1Var), 0L, this.f17761u.f20639m.mo4613a());
        ia1 ia1Var = nc1.f17068a;
        Context context3 = this.f17761u.f20617b.f17275b;
        Objects.requireNonNull(context3, "Cannot return null from a non-@Nullable @Provides method");
        String str2 = this.f17741a.f15140a.f18298i;
        Objects.requireNonNull(str2, "Cannot return null from a non-@Nullable @Provides method");
        hb1 hb1Var = new hb1(null, context3, str2, lv1Var);
        or2 or2Var = new or2();
        Context context4 = this.f17761u.f20617b.f17275b;
        Objects.requireNonNull(context4, "Cannot return null from a non-@Nullable @Provides method");
        C3701xm c3701xm2 = new C3701xm();
        int i = this.f17741a.f15141b;
        Context context5 = this.f17761u.f20617b.f17275b;
        Objects.requireNonNull(context5, "Cannot return null from a non-@Nullable @Provides method");
        return new ma1<>(lv1Var, xs1.m8751t(a91Var, a91Var2, a91Var3, a91Var4, ia1Var, hb1Var, new rb1(or2Var, lv1Var, context4, null), m8069d(), m8070e(), new nb1(c3701xm2, i, context5, this.f17761u.f20613X.mo4613a(), this.f17761u.f20639m.mo4613a(), lv1Var, null), (ia1) this.f17761u.f20658v0.mo4613a()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bb1
    /* JADX INFO: renamed from: b */
    public final ma1<JSONObject> mo5958b() {
        new C3627vm();
        Object objMo4613a = this.f17761u.f20658v0.mo4613a();
        eb1 eb1VarM8070e = m8070e();
        cc1 cc1VarM8069d = m8069d();
        vc2 vc2VarM8792c = yc2.m8792c(this.f17743c);
        vc2 vc2VarM8792c2 = yc2.m8792c(this.f17745e);
        vc2 vc2VarM8792c3 = yc2.m8792c(this.f17746f);
        vc2 vc2VarM8792c4 = yc2.m8792c(this.f17747g);
        yc2.m8792c(this.f17748h);
        vc2 vc2VarM8792c5 = yc2.m8792c(this.f17749i);
        vc2 vc2VarM8792c6 = yc2.m8792c(this.f17750j);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        this.f17761u.f20639m.mo4613a();
        HashSet hashSet = new HashSet();
        hashSet.add((vb1) objMo4613a);
        hashSet.add(eb1VarM8070e);
        hashSet.add(cc1VarM8069d);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14440s3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c.m8545a());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14447t3)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c2.m8545a());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14454u3)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c3.m8545a());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14461v3)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c4.m8545a());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14475x3)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c5.m8545a());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14482y3)).booleanValue()) {
            hashSet.add((ia1) vc2VarM8792c6.m8545a());
        }
        return new ma1<>(lv1Var, hashSet);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bb1
    /* JADX INFO: renamed from: c */
    public final yl1 mo5959c() {
        return this.f17760t.mo4613a();
    }

    /* JADX INFO: renamed from: d */
    public final cc1 m8069d() {
        C3495s2 c3495s2 = new C3495s2();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        List<String> list = this.f17741a.f15140a.f18299j;
        Objects.requireNonNull(list, "Cannot return null from a non-@Nullable @Provides method");
        return new cc1(c3495s2, lv1Var, list, null);
    }

    /* JADX INFO: renamed from: e */
    public final eb1 m8070e() {
        C3701xm c3701xm = new C3701xm();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        String string = this.f17741a.f15140a.f18295f.getString("ms");
        Objects.requireNonNull(string, "Cannot return null from a non-@Nullable @Provides method");
        ic1 ic1Var = this.f17741a;
        return new eb1(c3701xm, lv1Var, string, ic1Var.f15140a.f18300k, ic1Var.f15141b, null);
    }
}
