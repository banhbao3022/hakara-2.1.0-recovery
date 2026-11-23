package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cw0 {

    /* JADX INFO: renamed from: a */
    public static gw1 f13137a;

    /* JADX INFO: renamed from: a */
    public static <V> kv1<V> m6231a(@NullableDecl V v) {
        return v == null ? (kv1<V>) hv1.f15025f : new hv1(v);
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<fu2> m6232b(SQLiteDatabase sQLiteDatabase) {
        ArrayList<fu2> arrayList = new ArrayList<>();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(fu2.m6862K(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (r82 e) {
                C2622l.m5408n3("Unable to deserialize proto from offline signals database:");
                C2622l.m5408n3(e.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m6233c(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        C2622l.m5458x3(sb.toString());
        C2096e.m4554C(str, th);
        if (i == 3) {
            return;
        }
        C2330u.f10884a.f10893h.m6648e(th, str);
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m6234d(AtomicReference<T> atomicReference, ze1<T> ze1Var) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            ze1Var.mo5685a(t);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            C2622l.m5241D3("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0035 A[EXC_TOP_SPLITTER, PHI: r0
  0x0035: PHI (r0v7 java.lang.String) = (r0v5 java.lang.String), (r0v3 java.lang.String) binds: [B:16:0x0033, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static boolean m6235e(pe2 pe2Var) throws IllegalAccessException, GeneralSecurityException, InvocationTargetException {
        Method methodM8111c;
        gw1 gw1VarM5450w0;
        if (f13137a != null) {
            return true;
        }
        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14151A1);
        if (str == null || str.length() == 0) {
            str = null;
            if (pe2Var != null && (methodM8111c = pe2Var.m8111c("LuumUSt3XUsuCPgSU82tKS4YGjV8vTZLYC/R4oEb+DVVcavZKXfpIbTF+tWtCDt5", "qpKEg2kaON5OfTQ+xGYzsoPXin1qhXR8JY9zG10Ev8g=")) != null) {
                str = (String) methodM8111c.invoke(null, new Object[0]);
            }
            if (str != null) {
                try {
                    nw1 nw1VarM5455x0 = C2622l.m5455x0(C2622l.m5337Z1(str, true));
                    for (n32 n32Var : yy1.f22140a.m7962v()) {
                        if (!n32Var.m7775x().isEmpty()) {
                            throw new GeneralSecurityException("Missing type_url.");
                        }
                        if (!n32Var.m7774v().isEmpty()) {
                            throw new GeneralSecurityException("Missing primitive_name.");
                        }
                        if (!n32Var.m7777z().isEmpty()) {
                            throw new GeneralSecurityException("Missing catalogue_name.");
                        }
                        if (n32Var.m7777z().equals("TinkAead") && !n32Var.m7777z().equals("TinkMac") && !n32Var.m7777z().equals("TinkHybridDecrypt") && !n32Var.m7777z().equals("TinkHybridEncrypt") && !n32Var.m7777z().equals("TinkPublicKeySign") && !n32Var.m7777z().equals("TinkPublicKeyVerify") && !n32Var.m7777z().equals("TinkStreamingAead") && !n32Var.m7777z().equals("TinkDeterministicAead")) {
                            cw1<?> cw1VarM6257a = cx1.m6257a(n32Var.m7777z());
                            cx1.m6261e(cw1VarM6257a.zza());
                            cx1.m6258b(cw1VarM6257a.m6256a(), n32Var.m7776y());
                        }
                    }
                    gw1VarM5450w0 = C2622l.m5450w0(nw1VarM5455x0);
                    f13137a = gw1VarM5450w0;
                    if (gw1VarM5450w0 != null) {
                        return true;
                    }
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
            }
        } else {
            nw1 nw1VarM5455x1 = C2622l.m5455x0(C2622l.m5337Z1(str, true));
            while (r0.hasNext()) {
                if (!n32Var.m7775x().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (!n32Var.m7774v().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (!n32Var.m7777z().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (n32Var.m7777z().equals("TinkAead")) {
                }
            }
            gw1VarM5450w0 = C2622l.m5450w0(nw1VarM5455x1);
            f13137a = gw1VarM5450w0;
            if (gw1VarM5450w0 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static int m6236f(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor cursorM6243m = m6243m(sQLiteDatabase, i);
        if (cursorM6243m.getCount() > 0) {
            cursorM6243m.moveToNext();
            i2 = cursorM6243m.getInt(cursorM6243m.getColumnIndexOrThrow("value"));
        } else {
            i2 = 0;
        }
        cursorM6243m.close();
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static <V> kv1<V> m6237g(Throwable th) {
        Objects.requireNonNull(th);
        return new gv1(th);
    }

    /* JADX INFO: renamed from: h */
    public static void m6238h(int i, long j2, String str, int i2, PriorityQueue<qq2> priorityQueue) {
        qq2 qq2Var = new qq2(j2, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f18414c <= i2 && priorityQueue.peek().f18412a <= j2)) && !priorityQueue.contains(qq2Var)) {
            priorityQueue.add(qq2Var);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m6239i(Context context, boolean z) {
        if (z) {
            C2622l.m5458x3("This request is sent from a test device.");
            return;
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        String strM7894l = C3331nn.m7894l(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strM7894l).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strM7894l);
        sb.append("\")) to get test ads on this device.");
        C2622l.m5458x3(sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public static long m6240j(SQLiteDatabase sQLiteDatabase) {
        long j2;
        Cursor cursorM6243m = m6243m(sQLiteDatabase, 2);
        if (cursorM6243m.getCount() > 0) {
            cursorM6243m.moveToNext();
            j2 = cursorM6243m.getLong(cursorM6243m.getColumnIndexOrThrow("value"));
        } else {
            j2 = 0;
        }
        cursorM6243m.close();
        return j2;
    }

    /* JADX INFO: renamed from: k */
    public static String m6241k(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C2622l.m5408n3("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static long m6242l(long j2, int i) {
        if (i == 1) {
            return j2;
        }
        return (i & 1) == 0 ? m6242l((j2 * j2) % 1073807359, i >> 1) % 1073807359 : ((m6242l((j2 * j2) % 1073807359, i >> 1) % 1073807359) * j2) % 1073807359;
    }

    /* JADX INFO: renamed from: m */
    public static Cursor m6243m(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    /* JADX INFO: renamed from: n */
    public static <O> kv1<O> m6244n(pu1<O> pu1Var, Executor executor) {
        yv1 yv1Var = new yv1(pu1Var);
        executor.execute(yv1Var);
        return yv1Var;
    }

    /* JADX INFO: renamed from: o */
    public static long m6245o(String[] strArr, int i, int i2) {
        long jM5375h0 = (((long) C2622l.m5375h0(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            jM5375h0 = (((((long) C2622l.m5375h0(strArr[i3])) + 2147483647L) % 1073807359) + ((jM5375h0 * 16785407) % 1073807359)) % 1073807359;
        }
        return jM5375h0;
    }

    /* JADX INFO: renamed from: p */
    public static <V, X extends Throwable> kv1<V> m6246p(kv1<? extends V> kv1Var, Class<X> cls, cs1<? super X, ? extends V> cs1Var, Executor executor) {
        qt1 qt1Var = new qt1(kv1Var, cls, cs1Var);
        Objects.requireNonNull(executor);
        if (executor != wu1.INSTANCE) {
            executor = new mv1(executor, qt1Var);
        }
        kv1Var.mo6230f(qt1Var, executor);
        return qt1Var;
    }

    /* JADX INFO: renamed from: q */
    public static <V, X extends Throwable> kv1<V> m6247q(kv1<? extends V> kv1Var, Class<X> cls, qu1<? super X, ? extends V> qu1Var, Executor executor) {
        pt1 pt1Var = new pt1(kv1Var, cls, qu1Var);
        Objects.requireNonNull(executor);
        if (executor != wu1.INSTANCE) {
            executor = new mv1(executor, pt1Var);
        }
        kv1Var.mo6230f(pt1Var, executor);
        return pt1Var;
    }

    /* JADX INFO: renamed from: r */
    public static <V> kv1<V> m6248r(kv1<V> kv1Var, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (kv1Var.isDone()) {
            return kv1Var;
        }
        vv1 vv1Var = new vv1(kv1Var);
        tv1 tv1Var = new tv1(vv1Var);
        vv1Var.f20952n = scheduledExecutorService.schedule(tv1Var, j2, timeUnit);
        kv1Var.mo6230f(tv1Var, wu1.INSTANCE);
        return vv1Var;
    }

    /* JADX INFO: renamed from: s */
    public static <I, O> kv1<O> m6249s(kv1<I> kv1Var, qu1<? super I, ? extends O> qu1Var, Executor executor) {
        int i = hu1.f15018m;
        Objects.requireNonNull(executor);
        fu1 fu1Var = new fu1(kv1Var, qu1Var);
        if (executor != wu1.INSTANCE) {
            executor = new mv1(executor, fu1Var);
        }
        kv1Var.mo6230f(fu1Var, executor);
        return fu1Var;
    }

    /* JADX INFO: renamed from: t */
    public static <I, O> kv1<O> m6250t(kv1<I> kv1Var, cs1<? super I, ? extends O> cs1Var, Executor executor) {
        int i = hu1.f15018m;
        Objects.requireNonNull(cs1Var);
        gu1 gu1Var = new gu1(kv1Var, cs1Var);
        Objects.requireNonNull(executor);
        if (executor != wu1.INSTANCE) {
            executor = new mv1(executor, gu1Var);
        }
        kv1Var.mo6230f(gu1Var, executor);
        return gu1Var;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: u */
    public static <V> fv1<V> m6251u(kv1<? extends V>... kv1VarArr) {
        ns1<Object> ns1Var = ts1.f19979g;
        Object[] objArr = (Object[]) kv1VarArr.clone();
        int length = objArr.length;
        C2622l.m5421q1(objArr, length);
        return new fv1<>(true, ts1.m8450v(objArr, length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static <V> fv1<V> m6252v(Iterable<? extends kv1<? extends V>> iterable) {
        ns1<Object> ns1Var = ts1.f19979g;
        Objects.requireNonNull(iterable);
        return new fv1<>(true, ts1.m8449u(iterable));
    }

    /* JADX INFO: renamed from: w */
    public static <V> void m6253w(kv1<V> kv1Var, dv1<? super V> dv1Var, Executor executor) {
        Objects.requireNonNull(dv1Var);
        kv1Var.mo6230f(new ev1(kv1Var, dv1Var), executor);
    }

    /* JADX INFO: renamed from: x */
    public static <V> V m6254x(Future<V> future) throws ExecutionException {
        if (future.isDone()) {
            return (V) C2622l.m5253G0(future);
        }
        throw new IllegalStateException(C2622l.m5302Q2("Future was expected to be done: %s", future));
    }

    /* JADX INFO: renamed from: y */
    public static <V> V m6255y(Future<V> future) {
        try {
            return (V) C2622l.m5253G0(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new xu1((Error) cause);
            }
            throw new zv1(cause);
        }
    }
}
