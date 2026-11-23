package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4095b1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4109c1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4207j1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4221k1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4235l1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4276o0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4313q9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4318r0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4395w9;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.ga */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4528ga extends AbstractC4587l9 {

    /* JADX INFO: renamed from: d */
    public String f23953d;

    /* JADX INFO: renamed from: e */
    public Set<Integer> f23954e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, C4552ia> f23955f;

    /* JADX INFO: renamed from: g */
    public Long f23956g;

    /* JADX INFO: renamed from: h */
    public Long f23957h;

    public C4528ga(C4611n9 c4611n9) {
        super(c4611n9);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final C4552ia m10590s(int i) {
        if (this.f23955f.containsKey(Integer.valueOf(i))) {
            return this.f23955f.get(Integer.valueOf(i));
        }
        C4552ia c4552ia = new C4552ia(this, this.f23953d, null);
        this.f23955f.put(Integer.valueOf(i), c4552ia);
        return c4552ia;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x0574  */
    /* JADX WARN: Code duplicated, block: B:282:0x0639  */
    /* JADX WARN: Code duplicated, block: B:285:0x064e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0670  */
    /* JADX WARN: Code duplicated, block: B:290:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:293:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:295:0x0703  */
    /* JADX WARN: Code duplicated, block: B:298:0x0714  */
    /* JADX WARN: Code duplicated, block: B:300:0x0718  */
    /* JADX WARN: Code duplicated, block: B:302:0x0722  */
    /* JADX WARN: Code duplicated, block: B:306:0x0732  */
    /* JADX WARN: Code duplicated, block: B:312:0x076b  */
    /* JADX WARN: Code duplicated, block: B:314:0x079c A[LOOP:12: B:310:0x0765->B:314:0x079c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:323:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:326:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:328:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:338:0x082f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0853  */
    /* JADX WARN: Code duplicated, block: B:344:0x0868  */
    /* JADX WARN: Code duplicated, block: B:346:0x0879  */
    /* JADX WARN: Code duplicated, block: B:348:0x0889  */
    /* JADX WARN: Code duplicated, block: B:349:0x0896  */
    /* JADX WARN: Code duplicated, block: B:351:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:363:0x0915  */
    /* JADX WARN: Code duplicated, block: B:364:0x091e  */
    /* JADX WARN: Code duplicated, block: B:368:0x0930  */
    /* JADX WARN: Code duplicated, block: B:373:0x0959  */
    /* JADX WARN: Code duplicated, block: B:389:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:454:0x065c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x07b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x07aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x0845 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x092a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x09b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0953 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: t */
    public final List<C4095b1> m10591t(String str, List<C4123d1> list, List<C4235l1> list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        String str2;
        Object obj;
        Map map;
        Object obj2;
        ?? r7;
        Cursor cursorQuery;
        Map mapEmptyMap;
        Map map2;
        String str3;
        String str4;
        ArrayList arrayList;
        Iterator<Integer> it;
        C4517g c4517gM10644q;
        String str5;
        ContentValues contentValues;
        ArrayMap arrayMap;
        String strM9931B;
        Map<Integer, List<C4318r0>> mapM10570d0;
        Iterator<Integer> it2;
        int iIntValue;
        Iterator<C4318r0> it3;
        boolean zM10649i;
        C4318r0 next;
        Integer numValueOf;
        C4600ma c4600ma;
        Integer numValueOf2;
        C4540ha c4540ha;
        ArrayMap arrayMap2;
        Iterator<C4123d1> it4;
        C4123d1 next2;
        C4123d1 c4123d1M10595a;
        C4517g c4517gM10644q2;
        String str6;
        String strM9519D;
        C4577l c4577lM10585z;
        C4577l c4577l;
        long j2;
        String strM9519D2;
        Map<Integer, List<C4276o0>> mapM10569c0;
        C4540ha c4540ha2;
        Iterator<Integer> it5;
        int iIntValue2;
        Iterator<C4276o0> it6;
        boolean zM10634i;
        Iterator<Integer> it7;
        ArrayMap arrayMap3;
        Iterator<C4123d1> it8;
        C4576ka c4576ka;
        Map map3;
        List<C4276o0> list3;
        boolean z2;
        ?? r8;
        Cursor cursorRawQuery;
        Map map4;
        Map mapEmptyMap2;
        ?? r9;
        Cursor cursorQuery2;
        C2622l.m5359e(str);
        Objects.requireNonNull(list, "null reference");
        Objects.requireNonNull(list2, "null reference");
        this.f23953d = str;
        this.f23954e = new HashSet();
        this.f23955f = new ArrayMap();
        this.f23956g = l;
        this.f23957h = l2;
        Iterator<C4123d1> it9 = list.iterator();
        while (true) {
            i = 1;
            i2 = 0;
            if (!it9.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(it9.next().m9519D())) {
                z = true;
                break;
            }
        }
        boolean z3 = C4313q9.m10173a() && this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24342c0);
        boolean z4 = C4313q9.m10173a() && this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24340b0);
        if (z) {
            C4517g c4517gM10644q3 = m10644q();
            String str7 = this.f23953d;
            c4517gM10644q3.m10642i();
            c4517gM10644q3.mo10381b();
            C2622l.m5359e(str7);
            ContentValues contentValues2 = new ContentValues();
            str2 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseM10579t = c4517gM10644q3.m10579t();
                str2 = "events";
                sQLiteDatabaseM10579t.update("events", contentValues2, "app_id = ?", new String[]{str7});
                obj = sQLiteDatabaseM10579t;
            } catch (SQLiteException e) {
                c4517gM10644q3.mo10684l().f24418f.m10813c("Error resetting session-scoped event counts. appId", C4662s3.m10738s(str7), e);
                obj = "Error resetting session-scoped event counts. appId";
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str8 = "audience_id";
        Object obj3 = obj;
        obj3 = obj;
        if (z4 && z3) {
            C4517g c4517gM10644q4 = m10644q();
            String str9 = this.f23953d;
            Objects.requireNonNull(c4517gM10644q4);
            C2622l.m5359e(str9);
            ArrayMap arrayMap4 = new ArrayMap();
            try {
                try {
                    cursorQuery2 = c4517gM10644q4.m10579t().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str9}, null, null, null);
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                try {
                                    C4276o0 c4276o0 = (C4276o0) ((AbstractC4099b5) ((C4276o0.a) C4679t9.m10796x(C4276o0.m10101G(), cursorQuery2.getBlob(1))).m9433t());
                                    if (c4276o0.m10105A()) {
                                        int i3 = cursorQuery2.getInt(i2);
                                        List arrayList2 = (List) arrayMap4.get(Integer.valueOf(i3));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            arrayMap4.put(Integer.valueOf(i3), arrayList2);
                                        }
                                        arrayList2.add(c4276o0);
                                    }
                                } catch (IOException e2) {
                                    c4517gM10644q4.mo10684l().f24418f.m10813c("Failed to merge filter. appId", C4662s3.m10738s(str9), e2);
                                }
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                }
                                i2 = 0;
                            }
                            cursorQuery2.close();
                            map = arrayMap4;
                            obj2 = arrayMap4;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery2.close();
                            obj3 = arrayMap4;
                            map = mapEmptyMap3;
                            obj2 = obj3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        c4517gM10644q4.mo10684l().f24418f.m10813c("Database error querying filters. appId", C4662s3.m10738s(str9), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        obj3 = "Database error querying filters. appId";
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                            obj3 = "Database error querying filters. appId";
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r9 = str2;
                    if (r9 != 0) {
                        r9.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursorQuery2 = null;
            } catch (Throwable th2) {
                th = th2;
                r9 = 0;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
            obj2 = obj3;
        }
        C4517g c4517gM10644q5 = m10644q();
        String str10 = this.f23953d;
        c4517gM10644q5.m10642i();
        c4517gM10644q5.mo10381b();
        C2622l.m5359e(str10);
        try {
            try {
                cursorQuery = c4517gM10644q5.m10579t().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str10}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        ArrayMap arrayMap5 = new ArrayMap();
                        int i4 = 0;
                        while (true) {
                            int i5 = cursorQuery.getInt(i4);
                            try {
                                arrayMap5.put(Integer.valueOf(i5), (C4207j1) ((AbstractC4099b5) ((C4207j1.a) C4679t9.m10796x(C4207j1.m9843K(), cursorQuery.getBlob(i))).m9433t()));
                            } catch (IOException e5) {
                                c4517gM10644q5.mo10684l().f24418f.m10814d("Failed to merge filter results. appId, audienceId, error", C4662s3.m10738s(str10), Integer.valueOf(i5), e5);
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            arrayMap5 = arrayMap5;
                            i4 = 0;
                            i = 1;
                        }
                        cursorQuery.close();
                        map2 = arrayMap5;
                    } else if (C4395w9.m10313a() && c4517gM10644q5.f24476a.f24534h.m10423u(str10, C4647r.f24307F0)) {
                        mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        map2 = mapEmptyMap;
                    } else {
                        cursorQuery.close();
                        map2 = null;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    c4517gM10644q5.mo10684l().f24418f.m10813c("Database error querying filter results. appId", C4662s3.m10738s(str10), e);
                    if (!C4395w9.m10313a() || !c4517gM10644q5.f24476a.f24534h.m10423u(str10, C4647r.f24307F0)) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        map2 = null;
                        if (C4395w9.m10313a()) {
                        }
                        str3 = "audience_id";
                        str4 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            c4540ha = new C4540ha(this, null);
                            arrayMap2 = new ArrayMap();
                            it4 = list.iterator();
                            while (it4.hasNext()) {
                                next2 = it4.next();
                                c4123d1M10595a = c4540ha.m10595a(this.f23953d, next2);
                                if (c4123d1M10595a != null) {
                                    c4517gM10644q2 = m10644q();
                                    str6 = this.f23953d;
                                    strM9519D = c4123d1M10595a.m9519D();
                                    c4577lM10585z = c4517gM10644q2.m10585z(str6, next2.m9519D());
                                    if (c4577lM10585z == null) {
                                        c4517gM10644q2.mo10684l().f24421i.m10813c("Event aggregate wasn't created during raw event logging. appId, event", C4662s3.m10738s(str6), c4517gM10644q2.m10816e().m10718u(strM9519D));
                                        c4577l = new C4577l(str6, next2.m9519D(), 1L, 1L, 1L, next2.m9521F(), 0L, null, null, null, null);
                                    } else {
                                        c4577l = new C4577l(c4577lM10585z.f24088a, c4577lM10585z.f24089b, c4577lM10585z.f24090c + 1, c4577lM10585z.f24091d + 1, c4577lM10585z.f24092e + 1, c4577lM10585z.f24093f, c4577lM10585z.f24094g, c4577lM10585z.f24095h, c4577lM10585z.f24096i, c4577lM10585z.f24097j, c4577lM10585z.f24098k);
                                    }
                                    m10644q().m10548H(c4577l);
                                    j2 = c4577l.f24090c;
                                    strM9519D2 = c4123d1M10595a.m9519D();
                                    mapM10569c0 = (Map) arrayMap2.get(strM9519D2);
                                    if (mapM10569c0 == null) {
                                        mapM10569c0 = m10644q().m10569c0(this.f23953d, strM9519D2);
                                        if (C4395w9.m10313a()) {
                                            c4540ha2 = c4540ha;
                                            if (!this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24307F0)) {
                                            }
                                            arrayMap2.put(strM9519D2, mapM10569c0);
                                        } else {
                                            c4540ha2 = c4540ha;
                                        }
                                        if (mapM10569c0 == null) {
                                            mapM10569c0 = new ArrayMap();
                                        }
                                        arrayMap2.put(strM9519D2, mapM10569c0);
                                    } else {
                                        c4540ha2 = c4540ha;
                                    }
                                    it5 = mapM10569c0.keySet().iterator();
                                    while (it5.hasNext()) {
                                        iIntValue2 = it5.next().intValue();
                                        if (this.f23954e.contains(Integer.valueOf(iIntValue2))) {
                                            mo10684l().f24426n.m10812b("Skipping failed audience ID", Integer.valueOf(iIntValue2));
                                        } else {
                                            it6 = mapM10569c0.get(Integer.valueOf(iIntValue2)).iterator();
                                            zM10634i = true;
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    it7 = it5;
                                                    arrayMap3 = arrayMap2;
                                                    it8 = it4;
                                                    break;
                                                }
                                                C4276o0 next3 = it6.next();
                                                it7 = it5;
                                                arrayMap3 = arrayMap2;
                                                c4576ka = new C4576ka(this, this.f23953d, iIntValue2, next3);
                                                it8 = it4;
                                                zM10634i = c4576ka.m10634i(this.f23956g, this.f23957h, c4123d1M10595a, j2, c4577l, m10592u(iIntValue2, next3.m10113w()));
                                                if (zM10634i) {
                                                    this.f23954e.add(Integer.valueOf(iIntValue2));
                                                    break;
                                                }
                                                m10590s(iIntValue2).m10604b(c4576ka);
                                                it5 = it7;
                                                arrayMap2 = arrayMap3;
                                                it4 = it8;
                                            }
                                            if (!zM10634i) {
                                                this.f23954e.add(Integer.valueOf(iIntValue2));
                                            }
                                            it5 = it7;
                                            arrayMap2 = arrayMap3;
                                            it4 = it8;
                                        }
                                    }
                                    c4540ha = c4540ha2;
                                }
                            }
                        }
                        if (!list2.isEmpty()) {
                            arrayMap = new ArrayMap();
                            while (r2.hasNext()) {
                                strM9931B = c4235l1.m9931B();
                                mapM10570d0 = (Map) arrayMap.get(strM9931B);
                                if (mapM10570d0 == null) {
                                    mapM10570d0 = m10644q().m10570d0(this.f23953d, strM9931B);
                                    mapM10570d0 = C4395w9.m10313a() ? new ArrayMap<>() : new ArrayMap<>();
                                    arrayMap.put(strM9931B, mapM10570d0);
                                }
                                it2 = mapM10570d0.keySet().iterator();
                                while (it2.hasNext()) {
                                    iIntValue = it2.next().intValue();
                                    if (this.f23954e.contains(Integer.valueOf(iIntValue))) {
                                        mo10684l().f24426n.m10812b(str4, Integer.valueOf(iIntValue));
                                        break;
                                    }
                                    it3 = mapM10570d0.get(Integer.valueOf(iIntValue)).iterator();
                                    zM10649i = true;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            arrayMap = arrayMap;
                                            str4 = str4;
                                            break;
                                        }
                                        next = it3.next();
                                        if (mo10684l().m10750x(2)) {
                                            C4684u3 c4684u3 = mo10684l().f24426n;
                                            Integer numValueOf3 = Integer.valueOf(iIntValue);
                                            if (next.m10178t()) {
                                                numValueOf2 = Integer.valueOf(next.m10179u());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            c4684u3.m10814d("Evaluating filter. audience, filter, property", numValueOf3, numValueOf2, m10816e().m10721y(next.m10180v()));
                                            mo10684l().f24426n.m10812b("Filter definition", m10641h().m10809y(next));
                                        } else {
                                            arrayMap = arrayMap;
                                        }
                                        if (next.m10178t()) {
                                        }
                                        C4684u3 c4684u4 = mo10684l().f24421i;
                                        Object objM10738s = C4662s3.m10738s(this.f23953d);
                                        if (next.m10178t()) {
                                            numValueOf = Integer.valueOf(next.m10179u());
                                        } else {
                                            numValueOf = null;
                                        }
                                        c4684u4.m10813c("Invalid property filter ID. appId, id", objM10738s, String.valueOf(numValueOf));
                                        zM10649i = false;
                                        break;
                                        if (!zM10649i) {
                                            this.f23954e.add(Integer.valueOf(iIntValue));
                                        }
                                        arrayMap = arrayMap;
                                        str4 = str4;
                                        m10590s(iIntValue).m10604b(c4600ma);
                                        arrayMap = arrayMap;
                                        str4 = str4;
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        Set<Integer> setKeySet = this.f23955f.keySet();
                        setKeySet.removeAll(this.f23954e);
                        it = setKeySet.iterator();
                        while (it.hasNext()) {
                            int iIntValue3 = it.next().intValue();
                            C4095b1 c4095b1M10603a = this.f23955f.get(Integer.valueOf(iIntValue3)).m10603a(iIntValue3);
                            arrayList.add(c4095b1M10603a);
                            c4517gM10644q = m10644q();
                            str5 = this.f23953d;
                            C4207j1 c4207j1M9402y = c4095b1M10603a.m9402y();
                            c4517gM10644q.m10642i();
                            c4517gM10644q.mo10381b();
                            C2622l.m5359e(str5);
                            Objects.requireNonNull(c4207j1M9402y, "null reference");
                            byte[] bArrM10139f = c4207j1M9402y.m10139f();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str5);
                            contentValues.put(str3, Integer.valueOf(iIntValue3));
                            contentValues.put("current_results", bArrM10139f);
                            try {
                                try {
                                    if (c4517gM10644q.m10579t().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                        c4517gM10644q.mo10684l().f24418f.m10812b("Failed to insert filter results (got -1). appId", C4662s3.m10738s(str5));
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    c4517gM10644q.mo10684l().f24418f.m10813c("Error storing filter results. appId", C4662s3.m10738s(str5), e);
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                            }
                        }
                        return arrayList;
                    }
                    mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r7 = obj2;
                if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            r7 = 0;
            if (r7 != 0) {
                r7.close();
            }
            throw th;
        }
        if (((C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24307F0)) && map2 == null) || map2.isEmpty()) {
            str3 = "audience_id";
        } else {
            HashSet hashSet = new HashSet(map2.keySet());
            if (z) {
                String str11 = this.f23953d;
                C2622l.m5359e(str11);
                ArrayMap arrayMap6 = new ArrayMap();
                if (!map2.isEmpty()) {
                    C4517g c4517gM10644q6 = m10644q();
                    c4517gM10644q6.m10642i();
                    c4517gM10644q6.mo10381b();
                    C2622l.m5359e(str11);
                    ArrayMap arrayMap7 = new ArrayMap();
                    SQLiteDatabase sQLiteDatabaseM10579t2 = c4517gM10644q6.m10579t();
                    try {
                        try {
                            cursorRawQuery = sQLiteDatabaseM10579t2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str11, str11});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        int i6 = cursorRawQuery.getInt(0);
                                        List arrayList3 = (List) arrayMap7.get(Integer.valueOf(i6));
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                            arrayMap7.put(Integer.valueOf(i6), arrayList3);
                                        }
                                        try {
                                            arrayList3.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            c4517gM10644q6.mo10684l().f24418f.m10813c("Database error querying scoped filters. appId", C4662s3.m10738s(str11), e);
                                            if (C4395w9.m10313a() && c4517gM10644q6.f24476a.f24534h.m10423u(str11, C4647r.f24307F0)) {
                                                mapEmptyMap2 = Collections.emptyMap();
                                                if (cursorRawQuery != null) {
                                                    map4 = mapEmptyMap2;
                                                    cursorRawQuery.close();
                                                    map4 = mapEmptyMap2;
                                                }
                                            } else {
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                map4 = null;
                                            }
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                    cursorRawQuery.close();
                                    map4 = arrayMap7;
                                } else {
                                    Map mapEmptyMap4 = Collections.emptyMap();
                                    cursorRawQuery.close();
                                    map4 = mapEmptyMap4;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            cursorRawQuery = null;
                        } catch (Throwable th5) {
                            th = th5;
                            r8 = 0;
                            if (r8 != 0) {
                                r8.close();
                            }
                            throw th;
                        }
                        map4 = mapEmptyMap2;
                        Iterator it10 = map2.keySet().iterator();
                        while (it10.hasNext()) {
                            int iIntValue4 = ((Integer) it10.next()).intValue();
                            C4207j1 c4207j1 = (C4207j1) map2.get(Integer.valueOf(iIntValue4));
                            List<Integer> list4 = (List) map4.get(Integer.valueOf(iIntValue4));
                            if (list4 == null || list4.isEmpty()) {
                                it10 = it10;
                                arrayMap6.put(Integer.valueOf(iIntValue4), c4207j1);
                                it10 = it10;
                                map4 = map4;
                            } else {
                                List<Long> listM10797C = m10641h().m10797C(c4207j1.m9850C(), list4);
                                if (!listM10797C.isEmpty()) {
                                    C4207j1.a aVarM9423r = c4207j1.m9423r();
                                    if (aVarM9423r.f23087h) {
                                        aVarM9423r.m9431r();
                                        aVarM9423r.f23087h = false;
                                    }
                                    C4207j1.m9849z((C4207j1) aVarM9423r.f23086g);
                                    if (aVarM9423r.f23087h) {
                                        aVarM9423r.m9431r();
                                        aVarM9423r.f23087h = false;
                                    }
                                    C4207j1.m9840B((C4207j1) aVarM9423r.f23086g, listM10797C);
                                    List<Long> listM10797C2 = m10641h().m10797C(c4207j1.m9857t(), list4);
                                    if (aVarM9423r.f23087h) {
                                        aVarM9423r.m9431r();
                                        aVarM9423r.f23087h = false;
                                    }
                                    C4207j1.m9846u((C4207j1) aVarM9423r.f23086g);
                                    if (aVarM9423r.f23087h) {
                                        aVarM9423r.m9431r();
                                        aVarM9423r.f23087h = false;
                                    }
                                    C4207j1.m9848w((C4207j1) aVarM9423r.f23086g, listM10797C2);
                                    for (int i7 = 0; i7 < c4207j1.m9853H(); i7++) {
                                        if (list4.contains(Integer.valueOf(c4207j1.m9856s(i7).m9498v()))) {
                                            if (aVarM9423r.f23087h) {
                                                aVarM9423r.m9431r();
                                                aVarM9423r.f23087h = false;
                                            }
                                            C4207j1.m9847v((C4207j1) aVarM9423r.f23086g, i7);
                                        }
                                    }
                                    for (int i8 = 0; i8 < c4207j1.m9855J(); i8++) {
                                        if (list4.contains(Integer.valueOf(c4207j1.m9859y(i8).m9918w()))) {
                                            if (aVarM9423r.f23087h) {
                                                aVarM9423r.m9431r();
                                                aVarM9423r.f23087h = false;
                                            }
                                            C4207j1.m9839A((C4207j1) aVarM9423r.f23086g, i8);
                                        }
                                    }
                                    arrayMap6.put(Integer.valueOf(iIntValue4), (C4207j1) ((AbstractC4099b5) aVarM9423r.m9433t()));
                                    it10 = it10;
                                    map4 = map4;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r8 = sQLiteDatabaseM10579t2;
                    }
                }
                map3 = arrayMap6;
            } else {
                str8 = "audience_id";
                map3 = map2;
            }
            Iterator it11 = hashSet.iterator();
            Map map5 = map;
            while (it11.hasNext()) {
                int iIntValue5 = ((Integer) it11.next()).intValue();
                C4207j1 c4207j2 = (C4207j1) map3.get(Integer.valueOf(iIntValue5));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap8 = new ArrayMap();
                if (c4207j2 != null && c4207j2.m9853H() != 0) {
                    for (C4109c1 c4109c1 : c4207j2.m9852G()) {
                        if (c4109c1.m9497u()) {
                            arrayMap8.put(Integer.valueOf(c4109c1.m9498v()), c4109c1.m9499w() ? Long.valueOf(c4109c1.m9500x()) : null);
                        }
                    }
                }
                ArrayMap arrayMap9 = new ArrayMap();
                if (c4207j2 != null && c4207j2.m9855J() != 0) {
                    for (C4221k1 c4221k1 : c4207j2.m9854I()) {
                        if (c4221k1.m9917v() && c4221k1.m9920y() > 0) {
                            arrayMap9.put(Integer.valueOf(c4221k1.m9918w()), Long.valueOf(c4221k1.m9916s(c4221k1.m9920y() - 1)));
                        }
                        map3 = map3;
                    }
                }
                Map map6 = map3;
                if (c4207j2 != null) {
                    for (int i9 = 0; i9 < (c4207j2.m9858x() << 6); i9++) {
                        if (C4679t9.m10792Q(c4207j2.m9857t(), i9)) {
                            mo10684l().f24426n.m10813c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue5), Integer.valueOf(i9));
                            bitSet2.set(i9);
                            if (C4679t9.m10792Q(c4207j2.m9850C(), i9)) {
                                bitSet.set(i9);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayMap8.remove(Integer.valueOf(i9));
                        }
                    }
                }
                C4207j1 c4207j3 = (C4207j1) map2.get(Integer.valueOf(iIntValue5));
                if (z4 && z3 && (list3 = (List) map5.get(Integer.valueOf(iIntValue5))) != null && this.f23957h != null && this.f23956g != null) {
                    for (C4276o0 c4276o1 : list3) {
                        int iM10113w = c4276o1.m10113w();
                        long jLongValue = this.f23957h.longValue() / 1000;
                        if (c4276o1.m10108D()) {
                            jLongValue = this.f23956g.longValue() / 1000;
                        }
                        if (arrayMap8.containsKey(Integer.valueOf(iM10113w))) {
                            arrayMap8.put(Integer.valueOf(iM10113w), Long.valueOf(jLongValue));
                        }
                        if (arrayMap9.containsKey(Integer.valueOf(iM10113w))) {
                            arrayMap9.put(Integer.valueOf(iM10113w), Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f23955f.put(Integer.valueOf(iIntValue5), new C4552ia(this, this.f23953d, c4207j3, bitSet, bitSet2, arrayMap8, arrayMap9, null));
                str8 = str8;
                map5 = map5;
                map3 = map6;
            }
            str3 = str8;
        }
        str4 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            c4540ha = new C4540ha(this, null);
            arrayMap2 = new ArrayMap();
            it4 = list.iterator();
            while (it4.hasNext()) {
                next2 = it4.next();
                c4123d1M10595a = c4540ha.m10595a(this.f23953d, next2);
                if (c4123d1M10595a != null) {
                    c4517gM10644q2 = m10644q();
                    str6 = this.f23953d;
                    strM9519D = c4123d1M10595a.m9519D();
                    c4577lM10585z = c4517gM10644q2.m10585z(str6, next2.m9519D());
                    if (c4577lM10585z == null) {
                        c4517gM10644q2.mo10684l().f24421i.m10813c("Event aggregate wasn't created during raw event logging. appId, event", C4662s3.m10738s(str6), c4517gM10644q2.m10816e().m10718u(strM9519D));
                        c4577l = new C4577l(str6, next2.m9519D(), 1L, 1L, 1L, next2.m9521F(), 0L, null, null, null, null);
                    } else {
                        c4577l = new C4577l(c4577lM10585z.f24088a, c4577lM10585z.f24089b, c4577lM10585z.f24090c + 1, c4577lM10585z.f24091d + 1, c4577lM10585z.f24092e + 1, c4577lM10585z.f24093f, c4577lM10585z.f24094g, c4577lM10585z.f24095h, c4577lM10585z.f24096i, c4577lM10585z.f24097j, c4577lM10585z.f24098k);
                    }
                    m10644q().m10548H(c4577l);
                    j2 = c4577l.f24090c;
                    strM9519D2 = c4123d1M10595a.m9519D();
                    mapM10569c0 = (Map) arrayMap2.get(strM9519D2);
                    if (mapM10569c0 == null) {
                        mapM10569c0 = m10644q().m10569c0(this.f23953d, strM9519D2);
                        if (C4395w9.m10313a()) {
                            c4540ha2 = c4540ha;
                            if (!this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24307F0)) {
                            }
                            arrayMap2.put(strM9519D2, mapM10569c0);
                        } else {
                            c4540ha2 = c4540ha;
                        }
                        if (mapM10569c0 == null) {
                            mapM10569c0 = new ArrayMap();
                        }
                        arrayMap2.put(strM9519D2, mapM10569c0);
                    } else {
                        c4540ha2 = c4540ha;
                    }
                    it5 = mapM10569c0.keySet().iterator();
                    while (it5.hasNext()) {
                        iIntValue2 = it5.next().intValue();
                        if (this.f23954e.contains(Integer.valueOf(iIntValue2))) {
                            mo10684l().f24426n.m10812b("Skipping failed audience ID", Integer.valueOf(iIntValue2));
                        } else {
                            it6 = mapM10569c0.get(Integer.valueOf(iIntValue2)).iterator();
                            zM10634i = true;
                            while (true) {
                                if (it6.hasNext()) {
                                    it7 = it5;
                                    arrayMap3 = arrayMap2;
                                    it8 = it4;
                                    break;
                                }
                                C4276o0 next4 = it6.next();
                                it7 = it5;
                                arrayMap3 = arrayMap2;
                                c4576ka = new C4576ka(this, this.f23953d, iIntValue2, next4);
                                it8 = it4;
                                zM10634i = c4576ka.m10634i(this.f23956g, this.f23957h, c4123d1M10595a, j2, c4577l, m10592u(iIntValue2, next4.m10113w()));
                                if (zM10634i) {
                                    this.f23954e.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                m10590s(iIntValue2).m10604b(c4576ka);
                                it5 = it7;
                                arrayMap2 = arrayMap3;
                                it4 = it8;
                            }
                            if (!zM10634i) {
                                this.f23954e.add(Integer.valueOf(iIntValue2));
                            }
                            it5 = it7;
                            arrayMap2 = arrayMap3;
                            it4 = it8;
                        }
                    }
                    c4540ha = c4540ha2;
                }
            }
        }
        if (!list2.isEmpty()) {
            arrayMap = new ArrayMap();
            for (C4235l1 c4235l1 : list2) {
                strM9931B = c4235l1.m9931B();
                mapM10570d0 = (Map) arrayMap.get(strM9931B);
                if (mapM10570d0 == null) {
                    mapM10570d0 = m10644q().m10570d0(this.f23953d, strM9931B);
                    if ((C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(this.f23953d, C4647r.f24307F0)) && mapM10570d0 == null) {
                    }
                    arrayMap.put(strM9931B, mapM10570d0);
                }
                it2 = mapM10570d0.keySet().iterator();
                while (it2.hasNext()) {
                    iIntValue = it2.next().intValue();
                    if (this.f23954e.contains(Integer.valueOf(iIntValue))) {
                        mo10684l().f24426n.m10812b(str4, Integer.valueOf(iIntValue));
                        break;
                        break;
                    }
                    it3 = mapM10570d0.get(Integer.valueOf(iIntValue)).iterator();
                    zM10649i = true;
                    while (true) {
                        if (it3.hasNext()) {
                            arrayMap = arrayMap;
                            str4 = str4;
                            break;
                        }
                        next = it3.next();
                        if (mo10684l().m10750x(2)) {
                            C4684u3 c4684u5 = mo10684l().f24426n;
                            Integer numValueOf4 = Integer.valueOf(iIntValue);
                            if (next.m10178t()) {
                                numValueOf2 = Integer.valueOf(next.m10179u());
                            } else {
                                numValueOf2 = null;
                            }
                            c4684u5.m10814d("Evaluating filter. audience, filter, property", numValueOf4, numValueOf2, m10816e().m10721y(next.m10180v()));
                            mo10684l().f24426n.m10812b("Filter definition", m10641h().m10809y(next));
                        } else {
                            arrayMap = arrayMap;
                        }
                        if (next.m10178t() || next.m10179u() > 256) {
                            C4684u3 c4684u6 = mo10684l().f24421i;
                            Object objM10738s2 = C4662s3.m10738s(this.f23953d);
                            if (next.m10178t()) {
                                numValueOf = Integer.valueOf(next.m10179u());
                            } else {
                                numValueOf = null;
                            }
                            c4684u6.m10813c("Invalid property filter ID. appId, id", objM10738s2, String.valueOf(numValueOf));
                            zM10649i = false;
                            break;
                        }
                        c4600ma = new C4600ma(this, this.f23953d, iIntValue, next);
                        zM10649i = c4600ma.m10649i(this.f23956g, this.f23957h, c4235l1, m10592u(iIntValue, next.m10179u()));
                        if (!zM10649i) {
                            this.f23954e.add(Integer.valueOf(iIntValue));
                            break;
                        }
                        m10590s(iIntValue).m10604b(c4600ma);
                        arrayMap = arrayMap;
                        str4 = str4;
                    }
                    if (!zM10649i) {
                        this.f23954e.add(Integer.valueOf(iIntValue));
                    }
                    arrayMap = arrayMap;
                    str4 = str4;
                }
            }
        }
        arrayList = new ArrayList();
        Set<Integer> setKeySet2 = this.f23955f.keySet();
        setKeySet2.removeAll(this.f23954e);
        it = setKeySet2.iterator();
        while (it.hasNext()) {
            int iIntValue6 = it.next().intValue();
            C4095b1 c4095b1M10603a2 = this.f23955f.get(Integer.valueOf(iIntValue6)).m10603a(iIntValue6);
            arrayList.add(c4095b1M10603a2);
            c4517gM10644q = m10644q();
            str5 = this.f23953d;
            C4207j1 c4207j1M9402y2 = c4095b1M10603a2.m9402y();
            c4517gM10644q.m10642i();
            c4517gM10644q.mo10381b();
            C2622l.m5359e(str5);
            Objects.requireNonNull(c4207j1M9402y2, "null reference");
            byte[] bArrM10139f2 = c4207j1M9402y2.m10139f();
            contentValues = new ContentValues();
            contentValues.put("app_id", str5);
            contentValues.put(str3, Integer.valueOf(iIntValue6));
            contentValues.put("current_results", bArrM10139f2);
            if (c4517gM10644q.m10579t().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c4517gM10644q.mo10684l().f24418f.m10812b("Failed to insert filter results (got -1). appId", C4662s3.m10738s(str5));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10592u(int i, int i2) {
        if (this.f23955f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f23955f.get(Integer.valueOf(i)).f24013d.get(i2);
    }
}
