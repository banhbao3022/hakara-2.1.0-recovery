package p007c.p190n.p385d.p421t;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p421t.p422p.FidListener;
import p007c.p190n.p385d.p421t.p423q.IidStore;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallation;
import p007c.p190n.p385d.p421t.p423q.PersistedInstallationEntry;
import p007c.p190n.p385d.p421t.p424r.AutoValue_InstallationResponse;
import p007c.p190n.p385d.p421t.p424r.AutoValue_TokenResult;
import p007c.p190n.p385d.p421t.p424r.FirebaseInstallationServiceClient;
import p007c.p190n.p385d.p421t.p424r.InstallationResponse;
import p007c.p190n.p385d.p421t.p424r.TokenResult;
import p007c.p190n.p385d.p429x.UserAgentPublisher;

/* JADX INFO: renamed from: c.n.d.t.f, reason: use source file name */
/* JADX INFO: compiled from: FirebaseInstallations.java */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallations4 implements FirebaseInstallationsApi {

    /* JADX INFO: renamed from: a */
    public static final Object f27131a = new Object();

    /* JADX INFO: renamed from: b */
    public static final ThreadFactory f27132b = new a();

    /* JADX INFO: renamed from: c */
    public final FirebaseApp2 f27133c;

    /* JADX INFO: renamed from: d */
    public final FirebaseInstallationServiceClient f27134d;

    /* JADX INFO: renamed from: e */
    public final PersistedInstallation f27135e;

    /* JADX INFO: renamed from: f */
    public final Utils6 f27136f;

    /* JADX INFO: renamed from: g */
    public final IidStore f27137g;

    /* JADX INFO: renamed from: h */
    public final RandomFidGenerator f27138h;

    /* JADX INFO: renamed from: i */
    public final Object f27139i;

    /* JADX INFO: renamed from: j */
    public final ExecutorService f27140j;

    /* JADX INFO: renamed from: k */
    public final ExecutorService f27141k;

    /* JADX INFO: renamed from: l */
    public String f27142l;

    /* JADX INFO: renamed from: m */
    public Set<FidListener> f27143m;

    /* JADX INFO: renamed from: n */
    public final List<StateListener> f27144n;

    /* JADX INFO: renamed from: c.n.d.t.f$a */
    /* JADX INFO: compiled from: FirebaseInstallations.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f27145a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f27145a.getAndIncrement())));
        }
    }

    public FirebaseInstallations4(FirebaseApp2 firebaseApp2, Provider2<UserAgentPublisher> provider2, Provider2<HeartBeatInfo> provider3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f27132b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        firebaseApp2.m11668a();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp2.f26303d, provider2, provider3);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp2);
        Utils6 utils6M12114c = Utils6.m12114c();
        IidStore iidStore = new IidStore(firebaseApp2);
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.f27139i = new Object();
        this.f27143m = new HashSet();
        this.f27144n = new ArrayList();
        this.f27133c = firebaseApp2;
        this.f27134d = firebaseInstallationServiceClient;
        this.f27135e = persistedInstallation;
        this.f27136f = utils6M12114c;
        this.f27137g = iidStore;
        this.f27138h = randomFidGenerator;
        this.f27140j = threadPoolExecutor;
        this.f27141k = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    /* JADX INFO: renamed from: f */
    public static FirebaseInstallations4 m12098f() {
        FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
        C2622l.m5344b(true, "Null is not a valid value of FirebaseApp.");
        firebaseApp2M11665b.m11668a();
        return (FirebaseInstallations4) firebaseApp2M11665b.f26306g.mo11684a(FirebaseInstallationsApi.class);
    }

    @Override // p007c.p190n.p385d.p421t.FirebaseInstallationsApi
    /* JADX INFO: renamed from: a */
    public AbstractC4781i<InstallationTokenResult> mo12099a(final boolean z) {
        m12105h();
        C4782j c4782j = new C4782j();
        GetAuthTokenListener getAuthTokenListener = new GetAuthTokenListener(this.f27136f, c4782j);
        synchronized (this.f27139i) {
            this.f27144n.add(getAuthTokenListener);
        }
        AbstractC4781i abstractC4781i = c4782j.f24683a;
        this.f27140j.execute(new Runnable(this, z) { // from class: c.n.d.t.d

            /* JADX INFO: renamed from: f */
            public final FirebaseInstallations4 f27127f;

            /* JADX INFO: renamed from: g */
            public final boolean f27128g;

            {
                this.f27127f = this;
                this.f27128g = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                FirebaseInstallations4 firebaseInstallations4 = this.f27127f;
                boolean z2 = this.f27128g;
                Object obj = FirebaseInstallations4.f27131a;
                firebaseInstallations4.m12100b(z2);
            }
        });
        return abstractC4781i;
    }

    /* JADX INFO: renamed from: b */
    public final void m12100b(final boolean z) {
        PersistedInstallationEntry persistedInstallationEntryM12137b;
        synchronized (f27131a) {
            FirebaseApp2 firebaseApp2 = this.f27133c;
            firebaseApp2.m11668a();
            CrossProcessLock crossProcessLockM12096a = CrossProcessLock.m12096a(firebaseApp2.f26303d, "generatefid.lock");
            try {
                persistedInstallationEntryM12137b = this.f27135e.m12137b();
                if (persistedInstallationEntryM12137b.m12139i()) {
                    String strM12106i = m12106i(persistedInstallationEntryM12137b);
                    PersistedInstallation persistedInstallation = this.f27135e;
                    persistedInstallationEntryM12137b = persistedInstallationEntryM12137b.mo12126k().mo12130d(strM12106i).mo12133g(PersistedInstallation.a.UNREGISTERED).mo12127a();
                    persistedInstallation.m12136a(persistedInstallationEntryM12137b);
                }
                if (crossProcessLockM12096a != null) {
                    crossProcessLockM12096a.m12097b();
                }
            } catch (Throwable th) {
                if (crossProcessLockM12096a != null) {
                    crossProcessLockM12096a.m12097b();
                }
                throw th;
            }
        }
        if (z) {
            persistedInstallationEntryM12137b = persistedInstallationEntryM12137b.mo12126k().mo12128b(null).mo12127a();
        }
        m12109l(persistedInstallationEntryM12137b);
        this.f27141k.execute(new Runnable(this, z) { // from class: c.n.d.t.e

            /* JADX INFO: renamed from: f */
            public final FirebaseInstallations4 f27129f;

            /* JADX INFO: renamed from: g */
            public final boolean f27130g;

            {
                this.f27129f = this;
                this.f27130g = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                PersistedInstallationEntry persistedInstallationEntryM12137b2;
                PersistedInstallationEntry persistedInstallationEntryM12107j;
                FirebaseInstallations4 firebaseInstallations4 = this.f27129f;
                boolean z2 = this.f27130g;
                Object obj = FirebaseInstallations4.f27131a;
                Objects.requireNonNull(firebaseInstallations4);
                Object obj2 = FirebaseInstallations4.f27131a;
                synchronized (obj2) {
                    FirebaseApp2 firebaseApp3 = firebaseInstallations4.f27133c;
                    firebaseApp3.m11668a();
                    CrossProcessLock crossProcessLockM12096a2 = CrossProcessLock.m12096a(firebaseApp3.f26303d, "generatefid.lock");
                    try {
                        persistedInstallationEntryM12137b2 = firebaseInstallations4.f27135e.m12137b();
                        if (crossProcessLockM12096a2 != null) {
                            crossProcessLockM12096a2.m12097b();
                        }
                    } catch (Throwable th2) {
                        if (crossProcessLockM12096a2 != null) {
                            crossProcessLockM12096a2.m12097b();
                        }
                        throw th2;
                    }
                }
                try {
                    if (persistedInstallationEntryM12137b2.m12138h()) {
                        persistedInstallationEntryM12107j = firebaseInstallations4.m12107j(persistedInstallationEntryM12137b2);
                    } else {
                        if (persistedInstallationEntryM12137b2.mo12124f() == PersistedInstallation.a.UNREGISTERED) {
                            persistedInstallationEntryM12107j = firebaseInstallations4.m12107j(persistedInstallationEntryM12137b2);
                        } else if (!z2 && !firebaseInstallations4.f27136f.m12117d(persistedInstallationEntryM12137b2)) {
                            return;
                        } else {
                            persistedInstallationEntryM12107j = firebaseInstallations4.m12101c(persistedInstallationEntryM12137b2);
                        }
                    }
                    synchronized (obj2) {
                        FirebaseApp2 firebaseApp4 = firebaseInstallations4.f27133c;
                        firebaseApp4.m11668a();
                        CrossProcessLock crossProcessLockM12096a3 = CrossProcessLock.m12096a(firebaseApp4.f26303d, "generatefid.lock");
                        try {
                            firebaseInstallations4.f27135e.m12136a(persistedInstallationEntryM12107j);
                            if (crossProcessLockM12096a3 != null) {
                                crossProcessLockM12096a3.m12097b();
                            }
                        } catch (Throwable th3) {
                            if (crossProcessLockM12096a3 != null) {
                                crossProcessLockM12096a3.m12097b();
                            }
                            throw th3;
                        }
                    }
                    synchronized (firebaseInstallations4) {
                        if (firebaseInstallations4.f27143m.size() != 0 && !persistedInstallationEntryM12137b2.mo12121c().equals(persistedInstallationEntryM12107j.mo12121c())) {
                            Iterator<FidListener> it = firebaseInstallations4.f27143m.iterator();
                            while (it.hasNext()) {
                                it.next().m12118a(persistedInstallationEntryM12107j.mo12121c());
                            }
                        }
                    }
                    if (persistedInstallationEntryM12107j.m12140j()) {
                        String strMo12121c = persistedInstallationEntryM12107j.mo12121c();
                        synchronized (firebaseInstallations4) {
                            firebaseInstallations4.f27142l = strMo12121c;
                        }
                    }
                    if (persistedInstallationEntryM12107j.m12138h()) {
                        firebaseInstallations4.m12108k(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
                    } else if (persistedInstallationEntryM12107j.m12139i()) {
                        firebaseInstallations4.m12108k(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        firebaseInstallations4.m12109l(persistedInstallationEntryM12107j);
                    }
                } catch (FirebaseInstallationsException e) {
                    firebaseInstallations4.m12108k(e);
                }
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final PersistedInstallationEntry m12101c(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionM12156c;
        TokenResult tokenResultM12158f;
        FirebaseInstallationsException.a aVar = FirebaseInstallationsException.a.UNAVAILABLE;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f27134d;
        String strM12102d = m12102d();
        String strMo12121c = persistedInstallationEntry.mo12121c();
        String strM12104g = m12104g();
        String strMo12123e = persistedInstallationEntry.mo12123e();
        if (!firebaseInstallationServiceClient.f27207f.m12161a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        URL urlM12155a = firebaseInstallationServiceClient.m12155a(String.format("projects/%s/installations/%s/authTokens:generate", strM12104g, strMo12121c));
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
            }
            httpURLConnectionM12156c = firebaseInstallationServiceClient.m12156c(urlM12155a, strM12102d);
            try {
                httpURLConnectionM12156c.setRequestMethod("POST");
                httpURLConnectionM12156c.addRequestProperty("Authorization", "FIS_v2 " + strMo12123e);
                httpURLConnectionM12156c.setDoOutput(true);
                firebaseInstallationServiceClient.m12160h(httpURLConnectionM12156c);
                int responseCode = httpURLConnectionM12156c.getResponseCode();
                firebaseInstallationServiceClient.f27207f.m12162b(responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    tokenResultM12158f = firebaseInstallationServiceClient.m12158f(httpURLConnectionM12156c);
                    break;
                }
                FirebaseInstallationServiceClient.m12152b(httpURLConnectionM12156c, null, strM12102d, strM12104g);
                if (responseCode == 401 || responseCode == 404) {
                    AutoValue_TokenResult.b bVar = (AutoValue_TokenResult.b) TokenResult.m12163a();
                    bVar.f27201c = TokenResult.b.AUTH_ERROR;
                    tokenResultM12158f = bVar.mo12150a();
                    break;
                }
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    AutoValue_TokenResult.b bVar2 = (AutoValue_TokenResult.b) TokenResult.m12163a();
                    bVar2.f27201c = TokenResult.b.BAD_CONFIG;
                    tokenResultM12158f = bVar2.mo12150a();
                    break;
                }
                httpURLConnectionM12156c.disconnect();
                i++;
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                httpURLConnectionM12156c.disconnect();
                throw th;
            }
        }
        httpURLConnectionM12156c.disconnect();
        int iOrdinal = tokenResultM12158f.mo12147b().ordinal();
        if (iOrdinal == 0) {
            return persistedInstallationEntry.mo12126k().mo12128b(tokenResultM12158f.mo12148c()).mo12129c(tokenResultM12158f.mo12149d()).mo12134h(this.f27136f.m12116b()).mo12127a();
        }
        if (iOrdinal == 1) {
            return persistedInstallationEntry.mo12126k().mo12131e("BAD CONFIG").mo12133g(PersistedInstallation.a.REGISTER_ERROR).mo12127a();
        }
        if (iOrdinal != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        synchronized (this) {
            this.f27142l = null;
        }
        return persistedInstallationEntry.mo12126k().mo12133g(PersistedInstallation.a.NOT_GENERATED).mo12127a();
    }

    /* JADX INFO: renamed from: d */
    public String m12102d() {
        FirebaseApp2 firebaseApp2 = this.f27133c;
        firebaseApp2.m11668a();
        return firebaseApp2.f26305f.f26319a;
    }

    /* JADX INFO: renamed from: e */
    public String m12103e() {
        FirebaseApp2 firebaseApp2 = this.f27133c;
        firebaseApp2.m11668a();
        return firebaseApp2.f26305f.f26320b;
    }

    /* JADX INFO: renamed from: g */
    public String m12104g() {
        FirebaseApp2 firebaseApp2 = this.f27133c;
        firebaseApp2.m11668a();
        return firebaseApp2.f26305f.f26325g;
    }

    /* JADX INFO: renamed from: h */
    public final void m12105h() {
        C2622l.m5364f(m12103e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2622l.m5364f(m12104g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2622l.m5364f(m12102d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strM12103e = m12103e();
        Pattern pattern = Utils6.f27157b;
        C2622l.m5344b(strM12103e.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2622l.m5344b(Utils6.f27157b.matcher(m12102d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX INFO: renamed from: i */
    public final String m12106i(PersistedInstallationEntry persistedInstallationEntry) {
        String string;
        FirebaseApp2 firebaseApp2 = this.f27133c;
        firebaseApp2.m11668a();
        if (firebaseApp2.f26304e.equals("CHIME_ANDROID_SDK") || this.f27133c.m11672h()) {
            if (persistedInstallationEntry.mo12124f() == PersistedInstallation.a.ATTEMPT_MIGRATION) {
                IidStore iidStore = this.f27137g;
                synchronized (iidStore.f27175b) {
                    synchronized (iidStore.f27175b) {
                        string = iidStore.f27175b.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = iidStore.m12135a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f27138h.m12113a() : string;
            }
        }
        return this.f27138h.m12113a();
    }

    /* JADX INFO: renamed from: j */
    public final PersistedInstallationEntry m12107j(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionM12156c;
        InstallationResponse installationResponseM12157e;
        FirebaseInstallationsException.a aVar = FirebaseInstallationsException.a.UNAVAILABLE;
        String string = null;
        if (persistedInstallationEntry.mo12121c() != null && persistedInstallationEntry.mo12121c().length() == 11) {
            IidStore iidStore = this.f27137g;
            synchronized (iidStore.f27175b) {
                String[] strArr = IidStore.f27174a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str = strArr[i];
                    String string2 = iidStore.f27175b.getString("|T|" + iidStore.f27176c + "|" + str, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                        break;
                    }
                    i++;
                }
            }
        }
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f27134d;
        String strM12102d = m12102d();
        String strMo12121c = persistedInstallationEntry.mo12121c();
        String strM12104g = m12104g();
        String strM12103e = m12103e();
        if (!firebaseInstallationServiceClient.f27207f.m12161a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        URL urlM12155a = firebaseInstallationServiceClient.m12155a(String.format("projects/%s/installations", strM12104g));
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
            }
            httpURLConnectionM12156c = firebaseInstallationServiceClient.m12156c(urlM12155a, strM12102d);
            try {
                try {
                    httpURLConnectionM12156c.setRequestMethod("POST");
                    httpURLConnectionM12156c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM12156c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    firebaseInstallationServiceClient.m12159g(httpURLConnectionM12156c, strMo12121c, strM12103e);
                    int responseCode = httpURLConnectionM12156c.getResponseCode();
                    firebaseInstallationServiceClient.f27207f.m12162b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        installationResponseM12157e = firebaseInstallationServiceClient.m12157e(httpURLConnectionM12156c);
                        break;
                    }
                    FirebaseInstallationServiceClient.m12152b(httpURLConnectionM12156c, strM12103e, strM12102d, strM12104g);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        AutoValue_InstallationResponse.b bVar = new AutoValue_InstallationResponse.b();
                        bVar.f27195e = InstallationResponse.b.BAD_CONFIG;
                        installationResponseM12157e = bVar.m12146a();
                        break;
                    }
                    httpURLConnectionM12156c.disconnect();
                    i2++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th) {
                httpURLConnectionM12156c.disconnect();
                throw th;
            }
        }
        httpURLConnectionM12156c.disconnect();
        AutoValue_InstallationResponse autoValue_InstallationResponse = (AutoValue_InstallationResponse) installationResponseM12157e;
        int iOrdinal = autoValue_InstallationResponse.f27190e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return persistedInstallationEntry.mo12126k().mo12131e("BAD CONFIG").mo12133g(PersistedInstallation.a.REGISTER_ERROR).mo12127a();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        return persistedInstallationEntry.mo12126k().mo12130d(autoValue_InstallationResponse.f27187b).mo12133g(PersistedInstallation.a.REGISTERED).mo12128b(autoValue_InstallationResponse.f27189d.mo12148c()).mo12132f(autoValue_InstallationResponse.f27188c).mo12129c(autoValue_InstallationResponse.f27189d.mo12149d()).mo12134h(this.f27136f.m12116b()).mo12127a();
    }

    /* JADX INFO: renamed from: k */
    public final void m12108k(Exception exc) {
        synchronized (this.f27139i) {
            Iterator<StateListener> it = this.f27144n.iterator();
            while (it.hasNext()) {
                if (it.next().mo12111a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12109l(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f27139i) {
            Iterator<StateListener> it = this.f27144n.iterator();
            while (it.hasNext()) {
                if (it.next().mo12112b(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    @Override // p007c.p190n.p385d.p421t.FirebaseInstallationsApi
    /* JADX INFO: renamed from: w */
    public AbstractC4781i<String> mo12110w() {
        String str;
        m12105h();
        synchronized (this) {
            str = this.f27142l;
        }
        if (str != null) {
            return C4340s8.m10208e(str);
        }
        C4782j c4782j = new C4782j();
        GetIdListener getIdListener = new GetIdListener(c4782j);
        synchronized (this.f27139i) {
            this.f27144n.add(getIdListener);
        }
        AbstractC4781i abstractC4781i = c4782j.f24683a;
        this.f27140j.execute(new Runnable(this) { // from class: c.n.d.t.c

            /* JADX INFO: renamed from: f */
            public final FirebaseInstallations4 f27126f;

            {
                this.f27126f = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                FirebaseInstallations4 firebaseInstallations4 = this.f27126f;
                Object obj = FirebaseInstallations4.f27131a;
                firebaseInstallations4.m12100b(false);
            }
        });
        return abstractC4781i;
    }
}
