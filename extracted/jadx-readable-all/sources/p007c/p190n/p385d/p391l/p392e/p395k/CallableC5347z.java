package p007c.p190n.p385d.p391l.p392e.p395k;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_CustomAttribute;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Device;
import p007c.p190n.p385d.p391l.p392e.p397m.AutoValue_CrashlyticsReport_Session_Event_Log;
import p007c.p190n.p385d.p391l.p392e.p397m.CrashlyticsReport;
import p007c.p190n.p385d.p391l.p392e.p397m.ImmutableList3;
import p007c.p190n.p385d.p391l.p392e.p397m.p398x.CrashlyticsReportJsonTransform8;
import p007c.p190n.p385d.p391l.p392e.p400o.CrashlyticsReportPersistence7;
import p007c.p190n.p385d.p391l.p392e.p401p.ClsFileOutputStream;
import p007c.p190n.p385d.p391l.p392e.p401p.CodedOutputStream;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsController;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;
import p007c.p190n.p385d.p391l.p392e.p406s.p407h.Settings;
import p007c.p190n.p385d.p391l.p392e.p409t.TrimmedThrowableData;
import p007c.p190n.p385d.p413o.p415j.JsonDataEncoderBuilder4;

/* JADX INFO: renamed from: c.n.d.l.e.k.z */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class CallableC5347z implements Callable<AbstractC4781i<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Date f26642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f26643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f26644c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SettingsDataProvider f26645d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5335t f26646e;

    public CallableC5347z(C5335t c5335t, Date date, Throwable th, Thread thread, SettingsDataProvider settingsDataProvider) {
        this.f26646e = c5335t;
        this.f26642a = date;
        this.f26643b = th;
        this.f26644c = thread;
        this.f26645d = settingsDataProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [c.n.d.l.e.k.t] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Flushable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.Comparator, java.util.Comparator<java.io.File>] */
    /* JADX WARN: Type inference failed for: r5v35, types: [c.n.d.l.e.p.b, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.StringBuilder] */
    @Override // java.util.concurrent.Callable
    public AbstractC4781i<Void> call() throws Exception {
        int size;
        Iterator<File> it;
        File fileHasNext;
        CodedOutputStream codedOutputStreamM11993k;
        ?? r5;
        File[] fileArr;
        long time = this.f26642a.getTime() / 1000;
        ?? M11793i = this.f26646e.m11793i();
        if (M11793i == 0) {
            Logger4.f26421a.m11715d("Tried to write a fatal exception while no session was open.");
            return C4340s8.m10208e(null);
        }
        this.f26646e.f26594k.m11765a();
        SessionReportingCoordinator3 sessionReportingCoordinator3 = this.f26646e.f26587A;
        Throwable th = this.f26643b;
        Thread thread = this.f26644c;
        String strReplaceAll = M11793i.replaceAll("-", "");
        Objects.requireNonNull(sessionReportingCoordinator3);
        outline.m1566Q("Persisting fatal event for session ", strReplaceAll, Logger4.f26421a);
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator3.f26635a;
        int i = crashlyticsReportDataCapture.f26528c.getResources().getConfiguration().orientation;
        TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(th, crashlyticsReportDataCapture.f26531f);
        AutoValue_CrashlyticsReport_Session_Event.b bVar = new AutoValue_CrashlyticsReport_Session_Event.b();
        bVar.f26784b = "crash";
        bVar.f26783a = Long.valueOf(time);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoM11745h = CommonUtils.m11745h(crashlyticsReportDataCapture.f26530e.f26459d, crashlyticsReportDataCapture.f26528c);
        Boolean boolValueOf = runningAppProcessInfoM11745h != null ? Boolean.valueOf(runningAppProcessInfoM11745h.importance != 100) : null;
        AutoValue_CrashlyticsReport_Session_Event_Application.b bVar2 = new AutoValue_CrashlyticsReport_Session_Event_Application.b();
        bVar2.f26794c = boolValueOf;
        bVar2.f26795d = Integer.valueOf(i);
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.b bVar3 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(crashlyticsReportDataCapture.m11769c(thread, trimmedThrowableData.f27009c, 4));
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
            Thread key = next.getKey();
            if (!key.equals(thread)) {
                arrayList.add(crashlyticsReportDataCapture.m11769c(key, crashlyticsReportDataCapture.f26531f.mo12043a(next.getValue()), 0));
            }
            thread = thread;
            it2 = it3;
        }
        bVar3.f26800a = new ImmutableList3<>(arrayList);
        CrashlyticsReport.d.AbstractC8523d.a.b.c cVarM11767a = crashlyticsReportDataCapture.m11767a(trimmedThrowableData, 4, 8, 0);
        Objects.requireNonNull(cVarM11767a, "Null exception");
        bVar3.f26801b = cVarM11767a;
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.b bVar4 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.b();
        bVar4.f26825a = "0";
        bVar4.f26826b = "0";
        bVar4.f26827c = 0L;
        bVar3.f26802c = bVar4.m11929a();
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.b bVar5 = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.b();
        bVar5.f26808a = 0L;
        bVar5.f26809b = 0L;
        String str = crashlyticsReportDataCapture.f26530e.f26459d;
        Objects.requireNonNull(str, "Null name");
        bVar5.f26810c = str;
        bVar5.f26811d = crashlyticsReportDataCapture.f26530e.f26457b;
        bVar3.f26803d = new ImmutableList3<>(Arrays.asList(bVar5.m11919a()));
        bVar2.f26792a = bVar3.m11914a();
        bVar.m11901b(bVar2.mo11908a());
        BatteryState batteryStateM11735a = BatteryState.m11735a(crashlyticsReportDataCapture.f26528c);
        Float f = batteryStateM11735a.f26478a;
        Double dValueOf = f != null ? Double.valueOf(f.doubleValue()) : null;
        int iM11736b = batteryStateM11735a.m11736b();
        boolean zM11749l = CommonUtils.m11749l(crashlyticsReportDataCapture.f26528c);
        long jM11752o = CommonUtils.m11752o();
        Context context = crashlyticsReportDataCapture.f26528c;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j2 = jM11752o - memoryInfo.availMem;
        long jM11738a = CommonUtils.m11738a(Environment.getDataDirectory().getPath());
        AutoValue_CrashlyticsReport_Session_Event_Device.b bVar6 = new AutoValue_CrashlyticsReport_Session_Event_Device.b();
        bVar6.f26850a = dValueOf;
        bVar6.f26851b = Integer.valueOf(iM11736b);
        bVar6.f26852c = Boolean.valueOf(zM11749l);
        bVar6.f26853d = Integer.valueOf(i);
        bVar6.f26854e = Long.valueOf(j2);
        bVar6.f26855f = Long.valueOf(jM11738a);
        bVar.m11902c(bVar6.m11949a());
        AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = (AutoValue_CrashlyticsReport_Session_Event) bVar.m11900a();
        AutoValue_CrashlyticsReport_Session_Event.b bVar7 = new AutoValue_CrashlyticsReport_Session_Event.b(autoValue_CrashlyticsReport_Session_Event, null);
        String strMo11813b = sessionReportingCoordinator3.f26638d.f26652d.mo11813b();
        if (strMo11813b != null) {
            AutoValue_CrashlyticsReport_Session_Event_Log.b bVar8 = new AutoValue_CrashlyticsReport_Session_Event_Log.b();
            bVar8.f26857a = strMo11813b;
            bVar7.f26787e = bVar8.m11951a();
        } else {
            Logger4.f26421a.m11713b("No log data to include with this event.");
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(sessionReportingCoordinator3.f26639e.f26648b);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.ensureCapacity(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            AutoValue_CrashlyticsReport_CustomAttribute.b bVar9 = new AutoValue_CrashlyticsReport_CustomAttribute.b();
            String str2 = (String) entry.getKey();
            Objects.requireNonNull(str2, "Null key");
            bVar9.f26715a = str2;
            String str3 = (String) entry.getValue();
            Objects.requireNonNull(str3, "Null value");
            bVar9.f26716b = str3;
            arrayList2.add(bVar9.m11849a());
        }
        Collections.sort(arrayList2, new Comparator() { // from class: c.n.d.l.e.k.w0
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                return ((CrashlyticsReport.b) obj).mo11847a().compareTo(((CrashlyticsReport.b) obj2).mo11847a());
            }
        });
        if (!arrayList2.isEmpty()) {
            bVar7.m11901b(autoValue_CrashlyticsReport_Session_Event.f26780c.mo11907e().mo11909b(new ImmutableList3<>(arrayList2)).mo11908a());
        }
        CrashlyticsReportPersistence7 crashlyticsReportPersistence7 = sessionReportingCoordinator3.f26636b;
        CrashlyticsReport.d.AbstractC8523d abstractC8523dM11900a = bVar7.m11900a();
        int i2 = ((SettingsController) crashlyticsReportPersistence7.f26908k).m12032c().mo12037b().f26985a;
        File fileM11982h = crashlyticsReportPersistence7.m11982h(strReplaceAll);
        Objects.requireNonNull(CrashlyticsReportPersistence7.f26900c);
        try {
            CrashlyticsReportPersistence7.m11978l(new File(fileM11982h, outline.m1600v("event", String.format(Locale.US, "%010d", Integer.valueOf(crashlyticsReportPersistence7.f26903f.getAndIncrement())), "_")), ((JsonDataEncoderBuilder4) CrashlyticsReportJsonTransform8.f26877a).m12054a(abstractC8523dM11900a));
            while (true) {
                fileHasNext = it.hasNext();
                if (fileHasNext == 0) {
                    break;
                }
                fileHasNext = it.next();
                if (size <= i2) {
                    break;
                }
                CrashlyticsReportPersistence7.m11977k(fileHasNext);
                size--;
            }
        } catch (IOException e) {
            Logger4.f26421a.m11714c("Could not persist event for session " + strReplaceAll, e);
        }
        List<File> listM11974g = CrashlyticsReportPersistence7.m11974g(fileM11982h, new FilenameFilter() { // from class: c.n.d.l.e.o.c
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str4) {
                Charset charset = CrashlyticsReportPersistence7.f26898a;
                return str4.startsWith("event") && !str4.endsWith("_");
            }
        });
        Collections.sort(listM11974g, new Comparator() { // from class: c.n.d.l.e.o.d
            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Charset charset = CrashlyticsReportPersistence7.f26898a;
                String name = ((File) obj).getName();
                int i3 = CrashlyticsReportPersistence7.f26899b;
                return name.substring(0, i3).compareTo(((File) obj2).getName().substring(0, i3));
            }
        });
        size = listM11974g.size();
        it = listM11974g.iterator();
        C5335t c5335t = this.f26646e;
        Thread thread2 = this.f26644c;
        Throwable th2 = this.f26643b;
        Objects.requireNonNull(c5335t);
        ?? ListFiles = "Failed to close fatal exception file output stream.";
        ?? ListFiles2 = "Failed to flush to session begin file.";
        try {
            try {
                fileHasNext = new ClsFileOutputStream(c5335t.m11795l(), M11793i + "SessionCrash");
                try {
                    codedOutputStreamM11993k = CodedOutputStream.m11993k(fileHasNext);
                    try {
                        c5335t.m11804y(codedOutputStreamM11993k, thread2, th2, time, "crash", true);
                        r5 = fileHasNext;
                    } catch (Exception e2) {
                        e = e2;
                        Logger4 logger4 = Logger4.f26421a;
                        r5 = fileHasNext;
                        if (logger4.m11712a(6)) {
                            Log.e(logger4.f26422b, "An error occurred in the fatal exception logger", e);
                            r5 = fileHasNext;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    codedOutputStreamM11993k = null;
                } catch (Throwable th3) {
                    th = th3;
                    M11793i = 0;
                    CommonUtils.m11744g(M11793i, ListFiles2);
                    CommonUtils.m11740c(fileHasNext, ListFiles);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                CommonUtils.m11744g(M11793i, ListFiles2);
                CommonUtils.m11740c(fileHasNext, ListFiles);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            codedOutputStreamM11993k = null;
            fileHasNext = 0;
        } catch (Throwable th5) {
            th = th5;
            fileHasNext = 0;
        }
        CommonUtils.m11744g(codedOutputStreamM11993k, "Failed to flush to session begin file.");
        CommonUtils.m11740c(r5, "Failed to close fatal exception file output stream.");
        this.f26646e.m11791g(this.f26642a.getTime());
        Settings settingsM12032c = ((SettingsController) this.f26645d).m12032c();
        int i3 = settingsM12032c.mo12037b().f26985a;
        int i4 = settingsM12032c.mo12037b().f26986b;
        this.f26646e.m11790f(i3, false);
        C5335t.m11780a(this.f26646e);
        M11793i = this.f26646e;
        File fileM11796m = M11793i.m11796m();
        File fileM11794k = M11793i.m11794k();
        fileHasNext = C5335t.f26583e;
        FilenameFilter filenameFilter = Utils3.f26467a;
        ArrayList arrayList3 = new ArrayList();
        ListFiles = fileM11796m.listFiles();
        FilenameFilter filenameFilter2 = Utils3.f26467a;
        ListFiles2 = fileM11794k.listFiles(filenameFilter2);
        ?? r3 = ListFiles;
        if (ListFiles == 0) {
            fileArr = new File[0];
        }
        if (ListFiles2 == 0) {
            r3 = fileArr;
            ListFiles2 = new File[0];
        }
        r3 = fileArr;
        arrayList3.addAll(Arrays.asList(r3));
        arrayList3.addAll(Arrays.asList(ListFiles2));
        int iM11729c = i4 - Utils3.m11729c(arrayList3, i4, fileHasNext);
        Utils3.m11728b(M11793i.m11795l(), C5335t.f26581c, iM11729c - Utils3.m11728b(M11793i.m11797n(), filenameFilter2, iM11729c, fileHasNext), fileHasNext);
        if (!this.f26646e.f26593j.m11770a()) {
            return C4340s8.m10208e(null);
        }
        Executor executor = this.f26646e.f26596m.f26516a;
        return ((SettingsController) this.f26645d).m12030a().mo10942o(executor, new C5345y(this, executor));
    }
}
