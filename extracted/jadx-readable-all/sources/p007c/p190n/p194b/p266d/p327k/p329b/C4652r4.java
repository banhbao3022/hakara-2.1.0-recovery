package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4186h8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4239l5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4262n0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4276o0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4290p0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4318r0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4386w0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4399x0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4412y0;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.r4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4652r4 extends AbstractC4587l9 implements InterfaceC4493e {

    /* JADX INFO: renamed from: d */
    public final Map<String, Map<String, String>> f24393d;

    /* JADX INFO: renamed from: e */
    public final Map<String, Map<String, Boolean>> f24394e;

    /* JADX INFO: renamed from: f */
    public final Map<String, Map<String, Boolean>> f24395f;

    /* JADX INFO: renamed from: g */
    public final Map<String, C4399x0> f24396g;

    /* JADX INFO: renamed from: h */
    public final Map<String, Map<String, Integer>> f24397h;

    /* JADX INFO: renamed from: i */
    public final Map<String, String> f24398i;

    public C4652r4(C4611n9 c4611n9) {
        super(c4611n9);
        this.f24393d = new ArrayMap();
        this.f24394e = new ArrayMap();
        this.f24395f = new ArrayMap();
        this.f24396g = new ArrayMap();
        this.f24398i = new ArrayMap();
        this.f24397h = new ArrayMap();
    }

    /* JADX INFO: renamed from: u */
    public static Map<String, String> m10725u(C4399x0 c4399x0) {
        ArrayMap arrayMap = new ArrayMap();
        for (C4412y0 c4412y0 : c4399x0.m10327z()) {
            arrayMap.put(c4412y0.m10337s(), c4412y0.m10338t());
        }
        return arrayMap;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10726A(String str) throws Throwable {
        mo10381b();
        C4399x0 c4399x0M10731s = m10731s(str);
        if (c4399x0M10731s == null) {
            return false;
        }
        return c4399x0M10731s.m10321C();
    }

    /* JADX INFO: renamed from: B */
    public final long m10727B(String str) throws Throwable {
        String strMo10379d = mo10379d(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strMo10379d)) {
            return 0L;
        }
        try {
            return Long.parseLong(strMo10379d);
        } catch (NumberFormatException e) {
            mo10684l().f24421i.m10813c("Unable to parse timezone offset. appId", C4662s3.m10738s(str), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10728C(String str) {
        return "1".equals(mo10379d(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10729D(String str) {
        return "1".equals(mo10379d(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00d3: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x00d3 */
    /* JADX INFO: renamed from: E */
    public final void m10730E(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        Cursor cursor;
        byte[] blob;
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        if (this.f24396g.get(str) == null) {
            C4517g c4517gM10644q = m10644q();
            Objects.requireNonNull(c4517gM10644q);
            C2622l.m5359e(str);
            c4517gM10644q.mo10381b();
            c4517gM10644q.m10642i();
            Cursor cursor2 = null;
            try {
                try {
                    cursorQuery = c4517gM10644q.m10579t().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            blob = cursorQuery.getBlob(0);
                            if (cursorQuery.moveToNext()) {
                                c4517gM10644q.mo10684l().f24418f.m10812b("Got multiple records for app config, expected one. appId", C4662s3.m10738s(str));
                            }
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            blob = null;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        c4517gM10644q.mo10684l().f24418f.m10813c("Error querying remote config. appId", C4662s3.m10738s(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (blob != null) {
                C4399x0.a aVarM9423r = m10732t(str, blob).m9423r();
                m10733v(str, aVarM9423r);
                this.f24393d.put(str, m10725u((C4399x0) ((AbstractC4099b5) aVarM9423r.m9433t())));
                this.f24396g.put(str, (C4399x0) ((AbstractC4099b5) aVarM9423r.m9433t()));
                this.f24398i.put(str, null);
                return;
            }
            this.f24393d.put(str, null);
            this.f24394e.put(str, null);
            this.f24395f.put(str, null);
            this.f24396g.put(str, null);
            this.f24398i.put(str, null);
            this.f24397h.put(str, null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4493e
    /* JADX INFO: renamed from: d */
    public final String mo10379d(String str, String str2) throws Throwable {
        mo10381b();
        m10730E(str);
        Map<String, String> map = this.f24393d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final C4399x0 m10731s(String str) throws Throwable {
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        m10730E(str);
        return this.f24396g.get(str);
    }

    /* JADX INFO: renamed from: t */
    public final C4399x0 m10732t(String str, byte[] bArr) {
        if (bArr == null) {
            return C4399x0.m10315E();
        }
        try {
            C4399x0 c4399x0 = (C4399x0) ((AbstractC4099b5) ((C4399x0.a) C4679t9.m10796x(C4399x0.m10314D(), bArr)).m9433t());
            mo10684l().f24426n.m10813c("Parsed config. version, gmp_app_id", c4399x0.m10323v() ? Long.valueOf(c4399x0.m10324w()) : null, c4399x0.m10325x() ? c4399x0.m10326y() : null);
            return c4399x0;
        } catch (C4239l5 e) {
            mo10684l().f24421i.m10813c("Unable to merge remote config. appId", C4662s3.m10738s(str), e);
            return C4399x0.m10315E();
        } catch (RuntimeException e2) {
            mo10684l().f24421i.m10813c("Unable to merge remote config. appId", C4662s3.m10738s(str), e2);
            return C4399x0.m10315E();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10733v(String str, C4399x0.a aVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (int i = 0; i < ((C4399x0) aVar.f23086g).m10319A(); i++) {
            C4386w0.a aVarM9423r = ((C4399x0) aVar.f23086g).m10322s(i).m9423r();
            if (TextUtils.isEmpty(aVarM9423r.m10306v())) {
                mo10684l().f24421i.m10811a("EventConfig contained null event name");
            } else {
                String strM10306v = aVarM9423r.m10306v();
                String strM10212i = C4340s8.m10212i(aVarM9423r.m10306v(), C4719x5.f24577a, C4719x5.f24579c);
                if (!TextUtils.isEmpty(strM10212i)) {
                    if (aVarM9423r.f23087h) {
                        aVarM9423r.m9431r();
                        aVarM9423r.f23087h = false;
                    }
                    C4386w0.m10299t((C4386w0) aVarM9423r.f23086g, strM10212i);
                    if (aVar.f23087h) {
                        aVar.m9431r();
                        aVar.f23087h = false;
                    }
                    C4399x0.m10318u((C4399x0) aVar.f23086g, i, (C4386w0) ((AbstractC4099b5) aVarM9423r.m9433t()));
                }
                if (C4186h8.m9830a() && this.f24476a.f24534h.m10417k(C4647r.f24323N0)) {
                    arrayMap.put(strM10306v, Boolean.valueOf(((C4386w0) aVarM9423r.f23086g).m10302u()));
                } else {
                    arrayMap.put(aVarM9423r.m10306v(), Boolean.valueOf(((C4386w0) aVarM9423r.f23086g).m10302u()));
                }
                arrayMap2.put(aVarM9423r.m10306v(), Boolean.valueOf(((C4386w0) aVarM9423r.f23086g).m10303v()));
                if (((C4386w0) aVarM9423r.f23086g).m10304w()) {
                    if (aVarM9423r.m10307w() < 2 || aVarM9423r.m10307w() > 65535) {
                        mo10684l().f24421i.m10813c("Invalid sampling rate. Event name, sample rate", aVarM9423r.m10306v(), Integer.valueOf(aVarM9423r.m10307w()));
                    } else {
                        arrayMap3.put(aVarM9423r.m10306v(), Integer.valueOf(aVarM9423r.m10307w()));
                    }
                }
            }
        }
        this.f24394e.put(str, arrayMap);
        this.f24395f.put(str, arrayMap2);
        this.f24397h.put(str, arrayMap3);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10734w(String str, byte[] bArr, String str2) {
        byte[] bArrM10139f;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        C4399x0.a aVarM9423r = m10732t(str, bArr).m9423r();
        m10733v(str, aVarM9423r);
        this.f24396g.put(str, (C4399x0) ((AbstractC4099b5) aVarM9423r.m9433t()));
        this.f24398i.put(str, str2);
        this.f24393d.put(str, m10725u((C4399x0) ((AbstractC4099b5) aVarM9423r.m9433t())));
        C4517g c4517gM10644q = m10644q();
        ArrayList<C4262n0> arrayList = new ArrayList(Collections.unmodifiableList(((C4399x0) aVarM9423r.f23086g).m10320B()));
        Objects.requireNonNull(c4517gM10644q);
        String str4 = "app_id=? and audience_id=?";
        String str5 = "null reference";
        int i = 0;
        while (i < arrayList.size()) {
            C4262n0.a aVarM9423r2 = ((C4262n0) arrayList.get(i)).m9423r();
            if (((C4262n0) aVarM9423r2.f23086g).m10018B() != 0) {
                int i2 = 0;
                while (i2 < ((C4262n0) aVarM9423r2.f23086g).m10018B()) {
                    C4276o0.a aVarM9423r3 = ((C4262n0) aVarM9423r2.f23086g).m10022x(i2).m9423r();
                    C4276o0.a aVar = (C4276o0.a) ((AbstractC4099b5.b) aVarM9423r3.clone());
                    C4399x0.a aVar2 = aVarM9423r;
                    String strM10212i = C4340s8.m10212i(((C4276o0) aVarM9423r3.f23086g).m10114x(), C4719x5.f24577a, C4719x5.f24579c);
                    if (strM10212i != null) {
                        if (aVar.f23087h) {
                            aVar.m9431r();
                            aVar.f23087h = false;
                        }
                        C4276o0.m10104u((C4276o0) aVar.f23086g, strM10212i);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i3 = 0;
                    while (i3 < ((C4276o0) aVarM9423r3.f23086g).m10116z()) {
                        C4290p0 c4290p0M10111s = ((C4276o0) aVarM9423r3.f23086g).m10111s(i3);
                        C4276o0.a aVar3 = aVarM9423r3;
                        String str6 = str4;
                        String str7 = str5;
                        String strM10212i2 = C4340s8.m10212i(c4290p0M10111s.m10126A(), C4708w5.f24553a, C4708w5.f24554b);
                        if (strM10212i2 != null) {
                            C4290p0.a aVarM9423r4 = c4290p0M10111s.m9423r();
                            if (aVarM9423r4.f23087h) {
                                aVarM9423r4.m9431r();
                                aVarM9423r4.f23087h = false;
                            }
                            C4290p0.m10125s((C4290p0) aVarM9423r4.f23086g, strM10212i2);
                            C4290p0 c4290p0 = (C4290p0) ((AbstractC4099b5) aVarM9423r4.m9433t());
                            if (aVar.f23087h) {
                                aVar.m9431r();
                                aVar.f23087h = false;
                            }
                            C4276o0.m10103t((C4276o0) aVar.f23086g, i3, c4290p0);
                            z3 = true;
                        }
                        i3++;
                        aVarM9423r3 = aVar3;
                        str4 = str6;
                        str5 = str7;
                    }
                    String str8 = str4;
                    String str9 = str5;
                    if (z3) {
                        if (aVarM9423r2.f23087h) {
                            aVarM9423r2.m9431r();
                            aVarM9423r2.f23087h = false;
                        }
                        C4262n0.m10015t((C4262n0) aVarM9423r2.f23086g, i2, (C4276o0) ((AbstractC4099b5) aVar.m9433t()));
                        arrayList.set(i, (C4262n0) ((AbstractC4099b5) aVarM9423r2.m9433t()));
                    }
                    i2++;
                    aVarM9423r = aVar2;
                    str4 = str8;
                    str5 = str9;
                }
            }
            C4399x0.a aVar4 = aVarM9423r;
            String str10 = str4;
            String str11 = str5;
            if (((C4262n0) aVarM9423r2.f23086g).m10024z() != 0) {
                for (int i4 = 0; i4 < ((C4262n0) aVarM9423r2.f23086g).m10024z(); i4++) {
                    C4318r0 c4318r0M10019s = ((C4262n0) aVarM9423r2.f23086g).m10019s(i4);
                    String strM10212i3 = C4340s8.m10212i(c4318r0M10019s.m10180v(), C4741z5.f24622a, C4741z5.f24623b);
                    if (strM10212i3 != null) {
                        C4318r0.a aVarM9423r5 = c4318r0M10019s.m9423r();
                        if (aVarM9423r5.f23087h) {
                            aVarM9423r5.m9431r();
                            z2 = false;
                            aVarM9423r5.f23087h = false;
                        } else {
                            z2 = false;
                        }
                        C4318r0.m10176s((C4318r0) aVarM9423r5.f23086g, strM10212i3);
                        if (aVarM9423r2.f23087h) {
                            aVarM9423r2.m9431r();
                            aVarM9423r2.f23087h = z2;
                        }
                        C4262n0.m10016u((C4262n0) aVarM9423r2.f23086g, i4, (C4318r0) ((AbstractC4099b5) aVarM9423r5.m9433t()));
                        arrayList.set(i, (C4262n0) ((AbstractC4099b5) aVarM9423r2.m9433t()));
                    }
                }
            }
            i++;
            aVarM9423r = aVar4;
            str4 = str10;
            str5 = str11;
        }
        C4399x0.a aVar5 = aVarM9423r;
        String str12 = str4;
        String str13 = str5;
        c4517gM10644q.m10642i();
        c4517gM10644q.mo10381b();
        C2622l.m5359e(str);
        SQLiteDatabase sQLiteDatabaseM10579t = c4517gM10644q.m10579t();
        sQLiteDatabaseM10579t.beginTransaction();
        try {
            c4517gM10644q.m10642i();
            c4517gM10644q.mo10381b();
            C2622l.m5359e(str);
            SQLiteDatabase sQLiteDatabaseM10579t2 = c4517gM10644q.m10579t();
            sQLiteDatabaseM10579t2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM10579t2.delete("event_filters", "app_id=?", new String[]{str});
            for (C4262n0 c4262n0 : arrayList) {
                c4517gM10644q.m10642i();
                c4517gM10644q.mo10381b();
                C2622l.m5359e(str);
                str13 = str13;
                Objects.requireNonNull(c4262n0, str13);
                if (c4262n0.m10020v()) {
                    int iM10021w = c4262n0.m10021w();
                    Iterator<C4276o0> it = c4262n0.m10017A().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<C4318r0> it2 = c4262n0.m10023y().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator<C4276o0> it3 = c4262n0.m10017A().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z = true;
                                            break;
                                        }
                                        if (!c4517gM10644q.m10555O(str, iM10021w, it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<C4318r0> it4 = c4262n0.m10023y().iterator();
                                        while (it4.hasNext()) {
                                            if (!c4517gM10644q.m10556P(str, iM10021w, it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z) {
                                        str3 = str12;
                                    } else {
                                        c4517gM10644q.m10642i();
                                        c4517gM10644q.mo10381b();
                                        C2622l.m5359e(str);
                                        SQLiteDatabase sQLiteDatabaseM10579t3 = c4517gM10644q.m10579t();
                                        str3 = str12;
                                        sQLiteDatabaseM10579t3.delete("property_filters", str3, new String[]{str, String.valueOf(iM10021w)});
                                        sQLiteDatabaseM10579t3.delete("event_filters", str3, new String[]{str, String.valueOf(iM10021w)});
                                    }
                                    str12 = str3;
                                    break;
                                }
                                if (!it2.next().m10178t()) {
                                    c4517gM10644q.mo10684l().f24421i.m10813c("Property filter with no ID. Audience definition ignored. appId, audienceId", C4662s3.m10738s(str), Integer.valueOf(iM10021w));
                                }
                            }
                        } else if (!it.next().m10112v()) {
                            c4517gM10644q.mo10684l().f24421i.m10813c("Event filter with no ID. Audience definition ignored. appId, audienceId", C4662s3.m10738s(str), Integer.valueOf(iM10021w));
                        }
                    }
                } else {
                    c4517gM10644q.mo10684l().f24421i.m10812b("Audience with no ID. appId", C4662s3.m10738s(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C4262n0 c4262n1 : arrayList) {
                arrayList2.add(c4262n1.m10020v() ? Integer.valueOf(c4262n1.m10021w()) : null);
            }
            c4517gM10644q.m10563W(str, arrayList2);
            sQLiteDatabaseM10579t.setTransactionSuccessful();
            sQLiteDatabaseM10579t.endTransaction();
            try {
                if (aVar5.f23087h) {
                    aVar5.m9431r();
                    aVar5.f23087h = false;
                }
                C4399x0.m10317t((C4399x0) aVar5.f23086g);
                bArrM10139f = ((C4399x0) ((AbstractC4099b5) aVar5.m9433t())).m10139f();
            } catch (RuntimeException e) {
                mo10684l().f24421i.m10813c("Unable to serialize reduced-size config. Storing full config instead. appId", C4662s3.m10738s(str), e);
                bArrM10139f = bArr;
            }
            C4517g c4517gM10644q2 = m10644q();
            C2622l.m5359e(str);
            c4517gM10644q2.mo10381b();
            c4517gM10644q2.m10642i();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrM10139f);
            try {
                if (c4517gM10644q2.m10579t().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c4517gM10644q2.mo10684l().f24418f.m10812b("Failed to update remote config (got 0). appId", C4662s3.m10738s(str));
                }
            } catch (SQLiteException e2) {
                c4517gM10644q2.mo10684l().f24418f.m10813c("Error storing remote config. appId", C4662s3.m10738s(str), e2);
            }
            this.f24396g.put(str, (C4399x0) ((AbstractC4099b5) aVar5.m9433t()));
            return true;
        } catch (Throwable th) {
            sQLiteDatabaseM10579t.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10735x(String str, String str2) throws Throwable {
        Boolean bool;
        mo10381b();
        m10730E(str);
        if ("1".equals(mo10379d(str, "measurement.upload.blacklist_internal")) && C4723x9.m10865r0(str2)) {
            return true;
        }
        if ("1".equals(mo10379d(str, "measurement.upload.blacklist_public")) && C4723x9.m10857X(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f24394e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10736y(String str, String str2) throws Throwable {
        Boolean bool;
        mo10381b();
        m10730E(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f24395f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public final int m10737z(String str, String str2) throws Throwable {
        Integer num;
        mo10381b();
        m10730E(str);
        Map<String, Integer> map = this.f24397h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }
}
