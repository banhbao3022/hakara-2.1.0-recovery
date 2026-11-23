package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2765w;
import p007c.p190n.p194b.p266d.p327k.p329b.C4588la;
import p007c.p190n.p194b.p266d.p327k.p329b.C4662s3;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4783k;
import p007c.p190n.p194b.p266d.p333n.C4784l;
import p007c.p190n.p194b.p266d.p333n.C4786n;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4785m;
import p007c.p190n.p194b.p266d.p333n.RunnableC4780h0;

/* JADX INFO: renamed from: c.n.b.d.j.k.s8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4340s8 {

    /* JADX INFO: renamed from: a */
    public static C4588la f23453a;

    /* JADX INFO: renamed from: a */
    public static <TResult> TResult m10204a(AbstractC4781i<TResult> abstractC4781i) throws ExecutionException, InterruptedException {
        C2622l.m5369g("Must not be called on the main application thread");
        C2622l.m5379i(abstractC4781i, "Task must not be null");
        if (abstractC4781i.mo10940m()) {
            return (TResult) m10218o(abstractC4781i);
        }
        C4784l c4784l = new C4784l(null);
        m10217n(abstractC4781i, c4784l);
        c4784l.f24687a.await();
        return (TResult) m10218o(abstractC4781i);
    }

    /* JADX INFO: renamed from: b */
    public static <TResult> TResult m10205b(AbstractC4781i<TResult> abstractC4781i, long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C2622l.m5369g("Must not be called on the main application thread");
        C2622l.m5379i(abstractC4781i, "Task must not be null");
        C2622l.m5379i(timeUnit, "TimeUnit must not be null");
        if (abstractC4781i.mo10940m()) {
            return (TResult) m10218o(abstractC4781i);
        }
        C4784l c4784l = new C4784l(null);
        m10217n(abstractC4781i, c4784l);
        if (c4784l.f24687a.await(j2, timeUnit)) {
            return (TResult) m10218o(abstractC4781i);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: c */
    public static <TResult> AbstractC4781i<TResult> m10206c(Executor executor, Callable<TResult> callable) {
        C2622l.m5379i(executor, "Executor must not be null");
        C2622l.m5379i(callable, "Callback must not be null");
        C4778g0 c4778g0 = new C4778g0();
        executor.execute(new RunnableC4780h0(c4778g0, callable));
        return c4778g0;
    }

    /* JADX INFO: renamed from: d */
    public static <TResult> AbstractC4781i<TResult> m10207d(Exception exc) {
        C4778g0 c4778g0 = new C4778g0();
        c4778g0.m10943p(exc);
        return c4778g0;
    }

    /* JADX INFO: renamed from: e */
    public static <TResult> AbstractC4781i<TResult> m10208e(TResult tresult) {
        C4778g0 c4778g0 = new C4778g0();
        c4778g0.m10944q(tresult);
        return c4778g0;
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC4781i<Void> m10209f(Collection<? extends AbstractC4781i<?>> collection) {
        if (collection.isEmpty()) {
            return m10208e(null);
        }
        Iterator<? extends AbstractC4781i<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        C4778g0 c4778g0 = new C4778g0();
        C4786n c4786n = new C4786n(collection.size(), c4778g0);
        Iterator<? extends AbstractC4781i<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            m10217n(it2.next(), c4786n);
        }
        return c4778g0;
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m10210g(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
    }

    /* JADX INFO: renamed from: h */
    public static String m10211h(Context context, String str) {
        try {
            return new C2765w(context).m5611a(str);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m10212i(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Set<String> m10213j(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(outline.m1587i(outline.m1558I(str, 22), "SELECT * FROM ", str, " LIMIT 0"), null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m10214k(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m10215l(C4662s3 c4662s3, SQLiteDatabase sQLiteDatabase) {
        if (c4662s3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c4662s3.f24421i.m10811a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c4662s3.f24421i.m10811a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c4662s3.f24421i.m10811a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c4662s3.f24421i.m10811a("Failed to turn on database write permission for owner");
    }

    /* JADX INFO: renamed from: m */
    public static void m10216m(C4662s3 c4662s3, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        boolean zMoveToFirst;
        if (c4662s3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e) {
            c4662s3.f24421i.m10813c("Error querying for table", str, e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            zMoveToFirst = false;
        }
        if (!zMoveToFirst) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> setM10213j = m10213j(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!((HashSet) setM10213j).remove(str4)) {
                    StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!((HashSet) setM10213j).remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (((HashSet) setM10213j).isEmpty()) {
                return;
            }
            c4662s3.f24421i.m10813c("Table has extra columns. table, columns", str, TextUtils.join(", ", setM10213j));
        } catch (SQLiteException e2) {
            c4662s3.f24418f.m10812b("Failed to verify columns on table that was just created", str);
            throw e2;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10217n(AbstractC4781i<?> abstractC4781i, InterfaceC4785m interfaceC4785m) {
        Executor executor = C4783k.f24685b;
        abstractC4781i.mo10932e(executor, interfaceC4785m);
        abstractC4781i.mo10931d(executor, interfaceC4785m);
        abstractC4781i.mo10928a(executor, interfaceC4785m);
    }

    /* JADX INFO: renamed from: o */
    public static <TResult> TResult m10218o(AbstractC4781i<TResult> abstractC4781i) throws ExecutionException {
        if (abstractC4781i.mo10941n()) {
            return abstractC4781i.mo10937j();
        }
        if (abstractC4781i.mo10939l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC4781i.mo10936i());
    }
}
