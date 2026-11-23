package p007c.p190n.p385d.p391l.p392e.p395k;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.ImmutableList3;
import p007c.p190n.p385d.p391l.p392e.p409t.StackTraceTrimmingStrategy;
import p007c.p190n.p385d.p391l.p392e.p409t.TrimmedThrowableData;

/* JADX INFO: renamed from: c.n.d.l.e.k.j0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsReportDataCapture.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsReportDataCapture {

    /* JADX INFO: renamed from: a */
    public static final String f26526a = String.format(Locale.US, "Crashlytics Android SDK/%s", "17.3.0");

    /* JADX INFO: renamed from: b */
    public static final Map<String, Integer> f26527b;

    /* JADX INFO: renamed from: c */
    public final Context f26528c;

    /* JADX INFO: renamed from: d */
    public final IdManager f26529d;

    /* JADX INFO: renamed from: e */
    public final AppData f26530e;

    /* JADX INFO: renamed from: f */
    public final StackTraceTrimmingStrategy f26531f;

    static {
        HashMap map = new HashMap();
        f26527b = map;
        outline.m1563N(5, map, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.f26528c = context;
        this.f26529d = idManager;
        this.f26530e = appData;
        this.f26531f = stackTraceTrimmingStrategy;
    }

    /* JADX INFO: renamed from: a */
    public final CrashlyticsReport.d.AbstractC8523d.a.b.c m11767a(TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) {
        String str = trimmedThrowableData.f27008b;
        String str2 = trimmedThrowableData.f27007a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f27009c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f27010d;
        if (i3 >= i2) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.f27010d;
                i4++;
            }
        }
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.b bVar = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.b();
        Objects.requireNonNull(str, "Null type");
        bVar.f26817a = str;
        bVar.f26818b = str2;
        bVar.f26819c = new ImmutableList3<>(m11768b(stackTraceElementArr, i));
        bVar.f26821e = Integer.valueOf(i4);
        if (trimmedThrowableData2 != null && i4 == 0) {
            bVar.f26820d = m11767a(trimmedThrowableData2, i, i2, i3 + 1);
        }
        return bVar.m11925a();
    }

    /* JADX INFO: renamed from: b */
    public final ImmutableList3<CrashlyticsReport.d.AbstractC8523d.a.b.e.AbstractC8532b> m11768b(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.b bVar = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.b();
            bVar.f26843e = Integer.valueOf(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            bVar.m11941c(jMax);
            bVar.m11942d(str);
            bVar.f26841c = fileName;
            bVar.m11940b(lineNumber);
            arrayList.add(bVar.m11939a());
        }
        return new ImmutableList3<>(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final CrashlyticsReport.d.AbstractC8523d.a.b.e m11769c(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.b bVar = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.b();
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        bVar.f26831a = name;
        bVar.f26832b = Integer.valueOf(i);
        bVar.f26833c = new ImmutableList3<>(m11768b(stackTraceElementArr, i));
        return bVar.m11933a();
    }
}
