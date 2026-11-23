package p007c.p190n.p194b.p266d.p327k.p329b;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4151f1;

/* JADX INFO: renamed from: c.n.b.d.k.b.ha */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4540ha {

    /* JADX INFO: renamed from: a */
    public C4123d1 f23981a;

    /* JADX INFO: renamed from: b */
    public Long f23982b;

    /* JADX INFO: renamed from: c */
    public long f23983c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C4528ga f23984d;

    public C4540ha(C4528ga c4528ga, C4516fa c4516fa) {
        this.f23984d = c4528ga;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093 A[Catch: SQLiteException -> 0x00dd, all -> 0x01bc, TRY_LEAVE, TryCatch #3 {all -> 0x01bc, blocks: (B:25:0x008d, B:27:0x0093, B:29:0x00a3, B:30:0x00af, B:31:0x00c1, B:34:0x00ca, B:42:0x00e5), top: B:98:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[Catch: SQLiteException -> 0x00dd, all -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01bc, blocks: (B:25:0x008d, B:27:0x0093, B:29:0x00a3, B:30:0x00af, B:31:0x00c1, B:34:0x00ca, B:42:0x00e5), top: B:98:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [long] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: a */
    public final C4123d1 m10595a(String str, C4123d1 c4123d1) {
        C4517g c4517gM10644q;
        ?? r6;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        ?? LongValue;
        String strM9519D = c4123d1.m9519D();
        List<C4151f1> listM9528t = c4123d1.m9528t();
        this.f23984d.m10641h();
        Long l = (Long) C4679t9.m10793R(c4123d1, "_eid");
        boolean z = l != null;
        if (z && strM9519D.equals("_ep")) {
            this.f23984d.m10641h();
            String str2 = (String) C4679t9.m10793R(c4123d1, "_en");
            if (TextUtils.isEmpty(str2)) {
                this.f23984d.mo10684l().f24419g.m10812b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.f23981a == null || this.f23982b == null) {
                c4517gM10644q = this.f23984d.m10644q();
                c4517gM10644q.mo10381b();
                c4517gM10644q.m10642i();
                try {
                    try {
                        cursorRawQuery = c4517gM10644q.m10579t().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                try {
                                    pairCreate = Pair.create((C4123d1) ((AbstractC4099b5) ((C4123d1.a) C4679t9.m10796x(C4123d1.m9510K(), cursorRawQuery.getBlob(0))).m9433t()), Long.valueOf(cursorRawQuery.getLong(1)));
                                    cursorRawQuery.close();
                                } catch (IOException e) {
                                    c4517gM10644q.mo10684l().f24418f.m10814d("Failed to merge main event. appId, eventId", C4662s3.m10738s(str), l, e);
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                            } else {
                                c4517gM10644q.mo10684l().f24426n.m10811a("Main event not found");
                                cursorRawQuery.close();
                                pairCreate = null;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            c4517gM10644q.mo10684l().f24418f.m10812b("Error selecting main event", e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            pairCreate = null;
                            if (pairCreate != null) {
                            }
                            this.f23984d.mo10684l().f24419g.m10813c("Extra parameter without existing main event. eventName, eventId", str2, l);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r6 = LongValue;
                        if (r6 != 0) {
                            r6.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursorRawQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    r6 = 0;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
                if (pairCreate != null || (obj = pairCreate.first) == null) {
                    this.f23984d.mo10684l().f24419g.m10813c("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return null;
                }
                this.f23981a = (C4123d1) obj;
                this.f23983c = ((Long) pairCreate.second).longValue();
                this.f23984d.m10641h();
                this.f23982b = (Long) C4679t9.m10793R(this.f23981a, "_eid");
            } else {
                LongValue = l.longValue();
                if (LongValue != this.f23982b.longValue()) {
                    c4517gM10644q = this.f23984d.m10644q();
                    c4517gM10644q.mo10381b();
                    c4517gM10644q.m10642i();
                    cursorRawQuery = c4517gM10644q.m10579t().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                    if (cursorRawQuery.moveToFirst()) {
                        c4517gM10644q.mo10684l().f24426n.m10811a("Main event not found");
                        cursorRawQuery.close();
                        pairCreate = null;
                    } else {
                        pairCreate = Pair.create((C4123d1) ((AbstractC4099b5) ((C4123d1.a) C4679t9.m10796x(C4123d1.m9510K(), cursorRawQuery.getBlob(0))).m9433t()), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                    }
                    if (pairCreate != null) {
                    }
                    this.f23984d.mo10684l().f24419g.m10813c("Extra parameter without existing main event. eventName, eventId", str2, l);
                    return null;
                }
            }
            long j2 = this.f23983c - 1;
            this.f23983c = j2;
            if (j2 <= 0) {
                C4517g c4517gM10644q2 = this.f23984d.m10644q();
                c4517gM10644q2.mo10381b();
                c4517gM10644q2.mo10684l().f24426n.m10812b("Clearing complex main event info. appId", str);
                try {
                    c4517gM10644q2.m10579t().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e4) {
                    c4517gM10644q2.mo10684l().f24418f.m10812b("Error clearing complex main event", e4);
                }
            } else {
                this.f23984d.m10644q().m10557Q(str, l, this.f23983c, this.f23981a);
            }
            ArrayList arrayList = new ArrayList();
            for (C4151f1 c4151f1 : this.f23981a.m9528t()) {
                this.f23984d.m10641h();
                if (C4679t9.m10795w(c4123d1, c4151f1.m9590z()) == null) {
                    arrayList.add(c4151f1);
                }
            }
            if (arrayList.isEmpty()) {
                this.f23984d.mo10684l().f24419g.m10812b("No unique parameters in main event. eventName", str2);
            } else {
                arrayList.addAll(listM9528t);
                listM9528t = arrayList;
            }
            strM9519D = str2;
        } else if (z) {
            this.f23982b = l;
            this.f23981a = c4123d1;
            this.f23984d.m10641h();
            Object objM10793R = C4679t9.m10793R(c4123d1, "_epc");
            long jLongValue = ((Long) (objM10793R != null ? objM10793R : 0L)).longValue();
            this.f23983c = jLongValue;
            if (jLongValue <= 0) {
                this.f23984d.mo10684l().f24419g.m10812b("Complex event with zero extra param count. eventName", strM9519D);
            } else {
                this.f23984d.m10644q().m10557Q(str, l, this.f23983c, c4123d1);
            }
        }
        C4123d1.a aVarM9423r = c4123d1.m9423r();
        aVarM9423r.m9538y(strM9519D);
        if (aVarM9423r.f23087h) {
            aVarM9423r.m9431r();
            aVarM9423r.f23087h = false;
        }
        C4123d1.m9512u((C4123d1) aVarM9423r.f23086g);
        if (aVarM9423r.f23087h) {
            aVarM9423r.m9431r();
            aVarM9423r.f23087h = false;
        }
        C4123d1.m9517z((C4123d1) aVarM9423r.f23086g, listM9528t);
        return (C4123d1) ((AbstractC4099b5) aVarM9423r.m9433t());
    }
}
