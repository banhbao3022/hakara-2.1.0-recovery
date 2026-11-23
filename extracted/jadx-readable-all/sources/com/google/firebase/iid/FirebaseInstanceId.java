package com.google.firebase.iid;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.p308j.ThreadFactoryC2790a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p418r.C5482h;
import p007c.p190n.p385d.p418r.C5488n;
import p007c.p190n.p385d.p418r.C5491q;
import p007c.p190n.p385d.p418r.C5495u;
import p007c.p190n.p385d.p418r.C5497w;
import p007c.p190n.p385d.p418r.ExecutorC5484j;
import p007c.p190n.p385d.p418r.InterfaceC5489o;
import p007c.p190n.p385d.p418r.RunnableC5498x;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p421t.FirebaseInstallationsApi;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FirebaseInstanceId {

    /* JADX INFO: renamed from: b */
    public static C5497w f29274b;

    /* JADX INFO: renamed from: d */
    public static ScheduledExecutorService f29276d;

    /* JADX INFO: renamed from: e */
    public final Executor f29277e;

    /* JADX INFO: renamed from: f */
    public final FirebaseApp2 f29278f;

    /* JADX INFO: renamed from: g */
    public final C5491q f29279g;

    /* JADX INFO: renamed from: h */
    public final C5488n f29280h;

    /* JADX INFO: renamed from: i */
    public final C5495u f29281i;

    /* JADX INFO: renamed from: j */
    public final FirebaseInstallationsApi f29282j;

    /* JADX INFO: renamed from: k */
    public boolean f29283k;

    /* JADX INFO: renamed from: a */
    public static final long f29273a = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: c */
    public static final Pattern f29275c = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(FirebaseApp2 firebaseApp2, Provider2<UserAgentPublisher> provider2, Provider2<HeartBeatInfo> provider3, FirebaseInstallationsApi firebaseInstallationsApi) {
        firebaseApp2.m11668a();
        C5491q c5491q = new C5491q(firebaseApp2.f26303d);
        ExecutorService executorServiceM12068a = C5482h.m12068a();
        ExecutorService executorServiceM12068a2 = C5482h.m12068a();
        this.f29283k = false;
        if (C5491q.m12073b(firebaseApp2) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (f29274b == null) {
                firebaseApp2.m11668a();
                f29274b = new C5497w(firebaseApp2.f26303d);
            }
        }
        this.f29278f = firebaseApp2;
        this.f29279g = c5491q;
        this.f29280h = new C5488n(firebaseApp2, c5491q, provider2, provider3, firebaseInstallationsApi);
        this.f29277e = executorServiceM12068a2;
        this.f29281i = new C5495u(executorServiceM12068a);
        this.f29282j = firebaseInstallationsApi;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m12914a(AbstractC4781i<T> abstractC4781i) throws InterruptedException {
        C2622l.m5379i(abstractC4781i, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC4781i.mo10930c(ExecutorC5484j.f27070f, new InterfaceC4771d(countDownLatch) { // from class: c.n.d.r.k

            /* JADX INFO: renamed from: a */
            public final CountDownLatch f27071a;

            {
                this.f27071a = countDownLatch;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
            /* JADX INFO: renamed from: b */
            public void mo5171b(AbstractC4781i abstractC4781i2) {
                CountDownLatch countDownLatch2 = this.f27071a;
                C5497w c5497w = FirebaseInstanceId.f29274b;
                countDownLatch2.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (abstractC4781i.mo10941n()) {
            return abstractC4781i.mo10937j();
        }
        if (abstractC4781i.mo10939l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC4781i.mo10940m()) {
            throw new IllegalStateException(abstractC4781i.mo10936i());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    /* JADX INFO: renamed from: c */
    public static void m12915c(FirebaseApp2 firebaseApp2) {
        firebaseApp2.m11668a();
        C2622l.m5364f(firebaseApp2.f26305f.f26325g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        firebaseApp2.m11668a();
        C2622l.m5364f(firebaseApp2.f26305f.f26320b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        firebaseApp2.m11668a();
        C2622l.m5364f(firebaseApp2.f26305f.f26319a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        firebaseApp2.m11668a();
        C2622l.m5344b(firebaseApp2.f26305f.f26320b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp2.m11668a();
        C2622l.m5344b(f29275c.matcher(firebaseApp2.f26305f.f26319a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp2 firebaseApp2) {
        m12915c(firebaseApp2);
        firebaseApp2.m11668a();
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) firebaseApp2.f26306g.mo11684a(FirebaseInstanceId.class);
        C2622l.m5379i(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12916l() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* JADX INFO: renamed from: b */
    public String m12917b() throws IOException {
        String strM12073b = C5491q.m12073b(this.f29278f);
        m12915c(this.f29278f);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        try {
            return ((InterfaceC5489o) C4340s8.m10205b(m12921g(strM12073b, "*"), 30000L, TimeUnit.MILLISECONDS)).mo12071a();
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    f29274b.m12083c();
                }
            }
            throw ((IOException) cause);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12918d(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f29276d == null) {
                f29276d = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC2790a("FirebaseInstanceId"));
            }
            f29276d.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public String m12919e() {
        try {
            C5497w c5497w = f29274b;
            String strM11669c = this.f29278f.m11669c();
            synchronized (c5497w) {
                c5497w.f27103c.put(strM11669c, Long.valueOf(c5497w.m12084d(strM11669c)));
            }
            return (String) m12914a(this.f29282j.mo12110w());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public AbstractC4781i<InterfaceC5489o> m12920f() {
        m12915c(this.f29278f);
        return m12921g(C5491q.m12073b(this.f29278f), "*");
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC4781i<InterfaceC5489o> m12921g(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return C4340s8.m10208e(null).mo10935h(this.f29277e, new InterfaceC4767b(this, str, str2) { // from class: c.n.d.r.i

            /* JADX INFO: renamed from: a */
            public final FirebaseInstanceId f27067a;

            /* JADX INFO: renamed from: b */
            public final String f27068b;

            /* JADX INFO: renamed from: c */
            public final String f27069c;

            {
                this.f27067a = this;
                this.f27068b = str;
                this.f27069c = str2;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
            /* JADX INFO: renamed from: a */
            public Object mo5191a(AbstractC4781i abstractC4781i) {
                final FirebaseInstanceId firebaseInstanceId = this.f27067a;
                final String str3 = this.f27068b;
                final String str4 = this.f27069c;
                final String strM12919e = firebaseInstanceId.m12919e();
                C5497w.a aVarM12925k = firebaseInstanceId.m12925k(str3, str4);
                if (!firebaseInstanceId.m12929p(aVarM12925k)) {
                    return C4340s8.m10208e(new C5490p(strM12919e, aVarM12925k.f27106c));
                }
                final C5495u c5495u = firebaseInstanceId.f29281i;
                synchronized (c5495u) {
                    final Pair<String, String> pair = new Pair<>(str3, str4);
                    AbstractC4781i<InterfaceC5489o> abstractC4781i2 = c5495u.f27095b.get(pair);
                    if (abstractC4781i2 != null) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String strValueOf = String.valueOf(pair);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                            sb.append("Joining ongoing request for: ");
                            sb.append(strValueOf);
                            Log.d("FirebaseInstanceId", sb.toString());
                        }
                        return abstractC4781i2;
                    }
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf2 = String.valueOf(pair);
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
                        sb2.append("Making new request for: ");
                        sb2.append(strValueOf2);
                        Log.d("FirebaseInstanceId", sb2.toString());
                    }
                    C5488n c5488n = firebaseInstanceId.f29280h;
                    Objects.requireNonNull(c5488n);
                    AbstractC4781i<InterfaceC5489o> abstractC4781iMo10935h = c5488n.m12069a(c5488n.m12070b(strM12919e, str3, str4, new Bundle())).mo10942o(firebaseInstanceId.f29277e, new InterfaceC4779h(firebaseInstanceId, str3, str4, strM12919e) { // from class: c.n.d.r.l

                        /* JADX INFO: renamed from: a */
                        public final FirebaseInstanceId f27072a;

                        /* JADX INFO: renamed from: b */
                        public final String f27073b;

                        /* JADX INFO: renamed from: c */
                        public final String f27074c;

                        /* JADX INFO: renamed from: d */
                        public final String f27075d;

                        {
                            this.f27072a = firebaseInstanceId;
                            this.f27073b = str3;
                            this.f27074c = str4;
                            this.f27075d = strM12919e;
                        }

                        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
                        /* JADX INFO: renamed from: a */
                        public AbstractC4781i mo5192a(Object obj) {
                            FirebaseInstanceId firebaseInstanceId2 = this.f27072a;
                            String str5 = this.f27073b;
                            String str6 = this.f27074c;
                            String str7 = this.f27075d;
                            String str8 = (String) obj;
                            C5497w c5497w = FirebaseInstanceId.f29274b;
                            String strM12922h = firebaseInstanceId2.m12922h();
                            String strM12074a = firebaseInstanceId2.f29279g.m12074a();
                            synchronized (c5497w) {
                                String strM12085a = C5497w.a.m12085a(str8, strM12074a, System.currentTimeMillis());
                                if (strM12085a != null) {
                                    SharedPreferences.Editor editorEdit = c5497w.f27101a.edit();
                                    editorEdit.putString(c5497w.m12082b(strM12922h, str5, str6), strM12085a);
                                    editorEdit.commit();
                                }
                            }
                            return C4340s8.m10208e(new C5490p(str7, str8));
                        }
                    }).mo10935h(c5495u.f27094a, new InterfaceC4767b(c5495u, pair) { // from class: c.n.d.r.t

                        /* JADX INFO: renamed from: a */
                        public final C5495u f27092a;

                        /* JADX INFO: renamed from: b */
                        public final Pair f27093b;

                        {
                            this.f27092a = c5495u;
                            this.f27093b = pair;
                        }

                        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
                        /* JADX INFO: renamed from: a */
                        public Object mo5191a(AbstractC4781i abstractC4781i3) {
                            C5495u c5495u2 = this.f27092a;
                            Pair pair2 = this.f27093b;
                            synchronized (c5495u2) {
                                c5495u2.f27095b.remove(pair2);
                            }
                            return abstractC4781i3;
                        }
                    });
                    c5495u.f27095b.put(pair, abstractC4781iMo10935h);
                    return abstractC4781iMo10935h;
                }
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final String m12922h() {
        FirebaseApp2 firebaseApp2 = this.f29278f;
        firebaseApp2.m11668a();
        return "[DEFAULT]".equals(firebaseApp2.f26304e) ? "" : this.f29278f.m11669c();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public String m12923i() {
        m12915c(this.f29278f);
        C5497w.a aVarM12924j = m12924j();
        if (m12929p(aVarM12924j)) {
            m12927n();
        }
        int i = C5497w.a.f27105b;
        if (aVarM12924j == null) {
            return null;
        }
        return aVarM12924j.f27106c;
    }

    /* JADX INFO: renamed from: j */
    public C5497w.a m12924j() {
        return m12925k(C5491q.m12073b(this.f29278f), "*");
    }

    /* JADX INFO: renamed from: k */
    public C5497w.a m12925k(String str, String str2) {
        C5497w.a aVarM12086b;
        C5497w c5497w = f29274b;
        String strM12922h = m12922h();
        synchronized (c5497w) {
            aVarM12086b = C5497w.a.m12086b(c5497w.f27101a.getString(c5497w.m12082b(strM12922h, str, str2), null));
        }
        return aVarM12086b;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m12926m(boolean z) {
        this.f29283k = z;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m12927n() {
        if (this.f29283k) {
            return;
        }
        m12928o(0L);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m12928o(long j2) {
        m12918d(new RunnableC5498x(this, Math.min(Math.max(30L, j2 + j2), f29273a)), j2);
        this.f29283k = true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m12929p(C5497w.a aVar) {
        if (aVar != null) {
            if (!(System.currentTimeMillis() > aVar.f27108e + C5497w.a.f27104a || !this.f29279g.m12074a().equals(aVar.f27107d))) {
                return false;
            }
        }
        return true;
    }
}
