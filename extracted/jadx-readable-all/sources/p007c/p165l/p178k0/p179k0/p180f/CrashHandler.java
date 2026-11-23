package p007c.p165l.p178k0.p179k0.p180f;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;
import p007c.p165l.p178k0.p179k0.InstrumentData;
import p007c.p165l.p178k0.p179k0.InstrumentUtility;
import p007c.p165l.p178k0.p179k0.InstrumentUtility2;

/* JADX INFO: renamed from: c.l.k0.k0.f.a, reason: use source file name */
/* JADX INFO: compiled from: CrashHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public static final String f4972a = CrashHandler.class.getCanonicalName();

    /* JADX INFO: renamed from: b */
    public static CrashHandler f4973b;

    /* JADX INFO: renamed from: c */
    public final Thread.UncaughtExceptionHandler f4974c;

    /* JADX INFO: renamed from: c.l.k0.k0.f.a$a */
    /* JADX INFO: compiled from: CrashHandler.java */
    public static class a implements Comparator<InstrumentData> {
        @Override // java.util.Comparator
        public int compare(InstrumentData instrumentData, InstrumentData instrumentData2) {
            InstrumentData instrumentData3 = instrumentData2;
            Long l = instrumentData.f4966e;
            if (l == null) {
                return -1;
            }
            Long l2 = instrumentData3.f4966e;
            if (l2 == null) {
                return 1;
            }
            return l2.compareTo(l);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.k0.f.a$b */
    /* JADX INFO: compiled from: CrashHandler.java */
    public static class b implements GraphRequest2.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f4975a;

        public b(ArrayList arrayList) {
            this.f4975a = arrayList;
        }

        @Override // p007c.p165l.GraphRequest2.c
        /* JADX INFO: renamed from: b */
        public void mo2263b(GraphResponse graphResponse) {
            try {
                if (graphResponse.f5409d == null && graphResponse.f5408c.getBoolean("success")) {
                    for (int i = 0; this.f4975a.size() > i; i++) {
                        InstrumentUtility2.m2504a(((InstrumentData) this.f4975a.get(i)).f4962a);
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4974c = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: a */
    public static void m2509a() {
        File[] fileArrListFiles;
        File fileM2505b = InstrumentUtility2.m2505b();
        if (fileM2505b == null) {
            fileArrListFiles = new File[0];
        } else {
            fileArrListFiles = fileM2505b.listFiles(new InstrumentUtility());
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            InstrumentData instrumentData = new InstrumentData(file);
            if ((instrumentData.f4965d == null || instrumentData.f4966e == null) ? false : true) {
                arrayList.add(instrumentData);
            }
        }
        Collections.sort(arrayList, new a());
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 5; i++) {
            jSONArray.put(arrayList.get(i));
        }
        InstrumentUtility2.m2507d("crash_reports", jSONArray, new b(arrayList));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        if (th == null) {
            z = false;
            break;
        }
        Throwable th2 = null;
        Throwable cause = th;
        loop0: while (true) {
            if (cause == null || cause == th2) {
                z = false;
                break;
            }
            for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                if (stackTraceElement.getClassName().startsWith("com.facebook")) {
                    z = true;
                    break loop0;
                }
            }
            th2 = cause;
            cause = cause.getCause();
        }
        if (z) {
            InstrumentData instrumentData = new InstrumentData(th, InstrumentData.a.CrashReport);
            if ((instrumentData.f4965d == null || instrumentData.f4966e == null) ? false : true) {
                InstrumentUtility2.m2508e(instrumentData.f4962a, instrumentData.toString());
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4974c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
