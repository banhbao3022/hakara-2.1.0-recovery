package p007c.p190n.p194b.p266d.p327k.p329b;

import android.database.sqlite.SQLiteException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.k.b.p9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4635p9 implements InterfaceC4462b4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f24275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4611n9 f24276b;

    public C4635p9(C4611n9 c4611n9, String str) {
        this.f24276b = c4611n9;
        this.f24275a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4462b4
    /* JADX INFO: renamed from: a */
    public final void mo10389a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C4611n9 c4611n9 = this.f24276b;
        c4611n9.m10673U();
        c4611n9.m10668P();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                c4611n9.f24209s = false;
                c4611n9.m10696x();
                throw th2;
            }
        }
        List<Long> list = c4611n9.f24213w;
        c4611n9.f24213w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                c4611n9.f24201k.m10834k().f23891f.m10611b(c4611n9.f24201k.f24541o.mo5623c());
                c4611n9.f24201k.m10834k().f23892g.m10611b(0L);
                c4611n9.m10695w();
                c4611n9.f24201k.mo10684l().f24426n.m10813c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                c4611n9.m10663K().m10568b0();
                try {
                    for (Long l : list) {
                        try {
                            C4517g c4517gM10663K = c4611n9.m10663K();
                            long jLongValue = l.longValue();
                            c4517gM10663K.mo10381b();
                            c4517gM10663K.m10642i();
                            try {
                                if (c4517gM10663K.m10579t().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e) {
                                c4517gM10663K.mo10684l().f24418f.m10812b("Failed to delete a bundle in a queue table", e);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            List<Long> list2 = c4611n9.f24214x;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    c4611n9.m10663K().m10578s();
                    c4611n9.m10663K().m10571e0();
                    c4611n9.f24214x = null;
                    if (c4611n9.m10662J().m10913u() && c4611n9.m10694v()) {
                        c4611n9.m10669Q();
                    } else {
                        c4611n9.f24215y = -1L;
                        c4611n9.m10695w();
                    }
                    c4611n9.f24204n = 0L;
                } catch (Throwable th3) {
                    c4611n9.m10663K().m10571e0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                c4611n9.f24201k.mo10684l().f24418f.m10812b("Database error while trying to delete uploaded bundles", e3);
                c4611n9.f24204n = c4611n9.f24201k.f24541o.mo5621a();
                c4611n9.f24201k.mo10684l().f24426n.m10812b("Disable upload, time", Long.valueOf(c4611n9.f24204n));
            }
        } else {
            c4611n9.f24201k.mo10684l().f24426n.m10813c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            c4611n9.f24201k.m10834k().f23892g.m10611b(c4611n9.f24201k.f24541o.mo5623c());
            if (i != 503 && i != 429) {
                z = false;
            }
            if (z) {
                c4611n9.f24201k.m10834k().f23893h.m10611b(c4611n9.f24201k.f24541o.mo5623c());
            }
            c4611n9.m10663K().m10550J(list);
            c4611n9.m10695w();
        }
        c4611n9.f24209s = false;
        c4611n9.m10696x();
    }
}
