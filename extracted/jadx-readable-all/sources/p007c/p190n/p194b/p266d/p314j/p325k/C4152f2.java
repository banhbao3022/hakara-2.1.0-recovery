package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.TreeMap;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: c.n.b.d.j.k.f2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4152f2 implements InterfaceC4138e2 {

    /* JADX INFO: renamed from: a */
    public static C4152f2 f23151a;

    /* JADX INFO: renamed from: b */
    public final Context f23152b;

    /* JADX INFO: renamed from: c */
    public final ContentObserver f23153c;

    public C4152f2(Context context) {
        this.f23152b = context;
        C4194i2 c4194i2 = new C4194i2();
        this.f23153c = c4194i2;
        context.getContentResolver().registerContentObserver(C4400x1.f23601a, true, c4194i2);
    }

    /* JADX INFO: renamed from: a */
    public static C4152f2 m9595a(Context context) {
        C4152f2 c4152f2;
        synchronized (C4152f2.class) {
            if (f23151a == null) {
                f23151a = C8162a.m16064i(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4152f2(context) : new C4152f2();
            }
            c4152f2 = f23151a;
        }
        return c4152f2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4138e2
    /* JADX INFO: renamed from: f */
    public final Object mo9407f(final String str) {
        if (this.f23152b == null) {
            return null;
        }
        try {
            return (String) C2622l.m5243E0(new InterfaceC4166g2(this, str) { // from class: c.n.b.d.j.k.j2

                /* JADX INFO: renamed from: a */
                public final C4152f2 f23247a;

                /* JADX INFO: renamed from: b */
                public final String f23248b;

                {
                    this.f23247a = this;
                    this.f23248b = str;
                }

                /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[Catch: all -> 0x011f, DONT_GENERATE, TryCatch #2 {all -> 0x011f, blocks: (B:4:0x000f, B:6:0x0015, B:10:0x005f, B:12:0x006a, B:15:0x0075, B:17:0x0078, B:19:0x007e, B:21:0x0086, B:23:0x008a, B:40:0x00d6, B:25:0x0092, B:32:0x00b9, B:43:0x00d9, B:44:0x00dc, B:33:0x00bc, B:35:0x00c9, B:38:0x00d4, B:45:0x00dd, B:46:0x00e0, B:7:0x0035, B:9:0x003d, B:28:0x00a7, B:30:0x00ad), top: B:74:0x000f, inners: #0 }] */
                @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4166g2
                public final Object zza() {
                    String str2;
                    C4152f2 c4152f2 = this.f23247a;
                    String str3 = this.f23248b;
                    ContentResolver contentResolver = c4152f2.f23152b.getContentResolver();
                    Uri uri = C4400x1.f23601a;
                    synchronized (C4400x1.class) {
                        try {
                            if (C4400x1.f23606f == null) {
                                C4400x1.f23605e.set(false);
                                C4400x1.f23606f = new HashMap<>();
                                C4400x1.f23611k = new Object();
                                C4400x1.f23612l = false;
                                contentResolver.registerContentObserver(C4400x1.f23601a, true, new C4387w1());
                            } else if (C4400x1.f23605e.getAndSet(false)) {
                                C4400x1.f23606f.clear();
                                C4400x1.f23607g.clear();
                                C4400x1.f23608h.clear();
                                C4400x1.f23609i.clear();
                                C4400x1.f23610j.clear();
                                C4400x1.f23611k = new Object();
                                C4400x1.f23612l = false;
                            }
                            Object obj = C4400x1.f23611k;
                            str2 = null;
                            if (C4400x1.f23606f.containsKey(str3)) {
                                String str4 = C4400x1.f23606f.get(str3);
                                str2 = str4 != null ? str4 : null;
                            } else {
                                for (String str5 : C4400x1.f23613m) {
                                    if (str3.startsWith(str5)) {
                                        if (!C4400x1.f23612l || C4400x1.f23606f.isEmpty()) {
                                            String[] strArr = C4400x1.f23613m;
                                            HashMap<String, String> map = C4400x1.f23606f;
                                            Cursor cursorQuery = contentResolver.query(C4400x1.f23602b, null, null, strArr, null);
                                            TreeMap treeMap = new TreeMap();
                                            if (cursorQuery != null) {
                                                while (cursorQuery.moveToNext()) {
                                                    try {
                                                        treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                                    } catch (Throwable th) {
                                                        cursorQuery.close();
                                                        throw th;
                                                    }
                                                }
                                                cursorQuery.close();
                                            }
                                            map.putAll(treeMap);
                                            C4400x1.f23612l = true;
                                            if (C4400x1.f23606f.containsKey(str3)) {
                                                String str6 = C4400x1.f23606f.get(str3);
                                                str2 = str6 != null ? str6 : null;
                                            }
                                        }
                                    }
                                }
                                Cursor cursorQuery2 = contentResolver.query(C4400x1.f23601a, null, null, new String[]{str3}, null);
                                if (cursorQuery2 != null) {
                                    try {
                                        if (cursorQuery2.moveToFirst()) {
                                            String string = cursorQuery2.getString(1);
                                            if (string != null && string.equals(null)) {
                                                string = null;
                                            }
                                            C4400x1.m10328a(obj, str3, string);
                                            str2 = string != null ? string : null;
                                        } else {
                                            C4400x1.m10328a(obj, str3, null);
                                        }
                                    } finally {
                                        cursorQuery2.close();
                                    }
                                } else if (cursorQuery2 != null) {
                                    cursorQuery2.close();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    public C4152f2() {
        this.f23152b = null;
        this.f23153c = null;
    }
}
