package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4123d1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4151f1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4179h1;
import p007c.p190n.p194b.p266d.p314j.p325k.C4276o0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4286oa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4318r0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4395w9;
import p007c.p190n.p194b.p266d.p314j.p325k.C4433z8;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.b.d.k.b.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4517g extends AbstractC4587l9 {

    /* JADX INFO: renamed from: d */
    public static final String[] f23925d = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: e */
    public static final String[] f23926e = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: f */
    public static final String[] f23927f = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f23928g = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f23929h = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f23930i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f23931j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f23932k = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: l */
    public final C4529h f23933l;

    /* JADX INFO: renamed from: m */
    public final C4539h9 f23934m;

    public C4517g(C4611n9 c4611n9) {
        super(c4611n9);
        this.f23934m = new C4539h9(this.f24476a.f24541o);
        this.f23933l = new C4529h(this, this.f24476a.f24528b, "google_app_measurement.db");
    }

    /* JADX INFO: renamed from: G */
    public static void m10541G(ContentValues contentValues, String str, Object obj) {
        C2622l.m5359e(str);
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object m10542A(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo10684l().f24418f.m10811a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            mo10684l().f24418f.m10812b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        mo10684l().f24418f.m10811a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX INFO: renamed from: B */
    public final String m10543B(long j2) throws Throwable {
        Cursor cursorRawQuery;
        mo10381b();
        m10642i();
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m10579t().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j2)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    mo10684l().f24426n.m10811a("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    mo10684l().f24418f.m10812b("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = j2;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00b2: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x00b2 */
    /* JADX INFO: renamed from: C */
    public final List<C4734y9> m10544C(String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m10579t().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    do {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j2 = cursorQuery.getLong(2);
                        Object objM10542A = m10542A(cursorQuery, 3);
                        if (objM10542A == null) {
                            mo10684l().f24418f.m10812b("Read invalid user property value, ignoring it. appId", C4662s3.m10738s(str));
                        } else {
                            arrayList.add(new C4734y9(str, str2, string, j2, objM10542A));
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    mo10684l().f24418f.m10813c("Error querying user properties. appId", C4662s3.m10738s(str), e);
                    if (!C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(str, C4647r.f24307F0)) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    List<C4734y9> listEmptyList = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public final List<Pair<C4179h1, Long>> m10545D(String str, int i, int i2) {
        mo10381b();
        m10642i();
        C2622l.m5339a(i > 0);
        C2622l.m5339a(i2 > 0);
        C2622l.m5359e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m10579t().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<C4179h1, Long>> listEmptyList = Collections.emptyList();
                    cursorQuery.close();
                    return listEmptyList;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                do {
                    long j2 = cursorQuery.getLong(0);
                    try {
                        byte[] bArrM10803S = m10641h().m10803S(cursorQuery.getBlob(1));
                        if (!arrayList.isEmpty() && bArrM10803S.length + length > i2) {
                            break;
                        }
                        try {
                            C4179h1.a aVar = (C4179h1.a) C4679t9.m10796x(C4179h1.m9684s0(), bArrM10803S);
                            if (!cursorQuery.isNull(2)) {
                                int i3 = cursorQuery.getInt(2);
                                if (aVar.f23087h) {
                                    aVar.m9431r();
                                    aVar.f23087h = false;
                                }
                                C4179h1.m9662U0((C4179h1) aVar.f23086g, i3);
                            }
                            length += bArrM10803S.length;
                            arrayList.add(Pair.create((C4179h1) ((AbstractC4099b5) aVar.m9433t()), Long.valueOf(j2)));
                        } catch (IOException e) {
                            mo10684l().f24418f.m10813c("Failed to merge queued bundle. appId", C4662s3.m10738s(str), e);
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    } catch (IOException e2) {
                        mo10684l().f24418f.m10813c("Failed to unzip queued bundle. appId", C4662s3.m10738s(str), e2);
                    }
                } while (length <= i2);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                mo10684l().f24418f.m10813c("Error querying bundles. appId", C4662s3.m10738s(str), e3);
                List<Pair<C4179h1, Long>> listEmptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    /* JADX INFO: renamed from: E */
    public final List<C4734y9> m10546E(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursorQuery;
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(str);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e) {
                        e = e;
                        cursorQuery = null;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(String.valueOf(str3).concat("*"));
                    sb.append(" and name glob ?");
                }
                cursorQuery = m10579t().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                try {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        while (arrayList.size() < 1000) {
                            String string = cursorQuery.getString(0);
                            long j2 = cursorQuery.getLong(1);
                            Object objM10542A = m10542A(cursorQuery, 2);
                            String string2 = cursorQuery.getString(3);
                            if (objM10542A == null) {
                                try {
                                    mo10684l().f24418f.m10814d("(2)Read invalid user property value, ignoring it", C4662s3.m10738s(str), string2, str3);
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    str4 = string2;
                                }
                            } else {
                                arrayList.add(new C4734y9(str, string2, string, j2, objM10542A));
                            }
                            if (!cursorQuery.moveToNext()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            str4 = string2;
                        }
                        mo10684l().f24418f.m10812b("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(CloseCodes.NORMAL_CLOSURE));
                        cursorQuery.close();
                        return arrayList;
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        mo10684l().f24418f.m10814d("(2)Error querying user properties", C4662s3.m10738s(str), str4, e);
        if (!C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(str, C4647r.f24307F0)) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
        List<C4734y9> listEmptyList = Collections.emptyList();
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: F */
    public final List<C4624oa> m10547F(String str, String[] strArr) {
        mo10381b();
        m10642i();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m10579t().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objM10542A = m10542A(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j2 = cursorQuery.getLong(6);
                    C4679t9 c4679t9M10641h = m10641h();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<C4625p> creator = C4625p.CREATOR;
                    C4625p c4625p = (C4625p) c4679t9M10641h.m10807u(blob, creator);
                    arrayList.add(new C4624oa(string, string2, new C4712w9(string3, cursorQuery.getLong(10), objM10542A, string2), cursorQuery.getLong(8), z, string4, c4625p, j2, (C4625p) m10641h().m10807u(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (C4625p) m10641h().m10807u(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                mo10684l().f24418f.m10812b("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(CloseCodes.NORMAL_CLOSURE));
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10812b("Error querying conditional user property value", e);
                List<C4624oa> listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m10548H(C4577l c4577l) {
        Objects.requireNonNull(c4577l, "null reference");
        mo10381b();
        m10642i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4577l.f24088a);
        contentValues.put("name", c4577l.f24089b);
        contentValues.put("lifetime_count", Long.valueOf(c4577l.f24090c));
        contentValues.put("current_bundle_count", Long.valueOf(c4577l.f24091d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c4577l.f24093f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c4577l.f24094g));
        contentValues.put("last_bundled_day", c4577l.f24095h);
        contentValues.put("last_sampled_complex_event_id", c4577l.f24096i);
        contentValues.put("last_sampling_rate", c4577l.f24097j);
        contentValues.put("current_session_count", Long.valueOf(c4577l.f24092e));
        Boolean bool = c4577l.f24098k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m10579t().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                mo10684l().f24418f.m10812b("Failed to insert/update event aggregates (got -1). appId", C4662s3.m10738s(c4577l.f24088a));
            }
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing event aggregates. appId", C4662s3.m10738s(c4577l.f24088a), e);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m10549I(C4474c4 c4474c4) {
        mo10381b();
        m10642i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4474c4.m10467o());
        contentValues.put("app_instance_id", c4474c4.m10471s());
        contentValues.put("gmp_app_id", c4474c4.m10474v());
        contentValues.put("resettable_device_id_hash", c4474c4.m10433E());
        contentValues.put("last_bundle_index", Long.valueOf(c4474c4.m10449U()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c4474c4.m10439K()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c4474c4.m10440L()));
        contentValues.put("app_version", c4474c4.m10441M());
        contentValues.put("app_store", c4474c4.m10443O());
        contentValues.put("gmp_version", Long.valueOf(c4474c4.m10444P()));
        contentValues.put("dev_cert_hash", Long.valueOf(c4474c4.m10445Q()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c4474c4.m10448T()));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("day", Long.valueOf(c4474c4.f23780x));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("daily_public_events_count", Long.valueOf(c4474c4.f23781y));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("daily_events_count", Long.valueOf(c4474c4.f23782z));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("daily_conversions_count", Long.valueOf(c4474c4.f23750A));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("config_fetched_time", Long.valueOf(c4474c4.f23755F));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c4474c4.f23756G));
        contentValues.put("app_version_int", Long.valueOf(c4474c4.m10442N()));
        contentValues.put("firebase_instance_id", c4474c4.m10436H());
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("daily_error_events_count", Long.valueOf(c4474c4.f23751B));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c4474c4.f23752C));
        c4474c4.f23757a.mo10686n().mo10381b();
        contentValues.put("health_monitor_sample", c4474c4.f23753D);
        contentValues.put("android_id", Long.valueOf(c4474c4.m10459g()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c4474c4.m10460h()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(c4474c4.m10461i()));
        contentValues.put("admob_app_id", c4474c4.m10477y());
        contentValues.put("dynamite_version", Long.valueOf(c4474c4.m10447S()));
        if (c4474c4.m10463k() != null) {
            if (c4474c4.m10463k().size() == 0) {
                mo10684l().f24421i.m10812b("Safelisted events should not be an empty list. appId", c4474c4.m10467o());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c4474c4.m10463k()));
            }
        }
        if (C4286oa.m10122a() && this.f24476a.f24534h.m10423u(c4474c4.m10467o(), C4647r.f24356j0)) {
            contentValues.put("ga_app_id", c4474c4.m10430B());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM10579t = m10579t();
            if (sQLiteDatabaseM10579t.update("apps", contentValues, "app_id = ?", new String[]{c4474c4.m10467o()}) == 0 && sQLiteDatabaseM10579t.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                mo10684l().f24418f.m10812b("Failed to insert/update app (got -1). appId", C4662s3.m10738s(c4474c4.m10467o()));
            }
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing app. appId", C4662s3.m10738s(c4474c4.m10467o()), e);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m10550J(List<Long> list) {
        mo10381b();
        m10642i();
        Objects.requireNonNull(list, "null reference");
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (m10558R()) {
            String strJoin = TextUtils.join(",", list);
            String strM1587i = outline.m1587i(outline.m1558I(strJoin, 2), "(", strJoin, ")");
            if (m10559S(outline.m1587i(outline.m1558I(strM1587i, 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM1587i, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                mo10684l().f24421i.m10811a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM10579t = m10579t();
                StringBuilder sb = new StringBuilder(String.valueOf(strM1587i).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM1587i);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM10579t.execSQL(sb.toString());
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10812b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10551K(C4179h1 c4179h1, boolean z) {
        mo10381b();
        m10642i();
        C2622l.m5359e(c4179h1.m9708F1());
        C2622l.m5384j(c4179h1.m9745m1());
        m10575i0();
        long jMo5623c = this.f24476a.f24541o.mo5623c();
        if (c4179h1.m9747n1() < jMo5623c - C4469c.m10410B() || c4179h1.m9747n1() > C4469c.m10410B() + jMo5623c) {
            mo10684l().f24421i.m10814d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C4662s3.m10738s(c4179h1.m9708F1()), Long.valueOf(jMo5623c), Long.valueOf(c4179h1.m9747n1()));
        }
        try {
            byte[] bArrM10804T = m10641h().m10804T(c4179h1.m10139f());
            mo10684l().f24426n.m10812b("Saving bundle, size", Integer.valueOf(bArrM10804T.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c4179h1.m9708F1());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c4179h1.m9747n1()));
            contentValues.put("data", bArrM10804T);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c4179h1.m9738d0()) {
                contentValues.put("retry_count", Integer.valueOf(c4179h1.m9743l0()));
            }
            try {
                if (m10579t().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                mo10684l().f24418f.m10812b("Failed to insert bundle (got -1). appId", C4662s3.m10738s(c4179h1.m9708F1()));
                return false;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10813c("Error storing bundle. appId", C4662s3.m10738s(c4179h1.m9708F1()), e);
                return false;
            }
        } catch (IOException e2) {
            mo10684l().f24418f.m10813c("Data loss. Failed to serialize bundle. appId", C4662s3.m10738s(c4179h1.m9708F1()), e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m10552L(C4589m c4589m, long j2, boolean z) {
        mo10381b();
        m10642i();
        C2622l.m5359e(c4589m.f24134a);
        byte[] bArrM10139f = m10641h().m10808v(c4589m).m10139f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4589m.f24134a);
        contentValues.put("name", c4589m.f24135b);
        contentValues.put("timestamp", Long.valueOf(c4589m.f24137d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrM10139f);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m10579t().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            mo10684l().f24418f.m10812b("Failed to insert raw event (got -1). appId", C4662s3.m10738s(c4589m.f24134a));
            return false;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing raw event. appId", C4662s3.m10738s(c4589m.f24134a), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m10553M(C4734y9 c4734y9) {
        mo10381b();
        m10642i();
        if (m10565Y(c4734y9.f24610a, c4734y9.f24612c) == null) {
            if (C4723x9.m10857X(c4734y9.f24612c)) {
                long jM10559S = m10559S("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c4734y9.f24610a});
                C4469c c4469c = this.f24476a.f24534h;
                String str = c4734y9.f24610a;
                Objects.requireNonNull(c4469c);
                int iMax = 25;
                if (C4433z8.m10348a() && c4469c.m10423u(null, C4647r.f24382w0)) {
                    iMax = Math.max(Math.min(c4469c.m10419q(str, C4647r.f24308G), 100), 25);
                }
                if (jM10559S >= iMax) {
                    return false;
                }
            } else if (!"_npa".equals(c4734y9.f24612c) && m10559S("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c4734y9.f24610a, c4734y9.f24611b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4734y9.f24610a);
        contentValues.put("origin", c4734y9.f24611b);
        contentValues.put("name", c4734y9.f24612c);
        contentValues.put("set_timestamp", Long.valueOf(c4734y9.f24613d));
        m10541G(contentValues, "value", c4734y9.f24614e);
        try {
            if (m10579t().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                mo10684l().f24418f.m10812b("Failed to insert/update user property (got -1). appId", C4662s3.m10738s(c4734y9.f24610a));
            }
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing user property. appId", C4662s3.m10738s(c4734y9.f24610a), e);
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10554N(C4624oa c4624oa) {
        mo10381b();
        m10642i();
        if (m10565Y(c4624oa.f24238f, c4624oa.f24240h.f24562g) == null && m10559S("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{c4624oa.f24238f}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4624oa.f24238f);
        contentValues.put("origin", c4624oa.f24239g);
        contentValues.put("name", c4624oa.f24240h.f24562g);
        m10541G(contentValues, "value", c4624oa.f24240h.m10847H());
        contentValues.put("active", Boolean.valueOf(c4624oa.f24242j));
        contentValues.put("trigger_event_name", c4624oa.f24243k);
        contentValues.put("trigger_timeout", Long.valueOf(c4624oa.f24245m));
        m10817f();
        contentValues.put("timed_out_event", C4723x9.m10860g0(c4624oa.f24244l));
        contentValues.put("creation_timestamp", Long.valueOf(c4624oa.f24241i));
        m10817f();
        contentValues.put("triggered_event", C4723x9.m10860g0(c4624oa.f24246n));
        contentValues.put("triggered_timestamp", Long.valueOf(c4624oa.f24240h.f24563h));
        contentValues.put("time_to_live", Long.valueOf(c4624oa.f24247o));
        m10817f();
        contentValues.put("expired_event", C4723x9.m10860g0(c4624oa.f24248p));
        try {
            if (m10579t().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                mo10684l().f24418f.m10812b("Failed to insert/update conditional user property (got -1)", C4662s3.m10738s(c4624oa.f24238f));
            }
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing conditional user property", C4662s3.m10738s(c4624oa.f24238f), e);
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m10555O(String str, int i, C4276o0 c4276o0) {
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        Objects.requireNonNull(c4276o0, "null reference");
        if (TextUtils.isEmpty(c4276o0.m10114x())) {
            mo10684l().f24421i.m10814d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C4662s3.m10738s(str), Integer.valueOf(i), String.valueOf(c4276o0.m10112v() ? Integer.valueOf(c4276o0.m10113w()) : null));
            return false;
        }
        byte[] bArrM10139f = c4276o0.m10139f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c4276o0.m10112v() ? Integer.valueOf(c4276o0.m10113w()) : null);
        contentValues.put("event_name", c4276o0.m10114x());
        contentValues.put("session_scoped", c4276o0.m10109E() ? Boolean.valueOf(c4276o0.m10110F()) : null);
        contentValues.put("data", bArrM10139f);
        try {
            if (m10579t().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo10684l().f24418f.m10812b("Failed to insert event filter (got -1). appId", C4662s3.m10738s(str));
            return true;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing event filter. appId", C4662s3.m10738s(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m10556P(String str, int i, C4318r0 c4318r0) {
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        Objects.requireNonNull(c4318r0, "null reference");
        if (TextUtils.isEmpty(c4318r0.m10180v())) {
            mo10684l().f24421i.m10814d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C4662s3.m10738s(str), Integer.valueOf(i), String.valueOf(c4318r0.m10178t() ? Integer.valueOf(c4318r0.m10179u()) : null));
            return false;
        }
        byte[] bArrM10139f = c4318r0.m10139f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c4318r0.m10178t() ? Integer.valueOf(c4318r0.m10179u()) : null);
        contentValues.put("property_name", c4318r0.m10180v());
        contentValues.put("session_scoped", c4318r0.m10184z() ? Boolean.valueOf(c4318r0.m10177A()) : null);
        contentValues.put("data", bArrM10139f);
        try {
            if (m10579t().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            mo10684l().f24418f.m10812b("Failed to insert property filter (got -1). appId", C4662s3.m10738s(str));
            return false;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing property filter. appId", C4662s3.m10738s(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10557Q(String str, Long l, long j2, C4123d1 c4123d1) {
        mo10381b();
        m10642i();
        Objects.requireNonNull(c4123d1, "null reference");
        C2622l.m5359e(str);
        Objects.requireNonNull(l, "null reference");
        byte[] bArrM10139f = c4123d1.m10139f();
        mo10684l().f24426n.m10813c("Saving complex main event, appId, data size", m10816e().m10718u(str), Integer.valueOf(bArrM10139f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrM10139f);
        try {
            if (m10579t().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            mo10684l().f24418f.m10812b("Failed to insert complex main event (got -1). appId", C4662s3.m10738s(str));
            return false;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing complex main event. appId", C4662s3.m10738s(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10558R() {
        return this.f24476a.f24528b.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: S */
    public final long m10559S(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m10579t().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10813c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public final C4474c4 m10560T(String str) throws Throwable {
        Cursor cursorQuery;
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        Cursor cursor = null;
        try {
            boolean z = true;
            cursorQuery = m10579t().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    C4474c4 c4474c4 = new C4474c4(this.f24132b.f24201k, str);
                    c4474c4.m10455c(cursorQuery.getString(0));
                    c4474c4.m10465m(cursorQuery.getString(1));
                    c4474c4.m10476x(cursorQuery.getString(2));
                    c4474c4.m10431C(cursorQuery.getLong(3));
                    c4474c4.m10453a(cursorQuery.getLong(4));
                    c4474c4.m10464l(cursorQuery.getLong(5));
                    c4474c4.m10432D(cursorQuery.getString(6));
                    c4474c4.m10435G(cursorQuery.getString(7));
                    c4474c4.m10472t(cursorQuery.getLong(8));
                    c4474c4.m10475w(cursorQuery.getLong(9));
                    c4474c4.m10457e(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    long j2 = cursorQuery.getLong(11);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23780x != j2;
                    c4474c4.f23780x = j2;
                    long j3 = cursorQuery.getLong(12);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23781y != j3;
                    c4474c4.f23781y = j3;
                    long j4 = cursorQuery.getLong(13);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23782z != j4;
                    c4474c4.f23782z = j4;
                    long j5 = cursorQuery.getLong(14);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23750A != j5;
                    c4474c4.f23750A = j5;
                    c4474c4.m10434F(cursorQuery.getLong(15));
                    c4474c4.m10437I(cursorQuery.getLong(16));
                    c4474c4.m10468p(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c4474c4.m10429A(cursorQuery.getString(18));
                    long j6 = cursorQuery.getLong(19);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23751B != j6;
                    c4474c4.f23751B = j6;
                    long j7 = cursorQuery.getLong(20);
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E |= c4474c4.f23752C != j7;
                    c4474c4.f23752C = j7;
                    c4474c4.m10438J(cursorQuery.getString(21));
                    long j8 = 0;
                    if (!this.f24476a.f24534h.m10417k(C4647r.f24386y0)) {
                        c4474c4.m10446R(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                    }
                    c4474c4.m10466n(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    if (!cursorQuery.isNull(24) && cursorQuery.getInt(24) == 0) {
                        z = false;
                    }
                    c4474c4.m10470r(z);
                    c4474c4.m10469q(cursorQuery.getString(25));
                    if (!cursorQuery.isNull(26)) {
                        j8 = cursorQuery.getLong(26);
                    }
                    c4474c4.m10478z(j8);
                    if (!cursorQuery.isNull(27)) {
                        c4474c4.m10456d(Arrays.asList(cursorQuery.getString(27).split(",", -1)));
                    }
                    if (C4286oa.m10122a() && this.f24476a.f24534h.m10423u(str, C4647r.f24356j0)) {
                        c4474c4.m10473u(cursorQuery.getString(28));
                    }
                    c4474c4.f23757a.mo10686n().mo10381b();
                    c4474c4.f23754E = false;
                    if (cursorQuery.moveToNext()) {
                        mo10684l().f24418f.m10812b("Got multiple records for app, expected one. appId", C4662s3.m10738s(str));
                    }
                    cursorQuery.close();
                    return c4474c4;
                } catch (SQLiteException e) {
                    e = e;
                    mo10684l().f24418f.m10813c("Error querying app. appId", C4662s3.m10738s(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: U */
    public final List<C4624oa> m10561U(String str, String str2, String str3) {
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m10547F(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: V */
    public final void m10562V(String str, String str2) {
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        try {
            m10579t().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10814d("Error deleting user property. appId", C4662s3.m10738s(str), m10816e().m10721y(str2), e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m10563W(String str, List<Integer> list) {
        C2622l.m5359e(str);
        m10642i();
        mo10381b();
        SQLiteDatabase sQLiteDatabaseM10579t = m10579t();
        try {
            long jM10559S = m10559S("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, this.f24476a.f24534h.m10419q(str, C4647r.f24306F)));
            if (jM10559S <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            String strM1587i = outline.m1587i(outline.m1558I(strJoin, 2), "(", strJoin, ")");
            return sQLiteDatabaseM10579t.delete("audience_filter_values", outline.m1587i(outline.m1558I(strM1587i, 140), "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", strM1587i, " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Database error querying filters. appId", C4662s3.m10738s(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: X */
    public final long m10564X(String str) {
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        try {
            return m10579t().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.f24476a.f24534h.m10419q(str, C4647r.f24367p))))});
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error deleting over the limit events. appId", C4662s3.m10738s(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX INFO: renamed from: Y */
    public final C4734y9 m10565Y(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = m10579t().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        C4734y9 c4734y9 = new C4734y9(str, cursorQuery.getString(2), str2, cursorQuery.getLong(0), m10542A(cursorQuery, 1));
                        if (cursorQuery.moveToNext()) {
                            mo10684l().f24418f.m10812b("Got multiple records for user property, expected one. appId", C4662s3.m10738s(str));
                        }
                        cursorQuery.close();
                        return c4734y9;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        mo10684l().f24418f.m10814d("Error querying user property. appId", C4662s3.m10738s(str), m10816e().m10721y(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX INFO: renamed from: Z */
    public final C4624oa m10566Z(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = m10579t().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    try {
                        Object objM10542A = m10542A(cursorQuery, 1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        String string2 = cursorQuery.getString(3);
                        long j2 = cursorQuery.getLong(4);
                        C4679t9 c4679t9M10641h = m10641h();
                        byte[] blob = cursorQuery.getBlob(5);
                        Parcelable.Creator<C4625p> creator = C4625p.CREATOR;
                        C4624oa c4624oa = new C4624oa(str, string, new C4712w9(str2, cursorQuery.getLong(8), objM10542A, string), cursorQuery.getLong(6), z, string2, (C4625p) c4679t9M10641h.m10807u(blob, creator), j2, (C4625p) m10641h().m10807u(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (C4625p) m10641h().m10807u(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            mo10684l().f24418f.m10813c("Got multiple records for conditional property, expected one", C4662s3.m10738s(str), m10816e().m10721y(str2));
                        }
                        cursorQuery.close();
                        return c4624oa;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        mo10684l().f24418f.m10814d("Error querying conditional property", C4662s3.m10738s(str), m10816e().m10721y(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m10567a0(String str, String str2) {
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        try {
            return m10579t().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10814d("Error deleting conditional property", C4662s3.m10738s(str), m10816e().m10721y(str2), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m10568b0() {
        m10642i();
        m10579t().beginTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX INFO: renamed from: c0 */
    public final Map<Integer, List<C4276o0>> m10569c0(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        ArrayMap arrayMap = new ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursorQuery = m10579t().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map<Integer, List<C4276o0>> mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C4276o0 c4276o0 = (C4276o0) ((AbstractC4099b5) ((C4276o0.a) C4679t9.m10796x(C4276o0.m10101G(), cursorQuery.getBlob(1))).m9433t());
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c4276o0);
                        } catch (IOException e) {
                            mo10684l().f24418f.m10813c("Failed to merge filter. appId", C4662s3.m10738s(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    mo10684l().f24418f.m10813c("Database error querying filters. appId", C4662s3.m10738s(str), e);
                    if (!C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(str, C4647r.f24307F0)) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    Map<Integer, List<C4276o0>> mapEmptyMap2 = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX INFO: renamed from: d0 */
    public final Map<Integer, List<C4318r0>> m10570d0(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        m10642i();
        mo10381b();
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        ArrayMap arrayMap = new ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursorQuery = m10579t().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        Map<Integer, List<C4318r0>> mapEmptyMap = Collections.emptyMap();
                        cursorQuery.close();
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            C4318r0 c4318r0 = (C4318r0) ((AbstractC4099b5) ((C4318r0.a) C4679t9.m10796x(C4318r0.m10174B(), cursorQuery.getBlob(1))).m9433t());
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) arrayMap.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c4318r0);
                        } catch (IOException e) {
                            mo10684l().f24418f.m10813c("Failed to merge filter", C4662s3.m10738s(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    mo10684l().f24418f.m10813c("Database error querying filters. appId", C4662s3.m10738s(str), e);
                    if (!C4395w9.m10313a() || !this.f24476a.f24534h.m10423u(str, C4647r.f24307F0)) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    Map<Integer, List<C4318r0>> mapEmptyMap2 = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap2;
                }
            } catch (Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m10571e0() {
        m10642i();
        m10579t().endTransaction();
    }

    /* JADX INFO: renamed from: f0 */
    public final long m10572f0(String str) {
        C2622l.m5359e(str);
        return m10582w("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: g0 */
    public final long m10573g0(String str, String str2) throws Throwable {
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        SQLiteDatabase sQLiteDatabaseM10579t = m10579t();
        sQLiteDatabaseM10579t.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(str2.length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    long jM10582w = m10582w(sb.toString(), new String[]{str}, -1L);
                    if (jM10582w == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseM10579t.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            mo10684l().f24418f.m10813c("Failed to insert column (got -1). appId", C4662s3.m10738s(str), str2);
                            sQLiteDatabaseM10579t.endTransaction();
                            return -1L;
                        }
                        jM10582w = 0;
                        mo10684l().f24418f.m10814d("Error inserting column. appId", C4662s3.m10738s(str), str2, e);
                        sQLiteDatabaseM10579t.endTransaction();
                        return j2;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put(str2, Long.valueOf(1 + jM10582w));
                        if (sQLiteDatabaseM10579t.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            mo10684l().f24418f.m10813c("Failed to update column (got 0). appId", C4662s3.m10738s(str), str2);
                            sQLiteDatabaseM10579t.endTransaction();
                            return -1L;
                        }
                        sQLiteDatabaseM10579t.setTransactionSuccessful();
                        sQLiteDatabaseM10579t.endTransaction();
                        return jM10582w;
                    } catch (SQLiteException e) {
                        e = e;
                        j2 = jM10582w;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabaseM10579t.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00ca: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00ca */
    /* JADX INFO: renamed from: h0 */
    public final Bundle m10574h0(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo10381b();
        m10642i();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m10579t().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        mo10684l().f24426n.m10811a("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        C4123d1 c4123d1 = (C4123d1) ((AbstractC4099b5) ((C4123d1.a) C4679t9.m10796x(C4123d1.m9510K(), cursorRawQuery.getBlob(0))).m9433t());
                        m10641h();
                        List<C4151f1> listM9528t = c4123d1.m9528t();
                        Bundle bundle = new Bundle();
                        for (C4151f1 c4151f1 : listM9528t) {
                            String strM9590z = c4151f1.m9590z();
                            if (c4151f1.m9585K()) {
                                bundle.putDouble(strM9590z, c4151f1.m9586L());
                            } else if (c4151f1.m9583I()) {
                                bundle.putFloat(strM9590z, c4151f1.m9584J());
                            } else if (c4151f1.m9579D()) {
                                bundle.putString(strM9590z, c4151f1.m9580E());
                            } else if (c4151f1.m9581G()) {
                                bundle.putLong(strM9590z, c4151f1.m9582H());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e) {
                        mo10684l().f24418f.m10813c("Failed to retrieve default event parameters. appId", C4662s3.m10738s(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    mo10684l().f24418f.m10812b("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
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
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10575i0() {
        int iDelete;
        mo10381b();
        m10642i();
        if (m10558R()) {
            long jM10610a = m10818g().f23894i.m10610a();
            long jMo5621a = this.f24476a.f24541o.mo5621a();
            if (Math.abs(jMo5621a - jM10610a) > C4647r.f24385y.m10638a(null).longValue()) {
                m10818g().f23894i.m10611b(jMo5621a);
                mo10381b();
                m10642i();
                if (!m10558R() || (iDelete = m10579t().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f24476a.f24541o.mo5623c()), String.valueOf(C4469c.m10410B())})) <= 0) {
                    return;
                }
                mo10684l().f24426n.m10812b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final long m10576j0() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m10579t().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10812b("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m10578s() {
        m10642i();
        m10579t().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: t */
    public final SQLiteDatabase m10579t() {
        mo10381b();
        try {
            return this.f23933l.getWritableDatabase();
        } catch (SQLiteException e) {
            mo10684l().f24421i.m10812b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: u */
    public final String m10580u() throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        ?? M10579t = m10579t();
        try {
            try {
                cursorRawQuery = M10579t.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    mo10684l().f24418f.m10812b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (M10579t != 0) {
                    M10579t.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            M10579t = 0;
            if (M10579t != 0) {
                M10579t.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public final long m10581v(C4179h1 c4179h1) throws IOException {
        mo10381b();
        m10642i();
        C2622l.m5359e(c4179h1.m9708F1());
        byte[] bArrM10139f = c4179h1.m10139f();
        long jM10806t = m10641h().m10806t(bArrM10139f);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c4179h1.m9708F1());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM10806t));
        contentValues.put("metadata", bArrM10139f);
        try {
            m10579t().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM10806t;
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10813c("Error storing raw event metadata. appId", C4662s3.m10738s(c4179h1.m9708F1()), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: w */
    public final long m10582w(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m10579t().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j2;
                }
                long j3 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j3;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10813c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final C4505f m10583x(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2622l.m5359e(str);
        mo10381b();
        m10642i();
        String[] strArr = {str};
        C4505f c4505f = new C4505f();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM10579t = m10579t();
                Cursor cursorQuery = sQLiteDatabaseM10579t.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    mo10684l().f24421i.m10812b("Not updating daily counts, app is not known. appId", C4662s3.m10738s(str));
                    cursorQuery.close();
                    return c4505f;
                }
                if (cursorQuery.getLong(0) == j2) {
                    c4505f.f23876b = cursorQuery.getLong(1);
                    c4505f.f23875a = cursorQuery.getLong(2);
                    c4505f.f23877c = cursorQuery.getLong(3);
                    c4505f.f23878d = cursorQuery.getLong(4);
                    c4505f.f23879e = cursorQuery.getLong(5);
                }
                if (z) {
                    c4505f.f23876b += j3;
                }
                if (z2) {
                    c4505f.f23875a += j3;
                }
                if (z3) {
                    c4505f.f23877c += j3;
                }
                if (z4) {
                    c4505f.f23878d += j3;
                }
                if (z5) {
                    c4505f.f23879e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(c4505f.f23875a));
                contentValues.put("daily_events_count", Long.valueOf(c4505f.f23876b));
                contentValues.put("daily_conversions_count", Long.valueOf(c4505f.f23877c));
                contentValues.put("daily_error_events_count", Long.valueOf(c4505f.f23878d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c4505f.f23879e));
                sQLiteDatabaseM10579t.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c4505f;
            } catch (SQLiteException e) {
                mo10684l().f24418f.m10813c("Error updating daily counts. appId", C4662s3.m10738s(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c4505f;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public final C4505f m10584y(long j2, String str, boolean z, boolean z2) {
        return m10583x(j2, str, 1L, false, false, z, false, z2);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0143: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:64:0x0143 */
    /* JADX INFO: renamed from: z */
    public final C4577l m10585z(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        C2622l.m5359e(str);
        C2622l.m5359e(str2);
        mo10381b();
        m10642i();
        Cursor cursor3 = null;
        try {
            try {
                cursorQuery = m10579t().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j2 = cursorQuery.getLong(0);
                    long j3 = cursorQuery.getLong(1);
                    long j4 = cursorQuery.getLong(2);
                    long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        } catch (SQLiteException e) {
                            e = e;
                        }
                    }
                    cursor2 = cursorQuery;
                    try {
                        C4577l c4577l = new C4577l(str, str2, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursor2.moveToNext()) {
                            mo10684l().f24418f.m10812b("Got multiple records for event aggregates, expected one. appId", C4662s3.m10738s(str));
                        }
                        cursor2.close();
                        return c4577l;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorQuery = cursor2;
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor2;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursorQuery;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor3 = cursor;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
        }
        mo10684l().f24418f.m10814d("Error querying events. appId", C4662s3.m10738s(str), m10816e().m10718u(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }
}
