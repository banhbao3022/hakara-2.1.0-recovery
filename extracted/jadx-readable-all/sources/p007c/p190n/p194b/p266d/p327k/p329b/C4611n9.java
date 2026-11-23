package p007c.p190n.p194b.p266d.p327k.p329b;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4140e4;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4151f1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4165g1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4179h1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4186h8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4235l1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4286oa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4300pa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4343sb;
import p007c.p190n.p194b.p266d.p314j.p325k.C4399x0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4408x9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4433z8;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4090aa;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.n9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4611n9 implements InterfaceC4697v5 {

    /* JADX INFO: renamed from: a */
    public static volatile C4611n9 f24190a;

    /* JADX INFO: renamed from: b */
    public C4652r4 f24192b;

    /* JADX INFO: renamed from: c */
    public C4739z3 f24193c;

    /* JADX INFO: renamed from: d */
    public C4517g f24194d;

    /* JADX INFO: renamed from: e */
    public C4486d4 f24195e;

    /* JADX INFO: renamed from: f */
    public C4575k9 f24196f;

    /* JADX INFO: renamed from: g */
    public C4528ga f24197g;

    /* JADX INFO: renamed from: h */
    public final C4679t9 f24198h;

    /* JADX INFO: renamed from: i */
    public C4561j7 f24199i;

    /* JADX INFO: renamed from: j */
    public C4678t8 f24200j;

    /* JADX INFO: renamed from: k */
    public final C4707w4 f24201k;

    /* JADX INFO: renamed from: m */
    public boolean f24203m;

    /* JADX INFO: renamed from: n */
    public long f24204n;

    /* JADX INFO: renamed from: o */
    public List<Runnable> f24205o;

    /* JADX INFO: renamed from: p */
    public int f24206p;

    /* JADX INFO: renamed from: q */
    public int f24207q;

    /* JADX INFO: renamed from: r */
    public boolean f24208r;

    /* JADX INFO: renamed from: s */
    public boolean f24209s;

    /* JADX INFO: renamed from: t */
    public boolean f24210t;

    /* JADX INFO: renamed from: u */
    public FileLock f24211u;

    /* JADX INFO: renamed from: v */
    public FileChannel f24212v;

    /* JADX INFO: renamed from: w */
    public List<Long> f24213w;

    /* JADX INFO: renamed from: x */
    public List<Long> f24214x;

    /* JADX INFO: renamed from: y */
    public long f24215y;

    /* JADX INFO: renamed from: z */
    public final Map<String, C4481d> f24216z;

    /* JADX INFO: renamed from: l */
    public boolean f24202l = false;

    /* JADX INFO: renamed from: A */
    public final InterfaceC4745z9 f24191A = new C4646q9(this);

    /* JADX INFO: renamed from: c.n.b.d.k.b.n9$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    public class a {

        /* JADX INFO: renamed from: a */
        public C4179h1 f24217a;

        /* JADX INFO: renamed from: b */
        public List<Long> f24218b;

        /* JADX INFO: renamed from: c */
        public List<C4123d1> f24219c;

        /* JADX INFO: renamed from: d */
        public long f24220d;

        public a(C4611n9 c4611n9, RunnableC4599m9 runnableC4599m9) {
        }

        /* JADX INFO: renamed from: a */
        public final void m10699a(C4179h1 c4179h1) {
            this.f24217a = c4179h1;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m10700b(long j2, C4123d1 c4123d1) {
            if (this.f24219c == null) {
                this.f24219c = new ArrayList();
            }
            if (this.f24218b == null) {
                this.f24218b = new ArrayList();
            }
            if (this.f24219c.size() > 0 && ((this.f24219c.get(0).m9521F() / 1000) / 60) / 60 != ((c4123d1.m9521F() / 1000) / 60) / 60) {
                return false;
            }
            long jMo9420i = this.f24220d + ((long) c4123d1.mo9420i());
            if (jMo9420i >= Math.max(0, C4647r.f24353i.m10638a(null).intValue())) {
                return false;
            }
            this.f24220d = jMo9420i;
            this.f24219c.add(c4123d1);
            this.f24218b.add(Long.valueOf(j2));
            return this.f24219c.size() < Math.max(1, C4647r.f24355j.m10638a(null).intValue());
        }
    }

    public C4611n9(C4690u9 c4690u9) {
        C4707w4 c4707w4M10821b = C4707w4.m10821b(c4690u9.f24486a, null, null);
        this.f24201k = c4707w4M10821b;
        this.f24215y = -1L;
        C4679t9 c4679t9 = new C4679t9(this);
        c4679t9.m10643k();
        this.f24198h = c4679t9;
        C4739z3 c4739z3 = new C4739z3(this);
        c4739z3.m10643k();
        this.f24193c = c4739z3;
        C4652r4 c4652r4 = new C4652r4(this);
        c4652r4.m10643k();
        this.f24192b = c4652r4;
        this.f24216z = new HashMap();
        c4707w4M10821b.mo10686n().m10758v(new RunnableC4599m9(this, c4690u9));
    }

    /* JADX INFO: renamed from: C */
    public static void m10650C(AbstractC4587l9 abstractC4587l9) {
        if (abstractC4587l9 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC4587l9.f24133c) {
            return;
        }
        String strValueOf = String.valueOf(abstractC4587l9.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public static C4611n9 m10651b(Context context) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (f24190a == null) {
            synchronized (C4611n9.class) {
                if (f24190a == null) {
                    f24190a = new C4611n9(new C4690u9(context));
                }
            }
        }
        return f24190a;
    }

    /* JADX INFO: renamed from: d */
    public static void m10652d(C4123d1.a aVar, int i, String str) {
        List<C4151f1> listM9529A = aVar.m9529A();
        for (int i2 = 0; i2 < listM9529A.size(); i2++) {
            if ("_err".equals(listM9529A.get(i2).m9590z())) {
                return;
            }
        }
        C4151f1.a aVarM9571O = C4151f1.m9571O();
        aVarM9571O.m9593x("_err");
        aVarM9571O.m9592w(Long.valueOf(i).longValue());
        C4151f1 c4151f1 = (C4151f1) ((AbstractC4099b5) aVarM9571O.m9433t());
        C4151f1.a aVarM9571O2 = C4151f1.m9571O();
        aVarM9571O2.m9593x("_ev");
        aVarM9571O2.m9594y(str);
        C4151f1 c4151f2 = (C4151f1) ((AbstractC4099b5) aVarM9571O2.m9433t());
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4123d1.m9516y((C4123d1) aVar.f23086g, c4151f1);
        if (aVar.f23087h) {
            aVar.m9431r();
            aVar.f23087h = false;
        }
        C4123d1.m9516y((C4123d1) aVar.f23086g, c4151f2);
    }

    /* JADX INFO: renamed from: e */
    public static void m10653e(C4123d1.a aVar, String str) {
        List<C4151f1> listM9529A = aVar.m9529A();
        for (int i = 0; i < listM9529A.size(); i++) {
            if (str.equals(listM9529A.get(i).m9590z())) {
                aVar.m9531E(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m10654A(C4123d1.a aVar, C4123d1.a aVar2) {
        C2622l.m5339a("_e".equals(aVar.m9532F()));
        m10666N();
        C4151f1 c4151f1M10795w = C4679t9.m10795w((C4123d1) ((AbstractC4099b5) aVar.m9433t()), "_et");
        if (!c4151f1M10795w.m9581G() || c4151f1M10795w.m9582H() <= 0) {
            return;
        }
        long jM9582H = c4151f1M10795w.m9582H();
        m10666N();
        C4151f1 c4151f1M10795w2 = C4679t9.m10795w((C4123d1) ((AbstractC4099b5) aVar2.m9433t()), "_et");
        if (c4151f1M10795w2 != null && c4151f1M10795w2.m9582H() > 0) {
            jM9582H += c4151f1M10795w2.m9582H();
        }
        m10666N();
        C4679t9.m10785E(aVar2, "_et", Long.valueOf(jM9582H));
        m10666N();
        C4679t9.m10785E(aVar, "_fr", 1L);
    }

    /* JADX INFO: renamed from: B */
    public final void m10655B(C4625p c4625p, C4480ca c4480ca) throws Throwable {
        if (C4300pa.m10143a() && this.f24201k.f24534h.m10417k(C4647r.f24297A0)) {
            C4706w3 c4706w3M10819b = C4706w3.m10819b(c4625p);
            this.f24201k.m10837t().m10874H(c4706w3M10819b.f24518d, m10663K().m10574h0(c4480ca.f23798f));
            this.f24201k.m10837t().m10883Q(c4706w3M10819b, this.f24201k.f24534h.m10415h(c4480ca.f23798f));
            c4625p = c4706w3M10819b.m10820a();
        }
        if (this.f24201k.f24534h.m10417k(C4647r.f24346e0) && "_cmp".equals(c4625p.f24249f) && "referrer API v2".equals(c4625p.f24250g.f24221f.getString("_cis"))) {
            String string = c4625p.f24250g.f24221f.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
                m10683k(new C4712w9("_lgclid", c4625p.f24252i, string, "auto"), c4480ca);
            }
        }
        m10679g(c4625p, c4480ca);
    }

    /* JADX INFO: renamed from: D */
    public final void m10656D(C4712w9 c4712w9, C4480ca c4480ca) throws Throwable {
        m10673U();
        m10668P();
        if (m10664L(c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            if ("_npa".equals(c4712w9.f24562g) && c4480ca.f23816x != null) {
                this.f24201k.mo10684l().f24425m.m10811a("Falling back to manifest metadata value for ad personalization");
                m10683k(new C4712w9("_npa", this.f24201k.f24541o.mo5623c(), Long.valueOf(c4480ca.f23816x.booleanValue() ? 1L : 0L), "auto"), c4480ca);
                return;
            }
            this.f24201k.mo10684l().f24425m.m10812b("Removing user property", this.f24201k.m10838u().m10721y(c4712w9.f24562g));
            m10663K().m10568b0();
            try {
                m10659G(c4480ca);
                m10663K().m10562V(c4480ca.f23798f, c4712w9.f24562g);
                m10663K().m10578s();
                this.f24201k.mo10684l().f24425m.m10812b("User property removed", this.f24201k.m10838u().m10721y(c4712w9.f24562g));
            } finally {
                m10663K().m10571e0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0387  */
    /* JADX WARN: Code duplicated, block: B:74:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m10657E(C4480ca c4480ca) throws Throwable {
        C4474c4 c4474c4;
        C4577l c4577lM10585z;
        String str;
        long j2;
        String str2;
        long j3;
        PackageInfo packageInfoM5635c;
        ApplicationInfo applicationInfoM5633a;
        boolean z;
        m10673U();
        m10668P();
        Objects.requireNonNull(c4480ca, "null reference");
        C2622l.m5359e(c4480ca.f23798f);
        if (m10664L(c4480ca)) {
            C4474c4 c4474c4M10560T = m10663K().m10560T(c4480ca.f23798f);
            if (c4474c4M10560T != null && TextUtils.isEmpty(c4474c4M10560T.m10474v()) && !TextUtils.isEmpty(c4480ca.f23799g)) {
                c4474c4M10560T.m10434F(0L);
                m10663K().m10549I(c4474c4M10560T);
                C4652r4 c4652r4M10660H = m10660H();
                String str3 = c4480ca.f23798f;
                c4652r4M10660H.mo10381b();
                c4652r4M10660H.f24396g.remove(str3);
            }
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            long jMo5623c = c4480ca.f23810r;
            if (jMo5623c == 0) {
                jMo5623c = this.f24201k.f24541o.mo5623c();
            }
            C4553j c4553jM10842y = this.f24201k.m10842y();
            c4553jM10842y.mo10381b();
            c4553jM10842y.f24022g = null;
            c4553jM10842y.f24023h = 0L;
            int i = c4480ca.f23811s;
            if (i != 0 && i != 1) {
                this.f24201k.mo10684l().f24421i.m10813c("Incorrect app type, assuming installed app. appId, appType", C4662s3.m10738s(c4480ca.f23798f), Integer.valueOf(i));
                i = 0;
            }
            m10663K().m10568b0();
            try {
                C4734y9 c4734y9M10565Y = m10663K().m10565Y(c4480ca.f23798f, "_npa");
                if (c4734y9M10565Y != null && !"auto".equals(c4734y9M10565Y.f24611b)) {
                    c4474c4 = null;
                } else if (c4480ca.f23816x != null) {
                    c4474c4 = null;
                    C4712w9 c4712w9 = new C4712w9("_npa", jMo5623c, Long.valueOf(c4480ca.f23816x.booleanValue() ? 1L : 0L), "auto");
                    if (c4734y9M10565Y == null || !c4734y9M10565Y.f24614e.equals(c4712w9.f24564i)) {
                        m10683k(c4712w9, c4480ca);
                    }
                } else {
                    c4474c4 = null;
                    if (c4734y9M10565Y != null) {
                        m10656D(new C4712w9("_npa", jMo5623c, null, "auto"), c4480ca);
                    }
                }
                C4474c4 c4474c4M10560T2 = m10663K().m10560T(c4480ca.f23798f);
                if (c4474c4M10560T2 != null) {
                    this.f24201k.m10837t();
                    if (C4723x9.m10858d0(c4480ca.f23799g, c4474c4M10560T2.m10474v(), c4480ca.f23815w, c4474c4M10560T2.m10477y())) {
                        this.f24201k.mo10684l().f24421i.m10812b("New GMP App Id passed in. Removing cached database data. appId", C4662s3.m10738s(c4474c4M10560T2.m10467o()));
                        C4517g c4517gM10663K = m10663K();
                        String strM10467o = c4474c4M10560T2.m10467o();
                        c4517gM10663K.m10642i();
                        c4517gM10663K.mo10381b();
                        C2622l.m5359e(strM10467o);
                        try {
                            SQLiteDatabase sQLiteDatabaseM10579t = c4517gM10663K.m10579t();
                            String[] strArr = {strM10467o};
                            int iDelete = sQLiteDatabaseM10579t.delete("events", "app_id=?", strArr) + 0 + sQLiteDatabaseM10579t.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("consent_settings", "app_id=?", strArr);
                            if (iDelete > 0) {
                                c4517gM10663K.mo10684l().f24426n.m10813c("Deleted application data. app, records", strM10467o, Integer.valueOf(iDelete));
                            }
                        } catch (SQLiteException e) {
                            c4517gM10663K.mo10684l().f24418f.m10813c("Error deleting application data. appId, error", C4662s3.m10738s(strM10467o), e);
                        }
                        c4474c4M10560T2 = c4474c4;
                    }
                }
                if (c4474c4M10560T2 != null) {
                    if (((c4474c4M10560T2.m10442N() == -2147483648L || c4474c4M10560T2.m10442N() == c4480ca.f23807o) ? false : true) | ((c4474c4M10560T2.m10442N() != -2147483648L || c4474c4M10560T2.m10441M() == null || c4474c4M10560T2.m10441M().equals(c4480ca.f23800h)) ? false : true)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", c4474c4M10560T2.m10441M());
                        m10679g(new C4625p("_au", new C4613o(bundle), "auto", jMo5623c), c4480ca);
                    }
                }
                m10659G(c4480ca);
                if (i == 0) {
                    c4577lM10585z = m10663K().m10585z(c4480ca.f23798f, "_f");
                } else {
                    c4577lM10585z = i == 1 ? m10663K().m10585z(c4480ca.f23798f, "_v") : c4474c4;
                }
                if (c4577lM10585z == null) {
                    long j4 = ((jMo5623c / 3600000) + 1) * 3600000;
                    if (i == 0) {
                        m10683k(new C4712w9("_fot", jMo5623c, Long.valueOf(j4), "auto"), c4480ca);
                        m10673U();
                        this.f24201k.f24550x.m10711a(c4480ca.f23798f);
                        m10673U();
                        m10668P();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        if (this.f24201k.f24534h.m10423u(c4480ca.f23798f, C4647r.f24330T)) {
                            str2 = "_et";
                            j3 = 1;
                            bundle2.putLong(str2, 1L);
                        } else {
                            str2 = "_et";
                            j3 = 1;
                        }
                        if (c4480ca.f23814v) {
                            bundle2.putLong("_dac", j3);
                        }
                        C4517g c4517gM10663K2 = m10663K();
                        String str4 = c4480ca.f23798f;
                        C2622l.m5359e(str4);
                        c4517gM10663K2.mo10381b();
                        c4517gM10663K2.m10642i();
                        long jM10573g0 = c4517gM10663K2.m10573g0(str4, "first_open_count");
                        if (this.f24201k.f24528b.getPackageManager() == null) {
                            this.f24201k.mo10684l().f24418f.m10812b("PackageManager is null, first open report might be inaccurate. appId", C4662s3.m10738s(c4480ca.f23798f));
                            str2 = str2;
                            jM10573g0 = jM10573g0;
                        } else {
                            try {
                                packageInfoM5635c = C2794c.m5637a(this.f24201k.f24528b).m5635c(c4480ca.f23798f, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                this.f24201k.mo10684l().f24418f.m10813c("Package info is null, first open report might be inaccurate. appId", C4662s3.m10738s(c4480ca.f23798f), e2);
                                packageInfoM5635c = c4474c4;
                            }
                            if (packageInfoM5635c != 0) {
                                long j5 = packageInfoM5635c.firstInstallTime;
                                if (j5 != 0) {
                                    if (j5 != packageInfoM5635c.lastUpdateTime) {
                                        if (!this.f24201k.f24534h.m10417k(C4647r.f24364n0) || jM10573g0 == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                        }
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    m10683k(new C4712w9("_fi", jMo5623c, Long.valueOf(z ? 1L : 0L), "auto"), c4480ca);
                                }
                            }
                            try {
                                applicationInfoM5633a = C2794c.m5637a(this.f24201k.f24528b).m5633a(c4480ca.f23798f, 0);
                            } catch (PackageManager.NameNotFoundException e3) {
                                this.f24201k.mo10684l().f24418f.m10813c("Application info is null, first open report might be inaccurate. appId", C4662s3.m10738s(c4480ca.f23798f), e3);
                                applicationInfoM5633a = c4474c4;
                            }
                            if (applicationInfoM5633a != 0) {
                                if ((applicationInfoM5633a.flags & 1) != 0) {
                                    bundle2.putLong("_sys", 1L);
                                }
                                if ((applicationInfoM5633a.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", 1L);
                                }
                            }
                        }
                        if (jM10573g0 >= 0) {
                            bundle2.putLong("_pfo", jM10573g0);
                        }
                        m10655B(new C4625p("_f", new C4613o(bundle2), "auto", jMo5623c), c4480ca);
                        str = str2;
                    } else {
                        str = "_et";
                        if (i == 1) {
                            m10683k(new C4712w9("_fvt", jMo5623c, Long.valueOf(j4), "auto"), c4480ca);
                            m10673U();
                            m10668P();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            if (this.f24201k.f24534h.m10423u(c4480ca.f23798f, C4647r.f24330T)) {
                                j2 = 1;
                                bundle3.putLong(str, 1L);
                            } else {
                                j2 = 1;
                            }
                            if (c4480ca.f23814v) {
                                bundle3.putLong("_dac", j2);
                            }
                            m10655B(new C4625p("_v", new C4613o(bundle3), "auto", jMo5623c), c4480ca);
                        }
                    }
                    if (!this.f24201k.f24534h.m10423u(c4480ca.f23798f, C4647r.f24331U)) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong(str, 1L);
                        if (this.f24201k.f24534h.m10423u(c4480ca.f23798f, C4647r.f24330T)) {
                            bundle4.putLong("_fr", 1L);
                        }
                        m10655B(new C4625p("_e", new C4613o(bundle4), "auto", jMo5623c), c4480ca);
                    }
                } else if (c4480ca.f23806n) {
                    m10655B(new C4625p("_cd", new C4613o(new Bundle()), "auto", jMo5623c), c4480ca);
                }
                m10663K().m10578s();
                m10663K().m10571e0();
            } catch (Throwable th) {
                m10663K().m10571e0();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m10658F(C4624oa c4624oa, C4480ca c4480ca) throws Throwable {
        Objects.requireNonNull(c4624oa, "null reference");
        C2622l.m5359e(c4624oa.f24238f);
        Objects.requireNonNull(c4624oa.f24240h, "null reference");
        C2622l.m5359e(c4624oa.f24240h.f24562g);
        m10673U();
        m10668P();
        if (m10664L(c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            m10663K().m10568b0();
            try {
                m10659G(c4480ca);
                C4624oa c4624oaM10566Z = m10663K().m10566Z(c4624oa.f24238f, c4624oa.f24240h.f24562g);
                if (c4624oaM10566Z != null) {
                    this.f24201k.mo10684l().f24425m.m10813c("Removing conditional user property", c4624oa.f24238f, this.f24201k.m10838u().m10721y(c4624oa.f24240h.f24562g));
                    m10663K().m10567a0(c4624oa.f24238f, c4624oa.f24240h.f24562g);
                    if (c4624oaM10566Z.f24242j) {
                        m10663K().m10562V(c4624oa.f24238f, c4624oa.f24240h.f24562g);
                    }
                    C4625p c4625p = c4624oa.f24248p;
                    if (c4625p != null) {
                        C4613o c4613o = c4625p.f24250g;
                        Bundle bundleM10702K = c4613o != null ? c4613o.m10702K() : null;
                        C4723x9 c4723x9M10837t = this.f24201k.m10837t();
                        String str = c4624oa.f24238f;
                        C4625p c4625p2 = c4624oa.f24248p;
                        m10661I(c4723x9M10837t.m10870B(str, c4625p2.f24249f, bundleM10702K, c4624oaM10566Z.f24239g, c4625p2.f24252i, true, C4186h8.m9830a() && this.f24201k.f24534h.m10417k(C4647r.f24321M0)), c4480ca);
                    }
                } else {
                    this.f24201k.mo10684l().f24421i.m10813c("Conditional user property doesn't exist", C4662s3.m10738s(c4624oa.f24238f), this.f24201k.m10838u().m10721y(c4624oa.f24240h.f24562g));
                }
                m10663K().m10578s();
            } finally {
                m10663K().m10571e0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x0351  */
    /* JADX WARN: Code duplicated, block: B:166:0x0375  */
    /* JADX WARN: Code duplicated, block: B:169:0x0383  */
    /* JADX WARN: Code duplicated, block: B:172:0x0391  */
    /* JADX WARN: Code duplicated, block: B:174:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:185:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:194:0x0404  */
    /* JADX WARN: Code duplicated, block: B:196:0x0407  */
    /* JADX INFO: renamed from: G */
    public final C4474c4 m10659G(C4480ca c4480ca) throws Throwable {
        boolean z;
        long j2;
        String str;
        long j3;
        String str2;
        m10673U();
        m10668P();
        Objects.requireNonNull(c4480ca, "null reference");
        C2622l.m5359e(c4480ca.f23798f);
        C4474c4 c4474c4M10560T = m10663K().m10560T(c4480ca.f23798f);
        C4481d c4481dM10491h = C4481d.f23819a;
        C4481d c4481dM10491h2 = (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) ? m10676a(c4480ca.f23798f).m10491h(C4481d.m10484b(c4480ca.f23797B)) : c4481dM10491h;
        String strM10780t = (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !c4481dM10491h2.m10492j()) ? "" : this.f24200j.m10780t(c4480ca.f23798f);
        if (((InterfaceC4090aa) C4408x9.f23627f.zza()).zza() && this.f24201k.f24534h.m10417k(C4647r.f24366o0)) {
            if (c4474c4M10560T == null) {
                c4474c4M10560T = new C4474c4(this.f24201k, c4480ca.f23798f);
                if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                    if (c4481dM10491h2.m10493k()) {
                        c4474c4M10560T.m10455c(m10677c(c4481dM10491h2));
                    }
                    if (c4481dM10491h2.m10492j()) {
                        c4474c4M10560T.m10476x(strM10780t);
                    }
                } else {
                    c4474c4M10560T.m10455c(m10675W());
                    c4474c4M10560T.m10476x(strM10780t);
                }
            } else if ((!C4145e9.m9566a() || !this.f24201k.f24534h.m10417k(C4647r.f24315J0) || c4481dM10491h2.m10492j()) && !strM10780t.equals(c4474c4M10560T.m10433E())) {
                c4474c4M10560T.m10476x(strM10780t);
                if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                    c4474c4M10560T.m10455c(m10677c(c4481dM10491h2));
                } else {
                    c4474c4M10560T.m10455c(m10675W());
                }
            } else if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && TextUtils.isEmpty(c4474c4M10560T.m10471s()) && c4481dM10491h2.m10493k()) {
                c4474c4M10560T.m10455c(m10677c(c4481dM10491h2));
            }
            c4474c4M10560T.m10465m(c4480ca.f23799g);
            c4474c4M10560T.m10469q(c4480ca.f23815w);
            if (C4286oa.m10122a() && this.f24201k.f24534h.m10423u(c4474c4M10560T.m10467o(), C4647r.f24356j0)) {
                c4474c4M10560T.m10473u(c4480ca.f23796A);
            }
            if (!TextUtils.isEmpty(c4480ca.f23808p)) {
                c4474c4M10560T.m10429A(c4480ca.f23808p);
            }
            long j4 = c4480ca.f23802j;
            if (j4 != 0) {
                c4474c4M10560T.m10472t(j4);
            }
            if (!TextUtils.isEmpty(c4480ca.f23800h)) {
                c4474c4M10560T.m10432D(c4480ca.f23800h);
            }
            c4474c4M10560T.m10468p(c4480ca.f23807o);
            String str3 = c4480ca.f23801i;
            if (str3 != null) {
                c4474c4M10560T.m10435G(str3);
            }
            c4474c4M10560T.m10475w(c4480ca.f23803k);
            c4474c4M10560T.m10457e(c4480ca.f23805m);
            if (!TextUtils.isEmpty(c4480ca.f23804l)) {
                c4474c4M10560T.m10438J(c4480ca.f23804l);
            }
            if (!this.f24201k.f24534h.m10417k(C4647r.f24386y0)) {
                c4474c4M10560T.m10446R(c4480ca.f23809q);
            }
            c4474c4M10560T.m10466n(c4480ca.f23812t);
            c4474c4M10560T.m10470r(c4480ca.f23813u);
            c4474c4M10560T.m10454b(c4480ca.f23816x);
            c4474c4M10560T.m10478z(c4480ca.f23817y);
            c4474c4M10560T.f23757a.mo10686n().mo10381b();
            if (c4474c4M10560T.f23754E) {
                m10663K().m10549I(c4474c4M10560T);
            }
            return c4474c4M10560T;
        }
        if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
            c4481dM10491h = m10676a(c4480ca.f23798f).m10491h(C4481d.m10484b(c4480ca.f23797B));
        }
        boolean z2 = true;
        if (c4474c4M10560T == null) {
            c4474c4M10560T = new C4474c4(this.f24201k, c4480ca.f23798f);
            if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                if (c4481dM10491h.m10493k()) {
                    c4474c4M10560T.m10455c(m10677c(c4481dM10491h));
                }
                if (c4481dM10491h.m10492j()) {
                    c4474c4M10560T.m10476x(strM10780t);
                }
            } else {
                c4474c4M10560T.m10455c(m10675W());
                c4474c4M10560T.m10476x(strM10780t);
            }
        } else {
            if ((C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !c4481dM10491h.m10492j()) || strM10780t.equals(c4474c4M10560T.m10433E())) {
                if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && TextUtils.isEmpty(c4474c4M10560T.m10471s()) && c4481dM10491h.m10493k()) {
                    c4474c4M10560T.m10455c(m10677c(c4481dM10491h));
                } else {
                    z = false;
                }
                if (!TextUtils.equals(c4480ca.f23799g, c4474c4M10560T.m10474v())) {
                    c4474c4M10560T.m10465m(c4480ca.f23799g);
                    z = true;
                }
                if (!TextUtils.equals(c4480ca.f23815w, c4474c4M10560T.m10477y())) {
                    c4474c4M10560T.m10469q(c4480ca.f23815w);
                    z = true;
                }
                if (C4286oa.m10122a() && this.f24201k.f24534h.m10423u(c4474c4M10560T.m10467o(), C4647r.f24356j0) && !TextUtils.equals(c4480ca.f23796A, c4474c4M10560T.m10430B())) {
                    c4474c4M10560T.m10473u(c4480ca.f23796A);
                    z = true;
                }
                if (!TextUtils.isEmpty(c4480ca.f23808p) && !c4480ca.f23808p.equals(c4474c4M10560T.m10436H())) {
                    c4474c4M10560T.m10429A(c4480ca.f23808p);
                    z = true;
                }
                j2 = c4480ca.f23802j;
                if (j2 != 0 && j2 != c4474c4M10560T.m10444P()) {
                    c4474c4M10560T.m10472t(c4480ca.f23802j);
                    z = true;
                }
                if (!TextUtils.isEmpty(c4480ca.f23800h) && !c4480ca.f23800h.equals(c4474c4M10560T.m10441M())) {
                    c4474c4M10560T.m10432D(c4480ca.f23800h);
                    z = true;
                }
                if (c4480ca.f23807o != c4474c4M10560T.m10442N()) {
                    c4474c4M10560T.m10468p(c4480ca.f23807o);
                    z = true;
                }
                str = c4480ca.f23801i;
                if (str != null && !str.equals(c4474c4M10560T.m10443O())) {
                    c4474c4M10560T.m10435G(c4480ca.f23801i);
                    z = true;
                }
                if (c4480ca.f23803k != c4474c4M10560T.m10445Q()) {
                    c4474c4M10560T.m10475w(c4480ca.f23803k);
                    z = true;
                }
                if (c4480ca.f23805m != c4474c4M10560T.m10448T()) {
                    c4474c4M10560T.m10457e(c4480ca.f23805m);
                    z = true;
                }
                if (!TextUtils.isEmpty(c4480ca.f23804l)) {
                    str2 = c4480ca.f23804l;
                    c4474c4M10560T.f23757a.mo10686n().mo10381b();
                    if (!str2.equals(c4474c4M10560T.f23753D)) {
                        c4474c4M10560T.m10438J(c4480ca.f23804l);
                        z = true;
                    }
                }
                if (!this.f24201k.f24534h.m10417k(C4647r.f24386y0) && c4480ca.f23809q != c4474c4M10560T.m10459g()) {
                    c4474c4M10560T.m10446R(c4480ca.f23809q);
                    z = true;
                }
                if (c4480ca.f23812t != c4474c4M10560T.m10460h()) {
                    c4474c4M10560T.m10466n(c4480ca.f23812t);
                    z = true;
                }
                if (c4480ca.f23813u != c4474c4M10560T.m10461i()) {
                    c4474c4M10560T.m10470r(c4480ca.f23813u);
                    z = true;
                }
                if (c4480ca.f23816x != c4474c4M10560T.m10462j()) {
                    c4474c4M10560T.m10454b(c4480ca.f23816x);
                    z = true;
                }
                j3 = c4480ca.f23817y;
                if (j3 != 0 || j3 == c4474c4M10560T.m10447S()) {
                    z2 = z;
                } else {
                    c4474c4M10560T.m10478z(c4480ca.f23817y);
                }
                if (z2) {
                    m10663K().m10549I(c4474c4M10560T);
                }
                return c4474c4M10560T;
            }
            c4474c4M10560T.m10476x(strM10780t);
            if (!C4145e9.m9566a() || !this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                c4474c4M10560T.m10455c(m10675W());
            } else if (c4481dM10491h.m10493k()) {
                c4474c4M10560T.m10455c(m10677c(c4481dM10491h));
            }
        }
        z = true;
        if (!TextUtils.equals(c4480ca.f23799g, c4474c4M10560T.m10474v())) {
            c4474c4M10560T.m10465m(c4480ca.f23799g);
            z = true;
        }
        if (!TextUtils.equals(c4480ca.f23815w, c4474c4M10560T.m10477y())) {
            c4474c4M10560T.m10469q(c4480ca.f23815w);
            z = true;
        }
        if (C4286oa.m10122a()) {
            c4474c4M10560T.m10473u(c4480ca.f23796A);
            z = true;
        }
        if (!TextUtils.isEmpty(c4480ca.f23808p)) {
            c4474c4M10560T.m10429A(c4480ca.f23808p);
            z = true;
        }
        j2 = c4480ca.f23802j;
        if (j2 != 0) {
            c4474c4M10560T.m10472t(c4480ca.f23802j);
            z = true;
        }
        if (!TextUtils.isEmpty(c4480ca.f23800h)) {
            c4474c4M10560T.m10432D(c4480ca.f23800h);
            z = true;
        }
        if (c4480ca.f23807o != c4474c4M10560T.m10442N()) {
            c4474c4M10560T.m10468p(c4480ca.f23807o);
            z = true;
        }
        str = c4480ca.f23801i;
        if (str != null) {
            c4474c4M10560T.m10435G(c4480ca.f23801i);
            z = true;
        }
        if (c4480ca.f23803k != c4474c4M10560T.m10445Q()) {
            c4474c4M10560T.m10475w(c4480ca.f23803k);
            z = true;
        }
        if (c4480ca.f23805m != c4474c4M10560T.m10448T()) {
            c4474c4M10560T.m10457e(c4480ca.f23805m);
            z = true;
        }
        if (!TextUtils.isEmpty(c4480ca.f23804l)) {
            str2 = c4480ca.f23804l;
            c4474c4M10560T.f23757a.mo10686n().mo10381b();
            if (!str2.equals(c4474c4M10560T.f23753D)) {
                c4474c4M10560T.m10438J(c4480ca.f23804l);
                z = true;
            }
        }
        if (!this.f24201k.f24534h.m10417k(C4647r.f24386y0)) {
            c4474c4M10560T.m10446R(c4480ca.f23809q);
            z = true;
        }
        if (c4480ca.f23812t != c4474c4M10560T.m10460h()) {
            c4474c4M10560T.m10466n(c4480ca.f23812t);
            z = true;
        }
        if (c4480ca.f23813u != c4474c4M10560T.m10461i()) {
            c4474c4M10560T.m10470r(c4480ca.f23813u);
            z = true;
        }
        if (c4480ca.f23816x != c4474c4M10560T.m10462j()) {
            c4474c4M10560T.m10454b(c4480ca.f23816x);
            z = true;
        }
        j3 = c4480ca.f23817y;
        if (j3 != 0) {
            z2 = z;
        } else {
            z2 = z;
        }
        if (z2) {
            m10663K().m10549I(c4474c4M10560T);
        }
        return c4474c4M10560T;
    }

    /* JADX INFO: renamed from: H */
    public final C4652r4 m10660H() {
        m10650C(this.f24192b);
        return this.f24192b;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x0940  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b4 A[Catch: all -> 0x0996, TryCatch #1 {all -> 0x0996, blocks: (B:38:0x013c, B:41:0x014b, B:43:0x0155, B:48:0x0161, B:55:0x0173, B:58:0x017f, B:60:0x0196, B:65:0x01af, B:70:0x01e4, B:72:0x01ea, B:74:0x01f8, B:76:0x0200, B:78:0x020a, B:80:0x0215, B:83:0x021c, B:92:0x02aa, B:94:0x02b4, B:98:0x02ed, B:102:0x02ff, B:104:0x034c, B:106:0x0351, B:107:0x036a, B:111:0x037b, B:113:0x0390, B:115:0x0395, B:116:0x03ae, B:120:0x03d3, B:124:0x03f8, B:125:0x0411, B:128:0x0420, B:131:0x0443, B:132:0x045f, B:134:0x0469, B:136:0x0475, B:138:0x047b, B:139:0x0486, B:141:0x0492, B:142:0x04a9, B:144:0x04d1, B:147:0x04ea, B:150:0x0530, B:152:0x0548, B:154:0x057f, B:155:0x0584, B:157:0x058c, B:158:0x0591, B:160:0x0599, B:161:0x059e, B:163:0x05a7, B:164:0x05ab, B:166:0x05b8, B:167:0x05bd, B:169:0x05c3, B:171:0x05d1, B:172:0x05e8, B:174:0x05ee, B:176:0x05fe, B:178:0x0608, B:180:0x0610, B:181:0x0615, B:183:0x061f, B:185:0x0629, B:187:0x0631, B:193:0x064e, B:195:0x0656, B:196:0x0659, B:198:0x0668, B:199:0x066b, B:201:0x0681, B:203:0x068f, B:227:0x0739, B:229:0x077e, B:230:0x0783, B:232:0x078b, B:234:0x0791, B:236:0x079f, B:238:0x07a6, B:241:0x07ae, B:242:0x07b1, B:237:0x07a3, B:243:0x07b2, B:245:0x07be, B:247:0x07cd, B:249:0x07db, B:251:0x07ea, B:253:0x07fa, B:255:0x0808, B:258:0x0819, B:260:0x084e, B:261:0x0853, B:257:0x080e, B:250:0x07e3, B:262:0x085f, B:264:0x0865, B:266:0x0873, B:271:0x088a, B:273:0x0894, B:274:0x089b, B:275:0x08a6, B:277:0x08ac, B:279:0x08db, B:280:0x08eb, B:282:0x08f3, B:283:0x08f7, B:285:0x0900, B:294:0x0941, B:296:0x0947, B:299:0x0963, B:288:0x090d, B:290:0x092b, B:298:0x094b, B:268:0x0879, B:270:0x0883, B:205:0x0695, B:207:0x06a7, B:209:0x06ab, B:211:0x06b6, B:212:0x06c1, B:214:0x06d3, B:216:0x06d7, B:218:0x06dd, B:220:0x06ed, B:222:0x06ff, B:226:0x0736, B:223:0x0719, B:225:0x071f, B:188:0x0637, B:190:0x0641, B:192:0x0649, B:151:0x053a, B:85:0x0244, B:86:0x0263, B:91:0x028f, B:90:0x027e, B:77:0x0205, B:68:0x01bd, B:69:0x01da), top: B:307:0x013c, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ed A[Catch: all -> 0x0996, TRY_LEAVE, TryCatch #1 {all -> 0x0996, blocks: (B:38:0x013c, B:41:0x014b, B:43:0x0155, B:48:0x0161, B:55:0x0173, B:58:0x017f, B:60:0x0196, B:65:0x01af, B:70:0x01e4, B:72:0x01ea, B:74:0x01f8, B:76:0x0200, B:78:0x020a, B:80:0x0215, B:83:0x021c, B:92:0x02aa, B:94:0x02b4, B:98:0x02ed, B:102:0x02ff, B:104:0x034c, B:106:0x0351, B:107:0x036a, B:111:0x037b, B:113:0x0390, B:115:0x0395, B:116:0x03ae, B:120:0x03d3, B:124:0x03f8, B:125:0x0411, B:128:0x0420, B:131:0x0443, B:132:0x045f, B:134:0x0469, B:136:0x0475, B:138:0x047b, B:139:0x0486, B:141:0x0492, B:142:0x04a9, B:144:0x04d1, B:147:0x04ea, B:150:0x0530, B:152:0x0548, B:154:0x057f, B:155:0x0584, B:157:0x058c, B:158:0x0591, B:160:0x0599, B:161:0x059e, B:163:0x05a7, B:164:0x05ab, B:166:0x05b8, B:167:0x05bd, B:169:0x05c3, B:171:0x05d1, B:172:0x05e8, B:174:0x05ee, B:176:0x05fe, B:178:0x0608, B:180:0x0610, B:181:0x0615, B:183:0x061f, B:185:0x0629, B:187:0x0631, B:193:0x064e, B:195:0x0656, B:196:0x0659, B:198:0x0668, B:199:0x066b, B:201:0x0681, B:203:0x068f, B:227:0x0739, B:229:0x077e, B:230:0x0783, B:232:0x078b, B:234:0x0791, B:236:0x079f, B:238:0x07a6, B:241:0x07ae, B:242:0x07b1, B:237:0x07a3, B:243:0x07b2, B:245:0x07be, B:247:0x07cd, B:249:0x07db, B:251:0x07ea, B:253:0x07fa, B:255:0x0808, B:258:0x0819, B:260:0x084e, B:261:0x0853, B:257:0x080e, B:250:0x07e3, B:262:0x085f, B:264:0x0865, B:266:0x0873, B:271:0x088a, B:273:0x0894, B:274:0x089b, B:275:0x08a6, B:277:0x08ac, B:279:0x08db, B:280:0x08eb, B:282:0x08f3, B:283:0x08f7, B:285:0x0900, B:294:0x0941, B:296:0x0947, B:299:0x0963, B:288:0x090d, B:290:0x092b, B:298:0x094b, B:268:0x0879, B:270:0x0883, B:205:0x0695, B:207:0x06a7, B:209:0x06ab, B:211:0x06b6, B:212:0x06c1, B:214:0x06d3, B:216:0x06d7, B:218:0x06dd, B:220:0x06ed, B:222:0x06ff, B:226:0x0736, B:223:0x0719, B:225:0x071f, B:188:0x0637, B:190:0x0641, B:192:0x0649, B:151:0x053a, B:85:0x0244, B:86:0x0263, B:91:0x028f, B:90:0x027e, B:77:0x0205, B:68:0x01bd, B:69:0x01da), top: B:307:0x013c, inners: #0, #2 }] */
    /* JADX INFO: renamed from: I */
    public final void m10661I(C4625p c4625p, C4480ca c4480ca) throws Throwable {
        int i;
        C4577l c4577lM10635a;
        boolean z;
        C4734y9 c4734y9M10565Y;
        long jLongValue;
        boolean z2;
        C4517g c4517gM10663K;
        C4734y9 c4734y9;
        C4734y9 c4734y10;
        C4474c4 c4474c4M10560T;
        C4625p c4625pM10820a = c4625p;
        C2622l.m5374h(c4480ca);
        C2622l.m5359e(c4480ca.f23798f);
        long jNanoTime = System.nanoTime();
        m10673U();
        m10668P();
        String str = c4480ca.f23798f;
        m10666N();
        if (C4679t9.m10790O(c4625p, c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            boolean z3 = true;
            if (m10660H().m10735x(str, c4625pM10820a.f24249f)) {
                this.f24201k.mo10684l().m10742A().m10813c("Dropping blacklisted event. appId", C4662s3.m10738s(str), this.f24201k.m10838u().m10718u(c4625pM10820a.f24249f));
                if (!m10660H().m10728C(str) && !m10660H().m10729D(str)) {
                    z3 = false;
                }
                if (!z3 && !"_err".equals(c4625pM10820a.f24249f)) {
                    this.f24201k.m10837t().m10885S(this.f24191A, str, 11, "_ev", c4625pM10820a.f24249f, 0);
                }
                if (!z3 || (c4474c4M10560T = m10663K().m10560T(str)) == null || Math.abs(this.f24201k.mo10682j().mo5623c() - Math.max(c4474c4M10560T.m10451W(), c4474c4M10560T.m10450V())) <= C4647r.f24387z.m10638a(null).longValue()) {
                    return;
                }
                this.f24201k.mo10684l().m10744C().m10811a("Fetching config for blacklisted app");
                m10681i(c4474c4M10560T);
                return;
            }
            if (C4433z8.m10348a() && this.f24201k.m10827a().m10417k(C4647r.f24382w0)) {
                C4706w3 c4706w3M10819b = C4706w3.m10819b(c4625p);
                this.f24201k.m10837t().m10883Q(c4706w3M10819b, this.f24201k.m10827a().m10415h(str));
                c4625pM10820a = c4706w3M10819b.m10820a();
            }
            if (this.f24201k.mo10684l().m10750x(2)) {
                this.f24201k.mo10684l().m10745D().m10812b("Logging event", this.f24201k.m10838u().m10717t(c4625pM10820a));
            }
            m10663K().m10568b0();
            try {
                m10659G(c4480ca);
                boolean z4 = "ecommerce_purchase".equals(c4625pM10820a.f24249f) || "purchase".equals(c4625pM10820a.f24249f) || "refund".equals(c4625pM10820a.f24249f);
                if ("_iap".equals(c4625pM10820a.f24249f) || z4) {
                    String strM10705N = c4625pM10820a.f24250g.m10705N("currency");
                    if (z4) {
                        double dDoubleValue = c4625pM10820a.f24250g.m10704M("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = c4625pM10820a.f24250g.m10703L("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            this.f24201k.mo10684l().m10742A().m10813c("Data lost. Currency value is too big. appId", C4662s3.m10738s(str), Double.valueOf(dDoubleValue));
                            jNanoTime = jNanoTime;
                            i = 0;
                            z2 = false;
                        } else {
                            jLongValue = Math.round(dDoubleValue);
                            if ("refund".equals(c4625pM10820a.f24249f)) {
                                jLongValue = -jLongValue;
                            }
                        }
                        if (!z2) {
                            m10663K().m10578s();
                            m10663K().m10571e0();
                            return;
                        }
                    } else {
                        jLongValue = c4625pM10820a.f24250g.m10703L("value").longValue();
                    }
                    if (TextUtils.isEmpty(strM10705N)) {
                        jNanoTime = jNanoTime;
                        i = 0;
                        z2 = true;
                        if (!z2) {
                            m10663K().m10578s();
                            m10663K().m10571e0();
                            return;
                        }
                    } else {
                        String upperCase = strM10705N.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String strConcat = upperCase.length() != 0 ? "_ltv_".concat(upperCase) : new String("_ltv_");
                            C4734y9 c4734y9M10565Y2 = m10663K().m10565Y(str, strConcat);
                            if (c4734y9M10565Y2 != null) {
                                Object obj = c4734y9M10565Y2.f24614e;
                                if (obj instanceof Long) {
                                    i = 0;
                                    c4734y9 = new C4734y9(str, c4625pM10820a.f24251h, strConcat, this.f24201k.mo10682j().mo5623c(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                } else {
                                    i = 0;
                                    c4517gM10663K = m10663K();
                                    int iM10419q = this.f24201k.m10827a().m10419q(str, C4647r.f24304E) - 1;
                                    C2622l.m5359e(str);
                                    c4517gM10663K.mo10381b();
                                    c4517gM10663K.m10642i();
                                    try {
                                        c4517gM10663K.m10579t().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(iM10419q)});
                                    } catch (SQLiteException e) {
                                        c4517gM10663K.mo10684l().m10751z().m10813c("Error pruning currencies. appId", C4662s3.m10738s(str), e);
                                    }
                                    c4734y9 = new C4734y9(str, c4625pM10820a.f24251h, strConcat, this.f24201k.mo10682j().mo5623c(), Long.valueOf(jLongValue));
                                }
                                c4734y10 = c4734y9;
                                if (!m10663K().m10553M(c4734y10)) {
                                    this.f24201k.mo10684l().m10751z().m10814d("Too many unique user properties are set. Ignoring user property. appId", C4662s3.m10738s(str), this.f24201k.m10838u().m10721y(c4734y10.f24612c), c4734y10.f24614e);
                                    this.f24201k.m10837t().m10885S(this.f24191A, str, 9, null, null, 0);
                                }
                            } else {
                                i = 0;
                                c4517gM10663K = m10663K();
                                int iM10419q2 = this.f24201k.m10827a().m10419q(str, C4647r.f24304E) - 1;
                                C2622l.m5359e(str);
                                c4517gM10663K.mo10381b();
                                c4517gM10663K.m10642i();
                                c4517gM10663K.m10579t().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(iM10419q2)});
                                c4734y9 = new C4734y9(str, c4625pM10820a.f24251h, strConcat, this.f24201k.mo10682j().mo5623c(), Long.valueOf(jLongValue));
                                c4734y10 = c4734y9;
                                if (!m10663K().m10553M(c4734y10)) {
                                    this.f24201k.mo10684l().m10751z().m10814d("Too many unique user properties are set. Ignoring user property. appId", C4662s3.m10738s(str), this.f24201k.m10838u().m10721y(c4734y10.f24612c), c4734y10.f24614e);
                                    this.f24201k.m10837t().m10885S(this.f24191A, str, 9, null, null, 0);
                                }
                            }
                        } else {
                            jNanoTime = jNanoTime;
                            i = 0;
                        }
                        z2 = true;
                        if (!z2) {
                            m10663K().m10578s();
                            m10663K().m10571e0();
                            return;
                        }
                    }
                } else {
                    jNanoTime = jNanoTime;
                    i = 0;
                }
                boolean zM10857X = C4723x9.m10857X(c4625pM10820a.f24249f);
                boolean zEquals = "_err".equals(c4625pM10820a.f24249f);
                this.f24201k.m10837t();
                C4505f c4505fM10583x = m10663K().m10583x(m10674V(), str, C4723x9.m10867v(c4625pM10820a.f24250g) + 1, true, zM10857X, false, zEquals, false);
                long jIntValue = c4505fM10583x.f23876b - ((long) C4647r.f24357k.m10638a(null).intValue());
                if (jIntValue > 0) {
                    if (jIntValue % 1000 == 1) {
                        this.f24201k.mo10684l().m10751z().m10813c("Data loss. Too many events logged. appId, count", C4662s3.m10738s(str), Long.valueOf(c4505fM10583x.f23876b));
                    }
                    m10663K().m10578s();
                    m10663K().m10571e0();
                    return;
                }
                if (zM10857X) {
                    long jIntValue2 = c4505fM10583x.f23875a - ((long) C4647r.f24361m.m10638a(null).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            this.f24201k.mo10684l().m10751z().m10813c("Data loss. Too many public events logged. appId, count", C4662s3.m10738s(str), Long.valueOf(c4505fM10583x.f23875a));
                        }
                        this.f24201k.m10837t().m10885S(this.f24191A, str, 16, "_ev", c4625pM10820a.f24249f, 0);
                        m10663K().m10578s();
                        m10663K().m10571e0();
                        return;
                    }
                }
                if (zEquals) {
                    long jMax = c4505fM10583x.f23878d - ((long) Math.max(i, Math.min(1000000, this.f24201k.m10827a().m10419q(c4480ca.f23798f, C4647r.f24359l))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            this.f24201k.mo10684l().m10751z().m10813c("Too many error events logged. appId, count", C4662s3.m10738s(str), Long.valueOf(c4505fM10583x.f23878d));
                        }
                        m10663K().m10578s();
                        m10663K().m10571e0();
                        return;
                    }
                }
                Bundle bundleM10702K = c4625pM10820a.f24250g.m10702K();
                this.f24201k.m10837t().m10875I(bundleM10702K, "_o", c4625pM10820a.f24251h);
                if (this.f24201k.m10837t().m10900s0(str)) {
                    this.f24201k.m10837t().m10875I(bundleM10702K, "_dbg", 1L);
                    this.f24201k.m10837t().m10875I(bundleM10702K, "_r", 1L);
                }
                if ("_s".equals(c4625pM10820a.f24249f) && (c4734y9M10565Y = m10663K().m10565Y(c4480ca.f23798f, "_sno")) != null && (c4734y9M10565Y.f24614e instanceof Long)) {
                    this.f24201k.m10837t().m10875I(bundleM10702K, "_sno", c4734y9M10565Y.f24614e);
                }
                long jM10564X = m10663K().m10564X(str);
                if (jM10564X > 0) {
                    this.f24201k.mo10684l().m10742A().m10813c("Data lost. Too many events stored on disk, deleted. appId", C4662s3.m10738s(str), Long.valueOf(jM10564X));
                }
                C4589m c4589m = new C4589m(this.f24201k, c4625pM10820a.f24251h, str, c4625pM10820a.f24249f, c4625pM10820a.f24252i, 0L, bundleM10702K);
                C4577l c4577lM10585z = m10663K().m10585z(str, c4589m.f24135b);
                if (c4577lM10585z != null) {
                    c4589m = c4589m.m10647a(this.f24201k, c4577lM10585z.f24093f);
                    c4577lM10635a = c4577lM10585z.m10635a(c4589m.f24137d);
                } else {
                    if (m10663K().m10572f0(str) >= this.f24201k.m10827a().m10418p(str) && zM10857X) {
                        this.f24201k.mo10684l().m10751z().m10814d("Too many event names used, ignoring event. appId, name, supported count", C4662s3.m10738s(str), this.f24201k.m10838u().m10718u(c4589m.f24135b), Integer.valueOf(this.f24201k.m10827a().m10418p(str)));
                        this.f24201k.m10837t().m10885S(this.f24191A, str, 8, null, null, 0);
                        m10663K().m10571e0();
                        return;
                    }
                    c4577lM10635a = new C4577l(str, c4589m.f24135b, c4589m.f24137d);
                }
                m10663K().m10548H(c4577lM10635a);
                m10673U();
                m10668P();
                C2622l.m5374h(c4589m);
                C2622l.m5374h(c4480ca);
                C2622l.m5359e(c4589m.f24134a);
                C2622l.m5339a(c4589m.f24134a.equals(c4480ca.f23798f));
                C4179h1.a aVarM9684s0 = C4179h1.m9684s0();
                aVarM9684s0.m9810v();
                aVarM9684s0.m9768E("android");
                if (!TextUtils.isEmpty(c4480ca.f23798f)) {
                    aVarM9684s0.m9792d0(c4480ca.f23798f);
                }
                if (!TextUtils.isEmpty(c4480ca.f23801i)) {
                    aVarM9684s0.m9788Z(c4480ca.f23801i);
                }
                if (!TextUtils.isEmpty(c4480ca.f23800h)) {
                    aVarM9684s0.m9795g0(c4480ca.f23800h);
                }
                long j2 = c4480ca.f23807o;
                if (j2 != -2147483648L) {
                    aVarM9684s0.m9797i0((int) j2);
                }
                aVarM9684s0.m9791c0(c4480ca.f23802j);
                if (!TextUtils.isEmpty(c4480ca.f23799g)) {
                    aVarM9684s0.m9807s0(c4480ca.f23799g);
                }
                if (C4145e9.m9566a() && this.f24201k.m10827a().m10417k(C4647r.f24315J0)) {
                    aVarM9684s0.m9766C0(m10676a(c4480ca.f23798f).m10491h(C4481d.m10484b(c4480ca.f23797B)).m10489d());
                }
                if (C4286oa.m10122a() && this.f24201k.m10827a().m10424v(c4480ca.f23798f, C4647r.f24356j0)) {
                    if (TextUtils.isEmpty(aVarM9684s0.m9817y0()) && !TextUtils.isEmpty(c4480ca.f23796A)) {
                        aVarM9684s0.m9763A0(c4480ca.f23796A);
                    }
                    if (TextUtils.isEmpty(aVarM9684s0.m9817y0()) && TextUtils.isEmpty(aVarM9684s0.m9767D0()) && !TextUtils.isEmpty(c4480ca.f23815w)) {
                        aVarM9684s0.m9815x0(c4480ca.f23815w);
                    }
                } else if (TextUtils.isEmpty(aVarM9684s0.m9817y0()) && !TextUtils.isEmpty(c4480ca.f23815w)) {
                    aVarM9684s0.m9815x0(c4480ca.f23815w);
                }
                long j3 = c4480ca.f23803k;
                if (j3 != 0) {
                    aVarM9684s0.m9798j0(j3);
                }
                aVarM9684s0.m9806r0(c4480ca.f23817y);
                List<Integer> listM10805U = m10666N().m10805U();
                if (listM10805U != null) {
                    aVarM9684s0.m9781S(listM10805U);
                }
                C4481d c4481dM10491h = m10676a(c4480ca.f23798f).m10491h(C4481d.m10484b(c4480ca.f23797B));
                if (!C4145e9.m9566a() || !this.f24201k.m10827a().m10417k(C4647r.f24315J0) || c4481dM10491h.m10492j()) {
                    Pair<String, Boolean> pairM10779s = this.f24200j.m10779s(c4480ca.f23798f, c4481dM10491h);
                    if (TextUtils.isEmpty((CharSequence) pairM10779s.first)) {
                        if (!this.f24201k.m10842y().m10605s(this.f24201k.mo10685m()) && c4480ca.f23813u && (!C4343sb.m10219a() || !this.f24201k.m10827a().m10424v(c4480ca.f23798f, C4647r.f24309G0))) {
                            String string = Settings.Secure.getString(this.f24201k.mo10685m().getContentResolver(), "android_id");
                            if (string == null) {
                                this.f24201k.mo10684l().m10742A().m10812b("null secure ID. appId", C4662s3.m10738s(aVarM9684s0.m9805q0()));
                                string = "null";
                            } else if (string.isEmpty()) {
                                this.f24201k.mo10684l().m10742A().m10812b("empty secure ID. appId", C4662s3.m10738s(aVarM9684s0.m9805q0()));
                            }
                            aVarM9684s0.m9809u0(string);
                        }
                    } else if (c4480ca.f23812t) {
                        aVarM9684s0.m9799k0((String) pairM10779s.first);
                        Object obj2 = pairM10779s.second;
                        if (obj2 != null) {
                            aVarM9684s0.m9769F(((Boolean) obj2).booleanValue());
                        }
                    }
                }
                this.f24201k.m10842y().m10763k();
                aVarM9684s0.m9779Q(Build.MODEL);
                this.f24201k.m10842y().m10763k();
                aVarM9684s0.m9774L(Build.VERSION.RELEASE);
                aVarM9684s0.m9790b0((int) this.f24201k.m10842y().m10606t());
                aVarM9684s0.m9782T(this.f24201k.m10842y().m10607u());
                if (!this.f24201k.m10827a().m10417k(C4647r.f24386y0)) {
                    aVarM9684s0.m9803o0(c4480ca.f23809q);
                }
                if (this.f24201k.m10828d()) {
                    if (C4145e9.m9566a() && this.f24201k.m10827a().m10417k(C4647r.f24315J0)) {
                        aVarM9684s0.m9805q0();
                    } else {
                        aVarM9684s0.m9805q0();
                    }
                    if (!TextUtils.isEmpty(null)) {
                        aVarM9684s0.m9813w0();
                        throw null;
                    }
                }
                C4474c4 c4474c4M10560T2 = m10663K().m10560T(c4480ca.f23798f);
                if (c4474c4M10560T2 == null) {
                    c4474c4M10560T2 = new C4474c4(this.f24201k, c4480ca.f23798f);
                    if (C4145e9.m9566a() && this.f24201k.m10827a().m10417k(C4647r.f24315J0)) {
                        c4474c4M10560T2.m10455c(m10677c(c4481dM10491h));
                    } else {
                        c4474c4M10560T2.m10455c(m10675W());
                    }
                    c4474c4M10560T2.m10429A(c4480ca.f23808p);
                    c4474c4M10560T2.m10465m(c4480ca.f23799g);
                    if (!C4145e9.m9566a() || !this.f24201k.m10827a().m10417k(C4647r.f24315J0) || c4481dM10491h.m10492j()) {
                        c4474c4M10560T2.m10476x(this.f24200j.m10780t(c4480ca.f23798f));
                    }
                    c4474c4M10560T2.m10431C(0L);
                    c4474c4M10560T2.m10453a(0L);
                    c4474c4M10560T2.m10464l(0L);
                    c4474c4M10560T2.m10432D(c4480ca.f23800h);
                    c4474c4M10560T2.m10468p(c4480ca.f23807o);
                    c4474c4M10560T2.m10435G(c4480ca.f23801i);
                    c4474c4M10560T2.m10472t(c4480ca.f23802j);
                    c4474c4M10560T2.m10475w(c4480ca.f23803k);
                    c4474c4M10560T2.m10457e(c4480ca.f23805m);
                    if (!this.f24201k.m10827a().m10417k(C4647r.f24386y0)) {
                        c4474c4M10560T2.m10446R(c4480ca.f23809q);
                    }
                    c4474c4M10560T2.m10478z(c4480ca.f23817y);
                    m10663K().m10549I(c4474c4M10560T2);
                }
                if ((!C4145e9.m9566a() || !this.f24201k.m10827a().m10417k(C4647r.f24315J0) || c4481dM10491h.m10493k()) && !TextUtils.isEmpty(c4474c4M10560T2.m10471s())) {
                    aVarM9684s0.m9802n0(c4474c4M10560T2.m10471s());
                }
                if (!TextUtils.isEmpty(c4474c4M10560T2.m10436H())) {
                    aVarM9684s0.m9808t0(c4474c4M10560T2.m10436H());
                }
                List<C4734y9> listM10544C = m10663K().m10544C(c4480ca.f23798f);
                for (int i2 = 0; i2 < listM10544C.size(); i2++) {
                    C4235l1.a aVarM9923J = C4235l1.m9923J();
                    aVarM9923J.m9941w(listM10544C.get(i2).f24612c);
                    aVarM9923J.m9940v(listM10544C.get(i2).f24613d);
                    m10666N().m10799G(aVarM9923J, listM10544C.get(i2).f24614e);
                    aVarM9684s0.m9818z(aVarM9923J);
                }
                try {
                    long jM10581v = m10663K().m10581v((C4179h1) ((AbstractC4099b5) aVarM9684s0.m9433t()));
                    C4517g c4517gM10663K2 = m10663K();
                    C4613o c4613o = c4589m.f24139f;
                    if (c4613o != null) {
                        Iterator<String> it = c4613o.iterator();
                        while (true) {
                            C4601n c4601n = (C4601n) it;
                            if (!c4601n.hasNext()) {
                                z = m10660H().m10736y(c4589m.f24134a, c4589m.f24135b) && m10663K().m10584y(m10674V(), c4589m.f24134a, false, false).f23879e < ((long) this.f24201k.m10827a().m10421s(c4589m.f24134a));
                            } else if ("_r".equals((String) c4601n.next())) {
                            }
                        }
                    }
                    if (c4517gM10663K2.m10552L(c4589m, jM10581v, z)) {
                        this.f24204n = 0L;
                    }
                } catch (IOException e2) {
                    this.f24201k.mo10684l().m10751z().m10813c("Data loss. Failed to insert raw event metadata. appId", C4662s3.m10738s(aVarM9684s0.m9805q0()), e2);
                }
                m10663K().m10578s();
                m10663K().m10571e0();
                m10695w();
                this.f24201k.mo10684l().m10745D().m10812b("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
            } catch (Throwable th) {
                m10663K().m10571e0();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final C4739z3 m10662J() {
        m10650C(this.f24193c);
        return this.f24193c;
    }

    /* JADX INFO: renamed from: K */
    public final C4517g m10663K() {
        m10650C(this.f24194d);
        return this.f24194d;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m10664L(C4480ca c4480ca) {
        if (C4286oa.m10122a() && this.f24201k.f24534h.m10423u(c4480ca.f23798f, C4647r.f24356j0)) {
            return (TextUtils.isEmpty(c4480ca.f23799g) && TextUtils.isEmpty(c4480ca.f23796A) && TextUtils.isEmpty(c4480ca.f23815w)) ? false : true;
        }
        return (TextUtils.isEmpty(c4480ca.f23799g) && TextUtils.isEmpty(c4480ca.f23815w)) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public final C4528ga m10665M() {
        m10650C(this.f24197g);
        return this.f24197g;
    }

    /* JADX INFO: renamed from: N */
    public final C4679t9 m10666N() {
        m10650C(this.f24198h);
        return this.f24198h;
    }

    /* JADX INFO: renamed from: O */
    public final C4640q3 m10667O() {
        return this.f24201k.m10838u();
    }

    /* JADX INFO: renamed from: P */
    public final void m10668P() {
        if (!this.f24202l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m10669Q() {
        C4474c4 c4474c4M10560T;
        String strM9711H;
        m10673U();
        m10668P();
        this.f24210t = true;
        try {
            Boolean bool = this.f24201k.m10841x().f24456e;
            if (bool == null) {
                this.f24201k.mo10684l().f24421i.m10811a("Upload data called on the client side before use of service was decided");
                this.f24210t = false;
                m10696x();
                return;
            }
            if (bool.booleanValue()) {
                this.f24201k.mo10684l().f24418f.m10811a("Upload called in the client side when service should be used");
                this.f24210t = false;
                m10696x();
                return;
            }
            if (this.f24204n > 0) {
                m10695w();
                this.f24210t = false;
                m10696x();
                return;
            }
            m10673U();
            if (this.f24213w != null) {
                this.f24201k.mo10684l().f24426n.m10811a("Uploading requested multiple times");
                this.f24210t = false;
                m10696x();
                return;
            }
            if (!m10662J().m10913u()) {
                this.f24201k.mo10684l().f24426n.m10811a("Network not connected, ignoring upload request");
                m10695w();
                this.f24210t = false;
                m10696x();
                return;
            }
            long jMo5623c = this.f24201k.f24541o.mo5623c();
            int iM10419q = this.f24201k.f24534h.m10419q(null, C4647r.f24327Q);
            long jLongValue = jMo5623c - C4647r.f24343d.m10638a(null).longValue();
            for (int i = 0; i < iM10419q && m10692t(jLongValue); i++) {
            }
            long jM10610a = this.f24201k.m10834k().f23891f.m10610a();
            if (jM10610a != 0) {
                this.f24201k.mo10684l().f24425m.m10812b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jMo5623c - jM10610a)));
            }
            String strM10580u = m10663K().m10580u();
            if (TextUtils.isEmpty(strM10580u)) {
                this.f24215y = -1L;
                String strM10543B = m10663K().m10543B(jMo5623c - C4647r.f24343d.m10638a(null).longValue());
                if (!TextUtils.isEmpty(strM10543B) && (c4474c4M10560T = m10663K().m10560T(strM10543B)) != null) {
                    m10681i(c4474c4M10560T);
                }
            } else {
                if (this.f24215y == -1) {
                    this.f24215y = m10663K().m10576j0();
                }
                List<Pair<C4179h1, Long>> listM10545D = m10663K().m10545D(strM10580u, this.f24201k.f24534h.m10419q(strM10580u, C4647r.f24349g), Math.max(0, this.f24201k.f24534h.m10419q(strM10580u, C4647r.f24351h)));
                if (!listM10545D.isEmpty()) {
                    if (!C4145e9.m9566a() || !this.f24201k.f24534h.m10417k(C4647r.f24315J0) || m10676a(strM10580u).m10492j()) {
                        Iterator<Pair<C4179h1, Long>> it = listM10545D.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strM9711H = null;
                                break;
                            }
                            C4179h1 c4179h1 = (C4179h1) it.next().first;
                            if (!TextUtils.isEmpty(c4179h1.m9711H())) {
                                strM9711H = c4179h1.m9711H();
                                break;
                            }
                        }
                        if (strM9711H != null) {
                            for (int i2 = 0; i2 < listM10545D.size(); i2++) {
                                C4179h1 c4179h2 = (C4179h1) listM10545D.get(i2).first;
                                if (!TextUtils.isEmpty(c4179h2.m9711H()) && !c4179h2.m9711H().equals(strM9711H)) {
                                    listM10545D = listM10545D.subList(0, i2);
                                    break;
                                }
                            }
                        }
                    }
                    C4165g1.a aVarM9627v = C4165g1.m9627v();
                    int size = listM10545D.size();
                    ArrayList arrayList = new ArrayList(listM10545D.size());
                    boolean z = "1".equals(this.f24201k.f24534h.f23743c.mo10379d(strM10580u, "gaia_collection_enabled")) && !(C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !m10676a(strM10580u).m10492j());
                    boolean z2 = (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !m10676a(strM10580u).m10492j()) ? false : true;
                    boolean z3 = (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !m10676a(strM10580u).m10493k()) ? false : true;
                    int i3 = 0;
                    while (i3 < size) {
                        C4179h1.a aVarM9423r = ((C4179h1) listM10545D.get(i3).first).m9423r();
                        arrayList.add((Long) listM10545D.get(i3).second);
                        ArrayList arrayList2 = arrayList;
                        if (aVarM9423r.f23087h) {
                            aVarM9423r.m9431r();
                            aVarM9423r.f23087h = false;
                        }
                        C4179h1.m9663V0((C4179h1) aVarM9423r.f23086g, 33025L);
                        if (aVarM9423r.f23087h) {
                            aVarM9423r.m9431r();
                            aVarM9423r.f23087h = false;
                        }
                        C4179h1.m9690w((C4179h1) aVarM9423r.f23086g, jMo5623c);
                        if (aVarM9423r.f23087h) {
                            aVarM9423r.m9431r();
                            aVarM9423r.f23087h = false;
                        }
                        C4179h1.m9678k0((C4179h1) aVarM9423r.f23086g, false);
                        if (!z) {
                            if (aVarM9423r.f23087h) {
                                aVarM9423r.m9431r();
                                aVarM9423r.f23087h = false;
                            }
                            C4179h1.m9673h1((C4179h1) aVarM9423r.f23086g);
                        }
                        if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                            if (!z2) {
                                if (aVarM9423r.f23087h) {
                                    aVarM9423r.m9431r();
                                    aVarM9423r.f23087h = false;
                                }
                                C4179h1.m9647D0((C4179h1) aVarM9423r.f23086g);
                                if (aVarM9423r.f23087h) {
                                    aVarM9423r.m9431r();
                                    aVarM9423r.f23087h = false;
                                }
                                C4179h1.m9653K0((C4179h1) aVarM9423r.f23086g);
                            }
                            if (!z3) {
                                if (aVarM9423r.f23087h) {
                                    aVarM9423r.m9431r();
                                    aVarM9423r.f23087h = false;
                                }
                                C4179h1.m9657P0((C4179h1) aVarM9423r.f23086g);
                            }
                        }
                        if (this.f24201k.f24534h.m10423u(strM10580u, C4647r.f24334X)) {
                            long jM10806t = m10666N().m10806t(((C4179h1) ((AbstractC4099b5) aVarM9423r.m9433t())).m10139f());
                            if (aVarM9423r.f23087h) {
                                aVarM9423r.m9431r();
                                aVarM9423r.f23087h = false;
                            }
                            C4179h1.m9681o1((C4179h1) aVarM9423r.f23086g, jM10806t);
                        }
                        aVarM9627v.m9631v(aVarM9423r);
                        i3++;
                        arrayList = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList;
                    String strM10810z = this.f24201k.mo10684l().m10750x(2) ? m10666N().m10810z((C4165g1) ((AbstractC4099b5) aVarM9627v.m9433t())) : null;
                    m10666N();
                    byte[] bArrM10139f = ((C4165g1) ((AbstractC4099b5) aVarM9627v.m9433t())).m10139f();
                    String strM10638a = C4647r.f24369q.m10638a(null);
                    try {
                        URL url = new URL(strM10638a);
                        C2622l.m5339a(!arrayList3.isEmpty());
                        if (this.f24213w != null) {
                            this.f24201k.mo10684l().f24418f.m10811a("Set uploading progress before finishing the previous upload");
                        } else {
                            this.f24213w = new ArrayList(arrayList3);
                        }
                        this.f24201k.m10834k().f23892g.m10611b(jMo5623c);
                        this.f24201k.mo10684l().f24426n.m10814d("Uploading data. app, uncompressed size, data", size > 0 ? ((C4165g1) aVarM9627v.f23086g).m9629s().m9708F1() : "?", Integer.valueOf(bArrM10139f.length), strM10810z);
                        this.f24209s = true;
                        C4739z3 c4739z3M10662J = m10662J();
                        C4635p9 c4635p9 = new C4635p9(this, strM10580u);
                        c4739z3M10662J.mo10381b();
                        c4739z3M10662J.m10642i();
                        c4739z3M10662J.mo10686n().m10760x(new RunnableC4498e4(c4739z3M10662J, strM10580u, url, bArrM10139f, null, c4635p9));
                    } catch (MalformedURLException unused) {
                        this.f24201k.mo10684l().f24418f.m10813c("Failed to parse upload URL. Not uploading. appId", C4662s3.m10738s(strM10580u), strM10638a);
                    }
                }
            }
            this.f24210t = false;
            m10696x();
        } catch (Throwable th) {
            this.f24210t = false;
            m10696x();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: R */
    public final void m10670R() {
        boolean z;
        FileChannel fileChannel;
        int i;
        int i2;
        FileChannel fileChannel2;
        FileLock fileLock;
        m10673U();
        m10668P();
        if (this.f24203m) {
            return;
        }
        boolean z2 = true;
        this.f24203m = true;
        m10673U();
        if (this.f24201k.f24534h.m10417k(C4647r.f24354i0) && (fileLock = this.f24211u) != null && fileLock.isValid()) {
            this.f24201k.mo10684l().f24426n.m10811a("Storage concurrent access okay");
        } else {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f24201k.f24528b.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f24212v = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f24211u = fileLockTryLock;
                if (fileLockTryLock == null) {
                    this.f24201k.mo10684l().f24418f.m10811a("Storage concurrent data access panic");
                    z = false;
                    if (z) {
                        fileChannel = this.f24212v;
                        m10673U();
                        if (fileChannel == null && fileChannel.isOpen()) {
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                            try {
                                fileChannel.position(0L);
                                int i3 = fileChannel.read(byteBufferAllocate);
                                if (i3 == 4) {
                                    byteBufferAllocate.flip();
                                    i = byteBufferAllocate.getInt();
                                } else if (i3 != -1) {
                                    this.f24201k.mo10684l().f24421i.m10812b("Unexpected data length. Bytes read", Integer.valueOf(i3));
                                }
                            } catch (IOException e) {
                                this.f24201k.mo10684l().f24418f.m10812b("Failed to read from channel", e);
                            }
                            C4629p3 c4629p3M10843z = this.f24201k.m10843z();
                            c4629p3M10843z.m10479t();
                            i2 = c4629p3M10843z.f24258e;
                            m10673U();
                            if (i > i2) {
                                this.f24201k.mo10684l().f24418f.m10813c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                                return;
                            }
                            if (i < i2) {
                                fileChannel2 = this.f24212v;
                                m10673U();
                                if (fileChannel2 == null && fileChannel2.isOpen()) {
                                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                                    byteBufferAllocate2.putInt(i2);
                                    byteBufferAllocate2.flip();
                                    try {
                                        fileChannel2.truncate(0L);
                                        this.f24201k.f24534h.m10417k(C4647r.f24374s0);
                                        fileChannel2.write(byteBufferAllocate2);
                                        fileChannel2.force(true);
                                        if (fileChannel2.size() != 4) {
                                            this.f24201k.mo10684l().f24418f.m10812b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                                        }
                                    } catch (IOException e2) {
                                        this.f24201k.mo10684l().f24418f.m10812b("Failed to write to channel", e2);
                                        z2 = false;
                                    }
                                    if (z2) {
                                        this.f24201k.mo10684l().f24426n.m10813c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                                    } else {
                                        this.f24201k.mo10684l().f24418f.m10813c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                                    }
                                }
                                this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                                z2 = false;
                                if (z2) {
                                    this.f24201k.mo10684l().f24426n.m10813c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                                } else {
                                    this.f24201k.mo10684l().f24418f.m10813c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                                }
                            }
                        }
                        this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                        i = 0;
                        C4629p3 c4629p3M10843z2 = this.f24201k.m10843z();
                        c4629p3M10843z2.m10479t();
                        i2 = c4629p3M10843z2.f24258e;
                        m10673U();
                        if (i > i2) {
                            this.f24201k.mo10684l().f24418f.m10813c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                            return;
                        }
                        if (i < i2) {
                            fileChannel2 = this.f24212v;
                            m10673U();
                            if (fileChannel2 == null) {
                                this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                                z2 = false;
                            } else {
                                this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                                z2 = false;
                            }
                            if (z2) {
                                this.f24201k.mo10684l().f24426n.m10813c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                            } else {
                                this.f24201k.mo10684l().f24418f.m10813c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                            }
                        }
                    }
                }
                this.f24201k.mo10684l().f24426n.m10811a("Storage concurrent access okay");
            } catch (FileNotFoundException e3) {
                this.f24201k.mo10684l().f24418f.m10812b("Failed to acquire storage lock", e3);
            } catch (IOException e4) {
                this.f24201k.mo10684l().f24418f.m10812b("Failed to access storage lock file", e4);
            } catch (OverlappingFileLockException e5) {
                this.f24201k.mo10684l().f24421i.m10812b("Storage lock already acquired", e5);
            }
        }
        z = true;
        if (z) {
            fileChannel = this.f24212v;
            m10673U();
            if (fileChannel == null) {
                this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                i = 0;
            } else {
                this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                i = 0;
            }
            C4629p3 c4629p3M10843z3 = this.f24201k.m10843z();
            c4629p3M10843z3.m10479t();
            i2 = c4629p3M10843z3.f24258e;
            m10673U();
            if (i > i2) {
                this.f24201k.mo10684l().f24418f.m10813c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            if (i < i2) {
                fileChannel2 = this.f24212v;
                m10673U();
                if (fileChannel2 == null) {
                    this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                    z2 = false;
                } else {
                    this.f24201k.mo10684l().f24418f.m10811a("Bad channel to read from");
                    z2 = false;
                }
                if (z2) {
                    this.f24201k.mo10684l().f24426n.m10813c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    this.f24201k.mo10684l().f24418f.m10813c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final C4486d4 m10671S() {
        C4486d4 c4486d4 = this.f24195e;
        if (c4486d4 != null) {
            return c4486d4;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX INFO: renamed from: T */
    public final C4575k9 m10672T() {
        m10650C(this.f24196f);
        return this.f24196f;
    }

    /* JADX INFO: renamed from: U */
    public final void m10673U() {
        this.f24201k.mo10686n().mo10381b();
    }

    /* JADX INFO: renamed from: V */
    public final long m10674V() {
        long jMo5623c = this.f24201k.f24541o.mo5623c();
        C4510f4 c4510f4M10834k = this.f24201k.m10834k();
        c4510f4M10834k.m10763k();
        c4510f4M10834k.mo10381b();
        long jM10610a = c4510f4M10834k.f23895j.m10610a();
        if (jM10610a == 0) {
            jM10610a = 1 + ((long) c4510f4M10834k.m10817f().m10904v0().nextInt(86400000));
            c4510f4M10834k.f23895j.m10611b(jM10610a);
        }
        return ((((jMo5623c + jM10610a) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    /* JADX INFO: renamed from: W */
    public final String m10675W() {
        byte[] bArr = new byte[16];
        this.f24201k.m10837t().m10904v0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: a */
    public final C4481d m10676a(String str) {
        String string;
        C4481d c4481d = C4481d.f23819a;
        if (!C4145e9.m9566a() || !this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
            return c4481d;
        }
        m10673U();
        m10668P();
        C4481d c4481d2 = this.f24216z.get(str);
        if (c4481d2 != null) {
            return c4481d2;
        }
        C4517g c4517gM10663K = m10663K();
        Objects.requireNonNull(c4517gM10663K);
        Objects.requireNonNull(str, "null reference");
        c4517gM10663K.mo10381b();
        c4517gM10663K.m10642i();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c4517gM10663K.m10579t().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                C4481d c4481dM10484b = C4481d.m10484b(string);
                m10691s(str, c4481dM10484b);
                return c4481dM10484b;
            } catch (SQLiteException e) {
                c4517gM10663K.mo10684l().f24418f.m10813c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m10677c(C4481d c4481d) {
        if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0) && !c4481d.m10493k()) {
            return null;
        }
        return m10675W();
    }

    /* JADX INFO: renamed from: f */
    public final void m10678f(C4179h1.a aVar, long j2, boolean z) throws Throwable {
        C4734y9 c4734y9;
        boolean z2;
        String str = z ? "_se" : "_lte";
        C4734y9 c4734y9M10565Y = m10663K().m10565Y(aVar.m9805q0(), str);
        if (c4734y9M10565Y == null || c4734y9M10565Y.f24614e == null) {
            c4734y9 = new C4734y9(aVar.m9805q0(), "auto", str, this.f24201k.f24541o.mo5623c(), Long.valueOf(j2));
        } else {
            c4734y9 = new C4734y9(aVar.m9805q0(), "auto", str, this.f24201k.f24541o.mo5623c(), Long.valueOf(((Long) c4734y9M10565Y.f24614e).longValue() + j2));
        }
        C4235l1.a aVarM9923J = C4235l1.m9923J();
        aVarM9923J.m9941w(str);
        aVarM9923J.m9940v(this.f24201k.f24541o.mo5623c());
        aVarM9923J.m9942x(((Long) c4734y9.f24614e).longValue());
        C4235l1 c4235l1 = (C4235l1) ((AbstractC4099b5) aVarM9923J.m9433t());
        int iM10794s = C4679t9.m10794s(aVar, str);
        if (iM10794s >= 0) {
            if (aVar.f23087h) {
                aVar.m9431r();
                aVar.f23087h = false;
            }
            C4179h1.m9689v((C4179h1) aVar.f23086g, iM10794s, c4235l1);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (aVar.f23087h) {
                aVar.m9431r();
                aVar.f23087h = false;
            }
            C4179h1.m9694y((C4179h1) aVar.f23086g, c4235l1);
        }
        if (j2 > 0) {
            m10663K().m10553M(c4734y9);
            this.f24201k.mo10684l().f24426n.m10813c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", c4734y9.f24614e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10679g(C4625p c4625p, C4480ca c4480ca) throws Throwable {
        List<C4624oa> listM10547F;
        List<C4624oa> listM10547F2;
        List<C4624oa> listM10547F3;
        C4625p c4625p2 = c4625p;
        Objects.requireNonNull(c4480ca, "null reference");
        C2622l.m5359e(c4480ca.f23798f);
        m10673U();
        m10668P();
        String str = c4480ca.f23798f;
        long j2 = c4625p2.f24252i;
        m10666N();
        if (C4679t9.m10790O(c4625p, c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            List<String> list = c4480ca.f23818z;
            if (list != null) {
                if (!list.contains(c4625p2.f24249f)) {
                    this.f24201k.mo10684l().f24425m.m10814d("Dropping non-safelisted event. appId, event name, origin", str, c4625p2.f24249f, c4625p2.f24251h);
                    return;
                } else {
                    Bundle bundleM10702K = c4625p2.f24250g.m10702K();
                    bundleM10702K.putLong("ga_safelisted", 1L);
                    c4625p2 = new C4625p(c4625p2.f24249f, new C4613o(bundleM10702K), c4625p2.f24251h, c4625p2.f24252i);
                }
            }
            m10663K().m10568b0();
            try {
                C4517g c4517gM10663K = m10663K();
                C2622l.m5359e(str);
                c4517gM10663K.mo10381b();
                c4517gM10663K.m10642i();
                if (j2 < 0) {
                    c4517gM10663K.mo10684l().f24421i.m10813c("Invalid time querying timed out conditional properties", C4662s3.m10738s(str), Long.valueOf(j2));
                    listM10547F = Collections.emptyList();
                } else {
                    listM10547F = c4517gM10663K.m10547F("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (C4624oa c4624oa : listM10547F) {
                    if (c4624oa != null) {
                        this.f24201k.mo10684l().f24426n.m10814d("User property timed out", c4624oa.f24238f, this.f24201k.m10838u().m10721y(c4624oa.f24240h.f24562g), c4624oa.f24240h.m10847H());
                        if (c4624oa.f24244l != null) {
                            m10661I(new C4625p(c4624oa.f24244l, j2), c4480ca);
                        }
                        m10663K().m10567a0(str, c4624oa.f24240h.f24562g);
                    }
                }
                C4517g c4517gM10663K2 = m10663K();
                C2622l.m5359e(str);
                c4517gM10663K2.mo10381b();
                c4517gM10663K2.m10642i();
                if (j2 < 0) {
                    c4517gM10663K2.mo10684l().f24421i.m10813c("Invalid time querying expired conditional properties", C4662s3.m10738s(str), Long.valueOf(j2));
                    listM10547F2 = Collections.emptyList();
                } else {
                    listM10547F2 = c4517gM10663K2.m10547F("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listM10547F2.size());
                for (C4624oa c4624oa2 : listM10547F2) {
                    if (c4624oa2 != null) {
                        this.f24201k.mo10684l().f24426n.m10814d("User property expired", c4624oa2.f24238f, this.f24201k.m10838u().m10721y(c4624oa2.f24240h.f24562g), c4624oa2.f24240h.m10847H());
                        m10663K().m10562V(str, c4624oa2.f24240h.f24562g);
                        C4625p c4625p3 = c4624oa2.f24248p;
                        if (c4625p3 != null) {
                            arrayList.add(c4625p3);
                        }
                        m10663K().m10567a0(str, c4624oa2.f24240h.f24562g);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m10661I(new C4625p((C4625p) obj, j2), c4480ca);
                }
                C4517g c4517gM10663K3 = m10663K();
                String str2 = c4625p2.f24249f;
                C2622l.m5359e(str);
                C2622l.m5359e(str2);
                c4517gM10663K3.mo10381b();
                c4517gM10663K3.m10642i();
                if (j2 < 0) {
                    c4517gM10663K3.mo10684l().f24421i.m10814d("Invalid time querying triggered conditional properties", C4662s3.m10738s(str), c4517gM10663K3.m10816e().m10718u(str2), Long.valueOf(j2));
                    listM10547F3 = Collections.emptyList();
                } else {
                    listM10547F3 = c4517gM10663K3.m10547F("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listM10547F3.size());
                for (C4624oa c4624oa3 : listM10547F3) {
                    if (c4624oa3 != null) {
                        C4712w9 c4712w9 = c4624oa3.f24240h;
                        C4734y9 c4734y9 = new C4734y9(c4624oa3.f24238f, c4624oa3.f24239g, c4712w9.f24562g, j2, c4712w9.m10847H());
                        if (m10663K().m10553M(c4734y9)) {
                            this.f24201k.mo10684l().f24426n.m10814d("User property triggered", c4624oa3.f24238f, this.f24201k.m10838u().m10721y(c4734y9.f24612c), c4734y9.f24614e);
                        } else {
                            this.f24201k.mo10684l().f24418f.m10814d("Too many active user properties, ignoring", C4662s3.m10738s(c4624oa3.f24238f), this.f24201k.m10838u().m10721y(c4734y9.f24612c), c4734y9.f24614e);
                        }
                        C4625p c4625p4 = c4624oa3.f24246n;
                        if (c4625p4 != null) {
                            arrayList2.add(c4625p4);
                        }
                        c4624oa3.f24240h = new C4712w9(c4734y9);
                        c4624oa3.f24242j = true;
                        m10663K().m10554N(c4624oa3);
                    }
                }
                m10661I(c4625p2, c4480ca);
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    m10661I(new C4625p((C4625p) obj2, j2), c4480ca);
                }
                m10663K().m10578s();
            } finally {
                m10663K().m10571e0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
    /* JADX INFO: renamed from: h */
    public final void m10680h(C4625p c4625p, String str) throws Throwable {
        boolean z;
        String strM10489d;
        C4474c4 c4474c4M10560T = m10663K().m10560T(str);
        if (c4474c4M10560T == null || TextUtils.isEmpty(c4474c4M10560T.m10441M())) {
            this.f24201k.mo10684l().f24425m.m10812b("No app data available; dropping event", str);
            return;
        }
        Boolean boolM10698z = m10698z(c4474c4M10560T);
        if (boolM10698z == null) {
            if (!"_ui".equals(c4625p.f24249f)) {
                this.f24201k.mo10684l().f24421i.m10812b("Could not find package. appId", C4662s3.m10738s(str));
            }
        } else if (!boolM10698z.booleanValue()) {
            this.f24201k.mo10684l().f24418f.m10812b("App version does not match; dropping event. appId", C4662s3.m10738s(str));
            return;
        }
        String strM10474v = c4474c4M10560T.m10474v();
        String strM10441M = c4474c4M10560T.m10441M();
        long jM10442N = c4474c4M10560T.m10442N();
        String strM10443O = c4474c4M10560T.m10443O();
        long jM10444P = c4474c4M10560T.m10444P();
        long jM10445Q = c4474c4M10560T.m10445Q();
        boolean zM10448T = c4474c4M10560T.m10448T();
        String strM10436H = c4474c4M10560T.m10436H();
        long jM10459g = c4474c4M10560T.m10459g();
        boolean zM10460h = c4474c4M10560T.m10460h();
        boolean zM10461i = c4474c4M10560T.m10461i();
        String strM10477y = c4474c4M10560T.m10477y();
        Boolean boolM10462j = c4474c4M10560T.m10462j();
        long jM10447S = c4474c4M10560T.m10447S();
        List<String> listM10463k = c4474c4M10560T.m10463k();
        if (C4286oa.m10122a()) {
            z = zM10448T;
            String strM10430B = this.f24201k.f24534h.m10423u(c4474c4M10560T.m10467o(), C4647r.f24356j0) ? c4474c4M10560T.m10430B() : null;
            if (C4145e9.m9566a() || !this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
                strM10489d = "";
            } else {
                strM10489d = m10676a(str).m10489d();
            }
            m10655B(c4625p, new C4480ca(str, strM10474v, strM10441M, jM10442N, strM10443O, jM10444P, jM10445Q, (String) null, z, false, strM10436H, jM10459g, 0L, 0, zM10460h, zM10461i, false, strM10477y, boolM10462j, jM10447S, listM10463k, strM10430B, strM10489d));
        }
        z = zM10448T;
        if (C4145e9.m9566a()) {
            strM10489d = "";
        } else {
            strM10489d = "";
        }
        m10655B(c4625p, new C4480ca(str, strM10474v, strM10441M, jM10442N, strM10443O, jM10444P, jM10445Q, (String) null, z, false, strM10436H, jM10459g, 0L, 0, zM10460h, zM10461i, false, strM10477y, boolM10462j, jM10447S, listM10463k, strM10430B, strM10489d));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX INFO: renamed from: i */
    public final void m10681i(C4474c4 c4474c4) throws Throwable {
        m10673U();
        if (C4286oa.m10122a() && this.f24201k.f24534h.m10423u(c4474c4.m10467o(), C4647r.f24356j0)) {
            if (TextUtils.isEmpty(c4474c4.m10474v()) && TextUtils.isEmpty(c4474c4.m10430B()) && TextUtils.isEmpty(c4474c4.m10477y())) {
                m10690r(c4474c4.m10467o(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(c4474c4.m10474v()) && TextUtils.isEmpty(c4474c4.m10477y())) {
            m10690r(c4474c4.m10467o(), 204, null, null, null);
            return;
        }
        C4469c c4469c = this.f24201k.f24534h;
        Objects.requireNonNull(c4469c);
        Uri.Builder builder = new Uri.Builder();
        String strM10474v = c4474c4.m10474v();
        if (TextUtils.isEmpty(strM10474v)) {
            if (C4286oa.m10122a() && c4469c.f24476a.f24534h.m10423u(c4474c4.m10467o(), C4647r.f24356j0)) {
                strM10474v = c4474c4.m10430B();
                if (TextUtils.isEmpty(strM10474v)) {
                    strM10474v = c4474c4.m10477y();
                }
            } else {
                strM10474v = c4474c4.m10477y();
            }
        }
        ArrayMap arrayMap = null;
        Uri.Builder builderEncodedAuthority = builder.scheme(C4647r.f24345e.m10638a(null)).encodedAuthority(C4647r.f24347f.m10638a(null));
        String strValueOf = String.valueOf(strM10474v);
        builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", c4474c4.m10471s()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "33025");
        String string = builder.build().toString();
        try {
            URL url = new URL(string);
            this.f24201k.mo10684l().f24426n.m10812b("Fetching remote configuration", c4474c4.m10467o());
            C4399x0 c4399x0M10731s = m10660H().m10731s(c4474c4.m10467o());
            C4652r4 c4652r4M10660H = m10660H();
            String strM10467o = c4474c4.m10467o();
            c4652r4M10660H.mo10381b();
            String str = c4652r4M10660H.f24398i.get(strM10467o);
            if (c4399x0M10731s != null && !TextUtils.isEmpty(str)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", str);
            }
            this.f24208r = true;
            C4739z3 c4739z3M10662J = m10662J();
            String strM10467o2 = c4474c4.m10467o();
            C4623o9 c4623o9 = new C4623o9(this);
            c4739z3M10662J.mo10381b();
            c4739z3M10662J.m10642i();
            c4739z3M10662J.mo10686n().m10760x(new RunnableC4498e4(c4739z3M10662J, strM10467o2, url, null, arrayMap, c4623o9));
        } catch (MalformedURLException unused) {
            this.f24201k.mo10684l().f24418f.m10813c("Failed to parse config URL. Not fetching. appId", C4662s3.m10738s(c4474c4.m10467o()), string);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: j */
    public final InterfaceC2782b mo10682j() {
        return this.f24201k.f24541o;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX INFO: renamed from: k */
    public final void m10683k(C4712w9 c4712w9, C4480ca c4480ca) throws Throwable {
        C4577l c4577lM10585z;
        m10673U();
        m10668P();
        if (m10664L(c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            int iM10893h0 = this.f24201k.m10837t().m10893h0(c4712w9.f24562g);
            if (iM10893h0 != 0) {
                this.f24201k.m10837t();
                String strM10852E = C4723x9.m10852E(c4712w9.f24562g, 24, true);
                String str = c4712w9.f24562g;
                this.f24201k.m10837t().m10885S(this.f24191A, c4480ca.f23798f, iM10893h0, "_ev", strM10852E, str != null ? str.length() : 0);
                return;
            }
            int iM10894i0 = this.f24201k.m10837t().m10894i0(c4712w9.f24562g, c4712w9.m10847H());
            if (iM10894i0 != 0) {
                this.f24201k.m10837t();
                String strM10852E2 = C4723x9.m10852E(c4712w9.f24562g, 24, true);
                Object objM10847H = c4712w9.m10847H();
                this.f24201k.m10837t().m10885S(this.f24191A, c4480ca.f23798f, iM10894i0, "_ev", strM10852E2, (objM10847H == null || !((objM10847H instanceof String) || (objM10847H instanceof CharSequence))) ? 0 : String.valueOf(objM10847H).length());
                return;
            }
            Object objM10896n0 = this.f24201k.m10837t().m10896n0(c4712w9.f24562g, c4712w9.m10847H());
            if (objM10896n0 == null) {
                return;
            }
            if ("_sid".equals(c4712w9.f24562g)) {
                long j2 = c4712w9.f24563h;
                String str2 = c4712w9.f24566k;
                long jLongValue = 0;
                C4734y9 c4734y9M10565Y = m10663K().m10565Y(c4480ca.f23798f, "_sno");
                if (c4734y9M10565Y != null) {
                    Object obj = c4734y9M10565Y.f24614e;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (c4734y9M10565Y != null) {
                            this.f24201k.mo10684l().f24421i.m10812b("Retrieved last session number from database does not contain a valid (long) value", c4734y9M10565Y.f24614e);
                        }
                        c4577lM10585z = m10663K().m10585z(c4480ca.f23798f, "_s");
                        if (c4577lM10585z != null) {
                            jLongValue = c4577lM10585z.f24090c;
                            this.f24201k.mo10684l().f24426n.m10812b("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        }
                    }
                } else {
                    if (c4734y9M10565Y != null) {
                        this.f24201k.mo10684l().f24421i.m10812b("Retrieved last session number from database does not contain a valid (long) value", c4734y9M10565Y.f24614e);
                    }
                    c4577lM10585z = m10663K().m10585z(c4480ca.f23798f, "_s");
                    if (c4577lM10585z != null) {
                        jLongValue = c4577lM10585z.f24090c;
                        this.f24201k.mo10684l().f24426n.m10812b("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    }
                }
                m10683k(new C4712w9("_sno", j2, Long.valueOf(jLongValue + 1), str2), c4480ca);
            }
            C4734y9 c4734y9 = new C4734y9(c4480ca.f23798f, c4712w9.f24566k, c4712w9.f24562g, c4712w9.f24563h, objM10896n0);
            this.f24201k.mo10684l().f24426n.m10813c("Setting user property", this.f24201k.m10838u().m10721y(c4734y9.f24612c), objM10896n0);
            m10663K().m10568b0();
            try {
                m10659G(c4480ca);
                boolean zM10553M = m10663K().m10553M(c4734y9);
                m10663K().m10578s();
                if (!zM10553M) {
                    this.f24201k.mo10684l().f24418f.m10813c("Too many unique user properties are set. Ignoring user property", this.f24201k.m10838u().m10721y(c4734y9.f24612c), c4734y9.f24614e);
                    this.f24201k.m10837t().m10885S(this.f24191A, c4480ca.f23798f, 9, null, null, 0);
                }
            } finally {
                m10663K().m10571e0();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: l */
    public final C4662s3 mo10684l() {
        return this.f24201k.mo10684l();
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: m */
    public final Context mo10685m() {
        return this.f24201k.f24528b;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: n */
    public final C4674t4 mo10686n() {
        return this.f24201k.mo10686n();
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4697v5
    /* JADX INFO: renamed from: o */
    public final C4588la mo10687o() {
        return this.f24201k.f24533g;
    }

    /* JADX INFO: renamed from: p */
    public final void m10688p(C4480ca c4480ca) throws Throwable {
        if (this.f24213w != null) {
            ArrayList arrayList = new ArrayList();
            this.f24214x = arrayList;
            arrayList.addAll(this.f24213w);
        }
        C4517g c4517gM10663K = m10663K();
        String str = c4480ca.f23798f;
        C2622l.m5359e(str);
        c4517gM10663K.mo10381b();
        c4517gM10663K.m10642i();
        try {
            SQLiteDatabase sQLiteDatabaseM10579t = c4517gM10663K.m10579t();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseM10579t.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseM10579t.delete("events", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM10579t.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                c4517gM10663K.mo10684l().f24426n.m10813c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            c4517gM10663K.mo10684l().f24418f.m10813c("Error resetting analytics data. appId, error", C4662s3.m10738s(str), e);
        }
        if (c4480ca.f23805m) {
            m10657E(c4480ca);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10689q(C4624oa c4624oa, C4480ca c4480ca) throws Throwable {
        boolean z;
        Objects.requireNonNull(c4624oa, "null reference");
        C2622l.m5359e(c4624oa.f24238f);
        Objects.requireNonNull(c4624oa.f24239g, "null reference");
        Objects.requireNonNull(c4624oa.f24240h, "null reference");
        C2622l.m5359e(c4624oa.f24240h.f24562g);
        m10673U();
        m10668P();
        if (m10664L(c4480ca)) {
            if (!c4480ca.f23805m) {
                m10659G(c4480ca);
                return;
            }
            C4624oa c4624oa2 = new C4624oa(c4624oa);
            boolean z2 = false;
            c4624oa2.f24242j = false;
            m10663K().m10568b0();
            try {
                C4624oa c4624oaM10566Z = m10663K().m10566Z(c4624oa2.f24238f, c4624oa2.f24240h.f24562g);
                if (c4624oaM10566Z != null && !c4624oaM10566Z.f24239g.equals(c4624oa2.f24239g)) {
                    this.f24201k.mo10684l().f24421i.m10814d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f24201k.m10838u().m10721y(c4624oa2.f24240h.f24562g), c4624oa2.f24239g, c4624oaM10566Z.f24239g);
                }
                if (c4624oaM10566Z != null && (z = c4624oaM10566Z.f24242j)) {
                    c4624oa2.f24239g = c4624oaM10566Z.f24239g;
                    c4624oa2.f24241i = c4624oaM10566Z.f24241i;
                    c4624oa2.f24245m = c4624oaM10566Z.f24245m;
                    c4624oa2.f24243k = c4624oaM10566Z.f24243k;
                    c4624oa2.f24246n = c4624oaM10566Z.f24246n;
                    c4624oa2.f24242j = z;
                    C4712w9 c4712w9 = c4624oa2.f24240h;
                    c4624oa2.f24240h = new C4712w9(c4712w9.f24562g, c4624oaM10566Z.f24240h.f24563h, c4712w9.m10847H(), c4624oaM10566Z.f24240h.f24566k);
                } else if (TextUtils.isEmpty(c4624oa2.f24243k)) {
                    C4712w9 c4712w10 = c4624oa2.f24240h;
                    c4624oa2.f24240h = new C4712w9(c4712w10.f24562g, c4624oa2.f24241i, c4712w10.m10847H(), c4624oa2.f24240h.f24566k);
                    c4624oa2.f24242j = true;
                    z2 = true;
                }
                if (c4624oa2.f24242j) {
                    C4712w9 c4712w11 = c4624oa2.f24240h;
                    C4734y9 c4734y9 = new C4734y9(c4624oa2.f24238f, c4624oa2.f24239g, c4712w11.f24562g, c4712w11.f24563h, c4712w11.m10847H());
                    if (m10663K().m10553M(c4734y9)) {
                        this.f24201k.mo10684l().f24425m.m10814d("User property updated immediately", c4624oa2.f24238f, this.f24201k.m10838u().m10721y(c4734y9.f24612c), c4734y9.f24614e);
                    } else {
                        this.f24201k.mo10684l().f24418f.m10814d("(2)Too many active user properties, ignoring", C4662s3.m10738s(c4624oa2.f24238f), this.f24201k.m10838u().m10721y(c4734y9.f24612c), c4734y9.f24614e);
                    }
                    if (z2 && c4624oa2.f24246n != null) {
                        m10661I(new C4625p(c4624oa2.f24246n, c4624oa2.f24241i), c4480ca);
                    }
                }
                if (m10663K().m10554N(c4624oa2)) {
                    this.f24201k.mo10684l().f24425m.m10814d("Conditional property added", c4624oa2.f24238f, this.f24201k.m10838u().m10721y(c4624oa2.f24240h.f24562g), c4624oa2.f24240h.m10847H());
                } else {
                    this.f24201k.mo10684l().f24418f.m10814d("Too many conditional properties, ignoring", C4662s3.m10738s(c4624oa2.f24238f), this.f24201k.m10838u().m10721y(c4624oa2.f24240h.f24562g), c4624oa2.f24240h.m10847H());
                }
                m10663K().m10578s();
            } finally {
                m10663K().m10571e0();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m10690r(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        m10673U();
        m10668P();
        C2622l.m5359e(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f24208r = false;
                m10696x();
                throw th2;
            }
        }
        this.f24201k.mo10684l().f24426n.m10812b("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        m10663K().m10568b0();
        try {
            C4474c4 c4474c4M10560T = m10663K().m10560T(str);
            boolean z = true;
            boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
            if (c4474c4M10560T == null) {
                this.f24201k.mo10684l().f24421i.m10812b("App does not exist in onConfigFetched. appId", C4662s3.m10738s(str));
            } else if (z2 || i == 404) {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i != 404 && i != 304) {
                    m10660H().m10734w(str, bArr, str2);
                } else if (m10660H().m10731s(str) == null) {
                    m10660H().m10734w(str, null, null);
                }
                c4474c4M10560T.m10434F(this.f24201k.f24541o.mo5623c());
                m10663K().m10549I(c4474c4M10560T);
                if (i == 404) {
                    this.f24201k.mo10684l().f24423k.m10812b("Config not found. Using empty config. appId", str);
                } else {
                    this.f24201k.mo10684l().f24426n.m10813c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                }
                if (m10662J().m10913u() && m10694v()) {
                    m10669Q();
                } else {
                    m10695w();
                }
            } else {
                c4474c4M10560T.m10437I(this.f24201k.f24541o.mo5623c());
                m10663K().m10549I(c4474c4M10560T);
                this.f24201k.mo10684l().f24426n.m10813c("Fetching config failed. code, error", Integer.valueOf(i), th);
                C4652r4 c4652r4M10660H = m10660H();
                c4652r4M10660H.mo10381b();
                c4652r4M10660H.f24398i.put(str, null);
                this.f24201k.m10834k().f23892g.m10611b(this.f24201k.f24541o.mo5623c());
                if (i != 503 && i != 429) {
                    z = false;
                }
                if (z) {
                    this.f24201k.m10834k().f23893h.m10611b(this.f24201k.f24541o.mo5623c());
                }
                m10695w();
            }
            m10663K().m10578s();
            m10663K().m10571e0();
            this.f24208r = false;
            m10696x();
        } catch (Throwable th3) {
            m10663K().m10571e0();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m10691s(String str, C4481d c4481d) {
        if (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
            m10673U();
            m10668P();
            this.f24216z.put(str, c4481d);
            C4517g c4517gM10663K = m10663K();
            if (C4145e9.m9566a() && c4517gM10663K.f24476a.f24534h.m10417k(C4647r.f24315J0)) {
                Objects.requireNonNull(str, "null reference");
                c4517gM10663K.mo10381b();
                c4517gM10663K.m10642i();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", c4481d.m10489d());
                try {
                    if (c4517gM10663K.m10579t().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                        c4517gM10663K.mo10684l().f24418f.m10812b("Failed to insert/update consent setting (got -1). appId", C4662s3.m10738s(str));
                    }
                } catch (SQLiteException e) {
                    c4517gM10663K.mo10684l().f24418f.m10813c("Error storing consent setting. appId, error", C4662s3.m10738s(str), e);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 42621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: t */
    public final boolean m10692t(long r44) {
        /*
            Method dump skipped, instruction units count: 4262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p327k.p329b.C4611n9.m10692t(long):boolean");
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10693u(C4123d1.a aVar, C4123d1.a aVar2) {
        C2622l.m5339a("_e".equals(aVar.m9532F()));
        m10666N();
        C4151f1 c4151f1M10795w = C4679t9.m10795w((C4123d1) ((AbstractC4099b5) aVar.m9433t()), "_sc");
        String strM9580E = c4151f1M10795w == null ? null : c4151f1M10795w.m9580E();
        m10666N();
        C4151f1 c4151f1M10795w2 = C4679t9.m10795w((C4123d1) ((AbstractC4099b5) aVar2.m9433t()), "_pc");
        String strM9580E2 = c4151f1M10795w2 != null ? c4151f1M10795w2.m9580E() : null;
        if (strM9580E2 == null || !strM9580E2.equals(strM9580E)) {
            return false;
        }
        m10654A(aVar, aVar2);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10694v() throws Throwable {
        m10673U();
        m10668P();
        return ((m10663K().m10559S("select count(1) > 0 from raw_events", null) > 0L ? 1 : (m10663K().m10559S("select count(1) > 0 from raw_events", null) == 0L ? 0 : -1)) != 0) || !TextUtils.isEmpty(m10663K().m10580u());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX INFO: renamed from: w */
    public final void m10695w() throws Throwable {
        boolean z;
        long jMax;
        long jMax2;
        int iIntValue;
        m10673U();
        m10668P();
        if (this.f24204n > 0) {
            long jAbs = 3600000 - Math.abs(this.f24201k.f24541o.mo5621a() - this.f24204n);
            if (jAbs > 0) {
                this.f24201k.mo10684l().f24426n.m10812b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                m10671S().m10494a();
                m10672T().m10631s();
                return;
            }
            this.f24204n = 0L;
        }
        if (!this.f24201k.m10832h() || !m10694v()) {
            this.f24201k.mo10684l().f24426n.m10811a("Nothing to upload or uploading impossible");
            m10671S().m10494a();
            m10672T().m10631s();
            return;
        }
        long jMo5623c = this.f24201k.f24541o.mo5623c();
        long jMax3 = Math.max(0L, C4647r.f24296A.m10638a(null).longValue());
        if (m10663K().m10559S("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z = true;
        } else {
            if (m10663K().m10559S("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            String strM10414d = this.f24201k.f24534h.m10414d("debug.firebase.analytics.app", "");
            jMax = (TextUtils.isEmpty(strM10414d) || ".none.".equals(strM10414d)) ? Math.max(0L, C4647r.f24377u.m10638a(null).longValue()) : Math.max(0L, C4647r.f24379v.m10638a(null).longValue());
        } else {
            jMax = Math.max(0L, C4647r.f24375t.m10638a(null).longValue());
        }
        long jM10610a = this.f24201k.m10834k().f23891f.m10610a();
        long jM10610a2 = this.f24201k.m10834k().f23892g.m10610a();
        long j2 = jMax;
        long jMax4 = Math.max(m10663K().m10582w("select max(bundle_end_timestamp) from queue", null, 0L), m10663K().m10582w("select max(timestamp) from raw_events", null, 0L));
        if (jMax4 != 0) {
            long jAbs2 = jMo5623c - Math.abs(jMax4 - jMo5623c);
            long jAbs3 = jMo5623c - Math.abs(jM10610a - jMo5623c);
            long jAbs4 = jMo5623c - Math.abs(jM10610a2 - jMo5623c);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax2 = jMax3 + jAbs2;
            if (z && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + j2;
            }
            if (!m10666N().m10802N(jMax5, j2)) {
                jMax2 = jMax5 + j2;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    if (i >= Math.min(20, Math.max(0, C4647r.f24300C.m10638a(null).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    jMax2 += Math.max(0L, C4647r.f24298B.m10638a(null).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            jMax2 = 0;
            break;
        }
        if (jMax2 == 0) {
            this.f24201k.mo10684l().f24426n.m10811a("Next upload time is 0");
            m10671S().m10494a();
            m10672T().m10631s();
            return;
        }
        if (!m10662J().m10913u()) {
            this.f24201k.mo10684l().f24426n.m10811a("No network");
            C4486d4 c4486d4M10671S = m10671S();
            c4486d4M10671S.f23826a.m10668P();
            c4486d4M10671S.f23826a.mo10686n().mo10381b();
            if (!c4486d4M10671S.f23827b) {
                c4486d4M10671S.f23826a.f24201k.f24528b.registerReceiver(c4486d4M10671S, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                c4486d4M10671S.f23828c = c4486d4M10671S.f23826a.m10662J().m10913u();
                c4486d4M10671S.f23826a.mo10684l().f24426n.m10812b("Registering connectivity change receiver. Network connected", Boolean.valueOf(c4486d4M10671S.f23828c));
                c4486d4M10671S.f23827b = true;
            }
            m10672T().m10631s();
            return;
        }
        long jM10610a3 = this.f24201k.m10834k().f23893h.m10610a();
        long jMax6 = Math.max(0L, C4647r.f24371r.m10638a(null).longValue());
        if (!m10666N().m10802N(jM10610a3, jMax6)) {
            jMax2 = Math.max(jMax2, jM10610a3 + jMax6);
        }
        m10671S().m10494a();
        long jMo5623c2 = jMax2 - this.f24201k.f24541o.mo5623c();
        if (jMo5623c2 <= 0) {
            jMo5623c2 = Math.max(0L, C4647r.f24381w.m10638a(null).longValue());
            this.f24201k.m10834k().f23891f.m10611b(this.f24201k.f24541o.mo5623c());
        }
        this.f24201k.mo10684l().f24426n.m10812b("Upload scheduled in approximately ms", Long.valueOf(jMo5623c2));
        C4575k9 c4575k9M10672T = m10672T();
        c4575k9M10672T.m10642i();
        Context context = c4575k9M10672T.f24476a.f24528b;
        if (!C4630p4.m10714a(context)) {
            c4575k9M10672T.mo10684l().f24425m.m10811a("Receiver not registered/enabled");
        }
        if (!C4723x9.m10854U(context)) {
            c4575k9M10672T.mo10684l().f24425m.m10811a("Service not registered/enabled");
        }
        c4575k9M10672T.m10631s();
        c4575k9M10672T.mo10684l().f24426n.m10812b("Scheduling upload, millis", Long.valueOf(jMo5623c2));
        long jMo5621a = c4575k9M10672T.f24476a.f24541o.mo5621a() + jMo5623c2;
        if (jMo5623c2 < Math.max(0L, C4647r.f24383x.m10638a(null).longValue())) {
            if (!(c4575k9M10672T.f24084e.f23988d != 0)) {
                c4575k9M10672T.f24084e.m10596b(jMo5623c2);
            }
        }
        if (Build.VERSION.SDK_INT < 24) {
            c4575k9M10672T.f24083d.setInexactRepeating(2, jMo5621a, Math.max(C4647r.f24373s.m10638a(null).longValue(), jMo5623c2), c4575k9M10672T.m10633u());
            return;
        }
        Context context2 = c4575k9M10672T.f24476a.f24528b;
        ComponentName componentName = new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM10632t = c4575k9M10672T.m10632t();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(iM10632t, componentName).setMinimumLatency(jMo5623c2).setOverrideDeadline(jMo5623c2 << 1).setExtras(persistableBundle).build();
        Method method = C4140e4.f23127a;
        JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
        if (C4140e4.f23127a == null || context2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfoBuild);
            return;
        }
        Method method2 = C4140e4.f23128b;
        if (method2 != null) {
            try {
                iIntValue = ((Integer) method2.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        Method method3 = C4140e4.f23127a;
        if (method3 != null) {
            try {
                ((Integer) method3.invoke(jobScheduler, jobInfoBuild, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm")).intValue();
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
            }
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    /* JADX INFO: renamed from: x */
    public final void m10696x() {
        m10673U();
        if (this.f24208r || this.f24209s || this.f24210t) {
            this.f24201k.mo10684l().f24426n.m10814d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f24208r), Boolean.valueOf(this.f24209s), Boolean.valueOf(this.f24210t));
            return;
        }
        this.f24201k.mo10684l().f24426n.m10811a("Stopping uploading service(s)");
        List<Runnable> list = this.f24205o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f24205o.clear();
    }

    /* JADX INFO: renamed from: y */
    public final C4480ca m10697y(String str) throws Throwable {
        C4474c4 c4474c4M10560T = m10663K().m10560T(str);
        if (c4474c4M10560T == null || TextUtils.isEmpty(c4474c4M10560T.m10441M())) {
            this.f24201k.mo10684l().f24425m.m10812b("No app data available; dropping", str);
            return null;
        }
        Boolean boolM10698z = m10698z(c4474c4M10560T);
        if (boolM10698z != null && !boolM10698z.booleanValue()) {
            this.f24201k.mo10684l().f24418f.m10812b("App version does not match; dropping. appId", C4662s3.m10738s(str));
            return null;
        }
        return new C4480ca(str, c4474c4M10560T.m10474v(), c4474c4M10560T.m10441M(), c4474c4M10560T.m10442N(), c4474c4M10560T.m10443O(), c4474c4M10560T.m10444P(), c4474c4M10560T.m10445Q(), (String) null, c4474c4M10560T.m10448T(), false, c4474c4M10560T.m10436H(), c4474c4M10560T.m10459g(), 0L, 0, c4474c4M10560T.m10460h(), c4474c4M10560T.m10461i(), false, c4474c4M10560T.m10477y(), c4474c4M10560T.m10462j(), c4474c4M10560T.m10447S(), c4474c4M10560T.m10463k(), (C4286oa.m10122a() && this.f24201k.f24534h.m10423u(str, C4647r.f24356j0)) ? c4474c4M10560T.m10430B() : null, (C4145e9.m9566a() && this.f24201k.f24534h.m10417k(C4647r.f24315J0)) ? m10676a(str).m10489d() : "");
    }

    /* JADX INFO: renamed from: z */
    public final Boolean m10698z(C4474c4 c4474c4) {
        try {
            if (c4474c4.m10442N() != -2147483648L) {
                if (c4474c4.m10442N() == C2794c.m5637a(this.f24201k.f24528b).m5635c(c4474c4.m10467o(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C2794c.m5637a(this.f24201k.f24528b).m5635c(c4474c4.m10467o(), 0).versionName;
                if (c4474c4.m10441M() != null && c4474c4.m10441M().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
