package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.xh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3696xh implements InterfaceC3770zh {

    /* JADX INFO: renamed from: a */
    public static final Object f21536a = new Object();

    /* JADX INFO: renamed from: b */
    public static InterfaceC3770zh f21537b;

    /* JADX INFO: renamed from: c */
    public static InterfaceC3770zh f21538c;

    /* JADX INFO: renamed from: e */
    public final Context f21540e;

    /* JADX INFO: renamed from: h */
    public final C3702xn f21543h;

    /* JADX INFO: renamed from: d */
    public final Object f21539d = new Object();

    /* JADX INFO: renamed from: f */
    public final WeakHashMap<Thread, Boolean> f21541f = new WeakHashMap<>();

    /* JADX INFO: renamed from: g */
    public final ExecutorService f21542g = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public C3696xh(Context context, C3702xn c3702xn) {
        this.f21540e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f21543h = c3702xn;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:24:0x0062, B:25:0x0069, B:14:0x0039, B:15:0x0040), top: B:30:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC3770zh m8734c(Context context, C3702xn c3702xn) {
        synchronized (f21536a) {
            try {
                if (f21538c == null) {
                    if (C3646w4.f20989e.m6603d().booleanValue()) {
                        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14483y4)).booleanValue()) {
                            f21538c = new C3733yh();
                        } else {
                            C3696xh c3696xh = new C3696xh(context, c3702xn);
                            Thread thread = Looper.getMainLooper().getThread();
                            if (thread != null) {
                                synchronized (c3696xh.f21539d) {
                                    c3696xh.f21541f.put(thread, Boolean.TRUE);
                                }
                                thread.setUncaughtExceptionHandler(new C3659wh(c3696xh, thread.getUncaughtExceptionHandler()));
                            }
                            Thread.setDefaultUncaughtExceptionHandler(new C3622vh(c3696xh, Thread.getDefaultUncaughtExceptionHandler()));
                            f21538c = c3696xh;
                        }
                    } else {
                        f21538c = new C3733yh();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21538c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3770zh
    /* JADX INFO: renamed from: a */
    public final void mo8735a(Throwable th, String str, float f) {
        Throwable th2;
        String packageName;
        Handler handler = C3331nn.f17166a;
        boolean zM5636d = false;
        if (C3646w4.f20990f.m6603d().booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (C3331nn.m7885c(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        q62.f18207a.mo7444c(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        double d = f;
        double dRandom = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zM5636d = C2794c.m5637a(this.f21540e).m5636d();
            } catch (Throwable th4) {
                C2622l.m5438t3("Error fetching instant app info", th4);
            }
            try {
                packageName = this.f21540e.getPackageName();
            } catch (Throwable unused) {
                C2622l.m5226A3("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zM5636d)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String strM1552C = Build.MODEL;
            if (!strM1552C.startsWith(str2)) {
                strM1552C = outline.m1552C(new StringBuilder(String.valueOf(str2).length() + 1 + strM1552C.length()), str2, " ", strM1552C);
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strM1552C).appendQueryParameter("js", this.f21543h.f21615f).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", string).appendQueryParameter("eids", TextUtils.join(",", C3052g3.m6923b())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "367272508").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(C3646w4.f20987c.m6603d()));
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14245P0)).booleanValue()) {
                builderAppendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(C2610f.f11568b.m5212a(this.f21540e))).appendQueryParameter("lite", true != this.f21543h.f21619j ? "0" : "1");
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str3 : arrayList2) {
                final C3665wn c3665wn = new C3665wn(null);
                this.f21542g.execute(new Runnable(c3665wn, str3) { // from class: c.n.b.d.j.a.uh

                    /* JADX INFO: renamed from: f */
                    public final C3665wn f20312f;

                    /* JADX INFO: renamed from: g */
                    public final String f20313g;

                    {
                        this.f20312f = c3665wn;
                        this.f20313g = str3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20312f.mo4730f(this.f20313g);
                    }
                });
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3770zh
    /* JADX INFO: renamed from: b */
    public final void mo8736b(Throwable th, String str) {
        mo8735a(th, str, 1.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m8737d(Thread thread, Throwable th) {
        if (th != null) {
            boolean zM7885c = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM7885c |= C3331nn.m7885c(stackTraceElement.getClassName());
                    zEquals |= C3696xh.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zM7885c || zEquals) {
                return;
            }
            mo8735a(th, "", 1.0f);
        }
    }
}
